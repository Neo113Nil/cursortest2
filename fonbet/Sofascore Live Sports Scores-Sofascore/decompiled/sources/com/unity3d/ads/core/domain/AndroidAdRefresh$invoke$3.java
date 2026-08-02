package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.av4;
import defpackage.h2h;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidAdRefresh$invoke$3 extends hoi implements Function2<String, rq3<? super Unit>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ ku3 $refreshScope;
    int label;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1", f = "AndroidAdRefresh.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        final /* synthetic */ AdObject $adObject;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidAdRefresh this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, AndroidAdRefresh androidAdRefresh, rq3<? super AnonymousClass1> rq3Var) {
            super(2, rq3Var);
            this.$adObject = adObject;
            this.this$0 = androidAdRefresh;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, rq3Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
                ku3 ku3Var = (ku3) this.L$0;
                av4 t = xw3.t(ku3Var, null, new AndroidAdRefresh$invoke$3$1$showing$1(this.$adObject, null), 3);
                av4 t2 = xw3.t(ku3Var, null, new AndroidAdRefresh$invoke$3$1$refreshTask$1(this.this$0, this.$adObject, null), 3);
                AdObject adObject = this.$adObject;
                h2h h2hVar = new h2h(getContext());
                h2hVar.g(t.K(), new AndroidAdRefresh$invoke$3$1$1$1(t2, adObject, null));
                h2hVar.g(t2.K(), new AndroidAdRefresh$invoke$3$1$1$2(t, null));
                this.label = 1;
                if (h2h.d(h2hVar, this) == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3(ku3 ku3Var, AdObject adObject, AndroidAdRefresh androidAdRefresh, rq3<? super AndroidAdRefresh$invoke$3> rq3Var) {
        super(2, rq3Var);
        this.$refreshScope = ku3Var;
        this.$adObject = adObject;
        this.this$0 = androidAdRefresh;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidAdRefresh$invoke$3(this.$refreshScope, this.$adObject, this.this$0, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, rq3<? super Unit> rq3Var) {
        return ((AndroidAdRefresh$invoke$3) create(str, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        xw3.L(this.$refreshScope, null, null, new AnonymousClass1(this.$adObject, this.this$0, null), 3);
        return Unit.a;
    }
}
