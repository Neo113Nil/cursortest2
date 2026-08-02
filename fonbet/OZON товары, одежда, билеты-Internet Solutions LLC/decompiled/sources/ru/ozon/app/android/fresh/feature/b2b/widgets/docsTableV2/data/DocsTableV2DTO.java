package ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.data;

import D3.g;
import El.C2971a;
import Ns.b;
import Pk0.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO;", "", "listTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "periods", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO$Period;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getListTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPeriods", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Period", "Document", "Status", "DocsTitle", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DocsTableV2DTO {
    public static final int $stable = 8;
    private final TextDTO listTitle;

    @NotNull
    private final List<Period> periods;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003J_\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO$Document;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "sum", "Lru/ozon/uni/atoms/data/text/TextDTO;", "status", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO$Status;", "dateInfo", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "showSeparator", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO$Status;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Z)V", "getHeader", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSum", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getStatus", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO$Status;", "getDateInfo", "getButtons", "()Ljava/util/List;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getShowSeparator", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Document {
        public static final int $stable = 8;
        private final BadgeDTO badge;
        private final List<ButtonV3DTO> buttons;
        private final TextDTO dateInfo;

        @NotNull
        private final CellDTO header;
        private final boolean showSeparator;
        private final Status status;
        private final TextDTO sum;

        public Document(@NotNull CellDTO header, TextDTO textDTO, Status status, TextDTO textDTO2, List<ButtonV3DTO> list, BadgeDTO badgeDTO, boolean z11) {
            Intrinsics.checkNotNullParameter(header, "header");
            this.header = header;
            this.sum = textDTO;
            this.status = status;
            this.dateInfo = textDTO2;
            this.buttons = list;
            this.badge = badgeDTO;
            this.showSeparator = z11;
        }

        public static /* synthetic */ Document copy$default(Document document, CellDTO cellDTO, TextDTO textDTO, Status status, TextDTO textDTO2, List list, BadgeDTO badgeDTO, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = document.header;
            }
            if ((i11 & 2) != 0) {
                textDTO = document.sum;
            }
            if ((i11 & 4) != 0) {
                status = document.status;
            }
            if ((i11 & 8) != 0) {
                textDTO2 = document.dateInfo;
            }
            if ((i11 & 16) != 0) {
                list = document.buttons;
            }
            if ((i11 & 32) != 0) {
                badgeDTO = document.badge;
            }
            if ((i11 & 64) != 0) {
                z11 = document.showSeparator;
            }
            BadgeDTO badgeDTO2 = badgeDTO;
            boolean z12 = z11;
            List list2 = list;
            Status status2 = status;
            return document.copy(cellDTO, textDTO, status2, textDTO2, list2, badgeDTO2, z12);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getHeader() {
            return this.header;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSum() {
            return this.sum;
        }

        /* renamed from: component3, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getDateInfo() {
            return this.dateInfo;
        }

        public final List<ButtonV3DTO> component5() {
            return this.buttons;
        }

        /* renamed from: component6, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShowSeparator() {
            return this.showSeparator;
        }

        @NotNull
        public final Document copy(@NotNull CellDTO header, TextDTO sum, Status status, TextDTO dateInfo, List<ButtonV3DTO> buttons, BadgeDTO badge, boolean showSeparator) {
            Intrinsics.checkNotNullParameter(header, "header");
            return new Document(header, sum, status, dateInfo, buttons, badge, showSeparator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Document)) {
                return false;
            }
            Document document = (Document) other;
            return Intrinsics.d(this.header, document.header) && Intrinsics.d(this.sum, document.sum) && Intrinsics.d(this.status, document.status) && Intrinsics.d(this.dateInfo, document.dateInfo) && Intrinsics.d(this.buttons, document.buttons) && Intrinsics.d(this.badge, document.badge) && this.showSeparator == document.showSeparator;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final List<ButtonV3DTO> getButtons() {
            return this.buttons;
        }

        public final TextDTO getDateInfo() {
            return this.dateInfo;
        }

        @NotNull
        public final CellDTO getHeader() {
            return this.header;
        }

        public final boolean getShowSeparator() {
            return this.showSeparator;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final TextDTO getSum() {
            return this.sum;
        }

        public int hashCode() {
            int hashCode = this.header.hashCode() * 31;
            TextDTO textDTO = this.sum;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            Status status = this.status;
            int hashCode3 = (hashCode2 + (status == null ? 0 : status.hashCode())) * 31;
            TextDTO textDTO2 = this.dateInfo;
            int hashCode4 = (hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            List<ButtonV3DTO> list = this.buttons;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            return Boolean.hashCode(this.showSeparator) + ((hashCode5 + (badgeDTO != null ? badgeDTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            CellDTO cellDTO = this.header;
            TextDTO textDTO = this.sum;
            Status status = this.status;
            TextDTO textDTO2 = this.dateInfo;
            List<ButtonV3DTO> list = this.buttons;
            BadgeDTO badgeDTO = this.badge;
            boolean z11 = this.showSeparator;
            StringBuilder sb2 = new StringBuilder("Document(header=");
            sb2.append(cellDTO);
            sb2.append(", sum=");
            sb2.append(textDTO);
            sb2.append(", status=");
            sb2.append(status);
            sb2.append(", dateInfo=");
            sb2.append(textDTO2);
            sb2.append(", buttons=");
            sb2.append(list);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", showSeparator=");
            return a.a(")", sb2, z11);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO$Period;", "", "periodTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "documents", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO$Document;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getPeriodTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDocuments", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Period {
        public static final int $stable = 8;

        @NotNull
        private final List<Document> documents;
        private final TextDTO periodTitle;

        public Period(TextDTO textDTO, @NotNull List<Document> documents) {
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.periodTitle = textDTO;
            this.documents = documents;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Period copy$default(Period period, TextDTO textDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = period.periodTitle;
            }
            if ((i11 & 2) != 0) {
                list = period.documents;
            }
            return period.copy(textDTO, list);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getPeriodTitle() {
            return this.periodTitle;
        }

        @NotNull
        public final List<Document> component2() {
            return this.documents;
        }

        @NotNull
        public final Period copy(TextDTO periodTitle, @NotNull List<Document> documents) {
            Intrinsics.checkNotNullParameter(documents, "documents");
            return new Period(periodTitle, documents);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Period)) {
                return false;
            }
            Period period = (Period) other;
            return Intrinsics.d(this.periodTitle, period.periodTitle) && Intrinsics.d(this.documents, period.documents);
        }

        @NotNull
        public final List<Document> getDocuments() {
            return this.documents;
        }

        public final TextDTO getPeriodTitle() {
            return this.periodTitle;
        }

        public int hashCode() {
            TextDTO textDTO = this.periodTitle;
            return this.documents.hashCode() + ((textDTO == null ? 0 : textDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "Period(periodTitle=" + this.periodTitle + ", documents=" + this.documents + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO$Status;", "", "statusInfo", "Lru/ozon/uni/atoms/data/text/TextDTO;", "statusTitle", "statusIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getStatusInfo", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getStatusTitle", "getStatusIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final IconDTO statusIcon;
        private final TextDTO statusInfo;

        @NotNull
        private final TextDTO statusTitle;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Status(TextDTO textDTO, @NotNull TextDTO statusTitle, @NotNull IconDTO statusIcon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(statusTitle, "statusTitle");
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            this.statusInfo = textDTO;
            this.statusTitle = statusTitle;
            this.statusIcon = statusIcon;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Status copy$default(Status status, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = status.statusInfo;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = status.statusTitle;
            }
            if ((i11 & 4) != 0) {
                iconDTO = status.statusIcon;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = status.action;
            }
            if ((i11 & 16) != 0) {
                map = status.trackingInfo;
            }
            Map map2 = map;
            IconDTO iconDTO2 = iconDTO;
            return status.copy(textDTO, textDTO2, iconDTO2, atomActionDTO, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getStatusInfo() {
            return this.statusInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getStatusTitle() {
            return this.statusTitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final IconDTO getStatusIcon() {
            return this.statusIcon;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final Status copy(TextDTO statusInfo, @NotNull TextDTO statusTitle, @NotNull IconDTO statusIcon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(statusTitle, "statusTitle");
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            return new Status(statusInfo, statusTitle, statusIcon, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            return Intrinsics.d(this.statusInfo, status.statusInfo) && Intrinsics.d(this.statusTitle, status.statusTitle) && Intrinsics.d(this.statusIcon, status.statusIcon) && Intrinsics.d(this.action, status.action) && Intrinsics.d(this.trackingInfo, status.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final IconDTO getStatusIcon() {
            return this.statusIcon;
        }

        public final TextDTO getStatusInfo() {
            return this.statusInfo;
        }

        @NotNull
        public final TextDTO getStatusTitle() {
            return this.statusTitle;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            TextDTO textDTO = this.statusInfo;
            int a11 = C2971a.a(this.statusIcon, b.a(this.statusTitle, (textDTO == null ? 0 : textDTO.hashCode()) * 31, 31), 31);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.statusInfo;
            TextDTO textDTO2 = this.statusTitle;
            IconDTO iconDTO = this.statusIcon;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder g10 = g.g("Status(statusInfo=", textDTO, ", statusTitle=", textDTO2, ", statusIcon=");
            g10.append(iconDTO);
            g10.append(", action=");
            g10.append(atomActionDTO);
            g10.append(", trackingInfo=");
            return P.f(g10, map, ")");
        }
    }

    public DocsTableV2DTO(TextDTO textDTO, @NotNull List<Period> periods) {
        Intrinsics.checkNotNullParameter(periods, "periods");
        this.listTitle = textDTO;
        this.periods = periods;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocsTableV2DTO copy$default(DocsTableV2DTO docsTableV2DTO, TextDTO textDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = docsTableV2DTO.listTitle;
        }
        if ((i11 & 2) != 0) {
            list = docsTableV2DTO.periods;
        }
        return docsTableV2DTO.copy(textDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getListTitle() {
        return this.listTitle;
    }

    @NotNull
    public final List<Period> component2() {
        return this.periods;
    }

    @NotNull
    public final DocsTableV2DTO copy(TextDTO listTitle, @NotNull List<Period> periods) {
        Intrinsics.checkNotNullParameter(periods, "periods");
        return new DocsTableV2DTO(listTitle, periods);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocsTableV2DTO)) {
            return false;
        }
        DocsTableV2DTO docsTableV2DTO = (DocsTableV2DTO) other;
        return Intrinsics.d(this.listTitle, docsTableV2DTO.listTitle) && Intrinsics.d(this.periods, docsTableV2DTO.periods);
    }

    public final TextDTO getListTitle() {
        return this.listTitle;
    }

    @NotNull
    public final List<Period> getPeriods() {
        return this.periods;
    }

    public int hashCode() {
        TextDTO textDTO = this.listTitle;
        return this.periods.hashCode() + ((textDTO == null ? 0 : textDTO.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "DocsTableV2DTO(listTitle=" + this.listTitle + ", periods=" + this.periods + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DTO$DocsTitle;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "hasDivider", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Z)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getHasDivider", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DocsTitle {
        public static final int $stable = 0;
        private final boolean hasDivider;
        private final TextDTO title;

        public DocsTitle(TextDTO textDTO, boolean z11) {
            this.title = textDTO;
            this.hasDivider = z11;
        }

        public static /* synthetic */ DocsTitle copy$default(DocsTitle docsTitle, TextDTO textDTO, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = docsTitle.title;
            }
            if ((i11 & 2) != 0) {
                z11 = docsTitle.hasDivider;
            }
            return docsTitle.copy(textDTO, z11);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasDivider() {
            return this.hasDivider;
        }

        @NotNull
        public final DocsTitle copy(TextDTO title, boolean hasDivider) {
            return new DocsTitle(title, hasDivider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocsTitle)) {
                return false;
            }
            DocsTitle docsTitle = (DocsTitle) other;
            return Intrinsics.d(this.title, docsTitle.title) && this.hasDivider == docsTitle.hasDivider;
        }

        public final boolean getHasDivider() {
            return this.hasDivider;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            return Boolean.hashCode(this.hasDivider) + ((textDTO == null ? 0 : textDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "DocsTitle(title=" + this.title + ", hasDivider=" + this.hasDivider + ")";
        }

        public /* synthetic */ DocsTitle(TextDTO textDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, (i11 & 2) != 0 ? false : z11);
        }
    }
}
