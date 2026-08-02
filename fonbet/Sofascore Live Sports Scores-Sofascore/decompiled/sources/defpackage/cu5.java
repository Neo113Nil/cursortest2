package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.internal.zzdt;
import com.sofascore.results.service.WatchService;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cu5 extends hoi implements Function2 {
    public final /* synthetic */ int r = 1;
    public List s;
    public int t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ int v;
    public Serializable w;
    public /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu5(String str, List list, List list2, boolean z, HashSet hashSet, int i, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = str;
        this.s = list;
        this.x = list2;
        this.u = z;
        this.y = hashSet;
        this.t = i;
        this.v = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.y;
        switch (i) {
            case 0:
                int i2 = this.t;
                int i3 = this.v;
                return new cu5((String) this.w, this.s, (List) this.x, this.u, (HashSet) obj2, i2, i3, rq3Var);
            default:
                cu5 cu5Var = new cu5((WatchService) obj2, this.u, this.v, rq3Var);
                cu5Var.x = obj;
                return cu5Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((cu5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ba A[Catch: IOException -> 0x011e, TryCatch #0 {IOException -> 0x011e, blocks: (B:9:0x0020, B:10:0x0090, B:11:0x00a3, B:12:0x00b6, B:14:0x00ba, B:17:0x00c6, B:24:0x00d1, B:32:0x0032, B:33:0x005f, B:36:0x006c, B:39:0x0077, B:41:0x007e, B:46:0x0118, B:47:0x011d, B:49:0x0067, B:51:0x0039, B:53:0x0042), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e A[Catch: IOException -> 0x011e, TryCatch #0 {IOException -> 0x011e, blocks: (B:9:0x0020, B:10:0x0090, B:11:0x00a3, B:12:0x00b6, B:14:0x00ba, B:17:0x00c6, B:24:0x00d1, B:32:0x0032, B:33:0x005f, B:36:0x006c, B:39:0x0077, B:41:0x007e, B:46:0x0118, B:47:0x011d, B:49:0x0067, B:51:0x0039, B:53:0x0042), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0118 A[Catch: IOException -> 0x011e, TryCatch #0 {IOException -> 0x011e, blocks: (B:9:0x0020, B:10:0x0090, B:11:0x00a3, B:12:0x00b6, B:14:0x00ba, B:17:0x00c6, B:24:0x00d1, B:32:0x0032, B:33:0x005f, B:36:0x006c, B:39:0x0077, B:41:0x007e, B:46:0x0118, B:47:0x011d, B:49:0x0067, B:51:0x0039, B:53:0x0042), top: B:4:0x0018 }] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List list;
        ArrayList arrayList4;
        boolean isEmpty;
        qa6 qa6Var;
        ?? r12;
        ArrayList arrayList5;
        ArrayList arrayList6;
        v6a it;
        int i = this.r;
        int i2 = this.v;
        Object obj2 = this.y;
        int i3 = 1;
        boolean z = this.u;
        boolean z2 = false;
        boolean z3 = false;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                String str = (String) this.w;
                p22 D = n4o.D(str, CollectionsKt.w0((List) this.x, this.s), z);
                List list2 = D != null ? D.a : null;
                if (list2 == null) {
                    list2 = km5.a;
                }
                return n4o.O(z, list2, new w64((HashSet) obj2, this.t, i2, i3), str);
            default:
                WatchService watchService = (WatchService) obj2;
                ku3 ku3Var = (ku3) this.x;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.t;
                try {
                } catch (IOException e) {
                    ugj.a.getClass();
                    e.toString();
                }
                if (i4 == 0) {
                    y6a.M(obj);
                    arrayList = new ArrayList();
                    yf2 yf2Var = watchService.n;
                    if (yf2Var == null) {
                        arrayList2 = arrayList;
                        arrayList3 = arrayList;
                        list = km5.a;
                        arrayList4 = arrayList2;
                        arrayList3.addAll(list);
                        isEmpty = arrayList4.isEmpty();
                        arrayList6 = arrayList4;
                        if (!isEmpty || z) {
                            arrayList4.clear();
                            qa6Var = watchService.p;
                            if (qa6Var == null) {
                                Intrinsics.i("dbRepository");
                                throw null;
                            }
                            this.x = ku3Var;
                            this.s = arrayList4;
                            this.w = null;
                            this.t = 2;
                            obj = qa6Var.l(this);
                            if (obj != lu3Var2) {
                                r12 = arrayList4;
                                List list3 = (List) obj;
                                r12.addAll(list3);
                                hs4 hs4Var = z45.a;
                                xw3.L(ku3Var, hq4.c, null, new pdk(watchService, list3, z3 ? 1 : 0, 6), 2);
                                arrayList6 = r12;
                            }
                            return lu3Var2;
                        }
                        IntRange j = llf.j((i2 - 1) * 10, i2 * 10);
                        ArrayList arrayList7 = new ArrayList();
                        it = j.iterator();
                        while (it.c) {
                        }
                        PutDataMapRequest b = PutDataMapRequest.b(!z ? "/data//refreshAll" : "/data");
                        HashMap hashMap = b.b.a;
                        hashMap.put("mcc", Integer.valueOf(ke0.c));
                        hashMap.put("events", new ArrayList(arrayList7));
                        hashMap.put("time", Long.valueOf(new Date().getTime()));
                        PutDataRequest a = b.a();
                        a.d = 0L;
                        Api api = Wearable.a;
                        new zzdt(watchService, GoogleApi.Settings.c).i(a);
                        watchService.m = false;
                        return Unit.a;
                    }
                    this.x = ku3Var;
                    this.s = arrayList;
                    this.w = arrayList;
                    this.t = 1;
                    hs4 hs4Var2 = z45.a;
                    Object R = xw3.R(hq4.c, new ip1(yf2Var, z2 ? 1 : 0, 21), this);
                    if (R == lu3Var2) {
                        return lu3Var2;
                    }
                    ArrayList arrayList8 = arrayList;
                    obj = R;
                    arrayList3 = arrayList8;
                    arrayList5 = arrayList8;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r12 = this.s;
                        y6a.M(obj);
                        List list32 = (List) obj;
                        r12.addAll(list32);
                        hs4 hs4Var3 = z45.a;
                        xw3.L(ku3Var, hq4.c, null, new pdk(watchService, list32, z3 ? 1 : 0, 6), 2);
                        arrayList6 = r12;
                        IntRange j2 = llf.j((i2 - 1) * 10, i2 * 10);
                        ArrayList arrayList72 = new ArrayList();
                        it = j2.iterator();
                        while (it.c) {
                            Integer num = (Integer) CollectionsKt.a0(it.nextInt(), arrayList6);
                            if (num != null) {
                                arrayList72.add(num);
                            }
                        }
                        PutDataMapRequest b2 = PutDataMapRequest.b(!z ? "/data//refreshAll" : "/data");
                        HashMap hashMap2 = b2.b.a;
                        hashMap2.put("mcc", Integer.valueOf(ke0.c));
                        hashMap2.put("events", new ArrayList(arrayList72));
                        hashMap2.put("time", Long.valueOf(new Date().getTime()));
                        PutDataRequest a2 = b2.a();
                        a2.d = 0L;
                        Api api2 = Wearable.a;
                        new zzdt(watchService, GoogleApi.Settings.c).i(a2);
                        watchService.m = false;
                        return Unit.a;
                    }
                    arrayList3 = (ArrayList) this.w;
                    ?? r7 = this.s;
                    y6a.M(obj);
                    arrayList5 = r7;
                }
                list = (List) obj;
                if (list != null) {
                    arrayList4 = arrayList5;
                    arrayList3.addAll(list);
                    isEmpty = arrayList4.isEmpty();
                    arrayList6 = arrayList4;
                    if (!isEmpty) {
                    }
                    arrayList4.clear();
                    qa6Var = watchService.p;
                    if (qa6Var == null) {
                    }
                } else {
                    arrayList = arrayList3;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList;
                    list = km5.a;
                    arrayList4 = arrayList2;
                    arrayList3.addAll(list);
                    isEmpty = arrayList4.isEmpty();
                    arrayList6 = arrayList4;
                    if (!isEmpty) {
                    }
                    arrayList4.clear();
                    qa6Var = watchService.p;
                    if (qa6Var == null) {
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu5(WatchService watchService, boolean z, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.y = watchService;
        this.u = z;
        this.v = i;
    }
}
