package androidx.work.impl.background.systemalarm;

import Q2.AbstractC1508t;
import Q2.InterfaceC1491b;
import X2.p;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import androidx.work.impl.constraints.i;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f23802f = AbstractC1508t.i("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f23803a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1491b f23804b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23805c;

    /* renamed from: d, reason: collision with root package name */
    public final d f23806d;

    /* renamed from: e, reason: collision with root package name */
    public final i f23807e;

    public b(Context context, InterfaceC1491b interfaceC1491b, int i10, d dVar) {
        this.f23803a = context;
        this.f23804b = interfaceC1491b;
        this.f23805c = i10;
        this.f23806d = dVar;
        this.f23807e = new i(dVar.g().r());
    }

    public void a() {
        List<WorkSpec> f10 = this.f23806d.g().s().l().f();
        ConstraintProxy.a(this.f23803a, f10);
        ArrayList<WorkSpec> arrayList = new ArrayList(f10.size());
        long a10 = this.f23804b.a();
        for (WorkSpec workSpec : f10) {
            if (a10 >= workSpec.c() && (!workSpec.l() || this.f23807e.a(workSpec))) {
                arrayList.add(workSpec);
            }
        }
        for (WorkSpec workSpec2 : arrayList) {
            String str = workSpec2.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String;
            Intent b10 = a.b(this.f23803a, p.a(workSpec2));
            AbstractC1508t.e().a(f23802f, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f23806d.f().a().execute(new d.b(this.f23806d, b10, this.f23805c));
        }
    }
}
