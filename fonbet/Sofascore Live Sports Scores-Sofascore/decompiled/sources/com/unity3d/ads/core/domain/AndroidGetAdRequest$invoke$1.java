package com.unity3d.ads.core.domain;

import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@il4(c = "com.unity3d.ads.core.domain.AndroidGetAdRequest", f = "AndroidGetAdRequest.kt", l = {35, 40, 63}, m = "invoke")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetAdRequest$invoke$1 extends sq3 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetAdRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetAdRequest$invoke$1(AndroidGetAdRequest androidGetAdRequest, rq3<? super AndroidGetAdRequest$invoke$1> rq3Var) {
        super(rq3Var);
        this.this$0 = androidGetAdRequest;
    }

    @Override // defpackage.h21
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, null, this);
    }
}
