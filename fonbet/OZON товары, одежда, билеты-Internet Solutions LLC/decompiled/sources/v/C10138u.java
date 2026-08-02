package v;

import C.C2697q;
import C.C2698s;
import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import w.C10340H;
import w.C10348a;

/* renamed from: v.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10138u implements androidx.camera.core.impl.G {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Context f101375a;

    /* renamed from: b, reason: collision with root package name */
    private final A.a f101376b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.camera.core.impl.N f101377c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.camera.core.impl.M f101378d;

    /* renamed from: e, reason: collision with root package name */
    private final C10340H f101379e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f101380f;

    /* renamed from: g, reason: collision with root package name */
    private final C10081a1 f101381g;

    /* renamed from: h, reason: collision with root package name */
    private final long f101382h;

    /* renamed from: i, reason: collision with root package name */
    private final HashMap f101383i = new HashMap();

    public C10138u(@NonNull Context context, @NonNull androidx.camera.core.impl.N n11, C2697q c2697q, long j11) throws C.P {
        this.f101375a = context;
        this.f101377c = n11;
        this.f101379e = C10340H.a(context, n11.c());
        this.f101381g = C10081a1.b(context);
        ArrayList b11 = M0.b(this, c2697q);
        ArrayList arrayList = new ArrayList();
        Iterator it = b11.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (L0.a(str, this.f101379e)) {
                arrayList.add(str);
            } else {
                C.S.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        this.f101380f = arrayList;
        A.a aVar = new A.a(this.f101379e);
        this.f101376b = aVar;
        androidx.camera.core.impl.M m11 = new androidx.camera.core.impl.M(aVar);
        this.f101378d = m11;
        aVar.a(m11);
        this.f101382h = j11;
    }

    @Override // androidx.camera.core.impl.G
    @NonNull
    public final C10340H a() {
        return this.f101379e;
    }

    @Override // androidx.camera.core.impl.G
    @NonNull
    public final androidx.camera.core.impl.I b(@NonNull String str) throws C2698s {
        if (!this.f101380f.contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        Q e11 = e(str);
        androidx.camera.core.impl.N n11 = this.f101377c;
        Executor b11 = n11.b();
        Handler c11 = n11.c();
        return new L(this.f101375a, this.f101379e, str, e11, this.f101376b, this.f101378d, b11, c11, this.f101381g, this.f101382h);
    }

    @Override // androidx.camera.core.impl.G
    @NonNull
    public final LinkedHashSet c() {
        return new LinkedHashSet(this.f101380f);
    }

    @Override // androidx.camera.core.impl.G
    @NonNull
    public final A.a d() {
        return this.f101376b;
    }

    final Q e(@NonNull String str) throws C2698s {
        HashMap hashMap = this.f101383i;
        try {
            Q q11 = (Q) hashMap.get(str);
            if (q11 != null) {
                return q11;
            }
            Q q12 = new Q(str, this.f101379e);
            hashMap.put(str, q12);
            return q12;
        } catch (C10348a e11) {
            throw new C2698s(e11);
        }
    }

    @NonNull
    public final C10340H f() {
        return this.f101379e;
    }
}
