package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ic3 {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final mqi f;
    public final mqi g;

    public ic3(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final int i = 0;
        this.f = ypa.b(new Function0(this) { // from class: fc3
            public final /* synthetic */ ic3 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                ic3 ic3Var = this.b;
                switch (i2) {
                    case 0:
                        List list6 = ic3Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            o13.v((List) ((Function0) list6.get(i3)).invoke(), arrayList);
                            i3++;
                        }
                        ic3Var.d = km5.a;
                        return arrayList;
                    default:
                        List list7 = ic3Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            o13.v((List) ((Function0) list7.get(i3)).invoke(), arrayList2);
                            i3++;
                        }
                        ic3Var.e = km5.a;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.g = ypa.b(new Function0(this) { // from class: fc3
            public final /* synthetic */ ic3 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                ic3 ic3Var = this.b;
                switch (i22) {
                    case 0:
                        List list6 = ic3Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            o13.v((List) ((Function0) list6.get(i3)).invoke(), arrayList);
                            i3++;
                        }
                        ic3Var.d = km5.a;
                        return arrayList;
                    default:
                        List list7 = ic3Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            o13.v((List) ((Function0) list7.get(i3)).invoke(), arrayList2);
                            i3++;
                        }
                        ic3Var.e = km5.a;
                        return arrayList2;
                }
            }
        });
    }
}
