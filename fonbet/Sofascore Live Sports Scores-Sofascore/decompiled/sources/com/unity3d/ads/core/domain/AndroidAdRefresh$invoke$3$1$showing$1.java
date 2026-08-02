package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import defpackage.a70;
import defpackage.dh;
import defpackage.f1d;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "<anonymous>", "(Lku3;)Lcom/unity3d/ads/core/data/model/AdObjectState;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$showing$1", f = "AndroidAdRefresh.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidAdRefresh$invoke$3$1$showing$1 extends hoi implements Function2<ku3, rq3<? super AdObjectState>, Object> {
    final /* synthetic */ AdObject $adObject;
    int label;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$showing$1$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends dh implements Function2<Object, rq3<? super Boolean>, Object> {
        public AnonymousClass1(Object obj) {
            super(2, 4, AdObjectState.class, obj, "equals", "equals(Ljava/lang/Object;)Z");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, rq3<? super Boolean> rq3Var) {
            return AndroidAdRefresh$invoke$3$1$showing$1.invokeSuspend$equals((AdObjectState) this.receiver, obj, rq3Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$showing$1(AdObject adObject, rq3<? super AndroidAdRefresh$invoke$3$1$showing$1> rq3Var) {
        super(2, rq3Var);
        this.$adObject = adObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$equals(AdObjectState adObjectState, Object obj, rq3 rq3Var) {
        return Boolean.valueOf(adObjectState.equals(obj));
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidAdRefresh$invoke$3$1$showing$1(this.$adObject, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super AdObjectState> rq3Var) {
        return ((AndroidAdRefresh$invoke$3$1$showing$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        f1d state = this.$adObject.getState();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(AdObjectState.SHOWING);
        this.label = 1;
        Object z = rd0.z(state, anonymousClass1, this);
        return z == lu3Var ? lu3Var : z;
    }
}
