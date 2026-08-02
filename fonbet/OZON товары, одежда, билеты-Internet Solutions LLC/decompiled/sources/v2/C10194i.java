package v2;

import androidx.collection.Z;
import java.util.ArrayList;
import v2.C10191f;
import x2.InterfaceC10646a;

/* renamed from: v2.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10194i implements InterfaceC10646a<C10191f.b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f101704a;

    C10194i(String str) {
        this.f101704a = str;
    }

    @Override // x2.InterfaceC10646a
    public final void accept(C10191f.b bVar) {
        C10191f.b bVar2 = bVar;
        synchronized (C10191f.f101691c) {
            try {
                Z<String, ArrayList<InterfaceC10646a<C10191f.b>>> z11 = C10191f.f101692d;
                ArrayList<InterfaceC10646a<C10191f.b>> arrayList = z11.get(this.f101704a);
                if (arrayList == null) {
                    return;
                }
                z11.remove(this.f101704a);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    arrayList.get(i11).accept(bVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
