package vg0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pg0.InterfaceC8927a;
import xb0.InterfaceC10697b;

/* renamed from: vg0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10319b implements InterfaceC10318a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10697b f102892a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC8927a f102893b;

    public C10319b(InterfaceC10697b interfaceC10697b, @NotNull InterfaceC8927a webViewDataProvider) {
        Intrinsics.checkNotNullParameter(webViewDataProvider, "webViewDataProvider");
        this.f102892a = interfaceC10697b;
        this.f102893b = webViewDataProvider;
    }

    @Override // vg0.InterfaceC10318a
    public final String a() {
        return this.f102893b.a();
    }

    @Override // vg0.InterfaceC10318a
    public final String b() {
        return this.f102893b.b();
    }

    @Override // vg0.InterfaceC10318a
    public final String c() {
        InterfaceC10697b interfaceC10697b = this.f102892a;
        if (interfaceC10697b == null) {
            return "undefined";
        }
        Long valueOf = Long.valueOf(interfaceC10697b.getUserId());
        if (valueOf.longValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.toString();
        }
        return null;
    }

    @Override // vg0.InterfaceC10318a
    public final String getSessionId() {
        InterfaceC10697b interfaceC10697b = this.f102892a;
        return interfaceC10697b == null ? "undefined" : interfaceC10697b.getSessionId();
    }
}
