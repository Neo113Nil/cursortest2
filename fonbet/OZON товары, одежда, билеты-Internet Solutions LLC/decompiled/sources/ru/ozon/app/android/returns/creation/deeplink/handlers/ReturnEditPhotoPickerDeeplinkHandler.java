package ru.ozon.app.android.returns.creation.deeplink.handlers;

import GZ.j;
import android.net.Uri;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.pageconfigurators.PhotoPickerConfigurator;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/creation/deeplink/handlers/ReturnEditPhotoPickerDeeplinkHandler;", "Lru/ozon/app/android/returns/creation/deeplink/handlers/BaseReturnCreationDeeplinkHandler;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "", "Ljava/lang/Class;", "Lru/ozon/app/android/returns/creation/pageconfigurators/PhotoPickerConfigurator;", "configurators", "Ljava/util/Set;", "getConfigurators", "()Ljava/util/Set;", "", "backgroundColor", "I", "getBackgroundColor", "()I", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnEditPhotoPickerDeeplinkHandler extends BaseReturnCreationDeeplinkHandler {
    public static final int $stable = 8;

    @NotNull
    private final Set<Class<PhotoPickerConfigurator>> configurators = e0.h(PhotoPickerConfigurator.class);
    private final int backgroundColor = UniColors.LAYER_FLOOR_1.getResId();

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        if (Intrinsics.d(b11.getAuthority(), "my")) {
            Intrinsics.f(pathSegments);
            if (Intrinsics.d(C7714v.Q(0, pathSegments), "returnEditUploadPhotos")) {
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
    public Set<Class<PhotoPickerConfigurator>> getConfigurators() {
        return this.configurators;
    }
}
