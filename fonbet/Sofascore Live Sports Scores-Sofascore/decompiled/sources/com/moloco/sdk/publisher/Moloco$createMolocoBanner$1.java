package com.moloco.sdk.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.publisher.k;
import com.moloco.sdk.internal.publisher.l;
import com.moloco.sdk.internal.publisher.m;
import com.moloco.sdk.internal.publisher.n;
import com.moloco.sdk.internal.publisher.p;
import com.moloco.sdk.internal.publisher.s;
import com.moloco.sdk.publisher.BannerAdSize;
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
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 0, 0})
@il4(c = "com.moloco.sdk.publisher.Moloco$createMolocoBanner$1", f = "Moloco.kt", l = {326, 327, 328, 329, 330}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class Moloco$createMolocoBanner$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ String $adUnitId;
    final /* synthetic */ Function2<Banner, MolocoAdError.AdCreateError, Unit> $callback;
    final /* synthetic */ MediationInfo $mediationInfo;
    final /* synthetic */ BannerAdSize $size;
    final /* synthetic */ String $watermarkString;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Moloco$createMolocoBanner$1(MediationInfo mediationInfo, BannerAdSize bannerAdSize, String str, String str2, Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> function2, rq3<? super Moloco$createMolocoBanner$1> rq3Var) {
        super(2, rq3Var);
        this.$mediationInfo = mediationInfo;
        this.$size = bannerAdSize;
        this.$adUnitId = str;
        this.$watermarkString = str2;
        this.$callback = function2;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new Moloco$createMolocoBanner$1(this.$mediationInfo, this.$size, this.$adUnitId, this.$watermarkString, this.$callback, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((Moloco$createMolocoBanner$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r2 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (r2 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
    
        if (r2 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010a, code lost:
    
        if (r2 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013b, code lost:
    
        if (r2 == r1) goto L44;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s adCreator;
        Object R;
        s adCreator2;
        Object R2;
        s adCreator3;
        Object R3;
        s adCreator4;
        Object R4;
        s adCreator5;
        Object R5;
        l0 l0Var;
        Pair pair;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            com.moloco.sdk.acm.recorder.a aVar = com.moloco.sdk.acm.recorder.b.Companion;
            String name = this.$mediationInfo.getName();
            aVar.getClass();
            com.moloco.sdk.acm.recorder.c a = com.moloco.sdk.acm.recorder.a.a(name);
            BannerAdSize bannerAdSize = this.$size;
            if (Intrinsics.c(bannerAdSize, BannerAdSize.Standard.INSTANCE)) {
                adCreator5 = Moloco.INSTANCE.getAdCreator();
                String name2 = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                R5 = xw3.R(adCreator5.e, new m(adCreator5, a, str, str2, name2, null), this);
            } else if (Intrinsics.c(bannerAdSize, BannerAdSize.Tablet.INSTANCE)) {
                adCreator4 = Moloco.INSTANCE.getAdCreator();
                String name3 = this.$mediationInfo.getName();
                String str3 = this.$adUnitId;
                String str4 = this.$watermarkString;
                this.label = 2;
                R4 = xw3.R(adCreator4.e, new n(adCreator4, a, str3, str4, name3, null), this);
            } else if (Intrinsics.c(bannerAdSize, BannerAdSize.MREC.INSTANCE)) {
                adCreator3 = Moloco.INSTANCE.getAdCreator();
                String name4 = this.$mediationInfo.getName();
                String str5 = this.$adUnitId;
                String str6 = this.$watermarkString;
                this.label = 3;
                R3 = xw3.R(adCreator3.e, new p(adCreator3, a, str5, str6, name4, null), this);
            } else if (bannerAdSize instanceof BannerAdSize.InlineAdaptive) {
                adCreator2 = Moloco.INSTANCE.getAdCreator();
                String name5 = this.$mediationInfo.getName();
                Integer availableWidth = ((BannerAdSize.InlineAdaptive) this.$size).getAvailableWidth();
                String str7 = this.$adUnitId;
                String str8 = this.$watermarkString;
                this.label = 4;
                R2 = xw3.R(adCreator2.e, new k(adCreator2, a, str7, str8, name5, availableWidth, null), this);
            } else {
                if (!(bannerAdSize instanceof BannerAdSize.AnchoredAdaptive)) {
                    zzl.b();
                    return null;
                }
                adCreator = Moloco.INSTANCE.getAdCreator();
                String name6 = this.$mediationInfo.getName();
                Integer availableWidth2 = ((BannerAdSize.AnchoredAdaptive) this.$size).getAvailableWidth();
                String str9 = this.$adUnitId;
                String str10 = this.$watermarkString;
                this.label = 5;
                R = xw3.R(adCreator.e, new l(adCreator, a, str9, str10, name6, availableWidth2, null), this);
            }
            return lu3Var;
        }
        if (i == 1) {
            y6a.M(obj);
            R5 = obj;
            l0Var = (l0) R5;
        } else if (i == 2) {
            y6a.M(obj);
            R4 = obj;
            l0Var = (l0) R4;
        } else if (i == 3) {
            y6a.M(obj);
            R3 = obj;
            l0Var = (l0) R3;
        } else if (i == 4) {
            y6a.M(obj);
            R2 = obj;
            l0Var = (l0) R2;
        } else {
            if (i != 5) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            R = obj;
            l0Var = (l0) R;
        }
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
        StringBuilder sb = new StringBuilder("Moloco banner for adUnitId: ");
        sb.append(this.$adUnitId);
        sb.append(" has error: ");
        sb.append(banner == null);
        MolocoLogger.info$default(molocoLogger, "Moloco", sb.toString(), null, false, 12, null);
        this.$callback.invoke(banner, adCreateError);
        return Unit.a;
    }
}
