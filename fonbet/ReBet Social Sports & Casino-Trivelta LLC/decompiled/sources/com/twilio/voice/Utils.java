package com.twilio.voice;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.NonNull;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
class Utils {
    public static void DumpBacktrace() {
        try {
            throw new RuntimeException();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static Map<String, String> bundleToMap(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, String.valueOf(bundle.get(str)));
        }
        return hashMap;
    }

    public static Handler createHandler() {
        Handler handler;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            handler = new Handler(myLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            handler = mainLooper != null ? new Handler(mainLooper) : null;
        }
        if (handler != null) {
            return handler;
        }
        throw new IllegalThreadStateException("This thread must be able to obtain a Looper");
    }

    public static String getIPAddress(boolean z10) {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        boolean z11 = hostAddress.indexOf(58) < 0;
                        if (z10) {
                            if (z11) {
                                return hostAddress;
                            }
                        } else if (!z11) {
                            int indexOf = hostAddress.indexOf(37);
                            return indexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, indexOf).toUpperCase();
                        }
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean isAudioPermissionGranted(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0;
    }

    public static Pair<String[], String[]> mapToArrays(Map<String, String> map) {
        Pair<String[], String[]> pair = new Pair<>(new String[map.size()], new String[map.size()]);
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            ((String[]) pair.first)[i10] = entry.getKey();
            ((String[]) pair.second)[i10] = entry.getValue();
            i10++;
        }
        return pair;
    }

    public static String parseClientIdentity(String str) {
        if (str != null) {
            return str.replaceFirst("^client:", "");
        }
        return null;
    }

    public static void parseCustomParams(@NonNull String str, @NonNull Map<String, String> map) {
        String substring;
        int i10;
        for (String str2 : str.split("&")) {
            int indexOf = str2.indexOf("=");
            if (indexOf > 0) {
                try {
                    substring = str2.substring(0, indexOf);
                } catch (UnsupportedEncodingException e10) {
                    e10.printStackTrace();
                }
            } else {
                substring = str2;
            }
            map.put(substring, (indexOf <= 0 || str2.length() <= (i10 = indexOf + 1)) ? null : URLDecoder.decode(str2.substring(i10).replaceAll("\\+", "%20"), "UTF-8"));
        }
    }

    public static boolean permissionGranted(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
