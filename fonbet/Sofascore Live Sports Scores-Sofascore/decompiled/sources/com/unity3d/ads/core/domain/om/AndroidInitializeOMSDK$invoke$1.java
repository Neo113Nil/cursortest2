package com.unity3d.ads.core.domain.om;

import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@il4(c = "com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK", f = "AndroidInitializeOMSDK.kt", l = {27}, m = "invoke")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidInitializeOMSDK$invoke$1 extends sq3 {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidInitializeOMSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInitializeOMSDK$invoke$1(AndroidInitializeOMSDK androidInitializeOMSDK, rq3<? super AndroidInitializeOMSDK$invoke$1> rq3Var) {
        super(rq3Var);
        this.this$0 = androidInitializeOMSDK;
    }

    @Override // defpackage.h21
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
