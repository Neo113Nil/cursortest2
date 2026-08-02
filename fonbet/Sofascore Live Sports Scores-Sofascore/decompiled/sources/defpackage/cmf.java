package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cmf extends g7 implements Filterable, vqf {
    public final amf l;
    public final LayoutInflater m;
    public final ArrayList n;
    public ArrayList o;
    public final String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmf(Context context, amf amfVar) {
        super(context);
        context.getClass();
        amfVar.getClass();
        this.l = amfVar;
        this.m = LayoutInflater.from(context);
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = "   |   ";
    }

    @Override // defpackage.vqf
    public final Object f(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Number) next).intValue() <= i) {
                arrayList.add(next);
            }
        }
        Integer num = (Integer) CollectionsKt.k0(arrayList);
        if (num == null) {
            return null;
        }
        Object obj = this.i.get(num.intValue());
        if (obj instanceof ylf) {
            return (ylf) obj;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new zk2(this, 7);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        wlf wlfVar = (wlf) obj;
        if (!(wlfVar instanceof xlf)) {
            return false;
        }
        if (bmf.a[this.l.ordinal()] == 1) {
            return true;
        }
        return Intrinsics.c(((xlf) wlfVar).a.getTeam() != null ? Boolean.valueOf(!r0.getDisabled()) : null, Boolean.TRUE);
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        vlf vlfVar;
        wlf wlfVar = (wlf) obj;
        wlfVar.getClass();
        if (wlfVar instanceof xlf) {
            vlfVar = this.l.b;
        } else if (wlfVar instanceof zlf) {
            vlfVar = vlf.h;
        } else {
            if (!(wlfVar instanceof ylf)) {
                zzl.b();
                return 0;
            }
            vlfVar = vlf.i;
        }
        return vlfVar.ordinal();
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        vlf vlfVar = vlf.a;
        LayoutInflater layoutInflater = this.m;
        if (i == 0) {
            return new j8i(bu1.d(layoutInflater, viewGroup));
        }
        if (i == 1) {
            return new q6j(bu1.d(layoutInflater, viewGroup));
        }
        if (i == 2) {
            return new wh(zxd.a(layoutInflater, viewGroup));
        }
        if (i == 3) {
            return new m9g(zxd.a(layoutInflater, viewGroup), 2);
        }
        if (i == 4) {
            return new m9g(zxd.a(layoutInflater, viewGroup), 1);
        }
        if (i == 5) {
            return new m9g(zxd.a(layoutInflater, viewGroup), 0);
        }
        if (i == 6) {
            return new hjk(bu1.d(layoutInflater, viewGroup));
        }
        if (i != 7) {
            if (i == 8) {
                return new ja9(fmf.a(layoutInflater, viewGroup));
            }
            ilg.c();
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.ranking_row_last_updated_layout, viewGroup, false);
        if (inflate != null) {
            return new ja9(new u22((TextView) inflate, 7), (byte) 0);
        }
        yhk.s("rootView");
        return null;
    }
}
