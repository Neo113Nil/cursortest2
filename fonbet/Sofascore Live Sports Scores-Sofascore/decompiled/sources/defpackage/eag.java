package defpackage;

import android.content.Context;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.stories.models.args.b;
import com.blaze.blazesdk.first_time_slide.ui.FirstTimeSlideCustomView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eag extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ obm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eag(obm obmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = obmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        eag eagVar = new eag(this.s, rq3Var);
        eagVar.r = obj;
        return eagVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eag eagVar = new eag(this.s, (rq3) obj2);
        eagVar.r = (sum) obj;
        return eagVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        sum sumVar = (sum) this.r;
        if (!Intrinsics.c(sumVar, psm.a)) {
            boolean c = Intrinsics.c(sumVar, hrm.a);
            obm obmVar = this.s;
            if (c) {
                int i = obm.D;
                obmVar.H();
            } else {
                if (!Intrinsics.c(sumVar, ztm.a)) {
                    zzl.b();
                    return null;
                }
                int i2 = obm.D;
                obmVar.z();
                orm ormVar = obmVar.q;
                FirstTimeSlideCustomView firstTimeSlideCustomView = ormVar.d;
                ViewPager2 viewPager2 = ormVar.e;
                firstTimeSlideCustomView.getClass();
                firstTimeSlideCustomView.setVisibility(8);
                arl.c(obmVar.getActivity(), true);
                b bVar = obmVar.p;
                BlazeStoryPlayerStyle blazeStoryPlayerStyle = bVar.a;
                if (blazeStoryPlayerStyle != null) {
                    ormVar.a.setBackgroundColor(blazeStoryPlayerStyle.getBackgroundColor());
                }
                obmVar.h(BlazePlayerType.STORIES);
                Window window = obmVar.getActivity().getWindow();
                if (window != null) {
                    window.addFlags(128);
                }
                ilm ilmVar = (ilm) obmVar.getViewModel();
                etl videoManagerFactory = obmVar.getVideoManagerFactory();
                ilmVar.getClass();
                videoManagerFactory.getClass();
                ilmVar.c = videoManagerFactory;
                try {
                    viewPager2.getClass();
                    RecyclerView o = evl.o(viewPager2);
                    if (o != null) {
                        try {
                            o.setNestedScrollingEnabled(false);
                            o.setOverScrollMode(2);
                        } catch (Throwable th) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                        }
                    }
                    viewPager2.setImportantForAccessibility(2);
                    RecyclerView o2 = evl.o(viewPager2);
                    if (o2 != null) {
                        o2.setImportantForAccessibility(2);
                        o2.setAccessibilityDelegate(new oka());
                    }
                    cbm cbmVar = cbm.a;
                    Context context = obmVar.getContext();
                    context.getClass();
                    obmVar.setPlayerRendererBridge(btl.create$default(cbmVar, context, null, 2, null));
                    urm urmVar = new urm(obmVar, bVar.a, obmVar.getViewScope());
                    obmVar.r = urmVar;
                    viewPager2.setAdapter(urmVar);
                    viewPager2.setOffscreenPageLimit(1);
                    viewPager2.setVisibility(4);
                    viewPager2.a(obmVar.A);
                    viewPager2.setPageTransformer(new jpl());
                    t2m t2mVar = new t2m(obmVar);
                    RecyclerView o3 = evl.o(viewPager2);
                    if (o3 != null) {
                        mqm.a(o3, snm.HORIZONTAL, 60, emm.AFTER_USER_LIFTS_FINGER, t2mVar);
                    }
                } catch (Throwable th2) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                }
                obmVar.o(new gul(obmVar, null));
                obmVar.o(new hxm(obmVar, null));
                obmVar.o(new kzm(obmVar, null));
                obmVar.o(new k1n(obmVar, null));
                obmVar.o(new tc2(obmVar, null));
                obmVar.o(new xl6(obmVar, null));
                obmVar.o(new ul9(obmVar, null));
                obmVar.o(new aia(obmVar, null));
                h5a.E(((ilm) obmVar.getViewModel()).T, obmVar.getLifecycleOwner(), obmVar.getCancellables$blazesdk_release(), new qyl(obmVar.t));
                h5a.E(((ilm) obmVar.getViewModel()).z, obmVar.getLifecycleOwner(), obmVar.getCancellables$blazesdk_release(), new qyl(obmVar.u));
                h5a.E(((ilm) obmVar.getViewModel()).E, obmVar.getLifecycleOwner(), obmVar.getCancellables$blazesdk_release(), new qyl(obmVar.v));
                h5a.E(((ilm) obmVar.getViewModel()).H, obmVar.getLifecycleOwner(), obmVar.getCancellables$blazesdk_release(), new qyl(obmVar.x));
                h5a.E(((ilm) obmVar.getViewModel()).u0, obmVar.getLifecycleOwner(), obmVar.getCancellables$blazesdk_release(), new qyl(obmVar.w));
                try {
                    obmVar.o(new ezk(obmVar, null));
                    obmVar.o(new zml(obmVar, null));
                } catch (Throwable th3) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
                }
                BlazeStoriesAdsConfigType blazeStoriesAdsConfigType = bVar.g;
                ilm ilmVar2 = (ilm) obmVar.getViewModel();
                boolean z = bVar.k;
                String str = bVar.i;
                String str2 = bVar.j;
                ilmVar2.getClass();
                blazeStoriesAdsConfigType.getClass();
                if (ilmVar2.l == null || ilmVar2.D() == null) {
                    try {
                        if (z) {
                            x5m.safeViewModelScopeIO$default(ilmVar2, null, new v6m(str, ilmVar2, str2, blazeStoriesAdsConfigType, null), 1, null);
                        } else {
                            x5m.safeViewModelScopeIO$default(ilmVar2, null, new r3m(ilmVar2, str2, blazeStoriesAdsConfigType, null), 1, null);
                        }
                    } catch (Throwable th4) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th4, null);
                    }
                } else {
                    apm apmVar = ilmVar2.l;
                    int i3 = apmVar == null ? -1 : xzl.a[apmVar.ordinal()];
                    if (i3 != -1 && i3 != 1 && i3 != 2) {
                        zzl.b();
                        return null;
                    }
                    c1m.basePrepareMediaFor$default(ilmVar2, ilmVar2.D(), false, true, true, null, 18, null);
                }
            }
        }
        return Unit.a;
    }
}
