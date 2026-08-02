package org.apache.cordova;

import android.net.Uri;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class Whitelist {
    public static final String TAG = "Whitelist";
    private ArrayList<URLPattern> whiteList = new ArrayList<>();

    private static class URLPattern {
        public Pattern host;
        public Pattern path;
        public Integer port;
        public Pattern scheme;

        private String regexFromPattern(String str, boolean z) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '*' && z) {
                    sb.append(".");
                } else if ("\\.[]{}()^$?+|".indexOf(charAt) > -1) {
                    sb.append('\\');
                }
                sb.append(charAt);
            }
            return sb.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0071 A[Catch: NumberFormatException -> 0x0089, TryCatch #0 {NumberFormatException -> 0x0089, blocks: (B:27:0x000c, B:30:0x0013, B:4:0x0020, B:6:0x0026, B:8:0x0059, B:11:0x0060, B:13:0x0071, B:16:0x007a, B:19:0x0086, B:21:0x006d, B:22:0x0029, B:24:0x0031, B:25:0x004d, B:3:0x001e), top: B:26:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0029 A[Catch: NumberFormatException -> 0x0089, TryCatch #0 {NumberFormatException -> 0x0089, blocks: (B:27:0x000c, B:30:0x0013, B:4:0x0020, B:6:0x0026, B:8:0x0059, B:11:0x0060, B:13:0x0071, B:16:0x007a, B:19:0x0086, B:21:0x006d, B:22:0x0029, B:24:0x0031, B:25:0x004d, B:3:0x001e), top: B:26:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0026 A[Catch: NumberFormatException -> 0x0089, TryCatch #0 {NumberFormatException -> 0x0089, blocks: (B:27:0x000c, B:30:0x0013, B:4:0x0020, B:6:0x0026, B:8:0x0059, B:11:0x0060, B:13:0x0071, B:16:0x007a, B:19:0x0086, B:21:0x006d, B:22:0x0029, B:24:0x0031, B:25:0x004d, B:3:0x001e), top: B:26:0x000c }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public URLPattern(String str, String str2, String str3, String str4) throws MalformedURLException {
            if (str != null) {
                try {
                    if (!"*".equals(str)) {
                        this.scheme = Pattern.compile(regexFromPattern(str, false), 2);
                        if (!"*".equals(str2)) {
                            this.host = null;
                        } else if (str2.startsWith("*.")) {
                            this.host = Pattern.compile("([a-z0-9.-]*\\.)?" + regexFromPattern(str2.substring(2), false), 2);
                        } else {
                            this.host = Pattern.compile(regexFromPattern(str2, false), 2);
                        }
                        if (str3 != null && !"*".equals(str3)) {
                            this.port = Integer.valueOf(Integer.parseInt(str3, 10));
                            if (str4 != null && !"/*".equals(str4)) {
                                this.path = Pattern.compile(regexFromPattern(str4, true));
                                return;
                            }
                            this.path = null;
                        }
                        this.port = null;
                        if (str4 != null) {
                            this.path = Pattern.compile(regexFromPattern(str4, true));
                            return;
                        }
                        this.path = null;
                    }
                } catch (NumberFormatException unused) {
                    throw new MalformedURLException("Port must be a number");
                }
            }
            this.scheme = null;
            if (!"*".equals(str2)) {
            }
            if (str3 != null) {
                this.port = Integer.valueOf(Integer.parseInt(str3, 10));
                if (str4 != null) {
                }
                this.path = null;
            }
            this.port = null;
            if (str4 != null) {
            }
            this.path = null;
        }

        public boolean matches(Uri uri) {
            Pattern pattern;
            Integer num;
            try {
                Pattern pattern2 = this.scheme;
                if ((pattern2 == null || pattern2.matcher(uri.getScheme()).matches()) && (((pattern = this.host) == null || pattern.matcher(uri.getHost()).matches()) && ((num = this.port) == null || num.equals(Integer.valueOf(uri.getPort()))))) {
                    Pattern pattern3 = this.path;
                    if (pattern3 == null) {
                        return true;
                    }
                    if (pattern3.matcher(uri.getPath()).matches()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                LOG.d(Whitelist.TAG, e.toString());
                return false;
            }
        }
    }

    public void addWhiteListEntry(String str, boolean z) {
        String str2 = "*";
        if (this.whiteList != null) {
            try {
                if (str.compareTo("*") == 0) {
                    LOG.d(TAG, "Unlimited access to network resources");
                    this.whiteList = null;
                    return;
                }
                Matcher matcher = Pattern.compile("^((\\*|[A-Za-z-]+):(//)?)?(\\*|((\\*\\.)?[^*/:]+))?(:(\\d+))?(/.*)?").matcher(str);
                if (matcher.matches()) {
                    String group = matcher.group(2);
                    String group2 = matcher.group(4);
                    if ((!"file".equals(group) && !"content".equals(group)) || group2 != null) {
                        str2 = group2;
                    }
                    String group3 = matcher.group(8);
                    String group4 = matcher.group(9);
                    if (group == null) {
                        this.whiteList.add(new URLPattern("http", str2, group3, group4));
                        this.whiteList.add(new URLPattern("https", str2, group3, group4));
                    } else {
                        this.whiteList.add(new URLPattern(group, str2, group3, group4));
                    }
                }
            } catch (Exception unused) {
                LOG.d(TAG, "Failed to add origin %s", str);
            }
        }
    }

    public boolean isUrlWhiteListed(String str) {
        if (this.whiteList == null) {
            return true;
        }
        Uri parse = Uri.parse(str);
        Iterator<URLPattern> it = this.whiteList.iterator();
        while (it.hasNext()) {
            if (it.next().matches(parse)) {
                return true;
            }
        }
        return false;
    }
}
