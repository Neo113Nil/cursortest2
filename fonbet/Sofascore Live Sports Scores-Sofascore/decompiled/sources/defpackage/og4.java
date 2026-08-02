package defpackage;

import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.c;
import com.ironsource.Va;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class og4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ og4(wnl wnlVar, long j, boolean z) {
        this.a = 2;
        this.c = wnlVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                c cVar = (c) obj;
                Calendar d = lhk.d();
                Calendar e = lhk.e(null);
                e.setTimeInMillis(j);
                cVar.a.setError(String.format(cVar.e, (d.get(1) == e.get(1) ? lhk.b("MMMd", Locale.getDefault()).format(new Date(j)) : l6g.H(j)).replace(' ', (char) 160)));
                vhh vhhVar = (vhh) cVar;
                SingleDateSelector singleDateSelector = vhhVar.k;
                vhhVar.j.getError();
                singleDateSelector.getClass();
                vhhVar.i.a();
                break;
            case 1:
                Va.a((Va) obj, j);
                break;
            default:
                if (((wnl) obj).b.remove(Long.valueOf(j)) != null) {
                    pvd.j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ og4(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
