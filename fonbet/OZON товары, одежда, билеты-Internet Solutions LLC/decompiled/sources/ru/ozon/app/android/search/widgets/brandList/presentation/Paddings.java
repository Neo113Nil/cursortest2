package ru.ozon.app.android.search.widgets.brandList.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/presentation/Paddings;", "", "<init>", "()V", "LZ1/h;", "verticalPaddings", "F", "getVerticalPaddings-D9Ej5fM", "()F", "horizontalPaddings", "getHorizontalPaddings-D9Ej5fM", "tabBarPadding", "getTabBarPadding-D9Ej5fM", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Paddings {

    @NotNull
    public static final Paddings INSTANCE = new Paddings();
    private static final float horizontalPaddings;
    private static final float tabBarPadding;
    private static final float verticalPaddings;

    static {
        UniTheme uniTheme = UniTheme.INSTANCE;
        verticalPaddings = uniTheme.getPaddings().getPadding350();
        horizontalPaddings = uniTheme.getPaddings().getPadding500();
        tabBarPadding = uniTheme.getPaddings().getPadding1000();
    }

    private Paddings() {
    }

    /* renamed from: getHorizontalPaddings-D9Ej5fM, reason: not valid java name */
    public final float m963getHorizontalPaddingsD9Ej5fM() {
        return horizontalPaddings;
    }

    /* renamed from: getTabBarPadding-D9Ej5fM, reason: not valid java name */
    public final float m964getTabBarPaddingD9Ej5fM() {
        return tabBarPadding;
    }

    /* renamed from: getVerticalPaddings-D9Ej5fM, reason: not valid java name */
    public final float m965getVerticalPaddingsD9Ej5fM() {
        return verticalPaddings;
    }
}
