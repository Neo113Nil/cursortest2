package ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation;

import B90.C2618u;
import B90.C2619v;
import G.g;
import HY.a;
import Tl.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.feedback.common.presentation.FeedbackNavbarVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002*+B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;", "navbar", "Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO$Body;", "body", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nextPageButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO$Body;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;", "getNavbar", "()Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;", "Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO$Body;", "getBody", "()Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO$Body;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getNextPageButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Body", "Selector", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NpsRatingVO implements c {

    @NotNull
    private final Body body;
    private final long id;

    @NotNull
    private final FeedbackNavbarVO navbar;

    @NotNull
    private final ButtonV3Atom.LargeButton nextPageButton;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO$Body;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO$Selector;", "selector", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO$Selector;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO$Selector;", "getSelector", "()Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO$Selector;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Body {

        @NotNull
        private final Selector selector;

        @NotNull
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        public Body(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull Selector selector) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(selector, "selector");
            this.title = title;
            this.subtitle = subtitle;
            this.selector = selector;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Body)) {
                return false;
            }
            Body body = (Body) other;
            return Intrinsics.d(this.title, body.title) && Intrinsics.d(this.subtitle, body.subtitle) && Intrinsics.d(this.selector, body.selector);
        }

        @NotNull
        public final Selector getSelector() {
            return this.selector;
        }

        @NotNull
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.selector.hashCode() + C2619v.b(this.title.hashCode() * 31, 31, this.subtitle);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            Selector selector = this.selector;
            StringBuilder a11 = a.a("Body(title=", textAtom, ", subtitle=", textAtom2, ", selector=");
            a11.append(selector);
            a11.append(")");
            return a11.toString();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001b\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO$Selector;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "leftDescription", "rightDescription", "", "selectionColor", "defaultImage", "", "imagesUrl", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getLeftDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRightDescription", "Ljava/lang/String;", "getSelectionColor", "getDefaultImage", "Ljava/util/List;", "getImagesUrl", "()Ljava/util/List;", "currentProgress", "Ljava/lang/Integer;", "getCurrentProgress", "()Ljava/lang/Integer;", "setCurrentProgress", "(Ljava/lang/Integer;)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Selector {
        private Integer currentProgress;

        @NotNull
        private final String defaultImage;

        @NotNull
        private final List<String> imagesUrl;

        @NotNull
        private final TextAtom leftDescription;

        @NotNull
        private final TextAtom rightDescription;

        @NotNull
        private final String selectionColor;

        public Selector(@NotNull TextAtom leftDescription, @NotNull TextAtom rightDescription, @NotNull String selectionColor, @NotNull String defaultImage, @NotNull List<String> imagesUrl) {
            Intrinsics.checkNotNullParameter(leftDescription, "leftDescription");
            Intrinsics.checkNotNullParameter(rightDescription, "rightDescription");
            Intrinsics.checkNotNullParameter(selectionColor, "selectionColor");
            Intrinsics.checkNotNullParameter(defaultImage, "defaultImage");
            Intrinsics.checkNotNullParameter(imagesUrl, "imagesUrl");
            this.leftDescription = leftDescription;
            this.rightDescription = rightDescription;
            this.selectionColor = selectionColor;
            this.defaultImage = defaultImage;
            this.imagesUrl = imagesUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selector)) {
                return false;
            }
            Selector selector = (Selector) other;
            return Intrinsics.d(this.leftDescription, selector.leftDescription) && Intrinsics.d(this.rightDescription, selector.rightDescription) && Intrinsics.d(this.selectionColor, selector.selectionColor) && Intrinsics.d(this.defaultImage, selector.defaultImage) && Intrinsics.d(this.imagesUrl, selector.imagesUrl);
        }

        public final Integer getCurrentProgress() {
            return this.currentProgress;
        }

        @NotNull
        public final String getDefaultImage() {
            return this.defaultImage;
        }

        @NotNull
        public final List<String> getImagesUrl() {
            return this.imagesUrl;
        }

        @NotNull
        public final TextAtom getLeftDescription() {
            return this.leftDescription;
        }

        @NotNull
        public final TextAtom getRightDescription() {
            return this.rightDescription;
        }

        @NotNull
        public final String getSelectionColor() {
            return this.selectionColor;
        }

        public int hashCode() {
            return this.imagesUrl.hashCode() + g.a(g.a(C2619v.b(this.leftDescription.hashCode() * 31, 31, this.rightDescription), 31, this.selectionColor), 31, this.defaultImage);
        }

        public final void setCurrentProgress(Integer num) {
            this.currentProgress = num;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.leftDescription;
            TextAtom textAtom2 = this.rightDescription;
            String str = this.selectionColor;
            String str2 = this.defaultImage;
            List<String> list = this.imagesUrl;
            StringBuilder a11 = a.a("Selector(leftDescription=", textAtom, ", rightDescription=", textAtom2, ", selectionColor=");
            Nh.a.h(a11, str, ", defaultImage=", str2, ", imagesUrl=");
            return C2618u.h(a11, list, ")");
        }
    }

    public NpsRatingVO(long j11, @NotNull FeedbackNavbarVO navbar, @NotNull Body body, @NotNull ButtonV3Atom.LargeButton nextPageButton, t tVar) {
        Intrinsics.checkNotNullParameter(navbar, "navbar");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(nextPageButton, "nextPageButton");
        this.id = j11;
        this.navbar = navbar;
        this.body = body;
        this.nextPageButton = nextPageButton;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NpsRatingVO)) {
            return false;
        }
        NpsRatingVO npsRatingVO = (NpsRatingVO) other;
        return this.id == npsRatingVO.id && Intrinsics.d(this.navbar, npsRatingVO.navbar) && Intrinsics.d(this.body, npsRatingVO.body) && Intrinsics.d(this.nextPageButton, npsRatingVO.nextPageButton) && Intrinsics.d(this.tokenizedEvent, npsRatingVO.tokenizedEvent);
    }

    @NotNull
    public final Body getBody() {
        return this.body;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final FeedbackNavbarVO getNavbar() {
        return this.navbar;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getNextPageButton() {
        return this.nextPageButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.nextPageButton, (this.body.hashCode() + ((this.navbar.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31, 31);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        FeedbackNavbarVO feedbackNavbarVO = this.navbar;
        Body body = this.body;
        ButtonV3Atom.LargeButton largeButton = this.nextPageButton;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("NpsRatingVO(id=");
        sb2.append(j11);
        sb2.append(", navbar=");
        sb2.append(feedbackNavbarVO);
        sb2.append(", body=");
        sb2.append(body);
        sb2.append(", nextPageButton=");
        sb2.append(largeButton);
        return Lh.a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
