package ru.ozon.app.android.storefront.widgets.feedback.npsRating.data;

import B90.C2618u;
import B90.C2619v;
import G.g;
import HY.a;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003!\"#B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO;", "", "navbar", "Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$NavBar;", "body", "Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$Body;", "nextPageButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$NavBar;Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$Body;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "getNavbar", "()Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$NavBar;", "getBody", "()Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$Body;", "getNextPageButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "NavBar", "Body", "Selector", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NpsRatingDTO {
    public static final int $stable = 8;

    @NotNull
    private final Body body;

    @NotNull
    private final NavBar navbar;

    @NotNull
    private final ButtonV3Atom.LargeButton nextPageButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$Body;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "selector", "Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$Selector;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$Selector;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getSelector", "()Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$Selector;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Body {
        public static final int $stable = 8;

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

        public static /* synthetic */ Body copy$default(Body body, TextAtom textAtom, TextAtom textAtom2, Selector selector, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = body.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = body.subtitle;
            }
            if ((i11 & 4) != 0) {
                selector = body.selector;
            }
            return body.copy(textAtom, textAtom2, selector);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Selector getSelector() {
            return this.selector;
        }

        @NotNull
        public final Body copy(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull Selector selector) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(selector, "selector");
            return new Body(title, subtitle, selector);
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$NavBar;", "", "backButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "closeButton", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getBackButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCloseButton", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavBar {
        public static final int $stable;
        private final ButtonV3Atom.SmallIconButton backButton;
        private final ButtonV3Atom.SmallIconButton closeButton;

        @NotNull
        private final TextAtom title;

        static {
            int i11 = ButtonV3Atom.SmallIconButton.$stable;
            $stable = i11 | TextAtom.$stable | i11;
        }

        public NavBar(ButtonV3Atom.SmallIconButton smallIconButton, @NotNull TextAtom title, ButtonV3Atom.SmallIconButton smallIconButton2) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.backButton = smallIconButton;
            this.title = title;
            this.closeButton = smallIconButton2;
        }

        public static /* synthetic */ NavBar copy$default(NavBar navBar, ButtonV3Atom.SmallIconButton smallIconButton, TextAtom textAtom, ButtonV3Atom.SmallIconButton smallIconButton2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                smallIconButton = navBar.backButton;
            }
            if ((i11 & 2) != 0) {
                textAtom = navBar.title;
            }
            if ((i11 & 4) != 0) {
                smallIconButton2 = navBar.closeButton;
            }
            return navBar.copy(smallIconButton, textAtom, smallIconButton2);
        }

        /* renamed from: component1, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getBackButton() {
            return this.backButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getCloseButton() {
            return this.closeButton;
        }

        @NotNull
        public final NavBar copy(ButtonV3Atom.SmallIconButton backButton, @NotNull TextAtom title, ButtonV3Atom.SmallIconButton closeButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new NavBar(backButton, title, closeButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavBar)) {
                return false;
            }
            NavBar navBar = (NavBar) other;
            return Intrinsics.d(this.backButton, navBar.backButton) && Intrinsics.d(this.title, navBar.title) && Intrinsics.d(this.closeButton, navBar.closeButton);
        }

        public final ButtonV3Atom.SmallIconButton getBackButton() {
            return this.backButton;
        }

        public final ButtonV3Atom.SmallIconButton getCloseButton() {
            return this.closeButton;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            ButtonV3Atom.SmallIconButton smallIconButton = this.backButton;
            int b11 = C2619v.b((smallIconButton == null ? 0 : smallIconButton.hashCode()) * 31, 31, this.title);
            ButtonV3Atom.SmallIconButton smallIconButton2 = this.closeButton;
            return b11 + (smallIconButton2 != null ? smallIconButton2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NavBar(backButton=" + this.backButton + ", title=" + this.title + ", closeButton=" + this.closeButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO$Selector;", "", "leftDescription", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "rightDescription", "selectionColor", "", "defaultIconUrl", "imagesUrl", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLeftDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRightDescription", "getSelectionColor", "()Ljava/lang/String;", "getDefaultIconUrl", "getImagesUrl", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Selector {
        public static final int $stable = 8;

        @NotNull
        private final String defaultIconUrl;

        @NotNull
        private final List<String> imagesUrl;

        @NotNull
        private final TextAtom leftDescription;

        @NotNull
        private final TextAtom rightDescription;

        @NotNull
        private final String selectionColor;

        public Selector(@NotNull TextAtom leftDescription, @NotNull TextAtom rightDescription, @NotNull String selectionColor, @NotNull String defaultIconUrl, @NotNull List<String> imagesUrl) {
            Intrinsics.checkNotNullParameter(leftDescription, "leftDescription");
            Intrinsics.checkNotNullParameter(rightDescription, "rightDescription");
            Intrinsics.checkNotNullParameter(selectionColor, "selectionColor");
            Intrinsics.checkNotNullParameter(defaultIconUrl, "defaultIconUrl");
            Intrinsics.checkNotNullParameter(imagesUrl, "imagesUrl");
            this.leftDescription = leftDescription;
            this.rightDescription = rightDescription;
            this.selectionColor = selectionColor;
            this.defaultIconUrl = defaultIconUrl;
            this.imagesUrl = imagesUrl;
        }

        public static /* synthetic */ Selector copy$default(Selector selector, TextAtom textAtom, TextAtom textAtom2, String str, String str2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = selector.leftDescription;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = selector.rightDescription;
            }
            if ((i11 & 4) != 0) {
                str = selector.selectionColor;
            }
            if ((i11 & 8) != 0) {
                str2 = selector.defaultIconUrl;
            }
            if ((i11 & 16) != 0) {
                list = selector.imagesUrl;
            }
            List list2 = list;
            String str3 = str;
            return selector.copy(textAtom, textAtom2, str3, str2, list2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getLeftDescription() {
            return this.leftDescription;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getRightDescription() {
            return this.rightDescription;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getSelectionColor() {
            return this.selectionColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getDefaultIconUrl() {
            return this.defaultIconUrl;
        }

        @NotNull
        public final List<String> component5() {
            return this.imagesUrl;
        }

        @NotNull
        public final Selector copy(@NotNull TextAtom leftDescription, @NotNull TextAtom rightDescription, @NotNull String selectionColor, @NotNull String defaultIconUrl, @NotNull List<String> imagesUrl) {
            Intrinsics.checkNotNullParameter(leftDescription, "leftDescription");
            Intrinsics.checkNotNullParameter(rightDescription, "rightDescription");
            Intrinsics.checkNotNullParameter(selectionColor, "selectionColor");
            Intrinsics.checkNotNullParameter(defaultIconUrl, "defaultIconUrl");
            Intrinsics.checkNotNullParameter(imagesUrl, "imagesUrl");
            return new Selector(leftDescription, rightDescription, selectionColor, defaultIconUrl, imagesUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selector)) {
                return false;
            }
            Selector selector = (Selector) other;
            return Intrinsics.d(this.leftDescription, selector.leftDescription) && Intrinsics.d(this.rightDescription, selector.rightDescription) && Intrinsics.d(this.selectionColor, selector.selectionColor) && Intrinsics.d(this.defaultIconUrl, selector.defaultIconUrl) && Intrinsics.d(this.imagesUrl, selector.imagesUrl);
        }

        @NotNull
        public final String getDefaultIconUrl() {
            return this.defaultIconUrl;
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
            return this.imagesUrl.hashCode() + g.a(g.a(C2619v.b(this.leftDescription.hashCode() * 31, 31, this.rightDescription), 31, this.selectionColor), 31, this.defaultIconUrl);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.leftDescription;
            TextAtom textAtom2 = this.rightDescription;
            String str = this.selectionColor;
            String str2 = this.defaultIconUrl;
            List<String> list = this.imagesUrl;
            StringBuilder a11 = a.a("Selector(leftDescription=", textAtom, ", rightDescription=", textAtom2, ", selectionColor=");
            Nh.a.h(a11, str, ", defaultIconUrl=", str2, ", imagesUrl=");
            return C2618u.h(a11, list, ")");
        }
    }

    public NpsRatingDTO(@NotNull NavBar navbar, @NotNull Body body, @NotNull ButtonV3Atom.LargeButton nextPageButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(navbar, "navbar");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(nextPageButton, "nextPageButton");
        this.navbar = navbar;
        this.body = body;
        this.nextPageButton = nextPageButton;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NpsRatingDTO copy$default(NpsRatingDTO npsRatingDTO, NavBar navBar, Body body, ButtonV3Atom.LargeButton largeButton, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            navBar = npsRatingDTO.navbar;
        }
        if ((i11 & 2) != 0) {
            body = npsRatingDTO.body;
        }
        if ((i11 & 4) != 0) {
            largeButton = npsRatingDTO.nextPageButton;
        }
        if ((i11 & 8) != 0) {
            map = npsRatingDTO.trackingInfo;
        }
        return npsRatingDTO.copy(navBar, body, largeButton, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NavBar getNavbar() {
        return this.navbar;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Body getBody() {
        return this.body;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeButton getNextPageButton() {
        return this.nextPageButton;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final NpsRatingDTO copy(@NotNull NavBar navbar, @NotNull Body body, @NotNull ButtonV3Atom.LargeButton nextPageButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(navbar, "navbar");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(nextPageButton, "nextPageButton");
        return new NpsRatingDTO(navbar, body, nextPageButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NpsRatingDTO)) {
            return false;
        }
        NpsRatingDTO npsRatingDTO = (NpsRatingDTO) other;
        return Intrinsics.d(this.navbar, npsRatingDTO.navbar) && Intrinsics.d(this.body, npsRatingDTO.body) && Intrinsics.d(this.nextPageButton, npsRatingDTO.nextPageButton) && Intrinsics.d(this.trackingInfo, npsRatingDTO.trackingInfo);
    }

    @NotNull
    public final Body getBody() {
        return this.body;
    }

    @NotNull
    public final NavBar getNavbar() {
        return this.navbar;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getNextPageButton() {
        return this.nextPageButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.nextPageButton, (this.body.hashCode() + (this.navbar.hashCode() * 31)) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "NpsRatingDTO(navbar=" + this.navbar + ", body=" + this.body + ", nextPageButton=" + this.nextPageButton + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
