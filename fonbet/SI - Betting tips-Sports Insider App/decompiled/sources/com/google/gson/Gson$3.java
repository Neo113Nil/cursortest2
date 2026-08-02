package com.google.gson;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class Gson$3 extends x {
    @Override // com.google.gson.x
    public final Object b(r9.a aVar) {
        if (aVar.i0() != 9) {
            return Long.valueOf(aVar.U());
        }
        aVar.c0();
        return null;
    }

    @Override // com.google.gson.x
    public final void c(r9.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.C();
        } else {
            bVar.W(number.toString());
        }
    }
}
