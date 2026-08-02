package ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.monoposting;

import Bl.C2639a;
import De.C2859b;
import El.C2971a;
import G.g;
import Kk.C3532b;
import Nh.a;
import Ns.b;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0080\b\u0018\u00002\u00020\u0001:\u0001;Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b\u0005\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b,\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b0\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b:\u00106¨\u0006<"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/monoposting/MonopostingVO;", "Ll20/c;", "", "id", "", "isSelected", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "info", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "selectedIds", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/monoposting/MonopostingVO$PriceIncreaseInfoVO;", "priceIncreaseInfo", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "titleBadge", "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleAtom", "imageBadge", "<init>", "(JZLru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/monoposting/MonopostingVO$PriceIncreaseInfoVO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Ljava/lang/String;", "getTitle", "getSubtitle", "getInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getSelectedIds", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/monoposting/MonopostingVO$PriceIncreaseInfoVO;", "getPriceIncreaseInfo", "()Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/monoposting/MonopostingVO$PriceIncreaseInfoVO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTitleBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleAtom", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getImageBadge", "PriceIncreaseInfoVO", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MonopostingVO implements c {
    private final AtomAction action;
    private final long id;

    @NotNull
    private final ImageDTO image;
    private final BadgeDTO imageBadge;
    private final String info;
    private final boolean isSelected;
    private final PriceIncreaseInfoVO priceIncreaseInfo;
    private final String selectedIds;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    @NotNull
    private final TextDTO titleAtom;
    private final BadgeDTO titleBadge;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/monoposting/MonopostingVO$PriceIncreaseInfoVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "trackingEvent", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingEvent", "()LWZ/t;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceIncreaseInfoVO {

        @NotNull
        private final AtomAction action;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO title;
        private final t trackingEvent;

        public PriceIncreaseInfoVO(@NotNull TextDTO title, @NotNull IconDTO icon, @NotNull AtomAction action, t tVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.icon = icon;
            this.action = action;
            this.trackingEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceIncreaseInfoVO)) {
                return false;
            }
            PriceIncreaseInfoVO priceIncreaseInfoVO = (PriceIncreaseInfoVO) other;
            return Intrinsics.d(this.title, priceIncreaseInfoVO.title) && Intrinsics.d(this.icon, priceIncreaseInfoVO.icon) && Intrinsics.d(this.action, priceIncreaseInfoVO.action) && Intrinsics.d(this.trackingEvent, priceIncreaseInfoVO.trackingEvent);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTrackingEvent() {
            return this.trackingEvent;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.action, C2971a.a(this.icon, this.title.hashCode() * 31, 31), 31);
            t tVar = this.trackingEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.icon;
            return C2859b.e(this.trackingEvent, ", trackingEvent=", ")", C2639a.d("PriceIncreaseInfoVO(title=", ", icon=", ", action=", iconDTO, textDTO), this.action);
        }
    }

    public MonopostingVO(long j11, boolean z11, @NotNull ImageDTO image, @NotNull String title, @NotNull String subtitle, String str, AtomAction atomAction, String str2, PriceIncreaseInfoVO priceIncreaseInfoVO, BadgeDTO badgeDTO, @NotNull TextDTO titleAtom, BadgeDTO badgeDTO2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        this.id = j11;
        this.isSelected = z11;
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.info = str;
        this.action = atomAction;
        this.selectedIds = str2;
        this.priceIncreaseInfo = priceIncreaseInfoVO;
        this.titleBadge = badgeDTO;
        this.titleAtom = titleAtom;
        this.imageBadge = badgeDTO2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonopostingVO)) {
            return false;
        }
        MonopostingVO monopostingVO = (MonopostingVO) other;
        return this.id == monopostingVO.id && this.isSelected == monopostingVO.isSelected && Intrinsics.d(this.image, monopostingVO.image) && Intrinsics.d(this.title, monopostingVO.title) && Intrinsics.d(this.subtitle, monopostingVO.subtitle) && Intrinsics.d(this.info, monopostingVO.info) && Intrinsics.d(this.action, monopostingVO.action) && Intrinsics.d(this.selectedIds, monopostingVO.selectedIds) && Intrinsics.d(this.priceIncreaseInfo, monopostingVO.priceIncreaseInfo) && Intrinsics.d(this.titleBadge, monopostingVO.titleBadge) && Intrinsics.d(this.titleAtom, monopostingVO.titleAtom) && Intrinsics.d(this.imageBadge, monopostingVO.imageBadge);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final BadgeDTO getImageBadge() {
        return this.imageBadge;
    }

    public final String getInfo() {
        return this.info;
    }

    public final PriceIncreaseInfoVO getPriceIncreaseInfo() {
        return this.priceIncreaseInfo;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSelectedIds() {
        return this.selectedIds;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitleAtom() {
        return this.titleAtom;
    }

    public final BadgeDTO getTitleBadge() {
        return this.titleBadge;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a(a.b(this.image, C3532b.a(Long.hashCode(this.id) * 31, 31, this.isSelected), 31), 31, this.title), 31, this.subtitle);
        String str = this.info;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str2 = this.selectedIds;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PriceIncreaseInfoVO priceIncreaseInfoVO = this.priceIncreaseInfo;
        int hashCode4 = (hashCode3 + (priceIncreaseInfoVO == null ? 0 : priceIncreaseInfoVO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.titleBadge;
        int a12 = b.a(this.titleAtom, (hashCode4 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
        BadgeDTO badgeDTO2 = this.imageBadge;
        return a12 + (badgeDTO2 != null ? badgeDTO2.hashCode() : 0);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isSelected;
        ImageDTO imageDTO = this.image;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.info;
        AtomAction atomAction = this.action;
        String str4 = this.selectedIds;
        PriceIncreaseInfoVO priceIncreaseInfoVO = this.priceIncreaseInfo;
        BadgeDTO badgeDTO = this.titleBadge;
        TextDTO textDTO = this.titleAtom;
        BadgeDTO badgeDTO2 = this.imageBadge;
        StringBuilder c11 = Bl.b.c(j11, "MonopostingVO(id=", ", isSelected=", z11);
        c11.append(", image=");
        c11.append(imageDTO);
        c11.append(", title=");
        c11.append(str);
        a.h(c11, ", subtitle=", str2, ", info=", str3);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", selectedIds=");
        c11.append(str4);
        c11.append(", priceIncreaseInfo=");
        c11.append(priceIncreaseInfoVO);
        c11.append(", titleBadge=");
        c11.append(badgeDTO);
        c11.append(", titleAtom=");
        c11.append(textDTO);
        c11.append(", imageBadge=");
        c11.append(badgeDTO2);
        c11.append(")");
        return c11.toString();
    }
}
