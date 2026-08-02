package ru.ozon.app.android.travel.feature.general.common.widgets.travelImportantInfoModal.data;

import Co.a;
import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelImportantInfoModal/data/TravelImportantInfoModalDTO;", "", "info", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelImportantInfoModal/data/TravelImportantInfoModalDTO$InfoDTO;", "<init>", "(Ljava/util/List;)V", "getInfo", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InfoDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelImportantInfoModalDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<InfoDTO> info;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelImportantInfoModal/data/TravelImportantInfoModalDTO$InfoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "body", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBody", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InfoDTO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom body;

        @NotNull
        private final TextAtom title;

        public InfoDTO(@NotNull TextAtom title, @NotNull TextAtom body) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.title = title;
            this.body = body;
        }

        public static /* synthetic */ InfoDTO copy$default(InfoDTO infoDTO, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = infoDTO.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = infoDTO.body;
            }
            return infoDTO.copy(textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getBody() {
            return this.body;
        }

        @NotNull
        public final InfoDTO copy(@NotNull TextAtom title, @NotNull TextAtom body) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new InfoDTO(title, body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoDTO)) {
                return false;
            }
            InfoDTO infoDTO = (InfoDTO) other;
            return Intrinsics.d(this.title, infoDTO.title) && Intrinsics.d(this.body, infoDTO.body);
        }

        @NotNull
        public final TextAtom getBody() {
            return this.body;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.body.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.a("InfoDTO(title=", this.title, ", body=", this.body, ")");
        }
    }

    public TravelImportantInfoModalDTO(@NotNull List<InfoDTO> info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.info = info;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelImportantInfoModalDTO copy$default(TravelImportantInfoModalDTO travelImportantInfoModalDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelImportantInfoModalDTO.info;
        }
        return travelImportantInfoModalDTO.copy(list);
    }

    @NotNull
    public final List<InfoDTO> component1() {
        return this.info;
    }

    @NotNull
    public final TravelImportantInfoModalDTO copy(@NotNull List<InfoDTO> info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return new TravelImportantInfoModalDTO(info);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TravelImportantInfoModalDTO) && Intrinsics.d(this.info, ((TravelImportantInfoModalDTO) other).info);
    }

    @NotNull
    public final List<InfoDTO> getInfo() {
        return this.info;
    }

    public int hashCode() {
        return this.info.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("TravelImportantInfoModalDTO(info=", ")", this.info);
    }
}
