package ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.data;

import Bl.b;
import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/data/AccompanyingDocsDownloadingDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "documents", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/data/AccompanyingDocsDownloadingDTO$DocumentDTO;", "notification", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/data/AccompanyingDocsDownloadingDTO$NotificationDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/data/AccompanyingDocsDownloadingDTO$NotificationDTO;)V", "getTitle", "()Ljava/lang/String;", "getDocuments", "()Ljava/util/List;", "getNotification", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/data/AccompanyingDocsDownloadingDTO$NotificationDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "DocumentDTO", "NotificationDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AccompanyingDocsDownloadingDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<DocumentDTO> documents;
    private final NotificationDTO notification;

    @NotNull
    private final String title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/data/AccompanyingDocsDownloadingDTO$DocumentDTO;", "", "cellWithSubtitle24Icon", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;)V", "getCellWithSubtitle24Icon", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DocumentDTO {
        public static final int $stable = 8;
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon;

        public DocumentDTO(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon) {
            this.cellWithSubtitle24Icon = cellWithSubtitle24Icon;
        }

        public static /* synthetic */ DocumentDTO copy$default(DocumentDTO documentDTO, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellWithSubtitle24Icon = documentDTO.cellWithSubtitle24Icon;
            }
            return documentDTO.copy(cellWithSubtitle24Icon);
        }

        /* renamed from: component1, reason: from getter */
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getCellWithSubtitle24Icon() {
            return this.cellWithSubtitle24Icon;
        }

        @NotNull
        public final DocumentDTO copy(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon) {
            return new DocumentDTO(cellWithSubtitle24Icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DocumentDTO) && Intrinsics.d(this.cellWithSubtitle24Icon, ((DocumentDTO) other).cellWithSubtitle24Icon);
        }

        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getCellWithSubtitle24Icon() {
            return this.cellWithSubtitle24Icon;
        }

        public int hashCode() {
            CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon = this.cellWithSubtitle24Icon;
            if (cellWithSubtitle24Icon == null) {
                return 0;
            }
            return cellWithSubtitle24Icon.hashCode();
        }

        @NotNull
        public String toString() {
            return "DocumentDTO(cellWithSubtitle24Icon=" + this.cellWithSubtitle24Icon + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/data/AccompanyingDocsDownloadingDTO$NotificationDTO;", "", "body", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "getBody", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Ljava/lang/String;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotificationDTO {
        public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable | TextAtom.$stable;

        @NotNull
        private final TextAtom body;

        @NotNull
        private final ButtonV3Atom.SmallBorderlessButton button;
        private final String icon;

        public NotificationDTO(@NotNull TextAtom body, String str, @NotNull ButtonV3Atom.SmallBorderlessButton button) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(button, "button");
            this.body = body;
            this.icon = str;
            this.button = button;
        }

        public static /* synthetic */ NotificationDTO copy$default(NotificationDTO notificationDTO, TextAtom textAtom, String str, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = notificationDTO.body;
            }
            if ((i11 & 2) != 0) {
                str = notificationDTO.icon;
            }
            if ((i11 & 4) != 0) {
                smallBorderlessButton = notificationDTO.button;
            }
            return notificationDTO.copy(textAtom, str, smallBorderlessButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getBody() {
            return this.body;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.SmallBorderlessButton getButton() {
            return this.button;
        }

        @NotNull
        public final NotificationDTO copy(@NotNull TextAtom body, String icon, @NotNull ButtonV3Atom.SmallBorderlessButton button) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(button, "button");
            return new NotificationDTO(body, icon, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationDTO)) {
                return false;
            }
            NotificationDTO notificationDTO = (NotificationDTO) other;
            return Intrinsics.d(this.body, notificationDTO.body) && Intrinsics.d(this.icon, notificationDTO.icon) && Intrinsics.d(this.button, notificationDTO.button);
        }

        @NotNull
        public final TextAtom getBody() {
            return this.body;
        }

        @NotNull
        public final ButtonV3Atom.SmallBorderlessButton getButton() {
            return this.button;
        }

        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            int hashCode = this.body.hashCode() * 31;
            String str = this.icon;
            return this.button.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.body;
            String str = this.icon;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
            StringBuilder d11 = b.d("NotificationDTO(body=", ", icon=", str, ", button=", textAtom);
            d11.append(smallBorderlessButton);
            d11.append(")");
            return d11.toString();
        }
    }

    public AccompanyingDocsDownloadingDTO(@NotNull String title, @NotNull List<DocumentDTO> documents, NotificationDTO notificationDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.title = title;
        this.documents = documents;
        this.notification = notificationDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccompanyingDocsDownloadingDTO copy$default(AccompanyingDocsDownloadingDTO accompanyingDocsDownloadingDTO, String str, List list, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accompanyingDocsDownloadingDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = accompanyingDocsDownloadingDTO.documents;
        }
        if ((i11 & 4) != 0) {
            notificationDTO = accompanyingDocsDownloadingDTO.notification;
        }
        return accompanyingDocsDownloadingDTO.copy(str, list, notificationDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<DocumentDTO> component2() {
        return this.documents;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final AccompanyingDocsDownloadingDTO copy(@NotNull String title, @NotNull List<DocumentDTO> documents, NotificationDTO notification) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(documents, "documents");
        return new AccompanyingDocsDownloadingDTO(title, documents, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccompanyingDocsDownloadingDTO)) {
            return false;
        }
        AccompanyingDocsDownloadingDTO accompanyingDocsDownloadingDTO = (AccompanyingDocsDownloadingDTO) other;
        return Intrinsics.d(this.title, accompanyingDocsDownloadingDTO.title) && Intrinsics.d(this.documents, accompanyingDocsDownloadingDTO.documents) && Intrinsics.d(this.notification, accompanyingDocsDownloadingDTO.notification);
    }

    @NotNull
    public final List<DocumentDTO> getDocuments() {
        return this.documents;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = g.b(this.title.hashCode() * 31, 31, this.documents);
        NotificationDTO notificationDTO = this.notification;
        return b11 + (notificationDTO == null ? 0 : notificationDTO.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.title;
        List<DocumentDTO> list = this.documents;
        NotificationDTO notificationDTO = this.notification;
        StringBuilder f7 = Tl.b.f("AccompanyingDocsDownloadingDTO(title=", str, ", documents=", ", notification=", list);
        f7.append(notificationDTO);
        f7.append(")");
        return f7.toString();
    }
}
