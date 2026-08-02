package ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.data;

import Co.a;
import G.g;
import T7.P;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001%BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/data/ToursLoaderDTO;", "", "imageLink", "", "progressContent", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/data/ToursLoaderDTO$ProgressContent;", "isAllDoneAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "errorData", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;Ljava/util/Map;)V", "getImageLink", "()Ljava/lang/String;", "getProgressContent", "()Ljava/util/List;", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getErrorData", "()Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ProgressContent", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursLoaderDTO {
    public static final int $stable = 8;

    @NotNull
    private final EmptyStateDTO errorData;

    @NotNull
    private final String imageLink;

    @NotNull
    private final AtomActionDTO isAllDoneAction;

    @NotNull
    private final List<ProgressContent> progressContent;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/data/ToursLoaderDTO$ProgressContent;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "caption", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCaption", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressContent {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom caption;

        @NotNull
        private final TextAtom title;

        public ProgressContent(@NotNull TextAtom title, @NotNull TextAtom caption) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(caption, "caption");
            this.title = title;
            this.caption = caption;
        }

        public static /* synthetic */ ProgressContent copy$default(ProgressContent progressContent, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = progressContent.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = progressContent.caption;
            }
            return progressContent.copy(textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getCaption() {
            return this.caption;
        }

        @NotNull
        public final ProgressContent copy(@NotNull TextAtom title, @NotNull TextAtom caption) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(caption, "caption");
            return new ProgressContent(title, caption);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressContent)) {
                return false;
            }
            ProgressContent progressContent = (ProgressContent) other;
            return Intrinsics.d(this.title, progressContent.title) && Intrinsics.d(this.caption, progressContent.caption);
        }

        @NotNull
        public final TextAtom getCaption() {
            return this.caption;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.caption.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.a("ProgressContent(title=", this.title, ", caption=", this.caption, ")");
        }
    }

    public ToursLoaderDTO(@NotNull String imageLink, @NotNull List<ProgressContent> progressContent, @NotNull AtomActionDTO isAllDoneAction, @NotNull EmptyStateDTO errorData, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(imageLink, "imageLink");
        Intrinsics.checkNotNullParameter(progressContent, "progressContent");
        Intrinsics.checkNotNullParameter(isAllDoneAction, "isAllDoneAction");
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        this.imageLink = imageLink;
        this.progressContent = progressContent;
        this.isAllDoneAction = isAllDoneAction;
        this.errorData = errorData;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ToursLoaderDTO copy$default(ToursLoaderDTO toursLoaderDTO, String str, List list, AtomActionDTO atomActionDTO, EmptyStateDTO emptyStateDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = toursLoaderDTO.imageLink;
        }
        if ((i11 & 2) != 0) {
            list = toursLoaderDTO.progressContent;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = toursLoaderDTO.isAllDoneAction;
        }
        if ((i11 & 8) != 0) {
            emptyStateDTO = toursLoaderDTO.errorData;
        }
        if ((i11 & 16) != 0) {
            map = toursLoaderDTO.trackingInfo;
        }
        Map map2 = map;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return toursLoaderDTO.copy(str, list, atomActionDTO2, emptyStateDTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageLink() {
        return this.imageLink;
    }

    @NotNull
    public final List<ProgressContent> component2() {
        return this.progressContent;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getIsAllDoneAction() {
        return this.isAllDoneAction;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final EmptyStateDTO getErrorData() {
        return this.errorData;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final ToursLoaderDTO copy(@NotNull String imageLink, @NotNull List<ProgressContent> progressContent, @NotNull AtomActionDTO isAllDoneAction, @NotNull EmptyStateDTO errorData, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(imageLink, "imageLink");
        Intrinsics.checkNotNullParameter(progressContent, "progressContent");
        Intrinsics.checkNotNullParameter(isAllDoneAction, "isAllDoneAction");
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        return new ToursLoaderDTO(imageLink, progressContent, isAllDoneAction, errorData, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursLoaderDTO)) {
            return false;
        }
        ToursLoaderDTO toursLoaderDTO = (ToursLoaderDTO) other;
        return Intrinsics.d(this.imageLink, toursLoaderDTO.imageLink) && Intrinsics.d(this.progressContent, toursLoaderDTO.progressContent) && Intrinsics.d(this.isAllDoneAction, toursLoaderDTO.isAllDoneAction) && Intrinsics.d(this.errorData, toursLoaderDTO.errorData) && Intrinsics.d(this.trackingInfo, toursLoaderDTO.trackingInfo);
    }

    @NotNull
    public final EmptyStateDTO getErrorData() {
        return this.errorData;
    }

    @NotNull
    public final String getImageLink() {
        return this.imageLink;
    }

    @NotNull
    public final List<ProgressContent> getProgressContent() {
        return this.progressContent;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.errorData.hashCode() + Ih.a.b(this.isAllDoneAction, g.b(this.imageLink.hashCode() * 31, 31, this.progressContent), 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public final AtomActionDTO isAllDoneAction() {
        return this.isAllDoneAction;
    }

    @NotNull
    public String toString() {
        String str = this.imageLink;
        List<ProgressContent> list = this.progressContent;
        AtomActionDTO atomActionDTO = this.isAllDoneAction;
        EmptyStateDTO emptyStateDTO = this.errorData;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder f7 = b.f("ToursLoaderDTO(imageLink=", str, ", progressContent=", ", isAllDoneAction=", list);
        f7.append(atomActionDTO);
        f7.append(", errorData=");
        f7.append(emptyStateDTO);
        f7.append(", trackingInfo=");
        return P.f(f7, map, ")");
    }
}
