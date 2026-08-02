package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.FilterCategory;
import com.sofascore.model.newNetwork.FilterValue;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lku2;", "Lq8;", "eu2", "du2", "fu2", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ku2 extends q8 {
    public final vyh e;
    public final List f;
    public final List g;
    public final long h;
    public final boolean i;
    public final DateTimeFormatter j;
    public final long k;
    public final String l;
    public oqb m;
    public List n;
    public boolean o;
    public final boolean p;
    public final fdi q;
    public final jof r;
    public Map s;
    public g9i t;
    public g9i u;
    public g9i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ab, code lost:
    
        if (r7.isBefore(r4) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ku2(Application application, fqg fqgVar, vyh vyhVar) {
        super(application);
        fqgVar.getClass();
        vyhVar.getClass();
        this.e = vyhVar;
        this.f = b.j(StatusKt.STATUS_CANCELED, StatusKt.STATUS_FINISHED);
        this.g = b.j(StatusKt.STATUS_NOT_STARTED, StatusKt.STATUS_WILL_CONTINUE, StatusKt.STATUS_DELAYED, StatusKt.STATUS_SUSPENDED);
        Long l = (Long) fqgVar.a("ARG_TIMESTAMP");
        long longValue = l != null ? l.longValue() : 0L;
        this.h = longValue;
        this.i = ug5.u(longValue);
        this.j = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
        wd5 wd5Var = xd5.b;
        this.k = xd5.k(wkn.R(30, be5.MINUTES), be5.SECONDS);
        Calendar calendar = ke0.a;
        this.l = ke0.b(i());
        km5 km5Var = km5.a;
        this.n = km5Var;
        boolean z = true;
        this.o = true;
        ZoneId systemDefault = ZoneId.systemDefault();
        if (!Instant.ofEpochSecond(longValue).atZone(systemDefault).toLocalDate().isBefore(LocalDate.now(systemDefault))) {
            LocalDate now = LocalDate.now(ZoneId.systemDefault());
            LocalDate minusDays = now.minusDays(7L);
            LocalDate plusDays = now.plusDays(7L);
            LocalDate D = ug5.D(longValue);
            if (!D.isAfter(plusDays)) {
            }
        }
        z = false;
        this.p = z;
        fdi a = gdi.a(new du2(false, null, km5Var, null, null));
        this.q = a;
        this.r = un0.u(a);
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.s = lm5Var;
    }

    public final int k(int i, boolean z) {
        if (this.s.isEmpty()) {
            if (i < 0 || i >= this.n.size()) {
                return -1;
            }
            return i;
        }
        int i2 = z ? -1 : 1;
        while (i >= 0 && i < this.n.size()) {
            eu2 eu2Var = (eu2) this.n.get(i);
            Map map = this.s;
            if (map.isEmpty()) {
                return i;
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                List list = (List) eu2Var.e.get(str);
                if (list == null || !list.contains(str2)) {
                    i += i2;
                }
            }
            return i;
        }
        return -1;
    }

    public final int l(List list, long j, Function1 function1) {
        Long l;
        if (list.isEmpty()) {
            return 0;
        }
        long j2 = this.k;
        long j3 = (j / j2) * j2;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                l = (Long) function1.invoke(list.get(size));
                if (l != null && l.longValue() <= j3) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        l = null;
        size = -1;
        if (size == -1) {
            return 0;
        }
        for (int i2 = size - 1; -1 < i2; i2--) {
            Long l2 = (Long) function1.invoke(list.get(i2));
            if (!Intrinsics.c(l2, l)) {
                if (l2 != null) {
                    break;
                }
            } else {
                size = i2;
            }
        }
        return (size <= 0 || function1.invoke(list.get(size + (-1))) != null) ? size : size - 1;
    }

    public final void m(int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        g9i g9iVar = this.u;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.u = xw3.L(un0.z(this), null, null, new iu2(this, i, z, arrayList, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable n(eu2 eu2Var, sq3 sq3Var) {
        ju2 ju2Var;
        int i;
        EventListResponse eventListResponse;
        String str;
        if (sq3Var instanceof ju2) {
            ju2Var = (ju2) sq3Var;
            int i2 = ju2Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ju2Var.u = i2 - Integer.MIN_VALUE;
                Object obj = ju2Var.s;
                lu3 lu3Var = lu3.a;
                i = ju2Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    String str2 = eu2Var.a;
                    int i3 = eu2Var.b;
                    ju2Var.r = this;
                    ju2Var.u = 1;
                    vyh vyhVar = this.e;
                    vyhVar.getClass();
                    obj = yaa.P(new syh(vyhVar, this.l, str2, i3, null, 1), ju2Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = ju2Var.r;
                    y6a.M(obj);
                }
                eventListResponse = (EventListResponse) yaa.x((x2g) obj);
                if (eventListResponse != null || (r13 = eventListResponse.getEvents()) == null) {
                    List<Event> list = km5.a;
                }
                oqb oqbVar = this.m;
                str = oqbVar == null ? (String) oqbVar.e.get(FilterCategory.STATUS.getFilterCategoryId()) : null;
                if (!this.i) {
                    str = null;
                }
                if (str == null) {
                    str = FilterValue.ALL.getFilterValueId();
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    Event event = (Event) obj2;
                    long startTimestamp = event.getStartTimestamp();
                    Long endTimestamp = event.getEndTimestamp();
                    if (aba.J(startTimestamp, endTimestamp != null ? endTimestamp.longValue() : 0L, this.h)) {
                        Map<String, List<String>> eventFilters = event.getEventFilters();
                        Map map = this.s;
                        if (!map.isEmpty() && !map.isEmpty()) {
                            for (Map.Entry entry : map.entrySet()) {
                                String str3 = (String) entry.getKey();
                                String str4 = (String) entry.getValue();
                                List<String> list2 = eventFilters != null ? eventFilters.get(str3) : null;
                                if (list2 != null && list2.contains(str4)) {
                                }
                            }
                        }
                        String type = event.getStatus().getType();
                        if (Intrinsics.c(str, FilterValue.FINISHED.getFilterValueId()) ? this.f.contains(type) : Intrinsics.c(str, FilterValue.UPCOMING.getFilterValueId()) ? this.g.contains(type) : Intrinsics.c(str, FilterValue.ALL.getFilterValueId())) {
                            arrayList.add(obj2);
                        }
                    }
                }
                return arrayList;
            }
        }
        ju2Var = new ju2(this, sq3Var);
        Object obj3 = ju2Var.s;
        lu3 lu3Var2 = lu3.a;
        i = ju2Var.u;
        if (i != 0) {
        }
        eventListResponse = (EventListResponse) yaa.x((x2g) obj3);
        if (eventListResponse != null) {
        }
        List<Event> list3 = km5.a;
        oqb oqbVar2 = this.m;
        if (oqbVar2 == null) {
        }
        if (!this.i) {
        }
        if (str == null) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r13.hasNext()) {
        }
        return arrayList2;
    }
}
