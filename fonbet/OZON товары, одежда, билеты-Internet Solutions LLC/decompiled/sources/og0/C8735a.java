package og0;

import io.sentry.K1;
import kg0.InterfaceC7678b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vg0.InterfaceC10318a;

/* renamed from: og0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8735a implements InterfaceC7678b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10318a f78332a;

    public C8735a(@NotNull InterfaceC10318a eventDataRepository) {
        Intrinsics.checkNotNullParameter(eventDataRepository, "eventDataRepository");
        this.f78332a = eventDataRepository;
    }

    @Override // kg0.InterfaceC7678b
    public final void a() {
        InterfaceC10318a interfaceC10318a = this.f78332a;
        String a11 = interfaceC10318a.a();
        if (a11 == null) {
            a11 = "undefined";
        }
        K1.j("WebViewVersion", a11);
        String b11 = interfaceC10318a.b();
        K1.j("WebViewPackage", b11 != null ? b11 : "undefined");
    }
}
