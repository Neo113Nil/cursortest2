package com.moloco.sdk.publisher;

import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@il4(c = "com.moloco.sdk.publisher.Moloco", f = "Moloco.kt", l = {554, 558}, m = "clearState$moloco_sdk_release")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Moloco$clearState$1 extends sq3 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Moloco this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Moloco$clearState$1(Moloco moloco, rq3<? super Moloco$clearState$1> rq3Var) {
        super(rq3Var);
        this.this$0 = moloco;
    }

    @Override // defpackage.h21
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.clearState$moloco_sdk_release(this);
    }
}
