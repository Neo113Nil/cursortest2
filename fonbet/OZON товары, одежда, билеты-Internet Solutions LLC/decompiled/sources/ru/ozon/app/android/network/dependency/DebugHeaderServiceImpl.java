package ru.ozon.app.android.network.dependency;

import g00.InterfaceC6608a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.storage.debug.DebugToolsService;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/network/dependency/DebugHeaderServiceImpl;", "Lru/ozon/app/android/network/debug/DebugHeaderService;", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "debugToolsService", "Lg00/a;", "composerDebugMenuHostApi", "<init>", "(Lru/ozon/app/android/storage/debug/DebugToolsService;Lg00/a;)V", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "Lg00/a;", "", "getMeshValue", "()Ljava/lang/String;", "meshValue", "getAbVariant", "abVariant", "getInternalHeadersToken", "internalHeadersToken", "getComposerDebugToken", "composerDebugToken", "getResolveOverride", "resolveOverride", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DebugHeaderServiceImpl implements DebugHeaderService {

    @NotNull
    private final InterfaceC6608a composerDebugMenuHostApi;

    @NotNull
    private final DebugToolsService debugToolsService;

    public DebugHeaderServiceImpl(@NotNull DebugToolsService debugToolsService, @NotNull InterfaceC6608a composerDebugMenuHostApi) {
        Intrinsics.checkNotNullParameter(debugToolsService, "debugToolsService");
        Intrinsics.checkNotNullParameter(composerDebugMenuHostApi, "composerDebugMenuHostApi");
        this.debugToolsService = debugToolsService;
        this.composerDebugMenuHostApi = composerDebugMenuHostApi;
    }

    @Override // ru.ozon.app.android.network.debug.DebugHeaderService
    public String getAbVariant() {
        return this.debugToolsService.getAbVariant();
    }

    @Override // ru.ozon.app.android.network.debug.DebugHeaderService
    public String getComposerDebugToken() {
        return this.composerDebugMenuHostApi.v();
    }

    @Override // ru.ozon.app.android.network.debug.DebugHeaderService
    public String getInternalHeadersToken() {
        return this.debugToolsService.getInternalHeadersToken();
    }

    @Override // ru.ozon.app.android.network.debug.DebugHeaderService
    public String getMeshValue() {
        return this.debugToolsService.getMeshValue();
    }

    @Override // ru.ozon.app.android.network.debug.DebugHeaderService
    public String getResolveOverride() {
        return this.debugToolsService.getResolveOverride();
    }
}
