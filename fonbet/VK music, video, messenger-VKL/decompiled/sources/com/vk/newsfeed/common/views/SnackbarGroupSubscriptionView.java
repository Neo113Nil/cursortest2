package com.vk.newsfeed.common.views;

import android.app.Activity;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.subscription.api.SubscribeStatus;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.fv70;
import xsna.krv0;
import xsna.n2q;
import xsna.ucr0;
import xsna.waf0;
import xsna.xwk;
import xsna.yzm0;
import xsna.zrp;

/* compiled from: SnackbarGroupSubscriptionView.kt */
/* loaded from: classes4.dex */
public final class SnackbarGroupSubscriptionView extends LinearLayout {
    public NewsEntry.TrackData b;
    public yzm0 c;
    public final VKReplacerView d;
    public final TextView e;
    public final TextView f;
    public final VkSimpleButton g;
    public ViewState h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SnackbarGroupSubscriptionView.kt */
    public static final class ViewState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ViewState[] $VALUES;
        public static final ViewState SUBSCRIBED;
        public static final ViewState UNSUBSCRIBED;

        static {
            ViewState viewState = new ViewState("UNSUBSCRIBED", 0);
            UNSUBSCRIBED = viewState;
            ViewState viewState2 = new ViewState("SUBSCRIBED", 1);
            SUBSCRIBED = viewState2;
            ViewState[] viewStateArr = {viewState, viewState2};
            $VALUES = viewStateArr;
            $ENTRIES = new asp(viewStateArr);
        }

        public ViewState() {
            throw null;
        }

        public static ViewState valueOf(String str) {
            return (ViewState) Enum.valueOf(ViewState.class, str);
        }

        public static ViewState[] values() {
            return (ViewState[]) $VALUES.clone();
        }
    }

    /* compiled from: SnackbarGroupSubscriptionView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SubscribeStatus.values().length];
            try {
                iArr[SubscribeStatus.MEMBER_STATUS_MEMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscribeStatus.MEMBER_STATUS_NOT_MEMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ViewState.values().length];
            try {
                iArr2[ViewState.UNSUBSCRIBED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ViewState.SUBSCRIBED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public SnackbarGroupSubscriptionView(Activity activity) {
        super(activity);
        this.h = ViewState.UNSUBSCRIBED;
        View.inflate(activity, R.layout.vk_subscribe_group_snackbar, this);
        this.d = (VKReplacerView) findViewById(R.id.avatar);
        TextView textView = (TextView) findViewById(R.id.title);
        this.e = textView;
        this.f = (TextView) findViewById(R.id.message);
        VkSimpleButton vkSimpleButton = (VkSimpleButton) findViewById(R.id.button);
        this.g = vkSimpleButton;
        vkSimpleButton.setOnClickListener(new n2q(4, this, activity));
        xwk.e().T().m().d.subscribe(new fv70(new waf0(this, 9), 14));
        TypedValue typedValue = krv0.a;
        dhr0 dhr0Var = krv0.b;
        if (dhr0Var != null) {
            dhr0Var.m0(textView, R.attr.vk_ui_text_primary);
        } else {
            e3m.a aVar = e3m.a;
            textView.setTextColor(activity.getColor(R.color.vk_black));
        }
    }

    private final void setActionButtonText(String str) {
        this.g.setText(str);
    }

    private final void setAvatar(String str) {
        VKReplacerView vKReplacerView = this.d;
        if (str == null) {
            f4m.j(vKReplacerView);
            return;
        }
        ucr0 ucr0Var = new ucr0(getContext());
        vKReplacerView.setVisibility(0);
        if (vKReplacerView.a(ucr0Var.getView())) {
            ucr0Var.f(str, new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, 0, null, null, null, VKImageController.ScaleType.CENTER_CROP, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65275));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAvatarUrl(String str) {
        setAvatar(str);
    }

    private final void setSubtitle(String str) {
        this.f.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitle(String str) {
        this.e.setText(str);
    }

    public final void c(ViewState viewState) {
        this.h = viewState;
        int i = a.$EnumSwitchMapping$1[viewState.ordinal()];
        VkSimpleButton vkSimpleButton = this.g;
        if (i == 1) {
            setActionButtonText(getContext().getString(R.string.profile_subscribe));
            vkSimpleButton.setMode(VkButton.Mode.Primary);
            vkSimpleButton.setAppearance(VkButton.Appearance.Accent);
            setSubtitle(getContext().getString(R.string.community_marked));
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        setActionButtonText(getContext().getString(R.string.cancel));
        vkSimpleButton.setMode(VkButton.Mode.Secondary);
        vkSimpleButton.setAppearance(VkButton.Appearance.Accent);
        setSubtitle(getContext().getString(R.string.community_subscribed));
    }

    public final ViewState getViewState() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yzm0 yzm0Var = this.c;
        if (yzm0Var != null) {
            yzm0Var.b.dispose();
        }
    }
}
