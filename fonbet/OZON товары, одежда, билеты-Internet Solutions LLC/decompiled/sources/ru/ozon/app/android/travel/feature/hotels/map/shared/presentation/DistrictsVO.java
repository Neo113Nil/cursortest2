package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation;

import B0.C2454a;
import Cm.e;
import G.g;
import Gl.C3124a;
import Pk0.b;
import T7.P;
import WZ.t;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import we0.m;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001:\u0002()BG\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\\\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b'\u0010&¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon;", "polygons", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$PolygonControlPanel;", "panel", "", "startColorAlpha", "endColorAlpha", "showLabelsZoom", "showDistrictsZoom", "<init>", "(Ljava/util/concurrent/ConcurrentHashMap;Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$PolygonControlPanel;FFLjava/lang/Float;Ljava/lang/Float;)V", "copy", "(Ljava/util/concurrent/ConcurrentHashMap;Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$PolygonControlPanel;FFLjava/lang/Float;Ljava/lang/Float;)Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/concurrent/ConcurrentHashMap;", "getPolygons", "()Ljava/util/concurrent/ConcurrentHashMap;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$PolygonControlPanel;", "getPanel", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$PolygonControlPanel;", "F", "getStartColorAlpha", "()F", "getEndColorAlpha", "Ljava/lang/Float;", "getShowLabelsZoom", "()Ljava/lang/Float;", "getShowDistrictsZoom", "Polygon", "PolygonControlPanel", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DistrictsVO {
    private final float endColorAlpha;

    @NotNull
    private final PolygonControlPanel panel;

    @NotNull
    private final ConcurrentHashMap<String, Polygon> polygons;
    private final Float showDistrictsZoom;
    private final Float showLabelsZoom;
    private final float startColorAlpha;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001:\u0001)B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b \u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b$\u0010\u0012R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon;", "", "", "id", "", "Lwe0/m;", "path", "excludedPath", "strokeColor", "", "strokeWidth", "fillColor", "zIndex", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon$PolygonPin;", "label", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;FLjava/lang/String;FLru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon$PolygonPin;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getPath", "()Ljava/util/List;", "getExcludedPath", "getStrokeColor", "F", "getStrokeWidth", "()F", "getFillColor", "getZIndex", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon$PolygonPin;", "getLabel", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon$PolygonPin;", "PolygonPin", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Polygon {

        @NotNull
        private final List<List<m>> excludedPath;

        @NotNull
        private final String fillColor;

        @NotNull
        private final String id;

        @NotNull
        private final PolygonPin label;

        @NotNull
        private final List<m> path;
        private final String strokeColor;
        private final float strokeWidth;
        private final float zIndex;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon$PolygonPin;", "", "", "id", "Lwe0/m;", "coords", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "LWZ/t;", "badgeTokenizedEvent", "", "cacheHash", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/lang/String;Lwe0/m;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;LWZ/t;ILru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lwe0/m;", "getCoords", "()Lwe0/m;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "LWZ/t;", "getBadgeTokenizedEvent", "()LWZ/t;", "I", "getCacheHash", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PolygonPin {
            private final AtomAction action;

            @NotNull
            private final BadgeDTO badge;
            private final t badgeTokenizedEvent;
            private final int cacheHash;

            @NotNull
            private final m coords;

            @NotNull
            private final String id;

            public PolygonPin(@NotNull String id2, @NotNull m coords, @NotNull BadgeDTO badge, t tVar, int i11, AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(coords, "coords");
                Intrinsics.checkNotNullParameter(badge, "badge");
                this.id = id2;
                this.coords = coords;
                this.badge = badge;
                this.badgeTokenizedEvent = tVar;
                this.cacheHash = i11;
                this.action = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PolygonPin)) {
                    return false;
                }
                PolygonPin polygonPin = (PolygonPin) other;
                return Intrinsics.d(this.id, polygonPin.id) && Intrinsics.d(this.coords, polygonPin.coords) && Intrinsics.d(this.badge, polygonPin.badge) && Intrinsics.d(this.badgeTokenizedEvent, polygonPin.badgeTokenizedEvent) && this.cacheHash == polygonPin.cacheHash && Intrinsics.d(this.action, polygonPin.action);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public final t getBadgeTokenizedEvent() {
                return this.badgeTokenizedEvent;
            }

            public final int getCacheHash() {
                return this.cacheHash;
            }

            @NotNull
            public final m getCoords() {
                return this.coords;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                int c11 = C3124a.c(this.badge, (this.coords.hashCode() + (this.id.hashCode() * 31)) * 31, 31);
                t tVar = this.badgeTokenizedEvent;
                int a11 = C2454a.a(this.cacheHash, (c11 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31);
                AtomAction atomAction = this.action;
                return a11 + (atomAction != null ? atomAction.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "PolygonPin(id=" + this.id + ", coords=" + this.coords + ", badge=" + this.badge + ", badgeTokenizedEvent=" + this.badgeTokenizedEvent + ", cacheHash=" + this.cacheHash + ", action=" + this.action + ")";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Polygon(@NotNull String id2, @NotNull List<m> path, @NotNull List<? extends List<m>> excludedPath, String str, float f7, @NotNull String fillColor, float f11, @NotNull PolygonPin label) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(excludedPath, "excludedPath");
            Intrinsics.checkNotNullParameter(fillColor, "fillColor");
            Intrinsics.checkNotNullParameter(label, "label");
            this.id = id2;
            this.path = path;
            this.excludedPath = excludedPath;
            this.strokeColor = str;
            this.strokeWidth = f7;
            this.fillColor = fillColor;
            this.zIndex = f11;
            this.label = label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Polygon)) {
                return false;
            }
            Polygon polygon = (Polygon) other;
            return Intrinsics.d(this.id, polygon.id) && Intrinsics.d(this.path, polygon.path) && Intrinsics.d(this.excludedPath, polygon.excludedPath) && Intrinsics.d(this.strokeColor, polygon.strokeColor) && Float.compare(this.strokeWidth, polygon.strokeWidth) == 0 && Intrinsics.d(this.fillColor, polygon.fillColor) && Float.compare(this.zIndex, polygon.zIndex) == 0 && Intrinsics.d(this.label, polygon.label);
        }

        @NotNull
        public final List<List<m>> getExcludedPath() {
            return this.excludedPath;
        }

        @NotNull
        public final String getFillColor() {
            return this.fillColor;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final PolygonPin getLabel() {
            return this.label;
        }

        @NotNull
        public final List<m> getPath() {
            return this.path;
        }

        public final String getStrokeColor() {
            return this.strokeColor;
        }

        public final float getStrokeWidth() {
            return this.strokeWidth;
        }

        public int hashCode() {
            int b11 = g.b(g.b(this.id.hashCode() * 31, 31, this.path), 31, this.excludedPath);
            String str = this.strokeColor;
            return this.label.hashCode() + b.a(this.zIndex, g.a(b.a(this.strokeWidth, (b11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.fillColor), 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            List<m> list = this.path;
            List<List<m>> list2 = this.excludedPath;
            String str2 = this.strokeColor;
            float f7 = this.strokeWidth;
            String str3 = this.fillColor;
            float f11 = this.zIndex;
            PolygonPin polygonPin = this.label;
            StringBuilder f12 = Tl.b.f("Polygon(id=", str, ", path=", ", excludedPath=", list);
            e.i(", strokeColor=", str2, ", strokeWidth=", f12, list2);
            f12.append(f7);
            f12.append(", fillColor=");
            f12.append(str3);
            f12.append(", zIndex=");
            f12.append(f11);
            f12.append(", label=");
            f12.append(polygonPin);
            f12.append(")");
            return f12.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$PolygonControlPanel;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "panel", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingApp", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "districtToggleTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/util/Map;)V", "copy", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$PolygonControlPanel;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getPanel", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboardingApp", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Ljava/util/Map;", "getDistrictToggleTrackingInfo", "()Ljava/util/Map;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PolygonControlPanel {
        private final Map<String, TokenizedTrackingInfo> districtToggleTrackingInfo;
        private final OnBoardingDTO onboardingApp;

        @NotNull
        private final CellDTO panel;

        public PolygonControlPanel(@NotNull CellDTO panel, OnBoardingDTO onBoardingDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(panel, "panel");
            this.panel = panel;
            this.onboardingApp = onBoardingDTO;
            this.districtToggleTrackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PolygonControlPanel copy$default(PolygonControlPanel polygonControlPanel, CellDTO cellDTO, OnBoardingDTO onBoardingDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = polygonControlPanel.panel;
            }
            if ((i11 & 2) != 0) {
                onBoardingDTO = polygonControlPanel.onboardingApp;
            }
            if ((i11 & 4) != 0) {
                map = polygonControlPanel.districtToggleTrackingInfo;
            }
            return polygonControlPanel.copy(cellDTO, onBoardingDTO, map);
        }

        @NotNull
        public final PolygonControlPanel copy(@NotNull CellDTO panel, OnBoardingDTO onboardingApp, Map<String, TokenizedTrackingInfo> districtToggleTrackingInfo) {
            Intrinsics.checkNotNullParameter(panel, "panel");
            return new PolygonControlPanel(panel, onboardingApp, districtToggleTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PolygonControlPanel)) {
                return false;
            }
            PolygonControlPanel polygonControlPanel = (PolygonControlPanel) other;
            return Intrinsics.d(this.panel, polygonControlPanel.panel) && Intrinsics.d(this.onboardingApp, polygonControlPanel.onboardingApp) && Intrinsics.d(this.districtToggleTrackingInfo, polygonControlPanel.districtToggleTrackingInfo);
        }

        public final Map<String, TokenizedTrackingInfo> getDistrictToggleTrackingInfo() {
            return this.districtToggleTrackingInfo;
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
            int hashCode2 = (hashCode + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.districtToggleTrackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            CellDTO cellDTO = this.panel;
            OnBoardingDTO onBoardingDTO = this.onboardingApp;
            Map<String, TokenizedTrackingInfo> map = this.districtToggleTrackingInfo;
            StringBuilder sb2 = new StringBuilder("PolygonControlPanel(panel=");
            sb2.append(cellDTO);
            sb2.append(", onboardingApp=");
            sb2.append(onBoardingDTO);
            sb2.append(", districtToggleTrackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    public DistrictsVO(@NotNull ConcurrentHashMap<String, Polygon> polygons, @NotNull PolygonControlPanel panel, float f7, float f11, Float f12, Float f13) {
        Intrinsics.checkNotNullParameter(polygons, "polygons");
        Intrinsics.checkNotNullParameter(panel, "panel");
        this.polygons = polygons;
        this.panel = panel;
        this.startColorAlpha = f7;
        this.endColorAlpha = f11;
        this.showLabelsZoom = f12;
        this.showDistrictsZoom = f13;
    }

    public static /* synthetic */ DistrictsVO copy$default(DistrictsVO districtsVO, ConcurrentHashMap concurrentHashMap, PolygonControlPanel polygonControlPanel, float f7, float f11, Float f12, Float f13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            concurrentHashMap = districtsVO.polygons;
        }
        if ((i11 & 2) != 0) {
            polygonControlPanel = districtsVO.panel;
        }
        if ((i11 & 4) != 0) {
            f7 = districtsVO.startColorAlpha;
        }
        if ((i11 & 8) != 0) {
            f11 = districtsVO.endColorAlpha;
        }
        if ((i11 & 16) != 0) {
            f12 = districtsVO.showLabelsZoom;
        }
        if ((i11 & 32) != 0) {
            f13 = districtsVO.showDistrictsZoom;
        }
        Float f14 = f12;
        Float f15 = f13;
        return districtsVO.copy(concurrentHashMap, polygonControlPanel, f7, f11, f14, f15);
    }

    @NotNull
    public final DistrictsVO copy(@NotNull ConcurrentHashMap<String, Polygon> polygons, @NotNull PolygonControlPanel panel, float startColorAlpha, float endColorAlpha, Float showLabelsZoom, Float showDistrictsZoom) {
        Intrinsics.checkNotNullParameter(polygons, "polygons");
        Intrinsics.checkNotNullParameter(panel, "panel");
        return new DistrictsVO(polygons, panel, startColorAlpha, endColorAlpha, showLabelsZoom, showDistrictsZoom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistrictsVO)) {
            return false;
        }
        DistrictsVO districtsVO = (DistrictsVO) other;
        return Intrinsics.d(this.polygons, districtsVO.polygons) && Intrinsics.d(this.panel, districtsVO.panel) && Float.compare(this.startColorAlpha, districtsVO.startColorAlpha) == 0 && Float.compare(this.endColorAlpha, districtsVO.endColorAlpha) == 0 && Intrinsics.d(this.showLabelsZoom, districtsVO.showLabelsZoom) && Intrinsics.d(this.showDistrictsZoom, districtsVO.showDistrictsZoom);
    }

    public final float getEndColorAlpha() {
        return this.endColorAlpha;
    }

    @NotNull
    public final PolygonControlPanel getPanel() {
        return this.panel;
    }

    @NotNull
    public final ConcurrentHashMap<String, Polygon> getPolygons() {
        return this.polygons;
    }

    public final Float getShowDistrictsZoom() {
        return this.showDistrictsZoom;
    }

    public final Float getShowLabelsZoom() {
        return this.showLabelsZoom;
    }

    public final float getStartColorAlpha() {
        return this.startColorAlpha;
    }

    public int hashCode() {
        int a11 = b.a(this.endColorAlpha, b.a(this.startColorAlpha, (this.panel.hashCode() + (this.polygons.hashCode() * 31)) * 31, 31), 31);
        Float f7 = this.showLabelsZoom;
        int hashCode = (a11 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f11 = this.showDistrictsZoom;
        return hashCode + (f11 != null ? f11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DistrictsVO(polygons=" + this.polygons + ", panel=" + this.panel + ", startColorAlpha=" + this.startColorAlpha + ", endColorAlpha=" + this.endColorAlpha + ", showLabelsZoom=" + this.showLabelsZoom + ", showDistrictsZoom=" + this.showDistrictsZoom + ")";
    }
}
