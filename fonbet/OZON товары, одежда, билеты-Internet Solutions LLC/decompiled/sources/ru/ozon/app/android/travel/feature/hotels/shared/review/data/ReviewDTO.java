package ru.ozon.app.android.travel.feature.hotels.shared.review.data;

import B90.C2619v;
import Bl.b;
import G.g;
import Hj.C3143a;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002)*BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/review/data/ReviewDTO;", "", "id", "", "avatar", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "fullName", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "date", "reviewBlocks", "", "Lru/ozon/app/android/travel/feature/hotels/shared/review/data/ReviewDTO$ReviewBlockDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/avatar/Avatar;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getAvatar", "()Lru/ozon/uni/atoms/data/avatar/Avatar;", "getFullName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDate", "getReviewBlocks", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ReviewBlockDTO", "ExpandButtonDTO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReviewDTO {
    public static final int $stable = 8;

    @NotNull
    private final Avatar avatar;

    @NotNull
    private final TextAtom date;

    @NotNull
    private final TextAtom fullName;

    @NotNull
    private final String id;

    @NotNull
    private final List<ReviewBlockDTO> reviewBlocks;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/review/data/ReviewDTO$ExpandButtonDTO;", "", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExpandButtonDTO {
        public static final int $stable = 0;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String text;

        public ExpandButtonDTO(@NotNull String text, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.text = text;
            this.action = action;
        }

        public static /* synthetic */ ExpandButtonDTO copy$default(ExpandButtonDTO expandButtonDTO, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = expandButtonDTO.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = expandButtonDTO.action;
            }
            return expandButtonDTO.copy(str, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final ExpandButtonDTO copy(@NotNull String text, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            return new ExpandButtonDTO(text, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpandButtonDTO)) {
                return false;
            }
            ExpandButtonDTO expandButtonDTO = (ExpandButtonDTO) other;
            return Intrinsics.d(this.text, expandButtonDTO.text) && Intrinsics.d(this.action, expandButtonDTO.action);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ExpandButtonDTO(text=" + this.text + ", action=" + this.action + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/review/data/ReviewDTO$ReviewBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "", "expandButton", "Lru/ozon/app/android/travel/feature/hotels/shared/review/data/ReviewDTO$ExpandButtonDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/shared/review/data/ReviewDTO$ExpandButtonDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Ljava/lang/String;", "getExpandButton", "()Lru/ozon/app/android/travel/feature/hotels/shared/review/data/ReviewDTO$ExpandButtonDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReviewBlockDTO {
        public static final int $stable = TextAtom.$stable;
        private final ExpandButtonDTO expandButton;

        @NotNull
        private final String text;

        @NotNull
        private final TextAtom title;

        public ReviewBlockDTO(@NotNull TextAtom title, @NotNull String text, ExpandButtonDTO expandButtonDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
            this.title = title;
            this.text = text;
            this.expandButton = expandButtonDTO;
        }

        public static /* synthetic */ ReviewBlockDTO copy$default(ReviewBlockDTO reviewBlockDTO, TextAtom textAtom, String str, ExpandButtonDTO expandButtonDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = reviewBlockDTO.title;
            }
            if ((i11 & 2) != 0) {
                str = reviewBlockDTO.text;
            }
            if ((i11 & 4) != 0) {
                expandButtonDTO = reviewBlockDTO.expandButton;
            }
            return reviewBlockDTO.copy(textAtom, str, expandButtonDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final ExpandButtonDTO getExpandButton() {
            return this.expandButton;
        }

        @NotNull
        public final ReviewBlockDTO copy(@NotNull TextAtom title, @NotNull String text, ExpandButtonDTO expandButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
            return new ReviewBlockDTO(title, text, expandButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewBlockDTO)) {
                return false;
            }
            ReviewBlockDTO reviewBlockDTO = (ReviewBlockDTO) other;
            return Intrinsics.d(this.title, reviewBlockDTO.title) && Intrinsics.d(this.text, reviewBlockDTO.text) && Intrinsics.d(this.expandButton, reviewBlockDTO.expandButton);
        }

        public final ExpandButtonDTO getExpandButton() {
            return this.expandButton;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = g.a(this.title.hashCode() * 31, 31, this.text);
            ExpandButtonDTO expandButtonDTO = this.expandButton;
            return a11 + (expandButtonDTO == null ? 0 : expandButtonDTO.hashCode());
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            String str = this.text;
            ExpandButtonDTO expandButtonDTO = this.expandButton;
            StringBuilder d11 = b.d("ReviewBlockDTO(title=", ", text=", str, ", expandButton=", textAtom);
            d11.append(expandButtonDTO);
            d11.append(")");
            return d11.toString();
        }
    }

    public ReviewDTO(@NotNull String id2, @NotNull Avatar avatar, @NotNull TextAtom fullName, @NotNull TextAtom date, @NotNull List<ReviewBlockDTO> reviewBlocks, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(reviewBlocks, "reviewBlocks");
        this.id = id2;
        this.avatar = avatar;
        this.fullName = fullName;
        this.date = date;
        this.reviewBlocks = reviewBlocks;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ReviewDTO copy$default(ReviewDTO reviewDTO, String str, Avatar avatar, TextAtom textAtom, TextAtom textAtom2, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reviewDTO.id;
        }
        if ((i11 & 2) != 0) {
            avatar = reviewDTO.avatar;
        }
        if ((i11 & 4) != 0) {
            textAtom = reviewDTO.fullName;
        }
        if ((i11 & 8) != 0) {
            textAtom2 = reviewDTO.date;
        }
        if ((i11 & 16) != 0) {
            list = reviewDTO.reviewBlocks;
        }
        if ((i11 & 32) != 0) {
            map = reviewDTO.trackingInfo;
        }
        List list2 = list;
        Map map2 = map;
        return reviewDTO.copy(str, avatar, textAtom, textAtom2, list2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Avatar getAvatar() {
        return this.avatar;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getFullName() {
        return this.fullName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextAtom getDate() {
        return this.date;
    }

    @NotNull
    public final List<ReviewBlockDTO> component5() {
        return this.reviewBlocks;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final ReviewDTO copy(@NotNull String id2, @NotNull Avatar avatar, @NotNull TextAtom fullName, @NotNull TextAtom date, @NotNull List<ReviewBlockDTO> reviewBlocks, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(reviewBlocks, "reviewBlocks");
        return new ReviewDTO(id2, avatar, fullName, date, reviewBlocks, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewDTO)) {
            return false;
        }
        ReviewDTO reviewDTO = (ReviewDTO) other;
        return Intrinsics.d(this.id, reviewDTO.id) && Intrinsics.d(this.avatar, reviewDTO.avatar) && Intrinsics.d(this.fullName, reviewDTO.fullName) && Intrinsics.d(this.date, reviewDTO.date) && Intrinsics.d(this.reviewBlocks, reviewDTO.reviewBlocks) && Intrinsics.d(this.trackingInfo, reviewDTO.trackingInfo);
    }

    @NotNull
    public final Avatar getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final TextAtom getDate() {
        return this.date;
    }

    @NotNull
    public final TextAtom getFullName() {
        return this.fullName;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<ReviewBlockDTO> getReviewBlocks() {
        return this.reviewBlocks;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(C2619v.b(C2619v.b((this.avatar.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.fullName), 31, this.date), 31, this.reviewBlocks);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        Avatar avatar = this.avatar;
        TextAtom textAtom = this.fullName;
        TextAtom textAtom2 = this.date;
        List<ReviewBlockDTO> list = this.reviewBlocks;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ReviewDTO(id=");
        sb2.append(str);
        sb2.append(", avatar=");
        sb2.append(avatar);
        sb2.append(", fullName=");
        C4636t5.c(", date=", ", reviewBlocks=", sb2, textAtom, textAtom2);
        return C3143a.h(sb2, list, ", trackingInfo=", map, ")");
    }
}
