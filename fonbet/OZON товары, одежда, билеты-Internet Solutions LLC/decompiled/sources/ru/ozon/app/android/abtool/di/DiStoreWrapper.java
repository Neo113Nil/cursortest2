package ru.ozon.app.android.abtool.di;

import Ld0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.h;
import pf0.l;
import ru.ozon.app.android.abtool.FeatureServiceConfig;
import xb0.InterfaceC10696a;
import xb0.InterfaceC10697b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/abtool/di/DiStoreWrapper;", "", "<init>", "()V", "LLd0/c;", "store", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "config", "", "init", "(LLd0/c;Lru/ozon/app/android/abtool/FeatureServiceConfig;)V", "_store", "LLd0/c;", "_config", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "getStore", "()LLd0/c;", "getConfig", "()Lru/ozon/app/android/abtool/FeatureServiceConfig;", "Lpf0/l;", "getOzonNetworkApi", "()Lpf0/l;", "ozonNetworkApi", "Lxb0/b;", "getOzonId", "()Lxb0/b;", "ozonId", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiStoreWrapper {

    @NotNull
    public static final DiStoreWrapper INSTANCE = new DiStoreWrapper();
    private static FeatureServiceConfig _config;
    private static c _store;

    private DiStoreWrapper() {
    }

    @NotNull
    public final FeatureServiceConfig getConfig() {
        FeatureServiceConfig featureServiceConfig = _config;
        Intrinsics.f(featureServiceConfig);
        return featureServiceConfig;
    }

    public final InterfaceC10697b getOzonId() {
        c cVar = _store;
        InterfaceC10696a interfaceC10696a = cVar != null ? (InterfaceC10696a) cVar.d(InterfaceC10696a.class) : null;
        if (interfaceC10696a instanceof InterfaceC10697b) {
            return (InterfaceC10697b) interfaceC10696a;
        }
        return null;
    }

    public final l getOzonNetworkApi() {
        c cVar = _store;
        h hVar = cVar != null ? (h) cVar.d(h.class) : null;
        if (hVar instanceof l) {
            return (l) hVar;
        }
        return null;
    }

    @NotNull
    public final c getStore() {
        c cVar = _store;
        Intrinsics.f(cVar);
        return cVar;
    }

    public final void init(@NotNull c store, @NotNull FeatureServiceConfig config) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(config, "config");
        if (_store == null || _config == null) {
            _store = store;
            _config = config;
        }
    }
}
