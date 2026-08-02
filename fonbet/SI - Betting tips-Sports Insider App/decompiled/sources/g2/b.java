package g2;

import android.net.Uri;
import android.view.InputEvent;
import androidx.lifecycle.c;
import androidx.lifecycle.o;
import com.google.android.gms.internal.measurement.d5;
import eg.c0;
import eg.m0;
import h2.d;
import h2.e;
import h2.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d5 f9712a;

    public b(d5 mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f9712a = mMeasurementManager;
    }

    @NotNull
    public g8.b a(@NotNull h2.a deletionRequest) {
        Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
        return h8.b.c(c0.e(c0.b(m0.f9201a), null, new a(this, null, 0), 3));
    }

    @NotNull
    public g8.b b() {
        return h8.b.c(c0.e(c0.b(m0.f9201a), null, new a(this, null, 1), 3));
    }

    @NotNull
    public g8.b c(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
        Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
        return h8.b.c(c0.e(c0.b(m0.f9201a), null, new o(this, attributionSource, inputEvent, (Continuation) null, 7), 3));
    }

    @NotNull
    public g8.b d(@NotNull d request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return h8.b.c(c0.e(c0.b(m0.f9201a), null, new a(this, null, 2), 3));
    }

    @NotNull
    public g8.b e(@NotNull Uri trigger) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        return h8.b.c(c0.e(c0.b(m0.f9201a), null, new c(this, trigger, (Continuation) null, 12), 3));
    }

    @NotNull
    public g8.b f(@NotNull e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return h8.b.c(c0.e(c0.b(m0.f9201a), null, new a(this, null, 3), 3));
    }

    @NotNull
    public g8.b g(@NotNull f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return h8.b.c(c0.e(c0.b(m0.f9201a), null, new a(this, null, 4), 3));
    }
}
