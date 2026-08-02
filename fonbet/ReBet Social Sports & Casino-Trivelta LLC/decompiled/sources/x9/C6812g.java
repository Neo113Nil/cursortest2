package x9;

import android.os.Bundle;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.internal.AbstractC3189m;

/* renamed from: x9.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6812g implements C3117a.d {

    /* renamed from: d, reason: collision with root package name */
    public static final C6812g f67970d = new C6812g(new C6811f());

    /* renamed from: a, reason: collision with root package name */
    public final String f67971a = null;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f67972b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67973c;

    public C6812g(C6811f c6811f) {
        this.f67972b = c6811f.f67968a.booleanValue();
        this.f67973c = c6811f.f67969b;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f67972b);
        bundle.putString("log_session_id", this.f67973c);
        return bundle;
    }

    public final /* synthetic */ boolean b() {
        return this.f67972b;
    }

    public final /* synthetic */ String c() {
        return this.f67973c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6812g)) {
            return false;
        }
        C6812g c6812g = (C6812g) obj;
        return AbstractC3189m.b(null, null) && this.f67972b == c6812g.f67972b && AbstractC3189m.b(this.f67973c, c6812g.f67973c);
    }

    public final int hashCode() {
        return AbstractC3189m.c(null, Boolean.valueOf(this.f67972b), this.f67973c);
    }
}
