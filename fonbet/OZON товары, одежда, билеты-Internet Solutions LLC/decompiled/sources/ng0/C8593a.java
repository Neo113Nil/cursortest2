package ng0;

import com.google.gson.internal.d;
import io.sentry.K1;
import io.sentry.U;
import io.sentry.protocol.E;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kg0.InterfaceC7679c;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vg0.InterfaceC10318a;

/* renamed from: ng0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8593a implements InterfaceC7679c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10318a f77139a;

    public C8593a(@NotNull InterfaceC10318a eventDataRepository) {
        Intrinsics.checkNotNullParameter(eventDataRepository, "eventDataRepository");
        this.f77139a = eventDataRepository;
    }

    public static void c(C8593a c8593a, U scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        E user = scope.getUser();
        if (user == null) {
            user = new E();
            scope.d(user);
        }
        String c11 = c8593a.f77139a.c();
        String sessionId = c8593a.f77139a.getSessionId();
        d(user, "OzonId", c11);
        d(user, "SessionId", sessionId);
        user.n(c11);
    }

    private static void d(E e11, String str, String str2) {
        if (str2 == null) {
            Map<String, String> h11 = e11.h();
            if (h11 != null) {
                return;
            }
            return;
        }
        Map<String, String> h12 = e11.h();
        if (h12 != null) {
            ((ConcurrentHashMap) h12).put(str, str2);
        } else {
            e11.m(kotlin.collections.U.l(new Pair(str, str2)));
        }
    }

    @Override // kg0.InterfaceC7678b
    public final void a() {
        K1.d().m(new d(this));
    }

    @Override // kg0.InterfaceC7679c
    public final void b() {
        a();
    }
}
