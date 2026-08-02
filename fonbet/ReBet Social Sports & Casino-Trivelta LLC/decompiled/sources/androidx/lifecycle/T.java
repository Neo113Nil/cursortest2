package androidx.lifecycle;

import androidx.lifecycle.U;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class T implements Lazy {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f20350a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f20351b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f20352c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f20353d;

    /* renamed from: e, reason: collision with root package name */
    public Q f20354e;

    public T(KClass viewModelClass, Function0 storeProducer, Function0 factoryProducer, Function0 extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.f20350a = viewModelClass;
        this.f20351b = storeProducer;
        this.f20352c = factoryProducer;
        this.f20353d = extrasProducer;
    }

    @Override // kotlin.Lazy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q getValue() {
        Q q10 = this.f20354e;
        if (q10 != null) {
            return q10;
        }
        Q c10 = U.f20355b.a((V) this.f20351b.invoke(), (U.c) this.f20352c.invoke(), (X0.a) this.f20353d.invoke()).c(this.f20350a);
        this.f20354e = c10;
        return c10;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f20354e != null;
    }
}
