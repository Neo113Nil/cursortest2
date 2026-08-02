package vh0;

import Zg0.d;
import android.content.Intent;
import dh0.C6200a;
import kotlin.jvm.internal.Intrinsics;
import nh0.C8596a;
import org.jetbrains.annotations.NotNull;

/* renamed from: vh0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10320a implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8596a f102937a;

    public C10320a(@NotNull C8596a analyticsPlugin) {
        Intrinsics.checkNotNullParameter(analyticsPlugin, "analyticsPlugin");
        this.f102937a = analyticsPlugin;
    }

    @Override // vh0.h
    public final boolean a(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("ru.ozon.push.sdk.PUSH_ID_ANALYTICS_KEY");
        if (stringExtra == null) {
            return false;
        }
        Zg0.d b11 = C6200a.b();
        if (b11 instanceof d.b) {
            C6200a.c().a(C6200a.a("CustomAnalyticsClickHandler handled notification push id ".concat(stringExtra)), null);
            ((d.b) b11).getClass();
        }
        this.f102937a.b(stringExtra);
        intent.removeExtra("ru.ozon.push.sdk.PUSH_ID_ANALYTICS_KEY");
        return true;
    }
}
