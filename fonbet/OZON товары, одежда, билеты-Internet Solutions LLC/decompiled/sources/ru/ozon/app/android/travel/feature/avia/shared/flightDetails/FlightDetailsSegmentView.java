package ru.ozon.app.android.travel.feature.avia.shared.flightDetails;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.databinding.ViewFlightDetailsSegmentBinding;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.AviaDetailsItem;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0014J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u000e\u0010'\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u000e\u0010(\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u000e\u0010*\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u000e\u0010+\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u000e\u0010,\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u000e\u0010-\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u000e\u0010.\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\b\u0010/\u001a\u00020\rH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsSegmentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "radius", "", "dp12", "dp16", "dpf16", "dpf44", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/ViewFlightDetailsSegmentBinding;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "onSizeChanged", "", "width", "height", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "segment", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$SegmentVO;", "bindAirlineLogo", "bindSubAirlineLogo", "bindBadge", "bindAirline", "bindSegmentDuration", "bindSegmentAirplane", "bindSegmentDeparture", "bindSegmentArrival", "bindLuggageBadges", "createPaint", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FlightDetailsSegmentView extends ConstraintLayout {

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final ViewFlightDetailsSegmentBinding binding;
    private final int dp12;
    private final int dp16;
    private final float dpf16;
    private final float dpf44;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;
    private final float radius;

    public /* synthetic */ FlightDetailsSegmentView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final Paint createPaint() {
        Paint paint = new Paint();
        paint.setStrokeWidth(ResourceExtKt.toPxF(2));
        paint.setStyle(Paint.Style.STROKE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.textOriginalpriceAvailable));
        return paint;
    }

    public final void bind(@NotNull AviaDetailsItem.SegmentVO segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        bindAirlineLogo(segment);
        bindSubAirlineLogo(segment);
        bindBadge(segment);
        bindAirline(segment);
        bindSegmentDuration(segment);
        bindSegmentAirplane(segment);
        bindSegmentDeparture(segment);
        bindSegmentArrival(segment);
        bindLuggageBadges(segment);
    }

    public final void bindAirline(@NotNull AviaDetailsItem.SegmentVO segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        TextAtomV2View aviaDetailedInfoV3AirlineTAV = this.binding.aviaDetailedInfoV3AirlineTAV;
        Intrinsics.checkNotNullExpressionValue(aviaDetailedInfoV3AirlineTAV, "aviaDetailedInfoV3AirlineTAV");
        TextHolderKt.bind$default(aviaDetailedInfoV3AirlineTAV, segment.getAirline(), null, 2, null);
    }

    public final void bindAirlineLogo(@NotNull AviaDetailsItem.SegmentVO segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        IconView aviaDetailedInfoV3AirlineLogoIV = this.binding.aviaDetailedInfoV3AirlineLogoIV;
        Intrinsics.checkNotNullExpressionValue(aviaDetailedInfoV3AirlineLogoIV, "aviaDetailedInfoV3AirlineLogoIV");
        IconHolderKt.bind$default(aviaDetailedInfoV3AirlineLogoIV, segment.getAirlineLogo(), null, 2, null);
    }

    public final void bindBadge(@NotNull AviaDetailsItem.SegmentVO segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        BadgeView aviaDetailedInfoV3BadgeVB = this.binding.aviaDetailedInfoV3BadgeVB;
        Intrinsics.checkNotNullExpressionValue(aviaDetailedInfoV3BadgeVB, "aviaDetailedInfoV3BadgeVB");
        BadgeHolderKt.bind$default(aviaDetailedInfoV3BadgeVB, segment.getSegmentBadge(), (Function1) null, 2, (Object) null);
    }

    public final void bindLuggageBadges(@NotNull AviaDetailsItem.SegmentVO segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, segment.getLuggageBadges());
    }

    public final void bindSegmentAirplane(@NotNull AviaDetailsItem.SegmentVO segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        TextAtomV2View aviaDetailedInfoV3SegmentAirplaneTAV = this.binding.aviaDetailedInfoV3SegmentAirplaneTAV;
        Intrinsics.checkNotNullExpressionValue(aviaDetailedInfoV3SegmentAirplaneTAV, "aviaDetailedInfoV3SegmentAirplaneTAV");
        TextHolderKt.bindOrGone$default(aviaDetailedInfoV3SegmentAirplaneTAV, segment.getSegmentAirplane(), null, 2, null);
    }

    public final void bindSegmentArrival(@NotNull AviaDetailsItem.SegmentVO segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        this.binding.aviaDetailedInfoV3SegmentArrival.bind(segment.getSegmentArrival());
    }

    public final void bindSegmentDeparture(@NotNull AviaDetailsItem.SegmentVO segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        this.binding.aviaDetailedInfoV3SegmentDeparture.bind(segment.getSegmentDeparture());
    }

    public final void bindSegmentDuration(@NotNull AviaDetailsItem.SegmentVO segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        TextAtomV2View aviaDetailedInfoV3SegmentDurationTAV = this.binding.aviaDetailedInfoV3SegmentDurationTAV;
        Intrinsics.checkNotNullExpressionValue(aviaDetailedInfoV3SegmentDurationTAV, "aviaDetailedInfoV3SegmentDurationTAV");
        TextHolderKt.bind$default(aviaDetailedInfoV3SegmentDurationTAV, segment.getSegmentDuration(), null, 2, null);
    }

    public final void bindSubAirlineLogo(@NotNull AviaDetailsItem.SegmentVO segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        IconView aviaDetailedInfoV3SubAirlineLogoIV = this.binding.aviaDetailedInfoV3SubAirlineLogoIV;
        Intrinsics.checkNotNullExpressionValue(aviaDetailedInfoV3SubAirlineLogoIV, "aviaDetailedInfoV3SubAirlineLogoIV");
        IconHolderKt.bindOrGone$default(aviaDetailedInfoV3SubAirlineLogoIV, segment.getSubAirlineLogo(), null, 2, null);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.path, this.paint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, final int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        FlightDetailsSegmentInfoView aviaDetailedInfoV3SegmentDeparture = this.binding.aviaDetailedInfoV3SegmentDeparture;
        Intrinsics.checkNotNullExpressionValue(aviaDetailedInfoV3SegmentDeparture, "aviaDetailedInfoV3SegmentDeparture");
        if (!aviaDetailedInfoV3SegmentDeparture.isLaidOut() || aviaDetailedInfoV3SegmentDeparture.isLayoutRequested()) {
            aviaDetailedInfoV3SegmentDeparture.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsSegmentView$onSizeChanged$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    float y11 = FlightDetailsSegmentView.this.binding.aviaDetailedInfoV3SegmentDeparture.getY() + FlightDetailsSegmentView.this.dp12;
                    Path path = FlightDetailsSegmentView.this.path;
                    path.rewind();
                    float f7 = FlightDetailsSegmentView.this.dpf16;
                    float f11 = FlightDetailsSegmentView.this.radius;
                    Path.Direction direction = Path.Direction.CW;
                    path.addCircle(f7, y11, f11, direction);
                    path.addCircle(FlightDetailsSegmentView.this.dpf16, height - FlightDetailsSegmentView.this.dpf44, FlightDetailsSegmentView.this.radius, direction);
                    path.moveTo(FlightDetailsSegmentView.this.dpf16, FlightDetailsSegmentView.this.radius + y11);
                    path.lineTo(FlightDetailsSegmentView.this.dpf16, (height - FlightDetailsSegmentView.this.dpf44) - FlightDetailsSegmentView.this.radius);
                }
            });
            return;
        }
        float y11 = this.binding.aviaDetailedInfoV3SegmentDeparture.getY() + this.dp12;
        Path path = this.path;
        path.rewind();
        float f7 = this.dpf16;
        float f11 = this.radius;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(f7, y11, f11, direction);
        float f12 = height;
        path.addCircle(this.dpf16, f12 - this.dpf44, this.radius, direction);
        path.moveTo(this.dpf16, this.radius + y11);
        path.lineTo(this.dpf16, (f12 - this.dpf44) - this.radius);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightDetailsSegmentView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        this.paint = createPaint();
        this.path = new Path();
        this.radius = dimens$default.getRadius4();
        this.dp12 = dimens$default.getMargin12();
        int margin16 = dimens$default.getMargin16();
        this.dp16 = margin16;
        this.dpf16 = dimens$default.getMargin16();
        this.dpf44 = dimens$default.getMargin44();
        ViewFlightDetailsSegmentBinding inflate = ViewFlightDetailsSegmentBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        inflate.aviaDetailedInfoV3LuggageBadgesHFAL.setAdapter(atomsAdapter);
        setWillNotDraw(false);
        setPadding(0, margin16, 0, margin16);
    }
}
