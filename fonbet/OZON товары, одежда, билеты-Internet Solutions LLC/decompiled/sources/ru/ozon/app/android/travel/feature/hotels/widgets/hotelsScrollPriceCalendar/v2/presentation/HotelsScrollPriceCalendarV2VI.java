package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation;

import B4.V;
import B90.C2618u;
import D40.d;
import K1.G;
import Kk.C3532b;
import Pk0.b;
import T7.P;
import Tz.C4055a;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.C6594f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001:\u0004%&'(B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\rR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$State;", "state", "", "asyncData", "<init>", "(JLru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$State;Ljava/lang/String;)V", "copy", "(JLru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$State;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$State;", "getState", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$State;", "Ljava/lang/String;", "getAsyncData", "Landroid/os/Parcelable;", "scrollState", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "setScrollState", "(Landroid/os/Parcelable;)V", "State", "DatePriceItem", "Background", "Stroke", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsScrollPriceCalendarV2VI implements c {
    private final String asyncData;
    private final long id;
    private Parcelable scrollState;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Background;", "", "", "backgroundColor", "", "cornerRadius", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Stroke;", "stroke", "<init>", "(Ljava/lang/String;FLru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Stroke;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "F", "getCornerRadius", "()F", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Stroke;", "getStroke", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Stroke;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Background {

        @NotNull
        private final String backgroundColor;
        private final float cornerRadius;
        private final Stroke stroke;

        public Background(@NotNull String backgroundColor, float f7, Stroke stroke) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.backgroundColor = backgroundColor;
            this.cornerRadius = f7;
            this.stroke = stroke;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Background)) {
                return false;
            }
            Background background = (Background) other;
            return Intrinsics.d(this.backgroundColor, background.backgroundColor) && Float.compare(this.cornerRadius, background.cornerRadius) == 0 && Intrinsics.d(this.stroke, background.stroke);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final Stroke getStroke() {
            return this.stroke;
        }

        public int hashCode() {
            int a11 = b.a(this.cornerRadius, this.backgroundColor.hashCode() * 31, 31);
            Stroke stroke = this.stroke;
            return a11 + (stroke == null ? 0 : stroke.hashCode());
        }

        @NotNull
        public String toString() {
            return "Background(backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ", stroke=" + this.stroke + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J~\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b\t\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$DatePriceItem;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "weekdaysInterval", "dateInterval", "price", "", "isLoading", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Background;", "background", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Background;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;)V", "copy", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Background;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$DatePriceItem;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getWeekdaysInterval", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDateInterval", "getPrice", "Z", "()Z", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Background;", "getBackground", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Background;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DatePriceItem {
        private final AtomAction action;

        @NotNull
        private final Background background;
        private final BadgeDTO badge;

        @NotNull
        private final TextDTO dateInterval;
        private final int id;
        private final boolean isLoading;
        private final TextDTO price;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final TextDTO weekdaysInterval;

        public DatePriceItem(int i11, @NotNull TextDTO weekdaysInterval, @NotNull TextDTO dateInterval, TextDTO textDTO, boolean z11, @NotNull Background background, BadgeDTO badgeDTO, AtomAction atomAction, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(weekdaysInterval, "weekdaysInterval");
            Intrinsics.checkNotNullParameter(dateInterval, "dateInterval");
            Intrinsics.checkNotNullParameter(background, "background");
            this.id = i11;
            this.weekdaysInterval = weekdaysInterval;
            this.dateInterval = dateInterval;
            this.price = textDTO;
            this.isLoading = z11;
            this.background = background;
            this.badge = badgeDTO;
            this.action = atomAction;
            this.trackingInfo = map;
        }

        public static /* synthetic */ DatePriceItem copy$default(DatePriceItem datePriceItem, int i11, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, boolean z11, Background background, BadgeDTO badgeDTO, AtomAction atomAction, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = datePriceItem.id;
            }
            if ((i12 & 2) != 0) {
                textDTO = datePriceItem.weekdaysInterval;
            }
            if ((i12 & 4) != 0) {
                textDTO2 = datePriceItem.dateInterval;
            }
            if ((i12 & 8) != 0) {
                textDTO3 = datePriceItem.price;
            }
            if ((i12 & 16) != 0) {
                z11 = datePriceItem.isLoading;
            }
            if ((i12 & 32) != 0) {
                background = datePriceItem.background;
            }
            if ((i12 & 64) != 0) {
                badgeDTO = datePriceItem.badge;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                atomAction = datePriceItem.action;
            }
            if ((i12 & 256) != 0) {
                map = datePriceItem.trackingInfo;
            }
            AtomAction atomAction2 = atomAction;
            Map map2 = map;
            Background background2 = background;
            BadgeDTO badgeDTO2 = badgeDTO;
            boolean z12 = z11;
            TextDTO textDTO4 = textDTO2;
            return datePriceItem.copy(i11, textDTO, textDTO4, textDTO3, z12, background2, badgeDTO2, atomAction2, map2);
        }

        @NotNull
        public final DatePriceItem copy(int id2, @NotNull TextDTO weekdaysInterval, @NotNull TextDTO dateInterval, TextDTO price, boolean isLoading, @NotNull Background background, BadgeDTO badge, AtomAction action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(weekdaysInterval, "weekdaysInterval");
            Intrinsics.checkNotNullParameter(dateInterval, "dateInterval");
            Intrinsics.checkNotNullParameter(background, "background");
            return new DatePriceItem(id2, weekdaysInterval, dateInterval, price, isLoading, background, badge, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DatePriceItem)) {
                return false;
            }
            DatePriceItem datePriceItem = (DatePriceItem) other;
            return this.id == datePriceItem.id && Intrinsics.d(this.weekdaysInterval, datePriceItem.weekdaysInterval) && Intrinsics.d(this.dateInterval, datePriceItem.dateInterval) && Intrinsics.d(this.price, datePriceItem.price) && this.isLoading == datePriceItem.isLoading && Intrinsics.d(this.background, datePriceItem.background) && Intrinsics.d(this.badge, datePriceItem.badge) && Intrinsics.d(this.action, datePriceItem.action) && Intrinsics.d(this.trackingInfo, datePriceItem.trackingInfo);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final Background getBackground() {
            return this.background;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final TextDTO getDateInterval() {
            return this.dateInterval;
        }

        public final int getId() {
            return this.id;
        }

        public final TextDTO getPrice() {
            return this.price;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final TextDTO getWeekdaysInterval() {
            return this.weekdaysInterval;
        }

        public int hashCode() {
            int a11 = Ns.b.a(this.dateInterval, Ns.b.a(this.weekdaysInterval, Integer.hashCode(this.id) * 31, 31), 31);
            TextDTO textDTO = this.price;
            int hashCode = (this.background.hashCode() + C3532b.a((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.isLoading)) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        /* renamed from: isLoading, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.weekdaysInterval;
            TextDTO textDTO2 = this.dateInterval;
            TextDTO textDTO3 = this.price;
            boolean z11 = this.isLoading;
            Background background = this.background;
            BadgeDTO badgeDTO = this.badge;
            AtomAction atomAction = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder b11 = C4055a.b(textDTO, "DatePriceItem(id=", ", weekdaysInterval=", ", dateInterval=", i11);
            d.e(", price=", ", isLoading=", b11, textDTO2, textDTO3);
            b11.append(z11);
            b11.append(", background=");
            b11.append(background);
            b11.append(", badge=");
            b11.append(badgeDTO);
            b11.append(", action=");
            b11.append(atomAction);
            b11.append(", trackingInfo=");
            return P.f(b11, map, ")");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011Jt\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\n\u0010%R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b)\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$State;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$DatePriceItem;", "datePrices", "", "autoScrollIndex", "", "isUpdateRequired", "", "", "asyncParameters", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/Integer;ZLjava/util/Map;Ljava/util/Map;)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/Integer;ZLjava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$State;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getDatePrices", "()Ljava/util/List;", "Ljava/lang/Integer;", "getAutoScrollIndex", "()Ljava/lang/Integer;", "Z", "()Z", "Ljava/util/Map;", "getAsyncParameters", "()Ljava/util/Map;", "getTrackingInfo", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class State {
        private final Map<String, Object> asyncParameters;
        private final Integer autoScrollIndex;
        private final List<DatePriceItem> datePrices;
        private final boolean isUpdateRequired;
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public State(TextDTO textDTO, List<DatePriceItem> list, Integer num, boolean z11, Map<String, ? extends Object> map, Map<String, TokenizedTrackingInfo> map2) {
            this.title = textDTO;
            this.datePrices = list;
            this.autoScrollIndex = num;
            this.isUpdateRequired = z11;
            this.asyncParameters = map;
            this.trackingInfo = map2;
        }

        public static /* synthetic */ State copy$default(State state, TextDTO textDTO, List list, Integer num, boolean z11, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = state.title;
            }
            if ((i11 & 2) != 0) {
                list = state.datePrices;
            }
            if ((i11 & 4) != 0) {
                num = state.autoScrollIndex;
            }
            if ((i11 & 8) != 0) {
                z11 = state.isUpdateRequired;
            }
            if ((i11 & 16) != 0) {
                map = state.asyncParameters;
            }
            if ((i11 & 32) != 0) {
                map2 = state.trackingInfo;
            }
            Map map3 = map;
            Map map4 = map2;
            return state.copy(textDTO, list, num, z11, map3, map4);
        }

        @NotNull
        public final State copy(TextDTO title, List<DatePriceItem> datePrices, Integer autoScrollIndex, boolean isUpdateRequired, Map<String, ? extends Object> asyncParameters, Map<String, TokenizedTrackingInfo> trackingInfo) {
            return new State(title, datePrices, autoScrollIndex, isUpdateRequired, asyncParameters, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.d(this.title, state.title) && Intrinsics.d(this.datePrices, state.datePrices) && Intrinsics.d(this.autoScrollIndex, state.autoScrollIndex) && this.isUpdateRequired == state.isUpdateRequired && Intrinsics.d(this.asyncParameters, state.asyncParameters) && Intrinsics.d(this.trackingInfo, state.trackingInfo);
        }

        public final Map<String, Object> getAsyncParameters() {
            return this.asyncParameters;
        }

        public final Integer getAutoScrollIndex() {
            return this.autoScrollIndex;
        }

        public final List<DatePriceItem> getDatePrices() {
            return this.datePrices;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            List<DatePriceItem> list = this.datePrices;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.autoScrollIndex;
            int a11 = C3532b.a((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.isUpdateRequired);
            Map<String, Object> map = this.asyncParameters;
            int hashCode3 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            return hashCode3 + (map2 != null ? map2.hashCode() : 0);
        }

        /* renamed from: isUpdateRequired, reason: from getter */
        public final boolean getIsUpdateRequired() {
            return this.isUpdateRequired;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            List<DatePriceItem> list = this.datePrices;
            Integer num = this.autoScrollIndex;
            boolean z11 = this.isUpdateRequired;
            Map<String, Object> map = this.asyncParameters;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            StringBuilder e11 = G.e("State(title=", textDTO, ", datePrices=", list, ", autoScrollIndex=");
            e11.append(num);
            e11.append(", isUpdateRequired=");
            e11.append(z11);
            e11.append(", asyncParameters=");
            return V.c(e11, map, ", trackingInfo=", map2, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Stroke;", "", "", "color", "", "width", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "I", "getWidth", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Stroke {

        @NotNull
        private final String color;
        private final int width;

        public Stroke(@NotNull String color, int i11) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.color = color;
            this.width = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stroke)) {
                return false;
            }
            Stroke stroke = (Stroke) other;
            return Intrinsics.d(this.color, stroke.color) && this.width == stroke.width;
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.width) + (this.color.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2618u.f(this.width, "Stroke(color=", this.color, ", width=", ")");
        }
    }

    public HotelsScrollPriceCalendarV2VI(long j11, @NotNull State state, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
        this.asyncData = str;
    }

    public static /* synthetic */ HotelsScrollPriceCalendarV2VI copy$default(HotelsScrollPriceCalendarV2VI hotelsScrollPriceCalendarV2VI, long j11, State state, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = hotelsScrollPriceCalendarV2VI.id;
        }
        if ((i11 & 2) != 0) {
            state = hotelsScrollPriceCalendarV2VI.state;
        }
        if ((i11 & 4) != 0) {
            str = hotelsScrollPriceCalendarV2VI.asyncData;
        }
        return hotelsScrollPriceCalendarV2VI.copy(j11, state, str);
    }

    @NotNull
    public final HotelsScrollPriceCalendarV2VI copy(long id2, @NotNull State state, String asyncData) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new HotelsScrollPriceCalendarV2VI(id2, state, asyncData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsScrollPriceCalendarV2VI)) {
            return false;
        }
        HotelsScrollPriceCalendarV2VI hotelsScrollPriceCalendarV2VI = (HotelsScrollPriceCalendarV2VI) other;
        return this.id == hotelsScrollPriceCalendarV2VI.id && Intrinsics.d(this.state, hotelsScrollPriceCalendarV2VI.state) && Intrinsics.d(this.asyncData, hotelsScrollPriceCalendarV2VI.asyncData);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Parcelable getScrollState() {
        return this.scrollState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.state.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        String str = this.asyncData;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setScrollState(Parcelable parcelable) {
        this.scrollState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        State state = this.state;
        String str = this.asyncData;
        StringBuilder sb2 = new StringBuilder("HotelsScrollPriceCalendarV2VI(id=");
        sb2.append(j11);
        sb2.append(", state=");
        sb2.append(state);
        return C6594f.a(", asyncData=", str, ")", sb2);
    }
}
