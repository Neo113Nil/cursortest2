package com.inmobi.media;

import com.ironsource.U3;
import defpackage.llf;
import defpackage.w5m;
import defpackage.wv8;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.gf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3446gf {
    public static final IntRange a = llf.j(408, 600);
    public static final IntRange b = llf.j(300, 500);

    public static final String a(String str, Map map) {
        str.getClass();
        if (map == null) {
            return str;
        }
        String f0 = CollectionsKt.f0(map.entrySet(), U3.j.c, null, null, new w5m(3), 30);
        return str.concat(StringsKt.J(str, "?", false) ? U3.j.c.concat(f0) : "?".concat(f0));
    }

    public static final CharSequence a(Map.Entry entry) {
        entry.getClass();
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        Charset charset = Charsets.UTF_8;
        return wv8.i(URLEncoder.encode(str, charset.name()), U3.j.b, URLEncoder.encode(str2, charset.name()));
    }
}
