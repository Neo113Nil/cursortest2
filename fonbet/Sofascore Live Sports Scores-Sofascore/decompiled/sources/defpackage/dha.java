package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class dha extends tga {
    public String i;
    public boolean j;

    @Override // defpackage.tga
    public final b K() {
        return new c((LinkedHashMap) this.h);
    }

    @Override // defpackage.tga
    public final void N(String str, b bVar) {
        str.getClass();
        bVar.getClass();
        if (!this.j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
            String str2 = this.i;
            if (str2 == null) {
                Intrinsics.i("tag");
                throw null;
            }
            linkedHashMap.put(str2, bVar);
            this.j = true;
            return;
        }
        if (bVar instanceof d) {
            this.i = ((d) bVar).c();
            this.j = false;
        } else {
            if (bVar instanceof c) {
                throw yfa.b(lga.b);
            }
            if (bVar instanceof a) {
                throw yfa.b(dfa.b);
            }
            zzl.b();
        }
    }
}
