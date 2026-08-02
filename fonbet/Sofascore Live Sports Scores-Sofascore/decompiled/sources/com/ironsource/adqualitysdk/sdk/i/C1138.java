package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｃ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1138 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final Map f3549;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ExecutorService f3550;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List f3551;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C1174 f3552;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1034 f3553;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f3554;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(StringFog.decrypt("cWyS/UbHiRl2Z4HvW8WQNnF9\n", "Hwnmiim14l8=\n"), 1);
        hashMap.put(StringFog.decrypt("oGJXlidcxOGgYlWsNlLE4qB+\n", "xQwh/1Uzqow=\n"), 2);
        hashMap.put(StringFog.decrypt("PgPwOqx33yoXF/Y2vnjZJjUL9ic=\n", "VmKCXtsWrU8=\n"), 1);
        hashMap.put(StringFog.decrypt("ooo/JRi5McWhgwQhAKMxxQ==\n", "wO9XRG7QXrc=\n"), 2);
        f3549 = Collections.unmodifiableMap(hashMap);
    }

    public C1138(Context context, List list) {
        C1034 c1034 = new C1034();
        C1174 c1174 = new C1174();
        this.f3554 = context;
        this.f3553 = c1034;
        this.f3552 = c1174;
        this.f3551 = Collections.unmodifiableList(new ArrayList(list));
        this.f3550 = Executors.newSingleThreadExecutor();
    }
}
