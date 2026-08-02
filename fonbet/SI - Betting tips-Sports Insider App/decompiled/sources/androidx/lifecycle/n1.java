package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: b, reason: collision with root package name */
    public static final m3.f f2219b = new m3.f(4);

    /* renamed from: a, reason: collision with root package name */
    public final Object f2220a;

    public n1() {
        this.f2220a = new AtomicReference(null);
    }

    public n1(o1 store, m1 factory, t1.c defaultCreationExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f2220a = new com.google.firebase.messaging.x(store, factory, defaultCreationExtras);
    }

    public n1(ProcessLifecycleOwner processLifecycleOwner) {
        this.f2220a = processLifecycleOwner;
    }
}
