package V2;

import Q2.AbstractC1508t;
import Y2.p;
import Y2.r;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f12380f;

    /* renamed from: g, reason: collision with root package name */
    public final a f12381g;

    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            String str;
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(capabilities, "capabilities");
            AbstractC1508t e10 = AbstractC1508t.e();
            str = k.f12383a;
            e10.a(str, "Network capabilities changed: " + capabilities);
            j jVar = j.this;
            jVar.g(Build.VERSION.SDK_INT >= 28 ? k.d(capabilities) : k.c(jVar.f12380f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String str;
            Intrinsics.checkNotNullParameter(network, "network");
            AbstractC1508t e10 = AbstractC1508t.e();
            str = k.f12383a;
            e10.a(str, "Network connection lost");
            j jVar = j.this;
            jVar.g(k.c(jVar.f12380f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Z2.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f12380f = (ConnectivityManager) systemService;
        this.f12381g = new a();
    }

    @Override // V2.h
    public void h() {
        String str;
        String str2;
        String str3;
        try {
            AbstractC1508t e10 = AbstractC1508t.e();
            str3 = k.f12383a;
            e10.a(str3, "Registering network callback");
            r.a(this.f12380f, this.f12381g);
        } catch (IllegalArgumentException e11) {
            AbstractC1508t e12 = AbstractC1508t.e();
            str2 = k.f12383a;
            e12.d(str2, "Received exception while registering network callback", e11);
        } catch (SecurityException e13) {
            AbstractC1508t e14 = AbstractC1508t.e();
            str = k.f12383a;
            e14.d(str, "Received exception while registering network callback", e13);
        }
    }

    @Override // V2.h
    public void i() {
        String str;
        String str2;
        String str3;
        try {
            AbstractC1508t e10 = AbstractC1508t.e();
            str3 = k.f12383a;
            e10.a(str3, "Unregistering network callback");
            p.c(this.f12380f, this.f12381g);
        } catch (IllegalArgumentException e11) {
            AbstractC1508t e12 = AbstractC1508t.e();
            str2 = k.f12383a;
            e12.d(str2, "Received exception while unregistering network callback", e11);
        } catch (SecurityException e13) {
            AbstractC1508t e14 = AbstractC1508t.e();
            str = k.f12383a;
            e14.d(str, "Received exception while unregistering network callback", e13);
        }
    }

    @Override // V2.h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public androidx.work.impl.constraints.e e() {
        return k.c(this.f12380f);
    }
}
