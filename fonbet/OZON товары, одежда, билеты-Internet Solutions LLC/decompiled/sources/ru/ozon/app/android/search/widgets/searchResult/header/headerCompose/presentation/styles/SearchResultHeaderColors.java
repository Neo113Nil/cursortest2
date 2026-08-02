package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0012\u0010\f\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0012\u0010\u000e\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0012\u0010\u0010\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors;", "", "<init>", "()V", "background", "Lru/ozon/uni/core/models/UniColorToken;", "getBackground", "()Lru/ozon/uni/core/models/UniColorToken;", SelectionItemFormDTO.TITLE_FIELD_NAME, "getTitle", "subtitle", "getSubtitle", "didYouMean", "getDidYouMean", "category", "getCategory", "shareTint", "getShareTint", "Companion", "Select", "Bx", "Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors$Bx;", "Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors$Select;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class SearchResultHeaderColors {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors$Bx;", "Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors;", "<init>", "()V", "background", "Lru/ozon/uni/core/models/UniColorToken;", "getBackground", "()Lru/ozon/uni/core/models/UniColorToken;", SelectionItemFormDTO.TITLE_FIELD_NAME, "getTitle", "subtitle", "getSubtitle", "didYouMean", "getDidYouMean", "category", "getCategory", "shareTint", "getShareTint", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Bx extends SearchResultHeaderColors {
        public static final int $stable;

        @NotNull
        public static final Bx INSTANCE = new Bx();

        @NotNull
        private static final UniColorToken background;

        @NotNull
        private static final UniColorToken category;

        @NotNull
        private static final UniColorToken didYouMean;

        @NotNull
        private static final UniColorToken shareTint;

        @NotNull
        private static final UniColorToken subtitle;

        @NotNull
        private static final UniColorToken title;

        static {
            UniTheme uniTheme = UniTheme.INSTANCE;
            background = uniTheme.getColorTokens().getLayerFloor1();
            title = uniTheme.getColorTokens().getTextPrimary();
            subtitle = uniTheme.getColorTokens().getTextSecondary();
            didYouMean = uniTheme.getColorTokens().getTextAction();
            category = uniTheme.getColorTokens().getTextAction();
            shareTint = uniTheme.getColorTokens().getGraphicTertiary();
            $stable = UniColorToken.$stable;
        }

        private Bx() {
            super(null);
        }

        @Override // ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors
        @NotNull
        public UniColorToken getBackground() {
            return background;
        }

        @Override // ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors
        @NotNull
        public UniColorToken getCategory() {
            return category;
        }

        @Override // ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors
        @NotNull
        public UniColorToken getDidYouMean() {
            return didYouMean;
        }

        @Override // ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors
        @NotNull
        public UniColorToken getShareTint() {
            return shareTint;
        }

        @Override // ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors
        @NotNull
        public UniColorToken getSubtitle() {
            return subtitle;
        }

        @Override // ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors
        @NotNull
        public UniColorToken getTitle() {
            return title;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors$Companion;", "", "<init>", "()V", "from", "Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors;", "isSelect", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SearchResultHeaderColors from(boolean isSelect) {
            return isSelect ? Select.INSTANCE : Bx.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors$Select;", "Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/styles/SearchResultHeaderColors;", "<init>", "()V", "background", "Lru/ozon/uni/core/models/UniColorToken;", "getBackground", "()Lru/ozon/uni/core/models/UniColorToken;", SelectionItemFormDTO.TITLE_FIELD_NAME, "getTitle", "subtitle", "getSubtitle", "didYouMean", "getDidYouMean", "category", "getCategory", "shareTint", "getShareTint", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Select extends SearchResultHeaderColors {
        public static final int $stable;

        @NotNull
        public static final Select INSTANCE = new Select();

        @NotNull
        private static final UniColorToken background;

        @NotNull
        private static final UniColorToken category;

        @NotNull
        private static final UniColorToken didYouMean;

        @NotNull
        private static final UniColorToken shareTint;

        @NotNull
        private static final UniColorToken subtitle;

        @NotNull
        private static final UniColorToken title;

        static {
            UniTheme uniTheme = UniTheme.INSTANCE;
            background = uniTheme.getColorTokens().getLayerFloor0();
            title = uniTheme.getColorTokens().getTextLightKey();
            subtitle = uniTheme.getColorTokens().getTextSecondaryOnDark();
            didYouMean = uniTheme.getColorTokens().getTextActionOnDark();
            category = uniTheme.getColorTokens().getTextLightKey();
            shareTint = uniTheme.getColorTokens().getGraphicTertiaryOnDark();
            $stable = UniColorToken.$stable;
        }

        private Select() {
            super(null);
        }

        @Override // ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors
        @NotNull
        public UniColorToken getBackground() {
            return background;
        }

        @Override // ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors
        @NotNull
        public UniColorToken getCategory() {
            return category;
        }

        @Override // ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors
        @NotNull
        public UniColorToken getDidYouMean() {
            return didYouMean;
        }

        @Override // ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors
        @NotNull
        public UniColorToken getShareTint() {
            return shareTint;
        }

        @Override // ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors
        @NotNull
        public UniColorToken getSubtitle() {
            return subtitle;
        }

        @Override // ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors
        @NotNull
        public UniColorToken getTitle() {
            return title;
        }
    }

    public /* synthetic */ SearchResultHeaderColors(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract UniColorToken getBackground();

    @NotNull
    public abstract UniColorToken getCategory();

    @NotNull
    public abstract UniColorToken getDidYouMean();

    @NotNull
    public abstract UniColorToken getShareTint();

    @NotNull
    public abstract UniColorToken getSubtitle();

    @NotNull
    public abstract UniColorToken getTitle();

    private SearchResultHeaderColors() {
    }
}
