package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.shimmer;

import Ej.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000234B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001dH\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020,2\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2;", "createItems", "()[Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeSeatRowShimmerViewV2;", "createSeatRowView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeSeatRowShimmerViewV2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeLiteralRowShimmerViewV2;", "createLiteralRowView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeLiteralRowShimmerViewV2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeExitRowShimmerViewV2;", "createExitRowView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeExitRowShimmerViewV2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeBottomRowShimmerViewV2;", "createBottomRowView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeBottomRowShimmerViewV2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeLegendShimmerViewV2;", "createLegendView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeLegendShimmerViewV2;", "Landroid/graphics/drawable/Drawable;", "createSeatBackground", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "", "isLiteralRow", "(I)Z", "shimmerItems", "[Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2;", "seatBackground", "Landroid/graphics/drawable/Drawable;", "ShimmerViewHolder", "ShimmerTypeV2", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeShimmerAdapterV2 extends RecyclerView.g<RecyclerView.C> {

    @NotNull
    private final Drawable seatBackground;

    @NotNull
    private final ShimmerTypeV2[] shimmerItems;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2;", "", "type", "", "<init>", "(I)V", "getType", "()I", "SeatRow", "LiteralRow", "ExitRow", "BottomRow", "Legend", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2$BottomRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2$ExitRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2$Legend;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2$LiteralRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2$SeatRow;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static abstract class ShimmerTypeV2 {
        private final int type;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2$BottomRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BottomRow extends ShimmerTypeV2 {

            @NotNull
            public static final BottomRow INSTANCE = new BottomRow();

            private BottomRow() {
                super(3, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof BottomRow);
            }

            public int hashCode() {
                return -1643895866;
            }

            @NotNull
            public String toString() {
                return "BottomRow";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2$ExitRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ExitRow extends ShimmerTypeV2 {

            @NotNull
            public static final ExitRow INSTANCE = new ExitRow();

            private ExitRow() {
                super(2, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ExitRow);
            }

            public int hashCode() {
                return -425798221;
            }

            @NotNull
            public String toString() {
                return "ExitRow";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2$Legend;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Legend extends ShimmerTypeV2 {

            @NotNull
            public static final Legend INSTANCE = new Legend();

            private Legend() {
                super(4, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Legend);
            }

            public int hashCode() {
                return -1632066730;
            }

            @NotNull
            public String toString() {
                return "Legend";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2$LiteralRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LiteralRow extends ShimmerTypeV2 {

            @NotNull
            public static final LiteralRow INSTANCE = new LiteralRow();

            private LiteralRow() {
                super(1, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LiteralRow);
            }

            public int hashCode() {
                return 516391284;
            }

            @NotNull
            public String toString() {
                return "LiteralRow";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2$SeatRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerTypeV2;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SeatRow extends ShimmerTypeV2 {

            @NotNull
            public static final SeatRow INSTANCE = new SeatRow();

            private SeatRow() {
                super(0, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof SeatRow);
            }

            public int hashCode() {
                return -1436990612;
            }

            @NotNull
            public String toString() {
                return "SeatRow";
            }
        }

        public /* synthetic */ ShimmerTypeV2(int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11);
        }

        public final int getType() {
            return this.type;
        }

        private ShimmerTypeV2(int i11) {
            this.type = i11;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapterV2$ShimmerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ShimmerViewHolder extends RecyclerView.C {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShimmerViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    public FlightSchemeShimmerAdapterV2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.shimmerItems = createItems();
        this.seatBackground = createSeatBackground(context);
    }

    private final FlightSchemeBottomRowShimmerViewV2 createBottomRowView(Context context) {
        FlightSchemeBottomRowShimmerViewV2 flightSchemeBottomRowShimmerViewV2 = new FlightSchemeBottomRowShimmerViewV2(context);
        flightSchemeBottomRowShimmerViewV2.setLayoutParams(new RecyclerView.p(-1, -2));
        return flightSchemeBottomRowShimmerViewV2;
    }

    private final FlightSchemeExitRowShimmerViewV2 createExitRowView(Context context) {
        FlightSchemeExitRowShimmerViewV2 flightSchemeExitRowShimmerViewV2 = new FlightSchemeExitRowShimmerViewV2(context);
        flightSchemeExitRowShimmerViewV2.setLayoutParams(new RecyclerView.p(-1, -2));
        return flightSchemeExitRowShimmerViewV2;
    }

    private final ShimmerTypeV2[] createItems() {
        ShimmerTypeV2[] shimmerTypeV2Arr = new ShimmerTypeV2[17];
        int i11 = 0;
        while (i11 < 17) {
            shimmerTypeV2Arr[i11] = i11 == 0 ? ShimmerTypeV2.Legend.INSTANCE : 1 == i11 ? ShimmerTypeV2.LiteralRow.INSTANCE : 16 == i11 ? ShimmerTypeV2.BottomRow.INSTANCE : 2 == i11 ? ShimmerTypeV2.ExitRow.INSTANCE : ShimmerTypeV2.SeatRow.INSTANCE;
            i11++;
        }
        return shimmerTypeV2Arr;
    }

    private final FlightSchemeLegendShimmerViewV2 createLegendView(Context context) {
        FlightSchemeLegendShimmerViewV2 flightSchemeLegendShimmerViewV2 = new FlightSchemeLegendShimmerViewV2(context);
        flightSchemeLegendShimmerViewV2.setLayoutParams(new RecyclerView.p(-1, -2));
        return flightSchemeLegendShimmerViewV2;
    }

    private final FlightSchemeLiteralRowShimmerViewV2 createLiteralRowView(Context context) {
        FlightSchemeLiteralRowShimmerViewV2 flightSchemeLiteralRowShimmerViewV2 = new FlightSchemeLiteralRowShimmerViewV2(context);
        flightSchemeLiteralRowShimmerViewV2.setLayoutParams(new RecyclerView.p(-1, -2));
        return flightSchemeLiteralRowShimmerViewV2;
    }

    private final Drawable createSeatBackground(Context context) {
        float pxF = ResourceExtKt.toPxF(8, context);
        float pxF2 = ResourceExtKt.toPxF(3, context);
        return new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerSurface), pxF, pxF, pxF2, pxF2);
    }

    private final FlightSchemeSeatRowShimmerViewV2 createSeatRowView(Context context) {
        FlightSchemeSeatRowShimmerViewV2 flightSchemeSeatRowShimmerViewV2 = new FlightSchemeSeatRowShimmerViewV2(context, this.seatBackground);
        flightSchemeSeatRowShimmerViewV2.setLayoutParams(new RecyclerView.p(-1, -2));
        return flightSchemeSeatRowShimmerViewV2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.shimmerItems.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return this.shimmerItems[position].getType();
    }

    public final boolean isLiteralRow(int position) {
        return this.shimmerItems[position] instanceof ShimmerTypeV2.LiteralRow;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View createSeatRowView;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        if (viewType == 0) {
            Intrinsics.f(context);
            createSeatRowView = createSeatRowView(context);
        } else if (viewType == 1) {
            Intrinsics.f(context);
            createSeatRowView = createLiteralRowView(context);
        } else if (viewType == 2) {
            Intrinsics.f(context);
            createSeatRowView = createExitRowView(context);
        } else if (viewType == 3) {
            Intrinsics.f(context);
            createSeatRowView = createBottomRowView(context);
        } else {
            if (viewType != 4) {
                throw new IllegalArgumentException(b.a(viewType, "Unknown view type for shimmer :"));
            }
            Intrinsics.f(context);
            createSeatRowView = createLegendView(context);
        }
        return new ShimmerViewHolder(createSeatRowView);
    }
}
