package ru.ozon.app.android.cdn.host.manager.di.module;

import We.E;
import XY.d;
import YY.a;
import aZ.f;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.di.NetworkComponentConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/cdn/host/manager/di/module/CdnHostManagerModule;", "", "Companion", "cdn-host-manager_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CdnHostManagerModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cdn/host/manager/di/module/CdnHostManagerModule$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LWe/E;", "okHttpClient", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "config", "LYY/a;", "provideCdnChooserHostApi", "(Landroid/content/Context;LWe/E;Lru/ozon/app/android/network/di/NetworkComponentConfig;)LYY/a;", "cdn-host-manager_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a provideCdnChooserHostApi(@NotNull Context context, @NotNull E okHttpClient, @NotNull NetworkComponentConfig config) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(config, "config");
            d config2 = new d(context, okHttpClient, config.getAppDomain());
            Intrinsics.checkNotNullParameter(config2, "config");
            return new f(config2);
        }

        private Companion() {
        }
    }
}
