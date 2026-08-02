package com.moloco.sdk.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.publisher.m;
import com.moloco.sdk.internal.publisher.s;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 0, 0})
@il4(c = "com.moloco.sdk.publisher.Moloco$createBanner$1", f = "Moloco.kt", l = {249}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class Moloco$createBanner$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ String $adUnitId;
    final /* synthetic */ Function2<Banner, MolocoAdError.AdCreateError, Unit> $callback;
    final /* synthetic */ MediationInfo $mediationInfo;
    final /* synthetic */ String $watermarkString;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Moloco$createBanner$1(MediationInfo mediationInfo, String str, String str2, Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> function2, rq3<? super Moloco$createBanner$1> rq3Var) {
        super(2, rq3Var);
        this.$mediationInfo = mediationInfo;
        this.$adUnitId = str;
        this.$watermarkString = str2;
        this.$callback = function2;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new Moloco$createBanner$1(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((Moloco$createBanner$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        s adCreator;
        Pair pair;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            com.moloco.sdk.acm.recorder.a aVar = com.moloco.sdk.acm.recorder.b.Companion;
            String name = this.$mediationInfo.getName();
            aVar.getClass();
            com.moloco.sdk.acm.recorder.c a = com.moloco.sdk.acm.recorder.a.a(name);
            adCreator = Moloco.INSTANCE.getAdCreator();
            String name2 = this.$mediationInfo.getName();
            String str = this.$adUnitId;
            String str2 = this.$watermarkString;
            this.label = 1;
            obj = xw3.R(adCreator.e, new m(adCreator, a, str, str2, name2, null), this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        l0 l0Var = (l0) obj;
        if (l0Var instanceof k0) {
            pair = new Pair(((k0) l0Var).a, null);
        } else {
            if (!(l0Var instanceof j0)) {
                zzl.b();
                return null;
            }
            pair = new Pair(null, ((j0) l0Var).a);
        }
        Banner banner = (Banner) pair.a;
        MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pair.b;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder("Banner for adUnitId: ");
        sb.append(this.$adUnitId);
        sb.append(" has error: ");
        sb.append(banner == null);
        MolocoLogger.info$default(molocoLogger, "Moloco", sb.toString(), null, false, 12, null);
        this.$callback.invoke(banner, adCreateError);
        return Unit.a;
    }
}
