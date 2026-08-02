package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qob implements hg2 {
    public final Context a;
    public final SimpleDateFormat b;
    public final SimpleDateFormat c;
    public Map d;
    public Set e;
    public boolean f;
    public fg2 g;
    public fg2 h;
    public Integer i;
    public Long j;

    public qob(Context context) {
        this.a = context;
        Locale locale = Locale.US;
        this.b = new SimpleDateFormat("yyyy-MM", locale);
        this.c = new SimpleDateFormat("yyyy-MM-dd", locale);
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.d = lm5Var;
        this.e = rm5.a;
    }

    @Override // defpackage.hg2
    public final boolean a(fg2 fg2Var) {
        Object obj;
        List list;
        Map map = this.d;
        fg2Var.b(fg2Var.c());
        String format = this.b.format(fg2Var.c().getTime());
        format.getClass();
        List list2 = (List) map.get(format);
        if (list2 == null) {
            return false;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = ((pqb) obj).a;
            fg2Var.b(fg2Var.c());
            String format2 = this.c.format(fg2Var.c().getTime());
            format2.getClass();
            if (Intrinsics.c(str, format2)) {
                break;
            }
        }
        pqb pqbVar = (pqb) obj;
        if (pqbVar == null || (list = pqbVar.b) == null) {
            return false;
        }
        return !list.isEmpty();
    }

    @Override // defpackage.hg2
    public final Long b() {
        return this.j;
    }

    @Override // defpackage.hg2
    public final int c() {
        return R.string.calendar_favorites_explainer;
    }

    @Override // defpackage.hg2
    public final fg2 d() {
        return this.h;
    }

    @Override // defpackage.hg2
    public final boolean f() {
        return false;
    }

    @Override // defpackage.hg2
    public final Integer g() {
        return this.i;
    }

    @Override // defpackage.hg2
    public final boolean h(fg2 fg2Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        return new fg2(calendar).equals(fg2Var);
    }

    @Override // defpackage.hg2
    public final boolean i() {
        return false;
    }

    @Override // defpackage.hg2
    public final boolean j(fg2 fg2Var) {
        return new fg2(ke0.a).equals(fg2Var);
    }

    @Override // defpackage.hg2
    public final int k() {
        return ug5.p(this.a);
    }

    @Override // defpackage.hg2
    public final boolean l(fg2 fg2Var) {
        return this.e.contains(fg2Var);
    }

    @Override // defpackage.hg2
    public final fg2 m() {
        return this.g;
    }

    @Override // defpackage.hg2
    public final boolean n() {
        return true;
    }

    @Override // defpackage.hg2
    public final fg2 o() {
        return new fg2(ke0.a);
    }

    @Override // defpackage.hg2
    public final boolean p() {
        return this.f;
    }

    @Override // defpackage.hg2
    public final void q(fg2 fg2Var) {
        ke0.a.set(fg2Var.a, fg2Var.b, fg2Var.c);
    }

    @Override // defpackage.hg2
    public final ArrayList r(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!this.e.contains((fg2) obj)) {
                arrayList.add(obj);
            }
        }
        this.e = CollectionsKt.W0(list);
        return arrayList;
    }
}
