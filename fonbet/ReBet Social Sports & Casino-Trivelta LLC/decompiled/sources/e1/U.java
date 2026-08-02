package e1;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class U {
    public static String a(Uri uri, Uri uri2) {
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        if (scheme != null ? !(scheme2 == null || !Ra.c.a(scheme, scheme2)) : scheme2 == null) {
            if (Objects.equals(uri.getAuthority(), uri2.getAuthority())) {
                List<String> pathSegments = uri.getPathSegments();
                List<String> pathSegments2 = uri2.getPathSegments();
                int min = Math.min(pathSegments.size(), pathSegments2.size());
                int i10 = 0;
                for (int i11 = 0; i11 < min && pathSegments.get(i11).equals(pathSegments2.get(i11)); i11++) {
                    i10++;
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = i10; i12 < pathSegments.size(); i12++) {
                    sb2.append("../");
                }
                while (i10 < pathSegments2.size()) {
                    sb2.append(pathSegments2.get(i10));
                    if (i10 < pathSegments2.size() - 1) {
                        sb2.append("/");
                    }
                    i10++;
                }
                return sb2.toString();
            }
        }
        return uri2.toString();
    }

    public static int[] b(String str) {
        int i10;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i11 = indexOf4 + 2;
        if (i11 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i11) == '/') {
            i10 = str.indexOf(47, indexOf4 + 3);
            if (i10 == -1 || i10 > indexOf2) {
                i10 = indexOf2;
            }
        } else {
            i10 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i10;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static boolean c(String str) {
        return (str == null || b(str)[0] == -1) ? false : true;
    }

    public static String d(StringBuilder sb2, int i10, int i11) {
        int i12;
        int i13;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i14 = i10;
        int i15 = i14;
        while (i14 <= i11) {
            if (i14 == i11) {
                i12 = i14;
            } else if (sb2.charAt(i14) == '/') {
                i12 = i14 + 1;
            } else {
                i14++;
            }
            int i16 = i15 + 1;
            if (i14 == i16 && sb2.charAt(i15) == '.') {
                sb2.delete(i15, i12);
                i11 -= i12 - i15;
            } else {
                if (i14 == i15 + 2 && sb2.charAt(i15) == '.' && sb2.charAt(i16) == '.') {
                    i13 = sb2.lastIndexOf("/", i15 - 2) + 1;
                    int i17 = i13 > i10 ? i13 : i10;
                    sb2.delete(i17, i12);
                    i11 -= i12 - i17;
                } else {
                    i13 = i14 + 1;
                }
                i15 = i13;
            }
            i14 = i15;
        }
        return sb2.toString();
    }

    public static Uri e(Uri uri, String str) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    buildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return buildUpon.build();
    }

    public static String f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] b10 = b(str2);
        if (b10[0] != -1) {
            sb2.append(str2);
            d(sb2, b10[1], b10[2]);
            return sb2.toString();
        }
        int[] b11 = b(str);
        if (b10[3] == 0) {
            sb2.append((CharSequence) str, 0, b11[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (b10[2] == 0) {
            sb2.append((CharSequence) str, 0, b11[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i10 = b10[1];
        if (i10 != 0) {
            int i11 = b11[0] + 1;
            sb2.append((CharSequence) str, 0, i11);
            sb2.append(str2);
            return d(sb2, b10[1] + i11, i11 + b10[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb2.append((CharSequence) str, 0, b11[1]);
            sb2.append(str2);
            int i12 = b11[1];
            return d(sb2, i12, b10[2] + i12);
        }
        int i13 = b11[0] + 2;
        int i14 = b11[1];
        if (i13 >= i14 || i14 != b11[2]) {
            int lastIndexOf = str.lastIndexOf(47, b11[2] - 1);
            int i15 = lastIndexOf == -1 ? b11[1] : lastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i15);
            sb2.append(str2);
            return d(sb2, b11[1], i15 + b10[2]);
        }
        sb2.append((CharSequence) str, 0, i14);
        sb2.append('/');
        sb2.append(str2);
        int i16 = b11[1];
        return d(sb2, i16, b10[2] + i16 + 1);
    }

    public static Uri g(String str, String str2) {
        return Uri.parse(f(str, str2));
    }
}
