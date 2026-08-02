package com.vk.profile.user.impl.ui.view.header;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.semantics.b;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.components.topbar.c;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.user.api.domain.UserProfileMode;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.g;
import java.util.HashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.avq0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cn70;
import xsna.da50;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.e6k0;
import xsna.e8v0;
import xsna.een0;
import xsna.f4m;
import xsna.fnj;
import xsna.gko;
import xsna.gzs;
import xsna.iah0;
import xsna.kcc0;
import xsna.kul0;
import xsna.lfa;
import xsna.m8v0;
import xsna.msy;
import xsna.oan0;
import xsna.q7v0;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;
import xsna.v5n0;
import xsna.wug0;
import xsna.wzb0;
import xsna.zjq;

/* compiled from: UserProfileHeaderView.kt */
/* loaded from: classes5.dex */
public final class UserProfileHeaderView extends ConstraintLayout {
    public static final /* synthetic */ int G = 0;
    public final VkTopBar A;
    public final VkTopBar.c.f B;
    public final bpn0 C;
    public final ImageView D;
    public final View E;
    public final Object F;
    public com.vk.profile.core.cover.a t;
    public UserProfileFragment.a u;
    public gzs<s3q0> v;
    public int w;
    public final int x;
    public final int y;
    public final int z;

    /* compiled from: UserProfileHeaderView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserProfileMode.values().length];
            try {
                iArr[UserProfileMode.Profile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserProfileMode.Modal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UserProfileHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.v = new kcc0(7);
        this.x = e3m.a(R.dimen.profile_header_button_vertical_margin, context) + e3m.a(R.dimen.profile_header_default_padding, context);
        this.y = cn70.b(100);
        this.z = e3m.a(R.dimen.profile_avatar_with_border_size, context) / 2;
        int i = 4;
        VkTopBar.c.f fVar = new VkTopBar.c.f(new gko(R.drawable.vk_icon_arrow_left_outline_28), tq.h(tlo0.Companion, R.string.user_profile_accessibility_back), new v5n0(this, 6), null, b.a(SemanticsConfiguration.Mode.Merge, new kul0(i), 2), 24);
        this.B = fVar;
        this.C = new bpn0(new e6k0(i));
        LayoutInflater.from(context).inflate(R.layout.view_user_profile_header, (ViewGroup) this, true);
        VkTopBar vkTopBar = (VkTopBar) findViewById(R.id.vk_overlay_toolbar);
        f4m.y(e3m.a(R.dimen.profile_header_default_padding, context), vkTopBar);
        HashSet hashSet = iah0.a;
        vkTopBar.setAllowMiddleTouchPassthrough(!fnj.b(context));
        vkTopBar.setTransitionHeaderColor(VkTopBar.m.b.a);
        vkTopBar.setInitialMode(c.a);
        vkTopBar.setBefore(fVar);
        vkTopBar.setMiddleOverlay(VkTopBar.Middle.c.a);
        vkTopBar.setOnToolbarSlotListener(new wug0(this, 22));
        this.A = vkTopBar;
        this.D = (ImageView) findViewById(R.id.iv_cover_overlay);
        View findViewById = findViewById(R.id.bg_view);
        bwt0.Z(R.attr.vk_ui_background_content, findViewById);
        findViewById.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.E = findViewById;
        this.F = msy.a(LazyThreadSafetyMode.NONE, new da50(this, 29));
    }

    public static s3q0 P4(UserProfileHeaderView userProfileHeaderView, VkOnboardingCampaign vkOnboardingCampaign, boolean z) {
        userProfileHeaderView.getOnboardingClient().a(vkOnboardingCampaign, VkOnboardingType.Tooltip, z ? e8v0.i.b : e8v0.g.b);
        return s3q0.a;
    }

    public static void Q4(UserProfileHeaderView userProfileHeaderView, UserProfileFragment.a aVar, float f) {
        userProfileHeaderView.setTransitionFraction(f);
        userProfileHeaderView.V4(aVar, f);
    }

    public static s3q0 T4(UserProfileHeaderView userProfileHeaderView, VkOnboardingCampaign vkOnboardingCampaign) {
        wzb0 wzb0Var = new wzb0(userProfileHeaderView, 22);
        userProfileHeaderView.getClass();
        try {
            if (userProfileHeaderView.getOnboardingClient().b(vkOnboardingCampaign, false)) {
                m8v0.a.a(userProfileHeaderView.A, userProfileHeaderView.getContext().getResources().getString(R.string.user_profile_ads_easy_promote_hat), wzb0Var, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size56, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Left, new oan0(3), null, null, null, new lfa(24, userProfileHeaderView, vkOnboardingCampaign), new een0(4, userProfileHeaderView, vkOnboardingCampaign), null, 0, false, null, null, false, userProfileHeaderView.getContext(), false, 12570112);
            }
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
        return s3q0.a;
    }

    public static s3q0 U4(UserProfileHeaderView userProfileHeaderView, VkOnboardingCampaign vkOnboardingCampaign) {
        userProfileHeaderView.getOnboardingClient().a(vkOnboardingCampaign, VkOnboardingType.Tooltip, e8v0.m.b);
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final q7v0 getOnboardingClient() {
        return (q7v0) this.F.getValue();
    }

    private final void setTransitionFraction(float f) {
        this.A.setTransformFraction(f);
        this.E.setAlpha(f);
        setClickable(!(f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    public final void V4(avq0 avq0Var, float f) {
        if (avq0Var.isEnabled() && avq0Var.b()) {
            ImageView imageView = this.D;
            boolean K = bwt0.K(imageView);
            boolean M = dhr0.M();
            boolean z = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f2 = 1.0f - f;
            if (f2 > 0.3f) {
                f2 = 0.3f;
            }
            imageView.setAlpha(f2);
            if (!K && M) {
                avq0Var.a();
                return;
            }
            if (!K && !M) {
                avq0Var.c();
            } else if (M || z) {
                avq0Var.a();
            } else {
                avq0Var.c();
            }
        }
    }

    public final g<com.vk.core.view.components.topbar.a> getOnToolbarComposedCallback() {
        return (g) this.C.getValue();
    }

    public final List<Rect> getSnowballsForbiddenRectList() {
        VkTopBar vkTopBar = this.A;
        RectF o = zjq.o(vkTopBar.getLeftBeforeIconRect());
        Rect rect = new Rect();
        o.roundOut(rect);
        RectF o2 = zjq.o(vkTopBar.getRightMainRect());
        Rect rect2 = new Rect();
        o2.roundOut(rect2);
        RectF o3 = zjq.o(vkTopBar.getRightExtraRect());
        Rect rect3 = new Rect();
        o3.roundOut(rect3);
        return e43.l(rect, rect2, rect3);
    }

    public final int getTopPadding() {
        return this.w;
    }
}
