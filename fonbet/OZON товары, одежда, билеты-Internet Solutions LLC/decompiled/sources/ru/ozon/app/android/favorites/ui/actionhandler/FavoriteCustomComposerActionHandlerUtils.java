package ru.ozon.app.android.favorites.ui.actionhandler;

import Vg.f;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/favorites/ui/actionhandler/FavoriteCustomComposerActionHandlerUtils;", "", "<init>", "()V", "", "Ljava/lang/Class;", "LVg/f;", "FAVORITE_SWITCHING_BUTTON_CUSTOM_ACTION_HANDLER_CLASSES", "Ljava/util/Set;", "getFAVORITE_SWITCHING_BUTTON_CUSTOM_ACTION_HANDLER_CLASSES", "()Ljava/util/Set;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteCustomComposerActionHandlerUtils {
    public static final int $stable;

    @NotNull
    private static final Set<Class<? extends f>> FAVORITE_SWITCHING_BUTTON_CUSTOM_ACTION_HANDLER_CLASSES;

    @NotNull
    public static final FavoriteCustomComposerActionHandlerUtils INSTANCE = new FavoriteCustomComposerActionHandlerUtils();

    static {
        Class[] elements = {AddToFavoriteActionHandler.class, RemoveFromFavoriteActionHandler.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        FAVORITE_SWITCHING_BUTTON_CUSTOM_ACTION_HANDLER_CLASSES = C7705l.j0(elements);
        $stable = 8;
    }

    private FavoriteCustomComposerActionHandlerUtils() {
    }

    @NotNull
    public final Set<Class<? extends f>> getFAVORITE_SWITCHING_BUTTON_CUSTOM_ACTION_HANDLER_CLASSES() {
        return FAVORITE_SWITCHING_BUTTON_CUSTOM_ACTION_HANDLER_CLASSES;
    }
}
