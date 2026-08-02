package vh0;

import Lm0.a;
import Zg0.d;
import android.content.Intent;
import dh0.C6200a;
import kotlin.jvm.internal.Intrinsics;
import nh0.C8596a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8596a f102939a;

    public c(@NotNull C8596a analyticsPlugin) {
        Intrinsics.checkNotNullParameter(analyticsPlugin, "analyticsPlugin");
        this.f102939a = analyticsPlugin;
    }

    @Override // vh0.h
    public final boolean a(@NotNull Intent intent) {
        String stringExtra;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!intent.hasExtra("comms_message_id") || (stringExtra = intent.getStringExtra("comms_message_id")) == null) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("HmsClickHandler");
            bVar.w("No message_id found in intent", new Object[0]);
            return false;
        }
        Zg0.d b11 = C6200a.b();
        if (b11 instanceof d.b) {
            C6200a.c().a(C6200a.a("HmsClickHandler handled notification push id ".concat(stringExtra)), null);
            ((d.b) b11).getClass();
        }
        this.f102939a.b(stringExtra);
        intent.removeExtra("comms_message_id");
        return true;
    }
}
