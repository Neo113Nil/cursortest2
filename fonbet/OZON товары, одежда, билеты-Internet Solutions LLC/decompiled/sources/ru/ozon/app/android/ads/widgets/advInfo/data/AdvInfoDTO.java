package ru.ozon.app.android.ads.widgets.advInfo.data;

import B90.C2619v;
import G.g;
import HY.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006#"}, d2 = {"Lru/ozon/app/android/ads/widgets/advInfo/data/AdvInfoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "copyLinkUrl", "", "notificationText", "advertiserInfoCell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "copyLinkCell", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getCopyLinkUrl", "()Ljava/lang/String;", "getNotificationText", "getAdvertiserInfoCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "getCopyLinkCell", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AdvInfoDTO {

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon advertiserInfoCell;

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon copyLinkCell;

    @NotNull
    private final String copyLinkUrl;

    @NotNull
    private final TextAtom description;

    @NotNull
    private final String notificationText;

    @NotNull
    private final TextAtom title;

    public AdvInfoDTO(@NotNull TextAtom title, @NotNull TextAtom description, @NotNull String copyLinkUrl, @NotNull String notificationText, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon advertiserInfoCell, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon copyLinkCell) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(copyLinkUrl, "copyLinkUrl");
        Intrinsics.checkNotNullParameter(notificationText, "notificationText");
        Intrinsics.checkNotNullParameter(advertiserInfoCell, "advertiserInfoCell");
        Intrinsics.checkNotNullParameter(copyLinkCell, "copyLinkCell");
        this.title = title;
        this.description = description;
        this.copyLinkUrl = copyLinkUrl;
        this.notificationText = notificationText;
        this.advertiserInfoCell = advertiserInfoCell;
        this.copyLinkCell = copyLinkCell;
    }

    public static /* synthetic */ AdvInfoDTO copy$default(AdvInfoDTO advInfoDTO, TextAtom textAtom, TextAtom textAtom2, String str, String str2, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = advInfoDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = advInfoDTO.description;
        }
        if ((i11 & 4) != 0) {
            str = advInfoDTO.copyLinkUrl;
        }
        if ((i11 & 8) != 0) {
            str2 = advInfoDTO.notificationText;
        }
        if ((i11 & 16) != 0) {
            cellWithSubtitle24Icon = advInfoDTO.advertiserInfoCell;
        }
        if ((i11 & 32) != 0) {
            cellWithSubtitle24Icon2 = advInfoDTO.copyLinkCell;
        }
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon3 = cellWithSubtitle24Icon;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon4 = cellWithSubtitle24Icon2;
        return advInfoDTO.copy(textAtom, textAtom2, str, str2, cellWithSubtitle24Icon3, cellWithSubtitle24Icon4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCopyLinkUrl() {
        return this.copyLinkUrl;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getNotificationText() {
        return this.notificationText;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getAdvertiserInfoCell() {
        return this.advertiserInfoCell;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getCopyLinkCell() {
        return this.copyLinkCell;
    }

    @NotNull
    public final AdvInfoDTO copy(@NotNull TextAtom title, @NotNull TextAtom description, @NotNull String copyLinkUrl, @NotNull String notificationText, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon advertiserInfoCell, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon copyLinkCell) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(copyLinkUrl, "copyLinkUrl");
        Intrinsics.checkNotNullParameter(notificationText, "notificationText");
        Intrinsics.checkNotNullParameter(advertiserInfoCell, "advertiserInfoCell");
        Intrinsics.checkNotNullParameter(copyLinkCell, "copyLinkCell");
        return new AdvInfoDTO(title, description, copyLinkUrl, notificationText, advertiserInfoCell, copyLinkCell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvInfoDTO)) {
            return false;
        }
        AdvInfoDTO advInfoDTO = (AdvInfoDTO) other;
        return Intrinsics.d(this.title, advInfoDTO.title) && Intrinsics.d(this.description, advInfoDTO.description) && Intrinsics.d(this.copyLinkUrl, advInfoDTO.copyLinkUrl) && Intrinsics.d(this.notificationText, advInfoDTO.notificationText) && Intrinsics.d(this.advertiserInfoCell, advInfoDTO.advertiserInfoCell) && Intrinsics.d(this.copyLinkCell, advInfoDTO.copyLinkCell);
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

    @NotNull
    public final String getNotificationText() {
        return this.notificationText;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.copyLinkCell.hashCode() + ((this.advertiserInfoCell.hashCode() + g.a(g.a(C2619v.b(this.title.hashCode() * 31, 31, this.description), 31, this.copyLinkUrl), 31, this.notificationText)) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.description;
        String str = this.copyLinkUrl;
        String str2 = this.notificationText;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon = this.advertiserInfoCell;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon2 = this.copyLinkCell;
        StringBuilder a11 = a.a("AdvInfoDTO(title=", textAtom, ", description=", textAtom2, ", copyLinkUrl=");
        Nh.a.h(a11, str, ", notificationText=", str2, ", advertiserInfoCell=");
        a11.append(cellWithSubtitle24Icon);
        a11.append(", copyLinkCell=");
        a11.append(cellWithSubtitle24Icon2);
        a11.append(")");
        return a11.toString();
    }
}
