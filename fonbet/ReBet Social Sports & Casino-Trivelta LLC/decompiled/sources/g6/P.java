package g6;

import T7.Y;
import a1.C1908a;
import android.content.Intent;
import com.facebook.Profile;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class P {

    /* renamed from: d, reason: collision with root package name */
    public static final a f46991d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static volatile P f46992e;

    /* renamed from: a, reason: collision with root package name */
    public final C1908a f46993a;

    /* renamed from: b, reason: collision with root package name */
    public final O f46994b;

    /* renamed from: c, reason: collision with root package name */
    public Profile f46995c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized P a() {
            P p10;
            try {
                if (P.f46992e == null) {
                    C1908a b10 = C1908a.b(C4331C.l());
                    Intrinsics.checkNotNullExpressionValue(b10, "getInstance(applicationContext)");
                    P.f46992e = new P(b10, new O());
                }
                p10 = P.f46992e;
                if (p10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instance");
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return p10;
        }

        public a() {
        }
    }

    public P(C1908a localBroadcastManager, O profileCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(profileCache, "profileCache");
        this.f46993a = localBroadcastManager;
        this.f46994b = profileCache;
    }

    public final Profile c() {
        return this.f46995c;
    }

    public final boolean d() {
        Profile b10 = this.f46994b.b();
        if (b10 == null) {
            return false;
        }
        g(b10, false);
        return true;
    }

    public final void e(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f46993a.d(intent);
    }

    public final void f(Profile profile) {
        g(profile, true);
    }

    public final void g(Profile profile, boolean z10) {
        Profile profile2 = this.f46995c;
        this.f46995c = profile;
        if (z10) {
            if (profile != null) {
                this.f46994b.c(profile);
            } else {
                this.f46994b.a();
            }
        }
        if (Y.e(profile2, profile)) {
            return;
        }
        e(profile2, profile);
    }
}
