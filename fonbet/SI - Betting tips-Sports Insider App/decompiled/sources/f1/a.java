package f1;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.d2;
import c0.h0;
import cd.q;
import com.sports.insider.data.entity.live.LivePrediction;
import com.sports.insider.data.repository.room.live.LiveTable;
import com.sports.insider.data.repository.room.metric.EventsTable;
import com.sports.insider.data.repository.room.metric.PushMetricsTable;
import com.sports.insider.data.repository.room.news.NewsTable;
import e3.k0;
import eg.z;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import k2.x;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import la.c0;
import la.c1;
import la.e1;
import la.g0;
import la.j1;
import la.m;
import la.m0;
import la.o;
import la.p;
import la.s0;
import la.t0;
import la.u0;
import la.w;
import pc.u;
import ve.s;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9306a;

    public /* synthetic */ a(int i5) {
        this.f9306a = i5;
    }

    private final Object a(Object obj) {
        hh.b it = (hh.b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(it.f10815f);
        sb2.append('=');
        sb2.append(it.f10816g);
        return sb2.toString();
    }

    private final Object b(Object obj) {
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0("SELECT COUNT(id) FROM news_table");
        try {
            Integer num = null;
            if (r02.n0() && !r02.isNull(0)) {
                num = Integer.valueOf((int) r02.getLong(0));
            }
            return num;
        } finally {
            r02.close();
        }
    }

    private final Object c(Object obj) {
        s2.a _connection = (s2.a) obj;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        s2.c r02 = _connection.r0(" SELECT * FROM news_table ORDER BY dateTime DESC ");
        try {
            int r5 = x.r(r02, "id");
            int r6 = x.r(r02, NewsTable.DATE_TIME_COLUMN);
            int r10 = x.r(r02, "title");
            int r11 = x.r(r02, NewsTable.PICTURE_COLUMN);
            int r12 = x.r(r02, NewsTable.TEXT_COLUMN);
            ArrayList arrayList = new ArrayList();
            while (r02.n0()) {
                arrayList.add(new ia.a((int) r02.getLong(r5), (int) r02.getLong(r6), r02.isNull(r10) ? null : r02.V(r10), r02.isNull(r11) ? null : r02.V(r11), r02.isNull(r12) ? null : r02.V(r12)));
            }
            return arrayList;
        } finally {
            r02.close();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        int i5 = 0;
        switch (this.f9306a) {
            case 0:
                Intrinsics.checkNotNullParameter((Context) obj, "it");
                return e0.f19204a;
            case 1:
                ei.a module = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module, "$this$module");
                c1.k kVar = new c1.k(21);
                gi.a aVar = hi.a.f10827c;
                ai.b bVar = ai.b.f188a;
                e0 e0Var = e0.f19204a;
                ai.a beanDefinition = new ai.a(aVar, Reflection.getOrCreateKotlinClass(ac.a.class), null, kVar, bVar, e0Var);
                Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
                ci.d factory = new ci.d(beanDefinition);
                module.a(factory);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory, "factory");
                ai.a beanDefinition2 = new ai.a(aVar, Reflection.getOrCreateKotlinClass(za.k.class), null, new c1.k(22), ai.b.f189b, e0Var);
                Intrinsics.checkNotNullParameter(beanDefinition2, "beanDefinition");
                ci.a factory2 = new ci.a(beanDefinition2);
                module.a(factory2);
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return Unit.f19194a;
            case 2:
                ei.a module2 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module2, "$this$module");
                fc.a aVar2 = new fc.a(3);
                gi.a aVar3 = hi.a.f10827c;
                ai.b bVar2 = ai.b.f188a;
                e0 e0Var2 = e0.f19204a;
                ai.a beanDefinition3 = new ai.a(aVar3, Reflection.getOrCreateKotlinClass(sb.j.class), null, aVar2, bVar2, e0Var2);
                Intrinsics.checkNotNullParameter(beanDefinition3, "beanDefinition");
                ci.d factory3 = new ci.d(beanDefinition3);
                module2.a(factory3);
                Intrinsics.checkNotNullParameter(module2, "module");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                fc.a aVar4 = new fc.a(4);
                ai.b bVar3 = ai.b.f189b;
                ai.a beanDefinition4 = new ai.a(aVar3, Reflection.getOrCreateKotlinClass(la.a.class), null, aVar4, bVar3, e0Var2);
                Intrinsics.checkNotNullParameter(beanDefinition4, "beanDefinition");
                ci.a factory4 = new ci.a(beanDefinition4);
                module2.a(factory4);
                Intrinsics.checkNotNullParameter(module2, "module");
                Intrinsics.checkNotNullParameter(factory4, "factory");
                ai.a beanDefinition5 = new ai.a(aVar3, Reflection.getOrCreateKotlinClass(la.g.class), null, new fc.a(5), bVar3, e0Var2);
                Intrinsics.checkNotNullParameter(beanDefinition5, "beanDefinition");
                ci.a factory5 = new ci.a(beanDefinition5);
                module2.a(factory5);
                Intrinsics.checkNotNullParameter(module2, "module");
                Intrinsics.checkNotNullParameter(factory5, "factory");
                ai.a beanDefinition6 = new ai.a(aVar3, Reflection.getOrCreateKotlinClass(m.class), null, new fc.a(6), bVar3, e0Var2);
                Intrinsics.checkNotNullParameter(beanDefinition6, "beanDefinition");
                ci.a factory6 = new ci.a(beanDefinition6);
                module2.a(factory6);
                Intrinsics.checkNotNullParameter(module2, "module");
                Intrinsics.checkNotNullParameter(factory6, "factory");
                ai.a beanDefinition7 = new ai.a(aVar3, Reflection.getOrCreateKotlinClass(db.a.class), null, new fc.a(7), bVar2, e0Var2);
                Intrinsics.checkNotNullParameter(beanDefinition7, "beanDefinition");
                ci.d factory7 = new ci.d(beanDefinition7);
                module2.a(factory7);
                Intrinsics.checkNotNullParameter(module2, "module");
                Intrinsics.checkNotNullParameter(factory7, "factory");
                ai.a beanDefinition8 = new ai.a(aVar3, Reflection.getOrCreateKotlinClass(la.b.class), null, new fc.a(8), bVar3, e0Var2);
                Intrinsics.checkNotNullParameter(beanDefinition8, "beanDefinition");
                ci.a factory8 = new ci.a(beanDefinition8);
                module2.a(factory8);
                Intrinsics.checkNotNullParameter(module2, "module");
                Intrinsics.checkNotNullParameter(factory8, "factory");
                return Unit.f19194a;
            case 3:
                ei.a module3 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module3, "$this$module");
                c1.k kVar2 = new c1.k(11);
                gi.a aVar5 = hi.a.f10827c;
                ai.b bVar4 = ai.b.f188a;
                e0 e0Var3 = e0.f19204a;
                ai.a beanDefinition9 = new ai.a(aVar5, Reflection.getOrCreateKotlinClass(ib.d.class), null, kVar2, bVar4, e0Var3);
                Intrinsics.checkNotNullParameter(beanDefinition9, "beanDefinition");
                ci.d factory9 = new ci.d(beanDefinition9);
                module3.a(factory9);
                Intrinsics.checkNotNullParameter(module3, "module");
                Intrinsics.checkNotNullParameter(factory9, "factory");
                ai.a beanDefinition10 = new ai.a(aVar5, Reflection.getOrCreateKotlinClass(c0.class), null, new c1.k(12), ai.b.f189b, e0Var3);
                Intrinsics.checkNotNullParameter(beanDefinition10, "beanDefinition");
                ci.a factory10 = new ci.a(beanDefinition10);
                module3.a(factory10);
                Intrinsics.checkNotNullParameter(module3, "module");
                Intrinsics.checkNotNullParameter(factory10, "factory");
                return Unit.f19194a;
            case 4:
                ei.a module4 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module4, "$this$module");
                fc.a aVar6 = new fc.a(22);
                gi.a aVar7 = hi.a.f10827c;
                ai.b bVar5 = ai.b.f188a;
                e0 e0Var4 = e0.f19204a;
                ai.a beanDefinition11 = new ai.a(aVar7, Reflection.getOrCreateKotlinClass(z.class), null, aVar6, bVar5, e0Var4);
                Intrinsics.checkNotNullParameter(beanDefinition11, "beanDefinition");
                ci.d factory11 = new ci.d(beanDefinition11);
                module4.a(factory11);
                Intrinsics.checkNotNullParameter(module4, "module");
                Intrinsics.checkNotNullParameter(factory11, "factory");
                ai.a beanDefinition12 = new ai.a(aVar7, Reflection.getOrCreateKotlinClass(ea.a.class), null, new fc.a(23), ai.b.f189b, e0Var4);
                Intrinsics.checkNotNullParameter(beanDefinition12, "beanDefinition");
                ci.a factory12 = new ci.a(beanDefinition12);
                module4.a(factory12);
                Intrinsics.checkNotNullParameter(module4, "module");
                Intrinsics.checkNotNullParameter(factory12, "factory");
                ai.a beanDefinition13 = new ai.a(aVar7, Reflection.getOrCreateKotlinClass(s.class), null, new fc.a(24), bVar5, e0Var4);
                Intrinsics.checkNotNullParameter(beanDefinition13, "beanDefinition");
                ci.d factory13 = new ci.d(beanDefinition13);
                module4.a(factory13);
                Intrinsics.checkNotNullParameter(module4, "module");
                Intrinsics.checkNotNullParameter(factory13, "factory");
                ai.a beanDefinition14 = new ai.a(aVar7, Reflection.getOrCreateKotlinClass(nc.g.class), null, new fc.a(25), bVar5, e0Var4);
                Intrinsics.checkNotNullParameter(beanDefinition14, "beanDefinition");
                ci.d factory14 = new ci.d(beanDefinition14);
                module4.a(factory14);
                module4.getClass();
                Intrinsics.checkNotNullParameter(factory14, "instanceFactory");
                module4.f9259b.add(factory14);
                Intrinsics.checkNotNullParameter(module4, "module");
                Intrinsics.checkNotNullParameter(factory14, "factory");
                return Unit.f19194a;
            case 5:
                ei.a module5 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module5, "$this$module");
                fc.a aVar8 = new fc.a(17);
                gi.a aVar9 = hi.a.f10827c;
                ai.b bVar6 = ai.b.f189b;
                e0 e0Var5 = e0.f19204a;
                ai.a beanDefinition15 = new ai.a(aVar9, Reflection.getOrCreateKotlinClass(dc.a.class), null, aVar8, bVar6, e0Var5);
                Intrinsics.checkNotNullParameter(beanDefinition15, "beanDefinition");
                ci.a factory15 = new ci.a(beanDefinition15);
                module5.a(factory15);
                Intrinsics.checkNotNullParameter(module5, "module");
                Intrinsics.checkNotNullParameter(factory15, "factory");
                ai.a beanDefinition16 = new ai.a(aVar9, Reflection.getOrCreateKotlinClass(za.f.class), null, new fc.a(18), bVar6, e0Var5);
                Intrinsics.checkNotNullParameter(beanDefinition16, "beanDefinition");
                ci.a factory16 = new ci.a(beanDefinition16);
                module5.a(factory16);
                Intrinsics.checkNotNullParameter(module5, "module");
                Intrinsics.checkNotNullParameter(factory16, "factory");
                ai.a beanDefinition17 = new ai.a(aVar9, Reflection.getOrCreateKotlinClass(zb.a.class), null, new fc.a(19), bVar6, e0Var5);
                Intrinsics.checkNotNullParameter(beanDefinition17, "beanDefinition");
                ci.a factory17 = new ci.a(beanDefinition17);
                module5.a(factory17);
                Intrinsics.checkNotNullParameter(module5, "module");
                Intrinsics.checkNotNullParameter(factory17, "factory");
                ai.a beanDefinition18 = new ai.a(aVar9, Reflection.getOrCreateKotlinClass(za.b.class), null, new fc.a(20), bVar6, e0Var5);
                Intrinsics.checkNotNullParameter(beanDefinition18, "beanDefinition");
                ci.a factory18 = new ci.a(beanDefinition18);
                module5.a(factory18);
                Intrinsics.checkNotNullParameter(module5, "module");
                Intrinsics.checkNotNullParameter(factory18, "factory");
                ai.a beanDefinition19 = new ai.a(aVar9, Reflection.getOrCreateKotlinClass(za.h.class), null, new fc.a(21), bVar6, e0Var5);
                Intrinsics.checkNotNullParameter(beanDefinition19, "beanDefinition");
                ci.a factory19 = new ci.a(beanDefinition19);
                module5.a(factory19);
                Intrinsics.checkNotNullParameter(module5, "module");
                Intrinsics.checkNotNullParameter(factory19, "factory");
                return Unit.f19194a;
            case 6:
                ei.a module6 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module6, "$this$module");
                c1.k kVar3 = new c1.k(23);
                gi.a aVar10 = hi.a.f10827c;
                ai.b bVar7 = ai.b.f189b;
                e0 e0Var6 = e0.f19204a;
                ai.a beanDefinition20 = new ai.a(aVar10, Reflection.getOrCreateKotlinClass(c1.class), null, kVar3, bVar7, e0Var6);
                Intrinsics.checkNotNullParameter(beanDefinition20, "beanDefinition");
                ci.a factory20 = new ci.a(beanDefinition20);
                module6.a(factory20);
                Intrinsics.checkNotNullParameter(module6, "module");
                Intrinsics.checkNotNullParameter(factory20, "factory");
                ai.a beanDefinition21 = new ai.a(aVar10, Reflection.getOrCreateKotlinClass(la.d.class), null, new c1.k(24), bVar7, e0Var6);
                Intrinsics.checkNotNullParameter(beanDefinition21, "beanDefinition");
                ci.a factory21 = new ci.a(beanDefinition21);
                module6.a(factory21);
                Intrinsics.checkNotNullParameter(module6, "module");
                Intrinsics.checkNotNullParameter(factory21, "factory");
                ai.a beanDefinition22 = new ai.a(aVar10, Reflection.getOrCreateKotlinClass(m0.class), null, new c1.k(25), bVar7, e0Var6);
                Intrinsics.checkNotNullParameter(beanDefinition22, "beanDefinition");
                ci.a factory22 = new ci.a(beanDefinition22);
                module6.a(factory22);
                Intrinsics.checkNotNullParameter(module6, "module");
                Intrinsics.checkNotNullParameter(factory22, "factory");
                ai.a beanDefinition23 = new ai.a(aVar10, Reflection.getOrCreateKotlinClass(s0.class), null, new c1.k(26), bVar7, e0Var6);
                Intrinsics.checkNotNullParameter(beanDefinition23, "beanDefinition");
                ci.a factory23 = new ci.a(beanDefinition23);
                module6.a(factory23);
                Intrinsics.checkNotNullParameter(module6, "module");
                Intrinsics.checkNotNullParameter(factory23, "factory");
                ai.a beanDefinition24 = new ai.a(aVar10, Reflection.getOrCreateKotlinClass(g0.class), null, new c1.k(27), bVar7, e0Var6);
                Intrinsics.checkNotNullParameter(beanDefinition24, "beanDefinition");
                ci.a factory24 = new ci.a(beanDefinition24);
                module6.a(factory24);
                Intrinsics.checkNotNullParameter(module6, "module");
                Intrinsics.checkNotNullParameter(factory24, "factory");
                ai.a beanDefinition25 = new ai.a(aVar10, Reflection.getOrCreateKotlinClass(e1.class), null, new c1.k(28), bVar7, e0Var6);
                Intrinsics.checkNotNullParameter(beanDefinition25, "beanDefinition");
                ci.a factory25 = new ci.a(beanDefinition25);
                module6.a(factory25);
                Intrinsics.checkNotNullParameter(module6, "module");
                Intrinsics.checkNotNullParameter(factory25, "factory");
                ai.a beanDefinition26 = new ai.a(aVar10, Reflection.getOrCreateKotlinClass(la.h.class), null, new c1.k(29), bVar7, e0Var6);
                Intrinsics.checkNotNullParameter(beanDefinition26, "beanDefinition");
                ci.a factory26 = new ci.a(beanDefinition26);
                module6.a(factory26);
                Intrinsics.checkNotNullParameter(module6, "module");
                Intrinsics.checkNotNullParameter(factory26, "factory");
                ai.a beanDefinition27 = new ai.a(aVar10, Reflection.getOrCreateKotlinClass(t0.class), null, new fc.a(i5), bVar7, e0Var6);
                Intrinsics.checkNotNullParameter(beanDefinition27, "beanDefinition");
                ci.a factory27 = new ci.a(beanDefinition27);
                module6.a(factory27);
                Intrinsics.checkNotNullParameter(module6, "module");
                Intrinsics.checkNotNullParameter(factory27, "factory");
                ai.a beanDefinition28 = new ai.a(aVar10, Reflection.getOrCreateKotlinClass(u0.class), null, new fc.a(1), bVar7, e0Var6);
                Intrinsics.checkNotNullParameter(beanDefinition28, "beanDefinition");
                ci.a factory28 = new ci.a(beanDefinition28);
                module6.a(factory28);
                Intrinsics.checkNotNullParameter(module6, "module");
                Intrinsics.checkNotNullParameter(factory28, "factory");
                ai.a beanDefinition29 = new ai.a(aVar10, Reflection.getOrCreateKotlinClass(eb.m.class), null, new fc.a(2), ai.b.f188a, e0Var6);
                Intrinsics.checkNotNullParameter(beanDefinition29, "beanDefinition");
                ci.d factory29 = new ci.d(beanDefinition29);
                module6.a(factory29);
                Intrinsics.checkNotNullParameter(module6, "module");
                Intrinsics.checkNotNullParameter(factory29, "factory");
                return Unit.f19194a;
            case 7:
                ei.a module7 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module7, "$this$module");
                gi.a v5 = a.a.v("user");
                fc.a aVar11 = new fc.a(12);
                gi.a aVar12 = hi.a.f10827c;
                ai.b bVar8 = ai.b.f188a;
                e0 e0Var7 = e0.f19204a;
                ai.a beanDefinition30 = new ai.a(aVar12, Reflection.getOrCreateKotlinClass(SharedPreferences.class), v5, aVar11, bVar8, e0Var7);
                Intrinsics.checkNotNullParameter(beanDefinition30, "beanDefinition");
                ci.d factory30 = new ci.d(beanDefinition30);
                module7.a(factory30);
                Intrinsics.checkNotNullParameter(module7, "module");
                Intrinsics.checkNotNullParameter(factory30, "factory");
                ai.a beanDefinition31 = new ai.a(aVar12, Reflection.getOrCreateKotlinClass(SharedPreferences.class), a.a.v("settings"), new fc.a(13), bVar8, e0Var7);
                Intrinsics.checkNotNullParameter(beanDefinition31, "beanDefinition");
                ci.d factory31 = new ci.d(beanDefinition31);
                module7.a(factory31);
                Intrinsics.checkNotNullParameter(module7, "module");
                Intrinsics.checkNotNullParameter(factory31, "factory");
                ai.a beanDefinition32 = new ai.a(aVar12, Reflection.getOrCreateKotlinClass(fa.a.class), null, new fc.a(14), bVar8, e0Var7);
                Intrinsics.checkNotNullParameter(beanDefinition32, "beanDefinition");
                ci.d factory32 = new ci.d(beanDefinition32);
                module7.a(factory32);
                Intrinsics.checkNotNullParameter(module7, "module");
                Intrinsics.checkNotNullParameter(factory32, "factory");
                ai.a beanDefinition33 = new ai.a(aVar12, Reflection.getOrCreateKotlinClass(id.e.class), null, new fc.a(15), bVar8, e0Var7);
                Intrinsics.checkNotNullParameter(beanDefinition33, "beanDefinition");
                ci.d factory33 = new ci.d(beanDefinition33);
                module7.a(factory33);
                Intrinsics.checkNotNullParameter(module7, "module");
                Intrinsics.checkNotNullParameter(factory33, "factory");
                ai.a beanDefinition34 = new ai.a(aVar12, Reflection.getOrCreateKotlinClass(q.class), null, new fc.a(16), bVar8, e0Var7);
                Intrinsics.checkNotNullParameter(beanDefinition34, "beanDefinition");
                ci.d factory34 = new ci.d(beanDefinition34);
                module7.a(factory34);
                Intrinsics.checkNotNullParameter(module7, "module");
                Intrinsics.checkNotNullParameter(factory34, "factory");
                return Unit.f19194a;
            case 8:
                ei.a module8 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module8, "$this$module");
                c1.k kVar4 = new c1.k(9);
                gi.a aVar13 = hi.a.f10827c;
                ai.b bVar9 = ai.b.f189b;
                e0 e0Var8 = e0.f19204a;
                ai.a beanDefinition35 = new ai.a(aVar13, Reflection.getOrCreateKotlinClass(bc.a.class), null, kVar4, bVar9, e0Var8);
                Intrinsics.checkNotNullParameter(beanDefinition35, "beanDefinition");
                ci.a factory35 = new ci.a(beanDefinition35);
                module8.a(factory35);
                Intrinsics.checkNotNullParameter(module8, "module");
                Intrinsics.checkNotNullParameter(factory35, "factory");
                ai.a beanDefinition36 = new ai.a(aVar13, Reflection.getOrCreateKotlinClass(za.e.class), null, new c1.k(10), bVar9, e0Var8);
                Intrinsics.checkNotNullParameter(beanDefinition36, "beanDefinition");
                ci.a factory36 = new ci.a(beanDefinition36);
                module8.a(factory36);
                Intrinsics.checkNotNullParameter(module8, "module");
                Intrinsics.checkNotNullParameter(factory36, "factory");
                return Unit.f19194a;
            case 9:
                ei.a module9 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module9, "$this$module");
                c1.k kVar5 = new c1.k(16);
                gi.a aVar14 = hi.a.f10827c;
                ai.b bVar10 = ai.b.f188a;
                e0 e0Var9 = e0.f19204a;
                ai.a beanDefinition37 = new ai.a(aVar14, Reflection.getOrCreateKotlinClass(yb.i.class), null, kVar5, bVar10, e0Var9);
                Intrinsics.checkNotNullParameter(beanDefinition37, "beanDefinition");
                ci.d factory37 = new ci.d(beanDefinition37);
                module9.a(factory37);
                Intrinsics.checkNotNullParameter(module9, "module");
                Intrinsics.checkNotNullParameter(factory37, "factory");
                ai.a beanDefinition38 = new ai.a(aVar14, Reflection.getOrCreateKotlinClass(u.class), null, new c1.k(17), bVar10, e0Var9);
                Intrinsics.checkNotNullParameter(beanDefinition38, "beanDefinition");
                ci.d factory38 = new ci.d(beanDefinition38);
                module9.a(factory38);
                Intrinsics.checkNotNullParameter(module9, "module");
                Intrinsics.checkNotNullParameter(factory38, "factory");
                c1.k kVar6 = new c1.k(18);
                ai.b bVar11 = ai.b.f189b;
                ai.a beanDefinition39 = new ai.a(aVar14, Reflection.getOrCreateKotlinClass(k0.class), null, kVar6, bVar11, e0Var9);
                Intrinsics.checkNotNullParameter(beanDefinition39, "beanDefinition");
                ci.a factory39 = new ci.a(beanDefinition39);
                module9.a(factory39);
                Intrinsics.checkNotNullParameter(module9, "module");
                Intrinsics.checkNotNullParameter(factory39, "factory");
                ai.a beanDefinition40 = new ai.a(aVar14, Reflection.getOrCreateKotlinClass(NotificationManager.class), null, new c1.k(19), bVar11, e0Var9);
                Intrinsics.checkNotNullParameter(beanDefinition40, "beanDefinition");
                ci.a factory40 = new ci.a(beanDefinition40);
                module9.a(factory40);
                Intrinsics.checkNotNullParameter(module9, "module");
                Intrinsics.checkNotNullParameter(factory40, "factory");
                ai.a beanDefinition41 = new ai.a(aVar14, Reflection.getOrCreateKotlinClass(h0.class), null, new c1.k(20), bVar11, e0Var9);
                Intrinsics.checkNotNullParameter(beanDefinition41, "beanDefinition");
                ci.a factory41 = new ci.a(beanDefinition41);
                module9.a(factory41);
                Intrinsics.checkNotNullParameter(module9, "module");
                Intrinsics.checkNotNullParameter(factory41, "factory");
                return Unit.f19194a;
            case 10:
                ei.a module10 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module10, "$this$module");
                c1.k kVar7 = new c1.k(13);
                gi.a aVar15 = hi.a.f10827c;
                ai.b bVar12 = ai.b.f188a;
                e0 e0Var10 = e0.f19204a;
                ai.a beanDefinition42 = new ai.a(aVar15, Reflection.getOrCreateKotlinClass(gc.c.class), null, kVar7, bVar12, e0Var10);
                Intrinsics.checkNotNullParameter(beanDefinition42, "beanDefinition");
                ci.d factory42 = new ci.d(beanDefinition42);
                module10.a(factory42);
                Intrinsics.checkNotNullParameter(module10, "module");
                Intrinsics.checkNotNullParameter(factory42, "factory");
                ai.a beanDefinition43 = new ai.a(aVar15, Reflection.getOrCreateKotlinClass(gc.a.class), null, new c1.k(14), ai.b.f189b, e0Var10);
                Intrinsics.checkNotNullParameter(beanDefinition43, "beanDefinition");
                ci.a factory43 = new ci.a(beanDefinition43);
                module10.a(factory43);
                Intrinsics.checkNotNullParameter(module10, "module");
                Intrinsics.checkNotNullParameter(factory43, "factory");
                ai.a beanDefinition44 = new ai.a(aVar15, Reflection.getOrCreateKotlinClass(ea.e.class), null, new c1.k(15), bVar12, e0Var10);
                Intrinsics.checkNotNullParameter(beanDefinition44, "beanDefinition");
                ci.d factory44 = new ci.d(beanDefinition44);
                module10.a(factory44);
                Intrinsics.checkNotNullParameter(module10, "module");
                Intrinsics.checkNotNullParameter(factory44, "factory");
                return Unit.f19194a;
            case 11:
                ei.a module11 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module11, "$this$module");
                c1.k kVar8 = new c1.k(7);
                gi.a aVar16 = hi.a.f10827c;
                ai.b bVar13 = ai.b.f188a;
                e0 e0Var11 = e0.f19204a;
                ai.a beanDefinition45 = new ai.a(aVar16, Reflection.getOrCreateKotlinClass(hb.g.class), null, kVar8, bVar13, e0Var11);
                Intrinsics.checkNotNullParameter(beanDefinition45, "beanDefinition");
                ci.d factory45 = new ci.d(beanDefinition45);
                module11.a(factory45);
                Intrinsics.checkNotNullParameter(module11, "module");
                Intrinsics.checkNotNullParameter(factory45, "factory");
                ai.a beanDefinition46 = new ai.a(aVar16, Reflection.getOrCreateKotlinClass(w.class), null, new c1.k(8), ai.b.f189b, e0Var11);
                Intrinsics.checkNotNullParameter(beanDefinition46, "beanDefinition");
                ci.a factory46 = new ci.a(beanDefinition46);
                module11.a(factory46);
                Intrinsics.checkNotNullParameter(module11, "module");
                Intrinsics.checkNotNullParameter(factory46, "factory");
                return Unit.f19194a;
            case 12:
                ei.a module12 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module12, "$this$module");
                fc.a aVar17 = new fc.a(9);
                gi.a aVar18 = hi.a.f10827c;
                ai.b bVar14 = ai.b.f188a;
                e0 e0Var12 = e0.f19204a;
                ai.a beanDefinition47 = new ai.a(aVar18, Reflection.getOrCreateKotlinClass(pb.e.class), null, aVar17, bVar14, e0Var12);
                Intrinsics.checkNotNullParameter(beanDefinition47, "beanDefinition");
                ci.d factory47 = new ci.d(beanDefinition47);
                module12.a(factory47);
                Intrinsics.checkNotNullParameter(module12, "module");
                Intrinsics.checkNotNullParameter(factory47, "factory");
                fc.a aVar19 = new fc.a(10);
                ai.b bVar15 = ai.b.f189b;
                ai.a beanDefinition48 = new ai.a(aVar18, Reflection.getOrCreateKotlinClass(o.class), null, aVar19, bVar15, e0Var12);
                Intrinsics.checkNotNullParameter(beanDefinition48, "beanDefinition");
                ci.a factory48 = new ci.a(beanDefinition48);
                module12.a(factory48);
                Intrinsics.checkNotNullParameter(module12, "module");
                Intrinsics.checkNotNullParameter(factory48, "factory");
                ai.a beanDefinition49 = new ai.a(aVar18, Reflection.getOrCreateKotlinClass(oc.a.class), null, new fc.a(11), bVar15, e0Var12);
                Intrinsics.checkNotNullParameter(beanDefinition49, "beanDefinition");
                ci.a factory49 = new ci.a(beanDefinition49);
                module12.a(factory49);
                Intrinsics.checkNotNullParameter(module12, "module");
                Intrinsics.checkNotNullParameter(factory49, "factory");
                return Unit.f19194a;
            case 13:
                ei.a module13 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module13, "$this$module");
                ai.a beanDefinition50 = new ai.a(hi.a.f10827c, Reflection.getOrCreateKotlinClass(p.class), a.a.v("LiveDB"), new c1.k(4), ai.b.f188a, e0.f19204a);
                Intrinsics.checkNotNullParameter(beanDefinition50, "beanDefinition");
                ci.d factory50 = new ci.d(beanDefinition50);
                module13.a(factory50);
                Intrinsics.checkNotNullParameter(module13, "module");
                Intrinsics.checkNotNullParameter(factory50, "factory");
                return Unit.f19194a;
            case 14:
                ei.a module14 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module14, "$this$module");
                c1.k kVar9 = new c1.k(5);
                gi.a aVar20 = hi.a.f10827c;
                ai.b bVar16 = ai.b.f188a;
                e0 e0Var13 = e0.f19204a;
                ai.a beanDefinition51 = new ai.a(aVar20, Reflection.getOrCreateKotlinClass(rb.g.class), null, kVar9, bVar16, e0Var13);
                Intrinsics.checkNotNullParameter(beanDefinition51, "beanDefinition");
                ci.d factory51 = new ci.d(beanDefinition51);
                module14.a(factory51);
                Intrinsics.checkNotNullParameter(module14, "module");
                Intrinsics.checkNotNullParameter(factory51, "factory");
                ai.a beanDefinition52 = new ai.a(aVar20, Reflection.getOrCreateKotlinClass(j1.class), null, new c1.k(6), ai.b.f189b, e0Var13);
                Intrinsics.checkNotNullParameter(beanDefinition52, "beanDefinition");
                ci.a factory52 = new ci.a(beanDefinition52);
                module14.a(factory52);
                Intrinsics.checkNotNullParameter(module14, "module");
                Intrinsics.checkNotNullParameter(factory52, "factory");
                return Unit.f19194a;
            case 15:
                ei.a module15 = (ei.a) obj;
                Intrinsics.checkNotNullParameter(module15, "$this$module");
                fc.a aVar21 = new fc.a(26);
                gi.a aVar22 = hi.a.f10827c;
                ai.b bVar17 = ai.b.f189b;
                e0 e0Var14 = e0.f19204a;
                ai.a beanDefinition53 = new ai.a(aVar22, Reflection.getOrCreateKotlinClass(yb.m.class), null, aVar21, bVar17, e0Var14);
                Intrinsics.checkNotNullParameter(beanDefinition53, "beanDefinition");
                ci.a factory53 = new ci.a(beanDefinition53);
                module15.a(factory53);
                Intrinsics.checkNotNullParameter(module15, "module");
                Intrinsics.checkNotNullParameter(factory53, "factory");
                ai.a beanDefinition54 = new ai.a(aVar22, Reflection.getOrCreateKotlinClass(cc.i.class), null, new fc.a(27), ai.b.f188a, e0Var14);
                Intrinsics.checkNotNullParameter(beanDefinition54, "beanDefinition");
                ci.d factory54 = new ci.d(beanDefinition54);
                module15.a(factory54);
                Intrinsics.checkNotNullParameter(module15, "module");
                Intrinsics.checkNotNullParameter(factory54, "factory");
                return Unit.f19194a;
            case 16:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                Object value = entry.getValue();
                return d9.e.m(new StringBuilder("  "), ((g1.c) entry.getKey()).f9707a, " = ", value instanceof byte[] ? kotlin.collections.p.u((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
            case 17:
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("SELECT * FROM live_table ORDER BY createDate DESC LIMIT 100");
                try {
                    int r5 = x.r(r02, "id");
                    int r6 = x.r(r02, LiveTable.createDateColumn);
                    int r10 = x.r(r02, LiveTable.isViewedColumn);
                    int r11 = x.r(r02, LiveTable.imageUrlColumn);
                    int r12 = x.r(r02, "title");
                    int r13 = x.r(r02, LiveTable.messageColumn);
                    int r14 = x.r(r02, LiveTable.btnTextColumn);
                    int r15 = x.r(r02, LiveTable.btnUrlColumn);
                    ArrayList arrayList = new ArrayList();
                    while (r02.n0()) {
                        arrayList.add(new LivePrediction((int) r02.getLong(r5), (int) r02.getLong(r6), r02.isNull(r10) ? null : Integer.valueOf((int) r02.getLong(r10)), r02.isNull(r11) ? null : r02.V(r11), r02.isNull(r12) ? null : r02.V(r12), r02.isNull(r13) ? null : r02.V(r13), r02.isNull(r14) ? null : r02.V(r14), r02.isNull(r15) ? null : r02.V(r15)));
                    }
                    return arrayList;
                } finally {
                }
            case 18:
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("SELECT * FROM live_table ORDER BY createDate DESC LIMIT 100");
                try {
                    int r16 = x.r(r02, "id");
                    int r17 = x.r(r02, LiveTable.createDateColumn);
                    int r18 = x.r(r02, LiveTable.isViewedColumn);
                    int r19 = x.r(r02, LiveTable.imageUrlColumn);
                    int r20 = x.r(r02, "title");
                    int r21 = x.r(r02, LiveTable.messageColumn);
                    int r22 = x.r(r02, LiveTable.btnTextColumn);
                    int r23 = x.r(r02, LiveTable.btnUrlColumn);
                    ArrayList arrayList2 = new ArrayList();
                    while (r02.n0()) {
                        arrayList2.add(new LivePrediction((int) r02.getLong(r16), (int) r02.getLong(r17), r02.isNull(r18) ? null : Integer.valueOf((int) r02.getLong(r18)), r02.isNull(r19) ? null : r02.V(r19), r02.isNull(r20) ? null : r02.V(r20), r02.isNull(r21) ? null : r02.V(r21), r02.isNull(r22) ? null : r02.V(r22), r02.isNull(r23) ? null : r02.V(r23)));
                    }
                    return arrayList2;
                } finally {
                }
            case 19:
                Byte b10 = (Byte) obj;
                b10.byteValue();
                String format = String.format("%02X", Arrays.copyOf(new Object[]{b10}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return format;
            case 20:
                Map.Entry it = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return String.valueOf(it.getValue());
            case 21:
                return Boolean.valueOf(((d2) obj) instanceof ge.j);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                r02 = _connection3.r0("SELECT * FROM push_metrics_table LIMIT 666");
                try {
                    int r24 = x.r(r02, "id");
                    int r25 = x.r(r02, PushMetricsTable.pushIdColumn);
                    int r26 = x.r(r02, "type");
                    int r27 = x.r(r02, "dateCreate");
                    ArrayList arrayList3 = new ArrayList();
                    while (r02.n0()) {
                        int i10 = (int) r02.getLong(r24);
                        int i11 = (int) r02.getLong(r25);
                        int i12 = (int) r02.getLong(r26);
                        int i13 = (int) r02.getLong(r27);
                        hb.i iVar = new hb.i();
                        iVar.f10484a = i10;
                        iVar.f10485b = i11;
                        iVar.f10486c = i12;
                        iVar.f10487d = i13;
                        arrayList3.add(iVar);
                    }
                    return arrayList3;
                } finally {
                }
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                s2.a _connection4 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                r02 = _connection4.r0("SELECT * FROM events_table LIMIT 666");
                try {
                    int r28 = x.r(r02, "id");
                    int r29 = x.r(r02, "name");
                    int r30 = x.r(r02, EventsTable.contentColumn);
                    int r31 = x.r(r02, "dateCreate");
                    ArrayList arrayList4 = new ArrayList();
                    while (r02.n0()) {
                        int i14 = (int) r02.getLong(r28);
                        String event = r02.V(r29);
                        String V = r02.isNull(r30) ? null : r02.V(r30);
                        int i15 = (int) r02.getLong(r31);
                        Intrinsics.checkNotNullParameter(event, "event");
                        hb.a aVar23 = new hb.a();
                        aVar23.f10467a = i14;
                        aVar23.f10468b = event;
                        aVar23.f10469c = V;
                        aVar23.f10470d = i15;
                        arrayList4.add(aVar23);
                    }
                    return arrayList4;
                } finally {
                }
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                hh.b it2 = (hh.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                rh.g gVar = it2.f10817h;
                if (gVar instanceof hh.b) {
                    return (hh.b) gVar;
                }
                return null;
            case C0122e9.F /* 25 */:
                return a(obj);
            case C0122e9.G /* 26 */:
                j3.d it3 = (j3.d) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                String simpleName = it3.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                return simpleName;
            case C0122e9.H /* 27 */:
                return b(obj);
            case 28:
                return c(obj);
            default:
                tg.h Json = (tg.h) obj;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f23948a = true;
                c4.d dVar = ic.e0.f11106i;
                Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                Json.f23950c = dVar;
                Intrinsics.checkNotNullParameter("type", "<set-?>");
                Json.f23949b = "type";
                return Unit.f19194a;
        }
    }
}
