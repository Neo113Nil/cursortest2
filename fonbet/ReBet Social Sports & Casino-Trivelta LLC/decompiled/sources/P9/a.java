package P9;

import android.app.Activity;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.internal.fido.zzaa;
import com.google.android.gms.internal.fido.zzab;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3117a.g f8930a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3117a f8931b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzaa f8932c;

    static {
        C3117a.g gVar = new C3117a.g();
        f8930a = gVar;
        f8931b = new C3117a("Fido.U2F_ZERO_PARTY_API", new zzab(), gVar);
        f8932c = new zzaa();
    }

    public static Q9.a a(Activity activity) {
        return new Q9.a(activity);
    }
}
