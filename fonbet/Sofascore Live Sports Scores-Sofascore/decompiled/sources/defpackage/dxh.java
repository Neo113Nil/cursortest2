package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class dxh<T> {

    @NotNull
    public static final cxh Companion = new cxh();
    public static final joa[] c = {ypa.a(ysa.b, new wth(24)), null};
    public static final uye d;
    public final List a;
    public final List b;

    static {
        uye uyeVar = new uye("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        uyeVar.j("keys", false);
        uyeVar.j("values", false);
        d = uyeVar;
    }

    public /* synthetic */ dxh(int i, List list, List list2) {
        if (3 != (i & 3)) {
            oea.z(i, 3, d);
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public dxh(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }
}
