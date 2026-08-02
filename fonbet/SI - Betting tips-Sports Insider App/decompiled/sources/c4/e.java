package c4;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f3582a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3583b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3584c;

    /* renamed from: d, reason: collision with root package name */
    public List f3585d;

    /* renamed from: e, reason: collision with root package name */
    public List f3586e;

    /* renamed from: f, reason: collision with root package name */
    public final gf.t f3587f;

    /* renamed from: g, reason: collision with root package name */
    public final gf.t f3588g;

    public e(List list, List list2, List list3, List list4, List list5) {
        this.f3582a = list;
        this.f3583b = list2;
        this.f3584c = list3;
        this.f3585d = list4;
        this.f3586e = list5;
        final int i5 = 0;
        this.f3587f = gf.k.b(new Function0(this) { // from class: c4.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f3568b;

            {
                this.f3568b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        e eVar = this.f3568b;
                        List list6 = eVar.f3585d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            kotlin.collections.z.n((List) ((Function0) list6.get(i10)).invoke(), arrayList);
                        }
                        eVar.f3585d = e0.f19204a;
                        return arrayList;
                    default:
                        e eVar2 = this.f3568b;
                        List list7 = eVar2.f3586e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            kotlin.collections.z.n((List) ((Function0) list7.get(i11)).invoke(), arrayList2);
                        }
                        eVar2.f3586e = e0.f19204a;
                        return arrayList2;
                }
            }
        });
        final int i10 = 1;
        this.f3588g = gf.k.b(new Function0(this) { // from class: c4.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f3568b;

            {
                this.f3568b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        e eVar = this.f3568b;
                        List list6 = eVar.f3585d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i102 = 0; i102 < size; i102++) {
                            kotlin.collections.z.n((List) ((Function0) list6.get(i102)).invoke(), arrayList);
                        }
                        eVar.f3585d = e0.f19204a;
                        return arrayList;
                    default:
                        e eVar2 = this.f3568b;
                        List list7 = eVar2.f3586e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            kotlin.collections.z.n((List) ((Function0) list7.get(i11)).invoke(), arrayList2);
                        }
                        eVar2.f3586e = e0.f19204a;
                        return arrayList2;
                }
            }
        });
    }
}
