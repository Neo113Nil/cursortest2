package B;

import android.os.Looper;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: B.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1026a {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f491a = LazyKt.lazy(C0012a.f493d);

    /* renamed from: b, reason: collision with root package name */
    public static final long f492b;

    /* renamed from: B.a$a, reason: collision with other inner class name */
    public static final class C0012a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0012a f493d = new C0012a();

        public C0012a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final r invoke() {
            return Looper.getMainLooper() != null ? C1036k.f508a : A.f486a;
        }
    }

    static {
        long j10;
        try {
            j10 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j10 = -1;
        }
        f492b = j10;
    }

    public static final H.i a(Object obj, B b10) {
        return new ParcelableSnapshotMutableState(obj, b10);
    }

    public static final long b() {
        return f492b;
    }
}
