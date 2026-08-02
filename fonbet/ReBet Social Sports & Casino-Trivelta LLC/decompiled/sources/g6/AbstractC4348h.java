package g6;

import T7.Y;
import T7.Z;
import a1.C1908a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.AccessToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4348h {

    /* renamed from: d, reason: collision with root package name */
    public static final a f47081d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final String f47082e = AbstractC4348h.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    public final BroadcastReceiver f47083a;

    /* renamed from: b, reason: collision with root package name */
    public final C1908a f47084b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f47085c;

    /* renamed from: g6.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: g6.h$b */
    public final class b extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC4348h f47086a;

        public b(AbstractC4348h this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f47086a = this$0;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (Intrinsics.areEqual("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction())) {
                Y y10 = Y.f11042a;
                Y.k0(AbstractC4348h.f47082e, "AccessTokenChanged");
                this.f47086a.d((AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    public AbstractC4348h() {
        Z.o();
        this.f47083a = new b(this);
        C1908a b10 = C1908a.b(C4331C.l());
        Intrinsics.checkNotNullExpressionValue(b10, "getInstance(FacebookSdk.getApplicationContext())");
        this.f47084b = b10;
        e();
    }

    public final void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f47084b.c(this.f47083a, intentFilter);
    }

    public final boolean c() {
        return this.f47085c;
    }

    public abstract void d(AccessToken accessToken, AccessToken accessToken2);

    public final void e() {
        if (this.f47085c) {
            return;
        }
        b();
        this.f47085c = true;
    }

    public final void f() {
        if (this.f47085c) {
            this.f47084b.e(this.f47083a);
            this.f47085c = false;
        }
    }
}
