package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class do5 extends hoi implements Function2 {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int r = 0;
    public List s;
    public int t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do5(fo5 fo5Var, un5 un5Var, xvd xvdVar, List list, e26 e26Var, ot9 ot9Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = fo5Var;
        this.B = un5Var;
        this.z = xvdVar;
        this.x = list;
        this.C = e26Var;
        this.D = ot9Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.D;
        Object obj3 = this.C;
        switch (i) {
            case 0:
                do5 do5Var = new do5((fo5) this.A, (un5) this.B, (xvd) this.z, (List) this.x, (e26) obj3, (ot9) obj2, rq3Var);
                do5Var.w = obj;
                return do5Var;
            default:
                do5 do5Var2 = new do5((String) obj3, (tll) obj2, rq3Var);
                do5Var2.w = obj;
                return do5Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((do5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x00b5, code lost:
    
        if (r11 == r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00a1, code lost:
    
        if (r3 == r10) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b A[LOOP:0: B:59:0x0105->B:61:0x010b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0158 A[LOOP:1: B:64:0x0152->B:66:0x0158, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0317 -> B:90:0x031d). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        int i;
        int i2;
        ku3 ku3Var;
        List list;
        int intValue;
        av4 t;
        Object w;
        List<Event> list2;
        Object T;
        int i3;
        Iterator it;
        Object u;
        int i4;
        dmj dmjVar;
        int i5;
        Map o;
        oll ollVar;
        int i6;
        Object u2;
        int i7;
        dmj dmjVar2;
        Map map;
        tll tllVar;
        Double d;
        int i8 = this.r;
        Object obj2 = this.C;
        Object obj3 = this.D;
        jfj jfjVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i8) {
            case 0:
                e26 e26Var = (e26) obj2;
                List list3 = (List) this.x;
                xvd xvdVar = (xvd) this.z;
                un5 un5Var = (un5) this.B;
                lu3 lu3Var = lu3.a;
                int i9 = this.v;
                if (i9 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var2 = (ku3) this.w;
                    fo5 fo5Var = (fo5) this.A;
                    Drawable drawable = un5Var.a;
                    zid zidVar = fo5Var.c;
                    if (drawable instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawable).getBitmap();
                        Bitmap.Config config = bitmap.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        if (!ph0.v(l.a, config)) {
                            if (zidVar != null && zidVar.b <= 4) {
                                Objects.toString(config);
                                Objects.toString(list3);
                            }
                        }
                        e26Var.getClass();
                        int size = list3.size();
                        i = 0;
                        i2 = size;
                        ku3Var = ku3Var2;
                        list = list3;
                        if (i >= i2) {
                        }
                    } else if (zidVar != null && zidVar.b <= 4) {
                        drawable.getClass();
                        Objects.toString(list3);
                    }
                    bitmap = fqj.r(drawable, xvdVar.b, xvdVar.c, xvdVar.d, xvdVar.e);
                    e26Var.getClass();
                    int size2 = list3.size();
                    i = 0;
                    i2 = size2;
                    ku3Var = ku3Var2;
                    list = list3;
                    if (i >= i2) {
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = this.u;
                    int i10 = this.t;
                    xvd xvdVar2 = (xvd) this.y;
                    List list4 = this.s;
                    ku3Var = (ku3) this.w;
                    y6a.M(obj);
                    Object a = obj;
                    bitmap = (Bitmap) a;
                    s9a.t(ku3Var);
                    xvd xvdVar3 = xvdVar2;
                    i = i10 + 1;
                    list = list4;
                    xvdVar = xvdVar3;
                    if (i >= i2) {
                        cwj cwjVar = (cwj) list.get(i);
                        jjh jjhVar = xvdVar.c;
                        this.w = ku3Var;
                        this.s = list;
                        this.y = xvdVar;
                        this.t = i;
                        this.u = i2;
                        this.v = 1;
                        a = cwjVar.a(bitmap, jjhVar);
                        if (a == lu3Var) {
                            return lu3Var;
                        }
                        xvd xvdVar4 = xvdVar;
                        list4 = list;
                        i10 = i;
                        xvdVar2 = xvdVar4;
                        bitmap = (Bitmap) a;
                        s9a.t(ku3Var);
                        xvd xvdVar32 = xvdVar2;
                        i = i10 + 1;
                        list = list4;
                        xvdVar = xvdVar32;
                        if (i >= i2) {
                            e26Var.getClass();
                            return new un5(new BitmapDrawable(((ot9) obj3).a.getResources(), bitmap), un5Var.b, un5Var.c, un5Var.d);
                        }
                    }
                }
                break;
            default:
                tll tllVar2 = (tll) obj3;
                Context context = tllVar2.a;
                ku3 ku3Var3 = (ku3) this.w;
                lu3 lu3Var2 = lu3.a;
                int i11 = this.v;
                int i12 = 2;
                int i13 = 3;
                if (i11 == 0) {
                    y6a.M(obj);
                    vel velVar = vel.a;
                    Integer b = vel.b((String) obj2);
                    if (b == null) {
                        return null;
                    }
                    intValue = b.intValue();
                    av4 t2 = xw3.t(ku3Var3, null, new pll(tllVar2, intValue, objArr2 == true ? 1 : 0, i12), 3);
                    t = xw3.t(ku3Var3, null, new pll(tllVar2, intValue, objArr == true ? 1 : 0, i13), 3);
                    this.w = ku3Var3;
                    this.x = t;
                    this.t = intValue;
                    this.v = 1;
                    w = t2.w(this);
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            intValue = this.t;
                            list2 = this.s;
                            y6a.M(obj);
                            T = obj;
                            dmj dmjVar3 = (dmj) T;
                            if (list2.size() < 2) {
                                return null;
                            }
                            if (!list2.isEmpty()) {
                                for (Event event : list2) {
                                    if (me4.t(StatusKt.STATUS_FINISHED, event) || me4.t(StatusKt.STATUS_IN_PROGRESS, event) || me4.t(StatusKt.STATUS_WILL_CONTINUE, event) || me4.t(StatusKt.STATUS_INTERRUPTED, event)) {
                                        i3 = 1;
                                        ArrayList arrayList = new ArrayList();
                                        for (Event event2 : list2) {
                                            o13.v(b.j(new Integer(Event.getHomeTeam$default(event2, null, 1, null).getId()), new Integer(Event.getAwayTeam$default(event2, null, 1, null).getId())), arrayList);
                                        }
                                        List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList));
                                        ArrayList arrayList2 = new ArrayList(k13.r(S0, 10));
                                        it = S0.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(xw3.t(ku3Var3, null, new anc(((Number) it.next()).intValue(), tllVar2, (rq3) null), 3));
                                        }
                                        this.w = null;
                                        this.x = null;
                                        this.s = list2;
                                        this.y = dmjVar3;
                                        this.t = intValue;
                                        this.u = i3;
                                        this.v = 3;
                                        u = m6k.u(arrayList2, this);
                                        if (u != lu3Var2) {
                                            i4 = intValue;
                                            dmjVar = dmjVar3;
                                            i5 = i3;
                                            o = tub.o((Iterable) u);
                                            if (dmjVar != null) {
                                            }
                                        }
                                        return lu3Var2;
                                    }
                                }
                            }
                            i3 = 0;
                            ArrayList arrayList3 = new ArrayList();
                            while (r15.hasNext()) {
                            }
                            List S02 = CollectionsKt.S0(CollectionsKt.V0(arrayList3));
                            ArrayList arrayList22 = new ArrayList(k13.r(S02, 10));
                            it = S02.iterator();
                            while (it.hasNext()) {
                            }
                            this.w = null;
                            this.x = null;
                            this.s = list2;
                            this.y = dmjVar3;
                            this.t = intValue;
                            this.u = i3;
                            this.v = 3;
                            u = m6k.u(arrayList22, this);
                            if (u != lu3Var2) {
                            }
                            return lu3Var2;
                        }
                        if (i11 != 3) {
                            if (i11 != 4) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i7 = this.u;
                            dmjVar2 = (dmj) this.B;
                            tll tllVar3 = (tll) this.A;
                            map = (Map) this.z;
                            List list5 = this.s;
                            y6a.M(obj);
                            tllVar = tllVar3;
                            list2 = list5;
                            u2 = obj;
                            Bitmap bitmap2 = (Bitmap) u2;
                            boolean z = i7 == 0;
                            tllVar.getClass();
                            Integer valueOf = Integer.valueOf(dmjVar2.a);
                            d = dmjVar2.b;
                            if (d != null) {
                                double doubleValue = d.doubleValue();
                                String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1));
                                int i14 = R.color.rating_00;
                                if (doubleValue != 0.0d) {
                                    if (doubleValue < 6.0d) {
                                        i14 = R.color.rating_10;
                                    } else if (doubleValue < 6.5d) {
                                        i14 = R.color.rating_60;
                                    } else if (doubleValue < 7.0d) {
                                        i14 = R.color.rating_65;
                                    } else if (doubleValue < 8.0d) {
                                        i14 = R.color.rating_70;
                                    } else if (doubleValue < 9.0d) {
                                        i14 = R.color.rating_80;
                                    } else if (doubleValue <= 10.0d) {
                                        i14 = R.color.rating_90;
                                    }
                                }
                                jfjVar = new jfj(4, format, Integer.valueOf(i14));
                            }
                            ollVar = new oll(valueOf, bitmap2, jfjVar, z);
                            o = map;
                            i6 = 0;
                            return new skl(tllVar2.e((Event) list2.get(i6), o), tllVar2.e((Event) list2.get(1), o), ollVar);
                        }
                        i5 = this.u;
                        int i15 = this.t;
                        dmjVar = (dmj) this.y;
                        List list6 = this.s;
                        y6a.M(obj);
                        u = obj;
                        i4 = i15;
                        list2 = list6;
                        o = tub.o((Iterable) u);
                        if (dmjVar != null) {
                            i6 = 0;
                            ollVar = new oll(null, null, null, false);
                            return new skl(tllVar2.e((Event) list2.get(i6), o), tllVar2.e((Event) list2.get(1), o), ollVar);
                        }
                        int i16 = dmjVar.a;
                        this.w = null;
                        this.x = null;
                        this.s = list2;
                        this.y = null;
                        this.z = o;
                        this.A = tllVar2;
                        this.B = dmjVar;
                        this.t = i4;
                        this.u = i5;
                        this.v = 4;
                        int s = ao2.s(48, context);
                        u2 = inb.g.u(context, pco.M(i16), aba.g(s, s), Bitmap.Config.ARGB_8888, this);
                        if (u2 != lu3Var2) {
                            i7 = i5;
                            dmjVar2 = dmjVar;
                            map = o;
                            tllVar = tllVar2;
                            Bitmap bitmap22 = (Bitmap) u2;
                            if (i7 == 0) {
                            }
                            tllVar.getClass();
                            Integer valueOf2 = Integer.valueOf(dmjVar2.a);
                            d = dmjVar2.b;
                            if (d != null) {
                            }
                            ollVar = new oll(valueOf2, bitmap22, jfjVar, z);
                            o = map;
                            i6 = 0;
                            return new skl(tllVar2.e((Event) list2.get(i6), o), tllVar2.e((Event) list2.get(1), o), ollVar);
                        }
                        return lu3Var2;
                    }
                    intValue = this.t;
                    av4 av4Var = (av4) this.x;
                    y6a.M(obj);
                    t = av4Var;
                    w = obj;
                }
                list2 = (List) w;
                this.w = ku3Var3;
                this.x = null;
                this.s = list2;
                this.t = intValue;
                this.v = 2;
                T = t.T(this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do5(String str, tll tllVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.C = str;
        this.D = tllVar;
    }
}
