package ru.ozon.app.android.cdn.host.manager;

import YY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.CdnChooserSdkVideoService;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cdn/host/manager/CdnChooserSdkManagerImpl;", "Lru/ozon/app/android/cdn/host/manager/CdnChooserSdkManager;", "LYY/a;", "cdnChooserSdk", "Lru/ozon/app/android/video/player/CdnChooserSdkVideoService;", "cdnChooserSdkVideoService", "<init>", "(LYY/a;Lru/ozon/app/android/video/player/CdnChooserSdkVideoService;)V", "", "receiveActualDomain", "()V", "LYY/a;", "Lru/ozon/app/android/video/player/CdnChooserSdkVideoService;", "cdn-host-manager_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CdnChooserSdkManagerImpl implements CdnChooserSdkManager {

    @NotNull
    private final a cdnChooserSdk;

    @NotNull
    private final CdnChooserSdkVideoService cdnChooserSdkVideoService;

    public CdnChooserSdkManagerImpl(@NotNull a cdnChooserSdk, @NotNull CdnChooserSdkVideoService cdnChooserSdkVideoService) {
        Intrinsics.checkNotNullParameter(cdnChooserSdk, "cdnChooserSdk");
        Intrinsics.checkNotNullParameter(cdnChooserSdkVideoService, "cdnChooserSdkVideoService");
        this.cdnChooserSdk = cdnChooserSdk;
        this.cdnChooserSdkVideoService = cdnChooserSdkVideoService;
    }

    @Override // ru.ozon.app.android.cdn.host.manager.CdnChooserSdkManager
    public void receiveActualDomain() {
        this.cdnChooserSdkVideoService.setCdnVideoRulesProvider(new CdnChooserSdkManagerImpl$receiveActualDomain$1(this));
    }
}
