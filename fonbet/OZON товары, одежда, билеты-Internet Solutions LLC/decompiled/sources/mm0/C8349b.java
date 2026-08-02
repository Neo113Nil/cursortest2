package mm0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gm0.C6752a;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jm0.i;
import km0.AbstractC7693a;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.InstallState;

/* renamed from: mm0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8349b<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f76023a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7704k<T> f76024b = new C7704k<>();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArraySet<im0.c<T>> f76025c = new CopyOnWriteArraySet<>();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final im0.b<T> f76026d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mm0.b$a */
    final class a extends AbstractC7693a<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C6752a f76027a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8349b<T> f76028b;

        /* renamed from: mm0.b$a$a, reason: collision with other inner class name */
        public static final class C1280a implements i {

            /* renamed from: a, reason: collision with root package name */
            private final AtomicBoolean f76029a = new AtomicBoolean();

            /* renamed from: b, reason: collision with root package name */
            private final AtomicReference<im0.c<T>> f76030b = new AtomicReference<>(null);

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C8349b<T> f76031c;

            C1280a(C8349b<T> c8349b) {
                this.f76031c = c8349b;
            }

            public final void a(im0.c<T> emitProcessor) {
                im0.c<T> andSet;
                Intrinsics.checkNotNullParameter(emitProcessor, "emitProcessor");
                AtomicReference<im0.c<T>> atomicReference = this.f76030b;
                while (!atomicReference.compareAndSet(null, emitProcessor) && atomicReference.get() == null) {
                }
                if (!this.f76029a.get() || (andSet = atomicReference.getAndSet(null)) == null) {
                    return;
                }
                andSet.dispose();
                ((C8349b) this.f76031c).f76025c.remove(andSet);
            }

            @Override // jm0.i
            public final void dispose() {
                im0.c<T> andSet;
                if (!this.f76029a.compareAndSet(false, true) || (andSet = this.f76030b.getAndSet(null)) == null) {
                    return;
                }
                andSet.dispose();
                ((C8349b) this.f76031c).f76025c.remove(andSet);
            }
        }

        public a(@NotNull C8349b c8349b, C6752a backpressureStrategy) {
            Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
            this.f76028b = c8349b;
            this.f76027a = backpressureStrategy;
        }

        @Override // km0.AbstractC7693a
        public final void a(@NotNull km0.d<T> downstream) {
            im0.c<T> a11;
            Intrinsics.checkNotNullParameter(downstream, "downstream");
            C1280a c1280a = new C1280a(this.f76028b);
            downstream.a(c1280a);
            this.f76028b.getClass();
            Object obj = ((C8349b) this.f76028b).f76023a;
            C8349b<T> c8349b = this.f76028b;
            synchronized (obj) {
                a11 = im0.d.a(this.f76027a, downstream, null);
                a11.e(C7714v.U0(((C8349b) c8349b).f76024b));
                ((C8349b) c8349b).f76025c.add(a11);
            }
            c1280a.a(a11);
            a11.c();
        }
    }

    public C8349b() {
        C8350c downStream = new C8350c(this);
        Intrinsics.checkNotNullParameter(downStream, "downStream");
        this.f76026d = new im0.b<>(downStream, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    public final void d(InstallState installState) {
        synchronized (this.f76023a) {
            try {
                if (this.f76024b.getF26995b() >= 1) {
                    this.f76024b.A();
                }
                this.f76024b.addLast(installState);
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f76026d.d(installState);
        this.f76026d.c();
    }
}
