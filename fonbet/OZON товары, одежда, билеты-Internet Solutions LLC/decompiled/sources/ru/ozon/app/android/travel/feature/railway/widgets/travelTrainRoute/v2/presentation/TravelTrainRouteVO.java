package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation;

import Cm.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002()B\u0083\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b\u000b\u0010!R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b\u000f\u0010!R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b'\u0010\u001f¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TravelTrainRouteVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TravelTrainRouteVO$InfoBadgeWrapper;", "notificationBadges", "", "isNotificationBadgesVisible", "dateTitle", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TrainListItem;", "trainsAndTransfers", "isTrainsAndTransfersVisible", "shortTrainList", "fullTrainList", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TravelTrainRouteVO$StopSegment;", "stopSegmentsAtShortList", "stopSegmentsAtFullList", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;ZLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getNotificationBadges", "()Ljava/util/List;", "Z", "()Z", "getDateTitle", "getTrainsAndTransfers", "getShortTrainList", "getFullTrainList", "getStopSegmentsAtShortList", "getStopSegmentsAtFullList", "InfoBadgeWrapper", "StopSegment", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainRouteVO implements c {

    @NotNull
    private final TextAtom dateTitle;

    @NotNull
    private final List<TrainListItem> fullTrainList;
    private final long id;
    private final boolean isNotificationBadgesVisible;
    private final boolean isTrainsAndTransfersVisible;

    @NotNull
    private final List<InfoBadgeWrapper> notificationBadges;

    @NotNull
    private final List<TrainListItem> shortTrainList;

    @NotNull
    private final List<StopSegment> stopSegmentsAtFullList;

    @NotNull
    private final List<StopSegment> stopSegmentsAtShortList;

    @NotNull
    private final TextAtom title;

    @NotNull
    private final List<TrainListItem> trainsAndTransfers;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TravelTrainRouteVO$InfoBadgeWrapper;", "", "", "id", "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "badge", "<init>", "(ILru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "getBadge", "()Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InfoBadgeWrapper {
        public static final int $stable = InfoBadgeVO.$stable;

        @NotNull
        private final InfoBadgeVO badge;
        private final int id;

        public InfoBadgeWrapper(int i11, @NotNull InfoBadgeVO badge) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.id = i11;
            this.badge = badge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoBadgeWrapper)) {
                return false;
            }
            InfoBadgeWrapper infoBadgeWrapper = (InfoBadgeWrapper) other;
            return this.id == infoBadgeWrapper.id && Intrinsics.d(this.badge, infoBadgeWrapper.badge);
        }

        @NotNull
        public final InfoBadgeVO getBadge() {
            return this.badge;
        }

        public final int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.badge.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "InfoBadgeWrapper(id=" + this.id + ", badge=" + this.badge + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TravelTrainRouteVO$StopSegment;", "", "", "startIndex", "endIndex", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStartIndex", "getEndIndex", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopSegment {
        private final int endIndex;
        private final int startIndex;

        public StopSegment(int i11, int i12) {
            this.startIndex = i11;
            this.endIndex = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopSegment)) {
                return false;
            }
            StopSegment stopSegment = (StopSegment) other;
            return this.startIndex == stopSegment.startIndex && this.endIndex == stopSegment.endIndex;
        }

        public final int getEndIndex() {
            return this.endIndex;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.endIndex) + (Integer.hashCode(this.startIndex) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("StopSegment(startIndex=", this.startIndex, ", endIndex=", ")", this.endIndex);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TravelTrainRouteVO(long j11, @NotNull TextAtom title, @NotNull List<InfoBadgeWrapper> notificationBadges, boolean z11, @NotNull TextAtom dateTitle, @NotNull List<? extends TrainListItem> trainsAndTransfers, boolean z12, @NotNull List<? extends TrainListItem> shortTrainList, @NotNull List<? extends TrainListItem> fullTrainList, @NotNull List<StopSegment> stopSegmentsAtShortList, @NotNull List<StopSegment> stopSegmentsAtFullList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(notificationBadges, "notificationBadges");
        Intrinsics.checkNotNullParameter(dateTitle, "dateTitle");
        Intrinsics.checkNotNullParameter(trainsAndTransfers, "trainsAndTransfers");
        Intrinsics.checkNotNullParameter(shortTrainList, "shortTrainList");
        Intrinsics.checkNotNullParameter(fullTrainList, "fullTrainList");
        Intrinsics.checkNotNullParameter(stopSegmentsAtShortList, "stopSegmentsAtShortList");
        Intrinsics.checkNotNullParameter(stopSegmentsAtFullList, "stopSegmentsAtFullList");
        this.id = j11;
        this.title = title;
        this.notificationBadges = notificationBadges;
        this.isNotificationBadgesVisible = z11;
        this.dateTitle = dateTitle;
        this.trainsAndTransfers = trainsAndTransfers;
        this.isTrainsAndTransfersVisible = z12;
        this.shortTrainList = shortTrainList;
        this.fullTrainList = fullTrainList;
        this.stopSegmentsAtShortList = stopSegmentsAtShortList;
        this.stopSegmentsAtFullList = stopSegmentsAtFullList;
    }

    @NotNull
    public final TextAtom getDateTitle() {
        return this.dateTitle;
    }

    @NotNull
    public final List<TrainListItem> getFullTrainList() {
        return this.fullTrainList;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<InfoBadgeWrapper> getNotificationBadges() {
        return this.notificationBadges;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<TrainListItem> getShortTrainList() {
        return this.shortTrainList;
    }

    @NotNull
    public final List<StopSegment> getStopSegmentsAtFullList() {
        return this.stopSegmentsAtFullList;
    }

    @NotNull
    public final List<StopSegment> getStopSegmentsAtShortList() {
        return this.stopSegmentsAtShortList;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<TrainListItem> getTrainsAndTransfers() {
        return this.trainsAndTransfers;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    /* renamed from: isNotificationBadgesVisible, reason: from getter */
    public final boolean getIsNotificationBadgesVisible() {
        return this.isNotificationBadgesVisible;
    }

    /* renamed from: isTrainsAndTransfersVisible, reason: from getter */
    public final boolean getIsTrainsAndTransfersVisible() {
        return this.isTrainsAndTransfersVisible;
    }
}
