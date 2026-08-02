package ru.ozon.app.android.app.launch.handlers.interceptors;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/interceptors/IndefiniteFlashBarArgumentResolver;", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentResolver;", "<init>", "()V", "resolveIntent", "", "intent", "Landroid/content/Intent;", "canResolve", "", "Companion", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IndefiniteFlashBarArgumentResolver implements AppLaunchArgumentResolver {
    @Override // ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentResolver
    public boolean canResolve(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return intent.hasExtra("FLASHBAR_INDEFINITE");
    }

    @Override // ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentResolver
    public void resolveIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("FLASHBAR_INDEFINITE");
        if (stringExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
        flashbarFactory.setConfig(flashbarFactory.getConfig().copy(stringExtra.equals("ENABLED")));
    }
}
