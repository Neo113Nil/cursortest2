package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import B4.V;
import B90.C2618u;
import G.g;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.analytics.ViewedCardInfo;
import ru.ozon.app.android.travel.pageconfigurator.fullScreen.WindowInsetsWrapper;
import we0.i;
import we0.m;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "", "OnRefresh", "OnClickMap", "OnClickPolygonPanel", "OnClickNotificationBar", "OnStopPollings", "OnSwipeCardDown", "OnRemoveView", "OnUpdate", "OnBind", "OnMapReady", "OnMoveMap", "OnClickCard", "OnClickPin", "OnClickPolygonBadge", "OnFinishDrawPins", "OnSlideImage", "OnSlideCard", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnBind;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickCard;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickMap;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickNotificationBar;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickPin;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickPolygonBadge;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickPolygonPanel;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnFinishDrawPins;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnMapReady;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnMoveMap;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnRefresh;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnRemoveView;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnSlideCard;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnSlideImage;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnStopPollings;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnSwipeCardDown;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnUpdate;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MapEvent {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnBind;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "vo", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "getVo", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBind implements MapEvent {

        @NotNull
        private final HotelsMapInfoV4VO vo;

        public OnBind(@NotNull HotelsMapInfoV4VO vo) {
            Intrinsics.checkNotNullParameter(vo, "vo");
            this.vo = vo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnBind) && Intrinsics.d(this.vo, ((OnBind) other).vo);
        }

        @NotNull
        public final HotelsMapInfoV4VO getVo() {
            return this.vo;
        }

        public int hashCode() {
            return this.vo.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnBind(vo=" + this.vo + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickCard;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "card", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "getCard", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnClickCard implements MapEvent {

        @NotNull
        private final HotelsMapInfoV4VO.Card card;

        public OnClickCard(@NotNull HotelsMapInfoV4VO.Card card) {
            Intrinsics.checkNotNullParameter(card, "card");
            this.card = card;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnClickCard) && Intrinsics.d(this.card, ((OnClickCard) other).card);
        }

        @NotNull
        public final HotelsMapInfoV4VO.Card getCard() {
            return this.card;
        }

        public int hashCode() {
            return this.card.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnClickCard(card=" + this.card + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickMap;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnClickMap implements MapEvent {

        @NotNull
        public static final OnClickMap INSTANCE = new OnClickMap();

        private OnClickMap() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnClickMap);
        }

        public int hashCode() {
            return -923829501;
        }

        @NotNull
        public String toString() {
            return "OnClickMap";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickNotificationBar;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnClickNotificationBar implements MapEvent {

        @NotNull
        public static final OnClickNotificationBar INSTANCE = new OnClickNotificationBar();

        private OnClickNotificationBar() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnClickNotificationBar);
        }

        public int hashCode() {
            return 433316431;
        }

        @NotNull
        public String toString() {
            return "OnClickNotificationBar";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickPin;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "pin", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "getPin", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnClickPin implements MapEvent {

        @NotNull
        private final HotelsMapInfoV4VO.Pin pin;

        public OnClickPin(@NotNull HotelsMapInfoV4VO.Pin pin) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            this.pin = pin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnClickPin) && Intrinsics.d(this.pin, ((OnClickPin) other).pin);
        }

        @NotNull
        public final HotelsMapInfoV4VO.Pin getPin() {
            return this.pin;
        }

        public int hashCode() {
            return this.pin.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnClickPin(pin=" + this.pin + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickPolygonBadge;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "LWZ/t;", "tokenizedEvent", "<init>", "(LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnClickPolygonBadge implements MapEvent {
        private final t tokenizedEvent;

        public OnClickPolygonBadge(t tVar) {
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnClickPolygonBadge) && Intrinsics.d(this.tokenizedEvent, ((OnClickPolygonBadge) other).tokenizedEvent);
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            t tVar = this.tokenizedEvent;
            if (tVar == null) {
                return 0;
            }
            return tVar.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnClickPolygonBadge(tokenizedEvent=" + this.tokenizedEvent + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnClickPolygonPanel;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnClickPolygonPanel implements MapEvent {

        @NotNull
        public static final OnClickPolygonPanel INSTANCE = new OnClickPolygonPanel();

        private OnClickPolygonPanel() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnClickPolygonPanel);
        }

        public int hashCode() {
            return -190345437;
        }

        @NotNull
        public String toString() {
            return "OnClickPolygonPanel";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnFinishDrawPins;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "", "", "pinsOnMap", "Lwe0/i;", "visibleArea", "", "zoom", "<init>", "(Ljava/util/List;Lwe0/i;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPinsOnMap", "()Ljava/util/List;", "Lwe0/i;", "getVisibleArea", "()Lwe0/i;", "F", "getZoom", "()F", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnFinishDrawPins implements MapEvent {

        @NotNull
        private final List<String> pinsOnMap;

        @NotNull
        private final i visibleArea;
        private final float zoom;

        public OnFinishDrawPins(@NotNull List<String> pinsOnMap, @NotNull i visibleArea, float f7) {
            Intrinsics.checkNotNullParameter(pinsOnMap, "pinsOnMap");
            Intrinsics.checkNotNullParameter(visibleArea, "visibleArea");
            this.pinsOnMap = pinsOnMap;
            this.visibleArea = visibleArea;
            this.zoom = f7;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnFinishDrawPins)) {
                return false;
            }
            OnFinishDrawPins onFinishDrawPins = (OnFinishDrawPins) other;
            return Intrinsics.d(this.pinsOnMap, onFinishDrawPins.pinsOnMap) && Intrinsics.d(this.visibleArea, onFinishDrawPins.visibleArea) && Float.compare(this.zoom, onFinishDrawPins.zoom) == 0;
        }

        @NotNull
        public final List<String> getPinsOnMap() {
            return this.pinsOnMap;
        }

        @NotNull
        public final i getVisibleArea() {
            return this.visibleArea;
        }

        public final float getZoom() {
            return this.zoom;
        }

        public int hashCode() {
            return Float.hashCode(this.zoom) + ((this.visibleArea.hashCode() + (this.pinsOnMap.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            List<String> list = this.pinsOnMap;
            i iVar = this.visibleArea;
            float f7 = this.zoom;
            StringBuilder sb2 = new StringBuilder("OnFinishDrawPins(pinsOnMap=");
            sb2.append(list);
            sb2.append(", visibleArea=");
            sb2.append(iVar);
            sb2.append(", zoom=");
            return V.b(f7, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnMapReady;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "", "zoom", "Lwe0/i;", "visibleArea", "Lwe0/m;", "centerPoint", "", "", "pinsOnMap", "polygonsOnMap", "<init>", "(FLwe0/i;Lwe0/m;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getZoom", "()F", "Lwe0/i;", "getVisibleArea", "()Lwe0/i;", "Lwe0/m;", "getCenterPoint", "()Lwe0/m;", "Ljava/util/List;", "getPinsOnMap", "()Ljava/util/List;", "getPolygonsOnMap", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnMapReady implements MapEvent {

        @NotNull
        private final m centerPoint;

        @NotNull
        private final List<String> pinsOnMap;

        @NotNull
        private final List<String> polygonsOnMap;

        @NotNull
        private final i visibleArea;
        private final float zoom;

        public OnMapReady(float f7, @NotNull i visibleArea, @NotNull m centerPoint, @NotNull List<String> pinsOnMap, @NotNull List<String> polygonsOnMap) {
            Intrinsics.checkNotNullParameter(visibleArea, "visibleArea");
            Intrinsics.checkNotNullParameter(centerPoint, "centerPoint");
            Intrinsics.checkNotNullParameter(pinsOnMap, "pinsOnMap");
            Intrinsics.checkNotNullParameter(polygonsOnMap, "polygonsOnMap");
            this.zoom = f7;
            this.visibleArea = visibleArea;
            this.centerPoint = centerPoint;
            this.pinsOnMap = pinsOnMap;
            this.polygonsOnMap = polygonsOnMap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnMapReady)) {
                return false;
            }
            OnMapReady onMapReady = (OnMapReady) other;
            return Float.compare(this.zoom, onMapReady.zoom) == 0 && Intrinsics.d(this.visibleArea, onMapReady.visibleArea) && Intrinsics.d(this.centerPoint, onMapReady.centerPoint) && Intrinsics.d(this.pinsOnMap, onMapReady.pinsOnMap) && Intrinsics.d(this.polygonsOnMap, onMapReady.polygonsOnMap);
        }

        @NotNull
        public final m getCenterPoint() {
            return this.centerPoint;
        }

        @NotNull
        public final List<String> getPinsOnMap() {
            return this.pinsOnMap;
        }

        @NotNull
        public final List<String> getPolygonsOnMap() {
            return this.polygonsOnMap;
        }

        @NotNull
        public final i getVisibleArea() {
            return this.visibleArea;
        }

        public final float getZoom() {
            return this.zoom;
        }

        public int hashCode() {
            return this.polygonsOnMap.hashCode() + g.b((this.centerPoint.hashCode() + ((this.visibleArea.hashCode() + (Float.hashCode(this.zoom) * 31)) * 31)) * 31, 31, this.pinsOnMap);
        }

        @NotNull
        public String toString() {
            float f7 = this.zoom;
            i iVar = this.visibleArea;
            m mVar = this.centerPoint;
            List<String> list = this.pinsOnMap;
            List<String> list2 = this.polygonsOnMap;
            StringBuilder sb2 = new StringBuilder("OnMapReady(zoom=");
            sb2.append(f7);
            sb2.append(", visibleArea=");
            sb2.append(iVar);
            sb2.append(", centerPoint=");
            sb2.append(mVar);
            sb2.append(", pinsOnMap=");
            sb2.append(list);
            sb2.append(", polygonsOnMap=");
            return C2618u.h(sb2, list2, ")");
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnMoveMap;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "", "zoom", "Lwe0/i;", "visibleArea", "Lwe0/m;", "centerPoint", "", "", "pinsOnMap", "polygonsOnMap", "<init>", "(FLwe0/i;Lwe0/m;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getZoom", "()F", "Lwe0/i;", "getVisibleArea", "()Lwe0/i;", "Lwe0/m;", "getCenterPoint", "()Lwe0/m;", "Ljava/util/List;", "getPinsOnMap", "()Ljava/util/List;", "getPolygonsOnMap", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnMoveMap implements MapEvent {

        @NotNull
        private final m centerPoint;

        @NotNull
        private final List<String> pinsOnMap;

        @NotNull
        private final List<String> polygonsOnMap;

        @NotNull
        private final i visibleArea;
        private final float zoom;

        public OnMoveMap(float f7, @NotNull i visibleArea, @NotNull m centerPoint, @NotNull List<String> pinsOnMap, @NotNull List<String> polygonsOnMap) {
            Intrinsics.checkNotNullParameter(visibleArea, "visibleArea");
            Intrinsics.checkNotNullParameter(centerPoint, "centerPoint");
            Intrinsics.checkNotNullParameter(pinsOnMap, "pinsOnMap");
            Intrinsics.checkNotNullParameter(polygonsOnMap, "polygonsOnMap");
            this.zoom = f7;
            this.visibleArea = visibleArea;
            this.centerPoint = centerPoint;
            this.pinsOnMap = pinsOnMap;
            this.polygonsOnMap = polygonsOnMap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnMoveMap)) {
                return false;
            }
            OnMoveMap onMoveMap = (OnMoveMap) other;
            return Float.compare(this.zoom, onMoveMap.zoom) == 0 && Intrinsics.d(this.visibleArea, onMoveMap.visibleArea) && Intrinsics.d(this.centerPoint, onMoveMap.centerPoint) && Intrinsics.d(this.pinsOnMap, onMoveMap.pinsOnMap) && Intrinsics.d(this.polygonsOnMap, onMoveMap.polygonsOnMap);
        }

        @NotNull
        public final m getCenterPoint() {
            return this.centerPoint;
        }

        @NotNull
        public final List<String> getPinsOnMap() {
            return this.pinsOnMap;
        }

        @NotNull
        public final List<String> getPolygonsOnMap() {
            return this.polygonsOnMap;
        }

        @NotNull
        public final i getVisibleArea() {
            return this.visibleArea;
        }

        public final float getZoom() {
            return this.zoom;
        }

        public int hashCode() {
            return this.polygonsOnMap.hashCode() + g.b((this.centerPoint.hashCode() + ((this.visibleArea.hashCode() + (Float.hashCode(this.zoom) * 31)) * 31)) * 31, 31, this.pinsOnMap);
        }

        @NotNull
        public String toString() {
            float f7 = this.zoom;
            i iVar = this.visibleArea;
            m mVar = this.centerPoint;
            List<String> list = this.pinsOnMap;
            List<String> list2 = this.polygonsOnMap;
            StringBuilder sb2 = new StringBuilder("OnMoveMap(zoom=");
            sb2.append(f7);
            sb2.append(", visibleArea=");
            sb2.append(iVar);
            sb2.append(", centerPoint=");
            sb2.append(mVar);
            sb2.append(", pinsOnMap=");
            sb2.append(list);
            sb2.append(", polygonsOnMap=");
            return C2618u.h(sb2, list2, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnRefresh;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnRefresh implements MapEvent {

        @NotNull
        public static final OnRefresh INSTANCE = new OnRefresh();

        private OnRefresh() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnRefresh);
        }

        public int hashCode() {
            return 472214700;
        }

        @NotNull
        public String toString() {
            return "OnRefresh";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnRemoveView;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "Landroid/os/Parcelable;", "cardsRvState", "<init>", "(Landroid/os/Parcelable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcelable;", "getCardsRvState", "()Landroid/os/Parcelable;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnRemoveView implements MapEvent {
        private final Parcelable cardsRvState;

        public OnRemoveView(Parcelable parcelable) {
            this.cardsRvState = parcelable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnRemoveView) && Intrinsics.d(this.cardsRvState, ((OnRemoveView) other).cardsRvState);
        }

        public final Parcelable getCardsRvState() {
            return this.cardsRvState;
        }

        public int hashCode() {
            Parcelable parcelable = this.cardsRvState;
            if (parcelable == null) {
                return 0;
            }
            return parcelable.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnRemoveView(cardsRvState=" + this.cardsRvState + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnSlideCard;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/ViewedCardInfo;", "info", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/ViewedCardInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/ViewedCardInfo;", "getInfo", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/analytics/ViewedCardInfo;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnSlideCard implements MapEvent {

        @NotNull
        private final ViewedCardInfo info;

        public OnSlideCard(@NotNull ViewedCardInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.info = info;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnSlideCard) && Intrinsics.d(this.info, ((OnSlideCard) other).info);
        }

        @NotNull
        public final ViewedCardInfo getInfo() {
            return this.info;
        }

        public int hashCode() {
            return this.info.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnSlideCard(info=" + this.info + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnSlideImage;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "LWZ/t;", "tokenizedEvent", "", "imagePosition", "<init>", "(LWZ/t;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "I", "getImagePosition", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnSlideImage implements MapEvent {
        private final int imagePosition;
        private final t tokenizedEvent;

        public OnSlideImage(t tVar, int i11) {
            this.tokenizedEvent = tVar;
            this.imagePosition = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnSlideImage)) {
                return false;
            }
            OnSlideImage onSlideImage = (OnSlideImage) other;
            return Intrinsics.d(this.tokenizedEvent, onSlideImage.tokenizedEvent) && this.imagePosition == onSlideImage.imagePosition;
        }

        public final int getImagePosition() {
            return this.imagePosition;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            t tVar = this.tokenizedEvent;
            return Integer.hashCode(this.imagePosition) + ((tVar == null ? 0 : tVar.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "OnSlideImage(tokenizedEvent=" + this.tokenizedEvent + ", imagePosition=" + this.imagePosition + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnStopPollings;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStopPollings implements MapEvent {

        @NotNull
        public static final OnStopPollings INSTANCE = new OnStopPollings();

        private OnStopPollings() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnStopPollings);
        }

        public int hashCode() {
            return 115929089;
        }

        @NotNull
        public String toString() {
            return "OnStopPollings";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnSwipeCardDown;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnSwipeCardDown implements MapEvent {

        @NotNull
        public static final OnSwipeCardDown INSTANCE = new OnSwipeCardDown();

        private OnSwipeCardDown() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnSwipeCardDown);
        }

        public int hashCode() {
            return -2099884483;
        }

        @NotNull
        public String toString() {
            return "OnSwipeCardDown";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent$OnUpdate;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapEvent;", "Lru/ozon/app/android/travel/pageconfigurator/fullScreen/WindowInsetsWrapper;", "update", "<init>", "(Lru/ozon/app/android/travel/pageconfigurator/fullScreen/WindowInsetsWrapper;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/pageconfigurator/fullScreen/WindowInsetsWrapper;", "getUpdate", "()Lru/ozon/app/android/travel/pageconfigurator/fullScreen/WindowInsetsWrapper;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnUpdate implements MapEvent {

        @NotNull
        private final WindowInsetsWrapper update;

        public OnUpdate(@NotNull WindowInsetsWrapper update) {
            Intrinsics.checkNotNullParameter(update, "update");
            this.update = update;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnUpdate) && Intrinsics.d(this.update, ((OnUpdate) other).update);
        }

        @NotNull
        public final WindowInsetsWrapper getUpdate() {
            return this.update;
        }

        public int hashCode() {
            return this.update.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnUpdate(update=" + this.update + ")";
        }
    }
}
