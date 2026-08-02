package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.tours.databinding.ViewToursFlightDetailsStageBinding;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.presentation.ToursFlightDetailsVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0014J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/view/ToursFlightDetailsStageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/travel/feature/tours/databinding/ViewToursFlightDetailsStageBinding;", "radius", "", "xRouteLine", "offset", "badgeAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/view/ToursFlightDetailsStageAdapter;", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "onLayout", "", "changed", "", "left", "top", "right", "bottom", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "flight", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO$FlightVO;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursFlightDetailsStageView extends ConstraintLayout {

    @NotNull
    private final ToursFlightDetailsStageAdapter badgeAdapter;

    @NotNull
    private final ViewToursFlightDetailsStageBinding binding;
    private final float offset;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;
    private final float radius;
    private final float xRouteLine;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToursFlightDetailsStageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bind(@NotNull ToursFlightDetailsVO.FlightVO flight) {
        Intrinsics.checkNotNullParameter(flight, "flight");
        ShapeableImageView toursFlightDetailsCompanySIV = this.binding.toursFlightDetailsCompanySIV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsCompanySIV, "toursFlightDetailsCompanySIV");
        ImageViewExtKt.load$default(toursFlightDetailsCompanySIV, flight.getLogoImageURL(), null, null, null, null, false, null, 126, null);
        TextAtomView toursFlightDetailsAirlineTAV = this.binding.toursFlightDetailsAirlineTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsAirlineTAV, "toursFlightDetailsAirlineTAV");
        TextAtomHolderKt.bind$default(toursFlightDetailsAirlineTAV, flight.getAirlineName(), null, 2, null);
        TextAtomView toursFlightDetailsSubtitleTAV = this.binding.toursFlightDetailsSubtitleTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsSubtitleTAV, "toursFlightDetailsSubtitleTAV");
        TextAtomHolderKt.bind$default(toursFlightDetailsSubtitleTAV, flight.getSubtitle(), null, 2, null);
        RecyclerView toursFlightDetailsBadgesRv = this.binding.toursFlightDetailsBadgesRv;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsBadgesRv, "toursFlightDetailsBadgesRv");
        toursFlightDetailsBadgesRv.setVisibility(flight.getIsBadgesVisible() ? 0 : 8);
        this.badgeAdapter.setItems(flight.getBadges());
        TextAtomView toursFlightDetailsFromTimeTAV = this.binding.toursFlightDetailsFromTimeTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsFromTimeTAV, "toursFlightDetailsFromTimeTAV");
        TextAtomHolderKt.bind$default(toursFlightDetailsFromTimeTAV, flight.getDeparture().getTime(), null, 2, null);
        TextAtomView toursFlightDetailsFromDateTAV = this.binding.toursFlightDetailsFromDateTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsFromDateTAV, "toursFlightDetailsFromDateTAV");
        TextAtomHolderKt.bind$default(toursFlightDetailsFromDateTAV, flight.getDeparture().getDate(), null, 2, null);
        TextAtomView toursFlightDetailsFromCityTAV = this.binding.toursFlightDetailsFromCityTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsFromCityTAV, "toursFlightDetailsFromCityTAV");
        TextAtomHolderKt.bind$default(toursFlightDetailsFromCityTAV, flight.getDeparture().getCity(), null, 2, null);
        TextAtomView toursFlightDetailsFromAirportTAV = this.binding.toursFlightDetailsFromAirportTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsFromAirportTAV, "toursFlightDetailsFromAirportTAV");
        TextAtomHolderKt.bind$default(toursFlightDetailsFromAirportTAV, flight.getDeparture().getAirport(), null, 2, null);
        TextAtomView toursFlightDetailsToTimeTAV = this.binding.toursFlightDetailsToTimeTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsToTimeTAV, "toursFlightDetailsToTimeTAV");
        TextAtomHolderKt.bind$default(toursFlightDetailsToTimeTAV, flight.getArrival().getTime(), null, 2, null);
        TextAtomView toursFlightDetailsToDateTAV = this.binding.toursFlightDetailsToDateTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsToDateTAV, "toursFlightDetailsToDateTAV");
        TextAtomHolderKt.bind$default(toursFlightDetailsToDateTAV, flight.getArrival().getDate(), null, 2, null);
        TextAtomView toursFlightDetailsToCityTAV = this.binding.toursFlightDetailsToCityTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsToCityTAV, "toursFlightDetailsToCityTAV");
        TextAtomHolderKt.bind$default(toursFlightDetailsToCityTAV, flight.getArrival().getCity(), null, 2, null);
        TextAtomView toursFlightDetailsToAirportTAV = this.binding.toursFlightDetailsToAirportTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsToAirportTAV, "toursFlightDetailsToAirportTAV");
        TextAtomHolderKt.bind$default(toursFlightDetailsToAirportTAV, flight.getArrival().getAirport(), null, 2, null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        canvas.drawPath(this.path, this.paint);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Path path = this.path;
        path.rewind();
        float f7 = this.xRouteLine;
        float y11 = this.binding.toursFlightDetailsFromTimeTAV.getY() + this.offset;
        float f11 = this.radius;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(f7, y11, f11, direction);
        path.addCircle(this.xRouteLine, this.binding.toursFlightDetailsToTimeTAV.getY() + this.offset, this.radius, direction);
        path.moveTo(this.xRouteLine, this.binding.toursFlightDetailsFromTimeTAV.getY() + this.offset + this.radius);
        path.lineTo(this.xRouteLine, (this.binding.toursFlightDetailsToTimeTAV.getY() + this.offset) - this.radius);
    }

    public /* synthetic */ ToursFlightDetailsStageView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursFlightDetailsStageView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewToursFlightDetailsStageBinding inflate = ViewToursFlightDetailsStageBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        float pxF = ResourceExtKt.toPxF(3, context);
        this.radius = pxF;
        this.xRouteLine = ResourceExtKt.toPxF(29, context) + pxF;
        this.offset = ResourceExtKt.toPxF(10, context);
        ToursFlightDetailsStageAdapter toursFlightDetailsStageAdapter = new ToursFlightDetailsStageAdapter();
        this.badgeAdapter = toursFlightDetailsStageAdapter;
        this.path = new Path();
        Paint paint = new Paint(1);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.textOriginalpriceAvailable));
        paint.setStrokeWidth(ResourceExtKt.toPxF(2, context));
        paint.setStyle(Paint.Style.STROKE);
        this.paint = paint;
        RecyclerView recyclerView = inflate.toursFlightDetailsBadgesRv;
        recyclerView.setAdapter(toursFlightDetailsStageAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.addItemDecoration(new ToursFlightDetailsStageDecoration(context));
    }
}
