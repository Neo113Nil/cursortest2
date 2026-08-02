package ru.ozon.app.android.partnerBanks.presentation;

import B0.C2454a;
import Ek.a;
import K1.G;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO$BankIcon;", "icons", "", "iconsSize", "iconsPadding", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;IILru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "I", "getIconsSize", "getIconsPadding", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PartnerBanksVO {
    private final AtomAction action;
    private final BadgeDTO badge;
    private final List<PartnerBanksDTO.BankIcon> icons;
    private final int iconsPadding;
    private final int iconsSize;
    private final TestInfo testInfo;
    private final TextDTO title;
    private final t tokenizedEvent;

    public PartnerBanksVO(TextDTO textDTO, List<PartnerBanksDTO.BankIcon> list, int i11, int i12, BadgeDTO badgeDTO, AtomAction atomAction, t tVar, TestInfo testInfo) {
        this.title = textDTO;
        this.icons = list;
        this.iconsSize = i11;
        this.iconsPadding = i12;
        this.badge = badgeDTO;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerBanksVO)) {
            return false;
        }
        PartnerBanksVO partnerBanksVO = (PartnerBanksVO) other;
        return Intrinsics.d(this.title, partnerBanksVO.title) && Intrinsics.d(this.icons, partnerBanksVO.icons) && this.iconsSize == partnerBanksVO.iconsSize && this.iconsPadding == partnerBanksVO.iconsPadding && Intrinsics.d(this.badge, partnerBanksVO.badge) && Intrinsics.d(this.action, partnerBanksVO.action) && Intrinsics.d(this.tokenizedEvent, partnerBanksVO.tokenizedEvent) && Intrinsics.d(this.testInfo, partnerBanksVO.testInfo);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final List<PartnerBanksDTO.BankIcon> getIcons() {
        return this.icons;
    }

    public final int getIconsPadding() {
        return this.iconsPadding;
    }

    public final int getIconsSize() {
        return this.iconsSize;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        List<PartnerBanksDTO.BankIcon> list = this.icons;
        int a11 = C2454a.a(this.iconsPadding, C2454a.a(this.iconsSize, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode4 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<PartnerBanksDTO.BankIcon> list = this.icons;
        int i11 = this.iconsSize;
        int i12 = this.iconsPadding;
        BadgeDTO badgeDTO = this.badge;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        TestInfo testInfo = this.testInfo;
        StringBuilder e11 = G.e("PartnerBanksVO(title=", textDTO, ", icons=", list, ", iconsSize=");
        a.f(i11, i12, ", iconsPadding=", ", badge=", e11);
        e11.append(badgeDTO);
        e11.append(", action=");
        e11.append(atomAction);
        e11.append(", tokenizedEvent=");
        e11.append(tVar);
        e11.append(", testInfo=");
        e11.append(testInfo);
        e11.append(")");
        return e11.toString();
    }
}
