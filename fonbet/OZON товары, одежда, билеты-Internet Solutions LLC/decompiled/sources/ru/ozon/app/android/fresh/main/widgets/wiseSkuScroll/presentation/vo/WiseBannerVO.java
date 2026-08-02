package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo;

import De.C2859b;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Tl.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001:\u0001.BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b$\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\"\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "imageUrl", "videoUrl", "", "isLiveVideo", "promoBadgeUrl", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO$BadgeVO;", "adsBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO$BadgeVO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getImageUrl", "getVideoUrl", "Z", "()Z", "getPromoBadgeUrl", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO$BadgeVO;", "getAdsBadge", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO$BadgeVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "BadgeVO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WiseBannerVO implements WiseSkuScrollElement {
    private final BadgeVO adsBadge;
    private final AtomAction atomAction;

    @NotNull
    private final String imageUrl;
    private final boolean isLiveVideo;
    private final String promoBadgeUrl;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;
    private final String videoUrl;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO$BadgeVO;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BadgeVO {
        private final AtomAction atomAction;

        @NotNull
        private final BadgeDTO badge;
        private final t tokenizedEvent;

        public BadgeVO(@NotNull BadgeDTO badge, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.badge = badge;
            this.atomAction = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadgeVO)) {
                return false;
            }
            BadgeVO badgeVO = (BadgeVO) other;
            return Intrinsics.d(this.badge, badgeVO.badge) && Intrinsics.d(this.atomAction, badgeVO.atomAction) && Intrinsics.d(this.tokenizedEvent, badgeVO.tokenizedEvent);
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.badge.hashCode() * 31;
            AtomAction atomAction = this.atomAction;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            BadgeDTO badgeDTO = this.badge;
            AtomAction atomAction = this.atomAction;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("BadgeVO(badge=");
            sb2.append(badgeDTO);
            sb2.append(", atomAction=");
            sb2.append(atomAction);
            sb2.append(", tokenizedEvent=");
            return b.d(sb2, tVar, ")");
        }
    }

    public WiseBannerVO(@NotNull TextDTO title, @NotNull String imageUrl, String str, boolean z11, String str2, BadgeVO badgeVO, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.title = title;
        this.imageUrl = imageUrl;
        this.videoUrl = str;
        this.isLiveVideo = z11;
        this.promoBadgeUrl = str2;
        this.adsBadge = badgeVO;
        this.atomAction = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WiseBannerVO)) {
            return false;
        }
        WiseBannerVO wiseBannerVO = (WiseBannerVO) other;
        return Intrinsics.d(this.title, wiseBannerVO.title) && Intrinsics.d(this.imageUrl, wiseBannerVO.imageUrl) && Intrinsics.d(this.videoUrl, wiseBannerVO.videoUrl) && this.isLiveVideo == wiseBannerVO.isLiveVideo && Intrinsics.d(this.promoBadgeUrl, wiseBannerVO.promoBadgeUrl) && Intrinsics.d(this.adsBadge, wiseBannerVO.adsBadge) && Intrinsics.d(this.atomAction, wiseBannerVO.atomAction) && Intrinsics.d(this.tokenizedEvent, wiseBannerVO.tokenizedEvent);
    }

    public final BadgeVO getAdsBadge() {
        return this.adsBadge;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement
    public AtomAction getAtomAction() {
        return this.atomAction;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getPromoBadgeUrl() {
        return this.promoBadgeUrl;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement
    public t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        int a11 = g.a(this.title.hashCode() * 31, 31, this.imageUrl);
        String str = this.videoUrl;
        int a12 = C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isLiveVideo);
        String str2 = this.promoBadgeUrl;
        int hashCode = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BadgeVO badgeVO = this.adsBadge;
        int hashCode2 = (hashCode + (badgeVO == null ? 0 : badgeVO.hashCode())) * 31;
        AtomAction atomAction = this.atomAction;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isLiveVideo, reason: from getter */
    public final boolean getIsLiveVideo() {
        return this.isLiveVideo;
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        String str = this.imageUrl;
        String str2 = this.videoUrl;
        boolean z11 = this.isLiveVideo;
        String str3 = this.promoBadgeUrl;
        BadgeVO badgeVO = this.adsBadge;
        AtomAction atomAction = this.atomAction;
        t tVar = this.tokenizedEvent;
        StringBuilder f7 = D3.g.f("WiseBannerVO(title=", textDTO, ", imageUrl=", str, ", videoUrl=");
        C2880a.c(str2, ", isLiveVideo=", ", promoBadgeUrl=", f7, z11);
        f7.append(str3);
        f7.append(", adsBadge=");
        f7.append(badgeVO);
        f7.append(", atomAction=");
        return C2859b.e(tVar, ", tokenizedEvent=", ")", f7, atomAction);
    }
}
