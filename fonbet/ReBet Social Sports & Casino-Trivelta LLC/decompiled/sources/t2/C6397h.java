package t2;

import android.media.metrics.LogSessionId;
import t2.InterfaceC6399i;

/* renamed from: t2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6397h implements InterfaceC6399i.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6399i.b f65377a;

    /* renamed from: b, reason: collision with root package name */
    public String f65378b;

    /* renamed from: c, reason: collision with root package name */
    public String f65379c;

    public C6397h(InterfaceC6399i.b bVar) {
        this.f65377a = bVar;
    }

    @Override // t2.InterfaceC6399i.b
    public boolean a() {
        return this.f65377a.a();
    }

    @Override // t2.InterfaceC6399i.b
    public InterfaceC6399i b(androidx.media3.common.a aVar, LogSessionId logSessionId) {
        InterfaceC6399i b10 = this.f65377a.b(aVar, logSessionId);
        this.f65379c = b10.getName();
        return b10;
    }

    @Override // t2.InterfaceC6399i.b
    public boolean c() {
        return this.f65377a.c();
    }

    @Override // t2.InterfaceC6399i.b
    public InterfaceC6399i d(androidx.media3.common.a aVar, LogSessionId logSessionId) {
        InterfaceC6399i d10 = this.f65377a.d(aVar, logSessionId);
        this.f65378b = d10.getName();
        return d10;
    }

    public String e() {
        return this.f65378b;
    }

    public String f() {
        return this.f65379c;
    }
}
