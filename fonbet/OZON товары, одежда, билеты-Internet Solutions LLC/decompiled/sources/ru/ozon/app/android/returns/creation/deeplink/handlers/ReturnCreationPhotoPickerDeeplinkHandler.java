package ru.ozon.app.android.returns.creation.deeplink.handlers;

import GZ.j;
import android.net.Uri;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.returns.creation.pageconfigurators.PhotoPickerConfigurator;
import ru.ozon.app.android.ui.gallery.configurator.GalleryLauncherConfigurator;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR(\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/creation/deeplink/handlers/ReturnCreationPhotoPickerDeeplinkHandler;", "Lru/ozon/app/android/returns/creation/deeplink/handlers/BaseReturnCreationDeeplinkHandler;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "", "Ljava/lang/Class;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "configurators", "Ljava/util/Set;", "getConfigurators", "()Ljava/util/Set;", "", "backgroundColor", "I", "getBackgroundColor", "()I", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationPhotoPickerDeeplinkHandler extends BaseReturnCreationDeeplinkHandler {
    private final int backgroundColor;

    @NotNull
    private final Set<Class<? extends ComposerScreenConfig.PageConfigurator>> configurators;

    public ReturnCreationPhotoPickerDeeplinkHandler() {
        Class[] elements = {PhotoPickerConfigurator.class, GalleryLauncherConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.configurators = C7705l.j0(elements);
        this.backgroundColor = UniColors.LAYER_FLOOR_1.getResId();
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        if (Intrinsics.d(b11.getAuthority(), "my")) {
            Intrinsics.f(pathSegments);
            if (Intrinsics.d(C7714v.Q(0, pathSegments), "returnCreation") && Intrinsics.d(C7714v.Q(1, pathSegments), "reasons") && Intrinsics.d(C7714v.Q(2, pathSegments), "photo")) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ozon.app.android.returns.creation.deeplink.handlers.BaseReturnCreationDeeplinkHandler
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.ozon.app.android.returns.creation.deeplink.handlers.BaseReturnCreationDeeplinkHandler
    @NotNull
    public Set<Class<? extends ComposerScreenConfig.PageConfigurator>> getConfigurators() {
        return this.configurators;
    }
}
