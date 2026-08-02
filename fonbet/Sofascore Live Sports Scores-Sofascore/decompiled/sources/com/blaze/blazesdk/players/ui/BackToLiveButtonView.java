package com.blaze.blazesdk.players.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamEdgeState;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerBackToLiveButtonStateStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerBackToLiveButtonStyle;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.results.R;
import defpackage.cvl;
import defpackage.evl;
import defpackage.j4;
import defpackage.joa;
import defpackage.jtl;
import defpackage.nq8;
import defpackage.tam;
import defpackage.tl3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.z1g;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001/B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0015\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/blaze/blazesdk/players/ui/BackToLiveButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle;", "Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLiveStreamEdgeState;", "state", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStateStyle;", "getStateStyle", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle;Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLiveStreamEdgeState;)Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStateStyle;", "stateStyle", "", "applyStateStyle", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStateStyle;)V", "applyTextStyle", "applyIconStyle", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "padding", "applyPadding", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "setBackgroundAndRadius", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStyle;", TtmlNode.TAG_STYLE, "setupView", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStyle;)V", "updateState", "(Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLiveStreamEdgeState;)V", "", "isBehindLive", "()Z", "Lcvl;", "binding$delegate", "Ljoa;", "getBinding", "()Lcvl;", "binding", "buttonStyle", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerBackToLiveButtonStyle;", "currentState", "Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLiveStreamEdgeState;", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackToLiveButtonView extends ConstraintLayout {
    private static final int DEFAULT_ICON_TEXT_SPACING_DP = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa binding;

    @Nullable
    private BlazeVideosPlayerBackToLiveButtonStyle buttonStyle;

    @Nullable
    private BlazeLiveStreamEdgeState currentState;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ BlazeVideosPlayerBackToLiveButtonStateStyle a;
        public final /* synthetic */ BackToLiveButtonView b;

        public b(BlazeVideosPlayerBackToLiveButtonStateStyle blazeVideosPlayerBackToLiveButtonStateStyle, BackToLiveButtonView backToLiveButtonView) {
            this.a = blazeVideosPlayerBackToLiveButtonStateStyle;
            this.b = backToLiveButtonView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            tam tamVar = tam.a;
            int width = view.getWidth();
            int height = view.getHeight();
            BlazeVideosPlayerBackToLiveButtonStateStyle blazeVideosPlayerBackToLiveButtonStateStyle = this.a;
            this.b.setBackground(tam.drawBorderShape$default(tamVar, Integer.valueOf(blazeVideosPlayerBackToLiveButtonStateStyle.getBackgroundColor()), 0, tam.a(blazeVideosPlayerBackToLiveButtonStateStyle.getCornerRadius(), blazeVideosPlayerBackToLiveButtonStateStyle.getCornerRadiusRatio(), width, height), 0, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackToLiveButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.binding = ypa.b(new j4(12, context, this));
    }

    private final void applyIconStyle(BlazeVideosPlayerBackToLiveButtonStateStyle stateStyle) {
        BlazeVideosPlayerBackToLiveButtonStateStyle.c icon = stateStyle.getIcon();
        if (icon == null) {
            ImageView imageView = getBinding().b;
            imageView.getClass();
            evl.q(imageView);
            BlazeTextView blazeTextView = getBinding().c;
            blazeTextView.getClass();
            ViewGroup.LayoutParams layoutParams = blazeTextView.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            tl3 tl3Var = (tl3) layoutParams;
            tl3Var.setMarginStart(0);
            blazeTextView.setLayoutParams(tl3Var);
            return;
        }
        ImageView imageView2 = getBinding().b;
        imageView2.getClass();
        evl.u(imageView2);
        imageView2.setImageDrawable(imageView2.getContext().getDrawable(icon.a));
        Integer num = icon.b;
        if (num != null) {
            imageView2.setColorFilter(num.intValue());
        } else {
            imageView2.clearColorFilter();
        }
        BlazeTextView blazeTextView2 = getBinding().c;
        blazeTextView2.getClass();
        ViewGroup.LayoutParams layoutParams2 = blazeTextView2.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var2 = (tl3) layoutParams2;
        Context context = getContext();
        context.getClass();
        tl3Var2.setMarginStart(evl.a(context, 8));
        blazeTextView2.setLayoutParams(tl3Var2);
    }

    private final void applyPadding(BlazeInsets padding) {
        setPadding(padding.getStart().getToPx$blazesdk_release(), padding.getTop().getToPx$blazesdk_release(), padding.getEnd().getToPx$blazesdk_release(), padding.getBottom().getToPx$blazesdk_release());
    }

    private final void applyStateStyle(BlazeVideosPlayerBackToLiveButtonStateStyle stateStyle) {
        applyTextStyle(stateStyle);
        applyIconStyle(stateStyle);
        setBackgroundAndRadius(stateStyle);
        setVisibility(0);
    }

    private final void applyTextStyle(BlazeVideosPlayerBackToLiveButtonStateStyle stateStyle) {
        BlazeTextView blazeTextView = getBinding().c;
        blazeTextView.setText(stateStyle.getText());
        blazeTextView.setTextSize(stateStyle.getTextStyle().getTextSize());
        blazeTextView.setTextColor(stateStyle.getTextStyle().getTextColor());
        Integer fontResId = stateStyle.getTextStyle().getFontResId();
        if (fontResId != null) {
            try {
                blazeTextView.setTypeface(z1g.a(fontResId.intValue(), blazeTextView.getContext()));
            } catch (Exception e) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cvl binding_delegate$lambda$0(Context context, BackToLiveButtonView backToLiveButtonView) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.blaze_layout_back_to_live_button, (ViewGroup) backToLiveButtonView, false);
        backToLiveButtonView.addView(inflate);
        int i = R.id.blaze_back_to_live_icon;
        ImageView imageView = (ImageView) nq8.B(R.id.blaze_back_to_live_icon, inflate);
        if (imageView != null) {
            i = R.id.blaze_back_to_live_text;
            BlazeTextView blazeTextView = (BlazeTextView) nq8.B(R.id.blaze_back_to_live_text, inflate);
            if (blazeTextView != null) {
                return new cvl((ConstraintLayout) inflate, imageView, blazeTextView);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    private final cvl getBinding() {
        return (cvl) this.binding.getValue();
    }

    private final BlazeVideosPlayerBackToLiveButtonStateStyle getStateStyle(BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle blazeVideosPlayerBackToLiveButtonPlaybackStatesStyle, BlazeLiveStreamEdgeState blazeLiveStreamEdgeState) {
        int i = jtl.a[blazeLiveStreamEdgeState.ordinal()];
        if (i == 1) {
            return blazeVideosPlayerBackToLiveButtonPlaybackStatesStyle.getAtLiveEdgeState();
        }
        if (i == 2) {
            return blazeVideosPlayerBackToLiveButtonPlaybackStatesStyle.getBehindLiveState();
        }
        zzl.b();
        return null;
    }

    private final void setBackgroundAndRadius(BlazeVideosPlayerBackToLiveButtonStateStyle stateStyle) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new b(stateStyle, this));
            return;
        }
        setBackground(tam.drawBorderShape$default(tam.a, Integer.valueOf(stateStyle.getBackgroundColor()), 0, tam.a(stateStyle.getCornerRadius(), stateStyle.getCornerRadiusRatio(), getWidth(), getHeight()), 0, 8, null));
    }

    public final boolean isBehindLive() {
        return this.currentState == BlazeLiveStreamEdgeState.BEHIND_LIVE;
    }

    public final void setupView(@NotNull BlazeVideosPlayerBackToLiveButtonStyle style) {
        style.getClass();
        this.buttonStyle = style;
        evl.h(this, style.getMargins());
        applyPadding(style.getPadding());
        updateState(BlazeLiveStreamEdgeState.AT_LIVE_EDGE);
    }

    public final void updateState(@NotNull BlazeLiveStreamEdgeState state) {
        BlazeVideosPlayerBackToLiveButtonPlaybackStatesStyle playbackStates;
        BlazeVideosPlayerBackToLiveButtonStateStyle stateStyle;
        state.getClass();
        if (state == this.currentState) {
            return;
        }
        this.currentState = state;
        BlazeVideosPlayerBackToLiveButtonStyle blazeVideosPlayerBackToLiveButtonStyle = this.buttonStyle;
        if (blazeVideosPlayerBackToLiveButtonStyle == null || (playbackStates = blazeVideosPlayerBackToLiveButtonStyle.getPlaybackStates()) == null || (stateStyle = getStateStyle(playbackStates, state)) == null) {
            setVisibility(8);
        } else {
            applyStateStyle(stateStyle);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackToLiveButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ BackToLiveButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackToLiveButtonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
