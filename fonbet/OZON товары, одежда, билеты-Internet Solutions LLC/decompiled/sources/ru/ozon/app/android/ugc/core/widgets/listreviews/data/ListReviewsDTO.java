package ru.ozon.app.android.ugc.core.widgets.listreviews.data;

import D40.a;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Ql.c;
import T7.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB1\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO;", "", "reviews", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;", "sort", "Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO$Sort;", "moreReviews", "Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO$MoreReviews;", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO$MoreReviews;)V", "getReviews$annotations", "()V", "getReviews", "()Ljava/util/List;", "getSort", "getMoreReviews", "()Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO$MoreReviews;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Sort", "MoreReviews", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ListReviewsDTO {
    public static final int $stable = 8;
    private final MoreReviews moreReviews;
    private final List<SingleReviewDTO> reviews;
    private final List<Sort> sort;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO$MoreReviews;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "badge", "Lru/ozon/app/android/atoms/data/deprecated/Label;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/atoms/data/deprecated/Label;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getBadge", "()Lru/ozon/app/android/atoms/data/deprecated/Label;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MoreReviews {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final Label badge;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public MoreReviews(@NotNull String title, Label label, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.badge = label;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MoreReviews copy$default(MoreReviews moreReviews, String str, Label label, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = moreReviews.title;
            }
            if ((i11 & 2) != 0) {
                label = moreReviews.badge;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = moreReviews.action;
            }
            if ((i11 & 8) != 0) {
                map = moreReviews.trackingInfo;
            }
            return moreReviews.copy(str, label, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final Label getBadge() {
            return this.badge;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final MoreReviews copy(@NotNull String title, Label badge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new MoreReviews(title, badge, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MoreReviews)) {
                return false;
            }
            MoreReviews moreReviews = (MoreReviews) other;
            return Intrinsics.d(this.title, moreReviews.title) && Intrinsics.d(this.badge, moreReviews.badge) && Intrinsics.d(this.action, moreReviews.action) && Intrinsics.d(this.trackingInfo, moreReviews.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Label getBadge() {
            return this.badge;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Label label = this.badge;
            int hashCode2 = (hashCode + (label == null ? 0 : label.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            Label label = this.badge;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("MoreReviews(title=");
            sb2.append(str);
            sb2.append(", badge=");
            sb2.append(label);
            sb2.append(", action=");
            return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO$Sort;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "selectAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "deeplink", "isSelected", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;ZLjava/util/Map;)V", "getName", "()Ljava/lang/String;", "getSelectAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDeeplink", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Sort {
        public static final int $stable = 8;

        @NotNull
        private final String deeplink;
        private final boolean isSelected;

        @NotNull
        private final String name;
        private final AtomActionDTO selectAction;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Sort(@NotNull String name, AtomActionDTO atomActionDTO, @NotNull String deeplink, boolean z11, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.name = name;
            this.selectAction = atomActionDTO;
            this.deeplink = deeplink;
            this.isSelected = z11;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Sort copy$default(Sort sort, String str, AtomActionDTO atomActionDTO, String str2, boolean z11, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sort.name;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = sort.selectAction;
            }
            if ((i11 & 4) != 0) {
                str2 = sort.deeplink;
            }
            if ((i11 & 8) != 0) {
                z11 = sort.isSelected;
            }
            if ((i11 & 16) != 0) {
                map = sort.trackingInfo;
            }
            Map map2 = map;
            String str3 = str2;
            return sort.copy(str, atomActionDTO, str3, z11, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getSelectAction() {
            return this.selectAction;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final Sort copy(@NotNull String name, AtomActionDTO selectAction, @NotNull String deeplink, boolean isSelected, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new Sort(name, selectAction, deeplink, isSelected, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sort)) {
                return false;
            }
            Sort sort = (Sort) other;
            return Intrinsics.d(this.name, sort.name) && Intrinsics.d(this.selectAction, sort.selectAction) && Intrinsics.d(this.deeplink, sort.deeplink) && this.isSelected == sort.isSelected && Intrinsics.d(this.trackingInfo, sort.trackingInfo);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final AtomActionDTO getSelectAction() {
            return this.selectAction;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.selectAction;
            int a11 = C3532b.a(g.a((hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.deeplink), 31, this.isSelected);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.name;
            AtomActionDTO atomActionDTO = this.selectAction;
            String str2 = this.deeplink;
            boolean z11 = this.isSelected;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = c.c("Sort(name=", str, ", selectAction=", atomActionDTO, ", deeplink=");
            C2880a.c(str2, ", isSelected=", ", trackingInfo=", c11, z11);
            return P.f(c11, map, ")");
        }
    }

    public ListReviewsDTO(List<SingleReviewDTO> list, List<Sort> list2, MoreReviews moreReviews) {
        this.reviews = list;
        this.sort = list2;
        this.moreReviews = moreReviews;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListReviewsDTO copy$default(ListReviewsDTO listReviewsDTO, List list, List list2, MoreReviews moreReviews, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = listReviewsDTO.reviews;
        }
        if ((i11 & 2) != 0) {
            list2 = listReviewsDTO.sort;
        }
        if ((i11 & 4) != 0) {
            moreReviews = listReviewsDTO.moreReviews;
        }
        return listReviewsDTO.copy(list, list2, moreReviews);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getReviews$annotations() {
    }

    public final List<SingleReviewDTO> component1() {
        return this.reviews;
    }

    public final List<Sort> component2() {
        return this.sort;
    }

    /* renamed from: component3, reason: from getter */
    public final MoreReviews getMoreReviews() {
        return this.moreReviews;
    }

    @NotNull
    public final ListReviewsDTO copy(List<SingleReviewDTO> reviews, List<Sort> sort, MoreReviews moreReviews) {
        return new ListReviewsDTO(reviews, sort, moreReviews);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListReviewsDTO)) {
            return false;
        }
        ListReviewsDTO listReviewsDTO = (ListReviewsDTO) other;
        return Intrinsics.d(this.reviews, listReviewsDTO.reviews) && Intrinsics.d(this.sort, listReviewsDTO.sort) && Intrinsics.d(this.moreReviews, listReviewsDTO.moreReviews);
    }

    public final MoreReviews getMoreReviews() {
        return this.moreReviews;
    }

    public final List<SingleReviewDTO> getReviews() {
        return this.reviews;
    }

    public final List<Sort> getSort() {
        return this.sort;
    }

    public int hashCode() {
        List<SingleReviewDTO> list = this.reviews;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Sort> list2 = this.sort;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        MoreReviews moreReviews = this.moreReviews;
        return hashCode2 + (moreReviews != null ? moreReviews.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<SingleReviewDTO> list = this.reviews;
        List<Sort> list2 = this.sort;
        MoreReviews moreReviews = this.moreReviews;
        StringBuilder d11 = Fj.c.d("ListReviewsDTO(reviews=", list, ", sort=", ", moreReviews=", list2);
        d11.append(moreReviews);
        d11.append(")");
        return d11.toString();
    }
}
