package com.huawei.hms.framework.common.grs;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.common.StringUtils;
import java.util.Locale;
import xsna.fw3;
import xsna.ho8;

/* loaded from: classes13.dex */
public class GrsUtils {
    private static final int GRS_KEY_INDEX = 1;
    private static final int GRS_PATH_INDEX = 2;
    private static final String GRS_SCHEMA = "grs://";
    private static final int GRS_SERVICE_INDEX = 0;
    private static final int MAX_GRS_SPLIT = 3;
    private static final String SEPARATOR = "/";

    public static String fixResult(String[] strArr, String str) {
        if (strArr.length <= 2) {
            return str;
        }
        if (str.endsWith("/")) {
            StringBuilder e = fw3.e(str);
            e.append(strArr[2]);
            return e.toString();
        }
        StringBuilder b = ho8.b(str, "/");
        b.append(strArr[2]);
        return b.toString();
    }

    public static boolean isGRSSchema(String str) {
        return str != null && str.startsWith(GRS_SCHEMA);
    }

    public static String[] parseGRSSchema(String str) {
        String[] split = StringUtils.substring(str, str.toLowerCase(Locale.ENGLISH).indexOf(GRS_SCHEMA) + 6).split("/", 3);
        return split.length == 1 ? new String[]{split[0], NativeAdContent.ViewTag.ROOT} : split;
    }

    public static String[] parseParams(String str) {
        if (str.endsWith("/")) {
            str = StringUtils.substring(str, str.indexOf(GRS_SCHEMA), str.length() - 1);
        }
        return parseGRSSchema(str);
    }
}
