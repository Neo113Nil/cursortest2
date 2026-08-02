package ga;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3189m;

/* renamed from: ga.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4367a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f47226a;

    /* renamed from: b, reason: collision with root package name */
    public final Status f47227b;

    public C4367a(Object obj, Status status) {
        this.f47226a = obj;
        this.f47227b = status;
    }

    public Object a() {
        return this.f47226a;
    }

    public Status b() {
        return this.f47227b;
    }

    public String toString() {
        return AbstractC3189m.d(this).a("status", this.f47227b).a("result", this.f47226a).toString();
    }

    public C4367a(Status status) {
        this(null, status);
    }
}
