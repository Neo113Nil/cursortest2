package ru.ozon.app.android.utils.dispatcherprovider;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xe.I;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "", "Lxe/I;", "getIO", "()Lxe/I;", "IO", "getDefault", "Default", "getMain", "Main", "getMainImmediate", "MainImmediate", "getUnconfined", "Unconfined", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CoroutineDispatcherProvider {
    @NotNull
    I getDefault();

    @NotNull
    I getIO();

    @NotNull
    I getMain();

    @NotNull
    I getMainImmediate();

    @NotNull
    I getUnconfined();
}
