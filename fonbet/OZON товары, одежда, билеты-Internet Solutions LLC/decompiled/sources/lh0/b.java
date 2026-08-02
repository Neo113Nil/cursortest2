package lh0;

import Zg0.d;
import Zg0.g;
import android.app.Application;
import com.google.android.gms.common.GoogleApiAvailability;
import dh0.C6200a;
import gh0.AbstractC6735a;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b extends AbstractC6735a {
    @Override // gh0.AbstractC6735a
    @NotNull
    public final CompletableFuture<Boolean> c(@NotNull final Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        CompletableFuture<Boolean> supplyAsync = CompletableFuture.supplyAsync(new Supplier() { // from class: lh0.a
            @Override // java.util.function.Supplier
            public final Object get() {
                Application context = app;
                Intrinsics.checkNotNullParameter(context, "context");
                boolean z11 = false;
                try {
                    if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                        z11 = true;
                    }
                } catch (Exception unused) {
                }
                if (!z11) {
                    d b11 = C6200a.b();
                    if (b11 instanceof d.b) {
                        C6200a.c().a(C6200a.a("FCM isn't available, because Google Play Services weren't found."), null);
                        ((d.b) b11).getClass();
                    }
                }
                return Boolean.valueOf(z11);
            }
        });
        Intrinsics.checkNotNullExpressionValue(supplyAsync, "supplyAsync(...)");
        return supplyAsync;
    }

    @Override // gh0.AbstractC6735a
    public final boolean d(@NotNull g configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return true;
    }
}
