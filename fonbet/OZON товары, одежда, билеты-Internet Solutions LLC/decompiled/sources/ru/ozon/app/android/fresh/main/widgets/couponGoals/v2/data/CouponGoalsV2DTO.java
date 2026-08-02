package ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.data;

import D40.d;
import G.g;
import Gl.C3124a;
import Ih.a;
import K1.G;
import Kk.c;
import Ns.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/data/CouponGoalsV2DTO;", "", "items", "", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/data/CouponGoalsV2DTO$CouponGoalItem;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CouponGoalItem", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CouponGoalsV2DTO {

    @NotNull
    private final List<CouponGoalItem> items;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\"\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010,\u001a\u00020\u000fHÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003Jx\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\rHÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00064"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/data/CouponGoalsV2DTO$CouponGoalItem;", "", "isCompleted", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "actionText", "progress", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ZLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "()Z", "getImage", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getActionText", "getProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/data/CouponGoalsV2DTO$CouponGoalItem;", "equals", "other", "hashCode", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CouponGoalItem {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final TextDTO actionText;

        @NotNull
        private final BadgeDTO badge;

        @NotNull
        private final TextDTO description;

        @NotNull
        private final String image;
        private final boolean isCompleted;
        private final Integer progress;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public CouponGoalItem(boolean z11, @NotNull String image, @NotNull TextDTO title, @NotNull TextDTO description, @NotNull BadgeDTO badge, @NotNull TextDTO actionText, Integer num, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            Intrinsics.checkNotNullParameter(action, "action");
            this.isCompleted = z11;
            this.image = image;
            this.title = title;
            this.description = description;
            this.badge = badge;
            this.actionText = actionText;
            this.progress = num;
            this.action = action;
            this.trackingInfo = map;
        }

        public static /* synthetic */ CouponGoalItem copy$default(CouponGoalItem couponGoalItem, boolean z11, String str, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, TextDTO textDTO3, Integer num, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = couponGoalItem.isCompleted;
            }
            if ((i11 & 2) != 0) {
                str = couponGoalItem.image;
            }
            if ((i11 & 4) != 0) {
                textDTO = couponGoalItem.title;
            }
            if ((i11 & 8) != 0) {
                textDTO2 = couponGoalItem.description;
            }
            if ((i11 & 16) != 0) {
                badgeDTO = couponGoalItem.badge;
            }
            if ((i11 & 32) != 0) {
                textDTO3 = couponGoalItem.actionText;
            }
            if ((i11 & 64) != 0) {
                num = couponGoalItem.progress;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                atomActionDTO = couponGoalItem.action;
            }
            if ((i11 & 256) != 0) {
                map = couponGoalItem.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            TextDTO textDTO4 = textDTO3;
            Integer num2 = num;
            BadgeDTO badgeDTO2 = badgeDTO;
            TextDTO textDTO5 = textDTO;
            return couponGoalItem.copy(z11, str, textDTO5, textDTO2, badgeDTO2, textDTO4, num2, atomActionDTO2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCompleted() {
            return this.isCompleted;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getDescription() {
            return this.description;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final TextDTO getActionText() {
            return this.actionText;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getProgress() {
            return this.progress;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final CouponGoalItem copy(boolean isCompleted, @NotNull String image, @NotNull TextDTO title, @NotNull TextDTO description, @NotNull BadgeDTO badge, @NotNull TextDTO actionText, Integer progress, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            Intrinsics.checkNotNullParameter(action, "action");
            return new CouponGoalItem(isCompleted, image, title, description, badge, actionText, progress, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CouponGoalItem)) {
                return false;
            }
            CouponGoalItem couponGoalItem = (CouponGoalItem) other;
            return this.isCompleted == couponGoalItem.isCompleted && Intrinsics.d(this.image, couponGoalItem.image) && Intrinsics.d(this.title, couponGoalItem.title) && Intrinsics.d(this.description, couponGoalItem.description) && Intrinsics.d(this.badge, couponGoalItem.badge) && Intrinsics.d(this.actionText, couponGoalItem.actionText) && Intrinsics.d(this.progress, couponGoalItem.progress) && Intrinsics.d(this.action, couponGoalItem.action) && Intrinsics.d(this.trackingInfo, couponGoalItem.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getActionText() {
            return this.actionText;
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final TextDTO getDescription() {
            return this.description;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final Integer getProgress() {
            return this.progress;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.actionText, C3124a.c(this.badge, b.a(this.description, b.a(this.title, g.a(Boolean.hashCode(this.isCompleted) * 31, 31, this.image), 31), 31), 31), 31);
            Integer num = this.progress;
            int b11 = a.b(this.action, (a11 + (num == null ? 0 : num.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isCompleted() {
            return this.isCompleted;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isCompleted;
            String str = this.image;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.description;
            BadgeDTO badgeDTO = this.badge;
            TextDTO textDTO3 = this.actionText;
            Integer num = this.progress;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = G.d("CouponGoalItem(isCompleted=", ", image=", str, ", title=", z11);
            d.e(", description=", ", badge=", d11, textDTO, textDTO2);
            d11.append(badgeDTO);
            d11.append(", actionText=");
            d11.append(textDTO3);
            d11.append(", progress=");
            d11.append(num);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(", trackingInfo=");
            return P.f(d11, map, ")");
        }
    }

    public CouponGoalsV2DTO(@NotNull List<CouponGoalItem> items, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CouponGoalsV2DTO copy$default(CouponGoalsV2DTO couponGoalsV2DTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = couponGoalsV2DTO.items;
        }
        if ((i11 & 2) != 0) {
            map = couponGoalsV2DTO.trackingInfo;
        }
        return couponGoalsV2DTO.copy(list, map);
    }

    @NotNull
    public final List<CouponGoalItem> component1() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final CouponGoalsV2DTO copy(@NotNull List<CouponGoalItem> items, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new CouponGoalsV2DTO(items, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponGoalsV2DTO)) {
            return false;
        }
        CouponGoalsV2DTO couponGoalsV2DTO = (CouponGoalsV2DTO) other;
        return Intrinsics.d(this.items, couponGoalsV2DTO.items) && Intrinsics.d(this.trackingInfo, couponGoalsV2DTO.trackingInfo);
    }

    @NotNull
    public final List<CouponGoalItem> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("CouponGoalsV2DTO(items=", ", trackingInfo=", ")", this.items, this.trackingInfo);
    }
}
