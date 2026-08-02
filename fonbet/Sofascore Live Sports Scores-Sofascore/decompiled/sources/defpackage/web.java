package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.CategoriesForDateResponse;
import com.sofascore.model.newNetwork.CategoryWrapper;
import com.sofascore.model.newNetwork.DistinctEventSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class web extends hoi implements Function2 {
    public String r;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ qqb v;
    public final /* synthetic */ long w;
    public final /* synthetic */ xeb x;
    public final /* synthetic */ String y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public web(qqb qqbVar, long j, xeb xebVar, String str, List list, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = qqbVar;
        this.w = j;
        this.x = xebVar;
        this.y = str;
        this.z = list;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        web webVar = new web(this.v, this.w, this.x, this.y, this.z, rq3Var);
        webVar.u = obj;
        return webVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((web) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01bb, code lost:
    
        if (r1.j(r24) == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01bd, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013b, code lost:
    
        if (r1 == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x009b, code lost:
    
        if (r4 == r2) goto L57;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        String valueOf;
        Object P;
        Object w;
        List<CategoryWrapper> categories;
        ku3 ku3Var = (ku3) this.u;
        lu3 lu3Var = lu3.a;
        int i2 = this.t;
        if (i2 == 0) {
            y6a.M(obj);
            long v = yaa.v() / 1000;
            bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            String i3 = fc6.i(v, hk4.a(bi4Var.d()));
            qqb qqbVar = this.v;
            i = (!qqbVar.a || i2a.x(qqbVar.b, this.w, true) <= 0) ? 0 : 1;
            Calendar calendar = ke0.a;
            valueOf = String.valueOf(ke0.c());
            this.x.k.clear();
            vyh vyhVar = this.x.e;
            String str = this.y;
            String z = i2a.z(this.v.b, this.w, true);
            this.u = ku3Var;
            this.r = valueOf;
            this.s = i;
            this.t = 1;
            vyhVar.getClass();
            P = yaa.P(new tyh(vyhVar, str, i3, z, null, 0), this);
        } else if (i2 == 1) {
            i = this.s;
            valueOf = this.r;
            y6a.M(obj);
            P = obj;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = this.s;
            y6a.M(obj);
            i = i4;
            w = obj;
            List list = (List) w;
            if (list == null) {
                list = km5.a;
            }
            xeb xebVar = this.x;
            nh0 X0 = CollectionsKt.X0(list);
            int c = sub.c(k13.r(X0, 10));
            if (c < 16) {
                c = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(c);
            Iterator it = X0.iterator();
            while (true) {
                sc5 sc5Var = (sc5) it;
                if (!sc5Var.b.hasNext()) {
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) sc5Var.next();
                linkedHashMap.put(new Integer(((Event) indexedValue.b).getId()), new Integer(indexedValue.a));
            }
            xebVar.i = linkedHashMap;
            ArrayList l = this.x.l(list);
            xeb xebVar2 = this.x;
            km5 km5Var = km5.a;
            xebVar2.h = new veb(l, km5Var, km5Var, false);
            this.x.l.k(new veb(l, km5Var, km5Var, false));
            xeb xebVar3 = this.x;
            this.u = null;
            this.r = null;
            this.s = i;
            this.t = 3;
        }
        CategoriesForDateResponse categoriesForDateResponse = (CategoriesForDateResponse) yaa.x((x2g) P);
        if (categoriesForDateResponse != null && (categories = categoriesForDateResponse.getCategories()) != null) {
            xeb xebVar4 = this.x;
            ArrayList arrayList = new ArrayList();
            for (CategoryWrapper categoryWrapper : categories) {
                DistinctEventSet y = i2a.y(categoryWrapper, valueOf);
                Pair pair = y != null ? new Pair(y, categoryWrapper) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                xebVar4.k.put(new Integer(((CategoryWrapper) pair2.b).getCategory().getId()), CollectionsKt.W0(((DistinctEventSet) pair2.a).getEventIds()));
            }
        }
        av4 t = xw3.t(ku3Var, null, new kv7(this.x, this.y, this.z, i != 0, (rq3) null), 3);
        this.u = null;
        this.r = null;
        this.s = i;
        this.t = 2;
        w = t.w(this);
        lu3 lu3Var2 = lu3.a;
    }
}
