package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.u;
import com.blaze.blazesdk.custom_views.BlazeDefaultTimeBar;
import com.blaze.blazesdk.custom_views.BlazeExpandableAndScrollableTextView;
import com.blaze.blazesdk.custom_views.BlazeShadingEdgeLayout;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.blaze.blazesdk.features.shared.ui.BlazeLikesContainerView;
import com.blaze.blazesdk.follow.BlazeFollowEntityView;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.BlazePlayerDisplayMode;
import com.blaze.blazesdk.style.players.BlazeSeekBarStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerBodyTextStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerButtonStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerChipStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerCtaIconStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerCtaStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerCustomActionButton;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFollowEntityStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFooterGradientStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerHeaderGradientStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerHeadingTextStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerSeekBarStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;
import defpackage.n4m;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dlm extends u {
    public static final /* synthetic */ int o = 0;
    public final wgm b;
    public final grl c;
    public final hrl d;
    public final u6b e;
    public BlazeMomentsPlayerStyle f;
    public n4m g;
    public boolean h;
    public d5m i;
    public b9m j;
    public boolean k;
    public boolean l;
    public final m0m m;
    public xyl n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlm(@NotNull wgm wgmVar, @NotNull grl grlVar, @Nullable hrl hrlVar, @NotNull u6b u6bVar) {
        super(wgmVar.a);
        u4a u4aVar;
        wgmVar.getClass();
        grlVar.getClass();
        u6bVar.getClass();
        this.b = wgmVar;
        this.c = grlVar;
        this.d = hrlVar;
        this.e = u6bVar;
        Context applicationContext = wgmVar.a.getContext().getApplicationContext();
        applicationContext.getClass();
        m0m m0mVar = new m0m(applicationContext, null, 0, 6, null);
        m0mVar.setId(View.generateViewId());
        this.m = m0mVar;
        wgmVar.h.addView(m0mVar, new tl3(0, 0));
        if (hrlVar == null || (u4aVar = hrlVar.d) == null) {
            return;
        }
        wgmVar.o.setGuidelineBegin(u4aVar.b);
        wgmVar.n.setGuidelineEnd(u4aVar.d);
    }

    public static final void l(dlm dlmVar, mm3 mm3Var, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, boolean z) {
        wgm wgmVar = dlmVar.b;
        n4m n4mVar = dlmVar.g;
        if (n4mVar == null) {
            return;
        }
        boolean u = u(blazeMomentsPlayerStyle, n4mVar);
        ConstraintLayout constraintLayout = wgmVar.a;
        BlazeShadingEdgeLayout blazeShadingEdgeLayout = wgmVar.q;
        Guideline guideline = wgmVar.n;
        LinearLayout linearLayout = wgmVar.x;
        BlazeTextWithIconButton blazeTextWithIconButton = wgmVar.t;
        FrameLayout frameLayout = wgmVar.F;
        int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(R.dimen.blaze_moments_bottom_components_bottom_margin);
        int dimensionPixelSize2 = wgmVar.a.getResources().getDimensionPixelSize(R.dimen.blaze_moments_cta_top_margin);
        if (u && dlmVar.b.C.getTop() <= frameLayout.getBottom()) {
            dlmVar.c(mm3Var, blazeMomentsPlayerStyle, z);
            return;
        }
        if (!z) {
            mm3Var.g(blazeShadingEdgeLayout.getId(), 4, wgmVar.C.getId(), 3, dimensionPixelSize);
            int i = b6m.i[blazeMomentsPlayerStyle.getCta().getLayoutPositioning().ordinal()];
            if (i != 1 && i != 2) {
                zzl.b();
                return;
            } else {
                mm3Var.g(linearLayout.getId(), 4, frameLayout.getId(), 4, dimensionPixelSize);
                dlmVar.b(mm3Var, blazeMomentsPlayerStyle, frameLayout.getId(), 7);
                return;
            }
        }
        mm3Var.g(blazeTextWithIconButton.getId(), 4, guideline.getBottom() < frameLayout.getBottom() ? guideline.getId() : frameLayout.getId(), 4, dimensionPixelSize);
        mm3Var.g(blazeShadingEdgeLayout.getId(), 4, blazeTextWithIconButton.getId(), 3, dimensionPixelSize2);
        int i2 = b6m.i[blazeMomentsPlayerStyle.getCta().getLayoutPositioning().ordinal()];
        if (i2 == 1) {
            mm3Var.g(linearLayout.getId(), 4, blazeTextWithIconButton.getId(), 3, dimensionPixelSize2);
            dlmVar.b(mm3Var, blazeMomentsPlayerStyle, frameLayout.getId(), 7);
        } else if (i2 != 2) {
            zzl.b();
        } else {
            mm3Var.g(linearLayout.getId(), 4, blazeTextWithIconButton.getId(), 4, 0);
            dlmVar.b(mm3Var, blazeMomentsPlayerStyle, linearLayout.getId(), 6);
        }
    }

    public static final void m(dlm dlmVar, nsl nslVar) {
        float floatValue;
        float floatValue2;
        wgm wgmVar = dlmVar.b;
        m0m m0mVar = dlmVar.m;
        mm3 mm3Var = new mm3();
        ConstraintLayout constraintLayout = wgmVar.h;
        ConstraintLayout constraintLayout2 = wgmVar.h;
        Guideline guideline = wgmVar.c;
        Guideline guideline2 = wgmVar.d;
        Guideline guideline3 = wgmVar.e;
        Guideline guideline4 = wgmVar.f;
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
        switch (b6m.c[o0mVar.a.ordinal()]) {
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
        switch (b6m.d[o0mVar.d.ordinal()]) {
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

    public static boolean u(BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, n4m n4mVar) {
        BlazeMomentsPlayerSeekBarStyle seekBar;
        BlazeSeekBarStyle pausedState;
        BlazeMomentsPlayerSeekBarStyle seekBar2;
        BlazeSeekBarStyle playingState;
        BlazeMomentsPlayerSeekBarStyle seekBar3;
        return (n4mVar.c instanceof n4m.a.b) && (blazeMomentsPlayerStyle != null && (seekBar3 = blazeMomentsPlayerStyle.getSeekBar()) != null && seekBar3.isVisible()) && ((blazeMomentsPlayerStyle != null && (seekBar2 = blazeMomentsPlayerStyle.getSeekBar()) != null && (playingState = seekBar2.getPlayingState()) != null && playingState.isVisible()) || (blazeMomentsPlayerStyle != null && (seekBar = blazeMomentsPlayerStyle.getSeekBar()) != null && (pausedState = seekBar.getPausedState()) != null && pausedState.isVisible()));
    }

    public final void a(mm3 mm3Var, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle) {
        BlazeDp width = blazeMomentsPlayerStyle.getCta().getWidth();
        wgm wgmVar = this.b;
        if (width != null) {
            mm3Var.j(wgmVar.t.getId()).d.b = width.getToPx$blazesdk_release();
            return;
        }
        int i = b6m.j[blazeMomentsPlayerStyle.getCta().getHorizontalAlignment().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            mm3Var.j(wgmVar.t.getId()).d.b = -2;
        } else {
            if (i == 4) {
                return;
            }
            zzl.b();
        }
    }

    public final void b(mm3 mm3Var, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, int i, int i2) {
        int i3 = b6m.j[blazeMomentsPlayerStyle.getCta().getHorizontalAlignment().ordinal()];
        wgm wgmVar = this.b;
        if (i3 == 1) {
            mm3Var.d(wgmVar.t.getId(), 7);
            return;
        }
        if (i3 == 2) {
            mm3Var.f(wgmVar.t.getId(), 7, i, i2);
            return;
        }
        if (i3 == 3) {
            mm3Var.f(wgmVar.t.getId(), 7, i, i2);
            mm3Var.d(wgmVar.t.getId(), 6);
        } else if (i3 == 4) {
            mm3Var.f(wgmVar.t.getId(), 7, i, i2);
        } else {
            zzl.b();
        }
    }

    public final void c(mm3 mm3Var, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, boolean z) {
        n4m n4mVar = this.g;
        if (n4mVar == null) {
            return;
        }
        boolean u = u(blazeMomentsPlayerStyle, n4mVar);
        wgm wgmVar = this.b;
        ConstraintLayout constraintLayout = wgmVar.a;
        Guideline guideline = wgmVar.n;
        FrameLayout frameLayout = wgmVar.F;
        BlazeShadingEdgeLayout blazeShadingEdgeLayout = wgmVar.q;
        BlazeDefaultTimeBar blazeDefaultTimeBar = wgmVar.C;
        BlazeTextWithIconButton blazeTextWithIconButton = wgmVar.t;
        LinearLayout linearLayout = wgmVar.x;
        int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(R.dimen.blaze_moments_bottom_components_bottom_margin);
        int dimensionPixelSize2 = constraintLayout.getResources().getDimensionPixelSize(R.dimen.blaze_moments_progress_top_margin);
        int dimensionPixelSize3 = constraintLayout.getResources().getDimensionPixelSize(R.dimen.blaze_moments_cta_top_margin);
        if (u && z) {
            mm3Var.g(blazeTextWithIconButton.getId(), 4, blazeDefaultTimeBar.getId(), 3, dimensionPixelSize2);
            mm3Var.g(blazeShadingEdgeLayout.getId(), 4, blazeTextWithIconButton.getId(), 3, dimensionPixelSize3);
            int i = b6m.i[blazeMomentsPlayerStyle.getCta().getLayoutPositioning().ordinal()];
            if (i == 1) {
                mm3Var.g(linearLayout.getId(), 4, blazeTextWithIconButton.getId(), 3, dimensionPixelSize3);
                b(mm3Var, blazeMomentsPlayerStyle, frameLayout.getId(), 7);
                return;
            } else if (i != 2) {
                zzl.b();
                return;
            } else {
                mm3Var.g(linearLayout.getId(), 4, blazeTextWithIconButton.getId(), 4, 0);
                b(mm3Var, blazeMomentsPlayerStyle, linearLayout.getId(), 6);
                return;
            }
        }
        if (u && !z) {
            mm3Var.g(blazeShadingEdgeLayout.getId(), 4, blazeDefaultTimeBar.getId(), 3, dimensionPixelSize2);
            int i2 = b6m.i[blazeMomentsPlayerStyle.getCta().getLayoutPositioning().ordinal()];
            if (i2 != 1 && i2 != 2) {
                zzl.b();
                return;
            } else {
                mm3Var.g(linearLayout.getId(), 4, blazeDefaultTimeBar.getId(), 3, dimensionPixelSize2);
                b(mm3Var, blazeMomentsPlayerStyle, frameLayout.getId(), 7);
                return;
            }
        }
        if (u || !z) {
            mm3Var.g(blazeShadingEdgeLayout.getId(), 4, blazeDefaultTimeBar.getId(), 3, dimensionPixelSize2);
            mm3Var.g(linearLayout.getId(), 4, guideline.getId(), 4, dimensionPixelSize);
            int i3 = b6m.i[blazeMomentsPlayerStyle.getCta().getLayoutPositioning().ordinal()];
            if (i3 != 1 && i3 != 2) {
                zzl.b();
                return;
            } else {
                mm3Var.g(linearLayout.getId(), 4, guideline.getId(), 4, dimensionPixelSize);
                b(mm3Var, blazeMomentsPlayerStyle, frameLayout.getId(), 7);
                return;
            }
        }
        mm3Var.g(blazeTextWithIconButton.getId(), 4, guideline.getId(), 4, dimensionPixelSize);
        mm3Var.g(blazeShadingEdgeLayout.getId(), 4, blazeTextWithIconButton.getId(), 3, dimensionPixelSize3);
        int i4 = b6m.i[blazeMomentsPlayerStyle.getCta().getLayoutPositioning().ordinal()];
        if (i4 == 1) {
            mm3Var.g(linearLayout.getId(), 4, blazeTextWithIconButton.getId(), 3, dimensionPixelSize3);
            b(mm3Var, blazeMomentsPlayerStyle, frameLayout.getId(), 7);
        } else if (i4 != 2) {
            zzl.b();
        } else {
            mm3Var.g(linearLayout.getId(), 4, blazeTextWithIconButton.getId(), 4, 0);
            b(mm3Var, blazeMomentsPlayerStyle, linearLayout.getId(), 6);
        }
    }

    public final void d(mm3 mm3Var, boolean z) {
        mm3Var.j(this.b.t.getId()).b.a = z ? 0 : 8;
    }

    public final void e(nsl nslVar) {
        int id;
        int id2;
        mm3 mm3Var = new mm3();
        wgm wgmVar = this.b;
        ConstraintLayout constraintLayout = wgmVar.a;
        FrameLayout frameLayout = wgmVar.F;
        ConstraintLayout constraintLayout2 = wgmVar.h;
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
            constraintLayout2.addOnLayoutChangeListener(new jhm(this, nslVar));
        } else {
            m(this, nslVar);
        }
    }

    public final void f(w0m w0mVar) {
        w0mVar.getClass();
        wgm wgmVar = this.b;
        FrameLayout frameLayout = wgmVar.F;
        qdm qdmVar = (qdm) w0mVar;
        PlayerView playerView = qdmVar.a;
        PlayerView playerView2 = qdmVar.a;
        if (Intrinsics.c(frameLayout, playerView.getParent())) {
            return;
        }
        ViewGroup r = evl.r(wgmVar.a.getId(), playerView2);
        wgm a = r != null ? wgm.a(r) : null;
        if (a != null) {
            FrameLayout frameLayout2 = a.F;
            frameLayout2.getClass();
            lz.y(frameLayout2, false);
            ImageView imageView = a.G;
            imageView.getClass();
            imageView.getClass();
            imageView.setVisibility(0);
            frameLayout2.removeView(playerView2);
        }
        n4m n4mVar = this.g;
        if ((n4mVar != null ? n4mVar.c : null) instanceof n4m.a.b) {
            wgmVar.F.addView(playerView2);
        }
    }

    public final void g(InteractionModel interactionModel) {
        mm3 mm3Var = new mm3();
        wgm wgmVar = this.b;
        mm3Var.e(wgmVar.h);
        m0m m0mVar = this.m;
        int id = m0mVar.getId();
        Guideline guideline = wgmVar.j;
        mm3Var.f(id, 6, guideline.getId(), 6);
        int id2 = m0mVar.getId();
        Guideline guideline2 = wgmVar.i;
        mm3Var.f(id2, 3, guideline2.getId(), 3);
        ConstraintLayout constraintLayout = wgmVar.h;
        mm3Var.a(constraintLayout);
        mm3 mm3Var2 = new mm3();
        ConstraintLayout constraintLayout2 = wgmVar.a;
        mm3Var2.e(constraintLayout2);
        mm3Var2.c(constraintLayout.getId());
        int id3 = constraintLayout.getId();
        FrameLayout frameLayout = wgmVar.F;
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

    public final void h(BlazeMomentsPlayerSeekBarStyle blazeMomentsPlayerSeekBarStyle) {
        if (blazeMomentsPlayerSeekBarStyle == null || !blazeMomentsPlayerSeekBarStyle.isVisible()) {
            return;
        }
        BlazeDefaultTimeBar blazeDefaultTimeBar = this.b.C;
        blazeDefaultTimeBar.setScrubberPlayingColor(blazeMomentsPlayerSeekBarStyle.getPlayingState().getThumbColor());
        CopyOnWriteArraySet copyOnWriteArraySet = blazeDefaultTimeBar.K;
        blazeDefaultTimeBar.setScrubberPausedColor(blazeMomentsPlayerSeekBarStyle.getPausedState().getThumbColor());
        blazeDefaultTimeBar.setUnplayedPausedColor(blazeMomentsPlayerSeekBarStyle.getPausedState().getBackgroundColor());
        blazeDefaultTimeBar.setUnplayedPlayingColor(blazeMomentsPlayerSeekBarStyle.getPlayingState().getBackgroundColor());
        blazeDefaultTimeBar.setPlayedPaintPlayingColor(blazeMomentsPlayerSeekBarStyle.getPlayingState().getProgressColor());
        blazeDefaultTimeBar.setPlayedPaintPausedColor(blazeMomentsPlayerSeekBarStyle.getPausedState().getProgressColor());
        blazeDefaultTimeBar.setBarPlayingHeight(blazeMomentsPlayerSeekBarStyle.getPlayingState().getHeight().getToPx$blazesdk_release());
        blazeDefaultTimeBar.setBarPausedHeight(blazeMomentsPlayerSeekBarStyle.getPausedState().getHeight().getToPx$blazesdk_release());
        blazeDefaultTimeBar.setScrubberPausedSize(blazeMomentsPlayerSeekBarStyle.getPausedState().getThumbSize().getToPx$blazesdk_release());
        blazeDefaultTimeBar.setScrubberPlayingSize(blazeMomentsPlayerSeekBarStyle.getPlayingState().getThumbSize().getToPx$blazesdk_release());
        blazeDefaultTimeBar.setPlayingScrubberIsVisible(blazeMomentsPlayerSeekBarStyle.getPlayingState().isThumbVisible());
        blazeDefaultTimeBar.setPausedScrubberIsVisible(blazeMomentsPlayerSeekBarStyle.getPausedState().isThumbVisible());
        blazeDefaultTimeBar.setPlayingSeekbarIsVisible(blazeMomentsPlayerSeekBarStyle.getPlayingState().isVisible());
        blazeDefaultTimeBar.setPausedSeekbarIsVisible(blazeMomentsPlayerSeekBarStyle.getPausedState().isVisible());
        blazeDefaultTimeBar.setSeekbarPlayingCornerRadius(blazeMomentsPlayerSeekBarStyle.getPlayingState().getCornerRadius().getToPx$blazesdk_release());
        blazeDefaultTimeBar.setSeekbarPausedCornerRadius(blazeMomentsPlayerSeekBarStyle.getPausedState().getCornerRadius().getToPx$blazesdk_release());
        evl.t(blazeMomentsPlayerSeekBarStyle.getBottomMargin().getToPx$blazesdk_release(), blazeDefaultTimeBar);
        lz.z(blazeMomentsPlayerSeekBarStyle.getHorizontalMargin().getToPx$blazesdk_release(), blazeDefaultTimeBar);
        lz.v(blazeDefaultTimeBar, blazeMomentsPlayerSeekBarStyle.getHorizontalMargin().getToPx$blazesdk_release());
        Integer thumbImageResId = blazeMomentsPlayerSeekBarStyle.getPlayingState().getThumbImageResId();
        if (thumbImageResId != null) {
            blazeDefaultTimeBar.setPlayingThumbImage(thumbImageResId.intValue());
        }
        Integer thumbImageResId2 = blazeMomentsPlayerSeekBarStyle.getPausedState().getThumbImageResId();
        if (thumbImageResId2 != null) {
            blazeDefaultTimeBar.setPausedThumbImage(thumbImageResId2.intValue());
        }
        b9m b9mVar = this.j;
        if (b9mVar != null) {
            copyOnWriteArraySet.remove(b9mVar);
        }
        b9m b9mVar2 = new b9m(this);
        this.j = b9mVar2;
        copyOnWriteArraySet.add(b9mVar2);
    }

    public final void i(BlazeMomentsPlayerStyle blazeMomentsPlayerStyle) {
        BlazeMomentsPlayerFooterGradientStyle.BlazeEndPositioning blazeEndPositioning;
        int id;
        BlazeMomentsPlayerFooterGradientStyle footerGradient;
        wgm wgmVar = this.b;
        View view = wgmVar.l;
        view.getClass();
        evl.y(wgmVar.k.getId(), view);
        View view2 = wgmVar.l;
        view2.getClass();
        FrameLayout frameLayout = wgmVar.F;
        evl.w(frameLayout.getId(), view2);
        view2.getClass();
        evl.p(frameLayout.getId(), view2);
        if (blazeMomentsPlayerStyle == null || (footerGradient = blazeMomentsPlayerStyle.getFooterGradient()) == null || (blazeEndPositioning = footerGradient.getEndPositioning()) == null) {
            blazeEndPositioning = BlazeMomentsPlayerFooterGradientStyle.BlazeEndPositioning.BOTTOM_TO_CONTAINER;
        }
        int i = b6m.b[blazeEndPositioning.ordinal()];
        if (i == 1) {
            id = wgmVar.g.getId();
        } else {
            if (i != 2) {
                zzl.b();
                return;
            }
            id = frameLayout.getId();
        }
        view2.getClass();
        evl.g(view2, id);
    }

    public final void j(n4m n4mVar, BlazeMomentsPlayerFollowEntityStyle blazeMomentsPlayerFollowEntityStyle) {
        wgm wgmVar = this.b;
        if (blazeMomentsPlayerFollowEntityStyle == null) {
            BlazeFollowEntityView blazeFollowEntityView = wgmVar.v;
            blazeFollowEntityView.getClass();
            blazeFollowEntityView.setVisibility(8);
            return;
        }
        glm a = BlazeSDK.INSTANCE.getFollowEntitiesInternal$blazesdk_release() != null ? jsl.a(n4mVar.t, blazeMomentsPlayerFollowEntityStyle.getEntityType()) : null;
        if (a == null) {
            BlazeFollowEntityView blazeFollowEntityView2 = wgmVar.v;
            blazeFollowEntityView2.getClass();
            blazeFollowEntityView2.setVisibility(8);
        } else {
            BlazeFollowEntityView blazeFollowEntityView3 = wgmVar.v;
            blazeFollowEntityView3.getClass();
            blazeFollowEntityView3.setVisibility(0);
            wgmVar.v.setupView(new j0m(blazeMomentsPlayerFollowEntityStyle, a, new vkm(this, 0)));
        }
    }

    public final void k(wgm wgmVar, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, n4m n4mVar) {
        BlazePlayerDisplayMode blazePlayerDisplayMode;
        Activity activity;
        if (blazeMomentsPlayerStyle == null) {
            return;
        }
        mm3 mm3Var = new mm3();
        ConstraintLayout constraintLayout = wgmVar.a;
        ImageView imageView = wgmVar.G;
        Guideline guideline = wgmVar.n;
        FrameLayout frameLayout = wgmVar.F;
        mm3Var.e(constraintLayout);
        hrl hrlVar = this.d;
        if (hrlVar != null) {
            blazePlayerDisplayMode = hrlVar.a.getPlayerDisplayMode();
            if ((n4mVar.b instanceof gim.a) || ((activity = (Activity) hrlVar.b.get()) != null && cnb.i(activity))) {
                blazePlayerDisplayMode = BlazePlayerDisplayMode.FIXED_RATIO_9_16;
            }
        } else {
            blazePlayerDisplayMode = null;
        }
        BlazePlayerDisplayMode blazePlayerDisplayMode2 = blazePlayerDisplayMode;
        mm3Var.c(frameLayout.getId());
        mm3Var.g(wgmVar.C.getId(), 4, guideline.getId(), 4, blazeMomentsPlayerStyle.getSeekBar().getBottomMargin().getToPx$blazesdk_release());
        int i = blazePlayerDisplayMode2 == null ? -1 : b6m.a[blazePlayerDisplayMode2.ordinal()];
        if (i == -1 || i == 1) {
            mm3Var.o(frameLayout.getId(), "9:16");
            mm3Var.s(frameLayout.getId());
            mm3Var.f(frameLayout.getId(), 3, wgmVar.o.getId(), 3);
            mm3Var.f(frameLayout.getId(), 6, constraintLayout.getId(), 6);
            mm3Var.f(frameLayout.getId(), 7, constraintLayout.getId(), 7);
            mm3Var.f(frameLayout.getId(), 4, guideline.getId(), 4);
            imageView.setScaleType(ImageView.ScaleType.FIT_START);
        } else if (i == 2) {
            mm3Var.f(frameLayout.getId(), 3, constraintLayout.getId(), 3);
            mm3Var.f(frameLayout.getId(), 6, constraintLayout.getId(), 6);
            mm3Var.f(frameLayout.getId(), 7, constraintLayout.getId(), 7);
            mm3Var.f(frameLayout.getId(), 4, constraintLayout.getId(), 4);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (i != 3) {
            zzl.b();
            return;
        }
        mm3Var.a(constraintLayout);
    }

    public final void n(fqm fqmVar) {
        BlazeMomentsPlayerButtonsStyle buttons;
        BlazeMomentsPlayerButtonStyle seekBackward;
        BlazeMomentsPlayerButtonsStyle buttons2;
        BlazeMomentsPlayerButtonStyle seekForward;
        fqmVar.getClass();
        n4m n4mVar = this.g;
        boolean z = (n4mVar != null ? n4mVar.c : null) instanceof n4m.a.b;
        boolean z2 = false;
        wgm wgmVar = this.b;
        if (!z) {
            ImageView imageView = wgmVar.z;
            imageView.getClass();
            imageView.setVisibility(8);
            ImageView imageView2 = wgmVar.D;
            imageView2.getClass();
            imageView2.setVisibility(8);
            ImageView imageView3 = wgmVar.B;
            imageView3.getClass();
            imageView3.setVisibility(8);
            this.h = false;
            return;
        }
        boolean z3 = fqmVar.b;
        boolean z4 = fqmVar.a;
        this.h = z3;
        this.l = z4;
        boolean z5 = !z4;
        Interpolator accelerateInterpolator = !z4 ? new AccelerateInterpolator() : new DecelerateInterpolator();
        BlazeDefaultTimeBar blazeDefaultTimeBar = wgmVar.C;
        boolean z6 = this.l;
        blazeDefaultTimeBar.d0 = !z6;
        if (!z6) {
            blazeDefaultTimeBar.d(blazeDefaultTimeBar.getLeft(), blazeDefaultTimeBar.getTop(), blazeDefaultTimeBar.getRight(), blazeDefaultTimeBar.getBottom());
        }
        ImageView imageView4 = wgmVar.z;
        imageView4.setContentDescription(z4 ? imageView4.getContext().getString(R.string.blaze_accessibility_pause_video) : imageView4.getContext().getString(R.string.blaze_accessibility_play_video));
        evl.j(imageView4, z5, 200L, accelerateInterpolator, m2d.HIDE);
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = this.f;
        boolean z7 = (blazeMomentsPlayerStyle == null || (buttons2 = blazeMomentsPlayerStyle.getButtons()) == null || (seekForward = buttons2.getSeekForward()) == null || !seekForward.isVisible()) ? false : true;
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle2 = this.f;
        if (blazeMomentsPlayerStyle2 != null && (buttons = blazeMomentsPlayerStyle2.getButtons()) != null && (seekBackward = buttons.getSeekBackward()) != null && seekBackward.isVisible()) {
            z2 = true;
        }
        if (z7 && this.k) {
            ImageView imageView5 = wgmVar.D;
            imageView5.getClass();
            evl.j(imageView5, z5, 200L, accelerateInterpolator, m2d.GONE);
        }
        if (z2 && this.k) {
            ImageView imageView6 = wgmVar.B;
            imageView6.getClass();
            evl.j(imageView6, z5, 200L, accelerateInterpolator, m2d.GONE);
        }
    }

    public final void o(InteractionModel interactionModel) {
        try {
            m0m m0mVar = this.m;
            m0mVar.clearAnimation();
            m0mVar.setVisibility(4);
            if (interactionModel != null) {
                n4m n4mVar = this.g;
                nsl bounds = interactionModel.getBounds();
                if (bounds != null) {
                    e(bounds);
                } else {
                    g(interactionModel);
                }
                this.m.b(interactionModel.getId(), interactionModel.getHtmlUrl(), interactionModel.getInitData(), interactionModel.getDesignOverrides(), interactionModel.getUserAnswer(), new gjm(this, n4mVar, interactionModel));
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void p(BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, n4m n4mVar) {
        LinearLayout linearLayout;
        ImageView imageView;
        ImageView imageView2;
        mol molVar;
        TextView textView;
        boolean z;
        BlazeMomentsPlayerChipStyle blazeMomentsPlayerChipStyle;
        mm3 mm3Var;
        String str;
        double h = fgm.h(n4mVar);
        gim gimVar = n4mVar.b;
        this.k = h >= 20.0d;
        if (blazeMomentsPlayerStyle != null) {
            wgm wgmVar = this.b;
            View view = wgmVar.m;
            BlazeTextView blazeTextView = wgmVar.r;
            ConstraintLayout constraintLayout = wgmVar.a;
            ImageView imageView3 = wgmVar.s;
            ImageView imageView4 = wgmVar.E;
            LinearLayout linearLayout2 = wgmVar.x;
            ImageView imageView5 = wgmVar.B;
            ImageView imageView6 = wgmVar.D;
            view.getClass();
            BlazeMomentsPlayerHeaderGradientStyle headerGradient = blazeMomentsPlayerStyle.getHeaderGradient();
            if (headerGradient.getIsVisible()) {
                imageView = imageView5;
                linearLayout = linearLayout2;
                imageView2 = imageView6;
                evl.applyGradient$default(view, b.j(Integer.valueOf(headerGradient.getStartColor()), Integer.valueOf(headerGradient.getEndColor()), Integer.valueOf(headerGradient.getEndColor())), null, null, 6, null);
            } else {
                linearLayout = linearLayout2;
                imageView = imageView5;
                imageView2 = imageView6;
            }
            if (headerGradient.getIsVisible()) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
            View view2 = wgmVar.l;
            view2.getClass();
            BlazeMomentsPlayerFooterGradientStyle footerGradient = blazeMomentsPlayerStyle.getFooterGradient();
            if (footerGradient.getIsVisible()) {
                evl.applyGradient$default(view2, b.j(Integer.valueOf(footerGradient.getStartColor()), Integer.valueOf(footerGradient.getEndColor()), Integer.valueOf(footerGradient.getEndColor())), null, null, 6, null);
            }
            if (footerGradient.getIsVisible()) {
                view2.setVisibility(0);
            } else {
                view2.setVisibility(8);
            }
            BlazeMomentsPlayerButtonsStyle buttons = blazeMomentsPlayerStyle.getButtons();
            linearLayout.removeAllViewsInLayout();
            linearLayout.addView(wgmVar.v);
            for (BlazeMomentsPlayerButtonsStyle.BottomStackButtons bottomStackButtons : buttons.getBottomStackOrderMergedWithMissingCustomActionButtons$blazesdk_release()) {
                if (Intrinsics.c(bottomStackButtons, BlazeMomentsPlayerButtonsStyle.BottomStackButtons.Like.INSTANCE)) {
                    linearLayout.addView(wgmVar.y);
                } else if (Intrinsics.c(bottomStackButtons, BlazeMomentsPlayerButtonsStyle.BottomStackButtons.Share.INSTANCE)) {
                    linearLayout.addView(imageView4);
                } else if (Intrinsics.c(bottomStackButtons, BlazeMomentsPlayerButtonsStyle.BottomStackButtons.Captions.INSTANCE)) {
                    linearLayout.addView(imageView3);
                } else {
                    if (!(bottomStackButtons instanceof BlazeMomentsPlayerButtonsStyle.BottomStackButtons.Custom)) {
                        zzl.b();
                        return;
                    }
                    List<BlazeMomentsPlayerCustomActionButton> bottomStackCustomActionButtons = buttons.getBottomStackCustomActionButtons();
                    Context context = constraintLayout.getContext();
                    context.getClass();
                    BlazeTextView blazeTextView2 = blazeTextView;
                    ImageView imageView7 = imageView3;
                    ImageView l = wca.l(context, ((BlazeMomentsPlayerButtonsStyle.BottomStackButtons.Custom) bottomStackButtons).getId(), bottomStackCustomActionButtons, new zkm(this, 2));
                    if (l != null) {
                        linearLayout.addView(l);
                    }
                    blazeTextView = blazeTextView2;
                    imageView3 = imageView7;
                }
            }
            BlazeTextView blazeTextView3 = blazeTextView;
            ImageView imageView8 = imageView3;
            BlazeMomentsPlayerButtonsStyle buttons2 = blazeMomentsPlayerStyle.getButtons();
            boolean z2 = fgm.f(n4mVar) != null && z7m.b(BlazePlayerType.MOMENTS);
            imageView4.getClass();
            int i = 8;
            ctl.setPlayerButtonUi$default(imageView4, buttons2.getShare(), z2, n4mVar.b, null, 8, null);
            ImageView imageView9 = wgmVar.z;
            imageView9.getClass();
            ctl.setPlayerButtonUi$default(imageView9, buttons2.getPlay(), false, n4mVar.b, null, 10, null);
            List<BlazeMomentsPlayerCustomActionButton> bottomStackCustomActionButtons2 = buttons2.getBottomStackCustomActionButtons();
            mol molVar2 = mol.GONE;
            wca.m(linearLayout, bottomStackCustomActionButtons2, n4mVar, molVar2);
            if (this.k) {
                ImageView imageView10 = imageView2;
                imageView10.getClass();
                ctl.setPlayerButtonUi$default(imageView10, buttons2.getSeekForward(), false, n4mVar.b, molVar2, 2, null);
                molVar = molVar2;
                imageView10.setOnClickListener(new xkm(this, 1));
            } else {
                imageView2.getClass();
                imageView2.setVisibility(8);
                molVar = molVar2;
            }
            if (this.k) {
                imageView.getClass();
                mol molVar3 = molVar;
                ctl.setPlayerButtonUi$default(imageView, buttons2.getSeekBackward(), false, n4mVar.b, molVar3, 2, null);
                molVar = molVar3;
                imageView.setOnClickListener(new xkm(this, 0));
            } else {
                imageView.getClass();
                imageView.setVisibility(8);
            }
            BlazeMomentsPlayerCtaStyle cta = blazeMomentsPlayerStyle.getCta();
            i iVar = n4mVar.i;
            boolean z3 = (iVar != null && (str = iVar.b) != null && (StringsKt.R(str) ^ true)) && (gimVar.a() || cta.isVisible());
            BlazeTextWithIconButton blazeTextWithIconButton = wgmVar.t;
            blazeTextWithIconButton.setText(iVar != null ? iVar.b : null);
            blazeTextWithIconButton.setTextSize(cta.getTextSize());
            BlazeTextWithIconButton.setTypefaceFromResource$default(blazeTextWithIconButton, cta.getFontResId(), null, null, 6, null);
            blazeTextWithIconButton.setRadius(blazeMomentsPlayerStyle.getCta().getCornerRadius().getToPx$blazesdk_release());
            if (iVar != null) {
                l6g.x(blazeTextWithIconButton, iVar);
            }
            BlazeMomentsPlayerCtaIconStyle icon = blazeMomentsPlayerStyle.getCta().getIcon();
            if (icon != null) {
                if (b6m.g[icon.getIconPositioning().ordinal()] != 1) {
                    zzl.b();
                    return;
                } else {
                    blazeTextWithIconButton.setDrawableStart(icon.getIconResId());
                    l6g.y(blazeTextWithIconButton, icon.getIconTint(), iVar);
                }
            }
            blazeTextWithIconButton.setOnClickListener(new ivj(i, this, n4mVar));
            int i2 = b6m.h[blazeMomentsPlayerStyle.getBottomComponentsAlignment().ordinal()];
            if (i2 == 1) {
                boolean z4 = z3;
                textView = blazeTextView3;
                mm3 mm3Var2 = new mm3();
                mm3Var2.e(constraintLayout);
                mm3Var2.j(blazeTextWithIconButton.getId()).d.c = blazeMomentsPlayerStyle.getCta().getHeight().getToPx$blazesdk_release();
                a(mm3Var2, blazeMomentsPlayerStyle);
                c(mm3Var2, blazeMomentsPlayerStyle, z4);
                d(mm3Var2, z4);
                mm3Var2.a(constraintLayout);
            } else if (i2 == 2) {
                boolean z5 = z3;
                textView = blazeTextView3;
                mm3 mm3Var3 = new mm3();
                mm3Var3.e(constraintLayout);
                mm3Var3.j(blazeTextWithIconButton.getId()).d.c = blazeMomentsPlayerStyle.getCta().getHeight().getToPx$blazesdk_release();
                a(mm3Var3, blazeMomentsPlayerStyle);
                mm3Var3.j(blazeTextWithIconButton.getId()).b.a = 4;
                mm3Var3.a(constraintLayout);
                if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
                    constraintLayout.addOnLayoutChangeListener(new hfm(wgmVar, this, blazeMomentsPlayerStyle, z5));
                } else {
                    mm3 mm3Var4 = new mm3();
                    mm3Var4.e(constraintLayout);
                    l(this, mm3Var4, blazeMomentsPlayerStyle, z5);
                    d(mm3Var4, z5);
                    mm3Var4.a(constraintLayout);
                }
            } else {
                if (i2 != 3) {
                    zzl.b();
                    return;
                }
                FrameLayout frameLayout = wgmVar.F;
                int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(R.dimen.blaze_moments_bottom_components_bottom_margin);
                int dimensionPixelSize2 = constraintLayout.getResources().getDimensionPixelSize(R.dimen.blaze_moments_cta_fit_top_margin_extra);
                mm3 mm3Var5 = new mm3();
                mm3Var5.e(constraintLayout);
                mm3Var5.j(blazeTextWithIconButton.getId()).d.c = blazeMomentsPlayerStyle.getCta().getHeight().getToPx$blazesdk_release();
                a(mm3Var5, blazeMomentsPlayerStyle);
                c(mm3Var5, blazeMomentsPlayerStyle, z3);
                mm3Var5.j(blazeTextWithIconButton.getId()).b.a = 4;
                mm3Var5.a(constraintLayout);
                if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
                    textView = blazeTextView3;
                    constraintLayout.addOnLayoutChangeListener(new rbm(wgmVar, dimensionPixelSize2, dimensionPixelSize, this, blazeMomentsPlayerStyle, z3));
                } else {
                    mm3 mm3Var6 = new mm3();
                    mm3Var6.e(constraintLayout);
                    if (blazeTextWithIconButton.getTop() >= frameLayout.getBottom() + dimensionPixelSize2) {
                        mm3Var6.g(linearLayout.getId(), 4, frameLayout.getId(), 4, dimensionPixelSize);
                        mm3Var6.g(wgmVar.q.getId(), 4, frameLayout.getId(), 4, dimensionPixelSize);
                        mm3Var = mm3Var6;
                        b(mm3Var, blazeMomentsPlayerStyle, frameLayout.getId(), 7);
                    } else {
                        mm3Var = mm3Var6;
                        l(this, mm3Var, blazeMomentsPlayerStyle, z3);
                    }
                    d(mm3Var, z3);
                    mm3Var.a(constraintLayout);
                    textView = blazeTextView3;
                }
            }
            if (gimVar instanceof gim.a) {
                blazeMomentsPlayerChipStyle = blazeMomentsPlayerStyle.getChips().getAd();
                z = true;
            } else {
                z = false;
                blazeMomentsPlayerChipStyle = null;
            }
            if (z && blazeMomentsPlayerChipStyle != null && blazeMomentsPlayerChipStyle.isVisible()) {
                int backgroundColor = blazeMomentsPlayerChipStyle.getBackgroundColor();
                GradientDrawable b = w1l.b(0);
                b.setCornerRadii(new float[]{32.0f, 32.0f, 32.0f, 32.0f, 32.0f, 32.0f, 32.0f, 32.0f});
                b.setColor(backgroundColor);
                b.setStroke(0, 0);
                textView.setBackground(b);
                textView.setText(blazeMomentsPlayerChipStyle.getText());
                textView.setTextColor(blazeMomentsPlayerChipStyle.getTextColor());
                textView.setPadding(blazeMomentsPlayerChipStyle.getPadding().getStart().getToPx$blazesdk_release(), blazeMomentsPlayerChipStyle.getPadding().getTop().getToPx$blazesdk_release(), blazeMomentsPlayerChipStyle.getPadding().getEnd().getToPx$blazesdk_release(), blazeMomentsPlayerChipStyle.getPadding().getBottom().getToPx$blazesdk_release());
                textView.setVisibility(0);
            } else {
                textView.getClass();
                textView.setVisibility(8);
            }
            BlazeMomentsPlayerButtonStyle captions = blazeMomentsPlayerStyle.getButtons().getCaptions();
            imageView8.getClass();
            ctl.setPlayerButtonUi$default(imageView8, captions, false, n4mVar.b, molVar, 2, null);
            eqm d = fgm.d(n4mVar);
            if (d != null) {
                imageView8.setAlpha(d.d() ? 1.0f : 0.5f);
                v();
                evl.setDebouncedOnClickListener$default(imageView8, 0L, null, new bcl(20, this, d), 3, null);
            }
        }
    }

    public final void q(n4m n4mVar, BlazeMomentsPlayerButtonStyle blazeMomentsPlayerButtonStyle) {
        BlazeLikesContainerView blazeLikesContainerView;
        if (blazeMomentsPlayerButtonStyle != null) {
            BlazeLikesContainerView blazeLikesContainerView2 = this.b.y;
            zkm zkmVar = new zkm(this, 0);
            blazeLikesContainerView2.getClass();
            ImageView imageView = blazeLikesContainerView2.a.b;
            ytm e = fgm.e(n4mVar);
            if (e != null) {
                imageView.setSelected(e.getV());
                blazeLikesContainerView2.a(e);
                blazeLikesContainerView = blazeLikesContainerView2;
                imageView.setOnClickListener(new rx1(e, imageView, blazeMomentsPlayerButtonStyle, blazeLikesContainerView, zkmVar, 0));
            } else {
                blazeLikesContainerView = blazeLikesContainerView2;
            }
            imageView.getClass();
            ctl.setPlayerButtonUi$default(imageView, blazeMomentsPlayerButtonStyle, false, n4mVar.b, null, 10, null);
            ctl.setPlayableItemViewVisibility$default(blazeLikesContainerView, blazeMomentsPlayerButtonStyle.isVisible(), blazeMomentsPlayerButtonStyle.isVisibleForAds(), n4mVar.b instanceof gim.a, false, null, 24, null);
        }
    }

    public final void r(n4m n4mVar, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle) {
        String str;
        String str2 = n4mVar.d;
        String str3 = n4mVar.e;
        if (blazeMomentsPlayerStyle != null) {
            int i = b6m.e[blazeMomentsPlayerStyle.getHeadingText().getContentSource().ordinal()];
            int i2 = 1;
            if (i == 1) {
                str = str2;
            } else {
                if (i != 2) {
                    zzl.b();
                    return;
                }
                str = str3;
            }
            wgm wgmVar = this.b;
            BlazeTextView blazeTextView = wgmVar.w;
            BlazeExpandableAndScrollableTextView blazeExpandableAndScrollableTextView = wgmVar.p;
            blazeTextView.getClass();
            BlazeMomentsPlayerHeadingTextStyle headingText = blazeMomentsPlayerStyle.getHeadingText();
            boolean isVisible = blazeMomentsPlayerStyle.getHeadingText().isVisible();
            blazeTextView.setTextSize(headingText.getTextSize());
            blazeTextView.setTextColor(headingText.getTextColor());
            izk.setTypefaceFromResource$default(blazeTextView, headingText.getFontResId(), null, null, 6, null);
            int i3 = 0;
            blazeTextView.setVisibility(isVisible ? 0 : 8);
            wgmVar.w.setText(str);
            int i4 = b6m.f[blazeMomentsPlayerStyle.getBodyText().getContentSource().ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    str2 = str3;
                } else {
                    if (i4 != 3) {
                        zzl.b();
                        return;
                    }
                    str2 = n4mVar.f;
                }
            }
            blazeExpandableAndScrollableTextView.getClass();
            blazeExpandableAndScrollableTextView.setVisibility(8);
            n4m n4mVar2 = this.g;
            if (n4mVar2 == null || str2 == null || StringsKt.R(str2)) {
                return;
            }
            BlazeMomentsPlayerBodyTextStyle bodyText = blazeMomentsPlayerStyle.getBodyText();
            boolean isVisible2 = blazeMomentsPlayerStyle.getBodyText().isVisible();
            blazeExpandableAndScrollableTextView.setTextSize(bodyText.getTextSize());
            blazeExpandableAndScrollableTextView.setTextColor(bodyText.getTextColor());
            Integer fontResId = bodyText.getFontResId();
            int i5 = 8;
            izk.setTypefaceFromResource$default(blazeExpandableAndScrollableTextView, fontResId, null, null, 6, null);
            if (isVisible2) {
                i5 = 0;
            }
            blazeExpandableAndScrollableTextView.setVisibility(i5);
            bcl bclVar = new bcl(19, this, n4mVar2);
            wkm wkmVar = new wkm(this, i3);
            wkm wkmVar2 = new wkm(this, i2);
            blazeExpandableAndScrollableTextView.i = n4mVar2;
            blazeExpandableAndScrollableTextView.h = blazeExpandableAndScrollableTextView.g(str2);
            blazeExpandableAndScrollableTextView.m = bclVar;
            blazeExpandableAndScrollableTextView.n = wkmVar;
            blazeExpandableAndScrollableTextView.o = wkmVar2;
            blazeExpandableAndScrollableTextView.h();
        }
    }

    public final void s() {
        b5m b5mVar;
        d5m d5mVar = this.i;
        if (d5mVar != null) {
            d5mVar.a();
        }
        this.i = null;
        jsl followEntitiesInternal$blazesdk_release = BlazeSDK.INSTANCE.getFollowEntitiesInternal$blazesdk_release();
        if (followEntitiesInternal$blazesdk_release == null || (b5mVar = followEntitiesInternal$blazesdk_release.c) == null) {
            return;
        }
        leb lebVar = new leb(this, 1);
        u6b u6bVar = this.e;
        u6bVar.getClass();
        d5m d5mVar2 = new d5m(new deh(15, b5mVar, lebVar));
        b5mVar.e(u6bVar, lebVar);
        this.i = d5mVar2;
    }

    public final void t() {
        BlazeMomentsPlayerButtonsStyle buttons;
        BlazeMomentsPlayerButtonStyle captions;
        n4m n4mVar;
        eqm d;
        dlm dlmVar;
        wgm wgmVar = this.b;
        try {
            xyl xylVar = this.n;
            if (xylVar != null) {
                xylVar.destroy();
            }
            this.n = null;
            wgmVar.b.removeAllViews();
            BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = this.f;
            if (blazeMomentsPlayerStyle != null && (buttons = blazeMomentsPlayerStyle.getButtons()) != null && (captions = buttons.getCaptions()) != null && captions.isVisible() && (n4mVar = this.g) != null && (d = fgm.d(n4mVar)) != null) {
                n4m n4mVar2 = this.g;
                Context applicationContext = wgmVar.a.getContext().getApplicationContext();
                applicationContext.getClass();
                xyl xylVar2 = new xyl(applicationContext, null, 0, 6, null);
                xylVar2.setId(View.generateViewId());
                xylVar2.setImportantForAccessibility(2);
                int id = xylVar2.getId();
                wgmVar.b.addView(xylVar2, new tl3(-1, -1));
                xylVar2.a();
                if (d.d()) {
                    dlmVar = this;
                    xyl.loadAndInitialize$default(xylVar2, null, new im1(xylVar2, id, dlmVar, n4mVar2, 9), 1, null);
                } else {
                    dlmVar = this;
                }
                dlmVar.n = xylVar2;
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void v() {
        eqm d;
        BlazeMomentsPlayerButtonsStyle buttons;
        BlazeMomentsPlayerButtonStyle captions;
        ImageView imageView = this.b.s;
        n4m n4mVar = this.g;
        if (n4mVar == null || (d = fgm.d(n4mVar)) == null) {
            return;
        }
        imageView.setSelected(d.a());
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = this.f;
        ctl.b(imageView, (blazeMomentsPlayerStyle == null || (buttons = blazeMomentsPlayerStyle.getButtons()) == null || (captions = buttons.getCaptions()) == null) ? null : captions.getCustomImage());
    }
}
