package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.data;

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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001:\u0002\u001f BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO;", "", "navbar", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO$NavBar;", "pageHeader", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO$PageHeader;", "sections", "", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateSectionDTO;", "nextPageButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nextPageButtonDescription", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO$NavBar;Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO$PageHeader;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/Map;)V", "getNavbar", "()Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO$NavBar;", "getPageHeader", "()Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO$PageHeader;", "getSections", "()Ljava/util/List;", "getNextPageButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getNextPageButtonDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTrackingInfo", "()Ljava/util/Map;", "NavBar", "PageHeader", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateDTO {
    public static final int $stable = 8;

    @NotNull
    private final NavBar navbar;

    @NotNull
    private final ButtonV3Atom.LargeButton nextPageButton;
    private final TextAtom nextPageButtonDescription;
    private final PageHeader pageHeader;

    @NotNull
    private final List<RateSectionDTO> sections;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO$NavBar;", "", "backButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "exitButton", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getBackButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getExitButton", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavBar {
        public static final int $stable;
        private final ButtonV3Atom.SmallIconButton backButton;
        private final ButtonV3Atom.SmallIconButton exitButton;

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
            this.exitButton = smallIconButton2;
        }

        public final ButtonV3Atom.SmallIconButton getBackButton() {
            return this.backButton;
        }

        public final ButtonV3Atom.SmallIconButton getExitButton() {
            return this.exitButton;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO$PageHeader;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PageHeader {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        public PageHeader(@NotNull TextAtom title, @NotNull TextAtom subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.title = title;
            this.subtitle = subtitle;
        }

        @NotNull
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }
    }

    public RateDTO(@NotNull NavBar navbar, PageHeader pageHeader, @NotNull List<RateSectionDTO> sections, @NotNull ButtonV3Atom.LargeButton nextPageButton, TextAtom textAtom, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(navbar, "navbar");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(nextPageButton, "nextPageButton");
        this.navbar = navbar;
        this.pageHeader = pageHeader;
        this.sections = sections;
        this.nextPageButton = nextPageButton;
        this.nextPageButtonDescription = textAtom;
        this.trackingInfo = map;
    }

    @NotNull
    public final NavBar getNavbar() {
        return this.navbar;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getNextPageButton() {
        return this.nextPageButton;
    }

    public final TextAtom getNextPageButtonDescription() {
        return this.nextPageButtonDescription;
    }

    public final PageHeader getPageHeader() {
        return this.pageHeader;
    }

    @NotNull
    public final List<RateSectionDTO> getSections() {
        return this.sections;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }
}
