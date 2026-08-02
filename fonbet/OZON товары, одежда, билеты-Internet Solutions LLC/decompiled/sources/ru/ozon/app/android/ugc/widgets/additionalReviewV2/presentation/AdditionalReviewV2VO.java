package ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation;

import Kk.C3532b;
import Nh.a;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b%\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001GBu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0096\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b0\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b:\u00106R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "cornerIcon", "subtitle", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "rating", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightCornerButton", "buttonTokenizedEvent", "", "needToShow", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageAtom", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO$HideButtonVO;", "hideButton", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;LWZ/t;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;LWZ/t;ZLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO$HideButtonVO;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;LWZ/t;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;LWZ/t;ZLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO$HideButtonVO;)Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCornerIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightCornerButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getButtonTokenizedEvent", "Z", "getNeedToShow", "()Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImageAtom", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO$HideButtonVO;", "getHideButton", "()Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO$HideButtonVO;", "HideButtonVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdditionalReviewV2VO implements c {
    private final AtomAction action;
    private final t buttonTokenizedEvent;
    private final IconDTO cornerIcon;
    private final HideButtonVO hideButton;
    private final long id;

    @NotNull
    private final ImageDTO imageAtom;
    private final boolean needToShow;

    @NotNull
    private final RatingDTO rating;
    private final IconButtonV3DTO rightCornerButton;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO$HideButtonVO;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "Lru/ozon/uni/atoms/af/AtomAction;", "iconButtonAction", "LWZ/t;", "iconButtonTokenizedEvent", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getIconButtonAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getIconButtonTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HideButtonVO {

        @NotNull
        private final IconButtonV3DTO iconButton;
        private final AtomAction iconButtonAction;
        private final t iconButtonTokenizedEvent;

        @NotNull
        private final TextDTO title;

        public HideButtonVO(@NotNull IconButtonV3DTO iconButton, AtomAction atomAction, t tVar, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            Intrinsics.checkNotNullParameter(title, "title");
            this.iconButton = iconButton;
            this.iconButtonAction = atomAction;
            this.iconButtonTokenizedEvent = tVar;
            this.title = title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HideButtonVO)) {
                return false;
            }
            HideButtonVO hideButtonVO = (HideButtonVO) other;
            return Intrinsics.d(this.iconButton, hideButtonVO.iconButton) && Intrinsics.d(this.iconButtonAction, hideButtonVO.iconButtonAction) && Intrinsics.d(this.iconButtonTokenizedEvent, hideButtonVO.iconButtonTokenizedEvent) && Intrinsics.d(this.title, hideButtonVO.title);
        }

        @NotNull
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        public final AtomAction getIconButtonAction() {
            return this.iconButtonAction;
        }

        public final t getIconButtonTokenizedEvent() {
            return this.iconButtonTokenizedEvent;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.iconButton.hashCode() * 31;
            AtomAction atomAction = this.iconButtonAction;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.iconButtonTokenizedEvent;
            return this.title.hashCode() + ((hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "HideButtonVO(iconButton=" + this.iconButton + ", iconButtonAction=" + this.iconButtonAction + ", iconButtonTokenizedEvent=" + this.iconButtonTokenizedEvent + ", title=" + this.title + ")";
        }
    }

    public AdditionalReviewV2VO(long j11, @NotNull TextDTO title, IconDTO iconDTO, TextDTO textDTO, @NotNull RatingDTO rating, t tVar, IconButtonV3DTO iconButtonV3DTO, t tVar2, boolean z11, @NotNull ImageDTO imageAtom, AtomAction atomAction, HideButtonVO hideButtonVO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(imageAtom, "imageAtom");
        this.id = j11;
        this.title = title;
        this.cornerIcon = iconDTO;
        this.subtitle = textDTO;
        this.rating = rating;
        this.tokenizedEvent = tVar;
        this.rightCornerButton = iconButtonV3DTO;
        this.buttonTokenizedEvent = tVar2;
        this.needToShow = z11;
        this.imageAtom = imageAtom;
        this.action = atomAction;
        this.hideButton = hideButtonVO;
    }

    @NotNull
    public final AdditionalReviewV2VO copy(long id2, @NotNull TextDTO title, IconDTO cornerIcon, TextDTO subtitle, @NotNull RatingDTO rating, t tokenizedEvent, IconButtonV3DTO rightCornerButton, t buttonTokenizedEvent, boolean needToShow, @NotNull ImageDTO imageAtom, AtomAction action, HideButtonVO hideButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(imageAtom, "imageAtom");
        return new AdditionalReviewV2VO(id2, title, cornerIcon, subtitle, rating, tokenizedEvent, rightCornerButton, buttonTokenizedEvent, needToShow, imageAtom, action, hideButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalReviewV2VO)) {
            return false;
        }
        AdditionalReviewV2VO additionalReviewV2VO = (AdditionalReviewV2VO) other;
        return this.id == additionalReviewV2VO.id && Intrinsics.d(this.title, additionalReviewV2VO.title) && Intrinsics.d(this.cornerIcon, additionalReviewV2VO.cornerIcon) && Intrinsics.d(this.subtitle, additionalReviewV2VO.subtitle) && Intrinsics.d(this.rating, additionalReviewV2VO.rating) && Intrinsics.d(this.tokenizedEvent, additionalReviewV2VO.tokenizedEvent) && Intrinsics.d(this.rightCornerButton, additionalReviewV2VO.rightCornerButton) && Intrinsics.d(this.buttonTokenizedEvent, additionalReviewV2VO.buttonTokenizedEvent) && this.needToShow == additionalReviewV2VO.needToShow && Intrinsics.d(this.imageAtom, additionalReviewV2VO.imageAtom) && Intrinsics.d(this.action, additionalReviewV2VO.action) && Intrinsics.d(this.hideButton, additionalReviewV2VO.hideButton);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final t getButtonTokenizedEvent() {
        return this.buttonTokenizedEvent;
    }

    public final IconDTO getCornerIcon() {
        return this.cornerIcon;
    }

    public final HideButtonVO getHideButton() {
        return this.hideButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImageDTO getImageAtom() {
        return this.imageAtom;
    }

    public final boolean getNeedToShow() {
        return this.needToShow;
    }

    @NotNull
    public final RatingDTO getRating() {
        return this.rating;
    }

    public final IconButtonV3DTO getRightCornerButton() {
        return this.rightCornerButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        IconDTO iconDTO = this.cornerIcon;
        int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (this.rating.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.rightCornerButton;
        int hashCode4 = (hashCode3 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        t tVar2 = this.buttonTokenizedEvent;
        int b11 = a.b(this.imageAtom, C3532b.a((hashCode4 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31, 31, this.needToShow), 31);
        AtomAction atomAction = this.action;
        int hashCode5 = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        HideButtonVO hideButtonVO = this.hideButton;
        return hashCode5 + (hideButtonVO != null ? hideButtonVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        IconDTO iconDTO = this.cornerIcon;
        TextDTO textDTO2 = this.subtitle;
        RatingDTO ratingDTO = this.rating;
        t tVar = this.tokenizedEvent;
        IconButtonV3DTO iconButtonV3DTO = this.rightCornerButton;
        t tVar2 = this.buttonTokenizedEvent;
        boolean z11 = this.needToShow;
        ImageDTO imageDTO = this.imageAtom;
        AtomAction atomAction = this.action;
        HideButtonVO hideButtonVO = this.hideButton;
        StringBuilder b11 = TY.a.b("AdditionalReviewV2VO(id=", j11, ", title=", textDTO);
        b11.append(", cornerIcon=");
        b11.append(iconDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", rating=");
        b11.append(ratingDTO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", rightCornerButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", buttonTokenizedEvent=");
        b11.append(tVar2);
        b11.append(", needToShow=");
        b11.append(z11);
        b11.append(", imageAtom=");
        b11.append(imageDTO);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(", hideButton=");
        b11.append(hideButtonVO);
        b11.append(")");
        return b11.toString();
    }
}
