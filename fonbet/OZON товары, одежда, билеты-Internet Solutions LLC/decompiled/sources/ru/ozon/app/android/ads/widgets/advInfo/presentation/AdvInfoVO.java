package ru.ozon.app.android.ads.widgets.advInfo.presentation;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b#\u0010\u0011R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b'\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/ads/widgets/advInfo/presentation/AdvInfoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "", "copyLinkUrl", "notificationText", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "advertiserInfoCell", "copyLinkCell", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "Ljava/lang/String;", "getCopyLinkUrl", "getNotificationText", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "getAdvertiserInfoCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "getCopyLinkCell", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AdvInfoVO implements c {

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon advertiserInfoCell;

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon copyLinkCell;

    @NotNull
    private final String copyLinkUrl;

    @NotNull
    private final TextAtom description;
    private final long id;

    @NotNull
    private final String notificationText;

    @NotNull
    private final TextAtom title;

    public AdvInfoVO(long j11, @NotNull TextAtom title, @NotNull TextAtom description, @NotNull String copyLinkUrl, @NotNull String notificationText, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon advertiserInfoCell, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon copyLinkCell) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(copyLinkUrl, "copyLinkUrl");
        Intrinsics.checkNotNullParameter(notificationText, "notificationText");
        Intrinsics.checkNotNullParameter(advertiserInfoCell, "advertiserInfoCell");
        Intrinsics.checkNotNullParameter(copyLinkCell, "copyLinkCell");
        this.id = j11;
        this.title = title;
        this.description = description;
        this.copyLinkUrl = copyLinkUrl;
        this.notificationText = notificationText;
        this.advertiserInfoCell = advertiserInfoCell;
        this.copyLinkCell = copyLinkCell;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvInfoVO)) {
            return false;
        }
        AdvInfoVO advInfoVO = (AdvInfoVO) other;
        return this.id == advInfoVO.id && Intrinsics.d(this.title, advInfoVO.title) && Intrinsics.d(this.description, advInfoVO.description) && Intrinsics.d(this.copyLinkUrl, advInfoVO.copyLinkUrl) && Intrinsics.d(this.notificationText, advInfoVO.notificationText) && Intrinsics.d(this.advertiserInfoCell, advInfoVO.advertiserInfoCell) && Intrinsics.d(this.copyLinkCell, advInfoVO.copyLinkCell);
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getAdvertiserInfoCell() {
        return this.advertiserInfoCell;
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getCopyLinkCell() {
        return this.copyLinkCell;
    }

    @NotNull
    public final String getCopyLinkUrl() {
        return this.copyLinkUrl;
    }

    @NotNull
    public final TextAtom getDescription() {
        return this.description;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getNotificationText() {
        return this.notificationText;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.copyLinkCell.hashCode() + ((this.advertiserInfoCell.hashCode() + g.a(g.a(C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.description), 31, this.copyLinkUrl), 31, this.notificationText)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.description;
        String str = this.copyLinkUrl;
        String str2 = this.notificationText;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon = this.advertiserInfoCell;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon2 = this.copyLinkCell;
        StringBuilder c11 = C2639a.c("AdvInfoVO(id=", j11, ", title=", textAtom);
        c11.append(", description=");
        c11.append(textAtom2);
        c11.append(", copyLinkUrl=");
        c11.append(str);
        c11.append(", notificationText=");
        c11.append(str2);
        c11.append(", advertiserInfoCell=");
        c11.append(cellWithSubtitle24Icon);
        c11.append(", copyLinkCell=");
        c11.append(cellWithSubtitle24Icon2);
        c11.append(")");
        return c11.toString();
    }
}
