package ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.presentation;

import B90.C2619v;
import Bl.C2639a;
import C.o0;
import D3.h;
import HY.a;
import Kk.C3532b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001(B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isBannerVisible", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsVO$BannerVO;", "banner", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "cells", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsVO$BannerVO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Z", "()Z", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsVO$BannerVO;", "getBanner", "()Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsVO$BannerVO;", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "BannerVO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bContactUsVO implements c {
    private final BannerVO banner;

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells;
    private final long id;
    private final boolean isBannerVisible;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u000e¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/presentation/B2bContactUsVO$BannerVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "imageUrl", "", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "getImageUrl", "()Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "Ljava/lang/String;", "getBackgroundColor", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BannerVO {
        public static final int $stable;
        private final AtomAction action;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final ThemeImageV1VO imageUrl;
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        static {
            int i11 = ThemeImageV1VO.$stable | AtomAction.$stable;
            int i12 = TextAtom.$stable;
            $stable = i11 | i12 | i12;
        }

        public BannerVO(@NotNull TextAtom title, TextAtom textAtom, AtomAction atomAction, @NotNull ThemeImageV1VO imageUrl, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.title = title;
            this.subtitle = textAtom;
            this.action = atomAction;
            this.imageUrl = imageUrl;
            this.backgroundColor = backgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerVO)) {
                return false;
            }
            BannerVO bannerVO = (BannerVO) other;
            return Intrinsics.d(this.title, bannerVO.title) && Intrinsics.d(this.subtitle, bannerVO.subtitle) && Intrinsics.d(this.action, bannerVO.action) && Intrinsics.d(this.imageUrl, bannerVO.imageUrl) && Intrinsics.d(this.backgroundColor, bannerVO.backgroundColor);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ThemeImageV1VO getImageUrl() {
            return this.imageUrl;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextAtom textAtom = this.subtitle;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            AtomAction atomAction = this.action;
            return this.backgroundColor.hashCode() + ((this.imageUrl.hashCode() + ((hashCode2 + (atomAction != null ? atomAction.hashCode() : 0)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            AtomAction atomAction = this.action;
            ThemeImageV1VO themeImageV1VO = this.imageUrl;
            String str = this.backgroundColor;
            StringBuilder a11 = a.a("BannerVO(title=", textAtom, ", subtitle=", textAtom2, ", action=");
            a11.append(atomAction);
            a11.append(", imageUrl=");
            a11.append(themeImageV1VO);
            a11.append(", backgroundColor=");
            return o0.c(a11, str, ")");
        }
    }

    public B2bContactUsVO(long j11, @NotNull TextAtom title, boolean z11, BannerVO bannerVO, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.id = j11;
        this.title = title;
        this.isBannerVisible = z11;
        this.banner = bannerVO;
        this.cells = cells;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bContactUsVO)) {
            return false;
        }
        B2bContactUsVO b2bContactUsVO = (B2bContactUsVO) other;
        return this.id == b2bContactUsVO.id && Intrinsics.d(this.title, b2bContactUsVO.title) && this.isBannerVisible == b2bContactUsVO.isBannerVisible && Intrinsics.d(this.banner, b2bContactUsVO.banner) && Intrinsics.d(this.cells, b2bContactUsVO.cells);
    }

    public final BannerVO getBanner() {
        return this.banner;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> getCells() {
        return this.cells;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        int a11 = C3532b.a(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.isBannerVisible);
        BannerVO bannerVO = this.banner;
        return this.cells.hashCode() + ((a11 + (bannerVO == null ? 0 : bannerVO.hashCode())) * 31);
    }

    /* renamed from: isBannerVisible, reason: from getter */
    public final boolean getIsBannerVisible() {
        return this.isBannerVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        boolean z11 = this.isBannerVisible;
        BannerVO bannerVO = this.banner;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> list = this.cells;
        StringBuilder c11 = C2639a.c("B2bContactUsVO(id=", j11, ", title=", textAtom);
        c11.append(", isBannerVisible=");
        c11.append(z11);
        c11.append(", banner=");
        c11.append(bannerVO);
        return h.c(c11, ", cells=", list, ")");
    }
}
