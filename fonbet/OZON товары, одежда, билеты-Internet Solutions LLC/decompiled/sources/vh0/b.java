package vh0;

import Lm0.a;
import Zg0.d;
import android.content.Intent;
import dh0.C6200a;
import kotlin.jvm.internal.Intrinsics;
import nh0.C8596a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8596a f102938a;

    public b(@NotNull C8596a analyticsPlugin) {
        Intrinsics.checkNotNullParameter(analyticsPlugin, "analyticsPlugin");
        this.f102938a = analyticsPlugin;
    }

    @Override // vh0.h
    public final boolean a(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent.hasExtra("google.message_id")) {
            String stringExtra = intent.getStringExtra("message_id");
            if (stringExtra != null) {
                Zg0.d b11 = C6200a.b();
                if (b11 instanceof d.b) {
                    C6200a.c().a(C6200a.a("FcmClickHandler handled notification push id ".concat(stringExtra)), null);
                    ((d.b) b11).getClass();
                }
                this.f102938a.b(stringExtra);
                intent.removeExtra("message_id");
                return true;
            }
            a.b bVar = Lm0.a.f17149a;
            bVar.b("FcmClickHandler");
            bVar.w("No message_id found in intent", new Object[0]);
        }
        return false;
    }
}
