package com.unity3d.services.core.extensions;

import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.w2g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@il4(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", f = "CoroutineExtensions.kt", l = {49}, m = "runReturnSuspendCatching")
/* loaded from: classes6.dex */
public final class CoroutineExtensionsKt$runReturnSuspendCatching$1<R> extends sq3 {
    int label;
    /* synthetic */ Object result;

    public CoroutineExtensionsKt$runReturnSuspendCatching$1(rq3<? super CoroutineExtensionsKt$runReturnSuspendCatching$1> rq3Var) {
        super(rq3Var);
    }

    @Override // defpackage.h21
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object runReturnSuspendCatching = CoroutineExtensionsKt.runReturnSuspendCatching(null, this);
        return runReturnSuspendCatching == lu3.a ? runReturnSuspendCatching : new w2g(runReturnSuspendCatching);
    }
}
