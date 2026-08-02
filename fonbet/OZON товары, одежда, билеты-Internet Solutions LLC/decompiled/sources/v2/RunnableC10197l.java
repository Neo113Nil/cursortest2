package v2;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import x2.InterfaceC10646a;

/* renamed from: v2.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class RunnableC10197l<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private Callable<T> f101713a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private InterfaceC10646a<T> f101714b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private Handler f101715c;

    /* renamed from: v2.l$a */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC10646a f101716a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f101717b;

        a(InterfaceC10646a interfaceC10646a, Object obj) {
            this.f101716a = interfaceC10646a;
            this.f101717b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            ((C10194i) this.f101716a).accept(this.f101717b);
        }
    }

    RunnableC10197l(@NonNull Handler handler, @NonNull Callable<T> callable, @NonNull InterfaceC10646a<T> interfaceC10646a) {
        this.f101713a = callable;
        this.f101714b = interfaceC10646a;
        this.f101715c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = ((CallableC10193h) this.f101713a).call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f101715c.post(new a(this.f101714b, obj));
    }
}
