package x9;

import android.os.Bundle;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.internal.AbstractC3189m;

/* renamed from: x9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6808c implements C3117a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final C6808c f67966b = new C6808c(new Bundle(), null);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f67967a;

    public /* synthetic */ C6808c(Bundle bundle, AbstractC6814i abstractC6814i) {
        this.f67967a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.f67967a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6808c) {
            return AbstractC3189m.a(this.f67967a, ((C6808c) obj).f67967a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3189m.c(this.f67967a);
    }
}
