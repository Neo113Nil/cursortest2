package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventNavigationDirection;
import com.blaze.blazesdk.analytics.enums.GestureType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.stories.models.args.b;
import com.blaze.blazesdk.first_time_slide.models.args.a;
import com.blaze.blazesdk.first_time_slide.ui.FirstTimeSlideCustomView;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.BlazePlayerDisplayMode;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sofascore.results.R;
import defpackage.gim;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class obm extends ful implements url {
    public static final /* synthetic */ int D = 0;
    public final y8m A;
    public boolean B;
    public final hum C;
    public final b p;
    public final orm q;
    public urm r;
    public BottomSheetBehavior s;
    public final vt t;
    public final nbm u;
    public final nbm v;
    public final nbm w;
    public final nbm x;
    public bk7 y;
    public H z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obm(@NotNull Context context, @NotNull b bVar, @Nullable Bundle bundle, @NotNull u6b u6bVar, @NotNull ttk ttkVar) {
        super(context, u6bVar, ttkVar);
        context.getClass();
        bVar.getClass();
        u6bVar.getClass();
        ttkVar.getClass();
        this.p = bVar;
        int i = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.blaze_layout_stories_player_view, (ViewGroup) this, false);
        addView(inflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i2 = R.id.blaze_player_container_mockup;
        View B = nq8.B(R.id.blaze_player_container_mockup, inflate);
        if (B != null) {
            i2 = R.id.blaze_storiesBlockUserInteraction;
            View B2 = nq8.B(R.id.blaze_storiesBlockUserInteraction, inflate);
            if (B2 != null) {
                i2 = R.id.blaze_storiesFirstTimeSlide;
                FirstTimeSlideCustomView firstTimeSlideCustomView = (FirstTimeSlideCustomView) nq8.B(R.id.blaze_storiesFirstTimeSlide, inflate);
                if (firstTimeSlideCustomView != null) {
                    i2 = R.id.blaze_storiesViewPager;
                    ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.blaze_storiesViewPager, inflate);
                    if (viewPager2 != null) {
                        i2 = R.id.blaze_viewPagerCoordinatorLayoutContainer;
                        if (((CoordinatorLayout) nq8.B(R.id.blaze_viewPagerCoordinatorLayoutContainer, inflate)) != null) {
                            this.q = new orm(constraintLayout, B, B2, firstTimeSlideCustomView, viewPager2);
                            setupViewModel(bundle);
                            setClosedCaptionBottomSheetResultListener(u6bVar);
                            this.t = new vt(context, 22);
                            this.u = new nbm(this, i);
                            this.v = new nbm(this, 1);
                            this.w = new nbm(this, 2);
                            this.x = new nbm(this, 3);
                            this.z = H.SWIPE;
                            this.A = new y8m(this);
                            this.C = new hum(this);
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0108, code lost:
    
        if (r2.D(r12, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ea, code lost:
    
        if (r13.A(r8, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (r5.y(r8, r9, r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(obm obmVar, n4m n4mVar, sq3 sq3Var) {
        yyd yydVar;
        int i;
        orm ormVar;
        orm ormVar2;
        n4m n4mVar2;
        orm ormVar3;
        urm urmVar;
        n4m n4mVar3;
        orm ormVar4;
        obm obmVar2;
        orm ormVar5;
        urm urmVar2;
        obm obmVar3;
        n4m n4mVar4;
        urm urmVar3;
        obm obmVar4;
        urm urmVar4;
        RecyclerView recyclerView;
        obmVar.getClass();
        if (sq3Var instanceof yyd) {
            yydVar = (yyd) sq3Var;
            int i2 = yydVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yydVar.x = i2 - Integer.MIN_VALUE;
                Object obj = yydVar.v;
                lu3 lu3Var = lu3.a;
                i = yydVar.x;
                if (i != 0) {
                    y6a.M(obj);
                    ormVar = obmVar.q;
                    if (ormVar != null) {
                        urm urmVar5 = obmVar.r;
                        List list = urmVar5 != null ? urmVar5.a.f : null;
                        if (list != null && !list.isEmpty() && obmVar.G()) {
                            urm urmVar6 = obmVar.r;
                            if (urmVar6 != null) {
                                int currentItem = ormVar.e.getCurrentItem();
                                yydVar.r = obmVar;
                                yydVar.s = n4mVar;
                                yydVar.t = ormVar;
                                yydVar.u = ormVar;
                                yydVar.x = 1;
                                if (urmVar6.v(currentItem, n4mVar, yydVar) != lu3Var) {
                                    n4mVar2 = n4mVar;
                                    ormVar3 = ormVar;
                                }
                                return lu3Var;
                            }
                            ormVar2 = ormVar;
                            urmVar = obmVar.r;
                            if (urmVar != null) {
                                w0m playerRendererBridge = obmVar.getPlayerRendererBridge();
                                int currentItem2 = ormVar.e.getCurrentItem();
                                yydVar.r = obmVar;
                                yydVar.s = n4mVar;
                                yydVar.t = ormVar2;
                                yydVar.u = ormVar;
                                yydVar.x = 2;
                            }
                            orm ormVar6 = ormVar2;
                            n4mVar3 = n4mVar;
                            ormVar4 = ormVar6;
                            obmVar2 = obmVar;
                            ormVar5 = ormVar;
                            urmVar2 = obmVar2.r;
                            if (urmVar2 != null) {
                            }
                            obmVar3 = obmVar2;
                            orm ormVar7 = ormVar4;
                            orm ormVar8 = ormVar5;
                            n4mVar4 = n4mVar3;
                            urmVar3 = obmVar3.r;
                            if (urmVar3 != null) {
                            }
                            obmVar4 = obmVar3;
                            c1m.handleUIIsReadyToPlay$default(obmVar4.getViewModel(), n4mVar4, false, 2, null);
                            obmVar4.l(n4mVar4);
                            obmVar4.setPlayerViewResizeMode(n4mVar4);
                            obmVar4.setLayoutForPlayerMode(BlazePlayerDisplayMode.FIXED_RATIO_9_16);
                            urmVar4 = obmVar4.r;
                            if (urmVar4 != null) {
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i == 2) {
                        ormVar5 = yydVar.u;
                        ormVar4 = yydVar.t;
                        n4mVar3 = yydVar.s;
                        obmVar2 = yydVar.r;
                        y6a.M(obj);
                        urmVar2 = obmVar2.r;
                        if (urmVar2 != null) {
                            int currentItem3 = ormVar5.e.getCurrentItem();
                            yydVar.r = obmVar2;
                            yydVar.s = n4mVar3;
                            yydVar.t = ormVar4;
                            yydVar.u = ormVar5;
                            yydVar.x = 3;
                        }
                        obmVar3 = obmVar2;
                        orm ormVar72 = ormVar4;
                        orm ormVar82 = ormVar5;
                        n4mVar4 = n4mVar3;
                        urmVar3 = obmVar3.r;
                        if (urmVar3 != null) {
                        }
                        obmVar4 = obmVar3;
                        c1m.handleUIIsReadyToPlay$default(obmVar4.getViewModel(), n4mVar4, false, 2, null);
                        obmVar4.l(n4mVar4);
                        obmVar4.setPlayerViewResizeMode(n4mVar4);
                        obmVar4.setLayoutForPlayerMode(BlazePlayerDisplayMode.FIXED_RATIO_9_16);
                        urmVar4 = obmVar4.r;
                        if (urmVar4 != null) {
                        }
                        return Unit.a;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        n4mVar4 = yydVar.s;
                        obmVar4 = yydVar.r;
                        y6a.M(obj);
                        c1m.handleUIIsReadyToPlay$default(obmVar4.getViewModel(), n4mVar4, false, 2, null);
                        obmVar4.l(n4mVar4);
                        obmVar4.setPlayerViewResizeMode(n4mVar4);
                        obmVar4.setLayoutForPlayerMode(BlazePlayerDisplayMode.FIXED_RATIO_9_16);
                        urmVar4 = obmVar4.r;
                        if (urmVar4 != null && (recyclerView = urmVar4.d) != null) {
                            recyclerView.post(new xtl(recyclerView, 7));
                        }
                        return Unit.a;
                    }
                    ormVar5 = yydVar.u;
                    ormVar4 = yydVar.t;
                    n4mVar3 = yydVar.s;
                    obmVar3 = yydVar.r;
                    y6a.M(obj);
                    orm ormVar722 = ormVar4;
                    orm ormVar822 = ormVar5;
                    n4mVar4 = n4mVar3;
                    urmVar3 = obmVar3.r;
                    if (urmVar3 != null) {
                        int currentItem4 = ormVar822.e.getCurrentItem();
                        yydVar.r = obmVar3;
                        yydVar.s = n4mVar4;
                        yydVar.t = ormVar722;
                        yydVar.u = null;
                        yydVar.x = 4;
                    }
                    obmVar4 = obmVar3;
                    c1m.handleUIIsReadyToPlay$default(obmVar4.getViewModel(), n4mVar4, false, 2, null);
                    obmVar4.l(n4mVar4);
                    obmVar4.setPlayerViewResizeMode(n4mVar4);
                    obmVar4.setLayoutForPlayerMode(BlazePlayerDisplayMode.FIXED_RATIO_9_16);
                    urmVar4 = obmVar4.r;
                    if (urmVar4 != null) {
                        recyclerView.post(new xtl(recyclerView, 7));
                    }
                    return Unit.a;
                }
                orm ormVar9 = yydVar.u;
                ormVar3 = yydVar.t;
                n4mVar2 = yydVar.s;
                obm obmVar5 = yydVar.r;
                y6a.M(obj);
                ormVar = ormVar9;
                obmVar = obmVar5;
                n4m n4mVar5 = n4mVar2;
                ormVar2 = ormVar3;
                n4mVar = n4mVar5;
                urmVar = obmVar.r;
                if (urmVar != null) {
                }
                orm ormVar62 = ormVar2;
                n4mVar3 = n4mVar;
                ormVar4 = ormVar62;
                obmVar2 = obmVar;
                ormVar5 = ormVar;
                urmVar2 = obmVar2.r;
                if (urmVar2 != null) {
                }
                obmVar3 = obmVar2;
                orm ormVar7222 = ormVar4;
                orm ormVar8222 = ormVar5;
                n4mVar4 = n4mVar3;
                urmVar3 = obmVar3.r;
                if (urmVar3 != null) {
                }
                obmVar4 = obmVar3;
                c1m.handleUIIsReadyToPlay$default(obmVar4.getViewModel(), n4mVar4, false, 2, null);
                obmVar4.l(n4mVar4);
                obmVar4.setPlayerViewResizeMode(n4mVar4);
                obmVar4.setLayoutForPlayerMode(BlazePlayerDisplayMode.FIXED_RATIO_9_16);
                urmVar4 = obmVar4.r;
                if (urmVar4 != null) {
                }
                return Unit.a;
            }
        }
        yydVar = new yyd(obmVar, sq3Var);
        Object obj2 = yydVar.v;
        lu3 lu3Var2 = lu3.a;
        i = yydVar.x;
        if (i != 0) {
        }
        n4m n4mVar52 = n4mVar2;
        ormVar2 = ormVar3;
        n4mVar = n4mVar52;
        urmVar = obmVar.r;
        if (urmVar != null) {
        }
        orm ormVar622 = ormVar2;
        n4mVar3 = n4mVar;
        ormVar4 = ormVar622;
        obmVar2 = obmVar;
        ormVar5 = ormVar;
        urmVar2 = obmVar2.r;
        if (urmVar2 != null) {
        }
        obmVar3 = obmVar2;
        orm ormVar72222 = ormVar4;
        orm ormVar82222 = ormVar5;
        n4mVar4 = n4mVar3;
        urmVar3 = obmVar3.r;
        if (urmVar3 != null) {
        }
        obmVar4 = obmVar3;
        c1m.handleUIIsReadyToPlay$default(obmVar4.getViewModel(), n4mVar4, false, 2, null);
        obmVar4.l(n4mVar4);
        obmVar4.setPlayerViewResizeMode(n4mVar4);
        obmVar4.setLayoutForPlayerMode(BlazePlayerDisplayMode.FIXED_RATIO_9_16);
        urmVar4 = obmVar4.r;
        if (urmVar4 != null) {
        }
        return Unit.a;
    }

    private final void setClosedCaptionBottomSheetResultListener(u6b u6bVar) {
        getActivity().k().i0("ClosedCaptionBottomSheetRequestKey", u6bVar, new bnk(this, 14));
    }

    private final void setLayoutForPlayerMode(BlazePlayerDisplayMode blazePlayerDisplayMode) {
        mm3 mm3Var = new mm3();
        orm ormVar = this.q;
        ConstraintLayout constraintLayout = ormVar.a;
        mm3Var.e(constraintLayout);
        View view = ormVar.b;
        mm3Var.c(view.getId());
        int i = blazePlayerDisplayMode == null ? -1 : btm.a[blazePlayerDisplayMode.ordinal()];
        if (i == -1 || i == 1) {
            mm3Var.o(view.getId(), "9:16");
            mm3Var.s(view.getId());
            mm3Var.f(view.getId(), 3, constraintLayout.getId(), 3);
            mm3Var.f(view.getId(), 6, constraintLayout.getId(), 6);
            mm3Var.f(view.getId(), 7, constraintLayout.getId(), 7);
            mm3Var.f(view.getId(), 4, constraintLayout.getId(), 4);
        } else if (i == 2) {
            mm3Var.f(view.getId(), 3, constraintLayout.getId(), 3);
            mm3Var.f(view.getId(), 6, constraintLayout.getId(), 6);
            mm3Var.f(view.getId(), 7, constraintLayout.getId(), 7);
            mm3Var.f(view.getId(), 4, constraintLayout.getId(), 4);
        } else if (i != 3) {
            zzl.b();
            return;
        }
        mm3Var.a(constraintLayout);
    }

    private final void setPlayerViewResizeMode(n4m n4mVar) {
        int i;
        PlayerView playerView = ((qdm) getPlayerRendererBridge()).a;
        gim gimVar = n4mVar.b;
        if (gimVar instanceof gim.a) {
            i = 0;
        } else {
            if (!(gimVar instanceof gim.d) && !(gimVar instanceof gim.b) && !(gimVar instanceof gim.e) && !(gimVar instanceof gim.c)) {
                zzl.b();
                return;
            }
            i = 4;
        }
        playerView.setResizeMode(i);
    }

    private final void setupViewModel(Bundle bundle) {
        orm ormVar = this.q;
        try {
            n(this.p.b, ilm.class);
            A();
            apm c = c(bundle);
            D(c);
            w();
            if (bundle != null && !((ilm) getViewModel()).J()) {
                j(H.APP_CLOSE);
                return;
            }
            ConstraintLayout constraintLayout = ormVar.a;
            constraintLayout.getClass();
            lz.s(constraintLayout);
            ((ilm) getViewModel()).l = c;
            BottomSheetBehavior C = BottomSheetBehavior.C(ormVar.e);
            this.s = C;
            C.K = true;
            C.K(true);
            C.M(3);
            setOnShareChooserDismissed(new nbm(this, 4));
            o(new dif(this, null));
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            throw th;
        }
    }

    public final void C(int i, H h) {
        ilm ilmVar = (ilm) getViewModel();
        ilmVar.getClass();
        h.getClass();
        try {
            String str = ((xlm) ilmVar.o0.get(i)).a;
            if (ilmVar.i0() != null && !Intrinsics.c(str, ilmVar.l0)) {
                jom.g(ilmVar, h);
            }
            ilmVar.l0 = str;
            ilmVar.m0 = str;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += ((xlm) ilmVar.o0.get(i3)).b.size();
            }
            xlm i0 = ilmVar.i0();
            Integer valueOf = i0 != null ? Integer.valueOf(ilmVar.D() == null ? jca.x(i0) : i0.a()) : null;
            ilmVar.k0();
            ilmVar.V();
            n4m n4mVar = (n4m) CollectionsKt.a0(i2 + (valueOf != null ? valueOf.intValue() : 0), ilmVar.t);
            if (n4mVar != null) {
                Integer j0 = ilmVar.j0();
                int intValue = j0 != null ? j0.intValue() : -1;
                ilmVar.c0(n4mVar, i < intValue ? EventNavigationDirection.BACKWARD : i > intValue ? EventNavigationDirection.FORWARD : EventNavigationDirection.FORWARD);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        this.y = null;
    }

    public final void D(apm apmVar) {
        if (apmVar == null) {
            ilm ilmVar = (ilm) getViewModel();
            b bVar = this.p;
            WidgetType widgetType = bVar.e;
            String str = bVar.b;
            String str2 = bVar.c;
            String str3 = bVar.d;
            BlazeCachingLevel blazeCachingLevel = bVar.h;
            BlazeStoryPlayerStyle blazeStoryPlayerStyle = bVar.a;
            B b = bVar.f;
            String str4 = bVar.i;
            boolean z = bVar.l;
            String str5 = bVar.m;
            ilmVar.getClass();
            str.getClass();
            str2.getClass();
            str.getClass();
            ilmVar.f = str;
            str2.getClass();
            ilmVar.i = str2;
            ilmVar.k = str3;
            ilmVar.U = z;
            ilmVar.j = str5;
            if (widgetType != null) {
                ilmVar.h = widgetType;
            }
            if (blazeCachingLevel != null) {
                ilmVar.v0 = blazeCachingLevel;
            }
            if (b != null) {
                ilmVar.w0 = b;
            }
            if (str4 != null) {
                ilmVar.m0 = str4;
            }
            ilmVar.y0 = blazeStoryPlayerStyle;
        }
    }

    public final void E(n4m n4mVar) {
        ilm ilmVar = (ilm) getViewModel();
        ilmVar.getClass();
        n4m D2 = ilmVar.D();
        gim gimVar = D2 != null ? D2.b : null;
        if (gimVar instanceof gim.d) {
            jom.e(ilmVar, EventActionName.CTA_CLICK, jom.createStoryPlayerProps$default(ilmVar, (gim.d) gimVar, null, null, null, null, null, false, GestureType.CLICK, null, null, 894, null));
        } else if (gimVar instanceof gim.a) {
            ilmVar.x0.g();
            jom.c(ilmVar, EventActionName.AD_CLICK, jom.createStoryPlayerAdProps$default(ilmVar, (gim.a) gimVar, null, null, false, false, GestureType.CLICK, 30, null));
        }
        m(n4mVar, BlazePlayerType.STORIES);
    }

    public final void F(n4m n4mVar) {
        this.q.e.setUserInputEnabled(false);
        ilm ilmVar = (ilm) getViewModel();
        ilmVar.getClass();
        n4m D2 = ilmVar.D();
        gim gimVar = D2 != null ? D2.b : null;
        if (gimVar instanceof gim.d) {
            jom.e(ilmVar, EventActionName.CTA_CLICK, jom.createStoryPlayerProps$default(ilmVar, (gim.d) gimVar, null, null, null, null, null, false, GestureType.SWIPE_UP, null, null, 894, null));
        } else if (gimVar instanceof gim.a) {
            ilmVar.x0.g();
            jom.c(ilmVar, EventActionName.AD_CLICK, jom.createStoryPlayerAdProps$default(ilmVar, (gim.a) gimVar, null, null, false, false, GestureType.SWIPE_UP, 30, null));
        }
        m(n4mVar, BlazePlayerType.STORIES);
    }

    public final boolean G() {
        Integer j0 = ((ilm) getViewModel()).j0();
        return j0 != null && j0.intValue() == this.q.e.getCurrentItem();
    }

    public final void H() {
        try {
            BlazeStoryPlayerStyle blazeStoryPlayerStyle = this.p.a;
            a aVar = new a(blazeStoryPlayerStyle != null ? blazeStoryPlayerStyle.getFirstTimeSlide() : null);
            Context context = getContext();
            arl.c(getActivity(), context != null && (context.getResources().getConfiguration().uiMode & 48) == 32);
            jxl jxlVar = aVar.a;
            orm ormVar = this.q;
            if (jxlVar != null) {
                ormVar.a.setBackgroundColor(getContext().getColor(jxlVar.getBackgroundColorResId()));
            }
            ConstraintLayout constraintLayout = ormVar.a;
            FirstTimeSlideCustomView firstTimeSlideCustomView = ormVar.d;
            Context context2 = constraintLayout.getContext();
            context2.getClass();
            setLayoutForPlayerMode(cnb.i(context2) ? BlazePlayerDisplayMode.FIXED_RATIO_9_16 : BlazePlayerDisplayMode.RESIZE_ASPECT_FILL_CENTER_CROP);
            firstTimeSlideCustomView.f(aVar);
            firstTimeSlideCustomView.setVisibility(0);
            firstTimeSlideCustomView.setOnFirstTimeSlideCtaClicked(new ndk(this, 19));
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.ful
    public final void f(u6b u6bVar) {
        this.B = false;
    }

    @Override // defpackage.ful
    public final void j(H h) {
        h.getClass();
        ilm ilmVar = (ilm) getViewModel();
        ilmVar.getClass();
        h.getClass();
        try {
            jom.f(ilmVar, EventNavigationDirection.CLOSE);
            jom.g(ilmVar, h);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        getActivity().finish();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o(new enb(this, null));
    }

    @Override // defpackage.ful
    public final void q(u6b u6bVar) {
        d();
        ilm ilmVar = (ilm) getViewModel();
        if (ilmVar.f0) {
            return;
        }
        ilmVar.j0 = false;
        ilmVar.B(false);
    }

    @Override // defpackage.ful
    public final void s(u6b u6bVar) {
        u6bVar.getClass();
        super.s(u6bVar);
        BottomSheetBehavior bottomSheetBehavior = this.s;
        hum humVar = this.C;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.a0.remove(humVar);
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.s;
        if (bottomSheetBehavior2 != null) {
            ArrayList arrayList = bottomSheetBehavior2.a0;
            if (!arrayList.contains(humVar)) {
                arrayList.add(humVar);
            }
        }
        ilm ilmVar = (ilm) getViewModel();
        ilmVar.j0 = true;
        ilmVar.M = false;
        ilmVar.B(true);
        fdi fdiVar = ilmVar.q0;
        Boolean bool = Boolean.TRUE;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        ViewPager2 viewPager2 = this.q.e;
        Integer j0 = ((ilm) getViewModel()).j0();
        if (j0 == null || j0.intValue() == viewPager2.getCurrentItem()) {
            return;
        }
        C(viewPager2.getCurrentItem(), this.z);
    }

    @Override // defpackage.ful
    public final void v() {
        try {
            ilm ilmVar = (ilm) getViewModel();
            Context context = getContext();
            ilmVar.h0(context != null && cnb.f(context) == 0);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.ful
    public final BlazeContentExtraInfo y() {
        List list;
        ilm ilmVar = (ilm) getViewModel();
        ilm ilmVar2 = (ilm) getViewModel();
        xlm i0 = ilmVar2.i0();
        return ilmVar.X((i0 == null || (list = i0.b) == null) ? null : tz9.t(list, ilmVar2.D()), ((ilm) getViewModel()).j0());
    }

    public /* synthetic */ obm(Context context, b bVar, Bundle bundle, u6b u6bVar, ttk ttkVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, bVar, (i & 4) != 0 ? null : bundle, u6bVar, ttkVar);
    }
}
