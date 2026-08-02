package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pig implements nig {
    public final String a;
    public final yia b;
    public final Function1 c;
    public final ejg d;
    public final fig e;
    public final q1f f;
    public final ct8 g;
    public final Function2 h;
    public List i;
    public sig j;
    public String k;
    public String l;
    public final View m;
    public final mqi n;
    public mig o;

    public pig(Context context, yia yiaVar, tcg tcgVar, Function1 function1) {
        ejg p = ejg.p();
        fig c = fig.c(context);
        q1f q1fVar = q1f.f;
        vcg vcgVar = new vcg(3);
        eee eeeVar = new eee((byte) 0, 28);
        context.getClass();
        p.getClass();
        this.a = "8.6.1";
        this.b = yiaVar;
        this.c = function1;
        this.d = p;
        this.e = c;
        this.f = q1fVar;
        this.g = vcgVar;
        this.h = eeeVar;
        this.l = "https://whythisad.smartadserver.com/?data=[metadata]";
        this.m = tcgVar.getView();
        this.n = ypa.b(new k9f(context, 5));
        ArrayList arrayList = new ArrayList();
        yi3 yi3Var = iig.a;
        yi3Var.getClass();
        for (Map.Entry entry : yi3Var.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            int intValue = ((Number) key).intValue();
            Object value = entry.getValue();
            value.getClass();
            arrayList.add(new yig(intValue, (String) value));
        }
        this.i = CollectionsKt.S0(CollectionsKt.H0(arrayList, new laf(10)));
        tcgVar.setClickListener(new cne(this, 19));
    }

    public final void a(Context context) {
        qig qigVar = (qig) this.g.invoke(context, this.i, this.a);
        qigVar.a = new cqa(this);
        AlertDialog alertDialog = qigVar.c;
        alertDialog.show();
        Button button = alertDialog.getButton(-1);
        if (button != null) {
            button.setEnabled(false);
        }
    }

    public final void b() {
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a.f), null, null, new oig(this, null, 0), 3);
    }

    public final void c(gig gigVar) {
        int applyDimension = (int) TypedValue.applyDimension(1, gigVar.a, this.m.getContext().getResources().getDisplayMetrics());
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a.f), null, null, new w9g(this, applyDimension, null, 7), 3);
    }

    public final void d() {
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a.f), null, null, new oig(this, null, 1), 3);
    }
}
