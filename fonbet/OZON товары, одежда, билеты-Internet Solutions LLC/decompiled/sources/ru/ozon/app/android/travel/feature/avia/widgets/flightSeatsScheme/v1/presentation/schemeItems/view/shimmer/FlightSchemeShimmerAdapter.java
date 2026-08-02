package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view.shimmer;

import Ej.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000267B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020 2\u0006\u0010$\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020 H\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020/2\u0006\u0010$\u001a\u00020 ¢\u0006\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType;", "createItems", "()[Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeSeatRowShimmerView;", "createSeatRowView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeSeatRowShimmerView;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeLiteralRowShimmerView;", "createLiteralRowView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeLiteralRowShimmerView;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeExitRowShimmerView;", "createExitRowView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeExitRowShimmerView;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeTopRowShimmerView;", "createTopRowView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeTopRowShimmerView;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeBottomRowShimmerView;", "creareBottomRowView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeBottomRowShimmerView;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeLegendShimmerView;", "createLegendView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeLegendShimmerView;", "Landroid/graphics/drawable/Drawable;", "createSeatBackground", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "", "isTopRow", "(I)Z", "shimmerItems", "[Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType;", "seatBackground", "Landroid/graphics/drawable/Drawable;", "ShimmerViewHolder", "ShimmerType", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeShimmerAdapter extends RecyclerView.g<RecyclerView.C> {

    @NotNull
    private final Drawable seatBackground;

    @NotNull
    private final ShimmerType[] shimmerItems;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType;", "", "type", "", "<init>", "(I)V", "getType", "()I", "SeatRow", "LiteralRow", "ExitRow", "TopRow", "BottomRow", "Legend", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType$BottomRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType$ExitRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType$Legend;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType$LiteralRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType$SeatRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType$TopRow;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static abstract class ShimmerType {
        private final int type;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType$BottomRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BottomRow extends ShimmerType {

            @NotNull
            public static final BottomRow INSTANCE = new BottomRow();

            private BottomRow() {
                super(4, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof BottomRow);
            }

            public int hashCode() {
                return -1377002001;
            }

            @NotNull
            public String toString() {
                return "BottomRow";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType$ExitRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ExitRow extends ShimmerType {

            @NotNull
            public static final ExitRow INSTANCE = new ExitRow();

            private ExitRow() {
                super(2, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ExitRow);
            }

            public int hashCode() {
                return -1551776228;
            }

            @NotNull
            public String toString() {
                return "ExitRow";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType$Legend;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Legend extends ShimmerType {

            @NotNull
            public static final Legend INSTANCE = new Legend();

            private Legend() {
                super(5, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Legend);
            }

            public int hashCode() {
                return 686916045;
            }

            @NotNull
            public String toString() {
                return "Legend";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType$LiteralRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LiteralRow extends ShimmerType {

            @NotNull
            public static final LiteralRow INSTANCE = new LiteralRow();

            private LiteralRow() {
                super(1, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LiteralRow);
            }

            public int hashCode() {
                return 200166507;
            }

            @NotNull
            public String toString() {
                return "LiteralRow";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType$SeatRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SeatRow extends ShimmerType {

            @NotNull
            public static final SeatRow INSTANCE = new SeatRow();

            private SeatRow() {
                super(0, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof SeatRow);
            }

            public int hashCode() {
                return 1731998677;
            }

            @NotNull
            public String toString() {
                return "SeatRow";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType$TopRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TopRow extends ShimmerType {

            @NotNull
            public static final TopRow INSTANCE = new TopRow();

            private TopRow() {
                super(3, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof TopRow);
            }

            public int hashCode() {
                return 925434373;
            }

            @NotNull
            public String toString() {
                return "TopRow";
            }
        }

        public /* synthetic */ ShimmerType(int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11);
        }

        public final int getType() {
            return this.type;
        }

        private ShimmerType(int i11) {
            this.type = i11;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/shimmer/FlightSchemeShimmerAdapter$ShimmerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ShimmerViewHolder extends RecyclerView.C {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShimmerViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    public FlightSchemeShimmerAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.shimmerItems = createItems();
        this.seatBackground = createSeatBackground(context);
    }

    private final FlightSchemeBottomRowShimmerView creareBottomRowView(Context context) {
        FlightSchemeBottomRowShimmerView flightSchemeBottomRowShimmerView = new FlightSchemeBottomRowShimmerView(context);
        flightSchemeBottomRowShimmerView.setLayoutParams(new RecyclerView.p(-1, -2));
        return flightSchemeBottomRowShimmerView;
    }

    private final FlightSchemeExitRowShimmerView createExitRowView(Context context) {
        FlightSchemeExitRowShimmerView flightSchemeExitRowShimmerView = new FlightSchemeExitRowShimmerView(context);
        flightSchemeExitRowShimmerView.setLayoutParams(new RecyclerView.p(-1, -2));
        return flightSchemeExitRowShimmerView;
    }

    private final ShimmerType[] createItems() {
        int[] iArr = {2, 33};
        int[] iArr2 = {17, 19};
        ShimmerType[] shimmerTypeArr = new ShimmerType[35];
        int i11 = 0;
        while (i11 < 35) {
            shimmerTypeArr[i11] = i11 == 0 ? ShimmerType.Legend.INSTANCE : 1 == i11 ? ShimmerType.TopRow.INSTANCE : 34 == i11 ? ShimmerType.BottomRow.INSTANCE : C7705l.k(iArr, i11) ? ShimmerType.LiteralRow.INSTANCE : C7705l.k(iArr2, i11) ? ShimmerType.ExitRow.INSTANCE : ShimmerType.SeatRow.INSTANCE;
            i11++;
        }
        return shimmerTypeArr;
    }

    private final FlightSchemeLegendShimmerView createLegendView(Context context) {
        FlightSchemeLegendShimmerView flightSchemeLegendShimmerView = new FlightSchemeLegendShimmerView(context);
        flightSchemeLegendShimmerView.setLayoutParams(new RecyclerView.p(-1, -2));
        return flightSchemeLegendShimmerView;
    }

    private final FlightSchemeLiteralRowShimmerView createLiteralRowView(Context context) {
        FlightSchemeLiteralRowShimmerView flightSchemeLiteralRowShimmerView = new FlightSchemeLiteralRowShimmerView(context);
        flightSchemeLiteralRowShimmerView.setLayoutParams(new RecyclerView.p(-1, -2));
        return flightSchemeLiteralRowShimmerView;
    }

    private final Drawable createSeatBackground(Context context) {
        float pxF = ResourceExtKt.toPxF(6, context);
        float pxF2 = ResourceExtKt.toPxF(2, context);
        return new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerSurface), pxF, pxF, pxF2, pxF2);
    }

    private final FlightSchemeSeatRowShimmerView createSeatRowView(Context context) {
        FlightSchemeSeatRowShimmerView flightSchemeSeatRowShimmerView = new FlightSchemeSeatRowShimmerView(context, this.seatBackground);
        flightSchemeSeatRowShimmerView.setLayoutParams(new RecyclerView.p(-1, -2));
        return flightSchemeSeatRowShimmerView;
    }

    private final FlightSchemeTopRowShimmerView createTopRowView(Context context) {
        FlightSchemeTopRowShimmerView flightSchemeTopRowShimmerView = new FlightSchemeTopRowShimmerView(context);
        flightSchemeTopRowShimmerView.setLayoutParams(new RecyclerView.p(-1, -2));
        return flightSchemeTopRowShimmerView;
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

    public final boolean isTopRow(int position) {
        return this.shimmerItems[position] instanceof ShimmerType.TopRow;
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
            createSeatRowView = createTopRowView(context);
        } else if (viewType == 4) {
            Intrinsics.f(context);
            createSeatRowView = creareBottomRowView(context);
        } else {
            if (viewType != 5) {
                throw new IllegalArgumentException(b.a(viewType, "Unknown view type for shimmer :"));
            }
            Intrinsics.f(context);
            createSeatRowView = createLegendView(context);
        }
        return new ShimmerViewHolder(createSeatRowView);
    }
}
