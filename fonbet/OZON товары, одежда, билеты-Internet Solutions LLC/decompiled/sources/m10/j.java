package m10;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C5468b;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class j<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i.d<T> f74045a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C5468b f74046b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f74047c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ExecutorService f74048d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f74049e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList f74050f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private List<? extends T> f74051g;

    /* renamed from: h, reason: collision with root package name */
    private int f74052h;

    public interface a {
        void a();

        void b();
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final ExecutorService f74053a;

        static {
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
            Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(...)");
            f74053a = newFixedThreadPool;
        }

        @NotNull
        public static ExecutorService a() {
            return f74053a;
        }
    }

    private static final class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Handler f74054a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(@NotNull Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.f74054a.post(command);
        }
    }

    public j(@NotNull C8042d adapter, @NotNull i.d diffCallback) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.f74045a = diffCallback;
        this.f74046b = new C5468b(adapter);
        this.f74047c = new c();
        this.f74048d = b.a();
        this.f74050f = new ArrayList();
        this.f74051g = K.f71697a;
    }

    public static void a(j jVar, int i11, ArrayList arrayList, i.c cVar, boolean z11, Function0 function0) {
        if (jVar.f74052h == i11) {
            jVar.f74049e = arrayList;
            jVar.f74051g = Collections.unmodifiableList(arrayList);
            if (!z11) {
                cVar.b(jVar.f74046b);
            }
            jVar.f(function0);
        }
    }

    public static void b(final j jVar, ArrayList arrayList, final ArrayList arrayList2, final int i11, final boolean z11, final Function0 function0) {
        final i.c a11 = androidx.recyclerview.widget.i.a(new k(arrayList, arrayList2, jVar), false);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        jVar.f74047c.execute(new Runnable() { // from class: m10.h
            @Override // java.lang.Runnable
            public final void run() {
                Function0 function02 = function0;
                j.a(j.this, i11, arrayList2, a11, z11, function02);
            }
        });
    }

    private final void f(Function0<Unit> function0) {
        Iterator it = this.f74050f.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        function0.invoke();
    }

    public final void d(@NotNull a statusCallback) {
        Intrinsics.checkNotNullParameter(statusCallback, "statusCallback");
        this.f74050f.add(statusCallback);
    }

    @NotNull
    public final List<T> e() {
        return this.f74051g;
    }

    public final void g(final ArrayList arrayList, final boolean z11, final Function0 function0) {
        final int i11 = this.f74052h + 1;
        this.f74052h = i11;
        Iterator it = this.f74050f.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
        final ArrayList arrayList2 = this.f74049e;
        if (arrayList == arrayList2) {
            f(function0);
            return;
        }
        C5468b c5468b = this.f74046b;
        if (arrayList2 != null) {
            this.f74048d.execute(new Runnable() { // from class: m10.i
                @Override // java.lang.Runnable
                public final void run() {
                    Function0 function02 = function0;
                    j.b(j.this, arrayList2, arrayList, i11, z11, function02);
                }
            });
        } else {
            this.f74049e = arrayList;
            this.f74051g = Collections.unmodifiableList(arrayList);
            c5468b.onInserted(0, arrayList.size());
            f(function0);
        }
    }
}
