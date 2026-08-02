package ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.presentation;

import D3.g;
import D3.h;
import T7.P;
import TY.a;
import Tl.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002 !B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "listTitle", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Period;", "periods", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getListTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getPeriods", "()Ljava/util/List;", "Period", "Document", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DocsTableVO implements c {
    private final long id;
    private final TextDTO listTitle;

    @NotNull
    private final List<Period> periods;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002%&B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b$\u0010\u001d¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Header;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Status;", "status", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "info", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Header;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Status;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Header;", "getHeader", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Header;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Status;", "getStatus", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Status;", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "getInfo", "Header", "Status", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Document {
        private final List<ButtonV3DTO> buttons;

        @NotNull
        private final Header header;
        private final TextDTO info;
        private final Status status;
        private final TextDTO text;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Header;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "date", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDate", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Status;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "status", "statusTitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getStatus", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getStatusTitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Status {
            private final AtomActionDTO action;
            private final IconDTO icon;
            private final TextDTO status;
            private final TextDTO statusTitle;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public Status(TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                this.status = textDTO;
                this.statusTitle = textDTO2;
                this.icon = iconDTO;
                this.action = atomActionDTO;
                this.trackingInfo = map;
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
                TextDTO textDTO = this.status;
                int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
                TextDTO textDTO2 = this.statusTitle;
                int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
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

        public Document(@NotNull Header header, TextDTO textDTO, Status status, List<ButtonV3DTO> list, TextDTO textDTO2) {
            Intrinsics.checkNotNullParameter(header, "header");
            this.header = header;
            this.text = textDTO;
            this.status = status;
            this.buttons = list;
            this.info = textDTO2;
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

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Period;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document;", "items", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Period {

        @NotNull
        private final List<Document> items;
        private final TextDTO title;

        public Period(TextDTO textDTO, @NotNull List<Document> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.title = textDTO;
            this.items = items;
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

    public DocsTableVO(long j11, TextDTO textDTO, @NotNull List<Period> periods) {
        Intrinsics.checkNotNullParameter(periods, "periods");
        this.id = j11;
        this.listTitle = textDTO;
        this.periods = periods;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocsTableVO)) {
            return false;
        }
        DocsTableVO docsTableVO = (DocsTableVO) other;
        return this.id == docsTableVO.id && Intrinsics.d(this.listTitle, docsTableVO.listTitle) && Intrinsics.d(this.periods, docsTableVO.periods);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TextDTO getListTitle() {
        return this.listTitle;
    }

    @NotNull
    public final List<Period> getPeriods() {
        return this.periods;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.listTitle;
        return this.periods.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.listTitle;
        return h.c(a.b("DocsTableVO(id=", j11, ", listTitle=", textDTO), ", periods=", this.periods, ")");
    }
}
