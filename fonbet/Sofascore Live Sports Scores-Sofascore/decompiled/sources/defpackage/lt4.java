package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.sofascore.results.base.BaseActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class lt4 implements bu4, Continuation, bl3, kpd {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lt4(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    @Override // defpackage.kpd
    public x9l L(View view, x9l x9lVar) {
        return dsl.a(this.a, (bal) this.b, (Window) this.c, view, x9lVar);
    }

    @Override // defpackage.bu4
    public vvf c(int i, nsj nsjVar, int[] iArr) {
        hu4 hu4Var = (hu4) this.b;
        vt4 vt4Var = (vt4) this.c;
        hu4Var.getClass();
        nt4 nt4Var = new nt4(hu4Var);
        zu9 s = hv9.s();
        for (int i2 = 0; i2 < nsjVar.a; i2++) {
            s.c(new ot4(i, nsjVar, i2, vt4Var, iArr[i2], this.a, nt4Var));
        }
        return s.g();
    }

    @Override // defpackage.bl3
    public void g() {
        zzj zzjVar = (zzj) this.b;
        Activity activity = (Activity) this.c;
        if (zzjVar.c.c.get() != null) {
            zic.D(activity, this.a);
            return;
        }
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null) {
            baseActivity.z().c(duf.a.getOrCreateKotlinClass(u0f.class));
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Integer) task.getResult()).intValue() != 402 ? task : f4a.a((Context) this.b, (Intent) this.c, this.a).continueWith(new hg0(1), new hg6(4));
    }

    public /* synthetic */ lt4(boolean z, bal balVar, Window window) {
        this.a = z;
        this.b = balVar;
        this.c = window;
    }
}
