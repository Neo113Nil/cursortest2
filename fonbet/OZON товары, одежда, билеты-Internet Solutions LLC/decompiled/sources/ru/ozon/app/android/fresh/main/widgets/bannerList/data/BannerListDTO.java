package ru.ozon.app.android.fresh.main.widgets.bannerList.data;

import Bl.b;
import G.g;
import T7.P;
import Xc.a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO;", "", "items", "", "Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$BannerListItem;", "roundedCorners", "Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$RoundedCorners;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$RoundedCorners;)V", "getItems", "()Ljava/util/List;", "getRoundedCorners", "()Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$RoundedCorners;", "RoundedCorners", "BannerListItem", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BannerListDTO {

    @NotNull
    private final List<BannerListItem> items;
    private final RoundedCorners roundedCorners;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$BannerListItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "image", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "backgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getImage", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BannerListItem {
        private final AtomActionDTO action;
        private final String backgroundColor;

        @NotNull
        private final String image;

        @NotNull
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public BannerListItem(@NotNull TextAtom title, @NotNull String image, AtomActionDTO atomActionDTO, String str, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            this.title = title;
            this.image = image;
            this.action = atomActionDTO;
            this.backgroundColor = str;
            this.trackingInfo = map;
        }

        public static /* synthetic */ BannerListItem copy$default(BannerListItem bannerListItem, TextAtom textAtom, String str, AtomActionDTO atomActionDTO, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = bannerListItem.title;
            }
            if ((i11 & 2) != 0) {
                str = bannerListItem.image;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = bannerListItem.action;
            }
            if ((i11 & 8) != 0) {
                str2 = bannerListItem.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                map = bannerListItem.trackingInfo;
            }
            Map map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return bannerListItem.copy(textAtom, str, atomActionDTO2, str2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final BannerListItem copy(@NotNull TextAtom title, @NotNull String image, AtomActionDTO action, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            return new BannerListItem(title, image, action, backgroundColor, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerListItem)) {
                return false;
            }
            BannerListItem bannerListItem = (BannerListItem) other;
            return Intrinsics.d(this.title, bannerListItem.title) && Intrinsics.d(this.image, bannerListItem.image) && Intrinsics.d(this.action, bannerListItem.action) && Intrinsics.d(this.backgroundColor, bannerListItem.backgroundColor) && Intrinsics.d(this.trackingInfo, bannerListItem.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(this.title.hashCode() * 31, 31, this.image);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            String str = this.image;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.backgroundColor;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = b.d("BannerListItem(title=", ", image=", str, ", action=", textAtom);
            HY.b.d(", backgroundColor=", str2, ", trackingInfo=", d11, atomActionDTO);
            return P.f(d11, map, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$RoundedCorners;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "FULL", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RoundedCorners {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RoundedCorners[] $VALUES;

        @i(name = "TOP")
        public static final RoundedCorners TOP = new RoundedCorners("TOP", 0);

        @i(name = "BOTTOM")
        public static final RoundedCorners BOTTOM = new RoundedCorners("BOTTOM", 1);

        @i(name = "FULL")
        public static final RoundedCorners FULL = new RoundedCorners("FULL", 2);

        private static final /* synthetic */ RoundedCorners[] $values() {
            return new RoundedCorners[]{TOP, BOTTOM, FULL};
        }

        static {
            RoundedCorners[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private RoundedCorners(String str, int i11) {
        }

        public static RoundedCorners valueOf(String str) {
            return (RoundedCorners) Enum.valueOf(RoundedCorners.class, str);
        }

        public static RoundedCorners[] values() {
            return (RoundedCorners[]) $VALUES.clone();
        }
    }

    public BannerListDTO(@NotNull List<BannerListItem> items, RoundedCorners roundedCorners) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.roundedCorners = roundedCorners;
    }

    @NotNull
    public final List<BannerListItem> getItems() {
        return this.items;
    }

    public final RoundedCorners getRoundedCorners() {
        return this.roundedCorners;
    }
}
