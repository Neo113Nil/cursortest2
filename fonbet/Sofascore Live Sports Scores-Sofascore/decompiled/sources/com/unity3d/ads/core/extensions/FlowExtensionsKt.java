package com.unity3d.ads.core.extensions;

import defpackage.rq3;
import defpackage.yso;
import defpackage.z88;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a_\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042(\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "Lz88;", "", "timeoutMillis", "", "active", "Lkotlin/Function2;", "Lkotlin/Function0;", "", "Lrq3;", "", "block", "timeoutAfter", "(Lz88;JZLkotlin/jvm/functions/Function2;)Lz88;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlowExtensionsKt {
    @NotNull
    public static final <T> z88 timeoutAfter(@NotNull z88 z88Var, long j, boolean z, @NotNull Function2<? super Function0<Unit>, ? super rq3<? super Unit>, ? extends Object> function2) {
        z88Var.getClass();
        function2.getClass();
        return yso.r(new FlowExtensionsKt$timeoutAfter$1(j, z, function2, z88Var, null));
    }

    public static /* synthetic */ z88 timeoutAfter$default(z88 z88Var, long j, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return timeoutAfter(z88Var, j, z, function2);
    }
}
