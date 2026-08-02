package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel;

import WZ.l;
import WZ.t;
import WZ.x;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.SocialSoundControlDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel.RightPanelMuteItemView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel.RightPanelWithMuteItemOptimized;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelMuteItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/content/Context;LWZ/l;)V", "LWZ/t;", "soundTrackingInfo", "", "sendAnalytic", "(LWZ/t;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized$MuteItem;", "item", "Lkotlin/Function1;", "", "onMuteClicked", "Landroid/widget/ImageView;", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelWithMuteItemOptimized$MuteItem;Lkotlin/jvm/functions/Function1;)Landroid/widget/ImageView;", "LWZ/l;", "muteButtonView", "Landroid/widget/ImageView;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelMuteItemView$DividerBackgroundDrawable;", "divider", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelMuteItemView$DividerBackgroundDrawable;", "Companion", "DividerBackgroundDrawable", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class RightPanelMuteItemView extends LinearLayout {

    @NotNull
    private final DividerBackgroundDrawable divider;

    @NotNull
    private final ImageView muteButtonView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelMuteItemView$Companion;", "", "<init>", "()V", "ENABLED_BUTTON_ALPHA", "", "DISABLED_BUTTON_ALPHA", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelMuteItemView$DividerBackgroundDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "paint", "Landroid/graphics/Paint;", "rectF", "Landroid/graphics/RectF;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class DividerBackgroundDrawable extends Drawable {

        @NotNull
        private final Paint paint;

        @NotNull
        private final RectF rectF;

        public DividerBackgroundDrawable(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Paint paint = new Paint(1);
            paint.setColor(ThemeExtKt.themeColor(context, R$attr.clearLightKey600));
            paint.setStyle(Paint.Style.FILL);
            this.paint = paint;
            this.rectF = new RectF();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            float exactCenterX = getBounds().exactCenterX();
            Dimens dimens = Dimens.INSTANCE;
            float dp_8 = dimens.getDP_8();
            this.rectF.set(exactCenterX - dp_8, 0.0f, exactCenterX + dp_8, dimens.getDPF_2());
            canvas.drawRoundRect(this.rectF, dimens.getDPF_2(), dimens.getDPF_2(), this.paint);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int alpha) {
            this.paint.setAlpha(alpha);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.paint.setColorFilter(colorFilter);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightPanelMuteItemView(@NotNull Context context, @NotNull l tokenizedAnalytics) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        ImageView imageView = new ImageView(context);
        Dimens dimens = Dimens.INSTANCE;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimens.getDP_48(), dimens.getDP_48());
        layoutParams.topMargin = dimens.getDP_6();
        layoutParams.gravity = 1;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setLayoutParams(layoutParams);
        this.muteButtonView = imageView;
        this.divider = new DividerBackgroundDrawable(context);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(dimens.getDP_56(), -2));
        addView(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$5$lambda$4$lambda$2(Function1 function1, boolean z11, RightPanelMuteItemView rightPanelMuteItemView, t tVar, t tVar2, View view) {
        function1.invoke(Boolean.valueOf(!z11));
        if (!z11) {
            tVar = tVar2;
        }
        rightPanelMuteItemView.sendAnalytic(tVar);
    }

    private final void sendAnalytic(t soundTrackingInfo) {
        if (soundTrackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, soundTrackingInfo, null, 2, null);
        }
    }

    @NotNull
    public final ImageView bind(@NotNull RightPanelWithMuteItemOptimized.MuteItem item, @NotNull final Function1<? super Boolean, Unit> onMuteClicked) {
        final t tVar;
        final t tVar2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onMuteClicked, "onMuteClicked");
        SocialSoundControlDTO item2 = item.getItem();
        Map<String, TokenizedTrackingInfo> trackingInfo = item2.getMuteButton().getTrackingInfo();
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(item.getWidgetId());
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            tVar = x.b(trackingInfo, valueOf, null);
        } else {
            tVar = null;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo2 = item2.getUnmuteButton().getTrackingInfo();
        if (trackingInfo2 != null) {
            Long valueOf2 = Long.valueOf(item.getWidgetId());
            Intrinsics.checkNotNullParameter(trackingInfo2, "<this>");
            tVar2 = x.b(trackingInfo2, valueOf2, null);
        } else {
            tVar2 = null;
        }
        setBackground(item.getHasDivider() ? this.divider : null);
        ImageView imageView = this.muteButtonView;
        Boolean isSoundMuted = item2.isSoundMuted();
        Boolean bool = Boolean.TRUE;
        final boolean d11 = Intrinsics.d(isSoundMuted, bool);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: fV.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RightPanelMuteItemView.bind$lambda$5$lambda$4$lambda$2(Function1.this, d11, this, tVar, tVar2, view);
            }
        });
        imageView.setContentDescription((d11 ? item2.getUnmuteButton() : item2.getMuteButton()).getIcon());
        Icon icon = d11 ? new Icon(item2.getUnmuteButton().getIcon(), item2.getUnmuteButton().getTintColor()) : new Icon(item2.getMuteButton().getIcon(), item2.getMuteButton().getTintColor());
        imageView.setAlpha(Intrinsics.d(item.getHasAudio(), bool) ? 1.0f : 0.5f);
        ViewExtKt.bind$default(imageView, icon, null, 2, null);
        imageView.setEnabled(Intrinsics.d(item.getHasAudio(), bool));
        return imageView;
    }
}
