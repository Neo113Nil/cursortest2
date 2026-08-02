package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation;

import B6.b;
import El.C2971a;
import G.g;
import TY.a;
import WZ.t;
import android.graphics.PointF;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import we0.m;
import we0.n;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000223BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "copyButton", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$MapSettings;", "map", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "pointsOfInterests", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$MapSettings;Ljava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAddress", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCopyButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$MapSettings;", "getMap", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$MapSettings;", "Ljava/util/List;", "getPointsOfInterests", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "MapSettings", "Pin", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPageMapPreviewV2VO implements c {

    @NotNull
    private final TextDTO address;

    @NotNull
    private final IconButtonV3DTO copyButton;
    private final long id;

    @NotNull
    private final MapSettings map;

    @NotNull
    private final List<CellDTO> pointsOfInterests;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$MapSettings;", "", "Lwe0/n;", "visibleRegion", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$Pin;", "pin", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lwe0/n;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$Pin;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwe0/n;", "getVisibleRegion", "()Lwe0/n;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$Pin;", "getPin", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$Pin;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapSettings {
        private final AtomAction action;

        @NotNull
        private final Pin pin;

        @NotNull
        private final n visibleRegion;

        public MapSettings(@NotNull n visibleRegion, @NotNull Pin pin, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(visibleRegion, "visibleRegion");
            Intrinsics.checkNotNullParameter(pin, "pin");
            this.visibleRegion = visibleRegion;
            this.pin = pin;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapSettings)) {
                return false;
            }
            MapSettings mapSettings = (MapSettings) other;
            return Intrinsics.d(this.visibleRegion, mapSettings.visibleRegion) && Intrinsics.d(this.pin, mapSettings.pin) && Intrinsics.d(this.action, mapSettings.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final Pin getPin() {
            return this.pin;
        }

        @NotNull
        public final n getVisibleRegion() {
            return this.visibleRegion;
        }

        public int hashCode() {
            int hashCode = (this.pin.hashCode() + (this.visibleRegion.hashCode() * 31)) * 31;
            AtomAction atomAction = this.action;
            return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            n nVar = this.visibleRegion;
            Pin pin = this.pin;
            AtomAction atomAction = this.action;
            StringBuilder sb2 = new StringBuilder("MapSettings(visibleRegion=");
            sb2.append(nVar);
            sb2.append(", pin=");
            sb2.append(pin);
            sb2.append(", action=");
            return b.b(sb2, atomAction, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO$Pin;", "", "Lwe0/m;", "coordinate", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Landroid/graphics/PointF;", "anchorPoint", "", "pinCacheKey", "<init>", "(Lwe0/m;Lru/ozon/uni/atoms/data/icon/IconDTO;Landroid/graphics/PointF;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwe0/m;", "getCoordinate", "()Lwe0/m;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Landroid/graphics/PointF;", "getAnchorPoint", "()Landroid/graphics/PointF;", "Ljava/lang/String;", "getPinCacheKey", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pin {

        @NotNull
        private final PointF anchorPoint;

        @NotNull
        private final m coordinate;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final String pinCacheKey;

        public Pin(@NotNull m coordinate, @NotNull IconDTO icon, @NotNull PointF anchorPoint, @NotNull String pinCacheKey) {
            Intrinsics.checkNotNullParameter(coordinate, "coordinate");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(anchorPoint, "anchorPoint");
            Intrinsics.checkNotNullParameter(pinCacheKey, "pinCacheKey");
            this.coordinate = coordinate;
            this.icon = icon;
            this.anchorPoint = anchorPoint;
            this.pinCacheKey = pinCacheKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return Intrinsics.d(this.coordinate, pin.coordinate) && Intrinsics.d(this.icon, pin.icon) && Intrinsics.d(this.anchorPoint, pin.anchorPoint) && Intrinsics.d(this.pinCacheKey, pin.pinCacheKey);
        }

        @NotNull
        public final PointF getAnchorPoint() {
            return this.anchorPoint;
        }

        @NotNull
        public final m getCoordinate() {
            return this.coordinate;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getPinCacheKey() {
            return this.pinCacheKey;
        }

        public int hashCode() {
            return this.pinCacheKey.hashCode() + ((this.anchorPoint.hashCode() + C2971a.a(this.icon, this.coordinate.hashCode() * 31, 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Pin(coordinate=" + this.coordinate + ", icon=" + this.icon + ", anchorPoint=" + this.anchorPoint + ", pinCacheKey=" + this.pinCacheKey + ")";
        }
    }

    public HotelsPageMapPreviewV2VO(long j11, @NotNull TextDTO title, @NotNull TextDTO address, @NotNull IconButtonV3DTO copyButton, @NotNull MapSettings map, @NotNull List<CellDTO> pointsOfInterests, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(copyButton, "copyButton");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(pointsOfInterests, "pointsOfInterests");
        this.id = j11;
        this.title = title;
        this.address = address;
        this.copyButton = copyButton;
        this.map = map;
        this.pointsOfInterests = pointsOfInterests;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPageMapPreviewV2VO)) {
            return false;
        }
        HotelsPageMapPreviewV2VO hotelsPageMapPreviewV2VO = (HotelsPageMapPreviewV2VO) other;
        return this.id == hotelsPageMapPreviewV2VO.id && Intrinsics.d(this.title, hotelsPageMapPreviewV2VO.title) && Intrinsics.d(this.address, hotelsPageMapPreviewV2VO.address) && Intrinsics.d(this.copyButton, hotelsPageMapPreviewV2VO.copyButton) && Intrinsics.d(this.map, hotelsPageMapPreviewV2VO.map) && Intrinsics.d(this.pointsOfInterests, hotelsPageMapPreviewV2VO.pointsOfInterests) && Intrinsics.d(this.tokenizedEvent, hotelsPageMapPreviewV2VO.tokenizedEvent);
    }

    @NotNull
    public final TextDTO getAddress() {
        return this.address;
    }

    @NotNull
    public final IconButtonV3DTO getCopyButton() {
        return this.copyButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final MapSettings getMap() {
        return this.map;
    }

    @NotNull
    public final List<CellDTO> getPointsOfInterests() {
        return this.pointsOfInterests;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b((this.map.hashCode() + GR.b.c(this.copyButton, Ns.b.a(this.address, Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31), 31), 31)) * 31, 31, this.pointsOfInterests);
        t tVar = this.tokenizedEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.address;
        IconButtonV3DTO iconButtonV3DTO = this.copyButton;
        MapSettings mapSettings = this.map;
        List<CellDTO> list = this.pointsOfInterests;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("HotelsPageMapPreviewV2VO(id=", j11, ", title=", textDTO);
        b11.append(", address=");
        b11.append(textDTO2);
        b11.append(", copyButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", map=");
        b11.append(mapSettings);
        b11.append(", pointsOfInterests=");
        b11.append(list);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
