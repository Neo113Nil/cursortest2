package xe;

import De.C2857A;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C2857A f105398a = new C2857A("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2857A f105399b = new C2857A("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C2857A f105400c = new C2857A("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C2857A f105401d = new C2857A("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C2857A f105402e = new C2857A("SEALED");

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C10730j0 f105403f = new C10730j0(false);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final C10730j0 f105404g = new C10730j0(true);

    public static final Object g(Object obj) {
        InterfaceC10753v0 interfaceC10753v0;
        C10755w0 c10755w0 = obj instanceof C10755w0 ? (C10755w0) obj : null;
        return (c10755w0 == null || (interfaceC10753v0 = c10755w0.f105501a) == null) ? obj : interfaceC10753v0;
    }
}
