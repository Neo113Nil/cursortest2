package ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation;

import Ak.C2436a;
import D3.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001#B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "cellItems", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingVO$NotificationVO;", "notification", "<init>", "(JLjava/lang/String;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingVO$NotificationVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getCellItems", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingVO$NotificationVO;", "getNotification", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingVO$NotificationVO;", "NotificationVO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AccompanyingDocsDownloadingVO implements c {

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> cellItems;
    private final long id;
    private final NotificationVO notification;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingVO$NotificationVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "body", "", "icon", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "button", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getBody", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getIcon", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotificationVO {
        public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable;

        @NotNull
        private final TextDTO body;

        @NotNull
        private final ButtonV3Atom.SmallBorderlessButton button;
        private final String icon;

        public NotificationVO(@NotNull TextDTO body, String str, @NotNull ButtonV3Atom.SmallBorderlessButton button) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(button, "button");
            this.body = body;
            this.icon = str;
            this.button = button;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationVO)) {
                return false;
            }
            NotificationVO notificationVO = (NotificationVO) other;
            return Intrinsics.d(this.body, notificationVO.body) && Intrinsics.d(this.icon, notificationVO.icon) && Intrinsics.d(this.button, notificationVO.button);
        }

        @NotNull
        public final TextDTO getBody() {
            return this.body;
        }

        @NotNull
        public final ButtonV3Atom.SmallBorderlessButton getButton() {
            return this.button;
        }

        public int hashCode() {
            int hashCode = this.body.hashCode() * 31;
            String str = this.icon;
            return this.button.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.body;
            String str = this.icon;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
            StringBuilder f7 = g.f("NotificationVO(body=", textDTO, ", icon=", str, ", button=");
            f7.append(smallBorderlessButton);
            f7.append(")");
            return f7.toString();
        }
    }

    public AccompanyingDocsDownloadingVO(long j11, @NotNull String title, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> cellItems, NotificationVO notificationVO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cellItems, "cellItems");
        this.id = j11;
        this.title = title;
        this.cellItems = cellItems;
        this.notification = notificationVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccompanyingDocsDownloadingVO)) {
            return false;
        }
        AccompanyingDocsDownloadingVO accompanyingDocsDownloadingVO = (AccompanyingDocsDownloadingVO) other;
        return this.id == accompanyingDocsDownloadingVO.id && Intrinsics.d(this.title, accompanyingDocsDownloadingVO.title) && Intrinsics.d(this.cellItems, accompanyingDocsDownloadingVO.cellItems) && Intrinsics.d(this.notification, accompanyingDocsDownloadingVO.notification);
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> getCellItems() {
        return this.cellItems;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final NotificationVO getNotification() {
        return this.notification;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = G.g.b(G.g.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.cellItems);
        NotificationVO notificationVO = this.notification;
        return b11 + (notificationVO == null ? 0 : notificationVO.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list = this.cellItems;
        NotificationVO notificationVO = this.notification;
        StringBuilder c11 = C2436a.c(j11, "AccompanyingDocsDownloadingVO(id=", ", title=", str);
        c11.append(", cellItems=");
        c11.append(list);
        c11.append(", notification=");
        c11.append(notificationVO);
        c11.append(")");
        return c11.toString();
    }
}
