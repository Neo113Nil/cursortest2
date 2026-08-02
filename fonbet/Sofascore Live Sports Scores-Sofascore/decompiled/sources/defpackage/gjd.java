package defpackage;

import android.view.Window;
import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.moments.models.args.b;
import com.blaze.blazesdk.first_time_slide.ui.FirstTimeSlideCustomView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gjd extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ syl s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjd(syl sylVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = sylVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        gjd gjdVar = new gjd(this.s, rq3Var);
        gjdVar.r = obj;
        return gjdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gjd gjdVar = new gjd(this.s, (rq3) obj2);
        gjdVar.r = (sum) obj;
        return gjdVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01fb -> B:52:0x0209). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        sum sumVar = (sum) this.r;
        if (!Intrinsics.c(sumVar, psm.a)) {
            boolean c = Intrinsics.c(sumVar, hrm.a);
            syl sylVar = this.s;
            if (c) {
                int i = syl.C;
                sylVar.I();
            } else {
                if (!Intrinsics.c(sumVar, ztm.a)) {
                    zzl.b();
                    return null;
                }
                int i2 = syl.C;
                sylVar.z();
                udm udmVar = sylVar.q;
                b bVar = sylVar.p;
                FirstTimeSlideCustomView firstTimeSlideCustomView = udmVar.f;
                firstTimeSlideCustomView.getClass();
                firstTimeSlideCustomView.setVisibility(8);
                if (bVar.k && (function0 = sylVar.s) != null) {
                    function0.invoke();
                }
                if (!bVar.k) {
                    arl.c(sylVar.getActivity(), true);
                }
                BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = bVar.a;
                if (blazeMomentsPlayerStyle != null) {
                    udmVar.a.setBackgroundColor(blazeMomentsPlayerStyle.getBackgroundColor());
                }
                sylVar.h(BlazePlayerType.MOMENTS);
                Window window = sylVar.getActivity().getWindow();
                if (window != null) {
                    window.addFlags(128);
                }
                try {
                    sqm sqmVar = (sqm) sylVar.getViewModel();
                    etl videoManagerFactory = sylVar.getVideoManagerFactory();
                    sqmVar.getClass();
                    videoManagerFactory.getClass();
                    sqmVar.c = videoManagerFactory;
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
                sylVar.G();
                try {
                    sylVar.o(new yml(sylVar, null));
                    sylVar.o(new fum(sylVar, null));
                    sylVar.o(new fxm(sylVar, null));
                    sylVar.o(new izm(sylVar, null));
                    sylVar.o(new j1n(sylVar, null));
                    sylVar.o(new sc2(sylVar, null));
                    h5a.E(((sqm) sylVar.getViewModel()).T, sylVar.getLifecycleOwner(), sylVar.getCancellables$blazesdk_release(), new jol(sylVar.v));
                    h5a.E(((sqm) sylVar.getViewModel()).F, sylVar.getLifecycleOwner(), sylVar.getCancellables$blazesdk_release(), new jol(sylVar.y));
                    h5a.E(((sqm) sylVar.getViewModel()).z, sylVar.getLifecycleOwner(), sylVar.getCancellables$blazesdk_release(), new jol(sylVar.w));
                    h5a.E(((sqm) sylVar.getViewModel()).G, sylVar.getLifecycleOwner(), sylVar.getCancellables$blazesdk_release(), new jol(sylVar.x));
                    h5a.E(((sqm) sylVar.getViewModel()).H, sylVar.getLifecycleOwner(), sylVar.getCancellables$blazesdk_release(), new jol(sylVar.z));
                    sylVar.o(new kf5(sylVar, null));
                    sylVar.o(new cu8(sylVar, null));
                    try {
                        sylVar.o(new kri(sylVar, null));
                        sylVar.o(new pjk(sylVar, null));
                    } catch (Throwable th2) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                    }
                } catch (Throwable th3) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
                }
                BlazeMomentsAdsConfigType blazeMomentsAdsConfigType = bVar.g;
                sqm sqmVar2 = (sqm) sylVar.getViewModel();
                sqmVar2.getClass();
                blazeMomentsAdsConfigType.getClass();
                if (sqmVar2.l == null || sqmVar2.D() == null) {
                    try {
                    } catch (Throwable th4) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th4, null);
                    }
                    if (sqmVar2.l0) {
                        try {
                            x5m.safeViewModelScopeIO$default(sqmVar2, null, new jvl(sqmVar2.n0, sqmVar2, sqmVar2.H(), blazeMomentsAdsConfigType, null), 1, null);
                        } catch (Throwable th5) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th5, null);
                        }
                    } else {
                        try {
                            x5m.safeViewModelScopeIO$default(sqmVar2, null, new lzl(sqmVar2, blazeMomentsAdsConfigType, null), 1, null);
                        } catch (Throwable th6) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th6, null);
                        }
                    }
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th4, null);
                } else {
                    apm apmVar = sqmVar2.l;
                    int i3 = apmVar == null ? -1 : irl.a[apmVar.ordinal()];
                    if (i3 != -1 && i3 != 1 && i3 != 2) {
                        zzl.b();
                        return null;
                    }
                    c1m.basePrepareMediaFor$default(sqmVar2, sqmVar2.D(), false, true, true, null, 18, null);
                }
            }
        }
        return Unit.a;
    }
}
