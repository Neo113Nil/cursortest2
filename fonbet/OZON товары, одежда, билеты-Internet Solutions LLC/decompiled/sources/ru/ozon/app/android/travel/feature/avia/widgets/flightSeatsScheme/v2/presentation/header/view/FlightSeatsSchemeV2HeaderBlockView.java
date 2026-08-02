package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header.view;

import Am.C2438a;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header.FlightSeatsSchemeV2HeaderBlockVI;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0010\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!J\b\u0010\"\u001a\u00020\u001bH\u0002J\u001e\u0010#\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/view/FlightSeatsSchemeV2HeaderBlockView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp12", "dp16", "dp20", "", "titleTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTextView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "subtitleTextView", "getSubtitleTextView", "subtitleTextView$delegate", "shimmerView", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/view/FlightSeatsSchemeV2HeaderBlockShimmerView;", "headerBackground", "Landroid/graphics/drawable/ShapeDrawable;", "headerBackgroundWithRadius", "showContent", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/FlightSeatsSchemeV2HeaderBlockVI;", "showShimmerView", "showEmptyState", "headerTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "addChildren", "compound", "subtitle", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2HeaderBlockView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightSeatsSchemeV2HeaderBlockView.class, "titleTextView", "getTitleTextView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(FlightSeatsSchemeV2HeaderBlockView.class, "subtitleTextView", "getSubtitleTextView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;
    private final int dp12;
    private final int dp16;
    private final float dp20;
    private final int dp4;

    @NotNull
    private final ShapeDrawable headerBackground;

    @NotNull
    private final ShapeDrawable headerBackgroundWithRadius;

    @NotNull
    private final FlightSeatsSchemeV2HeaderBlockShimmerView shimmerView;

    /* renamed from: subtitleTextView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate subtitleTextView;

    /* renamed from: titleTextView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemeV2HeaderBlockView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        int px = ResourceExtKt.toPx(12, context);
        this.dp12 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        float pxF = ResourceExtKt.toPxF(20, context);
        this.dp20 = pxF;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTextView = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new FlightSeatsSchemeV2HeaderBlockView$special$$inlined$preCreationViewPool$default$1(this), new FlightSeatsSchemeV2HeaderBlockView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.subtitleTextView = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new FlightSeatsSchemeV2HeaderBlockView$special$$inlined$preCreationViewPool$default$3(this), new FlightSeatsSchemeV2HeaderBlockView$special$$inlined$preCreationViewPool$default$4());
        FlightSeatsSchemeV2HeaderBlockShimmerView flightSeatsSchemeV2HeaderBlockShimmerView = new FlightSeatsSchemeV2HeaderBlockShimmerView(context);
        flightSeatsSchemeV2HeaderBlockShimmerView.setId(View.generateViewId());
        flightSeatsSchemeV2HeaderBlockShimmerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        flightSeatsSchemeV2HeaderBlockShimmerView.setVisibility(8);
        this.shimmerView = flightSeatsSchemeV2HeaderBlockShimmerView;
        this.headerBackground = RoundedBackgroundProducer.produce$default(new RoundedBackgroundProducer(), ThemeExtKt.themeColor(context, R$attr.layerFloor1), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        this.headerBackgroundWithRadius = RoundedBackgroundProducer.produce$default(new RoundedBackgroundProducer(), ThemeExtKt.themeColor(context, R$attr.layerFloor1), 0.0f, 0.0f, pxF, pxF, 6, null);
        setPadding(px2, 0, px2, px);
        addChildren();
    }

    private final void addChildren() {
        addView(getTitleTextView());
        addView(getSubtitleTextView());
        addView(this.shimmerView);
        ConstraintLayoutExtKt.updateConstraints(this, new FlightSeatsSchemeV2HeaderBlockView$addChildren$1(this));
    }

    private final TextDTO compound(TextDTO subtitle, String name) {
        if (subtitle == null || name == null) {
            return subtitle;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(subtitle.getText()).append((CharSequence) " ").append((CharSequence) name);
        Intrinsics.checkNotNullExpressionValue(append, "append(...)");
        return TextDTO.copy$default(subtitle, OzonSpannableStringKt.toOzonSpannableString(append), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getSubtitleTextView() {
        return (TextAtomV2View) this.subtitleTextView.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTitleTextView() {
        return (TextAtomV2View) this.titleTextView.getValue(this, $$delegatedProperties[0]);
    }

    public final void showContent(@NotNull FlightSeatsSchemeV2HeaderBlockVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setBackground(this.headerBackground);
        TextHolderKt.bindOrGone$default(getTitleTextView(), item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(getSubtitleTextView(), compound(item.getSubtitle(), item.getSubtitleName()), null, 2, null);
        ViewExtKt.gone(this.shimmerView);
    }

    public final void showEmptyState(TextDTO headerTitle) {
        setBackground(this.headerBackgroundWithRadius);
        this.shimmerView.setVisibility(8);
        TextHolderKt.bindOrGone$default(getTitleTextView(), headerTitle, null, 2, null);
        ViewExtKt.gone(getSubtitleTextView());
    }

    public final void showShimmerView() {
        setBackground(this.headerBackground);
        this.shimmerView.setVisibility(0);
        ViewExtKt.gone(getTitleTextView());
        ViewExtKt.gone(getSubtitleTextView());
    }
}
