package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import A00.a;
import Ak.C2436a;
import B90.C2619v;
import G.g;
import Kk.C3532b;
import T7.E;
import Tl.b;
import Ve.C4598rp;
import Ve.C4636t5;
import WZ.t;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0006JKLMNOB\u0083\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ¤\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010!R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b\f\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\bB\u0010AR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010C\u001a\u0004\bD\u0010ER\u001f\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010F\u001a\u0004\bG\u0010HR\u0011\u0010I\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bI\u00102¨\u0006P"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "LA00/a$J$a;", "", "id", "", ImagesContract.URL, "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$SearchResultItem;", "hotels", "", "isAllDone", "timeout", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "errorMessage", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "errorNotification", "Lru/ozon/uni/atoms/af/AtomAction;", "timeoutAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "lazyLoadAction", "pollingAction", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$LoaderStateVO;", "loaderState", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(JLjava/lang/String;Ljava/util/List;ZLjava/lang/Long;Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$LoaderStateVO;LWZ/t;)V", "copy", "(JLjava/lang/String;Ljava/util/List;ZLjava/lang/Long;Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$LoaderStateVO;LWZ/t;)Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getUrl", "Ljava/util/List;", "getHotels", "()Ljava/util/List;", "Z", "()Z", "Ljava/lang/Long;", "getTimeout", "()Ljava/lang/Long;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "getErrorMessage", "()Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getTimeoutAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getLazyLoadAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPollingAction", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$LoaderStateVO;", "getLoaderState", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$LoaderStateVO;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "isErrorOccurred", "NextPageLoader", "SearchResultItem", "HotelVO", "HotelPlaceholder", "TourOptionVO", "LoaderStateVO", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ToursSearchResultVO implements c, a.J.InterfaceC0007a {

    @NotNull
    private final EmptyStateVO errorMessage;
    private final NotificationDTO errorNotification;
    private final List<SearchResultItem> hotels;
    private final long id;
    private final boolean isAllDone;
    private final AtomActionDTO lazyLoadAction;
    private final LoaderStateVO loaderState;

    @NotNull
    private final AtomActionDTO pollingAction;
    private final Long timeout;
    private final AtomAction timeoutAction;
    private final t trackingInfo;
    private final String url;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelPlaceholder;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$SearchResultItem;", "", "id", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HotelPlaceholder implements SearchResultItem {
        private final int id;

        public HotelPlaceholder(int i11) {
            this.id = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HotelPlaceholder) && this.id == ((HotelPlaceholder) other).id;
        }

        @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO.SearchResultItem
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        @NotNull
        public String toString() {
            return E.a(this.id, "HotelPlaceholder(id=", ")");
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0001=B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018\u0012\u000e\u0010\u001a\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b\n\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b1\u00100R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b2\u0010*R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b\u000f\u0010-R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b3\u0010*R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b\u0012\u0010-R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b4\u00100R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b5\u00100R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b7\u00108R\u001f\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u00109\u001a\u0004\b:\u0010;R\u001f\u0010\u001a\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\b<\u0010;¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$SearchResultItem;", "", "id", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelVO$Image;", "images", "Lru/ozon/uni/atoms/data/badge/Badge;", "badges", "", "isBadgesVisible", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "hotelFeatures", "isHotelFeaturesVisible", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$TourOptionVO;", "tourOptions", "isTourOptionsVisible", "price", "dates", "Lru/ozon/uni/atoms/af/AtomAction;", "selectAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "scrollGalleryEvent", "<init>", "(ILjava/util/List;Ljava/util/List;ZLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;ZLjava/util/List;ZLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getBadges", "Z", "()Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getHotelFeatures", "getTourOptions", "getPrice", "getDates", "Lru/ozon/uni/atoms/af/AtomAction;", "getSelectAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "getScrollGalleryEvent", "Image", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HotelVO implements SearchResultItem {
        private final List<Badge> badges;

        @NotNull
        private final TextAtom dates;
        private final TextAtom description;
        private final List<Badge> hotelFeatures;
        private final int id;

        @NotNull
        private final List<Image> images;
        private final boolean isBadgesVisible;
        private final boolean isHotelFeaturesVisible;
        private final boolean isTourOptionsVisible;

        @NotNull
        private final TextAtom price;
        private final t scrollGalleryEvent;

        @NotNull
        private final AtomAction selectAction;

        @NotNull
        private final TextAtom title;
        private final List<TourOptionVO> tourOptions;
        private final t trackingInfo;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelVO$Image;", "", "", "id", "", ImagesContract.URL, "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getUrl", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image {
            private final int id;

            @NotNull
            private final String url;

            public Image(int i11, @NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.id = i11;
                this.url = url;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return this.id == image.id && Intrinsics.d(this.url, image.url);
            }

            public final int getId() {
                return this.id;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode() + (Integer.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return Nh.a.c(this.id, "Image(id=", ", url=", this.url, ")");
            }
        }

        public HotelVO(int i11, @NotNull List<Image> images, List<Badge> list, boolean z11, @NotNull TextAtom title, TextAtom textAtom, List<Badge> list2, boolean z12, List<TourOptionVO> list3, boolean z13, @NotNull TextAtom price, @NotNull TextAtom dates, @NotNull AtomAction selectAction, t tVar, t tVar2) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(dates, "dates");
            Intrinsics.checkNotNullParameter(selectAction, "selectAction");
            this.id = i11;
            this.images = images;
            this.badges = list;
            this.isBadgesVisible = z11;
            this.title = title;
            this.description = textAtom;
            this.hotelFeatures = list2;
            this.isHotelFeaturesVisible = z12;
            this.tourOptions = list3;
            this.isTourOptionsVisible = z13;
            this.price = price;
            this.dates = dates;
            this.selectAction = selectAction;
            this.trackingInfo = tVar;
            this.scrollGalleryEvent = tVar2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HotelVO)) {
                return false;
            }
            HotelVO hotelVO = (HotelVO) other;
            return this.id == hotelVO.id && Intrinsics.d(this.images, hotelVO.images) && Intrinsics.d(this.badges, hotelVO.badges) && this.isBadgesVisible == hotelVO.isBadgesVisible && Intrinsics.d(this.title, hotelVO.title) && Intrinsics.d(this.description, hotelVO.description) && Intrinsics.d(this.hotelFeatures, hotelVO.hotelFeatures) && this.isHotelFeaturesVisible == hotelVO.isHotelFeaturesVisible && Intrinsics.d(this.tourOptions, hotelVO.tourOptions) && this.isTourOptionsVisible == hotelVO.isTourOptionsVisible && Intrinsics.d(this.price, hotelVO.price) && Intrinsics.d(this.dates, hotelVO.dates) && Intrinsics.d(this.selectAction, hotelVO.selectAction) && Intrinsics.d(this.trackingInfo, hotelVO.trackingInfo) && Intrinsics.d(this.scrollGalleryEvent, hotelVO.scrollGalleryEvent);
        }

        public final List<Badge> getBadges() {
            return this.badges;
        }

        @NotNull
        public final TextAtom getDates() {
            return this.dates;
        }

        public final TextAtom getDescription() {
            return this.description;
        }

        public final List<Badge> getHotelFeatures() {
            return this.hotelFeatures;
        }

        @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO.SearchResultItem
        public int getId() {
            return this.id;
        }

        @NotNull
        public final List<Image> getImages() {
            return this.images;
        }

        @NotNull
        public final TextAtom getPrice() {
            return this.price;
        }

        public final t getScrollGalleryEvent() {
            return this.scrollGalleryEvent;
        }

        @NotNull
        public final AtomAction getSelectAction() {
            return this.selectAction;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final List<TourOptionVO> getTourOptions() {
            return this.tourOptions;
        }

        public final t getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = g.b(Integer.hashCode(this.id) * 31, 31, this.images);
            List<Badge> list = this.badges;
            int b12 = C2619v.b(C3532b.a((b11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.isBadgesVisible), 31, this.title);
            TextAtom textAtom = this.description;
            int hashCode = (b12 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            List<Badge> list2 = this.hotelFeatures;
            int a11 = C3532b.a((hashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.isHotelFeaturesVisible);
            List<TourOptionVO> list3 = this.tourOptions;
            int a12 = C4598rp.a(this.selectAction, C2619v.b(C2619v.b(C3532b.a((a11 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.isTourOptionsVisible), 31, this.price), 31, this.dates), 31);
            t tVar = this.trackingInfo;
            int hashCode2 = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            t tVar2 = this.scrollGalleryEvent;
            return hashCode2 + (tVar2 != null ? tVar2.hashCode() : 0);
        }

        /* renamed from: isBadgesVisible, reason: from getter */
        public final boolean getIsBadgesVisible() {
            return this.isBadgesVisible;
        }

        /* renamed from: isHotelFeaturesVisible, reason: from getter */
        public final boolean getIsHotelFeaturesVisible() {
            return this.isHotelFeaturesVisible;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            List<Image> list = this.images;
            List<Badge> list2 = this.badges;
            boolean z11 = this.isBadgesVisible;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.description;
            List<Badge> list3 = this.hotelFeatures;
            boolean z12 = this.isHotelFeaturesVisible;
            List<TourOptionVO> list4 = this.tourOptions;
            boolean z13 = this.isTourOptionsVisible;
            TextAtom textAtom3 = this.price;
            TextAtom textAtom4 = this.dates;
            AtomAction atomAction = this.selectAction;
            t tVar = this.trackingInfo;
            t tVar2 = this.scrollGalleryEvent;
            StringBuilder sb2 = new StringBuilder("HotelVO(id=");
            sb2.append(i11);
            sb2.append(", images=");
            sb2.append(list);
            sb2.append(", badges=");
            sb2.append(list2);
            sb2.append(", isBadgesVisible=");
            sb2.append(z11);
            sb2.append(", title=");
            C4636t5.c(", description=", ", hotelFeatures=", sb2, textAtom, textAtom2);
            sb2.append(list3);
            sb2.append(", isHotelFeaturesVisible=");
            sb2.append(z12);
            sb2.append(", tourOptions=");
            sb2.append(list4);
            sb2.append(", isTourOptionsVisible=");
            sb2.append(z13);
            sb2.append(", price=");
            C4636t5.c(", dates=", ", selectAction=", sb2, textAtom3, textAtom4);
            sb2.append(atomAction);
            sb2.append(", trackingInfo=");
            sb2.append(tVar);
            sb2.append(", scrollGalleryEvent=");
            return b.d(sb2, tVar2, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$LoaderStateVO;", "", "loaderStatesText", "", "", "loaderStatesPercent", "", "<init>", "([Ljava/lang/String;[F)V", "getLoaderStatesText", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getLoaderStatesPercent", "()[F", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoaderStateVO {

        @NotNull
        private final float[] loaderStatesPercent;

        @NotNull
        private final String[] loaderStatesText;

        public LoaderStateVO(@NotNull String[] loaderStatesText, @NotNull float[] loaderStatesPercent) {
            Intrinsics.checkNotNullParameter(loaderStatesText, "loaderStatesText");
            Intrinsics.checkNotNullParameter(loaderStatesPercent, "loaderStatesPercent");
            this.loaderStatesText = loaderStatesText;
            this.loaderStatesPercent = loaderStatesPercent;
        }

        @NotNull
        public final float[] getLoaderStatesPercent() {
            return this.loaderStatesPercent;
        }

        @NotNull
        public final String[] getLoaderStatesText() {
            return this.loaderStatesText;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$NextPageLoader;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$SearchResultItem;", "<init>", "()V", "id", "", "getId", "()I", "equals", "", "other", "", "hashCode", "toString", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NextPageLoader implements SearchResultItem {

        @NotNull
        public static final NextPageLoader INSTANCE = new NextPageLoader();
        private static final int id;

        static {
            String B11 = N.b(NextPageLoader.class).B();
            id = B11 != null ? B11.hashCode() : 0;
        }

        private NextPageLoader() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NextPageLoader);
        }

        @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO.SearchResultItem
        public int getId() {
            return id;
        }

        public int hashCode() {
            return 607901559;
        }

        @NotNull
        public String toString() {
            return "NextPageLoader";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$SearchResultItem;", "", "id", "", "getId", "()I", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelPlaceholder;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$NextPageLoader;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface SearchResultItem {
        int getId();
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$TourOptionVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "date", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "selectAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDate", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/af/AtomAction;", "getSelectAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TourOptionVO {

        @NotNull
        private final TextAtom date;

        @NotNull
        private final Icon icon;

        @NotNull
        private final TextAtom price;

        @NotNull
        private final AtomAction selectAction;
        private final t trackingInfo;

        public TourOptionVO(@NotNull TextAtom price, @NotNull TextAtom date, @NotNull Icon icon, @NotNull AtomAction selectAction, t tVar) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(selectAction, "selectAction");
            this.price = price;
            this.date = date;
            this.icon = icon;
            this.selectAction = selectAction;
            this.trackingInfo = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TourOptionVO)) {
                return false;
            }
            TourOptionVO tourOptionVO = (TourOptionVO) other;
            return Intrinsics.d(this.price, tourOptionVO.price) && Intrinsics.d(this.date, tourOptionVO.date) && Intrinsics.d(this.icon, tourOptionVO.icon) && Intrinsics.d(this.selectAction, tourOptionVO.selectAction) && Intrinsics.d(this.trackingInfo, tourOptionVO.trackingInfo);
        }

        @NotNull
        public final TextAtom getDate() {
            return this.date;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextAtom getPrice() {
            return this.price;
        }

        @NotNull
        public final AtomAction getSelectAction() {
            return this.selectAction;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.selectAction, Lc.a.a(this.icon, C2619v.b(this.price.hashCode() * 31, 31, this.date), 31), 31);
            t tVar = this.trackingInfo;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.price;
            TextAtom textAtom2 = this.date;
            Icon icon = this.icon;
            AtomAction atomAction = this.selectAction;
            t tVar = this.trackingInfo;
            StringBuilder a11 = HY.a.a("TourOptionVO(price=", textAtom, ", date=", textAtom2, ", icon=");
            a11.append(icon);
            a11.append(", selectAction=");
            a11.append(atomAction);
            a11.append(", trackingInfo=");
            return b.d(a11, tVar, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToursSearchResultVO(long j11, String str, List<? extends SearchResultItem> list, boolean z11, Long l11, @NotNull EmptyStateVO errorMessage, NotificationDTO notificationDTO, AtomAction atomAction, AtomActionDTO atomActionDTO, @NotNull AtomActionDTO pollingAction, LoaderStateVO loaderStateVO, t tVar) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(pollingAction, "pollingAction");
        this.id = j11;
        this.url = str;
        this.hotels = list;
        this.isAllDone = z11;
        this.timeout = l11;
        this.errorMessage = errorMessage;
        this.errorNotification = notificationDTO;
        this.timeoutAction = atomAction;
        this.lazyLoadAction = atomActionDTO;
        this.pollingAction = pollingAction;
        this.loaderState = loaderStateVO;
        this.trackingInfo = tVar;
    }

    @NotNull
    public final ToursSearchResultVO copy(long id2, String url, List<? extends SearchResultItem> hotels, boolean isAllDone, Long timeout, @NotNull EmptyStateVO errorMessage, NotificationDTO errorNotification, AtomAction timeoutAction, AtomActionDTO lazyLoadAction, @NotNull AtomActionDTO pollingAction, LoaderStateVO loaderState, t trackingInfo) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(pollingAction, "pollingAction");
        return new ToursSearchResultVO(id2, url, hotels, isAllDone, timeout, errorMessage, errorNotification, timeoutAction, lazyLoadAction, pollingAction, loaderState, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursSearchResultVO)) {
            return false;
        }
        ToursSearchResultVO toursSearchResultVO = (ToursSearchResultVO) other;
        return this.id == toursSearchResultVO.id && Intrinsics.d(this.url, toursSearchResultVO.url) && Intrinsics.d(this.hotels, toursSearchResultVO.hotels) && this.isAllDone == toursSearchResultVO.isAllDone && Intrinsics.d(this.timeout, toursSearchResultVO.timeout) && Intrinsics.d(this.errorMessage, toursSearchResultVO.errorMessage) && Intrinsics.d(this.errorNotification, toursSearchResultVO.errorNotification) && Intrinsics.d(this.timeoutAction, toursSearchResultVO.timeoutAction) && Intrinsics.d(this.lazyLoadAction, toursSearchResultVO.lazyLoadAction) && Intrinsics.d(this.pollingAction, toursSearchResultVO.pollingAction) && Intrinsics.d(this.loaderState, toursSearchResultVO.loaderState) && Intrinsics.d(this.trackingInfo, toursSearchResultVO.trackingInfo);
    }

    @NotNull
    public final EmptyStateVO getErrorMessage() {
        return this.errorMessage;
    }

    public final NotificationDTO getErrorNotification() {
        return this.errorNotification;
    }

    public final List<SearchResultItem> getHotels() {
        return this.hotels;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final AtomActionDTO getLazyLoadAction() {
        return this.lazyLoadAction;
    }

    public final LoaderStateVO getLoaderState() {
        return this.loaderState;
    }

    @NotNull
    public final AtomActionDTO getPollingAction() {
        return this.pollingAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Long getTimeout() {
        return this.timeout;
    }

    public final AtomAction getTimeoutAction() {
        return this.timeoutAction;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<SearchResultItem> list = this.hotels;
        int a11 = C3532b.a((hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.isAllDone);
        Long l11 = this.timeout;
        int hashCode3 = (this.errorMessage.hashCode() + ((a11 + (l11 == null ? 0 : l11.hashCode())) * 31)) * 31;
        NotificationDTO notificationDTO = this.errorNotification;
        int hashCode4 = (hashCode3 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
        AtomAction atomAction = this.timeoutAction;
        int hashCode5 = (hashCode4 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.lazyLoadAction;
        int b11 = Ih.a.b(this.pollingAction, (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31);
        LoaderStateVO loaderStateVO = this.loaderState;
        int hashCode6 = (b11 + (loaderStateVO == null ? 0 : loaderStateVO.hashCode())) * 31;
        t tVar = this.trackingInfo;
        return hashCode6 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isAllDone, reason: from getter */
    public final boolean getIsAllDone() {
        return this.isAllDone;
    }

    public final boolean isErrorOccurred() {
        return this.timeout == null;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.url;
        List<SearchResultItem> list = this.hotels;
        boolean z11 = this.isAllDone;
        Long l11 = this.timeout;
        EmptyStateVO emptyStateVO = this.errorMessage;
        NotificationDTO notificationDTO = this.errorNotification;
        AtomAction atomAction = this.timeoutAction;
        AtomActionDTO atomActionDTO = this.lazyLoadAction;
        AtomActionDTO atomActionDTO2 = this.pollingAction;
        LoaderStateVO loaderStateVO = this.loaderState;
        t tVar = this.trackingInfo;
        StringBuilder c11 = C2436a.c(j11, "ToursSearchResultVO(id=", ", url=", str);
        AZ.c.c(c11, ", hotels=", list, ", isAllDone=", z11);
        c11.append(", timeout=");
        c11.append(l11);
        c11.append(", errorMessage=");
        c11.append(emptyStateVO);
        c11.append(", errorNotification=");
        c11.append(notificationDTO);
        c11.append(", timeoutAction=");
        c11.append(atomAction);
        c11.append(", lazyLoadAction=");
        c11.append(atomActionDTO);
        c11.append(", pollingAction=");
        c11.append(atomActionDTO2);
        c11.append(", loaderState=");
        c11.append(loaderStateVO);
        c11.append(", trackingInfo=");
        c11.append(tVar);
        c11.append(")");
        return c11.toString();
    }
}
