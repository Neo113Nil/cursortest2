package ru.ozon.app.android.utils.dispatcherprovider;

import De.s;
import He.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.I;
import xe.L0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProviderImpl;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "<init>", "()V", "Lxe/I;", "IO", "Lxe/I;", "getIO", "()Lxe/I;", "Default", "getDefault", "Main", "getMain", "MainImmediate", "getMainImmediate", "Unconfined", "getUnconfined", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CoroutineDispatcherProviderImpl implements CoroutineDispatcherProvider {

    @NotNull
    private final I Default;

    @NotNull
    private final I IO;

    @NotNull
    private final I Main;

    @NotNull
    private final I MainImmediate;

    @NotNull
    private final I Unconfined;

    public CoroutineDispatcherProviderImpl() {
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.IO = b.f10879b;
        this.Default = C10720e0.a();
        L0 l02 = s.f6650a;
        this.Main = l02;
        this.MainImmediate = l02.x();
        this.Unconfined = C10720e0.b();
    }

    @Override // ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider
    @NotNull
    public I getDefault() {
        return this.Default;
    }

    @Override // ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider
    @NotNull
    public I getIO() {
        return this.IO;
    }

    @Override // ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider
    @NotNull
    public I getMain() {
        return this.Main;
    }

    @Override // ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider
    @NotNull
    public I getMainImmediate() {
        return this.MainImmediate;
    }

    @Override // ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider
    @NotNull
    public I getUnconfined() {
        return this.Unconfined;
    }
}
