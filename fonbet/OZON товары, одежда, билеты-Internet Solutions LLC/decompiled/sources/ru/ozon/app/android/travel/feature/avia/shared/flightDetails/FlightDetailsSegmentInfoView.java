package ru.ozon.app.android.travel.feature.avia.shared.flightDetails;

import D40.a;
import F3.G;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.AviaDetailsItem;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsSegmentInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "timeTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "dateTAV", "cityTAV", "airportTAV", "guidelineG", "Landroidx/constraintlayout/widget/Guideline;", "dp2", "dp8", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$SegmentVO$SegmentInfoVO;", "setConstraints", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FlightDetailsSegmentInfoView extends ConstraintLayout {

    @NotNull
    private final TextAtomV2View airportTAV;

    @NotNull
    private final TextAtomV2View cityTAV;

    @NotNull
    private final TextAtomV2View dateTAV;
    private final int dp2;
    private final int dp8;

    @NotNull
    private final Guideline guidelineG;

    @NotNull
    private final TextAtomV2View timeTAV;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlightDetailsSegmentInfoView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new FlightDetailsSegmentInfoView$setConstraints$1(this));
    }

    public final void bind(@NotNull AviaDetailsItem.SegmentVO.SegmentInfoVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(this.timeTAV, item.getTime(), null, 2, null);
        TextHolderKt.bind$default(this.dateTAV, item.getDate(), null, 2, null);
        TextHolderKt.bind$default(this.cityTAV, item.getCity(), null, 2, null);
        TextHolderKt.bind$default(this.airportTAV, item.getAirport(), null, 2, null);
        this.dateTAV.setTextSize(1, 14.0f);
        this.airportTAV.setTextSize(1, 14.0f);
    }

    public /* synthetic */ FlightDetailsSegmentInfoView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightDetailsSegmentInfoView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View, R$id.flightDetailsTimeTAV, 0, -2);
        this.timeTAV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View2, R$id.flightDetailsDateTAV, 0, -2);
        this.dateTAV = textAtomV2View2;
        TextAtomV2View textAtomV2View3 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View3, R$id.flightDetailsCityTAV, 0, -2);
        this.cityTAV = textAtomV2View3;
        TextAtomV2View textAtomV2View4 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View4, R$id.flightDetailsAirportTAV, 0, -2);
        this.airportTAV = textAtomV2View4;
        Guideline guideline = new Guideline(context);
        ConstraintLayout.b a11 = a.a(guideline, R$id.flightDetailsGuidelineG, -2, -2);
        a11.f41615V = 1;
        a11.f41620a = UiExtKt.toPx(88, context);
        guideline.setLayoutParams(a11);
        this.guidelineG = guideline;
        this.dp2 = UiExtKt.toPx(2, context);
        this.dp8 = UiExtKt.toPx(8, context);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(textAtomV2View3);
        addView(textAtomV2View4);
        addView(guideline);
        setConstraints();
    }
}
