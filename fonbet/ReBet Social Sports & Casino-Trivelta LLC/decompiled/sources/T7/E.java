package T7;

import android.net.Uri;
import android.os.Bundle;
import g6.C4331C;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class E extends C1666f {

    /* renamed from: c, reason: collision with root package name */
    public static final a f10983c = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(String action, Bundle bundle) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.areEqual(action, "oauth")) {
                Y y10 = Y.f11042a;
                return Y.g(P.k(), "oauth/authorize", bundle);
            }
            Y y11 = Y.f11042a;
            return Y.g(P.k(), C4331C.w() + "/dialog/" + action, bundle);
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(String action, Bundle bundle) {
        super(action, bundle);
        Intrinsics.checkNotNullParameter(action, "action");
        b(f10983c.a(action, bundle == null ? new Bundle() : bundle));
    }
}
