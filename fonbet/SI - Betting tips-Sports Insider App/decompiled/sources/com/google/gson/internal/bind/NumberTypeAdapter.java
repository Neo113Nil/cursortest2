package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.w;
import com.google.gson.x;
import com.google.gson.y;
import r4.k;
import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class NumberTypeAdapter extends x {

    /* renamed from: b, reason: collision with root package name */
    public static final y f6246b = d(w.f6376b);

    /* renamed from: a, reason: collision with root package name */
    public final w f6247a;

    public NumberTypeAdapter(w wVar) {
        this.f6247a = wVar;
    }

    public static y d(w wVar) {
        return new y() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.y
            public final x a(j jVar, TypeToken typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.x
    public final Object b(r9.a aVar) {
        int i02 = aVar.i0();
        int d10 = f.d(i02);
        if (d10 == 5 || d10 == 6) {
            return this.f6247a.a(aVar);
        }
        if (d10 == 8) {
            aVar.c0();
            return null;
        }
        throw new r("Expecting number, got: " + k.u(i02) + "; at path " + aVar.z(false));
    }

    @Override // com.google.gson.x
    public final void c(r9.b bVar, Object obj) {
        bVar.U((Number) obj);
    }
}
