package ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.data;

import D3.g;
import T7.P;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO;", "", "listTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "periods", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO$Period;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getListTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPeriods", "()Ljava/util/List;", "Period", "Document", "Header", "Status", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DocsTableDTO {
    public static final int $stable = 8;
    private final TextDTO listTitle;

    @NotNull
    private final List<Period> periods;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO$Document;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO$Header;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "status", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO$Status;", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "info", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO$Header;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO$Status;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getHeader", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO$Header;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getStatus", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO$Status;", "getButtons", "()Ljava/util/List;", "getInfo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Document {
        public static final int $stable = 8;
        private final List<ButtonV3DTO> buttons;

        @NotNull
        private final Header header;
        private final TextDTO info;
        private final Status status;
        private final TextDTO text;

        public Document(@NotNull Header header, TextDTO textDTO, Status status, List<ButtonV3DTO> list, TextDTO textDTO2) {
            Intrinsics.checkNotNullParameter(header, "header");
            this.header = header;
            this.text = textDTO;
            this.status = status;
            this.buttons = list;
            this.info = textDTO2;
        }

        public static /* synthetic */ Document copy$default(Document document, Header header, TextDTO textDTO, Status status, List list, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                header = document.header;
            }
            if ((i11 & 2) != 0) {
                textDTO = document.text;
            }
            if ((i11 & 4) != 0) {
                status = document.status;
            }
            if ((i11 & 8) != 0) {
                list = document.buttons;
            }
            if ((i11 & 16) != 0) {
                textDTO2 = document.info;
            }
            TextDTO textDTO3 = textDTO2;
            Status status2 = status;
            return document.copy(header, textDTO, status2, list, textDTO3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Header getHeader() {
            return this.header;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        public final List<ButtonV3DTO> component4() {
            return this.buttons;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getInfo() {
            return this.info;
        }

        @NotNull
        public final Document copy(@NotNull Header header, TextDTO text, Status status, List<ButtonV3DTO> buttons, TextDTO info) {
            Intrinsics.checkNotNullParameter(header, "header");
            return new Document(header, text, status, buttons, info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Document)) {
                return false;
            }
            Document document = (Document) other;
            return Intrinsics.d(this.header, document.header) && Intrinsics.d(this.text, document.text) && Intrinsics.d(this.status, document.status) && Intrinsics.d(this.buttons, document.buttons) && Intrinsics.d(this.info, document.info);
        }

        public final List<ButtonV3DTO> getButtons() {
            return this.buttons;
        }

        @NotNull
        public final Header getHeader() {
            return this.header;
        }

        public final TextDTO getInfo() {
            return this.info;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.header.hashCode() * 31;
            TextDTO textDTO = this.text;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            Status status = this.status;
            int hashCode3 = (hashCode2 + (status == null ? 0 : status.hashCode())) * 31;
            List<ButtonV3DTO> list = this.buttons;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            TextDTO textDTO2 = this.info;
            return hashCode4 + (textDTO2 != null ? textDTO2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Header header = this.header;
            TextDTO textDTO = this.text;
            Status status = this.status;
            List<ButtonV3DTO> list = this.buttons;
            TextDTO textDTO2 = this.info;
            StringBuilder sb2 = new StringBuilder("Document(header=");
            sb2.append(header);
            sb2.append(", text=");
            sb2.append(textDTO);
            sb2.append(", status=");
            sb2.append(status);
            sb2.append(", buttons=");
            sb2.append(list);
            sb2.append(", info=");
            return b.e(sb2, textDTO2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO$Header;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "date", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final TextDTO date;
        private final IconButtonV3DTO iconButton;

        @NotNull
        private final TextDTO title;

        public Header(@NotNull TextDTO title, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.iconButton = iconButtonV3DTO;
            this.date = textDTO;
        }

        public static /* synthetic */ Header copy$default(Header header, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = header.title;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO = header.iconButton;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = header.date;
            }
            return header.copy(textDTO, iconButtonV3DTO, textDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getDate() {
            return this.date;
        }

        @NotNull
        public final Header copy(@NotNull TextDTO title, IconButtonV3DTO iconButton, TextDTO date) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Header(title, iconButton, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.iconButton, header.iconButton) && Intrinsics.d(this.date, header.date);
        }

        public final TextDTO getDate() {
            return this.date;
        }

        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            TextDTO textDTO = this.date;
            return hashCode2 + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            TextDTO textDTO2 = this.date;
            StringBuilder sb2 = new StringBuilder("Header(title=");
            sb2.append(textDTO);
            sb2.append(", iconButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", date=");
            return b.e(sb2, textDTO2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO$Period;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "items", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO$Document;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Period {
        public static final int $stable = 8;

        @NotNull
        private final List<Document> items;
        private final TextDTO title;

        public Period(TextDTO textDTO, @NotNull List<Document> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.title = textDTO;
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Period copy$default(Period period, TextDTO textDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = period.title;
            }
            if ((i11 & 2) != 0) {
                list = period.items;
            }
            return period.copy(textDTO, list);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final List<Document> component2() {
            return this.items;
        }

        @NotNull
        public final Period copy(TextDTO title, @NotNull List<Document> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new Period(title, items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Period)) {
                return false;
            }
            Period period = (Period) other;
            return Intrinsics.d(this.title, period.title) && Intrinsics.d(this.items, period.items);
        }

        @NotNull
        public final List<Document> getItems() {
            return this.items;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            return this.items.hashCode() + ((textDTO == null ? 0 : textDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "Period(title=" + this.title + ", items=" + this.items + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/data/DocsTableDTO$Status;", "", "status", "Lru/ozon/uni/atoms/data/text/TextDTO;", "statusTitle", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getStatus", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getStatusTitle", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final IconDTO icon;

        @NotNull
        private final TextDTO status;
        private final TextDTO statusTitle;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Status(@NotNull TextDTO status, TextDTO textDTO, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
            this.statusTitle = textDTO;
            this.icon = iconDTO;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Status copy$default(Status status, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = status.status;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = status.statusTitle;
            }
            if ((i11 & 4) != 0) {
                iconDTO = status.icon;
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

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getStatusTitle() {
            return this.statusTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final Status copy(@NotNull TextDTO status, TextDTO statusTitle, IconDTO icon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new Status(status, statusTitle, icon, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            return Intrinsics.d(this.status, status.status) && Intrinsics.d(this.statusTitle, status.statusTitle) && Intrinsics.d(this.icon, status.icon) && Intrinsics.d(this.action, status.action) && Intrinsics.d(this.trackingInfo, status.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getStatus() {
            return this.status;
        }

        public final TextDTO getStatusTitle() {
            return this.statusTitle;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.status.hashCode() * 31;
            TextDTO textDTO = this.statusTitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.status;
            TextDTO textDTO2 = this.statusTitle;
            IconDTO iconDTO = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder g10 = g.g("Status(status=", textDTO, ", statusTitle=", textDTO2, ", icon=");
            g10.append(iconDTO);
            g10.append(", action=");
            g10.append(atomActionDTO);
            g10.append(", trackingInfo=");
            return P.f(g10, map, ")");
        }
    }

    public DocsTableDTO(TextDTO textDTO, @NotNull List<Period> periods) {
        Intrinsics.checkNotNullParameter(periods, "periods");
        this.listTitle = textDTO;
        this.periods = periods;
    }

    public final TextDTO getListTitle() {
        return this.listTitle;
    }

    @NotNull
    public final List<Period> getPeriods() {
        return this.periods;
    }
}
