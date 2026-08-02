package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation;

import An.C2439a;
import C.o0;
import Co.a;
import G.g;
import Ns.b;
import T7.P;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.appOnboarding.data.AppOnboardingDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001:\u0003#$%B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Header;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content;", "content", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Footer;", CommentV3DTO.FOOTER_FIELD_NAME, "<init>", "(JLru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Header;Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content;Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Footer;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Header;", "getHeader", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Header;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content;", "getContent", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Footer;", "getFooter", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Footer;", "Header", "Content", "Footer", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AppOnboardingVI implements c {

    @NotNull
    private final Content content;

    @NotNull
    private final Footer footer;

    @NotNull
    private final Header header;
    private final long id;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content;", "", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content$UnderImage;", "underImage", "", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content$Page;", "pages", "<init>", "(Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content$UnderImage;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content$UnderImage;", "getUnderImage", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content$UnderImage;", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "UnderImage", "Page", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content {

        @NotNull
        private final List<Page> pages;
        private final UnderImage underImage;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content$Page;", "", "", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Page {

            @NotNull
            private final String image;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;
            private final t tokenizedEvent;

            public Page(@NotNull String image, @NotNull TextDTO title, TextDTO textDTO, t tVar) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                this.image = image;
                this.title = title;
                this.subtitle = textDTO;
                this.tokenizedEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Page)) {
                    return false;
                }
                Page page = (Page) other;
                return Intrinsics.d(this.image, page.image) && Intrinsics.d(this.title, page.title) && Intrinsics.d(this.subtitle, page.subtitle) && Intrinsics.d(this.tokenizedEvent, page.tokenizedEvent);
            }

            @NotNull
            public final String getImage() {
                return this.image;
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

            public int hashCode() {
                int a11 = b.a(this.title, this.image.hashCode() * 31, 31);
                TextDTO textDTO = this.subtitle;
                int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.image;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                t tVar = this.tokenizedEvent;
                StringBuilder b11 = a.b("Page(image=", textDTO, str, ", title=", ", subtitle=");
                b11.append(textDTO2);
                b11.append(", tokenizedEvent=");
                b11.append(tVar);
                b11.append(")");
                return b11.toString();
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content$UnderImage;", "", "", "image", "", "Ll1/Z;", "gradients", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Ljava/util/List;", "getGradients", "()Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnderImage {

            @NotNull
            private final List<List<C7807Z>> gradients;

            @NotNull
            private final String image;

            /* JADX WARN: Multi-variable type inference failed */
            public UnderImage(@NotNull String image, @NotNull List<? extends List<C7807Z>> gradients) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(gradients, "gradients");
                this.image = image;
                this.gradients = gradients;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UnderImage)) {
                    return false;
                }
                UnderImage underImage = (UnderImage) other;
                return Intrinsics.d(this.image, underImage.image) && Intrinsics.d(this.gradients, underImage.gradients);
            }

            @NotNull
            public final List<List<C7807Z>> getGradients() {
                return this.gradients;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public int hashCode() {
                return this.gradients.hashCode() + (this.image.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return C2439a.a("UnderImage(image=", this.image, ", gradients=", ")", this.gradients);
            }
        }

        public Content(UnderImage underImage, @NotNull List<Page> pages) {
            Intrinsics.checkNotNullParameter(pages, "pages");
            this.underImage = underImage;
            this.pages = pages;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.d(this.underImage, content.underImage) && Intrinsics.d(this.pages, content.pages);
        }

        @NotNull
        public final List<Page> getPages() {
            return this.pages;
        }

        public final UnderImage getUnderImage() {
            return this.underImage;
        }

        public int hashCode() {
            UnderImage underImage = this.underImage;
            return this.pages.hashCode() + ((underImage == null ? 0 : underImage.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "Content(underImage=" + this.underImage + ", pages=" + this.pages + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Footer;", "", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageControls;", "pageControls", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "actionButtons", "", "logo", "<init>", "(Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageControls;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageControls;", "getPageControls", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageControls;", "Ljava/util/List;", "getActionButtons", "()Ljava/util/List;", "Ljava/lang/String;", "getLogo", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Footer {

        @NotNull
        private final List<ButtonV3DTO> actionButtons;

        @NotNull
        private final String logo;

        @NotNull
        private final AppOnboardingDTO.PageControls pageControls;

        public Footer(@NotNull AppOnboardingDTO.PageControls pageControls, @NotNull List<ButtonV3DTO> actionButtons, @NotNull String logo) {
            Intrinsics.checkNotNullParameter(pageControls, "pageControls");
            Intrinsics.checkNotNullParameter(actionButtons, "actionButtons");
            Intrinsics.checkNotNullParameter(logo, "logo");
            this.pageControls = pageControls;
            this.actionButtons = actionButtons;
            this.logo = logo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) other;
            return Intrinsics.d(this.pageControls, footer.pageControls) && Intrinsics.d(this.actionButtons, footer.actionButtons) && Intrinsics.d(this.logo, footer.logo);
        }

        @NotNull
        public final List<ButtonV3DTO> getActionButtons() {
            return this.actionButtons;
        }

        @NotNull
        public final String getLogo() {
            return this.logo;
        }

        @NotNull
        public final AppOnboardingDTO.PageControls getPageControls() {
            return this.pageControls;
        }

        public int hashCode() {
            return this.logo.hashCode() + g.b(this.pageControls.hashCode() * 31, 31, this.actionButtons);
        }

        @NotNull
        public String toString() {
            AppOnboardingDTO.PageControls pageControls = this.pageControls;
            List<ButtonV3DTO> list = this.actionButtons;
            String str = this.logo;
            StringBuilder sb2 = new StringBuilder("Footer(pageControls=");
            sb2.append(pageControls);
            sb2.append(", actionButtons=");
            sb2.append(list);
            sb2.append(", logo=");
            return o0.c(sb2, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Header;", "", "", "logo", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Header$SkipTitle;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Header$SkipTitle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLogo", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Header$SkipTitle;", "getTitle", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Header$SkipTitle;", "SkipTitle", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {

        @NotNull
        private final String logo;

        @NotNull
        private final SkipTitle title;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Header$SkipTitle;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SkipTitle {

            @NotNull
            private final AtomActionDTO action;

            @NotNull
            private final TextDTO text;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public SkipTitle(@NotNull TextDTO text, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(action, "action");
                this.text = text;
                this.action = action;
                this.trackingInfo = map;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SkipTitle)) {
                    return false;
                }
                SkipTitle skipTitle = (SkipTitle) other;
                return Intrinsics.d(this.text, skipTitle.text) && Intrinsics.d(this.action, skipTitle.action) && Intrinsics.d(this.trackingInfo, skipTitle.trackingInfo);
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int b11 = Ih.a.b(this.action, this.text.hashCode() * 31, 31);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return b11 + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.text;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("SkipTitle(text=");
                sb2.append(textDTO);
                sb2.append(", action=");
                sb2.append(atomActionDTO);
                sb2.append(", trackingInfo=");
                return P.f(sb2, map, ")");
            }
        }

        public Header(@NotNull String logo, @NotNull SkipTitle title) {
            Intrinsics.checkNotNullParameter(logo, "logo");
            Intrinsics.checkNotNullParameter(title, "title");
            this.logo = logo;
            this.title = title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.logo, header.logo) && Intrinsics.d(this.title, header.title);
        }

        @NotNull
        public final String getLogo() {
            return this.logo;
        }

        @NotNull
        public final SkipTitle getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.logo.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Header(logo=" + this.logo + ", title=" + this.title + ")";
        }
    }

    public AppOnboardingVI(long j11, @NotNull Header header, @NotNull Content content, @NotNull Footer footer) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.id = j11;
        this.header = header;
        this.content = content;
        this.footer = footer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppOnboardingVI)) {
            return false;
        }
        AppOnboardingVI appOnboardingVI = (AppOnboardingVI) other;
        return this.id == appOnboardingVI.id && Intrinsics.d(this.header, appOnboardingVI.header) && Intrinsics.d(this.content, appOnboardingVI.content) && Intrinsics.d(this.footer, appOnboardingVI.footer);
    }

    @NotNull
    public final Content getContent() {
        return this.content;
    }

    @NotNull
    public final Footer getFooter() {
        return this.footer;
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.footer.hashCode() + ((this.content.hashCode() + ((this.header.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "AppOnboardingVI(id=" + this.id + ", header=" + this.header + ", content=" + this.content + ", footer=" + this.footer + ")";
    }
}
