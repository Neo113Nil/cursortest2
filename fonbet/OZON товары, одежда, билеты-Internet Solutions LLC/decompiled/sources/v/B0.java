package v;

import C.C2698s;
import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import w.C10340H;

/* loaded from: classes8.dex */
public final class B0 implements androidx.camera.core.impl.F {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f100863a;

    /* renamed from: b, reason: collision with root package name */
    private final a f100864b;

    final class a implements InterfaceC10094f {
        @Override // v.InterfaceC10094f
        public final CamcorderProfile a(int i11, int i12) {
            return CamcorderProfile.get(i11, i12);
        }

        @Override // v.InterfaceC10094f
        public final boolean b(int i11, int i12) {
            return CamcorderProfile.hasProfile(i11, i12);
        }
    }

    public B0(@NonNull Context context, Object obj, @NonNull Set<String> set) throws C2698s {
        a aVar = new a();
        this.f100863a = new HashMap();
        this.f100864b = aVar;
        C10340H a11 = obj instanceof C10340H ? (C10340H) obj : C10340H.a(context, G.n.a());
        context.getClass();
        for (String str : set) {
            this.f100863a.put(str, new D1(context, str, a11, this.f100864b));
        }
    }

    @NonNull
    public final Pair a(int i11, @NonNull String str, @NonNull ArrayList arrayList, @NonNull HashMap hashMap, boolean z11, boolean z12) {
        x2.i.a("No new use cases to be bound.", !hashMap.isEmpty());
        D1 d12 = (D1) this.f100863a.get(str);
        if (d12 != null) {
            return d12.g(i11, arrayList, hashMap, z11, z12);
        }
        throw new IllegalArgumentException(Nk.a.b("No such camera id in supported combination list: ", str));
    }

    public final androidx.camera.core.impl.V0 b(int i11, @NonNull String str, int i12, @NonNull Size size) {
        D1 d12 = (D1) this.f100863a.get(str);
        if (d12 != null) {
            return androidx.camera.core.impl.V0.g(i11, i12, size, d12.i(i12));
        }
        return null;
    }
}
