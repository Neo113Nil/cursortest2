package c;

import android.os.Handler;
import android.os.Looper;
import com.surt.guardian.network.VerificationResult;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2434c {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f26519a = new Handler(Looper.getMainLooper());

    public static final void b(C2434c this$0, Dc.c error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.getClass();
    }

    public static final void c(C2434c this$0, VerificationResult result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "$result");
        this$0.getClass();
    }

    public final void a(final Dc.c error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f26519a.post(new Runnable() { // from class: c.b
            @Override // java.lang.Runnable
            public final void run() {
                C2434c.b(C2434c.this, error);
            }
        });
    }

    public final void d(final VerificationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f26519a.post(new Runnable() { // from class: c.a
            @Override // java.lang.Runnable
            public final void run() {
                C2434c.c(C2434c.this, result);
            }
        });
    }
}
