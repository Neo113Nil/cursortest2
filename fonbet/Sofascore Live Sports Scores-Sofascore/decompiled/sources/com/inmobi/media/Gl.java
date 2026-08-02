package com.inmobi.media;

import android.os.Build;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Gl {
    public static final H5 a(List list) {
        list.getClass();
        return list.size() != 2 ? new H5(0, 0) : new H5(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static final String a(String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return URLEncoder.encode(str, Charset.defaultCharset());
        }
        return URLEncoder.encode(str);
    }
}
