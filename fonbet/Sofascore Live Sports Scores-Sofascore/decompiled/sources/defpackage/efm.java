package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.app.NotificationCompat;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.u;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.ads.custom_native.a;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.PlaybackActionMethod;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsStory;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.shared.models.ui_shared.f;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.blaze.blazesdk.features.stories.players.ui.progressbar.StoriesPlayerProgressBar;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.BlazeTextCase;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerButtonStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerChipStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerCtaIconStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerCtaStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerCustomActionButton;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerLastUpdateTextStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerProgressBarStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerTitleTextStyle;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;
import defpackage.n4m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class efm extends u {
    public static boolean j;
    public final vsm b;
    public final url c;
    public xlm d;
    public BlazeStoryPlayerStyle e;
    public n4m f;
    public boolean g;
    public final m0m h;
    public xyl i;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        j = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public efm(@NotNull vsm vsmVar, @NotNull url urlVar) {
        super(r0);
        vsmVar.getClass();
        urlVar.getClass();
        ConstraintLayout constraintLayout = vsmVar.a;
        this.b = vsmVar;
        this.c = urlVar;
        Context applicationContext = constraintLayout.getContext().getApplicationContext();
        applicationContext.getClass();
        m0m m0mVar = new m0m(applicationContext, null, 0, 6, null);
        m0mVar.setId(View.generateViewId());
        this.h = m0mVar;
        ImageView imageView = vsmVar.p;
        imageView.setOnClickListener(new zem(this, 3));
        ImageView imageView2 = vsmVar.x;
        imageView2.setOnClickListener(new zem(this, 4));
        final int i = 0;
        vsmVar.j.addView(m0mVar, new tl3(0, 0));
        imageView.setHapticFeedbackEnabled(false);
        imageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: afm
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i) {
                    case 0:
                        boolean z = efm.j;
                        break;
                    case 1:
                        boolean z2 = efm.j;
                        break;
                    default:
                        boolean z3 = efm.j;
                        break;
                }
                return true;
            }
        });
        imageView2.setHapticFeedbackEnabled(false);
        final int i2 = 1;
        imageView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: afm
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i2) {
                    case 0:
                        boolean z = efm.j;
                        break;
                    case 1:
                        boolean z2 = efm.j;
                        break;
                    default:
                        boolean z3 = efm.j;
                        break;
                }
                return true;
            }
        });
        BlazeTextWithIconButton blazeTextWithIconButton = vsmVar.r;
        blazeTextWithIconButton.setHapticFeedbackEnabled(false);
        final int i3 = 2;
        blazeTextWithIconButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: afm
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                switch (i3) {
                    case 0:
                        boolean z = efm.j;
                        break;
                    case 1:
                        boolean z2 = efm.j;
                        break;
                    default:
                        boolean z3 = efm.j;
                        break;
                }
                return true;
            }
        });
    }

    public static final void l(efm efmVar, nsl nslVar) {
        float floatValue;
        float floatValue2;
        vsm vsmVar = efmVar.b;
        m0m m0mVar = efmVar.h;
        mm3 mm3Var = new mm3();
        ConstraintLayout constraintLayout = vsmVar.j;
        ConstraintLayout constraintLayout2 = vsmVar.j;
        Guideline guideline = vsmVar.f;
        Guideline guideline2 = vsmVar.g;
        Guideline guideline3 = vsmVar.h;
        Guideline guideline4 = vsmVar.i;
        mm3Var.e(constraintLayout);
        h7m h7mVar = nslVar.b;
        o0m o0mVar = nslVar.a;
        if (h7mVar.c != null) {
            floatValue = r8.getToPx$blazesdk_release() / constraintLayout2.getWidth();
        } else {
            Float f = h7mVar.a;
            if (f == null) {
                return;
            } else {
                floatValue = f.floatValue();
            }
        }
        h7m h7mVar2 = nslVar.b;
        if (h7mVar2.d != null) {
            floatValue2 = r8.getToPx$blazesdk_release() / constraintLayout2.getHeight();
        } else {
            Float f2 = h7mVar2.b;
            if (f2 == null) {
                return;
            } else {
                floatValue2 = f2.floatValue();
            }
        }
        mm3Var.f(m0mVar.getId(), 6, guideline4.getId(), 7);
        mm3Var.f(m0mVar.getId(), 7, guideline3.getId(), 6);
        switch (ghm.a[o0mVar.a.ordinal()]) {
            case 1:
                mm3Var.q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, guideline4.getId());
                mm3Var.q(floatValue, guideline3.getId());
                break;
            case 2:
                mm3Var.q(1.0f - floatValue, guideline4.getId());
                mm3Var.q(1.0f, guideline3.getId());
                break;
            case 3:
                float f3 = (1.0f - floatValue) / 2.0f;
                mm3Var.q(f3, guideline4.getId());
                mm3Var.q(floatValue + f3, guideline3.getId());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            default:
                zzl.b();
                return;
        }
        mm3Var.f(m0mVar.getId(), 3, guideline2.getId(), 3);
        mm3Var.f(m0mVar.getId(), 4, guideline.getId(), 4);
        switch (ghm.b[o0mVar.d.ordinal()]) {
            case 1:
                mm3Var.q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, guideline2.getId());
                mm3Var.q(floatValue2, guideline.getId());
                break;
            case 2:
                mm3Var.q(1.0f - floatValue2, guideline2.getId());
                mm3Var.q(1.0f, guideline.getId());
                break;
            case 3:
                float f4 = (1.0f - floatValue2) / 2.0f;
                mm3Var.q(f4, guideline2.getId());
                mm3Var.q(floatValue2 + f4, guideline.getId());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            default:
                zzl.b();
                return;
        }
        mm3Var.a(constraintLayout2);
    }

    public static boolean u(n4m n4mVar) {
        i iVar;
        f fVar;
        n4mVar.getClass();
        Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
        return ((application$blazesdk_release != null ? f6a.f(application$blazesdk_release) : false) || (iVar = n4mVar.i) == null || (fVar = iVar.f) == null || !fVar.b) ? false : true;
    }

    public final void a(long j2, long j3) {
        i iVar;
        f fVar;
        Integer num;
        vsm vsmVar = this.b;
        StoriesPlayerProgressBar storiesPlayerProgressBar = vsmVar.w;
        n4m n4mVar = this.f;
        int intValue = (n4mVar == null || (num = n4mVar.j) == null) ? 0 : num.intValue();
        try {
            storiesPlayerProgressBar.b = intValue;
            ((vrl) storiesPlayerProgressBar.a.get(intValue)).f(j2, j3);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        n4m n4mVar2 = this.f;
        if (n4mVar2 == null || (iVar = n4mVar2.i) == null || !nq8.s(iVar) || (fVar = iVar.f) == null) {
            return;
        }
        s6m s6mVar = fVar.a;
        int i = s6mVar == null ? -1 : ghm.d[s6mVar.ordinal()];
        if (i != -1) {
            if (i != 1) {
                zzl.b();
                return;
            }
            if (j2 < 1000 || this.g) {
                if (j2 < 1000) {
                    this.g = false;
                    return;
                }
                return;
            }
            this.g = true;
            BlazeTextWithIconButton blazeTextWithIconButton = vsmVar.r;
            blazeTextWithIconButton.getClass();
            evl.animateGrowth$default(blazeTextWithIconButton, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 7, null);
            if (u(n4mVar2)) {
                ImageView imageView = vsmVar.s;
                imageView.getClass();
                evl.animateGrowthAndTranslation$default(imageView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
            }
        }
    }

    public final void b(final url urlVar, n4m n4mVar) {
        vsm vsmVar = this.b;
        View view = vsmVar.y;
        view.getClass();
        ConstraintLayout constraintLayout = vsmVar.a;
        Context context = constraintLayout.getContext();
        context.getClass();
        float f = cnb.i(context) ? 0.5f : 0.3f;
        Context context2 = constraintLayout.getContext();
        context2.getClass();
        float f2 = cnb.i(context2) ? 0.5f : 0.7f;
        final int i = 2;
        Function0 function0 = new Function0() { // from class: yem
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                url urlVar2 = urlVar;
                switch (i2) {
                    case 0:
                        boolean z = efm.j;
                        obm obmVar = (obm) urlVar2;
                        obmVar.q.e.setUserInputEnabled(true);
                        ilm ilmVar = (ilm) obmVar.getViewModel();
                        xvl xvlVar = ilmVar.z0;
                        xvl xvlVar2 = xvl.IDLE;
                        if (xvlVar == xvlVar2 && ilmVar.y.d() == null) {
                            fdi fdiVar = ilmVar.q0;
                            Boolean bool = Boolean.TRUE;
                            fdiVar.getClass();
                            fdiVar.m(null, bool);
                            ilmVar.B(true);
                        }
                        xvlVar2.getClass();
                        ilmVar.z0 = xvlVar2;
                        break;
                    case 1:
                        boolean z2 = efm.j;
                        obm obmVar2 = (obm) urlVar2;
                        obmVar2.q.e.setUserInputEnabled(true);
                        ilm ilmVar2 = (ilm) obmVar2.getViewModel();
                        xvl xvlVar3 = ilmVar2.z0;
                        xvl xvlVar4 = xvl.IDLE;
                        if (xvlVar3 == xvlVar4) {
                            ilmVar2.B(true);
                        }
                        fdi fdiVar2 = ilmVar2.q0;
                        Boolean bool2 = Boolean.TRUE;
                        fdiVar2.getClass();
                        fdiVar2.m(null, bool2);
                        xvlVar4.getClass();
                        ilmVar2.z0 = xvlVar4;
                        break;
                    case 2:
                        boolean z3 = efm.j;
                        obm obmVar3 = (obm) urlVar2;
                        ViewPager2 viewPager2 = obmVar3.q.e;
                        viewPager2.getClass();
                        if (evl.n(viewPager2)) {
                            ilm ilmVar3 = (ilm) obmVar3.getViewModel();
                            ilmVar3.getClass();
                            cxl cxlVar = cxl.PREV;
                            n4m D = ilmVar3.D();
                            if (D == null || D.l) {
                                ilmVar3.a0(cxlVar);
                            }
                        }
                        break;
                    case 3:
                        boolean z4 = efm.j;
                        obm obmVar4 = (obm) urlVar2;
                        ViewPager2 viewPager22 = obmVar4.q.e;
                        viewPager22.getClass();
                        if (evl.n(viewPager22)) {
                            ilm ilmVar4 = (ilm) obmVar4.getViewModel();
                            ilmVar4.getClass();
                            cxl cxlVar2 = cxl.NEXT;
                            n4m D2 = ilmVar4.D();
                            if (D2 == null || D2.l) {
                                ilmVar4.a0(cxlVar2);
                            }
                        }
                        break;
                    case 4:
                        boolean z5 = efm.j;
                        obm obmVar5 = (obm) urlVar2;
                        ViewPager2 viewPager23 = obmVar5.q.e;
                        viewPager23.getClass();
                        if (evl.n(viewPager23)) {
                            ilm ilmVar5 = (ilm) obmVar5.getViewModel();
                            xvl xvlVar5 = ilmVar5.z0;
                            a aVar = ilmVar5.x0;
                            if (xvlVar5 == xvl.IDLE && ilmVar5.y.d() == null) {
                                fdi fdiVar3 = ilmVar5.q0;
                                Boolean bool3 = Boolean.FALSE;
                                fdiVar3.getClass();
                                fdiVar3.m(null, bool3);
                                ilmVar5.B(false);
                                n4m D3 = ilmVar5.D();
                                gim gimVar = D3 != null ? D3.b : null;
                                if (gimVar instanceof gim.d) {
                                    gim.d dVar = (gim.d) gimVar;
                                    PlaybackActionMethod playbackActionMethod = PlaybackActionMethod.PRESS;
                                    AnalyticsPropsStory createStoryPlayerProps$default = jom.createStoryPlayerProps$default(ilmVar5, dVar, null, null, null, null, playbackActionMethod, false, null, null, null, 990, null);
                                    EventActionName eventActionName = EventActionName.PLAYBACK_PAUSE;
                                    jom.e(ilmVar5, eventActionName, createStoryPlayerProps$default);
                                    if (dVar.b.l != null) {
                                        jom.d(ilmVar5, eventActionName, jom.a(ilmVar5, dVar, playbackActionMethod));
                                    }
                                } else if (gimVar instanceof gim.a) {
                                    aVar.b();
                                    jom.c(ilmVar5, EventActionName.AD_PLAYBACK_PAUSE, jom.createStoryPlayerAdProps$default(ilmVar5, (gim.a) gimVar, null, PlaybackActionMethod.PRESS, false, false, null, 58, null));
                                }
                                n4m D4 = ilmVar5.D();
                                gim gimVar2 = D4 != null ? D4.b : null;
                                if (gimVar2 instanceof gim.d) {
                                    gim.d dVar2 = (gim.d) gimVar2;
                                    PlaybackActionMethod playbackActionMethod2 = PlaybackActionMethod.RELEASE;
                                    AnalyticsPropsStory createStoryPlayerProps$default2 = jom.createStoryPlayerProps$default(ilmVar5, dVar2, null, null, null, null, playbackActionMethod2, false, null, null, null, 990, null);
                                    EventActionName eventActionName2 = EventActionName.PLAYBACK_PLAY;
                                    jom.e(ilmVar5, eventActionName2, createStoryPlayerProps$default2);
                                    if (dVar2.b.l != null) {
                                        jom.d(ilmVar5, eventActionName2, jom.a(ilmVar5, dVar2, playbackActionMethod2));
                                    }
                                } else if (gimVar2 instanceof gim.a) {
                                    aVar.f();
                                    jom.c(ilmVar5, EventActionName.AD_PLAYBACK_PLAY, jom.createStoryPlayerAdProps$default(ilmVar5, (gim.a) gimVar2, null, PlaybackActionMethod.RELEASE, false, false, null, 58, null));
                                }
                            }
                        }
                        break;
                    default:
                        boolean z6 = efm.j;
                        ((ilm) ((obm) urlVar2).getViewModel()).B(false);
                        break;
                }
                return Unit.a;
            }
        };
        final int i2 = 3;
        Function0 function02 = new Function0() { // from class: yem
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                url urlVar2 = urlVar;
                switch (i22) {
                    case 0:
                        boolean z = efm.j;
                        obm obmVar = (obm) urlVar2;
                        obmVar.q.e.setUserInputEnabled(true);
                        ilm ilmVar = (ilm) obmVar.getViewModel();
                        xvl xvlVar = ilmVar.z0;
                        xvl xvlVar2 = xvl.IDLE;
                        if (xvlVar == xvlVar2 && ilmVar.y.d() == null) {
                            fdi fdiVar = ilmVar.q0;
                            Boolean bool = Boolean.TRUE;
                            fdiVar.getClass();
                            fdiVar.m(null, bool);
                            ilmVar.B(true);
                        }
                        xvlVar2.getClass();
                        ilmVar.z0 = xvlVar2;
                        break;
                    case 1:
                        boolean z2 = efm.j;
                        obm obmVar2 = (obm) urlVar2;
                        obmVar2.q.e.setUserInputEnabled(true);
                        ilm ilmVar2 = (ilm) obmVar2.getViewModel();
                        xvl xvlVar3 = ilmVar2.z0;
                        xvl xvlVar4 = xvl.IDLE;
                        if (xvlVar3 == xvlVar4) {
                            ilmVar2.B(true);
                        }
                        fdi fdiVar2 = ilmVar2.q0;
                        Boolean bool2 = Boolean.TRUE;
                        fdiVar2.getClass();
                        fdiVar2.m(null, bool2);
                        xvlVar4.getClass();
                        ilmVar2.z0 = xvlVar4;
                        break;
                    case 2:
                        boolean z3 = efm.j;
                        obm obmVar3 = (obm) urlVar2;
                        ViewPager2 viewPager2 = obmVar3.q.e;
                        viewPager2.getClass();
                        if (evl.n(viewPager2)) {
                            ilm ilmVar3 = (ilm) obmVar3.getViewModel();
                            ilmVar3.getClass();
                            cxl cxlVar = cxl.PREV;
                            n4m D = ilmVar3.D();
                            if (D == null || D.l) {
                                ilmVar3.a0(cxlVar);
                            }
                        }
                        break;
                    case 3:
                        boolean z4 = efm.j;
                        obm obmVar4 = (obm) urlVar2;
                        ViewPager2 viewPager22 = obmVar4.q.e;
                        viewPager22.getClass();
                        if (evl.n(viewPager22)) {
                            ilm ilmVar4 = (ilm) obmVar4.getViewModel();
                            ilmVar4.getClass();
                            cxl cxlVar2 = cxl.NEXT;
                            n4m D2 = ilmVar4.D();
                            if (D2 == null || D2.l) {
                                ilmVar4.a0(cxlVar2);
                            }
                        }
                        break;
                    case 4:
                        boolean z5 = efm.j;
                        obm obmVar5 = (obm) urlVar2;
                        ViewPager2 viewPager23 = obmVar5.q.e;
                        viewPager23.getClass();
                        if (evl.n(viewPager23)) {
                            ilm ilmVar5 = (ilm) obmVar5.getViewModel();
                            xvl xvlVar5 = ilmVar5.z0;
                            a aVar = ilmVar5.x0;
                            if (xvlVar5 == xvl.IDLE && ilmVar5.y.d() == null) {
                                fdi fdiVar3 = ilmVar5.q0;
                                Boolean bool3 = Boolean.FALSE;
                                fdiVar3.getClass();
                                fdiVar3.m(null, bool3);
                                ilmVar5.B(false);
                                n4m D3 = ilmVar5.D();
                                gim gimVar = D3 != null ? D3.b : null;
                                if (gimVar instanceof gim.d) {
                                    gim.d dVar = (gim.d) gimVar;
                                    PlaybackActionMethod playbackActionMethod = PlaybackActionMethod.PRESS;
                                    AnalyticsPropsStory createStoryPlayerProps$default = jom.createStoryPlayerProps$default(ilmVar5, dVar, null, null, null, null, playbackActionMethod, false, null, null, null, 990, null);
                                    EventActionName eventActionName = EventActionName.PLAYBACK_PAUSE;
                                    jom.e(ilmVar5, eventActionName, createStoryPlayerProps$default);
                                    if (dVar.b.l != null) {
                                        jom.d(ilmVar5, eventActionName, jom.a(ilmVar5, dVar, playbackActionMethod));
                                    }
                                } else if (gimVar instanceof gim.a) {
                                    aVar.b();
                                    jom.c(ilmVar5, EventActionName.AD_PLAYBACK_PAUSE, jom.createStoryPlayerAdProps$default(ilmVar5, (gim.a) gimVar, null, PlaybackActionMethod.PRESS, false, false, null, 58, null));
                                }
                                n4m D4 = ilmVar5.D();
                                gim gimVar2 = D4 != null ? D4.b : null;
                                if (gimVar2 instanceof gim.d) {
                                    gim.d dVar2 = (gim.d) gimVar2;
                                    PlaybackActionMethod playbackActionMethod2 = PlaybackActionMethod.RELEASE;
                                    AnalyticsPropsStory createStoryPlayerProps$default2 = jom.createStoryPlayerProps$default(ilmVar5, dVar2, null, null, null, null, playbackActionMethod2, false, null, null, null, 990, null);
                                    EventActionName eventActionName2 = EventActionName.PLAYBACK_PLAY;
                                    jom.e(ilmVar5, eventActionName2, createStoryPlayerProps$default2);
                                    if (dVar2.b.l != null) {
                                        jom.d(ilmVar5, eventActionName2, jom.a(ilmVar5, dVar2, playbackActionMethod2));
                                    }
                                } else if (gimVar2 instanceof gim.a) {
                                    aVar.f();
                                    jom.c(ilmVar5, EventActionName.AD_PLAYBACK_PLAY, jom.createStoryPlayerAdProps$default(ilmVar5, (gim.a) gimVar2, null, PlaybackActionMethod.RELEASE, false, false, null, 58, null));
                                }
                            }
                        }
                        break;
                    default:
                        boolean z6 = efm.j;
                        ((ilm) ((obm) urlVar2).getViewModel()).B(false);
                        break;
                }
                return Unit.a;
            }
        };
        final int i3 = 4;
        final int i4 = 5;
        final int i5 = 0;
        final int i6 = 1;
        evl.setTouchGestureListenerWithStartAndEnd$default(view, 50, 0, 0, f, f2, false, function0, null, function02, new Function0() { // from class: yem
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                url urlVar2 = urlVar;
                switch (i22) {
                    case 0:
                        boolean z = efm.j;
                        obm obmVar = (obm) urlVar2;
                        obmVar.q.e.setUserInputEnabled(true);
                        ilm ilmVar = (ilm) obmVar.getViewModel();
                        xvl xvlVar = ilmVar.z0;
                        xvl xvlVar2 = xvl.IDLE;
                        if (xvlVar == xvlVar2 && ilmVar.y.d() == null) {
                            fdi fdiVar = ilmVar.q0;
                            Boolean bool = Boolean.TRUE;
                            fdiVar.getClass();
                            fdiVar.m(null, bool);
                            ilmVar.B(true);
                        }
                        xvlVar2.getClass();
                        ilmVar.z0 = xvlVar2;
                        break;
                    case 1:
                        boolean z2 = efm.j;
                        obm obmVar2 = (obm) urlVar2;
                        obmVar2.q.e.setUserInputEnabled(true);
                        ilm ilmVar2 = (ilm) obmVar2.getViewModel();
                        xvl xvlVar3 = ilmVar2.z0;
                        xvl xvlVar4 = xvl.IDLE;
                        if (xvlVar3 == xvlVar4) {
                            ilmVar2.B(true);
                        }
                        fdi fdiVar2 = ilmVar2.q0;
                        Boolean bool2 = Boolean.TRUE;
                        fdiVar2.getClass();
                        fdiVar2.m(null, bool2);
                        xvlVar4.getClass();
                        ilmVar2.z0 = xvlVar4;
                        break;
                    case 2:
                        boolean z3 = efm.j;
                        obm obmVar3 = (obm) urlVar2;
                        ViewPager2 viewPager2 = obmVar3.q.e;
                        viewPager2.getClass();
                        if (evl.n(viewPager2)) {
                            ilm ilmVar3 = (ilm) obmVar3.getViewModel();
                            ilmVar3.getClass();
                            cxl cxlVar = cxl.PREV;
                            n4m D = ilmVar3.D();
                            if (D == null || D.l) {
                                ilmVar3.a0(cxlVar);
                            }
                        }
                        break;
                    case 3:
                        boolean z4 = efm.j;
                        obm obmVar4 = (obm) urlVar2;
                        ViewPager2 viewPager22 = obmVar4.q.e;
                        viewPager22.getClass();
                        if (evl.n(viewPager22)) {
                            ilm ilmVar4 = (ilm) obmVar4.getViewModel();
                            ilmVar4.getClass();
                            cxl cxlVar2 = cxl.NEXT;
                            n4m D2 = ilmVar4.D();
                            if (D2 == null || D2.l) {
                                ilmVar4.a0(cxlVar2);
                            }
                        }
                        break;
                    case 4:
                        boolean z5 = efm.j;
                        obm obmVar5 = (obm) urlVar2;
                        ViewPager2 viewPager23 = obmVar5.q.e;
                        viewPager23.getClass();
                        if (evl.n(viewPager23)) {
                            ilm ilmVar5 = (ilm) obmVar5.getViewModel();
                            xvl xvlVar5 = ilmVar5.z0;
                            a aVar = ilmVar5.x0;
                            if (xvlVar5 == xvl.IDLE && ilmVar5.y.d() == null) {
                                fdi fdiVar3 = ilmVar5.q0;
                                Boolean bool3 = Boolean.FALSE;
                                fdiVar3.getClass();
                                fdiVar3.m(null, bool3);
                                ilmVar5.B(false);
                                n4m D3 = ilmVar5.D();
                                gim gimVar = D3 != null ? D3.b : null;
                                if (gimVar instanceof gim.d) {
                                    gim.d dVar = (gim.d) gimVar;
                                    PlaybackActionMethod playbackActionMethod = PlaybackActionMethod.PRESS;
                                    AnalyticsPropsStory createStoryPlayerProps$default = jom.createStoryPlayerProps$default(ilmVar5, dVar, null, null, null, null, playbackActionMethod, false, null, null, null, 990, null);
                                    EventActionName eventActionName = EventActionName.PLAYBACK_PAUSE;
                                    jom.e(ilmVar5, eventActionName, createStoryPlayerProps$default);
                                    if (dVar.b.l != null) {
                                        jom.d(ilmVar5, eventActionName, jom.a(ilmVar5, dVar, playbackActionMethod));
                                    }
                                } else if (gimVar instanceof gim.a) {
                                    aVar.b();
                                    jom.c(ilmVar5, EventActionName.AD_PLAYBACK_PAUSE, jom.createStoryPlayerAdProps$default(ilmVar5, (gim.a) gimVar, null, PlaybackActionMethod.PRESS, false, false, null, 58, null));
                                }
                                n4m D4 = ilmVar5.D();
                                gim gimVar2 = D4 != null ? D4.b : null;
                                if (gimVar2 instanceof gim.d) {
                                    gim.d dVar2 = (gim.d) gimVar2;
                                    PlaybackActionMethod playbackActionMethod2 = PlaybackActionMethod.RELEASE;
                                    AnalyticsPropsStory createStoryPlayerProps$default2 = jom.createStoryPlayerProps$default(ilmVar5, dVar2, null, null, null, null, playbackActionMethod2, false, null, null, null, 990, null);
                                    EventActionName eventActionName2 = EventActionName.PLAYBACK_PLAY;
                                    jom.e(ilmVar5, eventActionName2, createStoryPlayerProps$default2);
                                    if (dVar2.b.l != null) {
                                        jom.d(ilmVar5, eventActionName2, jom.a(ilmVar5, dVar2, playbackActionMethod2));
                                    }
                                } else if (gimVar2 instanceof gim.a) {
                                    aVar.f();
                                    jom.c(ilmVar5, EventActionName.AD_PLAYBACK_PLAY, jom.createStoryPlayerAdProps$default(ilmVar5, (gim.a) gimVar2, null, PlaybackActionMethod.RELEASE, false, false, null, 58, null));
                                }
                            }
                        }
                        break;
                    default:
                        boolean z6 = efm.j;
                        ((ilm) ((obm) urlVar2).getViewModel()).B(false);
                        break;
                }
                return Unit.a;
            }
        }, null, new cfm(this, n4mVar, urlVar), null, null, null, null, new Function0() { // from class: yem
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                url urlVar2 = urlVar;
                switch (i22) {
                    case 0:
                        boolean z = efm.j;
                        obm obmVar = (obm) urlVar2;
                        obmVar.q.e.setUserInputEnabled(true);
                        ilm ilmVar = (ilm) obmVar.getViewModel();
                        xvl xvlVar = ilmVar.z0;
                        xvl xvlVar2 = xvl.IDLE;
                        if (xvlVar == xvlVar2 && ilmVar.y.d() == null) {
                            fdi fdiVar = ilmVar.q0;
                            Boolean bool = Boolean.TRUE;
                            fdiVar.getClass();
                            fdiVar.m(null, bool);
                            ilmVar.B(true);
                        }
                        xvlVar2.getClass();
                        ilmVar.z0 = xvlVar2;
                        break;
                    case 1:
                        boolean z2 = efm.j;
                        obm obmVar2 = (obm) urlVar2;
                        obmVar2.q.e.setUserInputEnabled(true);
                        ilm ilmVar2 = (ilm) obmVar2.getViewModel();
                        xvl xvlVar3 = ilmVar2.z0;
                        xvl xvlVar4 = xvl.IDLE;
                        if (xvlVar3 == xvlVar4) {
                            ilmVar2.B(true);
                        }
                        fdi fdiVar2 = ilmVar2.q0;
                        Boolean bool2 = Boolean.TRUE;
                        fdiVar2.getClass();
                        fdiVar2.m(null, bool2);
                        xvlVar4.getClass();
                        ilmVar2.z0 = xvlVar4;
                        break;
                    case 2:
                        boolean z3 = efm.j;
                        obm obmVar3 = (obm) urlVar2;
                        ViewPager2 viewPager2 = obmVar3.q.e;
                        viewPager2.getClass();
                        if (evl.n(viewPager2)) {
                            ilm ilmVar3 = (ilm) obmVar3.getViewModel();
                            ilmVar3.getClass();
                            cxl cxlVar = cxl.PREV;
                            n4m D = ilmVar3.D();
                            if (D == null || D.l) {
                                ilmVar3.a0(cxlVar);
                            }
                        }
                        break;
                    case 3:
                        boolean z4 = efm.j;
                        obm obmVar4 = (obm) urlVar2;
                        ViewPager2 viewPager22 = obmVar4.q.e;
                        viewPager22.getClass();
                        if (evl.n(viewPager22)) {
                            ilm ilmVar4 = (ilm) obmVar4.getViewModel();
                            ilmVar4.getClass();
                            cxl cxlVar2 = cxl.NEXT;
                            n4m D2 = ilmVar4.D();
                            if (D2 == null || D2.l) {
                                ilmVar4.a0(cxlVar2);
                            }
                        }
                        break;
                    case 4:
                        boolean z5 = efm.j;
                        obm obmVar5 = (obm) urlVar2;
                        ViewPager2 viewPager23 = obmVar5.q.e;
                        viewPager23.getClass();
                        if (evl.n(viewPager23)) {
                            ilm ilmVar5 = (ilm) obmVar5.getViewModel();
                            xvl xvlVar5 = ilmVar5.z0;
                            a aVar = ilmVar5.x0;
                            if (xvlVar5 == xvl.IDLE && ilmVar5.y.d() == null) {
                                fdi fdiVar3 = ilmVar5.q0;
                                Boolean bool3 = Boolean.FALSE;
                                fdiVar3.getClass();
                                fdiVar3.m(null, bool3);
                                ilmVar5.B(false);
                                n4m D3 = ilmVar5.D();
                                gim gimVar = D3 != null ? D3.b : null;
                                if (gimVar instanceof gim.d) {
                                    gim.d dVar = (gim.d) gimVar;
                                    PlaybackActionMethod playbackActionMethod = PlaybackActionMethod.PRESS;
                                    AnalyticsPropsStory createStoryPlayerProps$default = jom.createStoryPlayerProps$default(ilmVar5, dVar, null, null, null, null, playbackActionMethod, false, null, null, null, 990, null);
                                    EventActionName eventActionName = EventActionName.PLAYBACK_PAUSE;
                                    jom.e(ilmVar5, eventActionName, createStoryPlayerProps$default);
                                    if (dVar.b.l != null) {
                                        jom.d(ilmVar5, eventActionName, jom.a(ilmVar5, dVar, playbackActionMethod));
                                    }
                                } else if (gimVar instanceof gim.a) {
                                    aVar.b();
                                    jom.c(ilmVar5, EventActionName.AD_PLAYBACK_PAUSE, jom.createStoryPlayerAdProps$default(ilmVar5, (gim.a) gimVar, null, PlaybackActionMethod.PRESS, false, false, null, 58, null));
                                }
                                n4m D4 = ilmVar5.D();
                                gim gimVar2 = D4 != null ? D4.b : null;
                                if (gimVar2 instanceof gim.d) {
                                    gim.d dVar2 = (gim.d) gimVar2;
                                    PlaybackActionMethod playbackActionMethod2 = PlaybackActionMethod.RELEASE;
                                    AnalyticsPropsStory createStoryPlayerProps$default2 = jom.createStoryPlayerProps$default(ilmVar5, dVar2, null, null, null, null, playbackActionMethod2, false, null, null, null, 990, null);
                                    EventActionName eventActionName2 = EventActionName.PLAYBACK_PLAY;
                                    jom.e(ilmVar5, eventActionName2, createStoryPlayerProps$default2);
                                    if (dVar2.b.l != null) {
                                        jom.d(ilmVar5, eventActionName2, jom.a(ilmVar5, dVar2, playbackActionMethod2));
                                    }
                                } else if (gimVar2 instanceof gim.a) {
                                    aVar.f();
                                    jom.c(ilmVar5, EventActionName.AD_PLAYBACK_PLAY, jom.createStoryPlayerAdProps$default(ilmVar5, (gim.a) gimVar2, null, PlaybackActionMethod.RELEASE, false, false, null, 58, null));
                                }
                            }
                        }
                        break;
                    default:
                        boolean z6 = efm.j;
                        ((ilm) ((obm) urlVar2).getViewModel()).B(false);
                        break;
                }
                return Unit.a;
            }
        }, new Function0() { // from class: yem
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                url urlVar2 = urlVar;
                switch (i22) {
                    case 0:
                        boolean z = efm.j;
                        obm obmVar = (obm) urlVar2;
                        obmVar.q.e.setUserInputEnabled(true);
                        ilm ilmVar = (ilm) obmVar.getViewModel();
                        xvl xvlVar = ilmVar.z0;
                        xvl xvlVar2 = xvl.IDLE;
                        if (xvlVar == xvlVar2 && ilmVar.y.d() == null) {
                            fdi fdiVar = ilmVar.q0;
                            Boolean bool = Boolean.TRUE;
                            fdiVar.getClass();
                            fdiVar.m(null, bool);
                            ilmVar.B(true);
                        }
                        xvlVar2.getClass();
                        ilmVar.z0 = xvlVar2;
                        break;
                    case 1:
                        boolean z2 = efm.j;
                        obm obmVar2 = (obm) urlVar2;
                        obmVar2.q.e.setUserInputEnabled(true);
                        ilm ilmVar2 = (ilm) obmVar2.getViewModel();
                        xvl xvlVar3 = ilmVar2.z0;
                        xvl xvlVar4 = xvl.IDLE;
                        if (xvlVar3 == xvlVar4) {
                            ilmVar2.B(true);
                        }
                        fdi fdiVar2 = ilmVar2.q0;
                        Boolean bool2 = Boolean.TRUE;
                        fdiVar2.getClass();
                        fdiVar2.m(null, bool2);
                        xvlVar4.getClass();
                        ilmVar2.z0 = xvlVar4;
                        break;
                    case 2:
                        boolean z3 = efm.j;
                        obm obmVar3 = (obm) urlVar2;
                        ViewPager2 viewPager2 = obmVar3.q.e;
                        viewPager2.getClass();
                        if (evl.n(viewPager2)) {
                            ilm ilmVar3 = (ilm) obmVar3.getViewModel();
                            ilmVar3.getClass();
                            cxl cxlVar = cxl.PREV;
                            n4m D = ilmVar3.D();
                            if (D == null || D.l) {
                                ilmVar3.a0(cxlVar);
                            }
                        }
                        break;
                    case 3:
                        boolean z4 = efm.j;
                        obm obmVar4 = (obm) urlVar2;
                        ViewPager2 viewPager22 = obmVar4.q.e;
                        viewPager22.getClass();
                        if (evl.n(viewPager22)) {
                            ilm ilmVar4 = (ilm) obmVar4.getViewModel();
                            ilmVar4.getClass();
                            cxl cxlVar2 = cxl.NEXT;
                            n4m D2 = ilmVar4.D();
                            if (D2 == null || D2.l) {
                                ilmVar4.a0(cxlVar2);
                            }
                        }
                        break;
                    case 4:
                        boolean z5 = efm.j;
                        obm obmVar5 = (obm) urlVar2;
                        ViewPager2 viewPager23 = obmVar5.q.e;
                        viewPager23.getClass();
                        if (evl.n(viewPager23)) {
                            ilm ilmVar5 = (ilm) obmVar5.getViewModel();
                            xvl xvlVar5 = ilmVar5.z0;
                            a aVar = ilmVar5.x0;
                            if (xvlVar5 == xvl.IDLE && ilmVar5.y.d() == null) {
                                fdi fdiVar3 = ilmVar5.q0;
                                Boolean bool3 = Boolean.FALSE;
                                fdiVar3.getClass();
                                fdiVar3.m(null, bool3);
                                ilmVar5.B(false);
                                n4m D3 = ilmVar5.D();
                                gim gimVar = D3 != null ? D3.b : null;
                                if (gimVar instanceof gim.d) {
                                    gim.d dVar = (gim.d) gimVar;
                                    PlaybackActionMethod playbackActionMethod = PlaybackActionMethod.PRESS;
                                    AnalyticsPropsStory createStoryPlayerProps$default = jom.createStoryPlayerProps$default(ilmVar5, dVar, null, null, null, null, playbackActionMethod, false, null, null, null, 990, null);
                                    EventActionName eventActionName = EventActionName.PLAYBACK_PAUSE;
                                    jom.e(ilmVar5, eventActionName, createStoryPlayerProps$default);
                                    if (dVar.b.l != null) {
                                        jom.d(ilmVar5, eventActionName, jom.a(ilmVar5, dVar, playbackActionMethod));
                                    }
                                } else if (gimVar instanceof gim.a) {
                                    aVar.b();
                                    jom.c(ilmVar5, EventActionName.AD_PLAYBACK_PAUSE, jom.createStoryPlayerAdProps$default(ilmVar5, (gim.a) gimVar, null, PlaybackActionMethod.PRESS, false, false, null, 58, null));
                                }
                                n4m D4 = ilmVar5.D();
                                gim gimVar2 = D4 != null ? D4.b : null;
                                if (gimVar2 instanceof gim.d) {
                                    gim.d dVar2 = (gim.d) gimVar2;
                                    PlaybackActionMethod playbackActionMethod2 = PlaybackActionMethod.RELEASE;
                                    AnalyticsPropsStory createStoryPlayerProps$default2 = jom.createStoryPlayerProps$default(ilmVar5, dVar2, null, null, null, null, playbackActionMethod2, false, null, null, null, 990, null);
                                    EventActionName eventActionName2 = EventActionName.PLAYBACK_PLAY;
                                    jom.e(ilmVar5, eventActionName2, createStoryPlayerProps$default2);
                                    if (dVar2.b.l != null) {
                                        jom.d(ilmVar5, eventActionName2, jom.a(ilmVar5, dVar2, playbackActionMethod2));
                                    }
                                } else if (gimVar2 instanceof gim.a) {
                                    aVar.f();
                                    jom.c(ilmVar5, EventActionName.AD_PLAYBACK_PLAY, jom.createStoryPlayerAdProps$default(ilmVar5, (gim.a) gimVar2, null, PlaybackActionMethod.RELEASE, false, false, null, 58, null));
                                }
                            }
                        }
                        break;
                    default:
                        boolean z6 = efm.j;
                        ((ilm) ((obm) urlVar2).getViewModel()).B(false);
                        break;
                }
                return Unit.a;
            }
        }, new Function0() { // from class: yem
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                url urlVar2 = urlVar;
                switch (i22) {
                    case 0:
                        boolean z = efm.j;
                        obm obmVar = (obm) urlVar2;
                        obmVar.q.e.setUserInputEnabled(true);
                        ilm ilmVar = (ilm) obmVar.getViewModel();
                        xvl xvlVar = ilmVar.z0;
                        xvl xvlVar2 = xvl.IDLE;
                        if (xvlVar == xvlVar2 && ilmVar.y.d() == null) {
                            fdi fdiVar = ilmVar.q0;
                            Boolean bool = Boolean.TRUE;
                            fdiVar.getClass();
                            fdiVar.m(null, bool);
                            ilmVar.B(true);
                        }
                        xvlVar2.getClass();
                        ilmVar.z0 = xvlVar2;
                        break;
                    case 1:
                        boolean z2 = efm.j;
                        obm obmVar2 = (obm) urlVar2;
                        obmVar2.q.e.setUserInputEnabled(true);
                        ilm ilmVar2 = (ilm) obmVar2.getViewModel();
                        xvl xvlVar3 = ilmVar2.z0;
                        xvl xvlVar4 = xvl.IDLE;
                        if (xvlVar3 == xvlVar4) {
                            ilmVar2.B(true);
                        }
                        fdi fdiVar2 = ilmVar2.q0;
                        Boolean bool2 = Boolean.TRUE;
                        fdiVar2.getClass();
                        fdiVar2.m(null, bool2);
                        xvlVar4.getClass();
                        ilmVar2.z0 = xvlVar4;
                        break;
                    case 2:
                        boolean z3 = efm.j;
                        obm obmVar3 = (obm) urlVar2;
                        ViewPager2 viewPager2 = obmVar3.q.e;
                        viewPager2.getClass();
                        if (evl.n(viewPager2)) {
                            ilm ilmVar3 = (ilm) obmVar3.getViewModel();
                            ilmVar3.getClass();
                            cxl cxlVar = cxl.PREV;
                            n4m D = ilmVar3.D();
                            if (D == null || D.l) {
                                ilmVar3.a0(cxlVar);
                            }
                        }
                        break;
                    case 3:
                        boolean z4 = efm.j;
                        obm obmVar4 = (obm) urlVar2;
                        ViewPager2 viewPager22 = obmVar4.q.e;
                        viewPager22.getClass();
                        if (evl.n(viewPager22)) {
                            ilm ilmVar4 = (ilm) obmVar4.getViewModel();
                            ilmVar4.getClass();
                            cxl cxlVar2 = cxl.NEXT;
                            n4m D2 = ilmVar4.D();
                            if (D2 == null || D2.l) {
                                ilmVar4.a0(cxlVar2);
                            }
                        }
                        break;
                    case 4:
                        boolean z5 = efm.j;
                        obm obmVar5 = (obm) urlVar2;
                        ViewPager2 viewPager23 = obmVar5.q.e;
                        viewPager23.getClass();
                        if (evl.n(viewPager23)) {
                            ilm ilmVar5 = (ilm) obmVar5.getViewModel();
                            xvl xvlVar5 = ilmVar5.z0;
                            a aVar = ilmVar5.x0;
                            if (xvlVar5 == xvl.IDLE && ilmVar5.y.d() == null) {
                                fdi fdiVar3 = ilmVar5.q0;
                                Boolean bool3 = Boolean.FALSE;
                                fdiVar3.getClass();
                                fdiVar3.m(null, bool3);
                                ilmVar5.B(false);
                                n4m D3 = ilmVar5.D();
                                gim gimVar = D3 != null ? D3.b : null;
                                if (gimVar instanceof gim.d) {
                                    gim.d dVar = (gim.d) gimVar;
                                    PlaybackActionMethod playbackActionMethod = PlaybackActionMethod.PRESS;
                                    AnalyticsPropsStory createStoryPlayerProps$default = jom.createStoryPlayerProps$default(ilmVar5, dVar, null, null, null, null, playbackActionMethod, false, null, null, null, 990, null);
                                    EventActionName eventActionName = EventActionName.PLAYBACK_PAUSE;
                                    jom.e(ilmVar5, eventActionName, createStoryPlayerProps$default);
                                    if (dVar.b.l != null) {
                                        jom.d(ilmVar5, eventActionName, jom.a(ilmVar5, dVar, playbackActionMethod));
                                    }
                                } else if (gimVar instanceof gim.a) {
                                    aVar.b();
                                    jom.c(ilmVar5, EventActionName.AD_PLAYBACK_PAUSE, jom.createStoryPlayerAdProps$default(ilmVar5, (gim.a) gimVar, null, PlaybackActionMethod.PRESS, false, false, null, 58, null));
                                }
                                n4m D4 = ilmVar5.D();
                                gim gimVar2 = D4 != null ? D4.b : null;
                                if (gimVar2 instanceof gim.d) {
                                    gim.d dVar2 = (gim.d) gimVar2;
                                    PlaybackActionMethod playbackActionMethod2 = PlaybackActionMethod.RELEASE;
                                    AnalyticsPropsStory createStoryPlayerProps$default2 = jom.createStoryPlayerProps$default(ilmVar5, dVar2, null, null, null, null, playbackActionMethod2, false, null, null, null, 990, null);
                                    EventActionName eventActionName2 = EventActionName.PLAYBACK_PLAY;
                                    jom.e(ilmVar5, eventActionName2, createStoryPlayerProps$default2);
                                    if (dVar2.b.l != null) {
                                        jom.d(ilmVar5, eventActionName2, jom.a(ilmVar5, dVar2, playbackActionMethod2));
                                    }
                                } else if (gimVar2 instanceof gim.a) {
                                    aVar.f();
                                    jom.c(ilmVar5, EventActionName.AD_PLAYBACK_PLAY, jom.createStoryPlayerAdProps$default(ilmVar5, (gim.a) gimVar2, null, PlaybackActionMethod.RELEASE, false, false, null, 58, null));
                                }
                            }
                        }
                        break;
                    default:
                        boolean z6 = efm.j;
                        ((ilm) ((obm) urlVar2).getViewModel()).B(false);
                        break;
                }
                return Unit.a;
            }
        }, 62598, null);
    }

    public final void c(nsl nslVar) {
        int id;
        int id2;
        mm3 mm3Var = new mm3();
        vsm vsmVar = this.b;
        ConstraintLayout constraintLayout = vsmVar.a;
        FrameLayout frameLayout = vsmVar.m;
        ConstraintLayout constraintLayout2 = vsmVar.j;
        mm3Var.e(constraintLayout);
        o0m o0mVar = nslVar.a;
        int ordinal = o0mVar.c.ordinal();
        if (ordinal == 0) {
            id = frameLayout.getId();
        } else {
            if (ordinal != 1) {
                zzl.b();
                return;
            }
            id = constraintLayout.getId();
        }
        int i = id;
        int toPx$blazesdk_release = o0mVar.b.getToPx$blazesdk_release();
        mm3Var.g(constraintLayout2.getId(), 6, i, 6, toPx$blazesdk_release);
        mm3Var.g(constraintLayout2.getId(), 7, i, 7, toPx$blazesdk_release);
        int ordinal2 = o0mVar.f.ordinal();
        if (ordinal2 == 0) {
            id2 = frameLayout.getId();
        } else {
            if (ordinal2 != 1) {
                zzl.b();
                return;
            }
            id2 = constraintLayout.getId();
        }
        int i2 = id2;
        int toPx$blazesdk_release2 = o0mVar.e.getToPx$blazesdk_release();
        mm3Var.g(constraintLayout2.getId(), 3, i2, 3, toPx$blazesdk_release2);
        mm3Var.g(constraintLayout2.getId(), 4, i2, 4, toPx$blazesdk_release2);
        mm3Var.a(constraintLayout);
        constraintLayout2.getClass();
        if (!constraintLayout2.isLaidOut() || constraintLayout2.isLayoutRequested()) {
            constraintLayout2.addOnLayoutChangeListener(new djm(this, nslVar));
        } else {
            l(this, nslVar);
        }
    }

    public final void d(w0m w0mVar) {
        BlazeStoryPlayerButtonsStyle buttons;
        BlazeStoryPlayerButtonStyle mute;
        w0mVar.getClass();
        vsm vsmVar = this.b;
        ImageView imageView = vsmVar.x;
        FrameLayout frameLayout = vsmVar.m;
        imageView.setSelected(!j);
        ImageView imageView2 = vsmVar.x;
        imageView2.getClass();
        BlazeStoryPlayerStyle blazeStoryPlayerStyle = this.e;
        ctl.b(imageView2, (blazeStoryPlayerStyle == null || (buttons = blazeStoryPlayerStyle.getButtons()) == null || (mute = buttons.getMute()) == null) ? null : mute.getCustomImage());
        qdm qdmVar = (qdm) w0mVar;
        PlayerView playerView = qdmVar.a;
        PlayerView playerView2 = qdmVar.a;
        if (Intrinsics.c(frameLayout, playerView.getParent())) {
            return;
        }
        ViewGroup r = evl.r(vsmVar.a.getId(), playerView2);
        vsm a2 = r != null ? vsm.a(r) : null;
        if (a2 != null) {
            FrameLayout frameLayout2 = a2.m;
            frameLayout2.getClass();
            lz.y(frameLayout2, false);
            ImageView imageView3 = a2.n;
            imageView3.getClass();
            imageView3.getClass();
            imageView3.setVisibility(0);
            frameLayout2.removeView(playerView2);
        }
        n4m n4mVar = this.f;
        if ((n4mVar != null ? n4mVar.c : null) instanceof n4m.a.b) {
            frameLayout.addView(playerView2);
        }
    }

    public final void e(InteractionModel interactionModel) {
        mm3 mm3Var = new mm3();
        vsm vsmVar = this.b;
        mm3Var.e(vsmVar.j);
        m0m m0mVar = this.h;
        int id = m0mVar.getId();
        Guideline guideline = vsmVar.l;
        mm3Var.f(id, 6, guideline.getId(), 6);
        int id2 = m0mVar.getId();
        Guideline guideline2 = vsmVar.k;
        mm3Var.f(id2, 3, guideline2.getId(), 3);
        ConstraintLayout constraintLayout = vsmVar.j;
        mm3Var.a(constraintLayout);
        mm3 mm3Var2 = new mm3();
        ConstraintLayout constraintLayout2 = vsmVar.a;
        mm3Var2.e(constraintLayout2);
        mm3Var2.c(constraintLayout.getId());
        int id3 = constraintLayout.getId();
        FrameLayout frameLayout = vsmVar.m;
        mm3Var2.f(id3, 6, frameLayout.getId(), 6);
        mm3Var2.f(constraintLayout.getId(), 3, frameLayout.getId(), 3);
        mm3Var2.f(constraintLayout.getId(), 7, frameLayout.getId(), 7);
        mm3Var2.f(constraintLayout.getId(), 4, frameLayout.getId(), 4);
        mm3Var2.a(constraintLayout2);
        mm3 mm3Var3 = new mm3();
        mm3Var3.e(constraintLayout);
        mm3Var3.q(interactionModel.getStartOffset(), guideline.getId());
        mm3Var3.q(interactionModel.getTopOffset(), guideline2.getId());
        mm3Var3.j(m0mVar.getId()).d.d0 = interactionModel.getRelativeWidth();
        mm3Var3.j(m0mVar.getId()).d.e0 = interactionModel.getRelativeHeight();
        mm3Var3.a(constraintLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.View] */
    public final void f(BlazeStoryPlayerButtonsStyle blazeStoryPlayerButtonsStyle) {
        ArrayList arrayList = new ArrayList();
        Iterator it = blazeStoryPlayerButtonsStyle.getTopStackOrderMergedWithMissingCustomActionButtons$blazesdk_release().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ImageView imageView = null;
            vsm vsmVar = this.b;
            if (!hasNext) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ?? r10 = (View) it2.next();
                    if (imageView != null) {
                        evl.x(imageView.getId(), r10);
                    } else {
                        evl.x(vsmVar.w.getId(), r10);
                        LinearLayout linearLayout = vsmVar.B;
                        linearLayout.getClass();
                        int id = r10.getId();
                        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                        if (layoutParams == null) {
                            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            return;
                        } else {
                            tl3 tl3Var = (tl3) layoutParams;
                            tl3Var.u = id;
                            linearLayout.setLayoutParams(tl3Var);
                        }
                    }
                    evl.p(vsmVar.t.getId(), r10);
                    imageView = r10;
                }
                if (imageView == null) {
                    LinearLayout linearLayout2 = vsmVar.B;
                    linearLayout2.getClass();
                    evl.p(vsmVar.w.getId(), linearLayout2);
                    return;
                }
                return;
            }
            BlazeStoryPlayerButtonsStyle.TopStackButtons topStackButtons = (BlazeStoryPlayerButtonsStyle.TopStackButtons) it.next();
            if (Intrinsics.c(topStackButtons, BlazeStoryPlayerButtonsStyle.TopStackButtons.Exit.INSTANCE)) {
                imageView = vsmVar.p;
            } else if (Intrinsics.c(topStackButtons, BlazeStoryPlayerButtonsStyle.TopStackButtons.Captions.INSTANCE)) {
                imageView = vsmVar.q;
            } else if (Intrinsics.c(topStackButtons, BlazeStoryPlayerButtonsStyle.TopStackButtons.Mute.INSTANCE)) {
                imageView = vsmVar.x;
            } else if (Intrinsics.c(topStackButtons, BlazeStoryPlayerButtonsStyle.TopStackButtons.Share.INSTANCE)) {
                imageView = vsmVar.z;
            } else {
                if (!(topStackButtons instanceof BlazeStoryPlayerButtonsStyle.TopStackButtons.Custom)) {
                    zzl.b();
                    return;
                }
                BlazeStoryPlayerButtonsStyle.TopStackButtons.Custom custom = (BlazeStoryPlayerButtonsStyle.TopStackButtons.Custom) topStackButtons;
                ?? findViewWithTag = vsmVar.t.findViewWithTag(custom.getId());
                if (findViewWithTag == 0) {
                    List<BlazeStoryPlayerCustomActionButton> topStackCustomActionButtons = blazeStoryPlayerButtonsStyle.getTopStackCustomActionButtons();
                    Context context = vsmVar.a.getContext();
                    context.getClass();
                    ImageView l = wca.l(context, custom.getId(), topStackCustomActionButtons, new iol(this, 10));
                    if (l != null) {
                        vsmVar.t.addView(l);
                        imageView = l;
                    }
                } else {
                    imageView = findViewWithTag;
                }
            }
            if (imageView != null) {
                arrayList.add(imageView);
            }
        }
    }

    public final void g(BlazeStoryPlayerCtaStyle blazeStoryPlayerCtaStyle, n4m n4mVar) {
        int i;
        vsm vsmVar = this.b;
        BlazeTextWithIconButton blazeTextWithIconButton = vsmVar.r;
        ImageView imageView = vsmVar.s;
        i iVar = n4mVar.i;
        final int i2 = 1;
        final int i3 = 0;
        boolean z = iVar != null && nq8.s(iVar);
        boolean a2 = n4mVar.b.a();
        if (!z || (!a2 && !blazeStoryPlayerCtaStyle.isVisible())) {
            imageView.getClass();
            imageView.setVisibility(8);
            blazeTextWithIconButton.getClass();
            blazeTextWithIconButton.setVisibility(8);
            return;
        }
        blazeTextWithIconButton.setTextSize(blazeStoryPlayerCtaStyle.getTextSize());
        BlazeTextWithIconButton.setTypefaceFromResource$default(blazeTextWithIconButton, blazeStoryPlayerCtaStyle.getFontResId(), null, null, 6, null);
        blazeTextWithIconButton.setText(iVar.b);
        blazeTextWithIconButton.setRadius(blazeStoryPlayerCtaStyle.getCornerRadius().getToPx$blazesdk_release());
        l6g.x(blazeTextWithIconButton, iVar);
        BlazeStoryPlayerCtaIconStyle icon = blazeStoryPlayerCtaStyle.getIcon();
        if (icon != null) {
            if (ghm.c[icon.getIconPositioning().ordinal()] != 1) {
                zzl.b();
                return;
            } else {
                blazeTextWithIconButton.setDrawableStart(icon.getIconResId());
                l6g.y(blazeTextWithIconButton, icon.getIconTint(), iVar);
            }
        }
        if (u(n4mVar)) {
            imageView.getClass();
            String str = iVar.d;
            str.getClass();
            try {
                Integer a3 = ipl.a(Integer.valueOf(Color.parseColor("#FFFFFF")), str);
                if (a3 != null) {
                    imageView.setColorFilter(a3.intValue(), PorterDuff.Mode.SRC_IN);
                }
            } catch (Exception unused) {
            }
            imageView.getClass();
            imageView.setVisibility(0);
        } else {
            imageView.getClass();
            imageView.setVisibility(8);
        }
        Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
        if (application$blazesdk_release != null ? f6a.f(application$blazesdk_release) : false) {
            blazeTextWithIconButton.setOnClickListener(new xem(i3, this, n4mVar, blazeTextWithIconButton));
            i = 0;
        } else {
            i = 0;
            lz.w(blazeTextWithIconButton, (r30 & 1) != 0 ? 0 : 10, (r30 & 2) == 0 ? 0 : 0, (r30 & 4) != 0 ? 1000 : 0, (r30 & 8) != 0 ? new ol8(10) : new ncj(17, this, n4mVar, blazeTextWithIconButton), (r30 & 16) != 0 ? new zl8(26) : null, (r30 & 32) != 0 ? new zl8(27) : null, (r30 & 64) != 0 ? new zl8(28) : new bfm(this, n4mVar, blazeTextWithIconButton, 3), (r30 & 128) != 0 ? new zl8(29) : null, (r30 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new nl8(24) : null, (r30 & 512) != 0 ? new xt8(0) : null, (r30 & 1024) != 0 ? new xt8(1) : null, (r30 & com.ironsource.mediationsdk.metadata.a.o) != 0 ? new xt8(2) : null, (r30 & 4096) != 0 ? new xt8(3) : new Function0(this) { // from class: dfm
                public final /* synthetic */ efm b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i4 = i3;
                    efm efmVar = this.b;
                    switch (i4) {
                        case 0:
                            obm obmVar = (obm) efmVar.c;
                            obmVar.q.e.setUserInputEnabled(true);
                            ilm ilmVar = (ilm) obmVar.getViewModel();
                            xvl xvlVar = ilmVar.z0;
                            xvl xvlVar2 = xvl.IDLE;
                            if (xvlVar == xvlVar2 && ilmVar.y.d() == null) {
                                fdi fdiVar = ilmVar.q0;
                                Boolean bool = Boolean.TRUE;
                                fdiVar.getClass();
                                fdiVar.m(null, bool);
                                ilmVar.B(true);
                            }
                            xvlVar2.getClass();
                            ilmVar.z0 = xvlVar2;
                            break;
                        default:
                            obm obmVar2 = (obm) efmVar.c;
                            obmVar2.q.e.setUserInputEnabled(true);
                            ilm ilmVar2 = (ilm) obmVar2.getViewModel();
                            xvl xvlVar3 = ilmVar2.z0;
                            xvl xvlVar4 = xvl.IDLE;
                            if (xvlVar3 == xvlVar4) {
                                ilmVar2.B(true);
                            }
                            fdi fdiVar2 = ilmVar2.q0;
                            Boolean bool2 = Boolean.TRUE;
                            fdiVar2.getClass();
                            fdiVar2.m(null, bool2);
                            xvlVar4.getClass();
                            ilmVar2.z0 = xvlVar4;
                            break;
                    }
                    return Unit.a;
                }
            }, (r30 & 8192) != 0 ? new zl8(25) : new Function0(this) { // from class: dfm
                public final /* synthetic */ efm b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i4 = i2;
                    efm efmVar = this.b;
                    switch (i4) {
                        case 0:
                            obm obmVar = (obm) efmVar.c;
                            obmVar.q.e.setUserInputEnabled(true);
                            ilm ilmVar = (ilm) obmVar.getViewModel();
                            xvl xvlVar = ilmVar.z0;
                            xvl xvlVar2 = xvl.IDLE;
                            if (xvlVar == xvlVar2 && ilmVar.y.d() == null) {
                                fdi fdiVar = ilmVar.q0;
                                Boolean bool = Boolean.TRUE;
                                fdiVar.getClass();
                                fdiVar.m(null, bool);
                                ilmVar.B(true);
                            }
                            xvlVar2.getClass();
                            ilmVar.z0 = xvlVar2;
                            break;
                        default:
                            obm obmVar2 = (obm) efmVar.c;
                            obmVar2.q.e.setUserInputEnabled(true);
                            ilm ilmVar2 = (ilm) obmVar2.getViewModel();
                            xvl xvlVar3 = ilmVar2.z0;
                            xvl xvlVar4 = xvl.IDLE;
                            if (xvlVar3 == xvlVar4) {
                                ilmVar2.B(true);
                            }
                            fdi fdiVar2 = ilmVar2.q0;
                            Boolean bool2 = Boolean.TRUE;
                            fdiVar2.getClass();
                            fdiVar2.m(null, bool2);
                            xvlVar4.getClass();
                            ilmVar2.z0 = xvlVar4;
                            break;
                    }
                    return Unit.a;
                }
            });
        }
        blazeTextWithIconButton.setVisibility(i);
    }

    public final void h(n4m n4mVar, BlazeStoryPlayerProgressBarStyle blazeStoryPlayerProgressBarStyle) {
        Integer num;
        int p = p(n4mVar);
        StoriesPlayerProgressBar storiesPlayerProgressBar = this.b.w;
        n4m n4mVar2 = this.f;
        int intValue = (n4mVar2 == null || (num = n4mVar2.j) == null) ? 0 : num.intValue();
        try {
            try {
                storiesPlayerProgressBar.removeAllViews();
                storiesPlayerProgressBar.a.clear();
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
            for (int i = 0; i < p; i++) {
                storiesPlayerProgressBar.b(blazeStoryPlayerProgressBarStyle);
                if (i < intValue) {
                    ((vrl) storiesPlayerProgressBar.a.get(i)).f(r3.a.b.getMax(), r3.a.b.getMax());
                }
                if (i < p - 1) {
                    try {
                        View view = new View(storiesPlayerProgressBar.getContext());
                        view.setLayoutParams(new LinearLayout.LayoutParams(7, -2));
                        storiesPlayerProgressBar.addView(view);
                    } catch (Throwable th2) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                    }
                }
            }
        } catch (Throwable th3) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
        }
    }

    public final void i(n4m n4mVar, BlazeStoryPlayerStyle blazeStoryPlayerStyle) {
        BlazeStoryPlayerChipStyle blazeStoryPlayerChipStyle;
        boolean z;
        BlazeTextView blazeTextView;
        BlazeTextView blazeTextView2;
        if (n4mVar.k) {
            blazeStoryPlayerChipStyle = blazeStoryPlayerStyle.getChips().getLive();
        } else {
            if (!(n4mVar.b instanceof gim.a)) {
                blazeStoryPlayerChipStyle = null;
                z = false;
                vsm vsmVar = this.b;
                ConstraintLayout constraintLayout = vsmVar.a;
                blazeTextView = vsmVar.A;
                blazeTextView2 = vsmVar.v;
                Context context = constraintLayout.getContext();
                if (z || blazeStoryPlayerChipStyle == null || !blazeStoryPlayerChipStyle.isVisible()) {
                    blazeTextView.getClass();
                    lz.z(0, blazeTextView);
                    blazeTextView2.getClass();
                    blazeTextView2.setVisibility(8);
                }
                int backgroundColor = blazeStoryPlayerChipStyle.getBackgroundColor();
                GradientDrawable b = w1l.b(0);
                b.setCornerRadii(new float[]{32.0f, 32.0f, 32.0f, 32.0f, 32.0f, 32.0f, 32.0f, 32.0f});
                b.setColor(backgroundColor);
                b.setStroke(0, 0);
                blazeTextView2.setBackground(b);
                blazeTextView2.setText(blazeStoryPlayerChipStyle.getText());
                blazeTextView2.setTextColor(blazeStoryPlayerChipStyle.getTextColor());
                blazeTextView2.setPadding(blazeStoryPlayerChipStyle.getPadding().getStart().getToPx$blazesdk_release(), blazeStoryPlayerChipStyle.getPadding().getTop().getToPx$blazesdk_release(), blazeStoryPlayerChipStyle.getPadding().getEnd().getToPx$blazesdk_release(), blazeStoryPlayerChipStyle.getPadding().getBottom().getToPx$blazesdk_release());
                blazeTextView.getClass();
                lz.z(wzb.b(context.getResources().getDimension(R.dimen.blaze_common_small_margin)), blazeTextView);
                blazeTextView2.setVisibility(0);
                return;
            }
            blazeStoryPlayerChipStyle = blazeStoryPlayerStyle.getChips().getAd();
        }
        z = true;
        vsm vsmVar2 = this.b;
        ConstraintLayout constraintLayout2 = vsmVar2.a;
        blazeTextView = vsmVar2.A;
        blazeTextView2 = vsmVar2.v;
        Context context2 = constraintLayout2.getContext();
        if (z) {
        }
        blazeTextView.getClass();
        lz.z(0, blazeTextView);
        blazeTextView2.getClass();
        blazeTextView2.setVisibility(8);
    }

    public final void j(n4m n4mVar, Function0 function0) {
        gim gimVar = n4mVar.b;
        String str = gimVar instanceof gim.d ? ((gim.d) gimVar).b.a : gimVar instanceof gim.a ? n4mVar.a : null;
        n4m n4mVar2 = this.f;
        if (Intrinsics.c(str, n4mVar2 != null ? n4mVar2.a : null)) {
            function0.invoke();
        }
    }

    public final void k(n4m n4mVar, boolean z) {
        Integer num;
        url urlVar = this.c;
        this.f = n4mVar;
        InteractionModel a2 = n4mVar.a();
        try {
            m0m m0mVar = this.h;
            m0mVar.clearAnimation();
            m0mVar.setVisibility(4);
            if (a2 != null) {
                n4m n4mVar2 = this.f;
                nsl bounds = a2.getBounds();
                if (bounds != null) {
                    c(bounds);
                } else {
                    e(a2);
                }
                this.h.b(a2.getId(), a2.getHtmlUrl(), a2.getInitData(), a2.getDesignOverrides(), a2.getUserAnswer(), new alm(this, n4mVar2, a2));
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        try {
            boolean a3 = n4mVar.b.a();
            boolean c = Intrinsics.c(n4mVar.u, Boolean.FALSE);
            int i = 0;
            vsm vsmVar = this.b;
            boolean z2 = (c || vsmVar.b.getChildCount() <= 0 || a3) ? false : true;
            FrameLayout frameLayout = vsmVar.b;
            frameLayout.getClass();
            if (z2) {
                frameLayout.setVisibility(0);
            } else {
                frameLayout.setVisibility(8);
            }
            FrameLayout frameLayout2 = vsmVar.m;
            frameLayout2.getClass();
            frameLayout2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ImageView imageView = vsmVar.n;
            imageView.getClass();
            imageView.setVisibility(0);
            String i2 = fgm.i(n4mVar);
            ImageView imageView2 = vsmVar.n;
            imageView2.getClass();
            evl.loadAndCacheImage$default(imageView2, i2, null, null, null, false, null, null, new bcl(17, this, n4mVar), null, null, null, 1918, null);
            BlazeStoryPlayerStyle blazeStoryPlayerStyle = this.e;
            if (blazeStoryPlayerStyle != null) {
                g(blazeStoryPlayerStyle.getCta(), n4mVar);
                i(n4mVar, blazeStoryPlayerStyle);
                m(vsmVar, blazeStoryPlayerStyle.getButtons(), n4mVar);
                f(blazeStoryPlayerStyle.getButtons());
            }
            r(n4mVar);
            if (z) {
                BlazeStoryPlayerStyle blazeStoryPlayerStyle2 = this.e;
                h(n4mVar, blazeStoryPlayerStyle2 != null ? blazeStoryPlayerStyle2.getProgressBar() : null);
            }
            StoriesPlayerProgressBar storiesPlayerProgressBar = vsmVar.w;
            n4m n4mVar3 = this.f;
            if (n4mVar3 != null && (num = n4mVar3.j) != null) {
                i = num.intValue();
            }
            storiesPlayerProgressBar.a(i);
            b(urlVar, n4mVar);
            ConstraintLayout constraintLayout = vsmVar.a;
            obm obmVar = (obm) urlVar;
            obmVar.getClass();
            ((ilm) obmVar.getViewModel()).getClass();
            constraintLayout.setContentDescription(ilm.f0(n4mVar, true));
            vsmVar.a.setImportantForAccessibility(1);
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
        }
    }

    public final void m(vsm vsmVar, BlazeStoryPlayerButtonsStyle blazeStoryPlayerButtonsStyle, n4m n4mVar) {
        int i = 1;
        boolean z = fgm.f(n4mVar) != null && z7m.b(BlazePlayerType.STORIES);
        ImageView imageView = vsmVar.z;
        imageView.getClass();
        ctl.setPlayerButtonUi$default(imageView, blazeStoryPlayerButtonsStyle.getShare(), z, n4mVar.b, null, 8, null);
        ImageView imageView2 = vsmVar.x;
        imageView2.getClass();
        ctl.setPlayerButtonUi$default(imageView2, blazeStoryPlayerButtonsStyle.getMute(), false, n4mVar.b, null, 10, null);
        cnl cnlVar = mol.a;
        boolean isVisible = blazeStoryPlayerButtonsStyle.getExit().isVisible();
        cnlVar.getClass();
        mol molVar = isVisible ? mol.HIDE : mol.GONE;
        ImageView imageView3 = vsmVar.p;
        imageView3.getClass();
        ctl.c(imageView3, blazeStoryPlayerButtonsStyle.getExit(), n4mVar.n, n4mVar.b, molVar);
        BlazeStoryPlayerButtonStyle captions = blazeStoryPlayerButtonsStyle.getCaptions();
        ImageView imageView4 = this.b.q;
        imageView4.getClass();
        ctl.setPlayerButtonUi$default(imageView4, captions, false, n4mVar.b, mol.GONE, 2, null);
        eqm d = fgm.d(n4mVar);
        if (d != null) {
            imageView4.setAlpha(d.d() ? 1.0f : 0.5f);
            t();
            evl.setDebouncedOnClickListener$default(imageView4, 0L, null, new bcl(18, this, d), 3, null);
        }
        ConstraintLayout constraintLayout = vsmVar.t;
        constraintLayout.getClass();
        wca.m(constraintLayout, blazeStoryPlayerButtonsStyle.getTopStackCustomActionButtons(), n4mVar, mol.HIDE);
        Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
        boolean f = application$blazesdk_release != null ? f6a.f(application$blazesdk_release) : false;
        ImageView imageView5 = vsmVar.d;
        imageView5.setOnClickListener(new zem(this, i));
        if (f) {
            imageView5.setVisibility(0);
        } else {
            imageView5.setVisibility(8);
        }
        ImageView imageView6 = vsmVar.c;
        imageView6.setOnClickListener(new zem(this, 2));
        if (f) {
            imageView6.setVisibility(0);
        } else {
            imageView6.setVisibility(8);
        }
    }

    public final void n(vsm vsmVar, BlazeStoryPlayerStyle blazeStoryPlayerStyle) {
        vsmVar.x.setSelected(!j);
        ImageView imageView = vsmVar.x;
        imageView.getClass();
        ctl.b(imageView, blazeStoryPlayerStyle.getButtons().getMute().getCustomImage());
        BlazeTextView blazeTextView = vsmVar.A;
        blazeTextView.getClass();
        BlazeStoryPlayerTitleTextStyle title = blazeStoryPlayerStyle.getTitle();
        blazeTextView.setTextSize(title.getTextSize());
        blazeTextView.setTextColor(title.getTextColor());
        izk.setTypefaceFromResource$default(blazeTextView, title.getFontResId(), null, null, 6, null);
        f(blazeStoryPlayerStyle.getButtons());
    }

    public final void o(boolean z) {
        BlazeStoryPlayerButtonsStyle buttons;
        BlazeStoryPlayerButtonStyle mute;
        j = z;
        vsm vsmVar = this.b;
        vsmVar.x.setSelected(!z);
        ImageView imageView = vsmVar.x;
        imageView.getClass();
        BlazeStoryPlayerStyle blazeStoryPlayerStyle = this.e;
        ctl.b(imageView, (blazeStoryPlayerStyle == null || (buttons = blazeStoryPlayerStyle.getButtons()) == null || (mute = buttons.getMute()) == null) ? null : mute.getCustomImage());
    }

    public final int p(n4m n4mVar) {
        List list;
        if (n4mVar.j == null) {
            return 1;
        }
        xlm xlmVar = this.d;
        int i = 0;
        if (xlmVar != null && (list = xlmVar.b) != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((n4m) it.next()).j != null && (i = i + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        return i;
    }

    public final void q() {
        mm3 mm3Var = new mm3();
        vsm vsmVar = this.b;
        mm3Var.e(vsmVar.a);
        FrameLayout frameLayout = vsmVar.m;
        mm3Var.s(frameLayout.getId());
        ImageView imageView = vsmVar.n;
        mm3Var.s(imageView.getId());
        ConstraintLayout constraintLayout = vsmVar.a;
        mm3Var.s(constraintLayout.getId());
        mm3Var.o(frameLayout.getId(), "9:16");
        mm3Var.o(imageView.getId(), "9:16");
        mm3Var.s(frameLayout.getId());
        mm3Var.a(constraintLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(n4m n4mVar) {
        String str;
        BlazeStoryPlayerStyle blazeStoryPlayerStyle;
        String str2;
        BlazeStoryPlayerLastUpdateTextStyle lastUpdate;
        BlazeStoryPlayerTitleTextStyle title;
        String str3;
        BlazeStoryPlayerLastUpdateTextStyle lastUpdate2;
        String str4 = n4mVar.g;
        BlazeStoryPlayerStyle blazeStoryPlayerStyle2 = this.e;
        BlazeTextCase textCase = (blazeStoryPlayerStyle2 == null || (lastUpdate2 = blazeStoryPlayerStyle2.getLastUpdate()) == null) ? null : lastUpdate2.getTextCase();
        int i = textCase == null ? -1 : ghm.e[textCase.ordinal()];
        if (i != -1 && i != 1) {
            if (i != 2) {
                zzl.b();
                return;
            } else if (str4 != null) {
                str4 = str4.toUpperCase(Locale.ROOT);
                str4.getClass();
            } else {
                str4 = null;
            }
        }
        BlazeStoryPlayerStyle blazeStoryPlayerStyle3 = this.e;
        if (blazeStoryPlayerStyle3 != null && (title = blazeStoryPlayerStyle3.getTitle()) != null) {
            if (!title.isVisible()) {
                title = null;
            }
            if (title != null && (str3 = n4mVar.d) != null) {
                str = str3;
                blazeStoryPlayerStyle = this.e;
                if (blazeStoryPlayerStyle != null && (lastUpdate = blazeStoryPlayerStyle.getLastUpdate()) != null) {
                    if ((lastUpdate.isVisible() ? lastUpdate : null) != null && str4 != null) {
                        str2 = str4;
                        BlazeTextView blazeTextView = this.b.A;
                        blazeTextView.getClass();
                        jtd.a(blazeTextView, new vl6(blazeTextView, blazeTextView, str, str2, R.color.blaze_gray, R.dimen.blaze_common_small_text_size));
                    }
                }
                str2 = "";
                BlazeTextView blazeTextView2 = this.b.A;
                blazeTextView2.getClass();
                jtd.a(blazeTextView2, new vl6(blazeTextView2, blazeTextView2, str, str2, R.color.blaze_gray, R.dimen.blaze_common_small_text_size));
            }
        }
        str = "";
        blazeStoryPlayerStyle = this.e;
        if (blazeStoryPlayerStyle != null) {
            if ((lastUpdate.isVisible() ? lastUpdate : null) != null) {
                str2 = str4;
                BlazeTextView blazeTextView22 = this.b.A;
                blazeTextView22.getClass();
                jtd.a(blazeTextView22, new vl6(blazeTextView22, blazeTextView22, str, str2, R.color.blaze_gray, R.dimen.blaze_common_small_text_size));
            }
        }
        str2 = "";
        BlazeTextView blazeTextView222 = this.b.A;
        blazeTextView222.getClass();
        jtd.a(blazeTextView222, new vl6(blazeTextView222, blazeTextView222, str, str2, R.color.blaze_gray, R.dimen.blaze_common_small_text_size));
    }

    public final void s() {
        BlazeStoryPlayerButtonsStyle buttons;
        BlazeStoryPlayerButtonStyle captions;
        n4m n4mVar;
        eqm d;
        efm efmVar;
        vsm vsmVar = this.b;
        try {
            xyl xylVar = this.i;
            if (xylVar != null) {
                xylVar.destroy();
            }
            this.i = null;
            vsmVar.e.removeAllViews();
            BlazeStoryPlayerStyle blazeStoryPlayerStyle = this.e;
            if (blazeStoryPlayerStyle != null && (buttons = blazeStoryPlayerStyle.getButtons()) != null && (captions = buttons.getCaptions()) != null && captions.isVisible() && (n4mVar = this.f) != null && (d = fgm.d(n4mVar)) != null) {
                n4m n4mVar2 = this.f;
                Context applicationContext = vsmVar.a.getContext().getApplicationContext();
                applicationContext.getClass();
                xyl xylVar2 = new xyl(applicationContext, null, 0, 6, null);
                xylVar2.setId(View.generateViewId());
                xylVar2.setImportantForAccessibility(2);
                int id = xylVar2.getId();
                vsmVar.e.addView(xylVar2, new tl3(-1, -1));
                xylVar2.a();
                if (d.d()) {
                    efmVar = this;
                    xyl.loadAndInitialize$default(xylVar2, null, new im1(xylVar2, id, efmVar, n4mVar2, 8), 1, null);
                } else {
                    efmVar = this;
                }
                efmVar.i = xylVar2;
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void t() {
        eqm d;
        BlazeStoryPlayerButtonsStyle buttons;
        BlazeStoryPlayerButtonStyle captions;
        ImageView imageView = this.b.q;
        n4m n4mVar = this.f;
        if (n4mVar == null || (d = fgm.d(n4mVar)) == null) {
            return;
        }
        imageView.setSelected(d.a());
        BlazeStoryPlayerStyle blazeStoryPlayerStyle = this.e;
        ctl.b(imageView, (blazeStoryPlayerStyle == null || (buttons = blazeStoryPlayerStyle.getButtons()) == null || (captions = buttons.getCaptions()) == null) ? null : captions.getCustomImage());
    }
}
