package f5;

import android.content.Context;
import android.net.ConnectivityManager;
import d5.C6087b;
import h5.C6811i;
import i5.C7009b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6433k extends AbstractC6430h<C6087b> {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ConnectivityManager f62744f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C6432j f62745g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6433k(@NotNull Context context, @NotNull C7009b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = c().getSystemService("connectivity");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f62744f = (ConnectivityManager) systemService;
        this.f62745g = new C6432j(this);
    }

    @Override // f5.AbstractC6430h
    public final C6087b d() {
        return C6434l.b(this.f62744f);
    }

    @Override // f5.AbstractC6430h
    public final void g() {
        String str;
        String str2;
        String str3;
        try {
            androidx.work.o e11 = androidx.work.o.e();
            str3 = C6434l.f62746a;
            e11.a(str3, "Registering network callback");
            h5.k.a(this.f62744f, this.f62745g);
        } catch (IllegalArgumentException e12) {
            androidx.work.o e13 = androidx.work.o.e();
            str2 = C6434l.f62746a;
            e13.d(str2, "Received exception while registering network callback", e12);
        } catch (SecurityException e14) {
            androidx.work.o e15 = androidx.work.o.e();
            str = C6434l.f62746a;
            e15.d(str, "Received exception while registering network callback", e14);
        }
    }

    @Override // f5.AbstractC6430h
    public final void h() {
        String str;
        String str2;
        String str3;
        try {
            androidx.work.o e11 = androidx.work.o.e();
            str3 = C6434l.f62746a;
            e11.a(str3, "Unregistering network callback");
            C6811i.c(this.f62744f, this.f62745g);
        } catch (IllegalArgumentException e12) {
            androidx.work.o e13 = androidx.work.o.e();
            str2 = C6434l.f62746a;
            e13.d(str2, "Received exception while unregistering network callback", e12);
        } catch (SecurityException e14) {
            androidx.work.o e15 = androidx.work.o.e();
            str = C6434l.f62746a;
            e15.d(str, "Received exception while unregistering network callback", e14);
        }
    }
}
