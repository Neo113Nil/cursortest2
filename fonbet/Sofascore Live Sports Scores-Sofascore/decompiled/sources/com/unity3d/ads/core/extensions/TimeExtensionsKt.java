package com.unity3d.ads.core.extensions;

import defpackage.be5;
import defpackage.xd5;
import kotlin.Metadata;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"elapsedMillis", "", "Lkotlin/time/TimeMark;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimeExtensionsKt {
    public static final double elapsedMillis(@NotNull TimeMark timeMark) {
        timeMark.getClass();
        long a = timeMark.a();
        be5 be5Var = be5.NANOSECONDS;
        return xd5.j(a);
    }
}
