package f5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import i5.C7009b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6428f<T> extends AbstractC6430h<T> {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C6427e f62735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6428f(@NotNull Context context, @NotNull C7009b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f62735f = new C6427e(this);
    }

    @Override // f5.AbstractC6430h
    public final void g() {
        String str;
        androidx.work.o e11 = androidx.work.o.e();
        str = C6429g.f62736a;
        e11.a(str, getClass().getSimpleName().concat(": registering receiver"));
        c().registerReceiver(this.f62735f, i());
    }

    @Override // f5.AbstractC6430h
    public final void h() {
        String str;
        androidx.work.o e11 = androidx.work.o.e();
        str = C6429g.f62736a;
        e11.a(str, getClass().getSimpleName().concat(": unregistering receiver"));
        c().unregisterReceiver(this.f62735f);
    }

    @NotNull
    public abstract IntentFilter i();

    public abstract void j(@NotNull Intent intent);
}
