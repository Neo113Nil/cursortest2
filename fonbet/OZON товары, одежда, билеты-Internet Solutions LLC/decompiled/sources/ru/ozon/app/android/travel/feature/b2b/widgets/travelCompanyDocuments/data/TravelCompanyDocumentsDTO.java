package ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.data;

import B90.C2618u;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO;", "", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "allDocumentsLink", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO$CompanyDocumentDTO;", "documents", "", "<init>", "(Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO$CompanyDocumentDTO;Ljava/util/List;)V", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAllDocumentsLink", "()Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO$CompanyDocumentDTO;", "getDocuments", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CompanyDocumentDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TravelCompanyDocumentsDTO {
    public static final int $stable = 8;
    private final CompanyDocumentDTO allDocumentsLink;
    private final DisclaimerAtom disclaimer;

    @NotNull
    private final List<CompanyDocumentDTO> documents;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO$CompanyDocumentDTO;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CompanyDocumentDTO {
        public static final int $stable = ButtonV3Atom.SmallButton.$stable | TextAtom.$stable;

        @NotNull
        private final ButtonV3Atom.SmallButton button;

        @NotNull
        private final TextAtom text;

        public CompanyDocumentDTO(@NotNull TextAtom text, @NotNull ButtonV3Atom.SmallButton button) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(button, "button");
            this.text = text;
            this.button = button;
        }

        public static /* synthetic */ CompanyDocumentDTO copy$default(CompanyDocumentDTO companyDocumentDTO, TextAtom textAtom, ButtonV3Atom.SmallButton smallButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = companyDocumentDTO.text;
            }
            if ((i11 & 2) != 0) {
                smallButton = companyDocumentDTO.button;
            }
            return companyDocumentDTO.copy(textAtom, smallButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3Atom.SmallButton getButton() {
            return this.button;
        }

        @NotNull
        public final CompanyDocumentDTO copy(@NotNull TextAtom text, @NotNull ButtonV3Atom.SmallButton button) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(button, "button");
            return new CompanyDocumentDTO(text, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompanyDocumentDTO)) {
                return false;
            }
            CompanyDocumentDTO companyDocumentDTO = (CompanyDocumentDTO) other;
            return Intrinsics.d(this.text, companyDocumentDTO.text) && Intrinsics.d(this.button, companyDocumentDTO.button);
        }

        @NotNull
        public final ButtonV3Atom.SmallButton getButton() {
            return this.button;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.button.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CompanyDocumentDTO(text=" + this.text + ", button=" + this.button + ")";
        }
    }

    public TravelCompanyDocumentsDTO(DisclaimerAtom disclaimerAtom, CompanyDocumentDTO companyDocumentDTO, @NotNull List<CompanyDocumentDTO> documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.disclaimer = disclaimerAtom;
        this.allDocumentsLink = companyDocumentDTO;
        this.documents = documents;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelCompanyDocumentsDTO copy$default(TravelCompanyDocumentsDTO travelCompanyDocumentsDTO, DisclaimerAtom disclaimerAtom, CompanyDocumentDTO companyDocumentDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclaimerAtom = travelCompanyDocumentsDTO.disclaimer;
        }
        if ((i11 & 2) != 0) {
            companyDocumentDTO = travelCompanyDocumentsDTO.allDocumentsLink;
        }
        if ((i11 & 4) != 0) {
            list = travelCompanyDocumentsDTO.documents;
        }
        return travelCompanyDocumentsDTO.copy(disclaimerAtom, companyDocumentDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component2, reason: from getter */
    public final CompanyDocumentDTO getAllDocumentsLink() {
        return this.allDocumentsLink;
    }

    @NotNull
    public final List<CompanyDocumentDTO> component3() {
        return this.documents;
    }

    @NotNull
    public final TravelCompanyDocumentsDTO copy(DisclaimerAtom disclaimer, CompanyDocumentDTO allDocumentsLink, @NotNull List<CompanyDocumentDTO> documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        return new TravelCompanyDocumentsDTO(disclaimer, allDocumentsLink, documents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCompanyDocumentsDTO)) {
            return false;
        }
        TravelCompanyDocumentsDTO travelCompanyDocumentsDTO = (TravelCompanyDocumentsDTO) other;
        return Intrinsics.d(this.disclaimer, travelCompanyDocumentsDTO.disclaimer) && Intrinsics.d(this.allDocumentsLink, travelCompanyDocumentsDTO.allDocumentsLink) && Intrinsics.d(this.documents, travelCompanyDocumentsDTO.documents);
    }

    public final CompanyDocumentDTO getAllDocumentsLink() {
        return this.allDocumentsLink;
    }

    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final List<CompanyDocumentDTO> getDocuments() {
        return this.documents;
    }

    public int hashCode() {
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        int hashCode = (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode()) * 31;
        CompanyDocumentDTO companyDocumentDTO = this.allDocumentsLink;
        return this.documents.hashCode() + ((hashCode + (companyDocumentDTO != null ? companyDocumentDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        CompanyDocumentDTO companyDocumentDTO = this.allDocumentsLink;
        List<CompanyDocumentDTO> list = this.documents;
        StringBuilder sb2 = new StringBuilder("TravelCompanyDocumentsDTO(disclaimer=");
        sb2.append(disclaimerAtom);
        sb2.append(", allDocumentsLink=");
        sb2.append(companyDocumentDTO);
        sb2.append(", documents=");
        return C2618u.h(sb2, list, ")");
    }

    public TravelCompanyDocumentsDTO(DisclaimerAtom disclaimerAtom, CompanyDocumentDTO companyDocumentDTO, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(disclaimerAtom, companyDocumentDTO, (i11 & 4) != 0 ? K.f71697a : list);
    }
}
