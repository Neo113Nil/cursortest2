package ru.ozon.app.android.storefront.stories.setOfPreviews.data;

import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.stories.setContainer.data.CommonDTOSet;
import ru.ozon.app.android.storefront.stories.setContainer.data.SetType;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsDTO;", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonDTOSet;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "type", "Lru/ozon/app/android/storefront/stories/setContainer/data/SetType;", "items", "", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsDTO$PreviewItemDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/stories/setContainer/data/SetType;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getType", "()Lru/ozon/app/android/storefront/stories/setContainer/data/SetType;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PreviewItemDTO", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SetOfPreviewsDTO implements CommonDTOSet {
    public static final int $stable = 8;

    @NotNull
    private final List<PreviewItemDTO> items;
    private final String subtitle;

    @NotNull
    private final String title;

    @NotNull
    private final transient SetType type;

    public SetOfPreviewsDTO(@NotNull String title, String str, @NotNull SetType type, @NotNull List<PreviewItemDTO> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.subtitle = str;
        this.type = type;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetOfPreviewsDTO copy$default(SetOfPreviewsDTO setOfPreviewsDTO, String str, String str2, SetType setType, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = setOfPreviewsDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = setOfPreviewsDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            setType = setOfPreviewsDTO.type;
        }
        if ((i11 & 8) != 0) {
            list = setOfPreviewsDTO.items;
        }
        return setOfPreviewsDTO.copy(str, str2, setType, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SetType getType() {
        return this.type;
    }

    @NotNull
    public final List<PreviewItemDTO> component4() {
        return this.items;
    }

    @NotNull
    public final SetOfPreviewsDTO copy(@NotNull String title, String subtitle, @NotNull SetType type, @NotNull List<PreviewItemDTO> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(items, "items");
        return new SetOfPreviewsDTO(title, subtitle, type, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetOfPreviewsDTO)) {
            return false;
        }
        SetOfPreviewsDTO setOfPreviewsDTO = (SetOfPreviewsDTO) other;
        return Intrinsics.d(this.title, setOfPreviewsDTO.title) && Intrinsics.d(this.subtitle, setOfPreviewsDTO.subtitle) && this.type == setOfPreviewsDTO.type && Intrinsics.d(this.items, setOfPreviewsDTO.items);
    }

    @NotNull
    public final List<PreviewItemDTO> getItems() {
        return this.items;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public String getTitle() {
        return this.title;
    }

    @NotNull
    public SetType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return this.items.hashCode() + ((this.type.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        SetType setType = this.type;
        List<PreviewItemDTO> list = this.items;
        StringBuilder d11 = C3660k.d("SetOfPreviewsDTO(title=", str, ", subtitle=", str2, ", type=");
        d11.append(setType);
        d11.append(", items=");
        d11.append(list);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ SetOfPreviewsDTO(String str, String str2, SetType setType, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? SetType.SET_OF_PREVIEWS : setType, list);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jj\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsDTO$PreviewItemDTO;", "", "storyId", "", "image", "", "firstFullImage", "firstFullImageAlign", "hideFrame", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getStoryId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getImage", "()Ljava/lang/String;", "getFirstFullImage", "getFirstFullImageAlign", "getHideFrame", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsDTO$PreviewItemDTO;", "equals", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PreviewItemDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String firstFullImage;
        private final String firstFullImageAlign;
        private final boolean hideFrame;

        @NotNull
        private final String image;
        private final Long storyId;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public PreviewItemDTO(Long l11, @NotNull String image, String str, String str2, boolean z11, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.storyId = l11;
            this.image = image;
            this.firstFullImage = str;
            this.firstFullImageAlign = str2;
            this.hideFrame = z11;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ PreviewItemDTO copy$default(PreviewItemDTO previewItemDTO, Long l11, String str, String str2, String str3, boolean z11, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = previewItemDTO.storyId;
            }
            if ((i11 & 2) != 0) {
                str = previewItemDTO.image;
            }
            if ((i11 & 4) != 0) {
                str2 = previewItemDTO.firstFullImage;
            }
            if ((i11 & 8) != 0) {
                str3 = previewItemDTO.firstFullImageAlign;
            }
            if ((i11 & 16) != 0) {
                z11 = previewItemDTO.hideFrame;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = previewItemDTO.action;
            }
            if ((i11 & 64) != 0) {
                map = previewItemDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            boolean z12 = z11;
            String str4 = str2;
            return previewItemDTO.copy(l11, str, str4, str3, z12, atomActionDTO2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getStoryId() {
            return this.storyId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFirstFullImage() {
            return this.firstFullImage;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFirstFullImageAlign() {
            return this.firstFullImageAlign;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHideFrame() {
            return this.hideFrame;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final PreviewItemDTO copy(Long storyId, @NotNull String image, String firstFullImage, String firstFullImageAlign, boolean hideFrame, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new PreviewItemDTO(storyId, image, firstFullImage, firstFullImageAlign, hideFrame, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewItemDTO)) {
                return false;
            }
            PreviewItemDTO previewItemDTO = (PreviewItemDTO) other;
            return Intrinsics.d(this.storyId, previewItemDTO.storyId) && Intrinsics.d(this.image, previewItemDTO.image) && Intrinsics.d(this.firstFullImage, previewItemDTO.firstFullImage) && Intrinsics.d(this.firstFullImageAlign, previewItemDTO.firstFullImageAlign) && this.hideFrame == previewItemDTO.hideFrame && Intrinsics.d(this.action, previewItemDTO.action) && Intrinsics.d(this.trackingInfo, previewItemDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getFirstFullImage() {
            return this.firstFullImage;
        }

        public final String getFirstFullImageAlign() {
            return this.firstFullImageAlign;
        }

        public final boolean getHideFrame() {
            return this.hideFrame;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final Long getStoryId() {
            return this.storyId;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            Long l11 = this.storyId;
            int a11 = g.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.image);
            String str = this.firstFullImage;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.firstFullImageAlign;
            int a12 = C3532b.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.hideFrame);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (a12 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Long l11 = this.storyId;
            String str = this.image;
            String str2 = this.firstFullImage;
            String str3 = this.firstFullImageAlign;
            boolean z11 = this.hideFrame;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("PreviewItemDTO(storyId=");
            sb2.append(l11);
            sb2.append(", image=");
            sb2.append(str);
            sb2.append(", firstFullImage=");
            a.h(sb2, str2, ", firstFullImageAlign=", str3, ", hideFrame=");
            sb2.append(z11);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        public /* synthetic */ PreviewItemDTO(Long l11, String str, String str2, String str3, boolean z11, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(l11, str, str2, str3, (i11 & 16) != 0 ? false : z11, atomActionDTO, map);
        }
    }
}
