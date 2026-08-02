package jk0;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import jk0.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class f<T extends j> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final J f70166a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC5434v.b f70167b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f70168c;

    /* JADX WARN: Type inference failed for: r2v2, types: [jk0.e] */
    public f(@NotNull J containerViewLifecycleOwner) {
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        this.f70166a = containerViewLifecycleOwner;
        new Handler(Looper.getMainLooper());
        this.f70168c = new G() { // from class: jk0.e
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                f.a(f.this, j11, aVar);
            }
        };
    }

    public static void a(f fVar, J source, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        AbstractC5434v.b b11 = source.getLifecycle().b();
        if (b11 != fVar.f70167b) {
            fVar.f70167b = b11;
            fVar.e(b11, event);
        }
    }

    protected final AbstractC5434v.b b() {
        return this.f70167b;
    }

    @NotNull
    protected final AbstractC5434v.b c() {
        return this.f70166a.getLifecycle().b();
    }

    public void d(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f70166a.getLifecycle().a(this.f70168c);
    }

    public void e(@NotNull AbstractC5434v.b state, @NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(event, "event");
    }

    public void f(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f70166a.getLifecycle().e(this.f70168c);
    }

    public void g(@NotNull T holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public void h(@NotNull T holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public abstract void i(@NotNull l lVar);
}
