package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.analytics.enums.EventNavigationDirection;
import com.blaze.blazesdk.features.moments.models.args.b;
import com.blaze.blazesdk.first_time_slide.models.args.a;
import com.blaze.blazesdk.first_time_slide.ui.FirstTimeSlideCustomView;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.BlazePlayerDisplayMode;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerButtonStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsTabsConfigurations;
import com.sofascore.results.R;
import defpackage.gim;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class syl extends ful implements grl {
    public static final /* synthetic */ int C = 0;
    public final iul A;
    public boolean B;
    public final b p;
    public final udm q;
    public Function0 r;
    public Function0 s;
    public mpm t;
    public hrl u;
    public final vt v;
    public final pyl w;
    public final pyl x;
    public final pyl y;
    public final pyl z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syl(@NotNull Context context, @NotNull b bVar, @Nullable Bundle bundle, @NotNull u6b u6bVar, @NotNull ttk ttkVar) {
        super(context, u6bVar, ttkVar);
        context.getClass();
        bVar.getClass();
        u6bVar.getClass();
        ttkVar.getClass();
        this.p = bVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.blaze_layout_moments_player_view, (ViewGroup) this, false);
        addView(inflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i = R.id.blaze_momentFragmentSafeAreaBottom;
        Guideline guideline = (Guideline) nq8.B(R.id.blaze_momentFragmentSafeAreaBottom, inflate);
        if (guideline != null) {
            i = R.id.blaze_momentFragmentSafeAreaTop;
            Guideline guideline2 = (Guideline) nq8.B(R.id.blaze_momentFragmentSafeAreaTop, inflate);
            if (guideline2 != null) {
                i = R.id.blaze_momentsBlockUserInteraction;
                View B = nq8.B(R.id.blaze_momentsBlockUserInteraction, inflate);
                if (B != null) {
                    i = R.id.blaze_momentsCloseButton;
                    ImageView imageView = (ImageView) nq8.B(R.id.blaze_momentsCloseButton, inflate);
                    if (imageView != null) {
                        i = R.id.blaze_momentsFirstTimeSlide;
                        FirstTimeSlideCustomView firstTimeSlideCustomView = (FirstTimeSlideCustomView) nq8.B(R.id.blaze_momentsFirstTimeSlide, inflate);
                        if (firstTimeSlideCustomView != null) {
                            i = R.id.blaze_momentsSearchButton;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.blaze_momentsSearchButton, inflate);
                            if (imageView2 != null) {
                                i = R.id.blaze_momentsSoundButton;
                                ImageView imageView3 = (ImageView) nq8.B(R.id.blaze_momentsSoundButton, inflate);
                                if (imageView3 != null) {
                                    i = R.id.blaze_momentsTopButtonsFlow;
                                    Flow flow = (Flow) nq8.B(R.id.blaze_momentsTopButtonsFlow, inflate);
                                    if (flow != null) {
                                        i = R.id.blaze_momentsViewPager;
                                        ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.blaze_momentsViewPager, inflate);
                                        if (viewPager2 != null) {
                                            i = R.id.blaze_player_container_mockup;
                                            View B2 = nq8.B(R.id.blaze_player_container_mockup, inflate);
                                            if (B2 != null) {
                                                this.q = new udm(constraintLayout, guideline, guideline2, B, imageView, firstTimeSlideCustomView, imageView2, imageView3, flow, viewPager2, B2);
                                                this.v = new vt(context, 21);
                                                this.w = new pyl(this, 1);
                                                this.x = new pyl(this, 2);
                                                this.y = new pyl(this, 3);
                                                this.z = new pyl(this, 4);
                                                this.A = new iul(this);
                                                setupViewModel(bundle);
                                                setClosedCaptionBottomSheetResultListener(u6bVar);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r9.B(r1, r2) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d8, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b9, code lost:
    
        if (r10.z(r11, r2) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x009a, code lost:
    
        if (r4.x(r9, r10, r2) == r3) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(syl sylVar, n4m n4mVar, sq3 sq3Var) {
        o2d o2dVar;
        int i;
        udm udmVar;
        n4m n4mVar2;
        udm udmVar2;
        n4m n4mVar3;
        mpm mpmVar;
        syl sylVar2;
        n4m n4mVar4;
        mpm mpmVar2;
        syl sylVar3;
        boolean z;
        hrl hrlVar;
        Activity activity;
        udm udmVar3;
        BlazeMomentsPlayerStyle playerStyle;
        mpm mpmVar3;
        RecyclerView recyclerView;
        BlazeMomentsPlayerButtonsStyle buttons;
        BlazeMomentsTabsConfigurations tabsConfigurations;
        syl sylVar4 = sylVar;
        sylVar4.getClass();
        if (sq3Var instanceof o2d) {
            o2dVar = (o2d) sq3Var;
            int i2 = o2dVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o2dVar.x = i2 - Integer.MIN_VALUE;
                Object obj = o2dVar.v;
                lu3 lu3Var = lu3.a;
                i = o2dVar.x;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    udmVar = sylVar4.q;
                    mpm mpmVar4 = sylVar4.t;
                    List list = mpmVar4 != null ? mpmVar4.a.f : null;
                    if (list != null && !list.isEmpty() && sylVar4.H()) {
                        mpm mpmVar5 = sylVar4.t;
                        if (mpmVar5 != null) {
                            w0m playerRendererBridge = sylVar4.getPlayerRendererBridge();
                            int currentItem = udmVar.j.getCurrentItem();
                            o2dVar.r = sylVar4;
                            n4mVar2 = n4mVar;
                            o2dVar.s = n4mVar2;
                            o2dVar.t = udmVar;
                            o2dVar.u = udmVar;
                            o2dVar.x = 1;
                        } else {
                            n4mVar2 = n4mVar;
                        }
                        udmVar2 = udmVar;
                        n4mVar3 = n4mVar2;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        n4mVar4 = o2dVar.s;
                        sylVar3 = o2dVar.r;
                        y6a.M(obj);
                        c1m.handleUIIsReadyToPlay$default(sylVar3.getViewModel(), n4mVar4, false, 2, null);
                        sylVar3.l(n4mVar4);
                        sylVar3.setPlayerViewResizeMode(n4mVar4);
                        BlazeMomentsPlayerStyle playerStyle2 = sylVar3.getPlayerStyle();
                        BlazePlayerDisplayMode playerDisplayMode = playerStyle2 == null ? playerStyle2.getPlayerDisplayMode() : null;
                        BlazePlayerDisplayMode blazePlayerDisplayMode = BlazePlayerDisplayMode.RESIZE_ASPECT_FILL_CENTER_CROP;
                        z = playerDisplayMode != blazePlayerDisplayMode;
                        Context context = sylVar3.getContext();
                        boolean i4 = context == null ? cnb.i(context) : false;
                        if (z || i4) {
                            hrlVar = sylVar3.u;
                            if (hrlVar == null) {
                                blazePlayerDisplayMode = hrlVar.a.getPlayerDisplayMode();
                                if ((n4mVar4.b instanceof gim.a) || ((activity = (Activity) hrlVar.b.get()) != null && cnb.i(activity))) {
                                    blazePlayerDisplayMode = BlazePlayerDisplayMode.FIXED_RATIO_9_16;
                                }
                            } else {
                                blazePlayerDisplayMode = null;
                            }
                        }
                        sylVar3.setLayoutForPlayerMode(blazePlayerDisplayMode);
                        udmVar3 = sylVar3.q;
                        playerStyle = sylVar3.getPlayerStyle();
                        if (playerStyle != null && (tabsConfigurations = playerStyle.getTabsConfigurations()) != null && tabsConfigurations.isActive$blazesdk_release()) {
                            Flow flow = udmVar3.i;
                            flow.getClass();
                            evl.v(tabsConfigurations.getHeaderButtonsTopMargin().getToPx$blazesdk_release(), flow);
                        }
                        sylVar3.setupCloseButton(n4mVar4);
                        sylVar3.setupSearchButton(n4mVar4);
                        ImageView imageView = udmVar3.h;
                        imageView.getClass();
                        BlazeMomentsPlayerStyle playerStyle3 = sylVar3.getPlayerStyle();
                        ctl.setPlayerButtonUi$default(imageView, (playerStyle3 != null || (buttons = playerStyle3.getButtons()) == null) ? null : buttons.getMute(), false, n4mVar4.b, null, 10, null);
                        Boolean bool = (Boolean) ((sqm) sylVar3.getViewModel()).H.d();
                        sylVar3.F(bool != null ? bool.booleanValue() : false);
                        udmVar3.h.setOnClickListener(new oyl(sylVar3, i3));
                        mpmVar3 = sylVar3.t;
                        if (mpmVar3 != null && (recyclerView = mpmVar3.d) != null) {
                            recyclerView.post(new xtl(recyclerView, 7));
                        }
                        c1m.saveMediaViewingRecord$blazesdk_release$default(sylVar3.getViewModel(), null, 1, null);
                        return Unit.a;
                    }
                    udm udmVar4 = o2dVar.u;
                    udmVar2 = o2dVar.t;
                    n4mVar3 = o2dVar.s;
                    sylVar2 = o2dVar.r;
                    y6a.M(obj);
                    udmVar = udmVar4;
                    n4mVar4 = n4mVar3;
                    mpmVar2 = sylVar2.t;
                    if (mpmVar2 != null) {
                        int currentItem2 = udmVar.j.getCurrentItem();
                        o2dVar.r = sylVar2;
                        o2dVar.s = n4mVar4;
                        o2dVar.t = udmVar2;
                        o2dVar.u = null;
                        o2dVar.x = 3;
                    }
                    sylVar3 = sylVar2;
                    c1m.handleUIIsReadyToPlay$default(sylVar3.getViewModel(), n4mVar4, false, 2, null);
                    sylVar3.l(n4mVar4);
                    sylVar3.setPlayerViewResizeMode(n4mVar4);
                    BlazeMomentsPlayerStyle playerStyle22 = sylVar3.getPlayerStyle();
                    if (playerStyle22 == null) {
                    }
                    BlazePlayerDisplayMode blazePlayerDisplayMode2 = BlazePlayerDisplayMode.RESIZE_ASPECT_FILL_CENTER_CROP;
                    if (playerDisplayMode != blazePlayerDisplayMode2) {
                    }
                    Context context2 = sylVar3.getContext();
                    if (context2 == null) {
                    }
                    if (z) {
                    }
                    hrlVar = sylVar3.u;
                    if (hrlVar == null) {
                    }
                    sylVar3.setLayoutForPlayerMode(blazePlayerDisplayMode2);
                    udmVar3 = sylVar3.q;
                    playerStyle = sylVar3.getPlayerStyle();
                    if (playerStyle != null) {
                        Flow flow2 = udmVar3.i;
                        flow2.getClass();
                        evl.v(tabsConfigurations.getHeaderButtonsTopMargin().getToPx$blazesdk_release(), flow2);
                    }
                    sylVar3.setupCloseButton(n4mVar4);
                    sylVar3.setupSearchButton(n4mVar4);
                    ImageView imageView2 = udmVar3.h;
                    imageView2.getClass();
                    BlazeMomentsPlayerStyle playerStyle32 = sylVar3.getPlayerStyle();
                    ctl.setPlayerButtonUi$default(imageView2, (playerStyle32 != null || (buttons = playerStyle32.getButtons()) == null) ? null : buttons.getMute(), false, n4mVar4.b, null, 10, null);
                    Boolean bool2 = (Boolean) ((sqm) sylVar3.getViewModel()).H.d();
                    sylVar3.F(bool2 != null ? bool2.booleanValue() : false);
                    udmVar3.h.setOnClickListener(new oyl(sylVar3, i3));
                    mpmVar3 = sylVar3.t;
                    if (mpmVar3 != null) {
                        recyclerView.post(new xtl(recyclerView, 7));
                    }
                    c1m.saveMediaViewingRecord$blazesdk_release$default(sylVar3.getViewModel(), null, 1, null);
                    return Unit.a;
                }
                udm udmVar5 = o2dVar.u;
                udmVar2 = o2dVar.t;
                n4mVar3 = o2dVar.s;
                syl sylVar5 = o2dVar.r;
                y6a.M(obj);
                udmVar = udmVar5;
                sylVar4 = sylVar5;
                mpmVar = sylVar4.t;
                if (mpmVar != null) {
                    int currentItem3 = udmVar.j.getCurrentItem();
                    o2dVar.r = sylVar4;
                    o2dVar.s = n4mVar3;
                    o2dVar.t = udmVar2;
                    o2dVar.u = udmVar;
                    o2dVar.x = 2;
                }
                sylVar2 = sylVar4;
                n4mVar4 = n4mVar3;
                mpmVar2 = sylVar2.t;
                if (mpmVar2 != null) {
                }
                sylVar3 = sylVar2;
                c1m.handleUIIsReadyToPlay$default(sylVar3.getViewModel(), n4mVar4, false, 2, null);
                sylVar3.l(n4mVar4);
                sylVar3.setPlayerViewResizeMode(n4mVar4);
                BlazeMomentsPlayerStyle playerStyle222 = sylVar3.getPlayerStyle();
                if (playerStyle222 == null) {
                }
                BlazePlayerDisplayMode blazePlayerDisplayMode22 = BlazePlayerDisplayMode.RESIZE_ASPECT_FILL_CENTER_CROP;
                if (playerDisplayMode != blazePlayerDisplayMode22) {
                }
                Context context22 = sylVar3.getContext();
                if (context22 == null) {
                }
                if (z) {
                }
                hrlVar = sylVar3.u;
                if (hrlVar == null) {
                }
                sylVar3.setLayoutForPlayerMode(blazePlayerDisplayMode22);
                udmVar3 = sylVar3.q;
                playerStyle = sylVar3.getPlayerStyle();
                if (playerStyle != null) {
                }
                sylVar3.setupCloseButton(n4mVar4);
                sylVar3.setupSearchButton(n4mVar4);
                ImageView imageView22 = udmVar3.h;
                imageView22.getClass();
                BlazeMomentsPlayerStyle playerStyle322 = sylVar3.getPlayerStyle();
                ctl.setPlayerButtonUi$default(imageView22, (playerStyle322 != null || (buttons = playerStyle322.getButtons()) == null) ? null : buttons.getMute(), false, n4mVar4.b, null, 10, null);
                Boolean bool22 = (Boolean) ((sqm) sylVar3.getViewModel()).H.d();
                sylVar3.F(bool22 != null ? bool22.booleanValue() : false);
                udmVar3.h.setOnClickListener(new oyl(sylVar3, i3));
                mpmVar3 = sylVar3.t;
                if (mpmVar3 != null) {
                }
                c1m.saveMediaViewingRecord$blazesdk_release$default(sylVar3.getViewModel(), null, 1, null);
                return Unit.a;
            }
        }
        o2dVar = new o2d(sylVar4, sq3Var);
        Object obj2 = o2dVar.v;
        lu3 lu3Var2 = lu3.a;
        i = o2dVar.x;
        int i32 = 1;
        if (i != 0) {
        }
        mpmVar = sylVar4.t;
        if (mpmVar != null) {
        }
        sylVar2 = sylVar4;
        n4mVar4 = n4mVar3;
        mpmVar2 = sylVar2.t;
        if (mpmVar2 != null) {
        }
        sylVar3 = sylVar2;
        c1m.handleUIIsReadyToPlay$default(sylVar3.getViewModel(), n4mVar4, false, 2, null);
        sylVar3.l(n4mVar4);
        sylVar3.setPlayerViewResizeMode(n4mVar4);
        BlazeMomentsPlayerStyle playerStyle2222 = sylVar3.getPlayerStyle();
        if (playerStyle2222 == null) {
        }
        BlazePlayerDisplayMode blazePlayerDisplayMode222 = BlazePlayerDisplayMode.RESIZE_ASPECT_FILL_CENTER_CROP;
        if (playerDisplayMode != blazePlayerDisplayMode222) {
        }
        Context context222 = sylVar3.getContext();
        if (context222 == null) {
        }
        if (z) {
        }
        hrlVar = sylVar3.u;
        if (hrlVar == null) {
        }
        sylVar3.setLayoutForPlayerMode(blazePlayerDisplayMode222);
        udmVar3 = sylVar3.q;
        playerStyle = sylVar3.getPlayerStyle();
        if (playerStyle != null) {
        }
        sylVar3.setupCloseButton(n4mVar4);
        sylVar3.setupSearchButton(n4mVar4);
        ImageView imageView222 = udmVar3.h;
        imageView222.getClass();
        BlazeMomentsPlayerStyle playerStyle3222 = sylVar3.getPlayerStyle();
        ctl.setPlayerButtonUi$default(imageView222, (playerStyle3222 != null || (buttons = playerStyle3222.getButtons()) == null) ? null : buttons.getMute(), false, n4mVar4.b, null, 10, null);
        Boolean bool222 = (Boolean) ((sqm) sylVar3.getViewModel()).H.d();
        sylVar3.F(bool222 != null ? bool222.booleanValue() : false);
        udmVar3.h.setOnClickListener(new oyl(sylVar3, i32));
        mpmVar3 = sylVar3.t;
        if (mpmVar3 != null) {
        }
        c1m.saveMediaViewingRecord$blazesdk_release$default(sylVar3.getViewModel(), null, 1, null);
        return Unit.a;
    }

    private final BlazeMomentsPlayerStyle getPlayerStyle() {
        return ((sqm) getViewModel()).u0;
    }

    private final void setClosedCaptionBottomSheetResultListener(u6b u6bVar) {
        getActivity().k().i0("ClosedCaptionBottomSheetRequestKey", u6bVar, new bnk(this, 10));
    }

    private final void setLayoutForPlayerMode(BlazePlayerDisplayMode blazePlayerDisplayMode) {
        mm3 mm3Var = new mm3();
        udm udmVar = this.q;
        ConstraintLayout constraintLayout = udmVar.a;
        mm3Var.e(constraintLayout);
        View view = udmVar.k;
        mm3Var.c(view.getId());
        int i = blazePlayerDisplayMode == null ? -1 : rqm.a[blazePlayerDisplayMode.ordinal()];
        if (i == -1 || i == 1) {
            mm3Var.o(view.getId(), "9:16");
            mm3Var.s(view.getId());
            mm3Var.f(view.getId(), 3, udmVar.c.getId(), 3);
            mm3Var.f(view.getId(), 6, constraintLayout.getId(), 6);
            mm3Var.f(view.getId(), 7, constraintLayout.getId(), 7);
            mm3Var.f(view.getId(), 4, udmVar.b.getId(), 4);
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
            if (!(gimVar instanceof gim.b) && !(gimVar instanceof gim.e) && !(gimVar instanceof gim.d) && !(gimVar instanceof gim.c)) {
                zzl.b();
                return;
            }
            i = 4;
        }
        playerView.setResizeMode(i);
    }

    private final void setupCloseButton(n4m n4mVar) {
        BlazeMomentsPlayerButtonsStyle buttons;
        BlazeMomentsPlayerButtonsStyle buttons2;
        BlazeMomentsPlayerButtonStyle exit;
        BlazeMomentsPlayerStyle playerStyle = getPlayerStyle();
        mol molVar = (playerStyle == null || (buttons2 = playerStyle.getButtons()) == null || (exit = buttons2.getExit()) == null || !exit.isVisible()) ? mol.GONE : mol.HIDE;
        udm udmVar = this.q;
        ImageView imageView = udmVar.e;
        imageView.getClass();
        BlazeMomentsPlayerStyle playerStyle2 = getPlayerStyle();
        ctl.c(imageView, (playerStyle2 == null || (buttons = playerStyle2.getButtons()) == null) ? null : buttons.getExit(), n4mVar.n, n4mVar.b, molVar);
        udmVar.e.setOnClickListener(new oyl(this, 0));
    }

    private final void setupSearchButton(n4m n4mVar) {
        BlazeMomentsPlayerButtonsStyle buttons;
        ImageView imageView = this.q.g;
        imageView.getClass();
        BlazeMomentsPlayerStyle playerStyle = getPlayerStyle();
        ctl.setPlayerButtonUi$default(imageView, (playerStyle == null || (buttons = playerStyle.getButtons()) == null) ? null : buttons.getSearch(), false, n4mVar.b, null, 10, null);
        imageView.setOnClickListener(new oyl(this, 2));
    }

    private final void setupViewModel(Bundle bundle) {
        b bVar = this.p;
        try {
            n(bVar.b, sqm.class);
            A();
            apm c = c(bundle);
            E(c);
            w();
            if (bundle != null && !((sqm) getViewModel()).J()) {
                j(H.APP_CLOSE);
                return;
            }
            boolean z = bVar.k;
            udm udmVar = this.q;
            if (!z) {
                ConstraintLayout constraintLayout = udmVar.a;
                constraintLayout.getClass();
                lz.s(constraintLayout);
            }
            ConstraintLayout constraintLayout2 = udmVar.a;
            constraintLayout2.getClass();
            D(constraintLayout2);
            ((sqm) getViewModel()).l = c;
            setOnShareChooserDismissed(new pyl(this, 0));
            o(new dnb(this, null));
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            throw th;
        }
    }

    public final void C(int i) {
        udm udmVar = this.q;
        try {
            int currentItem = udmVar.j.getCurrentItem() + i;
            mpm mpmVar = this.t;
            int itemCount = mpmVar != null ? mpmVar.getItemCount() : 0;
            if (currentItem < 0 || currentItem >= itemCount) {
                return;
            }
            udmVar.j.setCurrentItem(currentItem);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void D(View view) {
        Activity activity;
        BlazeMomentsPlayerStyle playerStyle = getPlayerStyle();
        if (playerStyle == null) {
            return;
        }
        hrl hrlVar = new hrl(getActivity(), view, playerStyle, this.p.k);
        this.u = hrlVar;
        WeakReference weakReference = hrlVar.b;
        if (((Activity) weakReference.get()) != null && ((View) hrlVar.c.get()) != null && (activity = (Activity) weakReference.get()) != null && !cnb.i(activity)) {
            hrlVar.a.getPlayerDisplayMode();
            BlazePlayerDisplayMode blazePlayerDisplayMode = BlazePlayerDisplayMode.FIXED_RATIO_9_16;
        }
        hrl hrlVar2 = this.u;
        if (hrlVar2 != null) {
            Activity activity2 = (Activity) hrlVar2.b.get();
            if (activity2 != null && !cnb.i(activity2)) {
                hrlVar2.a.getPlayerDisplayMode();
                BlazePlayerDisplayMode blazePlayerDisplayMode2 = BlazePlayerDisplayMode.FIXED_RATIO_9_16;
            }
            u4a u4aVar = hrlVar2.d;
            u4aVar.getClass();
            udm udmVar = this.q;
            udmVar.c.setGuidelineBegin(u4aVar.b);
            udmVar.b.setGuidelineEnd(u4aVar.d);
            Unit unit = Unit.a;
        }
    }

    public final void E(apm apmVar) {
        if (apmVar == null) {
            sqm sqmVar = (sqm) getViewModel();
            b bVar = this.p;
            BlazeCachingLevel blazeCachingLevel = bVar.j;
            if (blazeCachingLevel != null) {
                sqmVar.t0 = blazeCachingLevel;
            } else {
                sqmVar.getClass();
            }
            sqm sqmVar2 = (sqm) getViewModel();
            String str = bVar.b;
            sqmVar2.getClass();
            str.getClass();
            sqmVar2.f = str;
            sqm sqmVar3 = (sqm) getViewModel();
            String str2 = bVar.c;
            sqmVar3.getClass();
            str2.getClass();
            sqmVar3.i = str2;
            ((sqm) getViewModel()).r0 = bVar.f;
            ((sqm) getViewModel()).n0 = bVar.h;
            ((sqm) getViewModel()).m0 = 0;
            ((sqm) getViewModel()).l0 = bVar.i;
            ((sqm) getViewModel()).u0 = bVar.a;
            ((sqm) getViewModel()).k = bVar.d;
            ((sqm) getViewModel()).U = bVar.l;
            ((sqm) getViewModel()).j = bVar.m;
            ((sqm) getViewModel()).o0 = bVar.k;
            ((sqm) getViewModel()).y0 = bVar.n;
        }
    }

    public final void F(boolean z) {
        BlazeMomentsPlayerButtonsStyle buttons;
        BlazeMomentsPlayerButtonStyle mute;
        ImageView imageView = this.q.h;
        imageView.setSelected(!z);
        BlazeMomentsPlayerStyle playerStyle = getPlayerStyle();
        ctl.b(imageView, (playerStyle == null || (buttons = playerStyle.getButtons()) == null || (mute = buttons.getMute()) == null) ? null : mute.getCustomImage());
    }

    public final void G() {
        udm udmVar = this.q;
        try {
            cbm cbmVar = cbm.a;
            Context context = getContext();
            context.getClass();
            setPlayerRendererBridge(btl.create$default(cbmVar, context, null, 2, null));
            mpm mpmVar = new mpm(this, getPlayerStyle(), this.u, getViewScope(), getLifecycleOwner());
            this.t = mpmVar;
            ViewPager2 viewPager2 = udmVar.j;
            ViewPager2 viewPager22 = udmVar.j;
            viewPager2.setAdapter(mpmVar);
            viewPager22.getClass();
            viewPager22.getClass();
            viewPager22.setVisibility(4);
            viewPager22.setOffscreenPageLimit(1);
            viewPager22.a(this.A);
            viewPager22.setPageTransformer(new yhk());
            if (this.p.k) {
                return;
            }
            hpl hplVar = new hpl(this);
            ViewPager2 viewPager23 = udmVar.j;
            viewPager23.getClass();
            RecyclerView o = evl.o(viewPager23);
            if (o != null) {
                mqm.a(o, snm.VERTICAL, 60, emm.AFTER_USER_LIFTS_FINGER, hplVar);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final boolean H() {
        sqm sqmVar = (sqm) getViewModel();
        Integer t = tz9.t(sqmVar.t, sqmVar.D());
        return t != null && t.intValue() == this.q.j.getCurrentItem();
    }

    public final void I() {
        Function0 function0;
        b bVar = this.p;
        try {
            BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = bVar.a;
            boolean z = bVar.k;
            a aVar = new a(blazeMomentsPlayerStyle != null ? blazeMomentsPlayerStyle.getFirstTimeSlide() : null);
            if (!z) {
                Context context = getContext();
                arl.c(getActivity(), context != null && (context.getResources().getConfiguration().uiMode & 48) == 32);
            }
            if (z && (function0 = this.r) != null) {
                function0.invoke();
            }
            jxl jxlVar = aVar.a;
            udm udmVar = this.q;
            if (jxlVar != null) {
                udmVar.a.setBackgroundColor(getContext().getColor(jxlVar.getBackgroundColorResId()));
            }
            ConstraintLayout constraintLayout = udmVar.a;
            FirstTimeSlideCustomView firstTimeSlideCustomView = udmVar.f;
            Context context2 = constraintLayout.getContext();
            context2.getClass();
            setLayoutForPlayerMode(cnb.i(context2) ? BlazePlayerDisplayMode.FIXED_RATIO_9_16 : BlazePlayerDisplayMode.RESIZE_ASPECT_FILL_CENTER_CROP);
            firstTimeSlideCustomView.f(aVar);
            firstTimeSlideCustomView.setVisibility(0);
            firstTimeSlideCustomView.setOnFirstTimeSlideCtaClicked(new ndk(this, 16));
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.ful
    public final void f(u6b u6bVar) {
        this.B = false;
        this.u = null;
    }

    @Nullable
    public final Function0<Unit> getOnFirstTimeSlideDismissed() {
        return this.s;
    }

    @Nullable
    public final Function0<Unit> getOnFirstTimeSlideStarted() {
        return this.r;
    }

    @Override // defpackage.ful
    public final void j(H h) {
        h.getClass();
        if (t()) {
            sqm sqmVar = (sqm) getViewModel();
            sqmVar.getClass();
            h.getClass();
            try {
                n4m D = sqmVar.D();
                if (D != null) {
                    x5m.safeViewModelScopeIO$default(sqmVar, null, new ynm(sqmVar, D, (Pair) sqmVar.o.b, null), 1, null);
                }
                ysm.e(sqmVar, EventNavigationDirection.CLOSE);
                ysm.g(sqmVar, h);
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
        if (this.p.k) {
            x();
        } else {
            getActivity().finish();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o(new n59(this, null));
    }

    @Override // defpackage.ful
    public final void q(u6b u6bVar) {
        d();
        sqm sqmVar = (sqm) getViewModel();
        if (sqmVar.f0) {
            return;
        }
        sqmVar.j0 = false;
        sqmVar.B(false);
    }

    @Override // defpackage.ful
    public final void s(u6b u6bVar) {
        u6bVar.getClass();
        super.s(u6bVar);
        sqm sqmVar = (sqm) getViewModel();
        sqmVar.j0 = true;
        sqmVar.M = false;
        sqmVar.B(true);
    }

    public final void setOnFirstTimeSlideDismissed(@Nullable Function0<Unit> function0) {
        this.s = function0;
    }

    public final void setOnFirstTimeSlideStarted(@Nullable Function0<Unit> function0) {
        this.r = function0;
    }

    @Override // defpackage.ful
    public final void v() {
        try {
            sqm sqmVar = (sqm) getViewModel();
            Context context = getContext();
            sqmVar.f0(context != null && cnb.f(context) == 0);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.ful
    public final BlazeContentExtraInfo y() {
        sqm sqmVar = (sqm) getViewModel();
        sqm sqmVar2 = (sqm) getViewModel();
        return sqmVar.U(tz9.t(sqmVar2.t, sqmVar2.D()));
    }

    public /* synthetic */ syl(Context context, b bVar, Bundle bundle, u6b u6bVar, ttk ttkVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, bVar, (i & 4) != 0 ? null : bundle, u6bVar, ttkVar);
    }
}
