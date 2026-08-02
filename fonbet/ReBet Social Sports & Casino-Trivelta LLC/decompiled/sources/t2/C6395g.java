package t2;

import android.media.metrics.LogSessionId;
import android.view.Surface;
import t2.InterfaceC6399i;

/* renamed from: t2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6395g implements InterfaceC6399i.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6399i.a f65316a;

    /* renamed from: b, reason: collision with root package name */
    public String f65317b;

    /* renamed from: c, reason: collision with root package name */
    public String f65318c;

    public C6395g(InterfaceC6399i.a aVar) {
        this.f65316a = aVar;
    }

    @Override // t2.InterfaceC6399i.a
    public InterfaceC6399i a(androidx.media3.common.a aVar, LogSessionId logSessionId) {
        InterfaceC6399i a10 = this.f65316a.a(aVar, logSessionId);
        this.f65317b = a10.getName();
        return a10;
    }

    @Override // t2.InterfaceC6399i.a
    public InterfaceC6399i b(androidx.media3.common.a aVar, Surface surface, boolean z10, LogSessionId logSessionId) {
        InterfaceC6399i b10 = this.f65316a.b(aVar, surface, z10, logSessionId);
        this.f65318c = b10.getName();
        return b10;
    }

    public String c() {
        return this.f65317b;
    }

    public String d() {
        return this.f65318c;
    }
}
