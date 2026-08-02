package com.blaze.blazesdk.widgets.ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;
import com.blaze.blazesdk.players.ui.StatusIndicatorView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.shared.models.BlazeObjectPositioning;
import com.blaze.blazesdk.style.widgets.BlazeViewType;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemBadgeStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemBadgeStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemDurationElementStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemDurationElementStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemEventTimeElementStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageAnimatedThumbnailStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageContainerBorderStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageContainerBorderStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageGradientOverlayStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStatusIndicatorStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStatusIndicatorStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemTitleStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.results.R;
import defpackage.bbm;
import defpackage.bpl;
import defpackage.c0g;
import defpackage.evl;
import defpackage.fej;
import defpackage.ft8;
import defpackage.ftl;
import defpackage.gxm;
import defpackage.ipm;
import defpackage.izk;
import defpackage.joa;
import defpackage.l55;
import defpackage.lz;
import defpackage.m8m;
import defpackage.mz1;
import defpackage.n0g;
import defpackage.ndk;
import defpackage.ndm;
import defpackage.nq8;
import defpackage.nym;
import defpackage.tam;
import defpackage.td4;
import defpackage.u7g;
import defpackage.ufa;
import defpackage.w1l;
import defpackage.wjd;
import defpackage.wzb;
import defpackage.xx8;
import defpackage.xxl;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0089\u00012\u00020\u0001:\u0002\u008a\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJc\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102,\u0010\u0015\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010'J\u001f\u0010+\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u00100J/\u00104\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u00105J\u001f\u0010:\u001a\u00020\u00142\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010@\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ)\u0010G\u001a\u00020\u00142\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\b\u0010F\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bG\u0010HJ)\u0010M\u001a\u00020\u00142\u0006\u0010E\u001a\u00020I2\u0006\u0010?\u001a\u00020J2\b\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bM\u0010NJ'\u0010Q\u001a\u00020\u00142\u0006\u0010P\u001a\u00020O2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\u00142\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ'\u0010Y\u001a\u00020\u001f2\u0006\u0010X\u001a\u00020W2\u0006\u0010*\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\bY\u0010ZJ'\u0010^\u001a\u00020\u00142\u0006\u0010[\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020\u00132\u0006\u0010]\u001a\u00020\u001fH\u0002¢\u0006\u0004\b^\u0010_J7\u0010a\u001a\u00020\u00142\u0006\u0010`\u001a\u0002012\u0006\u0010*\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00062\u0006\u0010[\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\ba\u0010bJ)\u0010d\u001a\u00020\u00142\b\u0010[\u001a\u0004\u0018\u00010\u00162\u0006\u0010\\\u001a\u00020\u00132\u0006\u0010c\u001a\u00020\u001fH\u0002¢\u0006\u0004\bd\u0010_J'\u0010f\u001a\u00020\u00142\u0006\u0010e\u001a\u0002012\u0006\u00103\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\bf\u0010gJ\u001f\u0010j\u001a\u00020\u00142\u0006\u0010i\u001a\u00020h2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\bj\u0010kJ'\u0010n\u001a\u00020\u00142\u0006\u0010l\u001a\u00020W2\u0006\u0010m\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bp\u0010\u001cJ#\u0010u\u001a\u00020\u0014*\u00020q2\u0006\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020\u0006H\u0002¢\u0006\u0004\bu\u0010vR\u001b\u0010|\u001a\u00020w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0018\u0010}\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0019\u0010\u007f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000f\u0010\u0081\u0001R?\u0010\u0015\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010\u0082\u0001R\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/blaze/blazesdk/widgets/ui/WidgetItemCustomView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lxxl;", "containerSizeProvider", "Lipm;", "item", "Lcom/blaze/blazesdk/style/widgets/BlazeViewType;", "blazeViewType", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "blazeLayout", "Lkotlin/Function5;", "", "", "onWidgetDrew", "", "accessibilityIdentifierPrefix", "initVariables", "(Lxxl;Lipm;Lcom/blaze/blazesdk/style/widgets/BlazeViewType;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;Lft8;Ljava/lang/String;)V", "widgetId", "playAnimatedThumbnail", "(Ljava/lang/String;)V", "stopAnimatedThumbnail", "()V", "Landroid/util/Size;", "containerSize", "setupView", "(Landroid/util/Size;)V", "calculateItemSize", "(Landroid/util/Size;)Landroid/util/Size;", TtmlNode.TAG_LAYOUT, "calculateRowItemSize", "(Landroid/util/Size;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;)Landroid/util/Size;", "calculateGridItemSize", "itemSize", "parentWidth", "updateRootLayoutParams", "(Landroid/util/Size;I)V", "itemWidth", "itemHeight", "setContainerRadiusBoundaries", "(II)V", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyle;", "widgetItemStyle", "parentHeight", "setWidgetAppearance", "(Lipm;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyle;II)V", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStyle;", "badgeStyle", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStateStyle;", "badgeStateStyle", "setBadgeAppearance", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemBadgeStateStyle;)V", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStyle;", TtmlNode.TAG_STYLE, "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStateStyle;", "stateStyle", "setStatusIndicatorAppearance", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStatusIndicatorStateStyle;)V", "Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLiveStreamStatus;", "streamStatus", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle;", "elementStyle", "eventTimeValue", "setEventTimeElementAppearance", "(Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLiveStreamStatus;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemEventTimeElementStyle;Ljava/lang/String;)V", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemDurationElementStyle;", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemDurationElementStateStyle;", "", "durationValue", "setDurationElementAppearance", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemDurationElementStyle;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemDurationElementStateStyle;Ljava/lang/Double;)V", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTitleStyle;", "blazeItemTitle", "setTitleAppearance", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemTitleStyle;ILipm;)V", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "padding", "setPaddingAppearance", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle;", "imageStyle", "calculateImageSize", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle;II)Landroid/util/Size;", "imageUrl", "desiredRadius", "imageViewSize", "loadImageIfNeeded", "(Ljava/lang/String;FLandroid/util/Size;)V", "blazeWidgetItemAppearance", "setWidgetImageAppearance", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyle;IILjava/lang/String;Lipm;)V", "size", "loadImage", "widgetItemAppearance", "setGradientAppearance", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyle;ILipm;)V", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;", "imageBorder", "setBorderDistance", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;Lipm;)V", "blazeWidgetItemImageStyle", "cornerRadius", "setWidgetImageMutualCornerRadius", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle;FLipm;)V", "updateAccessibilityIdentifiers", "Landroid/view/View;", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeImagePosition;", "position", "parentId", "applyImagePositionConstraint", "(Landroid/view/View;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageStyle$BlazeImagePosition;I)V", "Lnym;", "binding$delegate", "Ljoa;", "getBinding", "()Lnym;", "binding", "blazeWidgetLayout", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "widgetItem", "Lipm;", "Lcom/blaze/blazesdk/style/widgets/BlazeViewType;", "Lft8;", "Lftl;", "gif", "Lftl;", "Ll55;", "widgetImageDisposable", "Ll55;", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WidgetItemCustomView extends FrameLayout {
    private static final double GRADIENT_HEIGHT_RATIO = 0.4d;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa binding;

    @Nullable
    private BlazeViewType blazeViewType;

    @Nullable
    private BlazeWidgetLayout blazeWidgetLayout;

    @Nullable
    private ftl gif;

    @Nullable
    private ft8 onWidgetDrew;

    @Nullable
    private l55 widgetImageDisposable;

    @Nullable
    private ipm widgetItem;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ BlazeWidgetItemBadgeStateStyle a;
        public final /* synthetic */ nym b;
        public final /* synthetic */ WidgetItemCustomView c;

        public b(BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle, nym nymVar, WidgetItemCustomView widgetItemCustomView) {
            this.a = blazeWidgetItemBadgeStateStyle;
            this.b = nymVar;
            this.c = widgetItemCustomView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            nym nymVar = this.b;
            BlazeWidgetItemBadgeStateStyle blazeWidgetItemBadgeStateStyle = this.a;
            view.removeOnLayoutChangeListener(this);
            try {
                int width = view.getWidth();
                int height = view.getHeight();
                blazeWidgetItemBadgeStateStyle.getClass();
                float a = tam.a(blazeWidgetItemBadgeStateStyle.getCornerRadius(), blazeWidgetItemBadgeStateStyle.getCornerRadiusRatio(), width, height);
                ConstraintLayout constraintLayout = nymVar.b;
                int backgroundColor = blazeWidgetItemBadgeStateStyle.getBackgroundColor();
                int borderColor = blazeWidgetItemBadgeStateStyle.getBorderColor();
                int toPx$blazesdk_release = blazeWidgetItemBadgeStateStyle.getBorderWidth().getToPx$blazesdk_release();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                boolean z = true;
                gradientDrawable.setCornerRadii(new float[]{a, a, a, a, a, a, a, a});
                gradientDrawable.setColor(backgroundColor);
                gradientDrawable.setStroke(toPx$blazesdk_release, borderColor);
                constraintLayout.setBackground(gradientDrawable);
                if (!(blazeWidgetItemBadgeStateStyle.getBackgroundImageResId() != null)) {
                    if (blazeWidgetItemBadgeStateStyle.getBackgroundImageUrl$blazesdk_release() == null) {
                        z = false;
                    }
                    if (!z) {
                        ImageView imageView = nymVar.c;
                        imageView.getClass();
                        imageView.getClass();
                        imageView.setVisibility(8);
                        return;
                    }
                }
                ImageView imageView2 = nymVar.c;
                imageView2.getClass();
                Integer backgroundImageResId = blazeWidgetItemBadgeStateStyle.getBackgroundImageResId();
                evl.loadAndCacheImage$default(imageView2, blazeWidgetItemBadgeStateStyle.getBackgroundImageUrl$blazesdk_release(), backgroundImageResId != null ? td4.d0(backgroundImageResId.intValue(), this.c.getContext()) : null, null, null, false, null, a.c(new u7g(a, a, a, a)), null, null, null, null, 1980, null);
                ImageView imageView3 = nymVar.c;
                imageView3.getClass();
                imageView3.getClass();
                imageView3.setVisibility(0);
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c implements View.OnLayoutChangeListener {
        public final /* synthetic */ Size b;
        public final /* synthetic */ BlazeWidgetItemImageStyle c;

        public c(Size size, BlazeWidgetItemImageStyle blazeWidgetItemImageStyle) {
            this.b = size;
            this.c = blazeWidgetItemImageStyle;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ft8 ft8Var;
            Size size = this.b;
            WidgetItemCustomView widgetItemCustomView = WidgetItemCustomView.this;
            view.removeOnLayoutChangeListener(this);
            try {
                ViewParent parent = widgetItemCustomView.getParent();
                ViewParent parent2 = parent != null ? parent.getParent() : null;
                RecyclerView recyclerView = parent2 instanceof RecyclerView ? (RecyclerView) parent2 : null;
                if (recyclerView == null || recyclerView.getWidth() == 0 || recyclerView.getHeight() == 0 || (ft8Var = widgetItemCustomView.onWidgetDrew) == null) {
                    return;
                }
                ft8Var.invoke(Integer.valueOf(size.getWidth()), Integer.valueOf(size.getHeight()), this.c.getRatio(), Integer.valueOf(recyclerView.getWidth()), Integer.valueOf(recyclerView.getHeight()));
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetItemCustomView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.binding = ypa.b(new fej(22, context, this));
    }

    private final void applyImagePositionConstraint(View view, BlazeWidgetItemImageStyle.BlazeImagePosition blazeImagePosition, int i) {
        switch (m8m.c[blazeImagePosition.ordinal()]) {
            case 1:
                view.getClass();
                evl.w(i, view);
                evl.g(view, i);
                break;
            case 2:
                view.getClass();
                evl.w(i, view);
                evl.p(i, view);
                evl.g(view, i);
                break;
            case 3:
                view.getClass();
                evl.p(i, view);
                evl.g(view, i);
                break;
            case 4:
                view.getClass();
                evl.w(i, view);
                evl.p(i, view);
                evl.g(view, i);
                evl.y(i, view);
                break;
            case 5:
                view.getClass();
                evl.w(i, view);
                evl.g(view, i);
                evl.y(i, view);
                break;
            case 6:
                view.getClass();
                evl.p(i, view);
                evl.g(view, i);
                evl.y(i, view);
                break;
            case 7:
                view.getClass();
                evl.w(i, view);
                evl.y(i, view);
                break;
            case 8:
                view.getClass();
                evl.w(i, view);
                evl.p(i, view);
                evl.y(i, view);
                break;
            case 9:
                view.getClass();
                evl.p(i, view);
                evl.y(i, view);
                break;
            default:
                zzl.b();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nym binding_delegate$lambda$0(Context context, WidgetItemCustomView widgetItemCustomView) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.blaze_layout_widget, (ViewGroup) widgetItemCustomView, false);
        widgetItemCustomView.addView(inflate);
        int i = R.id.blaze_widget_item_badge_border;
        if (nq8.B(R.id.blaze_widget_item_badge_border, inflate) != null) {
            i = R.id.blaze_widget_item_badge_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.blaze_widget_item_badge_container, inflate);
            if (constraintLayout != null) {
                i = R.id.blaze_widget_item_badge_image;
                ImageView imageView = (ImageView) nq8.B(R.id.blaze_widget_item_badge_image, inflate);
                if (imageView != null) {
                    i = R.id.blaze_widget_item_badge_text;
                    BlazeTextView blazeTextView = (BlazeTextView) nq8.B(R.id.blaze_widget_item_badge_text, inflate);
                    if (blazeTextView != null) {
                        i = R.id.blaze_widget_item_border;
                        View B = nq8.B(R.id.blaze_widget_item_border, inflate);
                        if (B != null) {
                            i = R.id.blaze_widget_item_duration;
                            WidgetTimeElementCustomView widgetTimeElementCustomView = (WidgetTimeElementCustomView) nq8.B(R.id.blaze_widget_item_duration, inflate);
                            if (widgetTimeElementCustomView != null) {
                                i = R.id.blaze_widget_item_event_time;
                                WidgetTimeElementCustomView widgetTimeElementCustomView2 = (WidgetTimeElementCustomView) nq8.B(R.id.blaze_widget_item_event_time, inflate);
                                if (widgetTimeElementCustomView2 != null) {
                                    i = R.id.blaze_widget_item_image_container;
                                    CardView cardView = (CardView) nq8.B(R.id.blaze_widget_item_image_container, inflate);
                                    if (cardView != null) {
                                        i = R.id.blaze_widget_item_status_indicator;
                                        StatusIndicatorView statusIndicatorView = (StatusIndicatorView) nq8.B(R.id.blaze_widget_item_status_indicator, inflate);
                                        if (statusIndicatorView != null) {
                                            i = R.id.blaze_widget_item_title;
                                            BlazeTextView blazeTextView2 = (BlazeTextView) nq8.B(R.id.blaze_widget_item_title, inflate);
                                            if (blazeTextView2 != null) {
                                                i = R.id.blaze_widget_item_widgetGradient;
                                                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.blaze_widget_item_widgetGradient, inflate);
                                                if (frameLayout != null) {
                                                    i = R.id.blaze_widget_item_widgetImage;
                                                    ImageView imageView2 = (ImageView) nq8.B(R.id.blaze_widget_item_widgetImage, inflate);
                                                    if (imageView2 != null) {
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                                        return new nym(constraintLayout2, constraintLayout, imageView, blazeTextView, B, widgetTimeElementCustomView, widgetTimeElementCustomView2, cardView, statusIndicatorView, blazeTextView2, frameLayout, imageView2, constraintLayout2);
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
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    private final Size calculateGridItemSize(Size containerSize, BlazeWidgetLayout layout) {
        if (containerSize.getWidth() <= 0 || layout.getUpdatedColumns() <= 0) {
            return null;
        }
        int width = ((containerSize.getWidth() - (layout.getMargins().getEnd().getToPx$blazesdk_release() + layout.getMargins().getStart().getToPx$blazesdk_release())) - ((layout.getUpdatedColumns() - 1) * layout.getHorizontalItemsSpacing().getToPx$blazesdk_release())) / layout.getUpdatedColumns();
        return new Size(width, wzb.b(width / layout.getItemRatio()));
    }

    private final Size calculateImageSize(BlazeWidgetItemImageStyle imageStyle, int parentWidth, int parentHeight) {
        BlazeDp width = imageStyle.getWidth();
        Integer valueOf = width != null ? Integer.valueOf(width.getToPx$blazesdk_release()) : null;
        BlazeDp height = imageStyle.getHeight();
        Integer valueOf2 = height != null ? Integer.valueOf(height.getToPx$blazesdk_release()) : null;
        Float ratio = imageStyle.getRatio();
        if (valueOf != null) {
            parentWidth = Math.min(parentWidth, valueOf.intValue());
        }
        if (valueOf2 != null) {
            parentHeight = Math.min(parentHeight, valueOf2.intValue());
        }
        int toPx$blazesdk_release = parentWidth - (imageStyle.getMargins().getEnd().getToPx$blazesdk_release() + imageStyle.getMargins().getStart().getToPx$blazesdk_release());
        int toPx$blazesdk_release2 = parentHeight - (imageStyle.getMargins().getBottom().getToPx$blazesdk_release() + imageStyle.getMargins().getTop().getToPx$blazesdk_release());
        if (valueOf == null || valueOf2 == null) {
            if (valueOf != null && ratio != null) {
                toPx$blazesdk_release2 = wzb.b(toPx$blazesdk_release / ratio.floatValue());
            } else if (valueOf2 != null && ratio != null) {
                toPx$blazesdk_release = wzb.b(ratio.floatValue() * toPx$blazesdk_release2);
            } else if (ratio != null) {
                if (toPx$blazesdk_release > toPx$blazesdk_release2) {
                    toPx$blazesdk_release = (int) Math.floor(ratio.floatValue() * toPx$blazesdk_release2);
                } else {
                    toPx$blazesdk_release2 = (int) Math.floor(toPx$blazesdk_release / ratio.floatValue());
                }
            }
        }
        return new Size(toPx$blazesdk_release, toPx$blazesdk_release2);
    }

    private final Size calculateItemSize(Size containerSize) {
        BlazeWidgetLayout blazeWidgetLayout = this.blazeWidgetLayout;
        if (blazeWidgetLayout == null) {
            return null;
        }
        BlazeViewType blazeViewType = this.blazeViewType;
        int i = blazeViewType == null ? -1 : m8m.a[blazeViewType.ordinal()];
        if (i == 1) {
            return calculateRowItemSize(containerSize, blazeWidgetLayout);
        }
        if (i != 2) {
            return null;
        }
        return calculateGridItemSize(containerSize, blazeWidgetLayout);
    }

    private final Size calculateRowItemSize(Size containerSize, BlazeWidgetLayout layout) {
        if (containerSize.getHeight() <= 0) {
            return null;
        }
        int height = (containerSize.getHeight() - layout.getMargins().getTop().getToPx$blazesdk_release()) - layout.getMargins().getBottom().getToPx$blazesdk_release();
        return new Size(wzb.b(layout.getItemRatio() * height), height);
    }

    private final nym getBinding() {
        return (nym) this.binding.getValue();
    }

    private final void loadImage(String imageUrl, float desiredRadius, Size size) {
        ImageView imageView = getBinding().l;
        imageView.getClass();
        this.widgetImageDisposable = evl.loadAndCacheImage$default(imageView, imageUrl, null, null, null, false, size, a.c(new u7g(desiredRadius, desiredRadius, desiredRadius, desiredRadius)), null, null, null, null, 1950, null);
    }

    private final void loadImageIfNeeded(String imageUrl, float desiredRadius, Size imageViewSize) {
        BlazeWidgetItemStyle widgetItemStyle;
        BlazeWidgetItemImageStyle image;
        BlazeWidgetItemImageAnimatedThumbnailStyle animatedThumbnail;
        xx8 xx8Var;
        BlazeWidgetLayout blazeWidgetLayout = this.blazeWidgetLayout;
        if (blazeWidgetLayout == null || (widgetItemStyle = blazeWidgetLayout.getWidgetItemStyle()) == null || (image = widgetItemStyle.getImage()) == null || (animatedThumbnail = image.getAnimatedThumbnail()) == null || !animatedThumbnail.isEnabled()) {
            loadImage(imageUrl, desiredRadius, imageViewSize);
            return;
        }
        ftl ftlVar = this.gif;
        if (ftlVar == null || (xx8Var = ftlVar.d) == null || !xx8Var.b) {
            loadImage(imageUrl, desiredRadius, imageViewSize);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playAnimatedThumbnail$lambda$24(WidgetItemCustomView widgetItemCustomView) {
        l55 l55Var = widgetItemCustomView.widgetImageDisposable;
        if (l55Var == null) {
            return null;
        }
        l55Var.d();
        return Unit.a;
    }

    private final void setBadgeAppearance(BlazeWidgetItemBadgeStyle badgeStyle, BlazeWidgetItemBadgeStateStyle badgeStateStyle) {
        nym binding = getBinding();
        if (!badgeStyle.isVisible() || !badgeStateStyle.isVisible()) {
            ConstraintLayout constraintLayout = binding.b;
            constraintLayout.getClass();
            constraintLayout.getClass();
            constraintLayout.setVisibility(8);
            return;
        }
        ConstraintLayout constraintLayout2 = binding.b;
        ImageView imageView = binding.c;
        BlazeTextView blazeTextView = binding.d;
        ConstraintLayout constraintLayout3 = binding.b;
        constraintLayout2.getLayoutParams().width = badgeStateStyle.getWidth().getToPx$blazesdk_release();
        constraintLayout3.getLayoutParams().height = badgeStateStyle.getHeight().getToPx$blazesdk_release();
        constraintLayout3.getClass();
        BlazeObjectPositioning position = badgeStyle.getPosition();
        CardView cardView = binding.h;
        cardView.getClass();
        evl.i(constraintLayout3, position, cardView);
        constraintLayout3.getClass();
        evl.h(constraintLayout3, badgeStyle.getMargins());
        imageView.getClass();
        evl.h(imageView, badgeStyle.getPadding());
        String text = badgeStateStyle.getText();
        if (text == null || StringsKt.R(text)) {
            blazeTextView.getClass();
            blazeTextView.getClass();
            blazeTextView.setVisibility(8);
        } else {
            blazeTextView.setText(badgeStateStyle.getText());
            blazeTextView.getClass();
            izk.a(blazeTextView, badgeStateStyle.getTextStyle(), new BlazeInsets(badgeStyle.getPadding().getStart(), badgeStyle.getPadding().getTop(), badgeStyle.getPadding().getEnd(), badgeStyle.getPadding().getBottom()), null);
            blazeTextView.getClass();
            blazeTextView.getClass();
            blazeTextView.setVisibility(0);
        }
        constraintLayout3.getClass();
        if (!constraintLayout3.isLaidOut() || constraintLayout3.isLayoutRequested()) {
            constraintLayout3.addOnLayoutChangeListener(new b(badgeStateStyle, binding, this));
        } else {
            try {
                float a = tam.a(badgeStateStyle.getCornerRadius(), badgeStateStyle.getCornerRadiusRatio(), constraintLayout3.getWidth(), constraintLayout3.getHeight());
                constraintLayout3.setBackground(tam.b(a, badgeStateStyle.getBorderColor(), badgeStateStyle.getBorderWidth().getToPx$blazesdk_release(), Integer.valueOf(badgeStateStyle.getBackgroundColor())));
                boolean z = true;
                if (!(badgeStateStyle.getBackgroundImageResId() != null)) {
                    if (badgeStateStyle.getBackgroundImageUrl$blazesdk_release() == null) {
                        z = false;
                    }
                    if (!z) {
                        imageView.getClass();
                        imageView.getClass();
                        imageView.setVisibility(8);
                    }
                }
                ImageView imageView2 = binding.c;
                imageView2.getClass();
                Integer backgroundImageResId = badgeStateStyle.getBackgroundImageResId();
                evl.loadAndCacheImage$default(imageView2, badgeStateStyle.getBackgroundImageUrl$blazesdk_release(), backgroundImageResId != null ? td4.d0(backgroundImageResId.intValue(), getContext()) : null, null, null, false, null, a.c(new u7g(a, a, a, a)), null, null, null, null, 1980, null);
                imageView.getClass();
                imageView.getClass();
                imageView.setVisibility(0);
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
        constraintLayout3.getClass();
        constraintLayout3.getClass();
        constraintLayout3.setVisibility(0);
    }

    private final void setBorderDistance(BlazeWidgetItemImageContainerBorderStyle imageBorder, ipm item) {
        BlazeWidgetItemImageContainerBorderStateStyle a = ndm.a(imageBorder, item);
        int toPx$blazesdk_release = (imageBorder.isVisible() && a.isVisible()) ? a.getMargin().getToPx$blazesdk_release() : 0;
        ImageView imageView = getBinding().l;
        imageView.getClass();
        imageView.getClass();
        lz.z(toPx$blazesdk_release, imageView);
        lz.v(imageView, toPx$blazesdk_release);
        evl.v(toPx$blazesdk_release, imageView);
        evl.t(toPx$blazesdk_release, imageView);
    }

    private final void setContainerRadiusBoundaries(int itemWidth, int itemHeight) {
        BlazeWidgetItemStyle widgetItemStyle;
        BlazeWidgetLayout blazeWidgetLayout = this.blazeWidgetLayout;
        if (blazeWidgetLayout == null || (widgetItemStyle = blazeWidgetLayout.getWidgetItemStyle()) == null) {
            return;
        }
        getBinding().a.setBackground(tam.drawBorderShape$default(tam.a, Integer.valueOf(widgetItemStyle.getBackgroundColor()), 0, tam.a(widgetItemStyle.getCornerRadius(), widgetItemStyle.getCornerRadiusRatio(), itemWidth, itemHeight), 0, 8, null));
        getBinding().a.setClipToPadding(true);
    }

    private final void setDurationElementAppearance(BlazeWidgetItemDurationElementStyle elementStyle, BlazeWidgetItemDurationElementStateStyle stateStyle, Double durationValue) {
        WidgetTimeElementCustomView widgetTimeElementCustomView = getBinding().f;
        widgetTimeElementCustomView.getClass();
        BlazeObjectPositioning position = elementStyle.getPosition();
        CardView cardView = getBinding().h;
        cardView.getClass();
        evl.i(widgetTimeElementCustomView, position, cardView);
        String str = null;
        if (durationValue != null) {
            if (durationValue.doubleValue() <= 0.0d) {
                durationValue = null;
            }
            if (durationValue != null) {
                str = ufa.i((long) durationValue.doubleValue());
            }
        }
        widgetTimeElementCustomView.setupView(elementStyle, stateStyle, str);
    }

    private final void setEventTimeElementAppearance(BlazeLiveStreamStatus streamStatus, BlazeWidgetItemEventTimeElementStyle elementStyle, String eventTimeValue) {
        WidgetTimeElementCustomView widgetTimeElementCustomView = getBinding().g;
        widgetTimeElementCustomView.getClass();
        BlazeObjectPositioning position = elementStyle.getPosition();
        CardView cardView = getBinding().h;
        cardView.getClass();
        evl.i(widgetTimeElementCustomView, position, cardView);
        widgetTimeElementCustomView.setupView(elementStyle, elementStyle.getStreamStates().getStyleByStreamStatus$blazesdk_release(streamStatus), eventTimeValue);
    }

    private final void setGradientAppearance(BlazeWidgetItemStyle widgetItemAppearance, int parentHeight, ipm item) {
        int i;
        nym binding = getBinding();
        BlazeWidgetItemImageGradientOverlayStyle gradientOverlay = widgetItemAppearance.getImage().getGradientOverlay();
        if (gradientOverlay.isVisible()) {
            BlazeWidgetItemImageContainerBorderStateStyle a = ndm.a(widgetItemAppearance.getImage().getBorder(), item);
            int toPx$blazesdk_release = (widgetItemAppearance.getImage().getBorder().isVisible() && a.isVisible()) ? a.getMargin().getToPx$blazesdk_release() : 0;
            FrameLayout frameLayout = binding.k;
            FrameLayout frameLayout2 = binding.k;
            frameLayout.getClass();
            frameLayout.getClass();
            lz.z(toPx$blazesdk_release, frameLayout);
            lz.v(frameLayout, toPx$blazesdk_release);
            evl.v(toPx$blazesdk_release, frameLayout);
            evl.t(toPx$blazesdk_release, frameLayout);
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                int i2 = m8m.b[gradientOverlay.getPosition().ordinal()];
                if (i2 == 1) {
                    i = 80;
                } else if (i2 == 2) {
                    i = 17;
                } else {
                    if (i2 != 3) {
                        zzl.b();
                        return;
                    }
                    i = 48;
                }
                layoutParams2.gravity = i;
            }
            frameLayout2.getClass();
            lz.x(frameLayout2, kotlin.collections.b.j(Integer.valueOf(gradientOverlay.getStartColor()), Integer.valueOf(gradientOverlay.getStartColor()), Integer.valueOf(gradientOverlay.getEndColor())), GradientDrawable.Orientation.BOTTOM_TOP, Float.valueOf(binding.h.getRadius()));
            frameLayout2.getLayoutParams().height = (int) (parentHeight * GRADIENT_HEIGHT_RATIO);
        }
    }

    private final void setPaddingAppearance(BlazeInsets padding) {
        getBinding().m.setPadding(padding.getStart().getToPx$blazesdk_release(), padding.getTop().getToPx$blazesdk_release(), padding.getEnd().getToPx$blazesdk_release(), padding.getBottom().getToPx$blazesdk_release());
    }

    private final void setStatusIndicatorAppearance(BlazeWidgetItemStatusIndicatorStyle style, BlazeWidgetItemStatusIndicatorStateStyle stateStyle) {
        nym binding = getBinding();
        if (!style.isVisible() || !stateStyle.isVisible()) {
            StatusIndicatorView statusIndicatorView = binding.i;
            statusIndicatorView.getClass();
            statusIndicatorView.getClass();
            statusIndicatorView.setVisibility(8);
            return;
        }
        StatusIndicatorView statusIndicatorView2 = binding.i;
        StatusIndicatorView statusIndicatorView3 = binding.i;
        statusIndicatorView2.getClass();
        BlazeObjectPositioning position = style.getPosition();
        CardView cardView = binding.h;
        cardView.getClass();
        evl.i(statusIndicatorView2, position, cardView);
        statusIndicatorView3.getClass();
        evl.h(statusIndicatorView3, style.getMargins());
        BlazeInsets padding = style.getPadding();
        padding.getClass();
        boolean isVisible = stateStyle.isVisible();
        String text = stateStyle.getText();
        int textColor = stateStyle.getTextStyle().getTextColor();
        float textSize = stateStyle.getTextStyle().getTextSize();
        Integer fontResId = stateStyle.getTextStyle().getFontResId();
        int backgroundColor = stateStyle.getBackgroundColor();
        Integer backgroundImageResId = stateStyle.getBackgroundImageResId();
        BlazeDp cornerRadius = stateStyle.getCornerRadius();
        Float cornerRadiusRatio = stateStyle.getCornerRadiusRatio();
        int borderColor = stateStyle.getBorderColor();
        int toPx$blazesdk_release = stateStyle.getBorderWidth().getToPx$blazesdk_release();
        com.blaze.blazesdk.style.widgets.c icon$blazesdk_release = stateStyle.getIcon$blazesdk_release();
        statusIndicatorView3.setupView(new StatusIndicatorView.b(isVisible, text, textColor, textSize, fontResId, backgroundColor, backgroundImageResId, cornerRadius, cornerRadiusRatio, borderColor, toPx$blazesdk_release, icon$blazesdk_release != null ? new StatusIndicatorView.b.a(icon$blazesdk_release.a, icon$blazesdk_release.b) : null, padding, stateStyle.getBackgroundImageUrl$blazesdk_release()));
    }

    private final void setTitleAppearance(BlazeWidgetItemTitleStyle blazeItemTitle, int parentWidth, ipm item) {
        nym binding = getBinding();
        BlazeTextView blazeTextView = binding.j;
        blazeTextView.getClass();
        BlazeObjectPositioning position = blazeItemTitle.getPosition();
        CardView cardView = binding.h;
        cardView.getClass();
        evl.i(blazeTextView, position, cardView);
        BlazeTextView blazeTextView2 = binding.j;
        blazeTextView2.getClass();
        item.getClass();
        izk.a(blazeTextView2, item.d ? blazeItemTitle.getReadState() : blazeItemTitle.getUnreadState(), blazeItemTitle.getMargins(), Integer.valueOf(parentWidth));
        blazeTextView2.getClass();
        blazeTextView2.setVisibility(blazeItemTitle.isVisible() ? 0 : 8);
    }

    private final void setWidgetAppearance(ipm item, BlazeWidgetItemStyle widgetItemStyle, int parentWidth, int parentHeight) {
        BlazeWidgetItemStatusIndicatorStateStyle liveUnreadState;
        BlazeWidgetItemDurationElementStateStyle liveUnreadState2;
        BlazeWidgetItemBadgeStateStyle liveUnreadState3;
        BlazeTextView blazeTextView = getBinding().j;
        String str = item.b;
        BlazeLiveStreamStatus blazeLiveStreamStatus = item.h;
        blazeTextView.setText(str);
        String a = gxm.a(item.c, widgetItemStyle.getImage().getAnimatedThumbnail().isEnabled() ? BlazeWidgetItemImageStyle.BlazeThumbnailType.ANIMATED_THUMBNAIL_POSTER : widgetItemStyle.getImage().getThumbnailType());
        setTitleAppearance(widgetItemStyle.getTitle(), parentWidth, item);
        setPaddingAppearance(widgetItemStyle.getPadding());
        setWidgetImageAppearance(widgetItemStyle, parentWidth, parentHeight, a, item);
        BlazeWidgetItemStatusIndicatorStyle statusIndicator = widgetItemStyle.getStatusIndicator();
        statusIndicator.getClass();
        int i = blazeLiveStreamStatus == null ? -1 : bbm.a[blazeLiveStreamStatus.ordinal()];
        if (i == -1) {
            int ordinal = item.a().ordinal();
            if (ordinal == 0) {
                liveUnreadState = statusIndicator.getLiveUnreadState();
            } else if (ordinal == 1) {
                liveUnreadState = statusIndicator.getUnreadState();
            } else if (ordinal == 2) {
                liveUnreadState = statusIndicator.getLiveReadState();
            } else {
                if (ordinal != 3) {
                    zzl.b();
                    return;
                }
                liveUnreadState = statusIndicator.getReadState();
            }
        } else if (i == 1) {
            liveUnreadState = statusIndicator.getStreamStates$blazesdk_release().getLiveStreamState();
        } else if (i == 2) {
            liveUnreadState = statusIndicator.getStreamStates$blazesdk_release().getUpcomingStreamState();
        } else {
            if (i != 3) {
                zzl.b();
                return;
            }
            liveUnreadState = statusIndicator.getStreamStates$blazesdk_release().getEndedStreamState();
        }
        setStatusIndicatorAppearance(widgetItemStyle.getStatusIndicator(), liveUnreadState);
        if (blazeLiveStreamStatus != null) {
            setEventTimeElementAppearance(blazeLiveStreamStatus, widgetItemStyle.getEventTime$blazesdk_release(), item.i);
            WidgetTimeElementCustomView widgetTimeElementCustomView = getBinding().f;
            widgetTimeElementCustomView.getClass();
            evl.q(widgetTimeElementCustomView);
        } else {
            BlazeWidgetItemDurationElementStyle durationElement = widgetItemStyle.getDurationElement();
            durationElement.getClass();
            int ordinal2 = item.a().ordinal();
            if (ordinal2 == 0) {
                liveUnreadState2 = durationElement.getLiveUnreadState();
            } else if (ordinal2 == 1) {
                liveUnreadState2 = durationElement.getUnreadState();
            } else if (ordinal2 == 2) {
                liveUnreadState2 = durationElement.getLiveReadState();
            } else {
                if (ordinal2 != 3) {
                    zzl.b();
                    return;
                }
                liveUnreadState2 = durationElement.getReadState();
            }
            setDurationElementAppearance(widgetItemStyle.getDurationElement(), liveUnreadState2, item.f);
            WidgetTimeElementCustomView widgetTimeElementCustomView2 = getBinding().g;
            widgetTimeElementCustomView2.getClass();
            evl.q(widgetTimeElementCustomView2);
        }
        BlazeWidgetItemBadgeStyle badge = widgetItemStyle.getBadge();
        badge.getClass();
        int ordinal3 = item.a().ordinal();
        if (ordinal3 == 0) {
            liveUnreadState3 = badge.getLiveUnreadState();
        } else if (ordinal3 == 1) {
            liveUnreadState3 = badge.getUnreadState();
        } else if (ordinal3 == 2) {
            liveUnreadState3 = badge.getLiveReadState();
        } else {
            if (ordinal3 != 3) {
                zzl.b();
                return;
            }
            liveUnreadState3 = badge.getReadState();
        }
        setBadgeAppearance(widgetItemStyle.getBadge(), liveUnreadState3);
    }

    private final void setWidgetImageAppearance(BlazeWidgetItemStyle blazeWidgetItemAppearance, int parentWidth, int parentHeight, String imageUrl, ipm item) {
        ft8 ft8Var;
        nym binding = getBinding();
        BlazeWidgetItemImageStyle image = blazeWidgetItemAppearance.getImage();
        Size calculateImageSize = calculateImageSize(image, parentWidth, parentHeight);
        binding.h.getLayoutParams().width = calculateImageSize.getWidth();
        CardView cardView = binding.h;
        cardView.getLayoutParams().height = calculateImageSize.getHeight();
        evl.f(cardView);
        applyImagePositionConstraint(cardView, image.getPosition(), binding.a.getId());
        evl.h(cardView, image.getMargins());
        float a = tam.a(image.getCornerRadius(), image.getCornerRadiusRatio(), calculateImageSize.getWidth(), calculateImageSize.getHeight());
        setWidgetImageMutualCornerRadius(image, a, item);
        setBorderDistance(image.getBorder(), item);
        loadImageIfNeeded(imageUrl, a, new Size(calculateImageSize.getWidth(), calculateImageSize.getHeight()));
        setGradientAppearance(blazeWidgetItemAppearance, calculateImageSize.getHeight(), item);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new c(calculateImageSize, image));
            return;
        }
        try {
            ViewParent parent = getParent();
            ViewParent parent2 = parent != null ? parent.getParent() : null;
            RecyclerView recyclerView = parent2 instanceof RecyclerView ? (RecyclerView) parent2 : null;
            if (recyclerView == null || recyclerView.getWidth() == 0 || recyclerView.getHeight() == 0 || (ft8Var = this.onWidgetDrew) == null) {
                return;
            }
            ft8Var.invoke(Integer.valueOf(calculateImageSize.getWidth()), Integer.valueOf(calculateImageSize.getHeight()), image.getRatio(), Integer.valueOf(recyclerView.getWidth()), Integer.valueOf(recyclerView.getHeight()));
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    private final void setWidgetImageMutualCornerRadius(BlazeWidgetItemImageStyle blazeWidgetItemImageStyle, float cornerRadius, ipm item) {
        BlazeWidgetItemImageContainerBorderStateStyle a = ndm.a(blazeWidgetItemImageStyle.getBorder(), item);
        int color = (blazeWidgetItemImageStyle.getBorder().isVisible() && a.isVisible()) ? a.getColor() : 0;
        int toPx$blazesdk_release = a.getWidth().getToPx$blazesdk_release();
        GradientDrawable b2 = w1l.b(0);
        b2.setCornerRadii(new float[]{cornerRadius, cornerRadius, cornerRadius, cornerRadius, cornerRadius, cornerRadius, cornerRadius, cornerRadius});
        b2.setColor(0);
        b2.setStroke(toPx$blazesdk_release, color);
        nym binding = getBinding();
        binding.e.setBackground(b2);
        binding.h.setRadius(cornerRadius);
    }

    private final void setupView(Size containerSize) {
        BlazeWidgetItemStyle widgetItemStyle;
        ipm ipmVar;
        Size calculateItemSize = calculateItemSize(containerSize);
        if (calculateItemSize != null) {
            updateRootLayoutParams(calculateItemSize, containerSize.getWidth());
            setContainerRadiusBoundaries(calculateItemSize.getWidth(), calculateItemSize.getHeight());
            BlazeWidgetLayout blazeWidgetLayout = this.blazeWidgetLayout;
            if (blazeWidgetLayout == null || (widgetItemStyle = blazeWidgetLayout.getWidgetItemStyle()) == null || (ipmVar = this.widgetItem) == null) {
                return;
            }
            setWidgetAppearance(ipmVar, widgetItemStyle, calculateItemSize.getWidth(), calculateItemSize.getHeight());
        }
    }

    private final void updateAccessibilityIdentifiers(String accessibilityIdentifierPrefix) {
        ConstraintLayout constraintLayout = getBinding().a;
        constraintLayout.getClass();
        constraintLayout.getClass();
        constraintLayout.setTag(accessibilityIdentifierPrefix + "_cell");
        BlazeTextView blazeTextView = getBinding().j;
        blazeTextView.getClass();
        blazeTextView.getClass();
        blazeTextView.setTag(accessibilityIdentifierPrefix + "_title");
    }

    private final void updateRootLayoutParams(Size itemSize, int parentWidth) {
        ViewGroup.LayoutParams layoutParams;
        Integer maxDisplayItemsCount;
        BlazeWidgetLayout blazeWidgetLayout = this.blazeWidgetLayout;
        if (blazeWidgetLayout == null || (layoutParams = getBinding().a.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = itemSize.getHeight();
        if (this.blazeViewType != BlazeViewType.ROW_VIEW || (maxDisplayItemsCount = blazeWidgetLayout.getMaxDisplayItemsCount()) == null || maxDisplayItemsCount.intValue() != 1) {
            parentWidth = itemSize.getWidth();
        }
        layoutParams.width = parentWidth;
    }

    public final void initVariables(@NotNull xxl containerSizeProvider, @NotNull ipm item, @NotNull BlazeViewType blazeViewType, @NotNull BlazeWidgetLayout blazeLayout, @NotNull ft8 onWidgetDrew, @NotNull String accessibilityIdentifierPrefix) {
        containerSizeProvider.getClass();
        item.getClass();
        blazeViewType.getClass();
        blazeLayout.getClass();
        onWidgetDrew.getClass();
        accessibilityIdentifierPrefix.getClass();
        try {
            this.widgetItem = item;
            this.blazeViewType = blazeViewType;
            this.blazeWidgetLayout = blazeLayout;
            this.onWidgetDrew = onWidgetDrew;
            View view = (View) containerSizeProvider.a.get();
            Size size = view != null ? new Size(view.getWidth(), view.getHeight()) : null;
            if (size != null) {
                setupView(size);
            }
            updateAccessibilityIdentifiers(accessibilityIdentifierPrefix);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void playAnimatedThumbnail(@NotNull String widgetId) {
        BlazeWidgetLayout blazeWidgetLayout;
        BlazeWidgetItemStyle widgetItemStyle;
        BlazeWidgetItemImageStyle image;
        BlazeWidgetItemImageAnimatedThumbnailStyle animatedThumbnail;
        widgetId.getClass();
        ipm ipmVar = this.widgetItem;
        if (ipmVar == null || (blazeWidgetLayout = this.blazeWidgetLayout) == null || (widgetItemStyle = blazeWidgetLayout.getWidgetItemStyle()) == null || (image = widgetItemStyle.getImage()) == null || (animatedThumbnail = image.getAnimatedThumbnail()) == null) {
            return;
        }
        int i = 1;
        if (animatedThumbnail.isEnabled()) {
            ftl ftlVar = this.gif;
            if (ftlVar == null) {
                ImageView imageView = getBinding().l;
                imageView.getClass();
                ftlVar = new ftl(imageView, new ndk(this, 9));
            }
            this.gif = ftlVar;
            String a = gxm.a(ipmVar.c, BlazeWidgetItemImageStyle.BlazeThumbnailType.GIF);
            if (a.length() <= 0) {
                a = null;
            }
            if (a != null) {
                StringBuilder r = mz1.r(widgetId, a);
                r.append(ipmVar.a);
                String sb = r.toString();
                ftl ftlVar2 = this.gif;
                if (ftlVar2 != null) {
                    n0g c2 = com.bumptech.glide.a.c(ftlVar2.b.getContext());
                    c2.getClass();
                    ((c0g) new c0g(c2.a, c2, xx8.class, c2.b).a(n0g.l).w(a).m(new wjd(sb))).v(ftlVar2);
                }
            }
            ftl ftlVar3 = this.gif;
            if (ftlVar3 != null) {
                ftlVar3.e = new bpl(ftlVar3, i);
                xx8 xx8Var = ftlVar3.d;
                if (xx8Var != null) {
                    xx8Var.start();
                }
            }
        }
    }

    public final void stopAnimatedThumbnail() {
        ftl ftlVar = this.gif;
        if (ftlVar != null) {
            xx8 xx8Var = ftlVar.d;
            if (xx8Var != null) {
                xx8Var.stop();
            }
            ftlVar.e = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetItemCustomView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ WidgetItemCustomView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetItemCustomView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
