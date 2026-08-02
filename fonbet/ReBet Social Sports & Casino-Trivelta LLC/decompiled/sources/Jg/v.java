package Jg;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class v extends Lg.p {
    public v(Context context, String str) {
        super(context, str);
    }

    public Task A(final Bundle bundle) {
        return Tasks.call(new Callable() { // from class: Jg.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void r10;
                r10 = v.this.r(bundle);
                return r10;
            }
        });
    }

    public Task B(final long j10) {
        return Tasks.call(new Callable() { // from class: Jg.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void s10;
                s10 = v.this.s(j10);
                return s10;
            }
        });
    }

    public Task C(final String str) {
        return Tasks.call(new Callable() { // from class: Jg.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void t10;
                t10 = v.this.t(str);
                return t10;
            }
        });
    }

    public Task D(final Bundle bundle) {
        return Tasks.call(new Callable() { // from class: Jg.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void u10;
                u10 = v.this.u(bundle);
                return u10;
            }
        });
    }

    public Task E(final String str, final String str2) {
        return Tasks.call(new Callable() { // from class: Jg.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void v10;
                v10 = v.this.v(str, str2);
                return v10;
            }
        });
    }

    public Task l() {
        return FirebaseAnalytics.getInstance(a()).a();
    }

    public Task m() {
        return FirebaseAnalytics.getInstance(a()).b();
    }

    public final /* synthetic */ Void n(String str, Bundle bundle) {
        FirebaseAnalytics.getInstance(a()).c(str, bundle);
        return null;
    }

    public final /* synthetic */ Void o() {
        FirebaseAnalytics.getInstance(a()).d();
        return null;
    }

    public final /* synthetic */ Void p(Boolean bool) {
        FirebaseAnalytics.getInstance(a()).e(bool.booleanValue());
        return null;
    }

    public final /* synthetic */ Void q(Bundle bundle) {
        boolean z10 = bundle.getBoolean("analytics_storage");
        boolean z11 = bundle.getBoolean("ad_storage");
        boolean z12 = bundle.getBoolean("ad_user_data");
        boolean z13 = bundle.getBoolean("ad_personalization");
        EnumMap enumMap = new EnumMap(FirebaseAnalytics.b.class);
        enumMap.put((EnumMap) FirebaseAnalytics.b.ANALYTICS_STORAGE, (FirebaseAnalytics.b) (z10 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED));
        enumMap.put((EnumMap) FirebaseAnalytics.b.AD_STORAGE, (FirebaseAnalytics.b) (z11 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED));
        enumMap.put((EnumMap) FirebaseAnalytics.b.AD_USER_DATA, (FirebaseAnalytics.b) (z12 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED));
        enumMap.put((EnumMap) FirebaseAnalytics.b.AD_PERSONALIZATION, (FirebaseAnalytics.b) (z13 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED));
        FirebaseAnalytics.getInstance(a()).f(enumMap);
        return null;
    }

    public final /* synthetic */ Void r(Bundle bundle) {
        FirebaseAnalytics.getInstance(a()).g(bundle);
        return null;
    }

    public final /* synthetic */ Void s(long j10) {
        FirebaseAnalytics.getInstance(a()).h(j10);
        return null;
    }

    public final /* synthetic */ Void t(String str) {
        FirebaseAnalytics.getInstance(a()).i(str);
        return null;
    }

    public final /* synthetic */ Void u(Bundle bundle) {
        Set<String> keySet = bundle.keySet();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(a());
        for (String str : keySet) {
            firebaseAnalytics.j(str, (String) bundle.get(str));
        }
        return null;
    }

    public final /* synthetic */ Void v(String str, String str2) {
        FirebaseAnalytics.getInstance(a()).j(str, str2);
        return null;
    }

    public Task w(final String str, final Bundle bundle) {
        return Tasks.call(new Callable() { // from class: Jg.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void n10;
                n10 = v.this.n(str, bundle);
                return n10;
            }
        });
    }

    public Task x() {
        return Tasks.call(new Callable() { // from class: Jg.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void o10;
                o10 = v.this.o();
                return o10;
            }
        });
    }

    public Task y(final Boolean bool) {
        return Tasks.call(new Callable() { // from class: Jg.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void p10;
                p10 = v.this.p(bool);
                return p10;
            }
        });
    }

    public Task z(final Bundle bundle) {
        return Tasks.call(new Callable() { // from class: Jg.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void q10;
                q10 = v.this.q(bundle);
                return q10;
            }
        });
    }
}
