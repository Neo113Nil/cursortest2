package g6;

import T7.Z;
import a1.C1908a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.Profile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public final BroadcastReceiver f46996a;

    /* renamed from: b, reason: collision with root package name */
    public final C1908a f46997b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46998c;

    public final class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q f46999a;

        public a(Q this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f46999a = this$0;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (Intrinsics.areEqual("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED", intent.getAction())) {
                this.f46999a.b((Profile) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_PROFILE"), (Profile) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_PROFILE"));
            }
        }
    }

    public Q() {
        Z.o();
        this.f46996a = new a(this);
        C1908a b10 = C1908a.b(C4331C.l());
        Intrinsics.checkNotNullExpressionValue(b10, "getInstance(FacebookSdk.getApplicationContext())");
        this.f46997b = b10;
        c();
    }

    public final void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        this.f46997b.c(this.f46996a, intentFilter);
    }

    public abstract void b(Profile profile, Profile profile2);

    public final void c() {
        if (this.f46998c) {
            return;
        }
        a();
        this.f46998c = true;
    }

    public final void d() {
        if (this.f46998c) {
            this.f46997b.e(this.f46996a);
            this.f46998c = false;
        }
    }
}
