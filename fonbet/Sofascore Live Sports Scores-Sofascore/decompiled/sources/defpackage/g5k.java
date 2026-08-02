package defpackage;

import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g5k {
    public List a;
    public List b;
    public String c;
    public Function1 d;
    public lrh e;
    public kv1 f = uxf.o;
    public tc3 g;
    public Pair h;
    public Function1 i;
    public boolean j;
    public boolean k;
    public boolean l;
    public d5k m;
    public final /* synthetic */ TypeHeaderView n;

    public g5k(TypeHeaderView typeHeaderView) {
        this.n = typeHeaderView;
        Boolean bool = Boolean.FALSE;
        this.h = new Pair(bool, bool);
    }

    public final void a() {
        this.i = new crj(24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r0 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        Collection W;
        String str;
        Function1 function1 = this.d;
        TypeHeaderView typeHeaderView = this.n;
        typeHeaderView.g = function1;
        lrh lrhVar = this.e;
        if (lrhVar == null) {
            lrhVar = hrh.m;
        }
        typeHeaderView.h = lrhVar;
        typeHeaderView.i = this.f;
        typeHeaderView.o = this.g;
        typeHeaderView.j = this.h;
        typeHeaderView.setTriggerOnInitialization(this.j);
        typeHeaderView.setShowDivider(this.k);
        typeHeaderView.m = this.l;
        typeHeaderView.n = this.m;
        String str2 = this.c;
        if (str2 != null) {
            typeHeaderView.setSelectedItem(str2);
        }
        List<String> list = this.a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            for (String str3 : list) {
                Function1 function12 = this.d;
                arrayList.add(new vt2(str3, (function12 == null || (str = (String) function12.invoke(str3)) == null) ? str3 : str, false, null, null, null, null, 252));
            }
            W = l6g.W(arrayList);
        }
        List list2 = this.b;
        W = list2 != null ? l6g.W(list2) : rlh.b;
        Function1 function13 = this.i;
        if (function13 == null) {
            function13 = new crj(25);
        }
        typeHeaderView.k = function13;
        if (W.isEmpty()) {
            return;
        }
        TypeHeaderView.x(typeHeaderView, W, null, 6);
    }
}
