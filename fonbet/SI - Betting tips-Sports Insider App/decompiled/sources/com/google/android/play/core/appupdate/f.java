package com.google.android.play.core.appupdate;

import androidx.appcompat.app.v0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements y7.c {

    /* renamed from: a, reason: collision with root package name */
    public final y7.c f6000a;

    public f(y7.c cVar) {
        this.f6000a = cVar;
    }

    @Override // y7.c
    public Object a() {
        e eVar = (e) this.f6000a.a();
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ f(b2.e eVar) {
        h9.c cVar = new h9.c(15, eVar);
        this.f6000a = y7.b.b(new f(y7.b.b(new v0(y7.b.b(new l1.a(9, cVar, y7.b.b(new d(cVar, 1)), false)), y7.b.b(new d(cVar, 0)), cVar, 6))));
    }
}
