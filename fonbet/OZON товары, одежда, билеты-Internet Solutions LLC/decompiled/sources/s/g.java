package s;

import android.content.ComponentName;
import android.os.IBinder;
import b.InterfaceC5493a;
import b.InterfaceC5494b;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5494b f98037a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5493a f98038b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f98039c;

    g(InterfaceC5494b interfaceC5494b, InterfaceC5493a interfaceC5493a, ComponentName componentName) {
        this.f98037a = interfaceC5494b;
        this.f98038b = interfaceC5493a;
        this.f98039c = componentName;
    }

    final IBinder a() {
        return this.f98038b.asBinder();
    }

    final ComponentName b() {
        return this.f98039c;
    }
}
