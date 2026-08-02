package ru.ozon.app.android.travel.feature.hotels.map.shared.data;

import B0.A0;
import B0.C2454a;
import Cm.e;
import G.g;
import H3.c;
import Pk0.b;
import T7.Z;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0005*+,-.BC\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019JT\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u000bHÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;", "", "districts", "", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Polygon;", "startFillColorZoomAlpha", "", "endFillColorZoomAlpha", "controlShowPanel", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$ControlShowPanel;", "showLabelsZoom", "", "showDistrictsZoom", "<init>", "(Ljava/util/List;FFLru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$ControlShowPanel;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDistricts$annotations", "()V", "getDistricts", "()Ljava/util/List;", "getStartFillColorZoomAlpha", "()F", "getEndFillColorZoomAlpha", "getControlShowPanel", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$ControlShowPanel;", "getShowLabelsZoom", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowDistrictsZoom", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;FFLru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$ControlShowPanel;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;", "equals", "", "other", "hashCode", "toString", "", "ControlShowPanel", "Polygon", "Label", "ExcludedPath", "PolygonPoint", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DistrictsDTO {

    @NotNull
    private final ControlShowPanel controlShowPanel;

    @NotNull
    private final List<Polygon> districts;
    private final float endFillColorZoomAlpha;
    private final Integer showDistrictsZoom;
    private final Integer showLabelsZoom;
    private final float startFillColorZoomAlpha;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$ControlShowPanel;", "", "panel", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "onboardingApp", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "getPanel", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getOnboardingApp", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ControlShowPanel {
        private final OnBoardingDTO onboardingApp;

        @NotNull
        private final CellDTO panel;

        public ControlShowPanel(@NotNull CellDTO panel, OnBoardingDTO onBoardingDTO) {
            Intrinsics.checkNotNullParameter(panel, "panel");
            this.panel = panel;
            this.onboardingApp = onBoardingDTO;
        }

        public static /* synthetic */ ControlShowPanel copy$default(ControlShowPanel controlShowPanel, CellDTO cellDTO, OnBoardingDTO onBoardingDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = controlShowPanel.panel;
            }
            if ((i11 & 2) != 0) {
                onBoardingDTO = controlShowPanel.onboardingApp;
            }
            return controlShowPanel.copy(cellDTO, onBoardingDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getPanel() {
            return this.panel;
        }

        /* renamed from: component2, reason: from getter */
        public final OnBoardingDTO getOnboardingApp() {
            return this.onboardingApp;
        }

        @NotNull
        public final ControlShowPanel copy(@NotNull CellDTO panel, OnBoardingDTO onboardingApp) {
            Intrinsics.checkNotNullParameter(panel, "panel");
            return new ControlShowPanel(panel, onboardingApp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ControlShowPanel)) {
                return false;
            }
            ControlShowPanel controlShowPanel = (ControlShowPanel) other;
            return Intrinsics.d(this.panel, controlShowPanel.panel) && Intrinsics.d(this.onboardingApp, controlShowPanel.onboardingApp);
        }

        public final OnBoardingDTO getOnboardingApp() {
            return this.onboardingApp;
        }

        @NotNull
        public final CellDTO getPanel() {
            return this.panel;
        }

        public int hashCode() {
            int hashCode = this.panel.hashCode() * 31;
            OnBoardingDTO onBoardingDTO = this.onboardingApp;
            return hashCode + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "ControlShowPanel(panel=" + this.panel + ", onboardingApp=" + this.onboardingApp + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$ExcludedPath;", "", "points", "", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$PolygonPoint;", "<init>", "(Ljava/util/List;)V", "getPoints", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExcludedPath {

        @NotNull
        private final List<PolygonPoint> points;

        public ExcludedPath(@NotNull List<PolygonPoint> points) {
            Intrinsics.checkNotNullParameter(points, "points");
            this.points = points;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExcludedPath copy$default(ExcludedPath excludedPath, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = excludedPath.points;
            }
            return excludedPath.copy(list);
        }

        @NotNull
        public final List<PolygonPoint> component1() {
            return this.points;
        }

        @NotNull
        public final ExcludedPath copy(@NotNull List<PolygonPoint> points) {
            Intrinsics.checkNotNullParameter(points, "points");
            return new ExcludedPath(points);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExcludedPath) && Intrinsics.d(this.points, ((ExcludedPath) other).points);
        }

        @NotNull
        public final List<PolygonPoint> getPoints() {
            return this.points;
        }

        public int hashCode() {
            return this.points.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("ExcludedPath(points=", ")", this.points);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Label;", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "coords", "", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;[D)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCoords", "()[D", "equals", "", "other", "hashCode", "", "component1", "component2", "copy", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Label {

        @NotNull
        private final BadgeDTO badge;
        private final double[] coords;

        public Label(@NotNull BadgeDTO badge, double[] dArr) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.badge = badge;
            this.coords = dArr;
        }

        public static /* synthetic */ Label copy$default(Label label, BadgeDTO badgeDTO, double[] dArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                badgeDTO = label.badge;
            }
            if ((i11 & 2) != 0) {
                dArr = label.coords;
            }
            return label.copy(badgeDTO, dArr);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component2, reason: from getter */
        public final double[] getCoords() {
            return this.coords;
        }

        @NotNull
        public final Label copy(@NotNull BadgeDTO badge, double[] coords) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            return new Label(badge, coords);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Label.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO.Label");
            Label label = (Label) other;
            if (Intrinsics.d(this.badge, label.badge)) {
                double[] dArr = this.coords;
                double[] dArr2 = label.coords;
                if (dArr != null ? Arrays.equals(dArr, dArr2) : dArr2 == null) {
                    return true;
                }
            }
            return false;
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final double[] getCoords() {
            return this.coords;
        }

        public int hashCode() {
            int hashCode = this.badge.hashCode() * 31;
            double[] dArr = this.coords;
            return hashCode + (dArr != null ? Arrays.hashCode(dArr) : 0);
        }

        @NotNull
        public String toString() {
            return "Label(badge=" + this.badge + ", coords=" + Arrays.toString(this.coords) + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$PolygonPoint;", "", "point", "", "<init>", "([D)V", "getPoint", "()[D", "equals", "", "other", "hashCode", "", "component1", "copy", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PolygonPoint {

        @NotNull
        private final double[] point;

        public PolygonPoint(@NotNull double[] point) {
            Intrinsics.checkNotNullParameter(point, "point");
            this.point = point;
        }

        public static /* synthetic */ PolygonPoint copy$default(PolygonPoint polygonPoint, double[] dArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                dArr = polygonPoint.point;
            }
            return polygonPoint.copy(dArr);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final double[] getPoint() {
            return this.point;
        }

        @NotNull
        public final PolygonPoint copy(@NotNull double[] point) {
            Intrinsics.checkNotNullParameter(point, "point");
            return new PolygonPoint(point);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!PolygonPoint.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO.PolygonPoint");
            return Arrays.equals(this.point, ((PolygonPoint) other).point);
        }

        @NotNull
        public final double[] getPoint() {
            return this.point;
        }

        public int hashCode() {
            return Arrays.hashCode(this.point);
        }

        @NotNull
        public String toString() {
            return A0.b("PolygonPoint(point=", Arrays.toString(this.point), ")");
        }
    }

    public DistrictsDTO(@NotNull List<Polygon> districts, float f7, float f11, @NotNull ControlShowPanel controlShowPanel, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(districts, "districts");
        Intrinsics.checkNotNullParameter(controlShowPanel, "controlShowPanel");
        this.districts = districts;
        this.startFillColorZoomAlpha = f7;
        this.endFillColorZoomAlpha = f11;
        this.controlShowPanel = controlShowPanel;
        this.showLabelsZoom = num;
        this.showDistrictsZoom = num2;
    }

    public static /* synthetic */ DistrictsDTO copy$default(DistrictsDTO districtsDTO, List list, float f7, float f11, ControlShowPanel controlShowPanel, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = districtsDTO.districts;
        }
        if ((i11 & 2) != 0) {
            f7 = districtsDTO.startFillColorZoomAlpha;
        }
        if ((i11 & 4) != 0) {
            f11 = districtsDTO.endFillColorZoomAlpha;
        }
        if ((i11 & 8) != 0) {
            controlShowPanel = districtsDTO.controlShowPanel;
        }
        if ((i11 & 16) != 0) {
            num = districtsDTO.showLabelsZoom;
        }
        if ((i11 & 32) != 0) {
            num2 = districtsDTO.showDistrictsZoom;
        }
        Integer num3 = num;
        Integer num4 = num2;
        return districtsDTO.copy(list, f7, f11, controlShowPanel, num3, num4);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getDistricts$annotations() {
    }

    @NotNull
    public final List<Polygon> component1() {
        return this.districts;
    }

    /* renamed from: component2, reason: from getter */
    public final float getStartFillColorZoomAlpha() {
        return this.startFillColorZoomAlpha;
    }

    /* renamed from: component3, reason: from getter */
    public final float getEndFillColorZoomAlpha() {
        return this.endFillColorZoomAlpha;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ControlShowPanel getControlShowPanel() {
        return this.controlShowPanel;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getShowLabelsZoom() {
        return this.showLabelsZoom;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getShowDistrictsZoom() {
        return this.showDistrictsZoom;
    }

    @NotNull
    public final DistrictsDTO copy(@NotNull List<Polygon> districts, float startFillColorZoomAlpha, float endFillColorZoomAlpha, @NotNull ControlShowPanel controlShowPanel, Integer showLabelsZoom, Integer showDistrictsZoom) {
        Intrinsics.checkNotNullParameter(districts, "districts");
        Intrinsics.checkNotNullParameter(controlShowPanel, "controlShowPanel");
        return new DistrictsDTO(districts, startFillColorZoomAlpha, endFillColorZoomAlpha, controlShowPanel, showLabelsZoom, showDistrictsZoom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistrictsDTO)) {
            return false;
        }
        DistrictsDTO districtsDTO = (DistrictsDTO) other;
        return Intrinsics.d(this.districts, districtsDTO.districts) && Float.compare(this.startFillColorZoomAlpha, districtsDTO.startFillColorZoomAlpha) == 0 && Float.compare(this.endFillColorZoomAlpha, districtsDTO.endFillColorZoomAlpha) == 0 && Intrinsics.d(this.controlShowPanel, districtsDTO.controlShowPanel) && Intrinsics.d(this.showLabelsZoom, districtsDTO.showLabelsZoom) && Intrinsics.d(this.showDistrictsZoom, districtsDTO.showDistrictsZoom);
    }

    @NotNull
    public final ControlShowPanel getControlShowPanel() {
        return this.controlShowPanel;
    }

    @NotNull
    public final List<Polygon> getDistricts() {
        return this.districts;
    }

    public final float getEndFillColorZoomAlpha() {
        return this.endFillColorZoomAlpha;
    }

    public final Integer getShowDistrictsZoom() {
        return this.showDistrictsZoom;
    }

    public final Integer getShowLabelsZoom() {
        return this.showLabelsZoom;
    }

    public final float getStartFillColorZoomAlpha() {
        return this.startFillColorZoomAlpha;
    }

    public int hashCode() {
        int hashCode = (this.controlShowPanel.hashCode() + b.a(this.endFillColorZoomAlpha, b.a(this.startFillColorZoomAlpha, this.districts.hashCode() * 31, 31), 31)) * 31;
        Integer num = this.showLabelsZoom;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.showDistrictsZoom;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Polygon> list = this.districts;
        float f7 = this.startFillColorZoomAlpha;
        float f11 = this.endFillColorZoomAlpha;
        ControlShowPanel controlShowPanel = this.controlShowPanel;
        Integer num = this.showLabelsZoom;
        Integer num2 = this.showDistrictsZoom;
        StringBuilder sb2 = new StringBuilder("DistrictsDTO(districts=");
        sb2.append(list);
        sb2.append(", startFillColorZoomAlpha=");
        sb2.append(f7);
        sb2.append(", endFillColorZoomAlpha=");
        sb2.append(f11);
        sb2.append(", controlShowPanel=");
        sb2.append(controlShowPanel);
        sb2.append(", showLabelsZoom=");
        return Z.c(sb2, num, ", showDistrictsZoom=", num2, ")");
    }

    public DistrictsDTO(List list, float f7, float f11, ControlShowPanel controlShowPanel, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, f7, f11, controlShowPanel, num, num2);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003Jp\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000eHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Polygon;", "", "id", "", "points", "", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$PolygonPoint;", "excludedPaths", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$ExcludedPath;", "strokeColor", "strokeWidth", "", "fillColor", "zIndex", "", "label", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Label;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Label;)V", "getId", "()Ljava/lang/String;", "getPoints", "()Ljava/util/List;", "getExcludedPaths", "getStrokeColor", "getStrokeWidth", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getFillColor", "getZIndex", "()I", "getLabel", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Label;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Label;)Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Polygon;", "equals", "", "other", "hashCode", "toString", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Polygon {

        @NotNull
        private final List<ExcludedPath> excludedPaths;

        @NotNull
        private final String fillColor;
        private final String id;

        @NotNull
        private final Label label;

        @NotNull
        private final List<PolygonPoint> points;
        private final String strokeColor;
        private final Float strokeWidth;
        private final int zIndex;

        public Polygon(String str, @NotNull List<PolygonPoint> points, @NotNull List<ExcludedPath> excludedPaths, String str2, Float f7, @NotNull String fillColor, int i11, @NotNull Label label) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(excludedPaths, "excludedPaths");
            Intrinsics.checkNotNullParameter(fillColor, "fillColor");
            Intrinsics.checkNotNullParameter(label, "label");
            this.id = str;
            this.points = points;
            this.excludedPaths = excludedPaths;
            this.strokeColor = str2;
            this.strokeWidth = f7;
            this.fillColor = fillColor;
            this.zIndex = i11;
            this.label = label;
        }

        public static /* synthetic */ Polygon copy$default(Polygon polygon, String str, List list, List list2, String str2, Float f7, String str3, int i11, Label label, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = polygon.id;
            }
            if ((i12 & 2) != 0) {
                list = polygon.points;
            }
            if ((i12 & 4) != 0) {
                list2 = polygon.excludedPaths;
            }
            if ((i12 & 8) != 0) {
                str2 = polygon.strokeColor;
            }
            if ((i12 & 16) != 0) {
                f7 = polygon.strokeWidth;
            }
            if ((i12 & 32) != 0) {
                str3 = polygon.fillColor;
            }
            if ((i12 & 64) != 0) {
                i11 = polygon.zIndex;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                label = polygon.label;
            }
            int i13 = i11;
            Label label2 = label;
            Float f11 = f7;
            String str4 = str3;
            return polygon.copy(str, list, list2, str2, f11, str4, i13, label2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final List<PolygonPoint> component2() {
            return this.points;
        }

        @NotNull
        public final List<ExcludedPath> component3() {
            return this.excludedPaths;
        }

        /* renamed from: component4, reason: from getter */
        public final String getStrokeColor() {
            return this.strokeColor;
        }

        /* renamed from: component5, reason: from getter */
        public final Float getStrokeWidth() {
            return this.strokeWidth;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getFillColor() {
            return this.fillColor;
        }

        /* renamed from: component7, reason: from getter */
        public final int getZIndex() {
            return this.zIndex;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final Label getLabel() {
            return this.label;
        }

        @NotNull
        public final Polygon copy(String id2, @NotNull List<PolygonPoint> points, @NotNull List<ExcludedPath> excludedPaths, String strokeColor, Float strokeWidth, @NotNull String fillColor, int zIndex, @NotNull Label label) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(excludedPaths, "excludedPaths");
            Intrinsics.checkNotNullParameter(fillColor, "fillColor");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Polygon(id2, points, excludedPaths, strokeColor, strokeWidth, fillColor, zIndex, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Polygon)) {
                return false;
            }
            Polygon polygon = (Polygon) other;
            return Intrinsics.d(this.id, polygon.id) && Intrinsics.d(this.points, polygon.points) && Intrinsics.d(this.excludedPaths, polygon.excludedPaths) && Intrinsics.d(this.strokeColor, polygon.strokeColor) && Intrinsics.d(this.strokeWidth, polygon.strokeWidth) && Intrinsics.d(this.fillColor, polygon.fillColor) && this.zIndex == polygon.zIndex && Intrinsics.d(this.label, polygon.label);
        }

        @NotNull
        public final List<ExcludedPath> getExcludedPaths() {
            return this.excludedPaths;
        }

        @NotNull
        public final String getFillColor() {
            return this.fillColor;
        }

        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Label getLabel() {
            return this.label;
        }

        @NotNull
        public final List<PolygonPoint> getPoints() {
            return this.points;
        }

        public final String getStrokeColor() {
            return this.strokeColor;
        }

        public final Float getStrokeWidth() {
            return this.strokeWidth;
        }

        public final int getZIndex() {
            return this.zIndex;
        }

        public int hashCode() {
            String str = this.id;
            int b11 = g.b(g.b((str == null ? 0 : str.hashCode()) * 31, 31, this.points), 31, this.excludedPaths);
            String str2 = this.strokeColor;
            int hashCode = (b11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Float f7 = this.strokeWidth;
            return this.label.hashCode() + C2454a.a(this.zIndex, g.a((hashCode + (f7 != null ? f7.hashCode() : 0)) * 31, 31, this.fillColor), 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            List<PolygonPoint> list = this.points;
            List<ExcludedPath> list2 = this.excludedPaths;
            String str2 = this.strokeColor;
            Float f7 = this.strokeWidth;
            String str3 = this.fillColor;
            int i11 = this.zIndex;
            Label label = this.label;
            StringBuilder f11 = Tl.b.f("Polygon(id=", str, ", points=", ", excludedPaths=", list);
            e.i(", strokeColor=", str2, ", strokeWidth=", f11, list2);
            f11.append(f7);
            f11.append(", fillColor=");
            f11.append(str3);
            f11.append(", zIndex=");
            f11.append(i11);
            f11.append(", label=");
            f11.append(label);
            f11.append(")");
            return f11.toString();
        }

        public Polygon(String str, List list, List list2, String str2, Float f7, String str3, int i11, Label label, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i12 & 4) != 0 ? K.f71697a : list2, str2, f7, str3, i11, label);
        }
    }
}
