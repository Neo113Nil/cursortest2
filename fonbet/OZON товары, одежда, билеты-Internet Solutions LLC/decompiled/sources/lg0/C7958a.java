package lg0;

import io.sentry.K1;
import kg0.InterfaceC7678b;
import kotlin.text.h;

/* renamed from: lg0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7958a implements InterfaceC7678b {

    /* renamed from: a, reason: collision with root package name */
    private final String f73306a;

    public C7958a(String str) {
        this.f73306a = str;
    }

    @Override // kg0.InterfaceC7678b
    public final void a() {
        String str = this.f73306a;
        if (str == null || h.K(str)) {
            str = null;
        }
        if (str == null) {
            str = "undefined";
        }
        K1.j("BuildHashCommit", str);
    }
}
