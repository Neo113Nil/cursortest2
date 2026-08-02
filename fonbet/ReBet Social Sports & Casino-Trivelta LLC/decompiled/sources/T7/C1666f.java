package T7;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import d8.C4027c;
import g6.C4331C;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w.d;

/* renamed from: T7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1666f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f11130b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public Uri f11131a;

    /* renamed from: T7.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Uri a(String action, Bundle bundle) {
            Intrinsics.checkNotNullParameter(action, "action");
            Y y10 = Y.f11042a;
            return Y.g(P.b(), C4331C.w() + "/dialog/" + action, bundle);
        }

        public a() {
        }
    }

    public C1666f(String action, Bundle bundle) {
        Uri a10;
        Intrinsics.checkNotNullParameter(action, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        C[] valuesCustom = C.valuesCustom();
        ArrayList arrayList = new ArrayList(valuesCustom.length);
        for (C c10 : valuesCustom) {
            arrayList.add(c10.b());
        }
        if (arrayList.contains(action)) {
            Y y10 = Y.f11042a;
            a10 = Y.g(P.g(), Intrinsics.stringPlus("/dialog/", action), bundle);
        } else {
            a10 = f11130b.a(action, bundle);
        }
        this.f11131a = a10;
    }

    public final boolean a(Activity activity, String str) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            w.d a10 = new d.C0946d(C4027c.f45057b.b()).a();
            a10.f67200a.setPackage(str);
            try {
                a10.a(activity, this.f11131a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final void b(Uri uri) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(uri, "<set-?>");
            this.f11131a = uri;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
