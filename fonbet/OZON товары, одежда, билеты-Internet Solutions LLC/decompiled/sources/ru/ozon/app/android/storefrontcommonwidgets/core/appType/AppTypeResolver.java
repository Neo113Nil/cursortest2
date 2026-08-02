package ru.ozon.app.android.storefrontcommonwidgets.core.appType;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefrontcommonwidgets/core/appType/AppTypeResolver;", "", "<init>", "()V", "isSelect", "", "Landroid/content/Context;", "storefrontcommonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppTypeResolver {

    @NotNull
    public static final AppTypeResolver INSTANCE = new AppTypeResolver();

    private AppTypeResolver() {
    }

    public final boolean isSelect(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, AndroidPlatformComponentApi.class).getDependencyStorage();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        return ((AndroidPlatformComponentApi) dependencyStorage.b(AndroidPlatformComponentApi.class)).getAppType() == AppType.SELECT;
    }
}
