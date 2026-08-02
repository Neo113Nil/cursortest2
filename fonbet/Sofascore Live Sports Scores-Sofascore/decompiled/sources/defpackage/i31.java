package defpackage;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.dialog.SettingsItem;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i31 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i31(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i;
        List list;
        Object obj3;
        int i2 = this.a;
        int i3 = Integer.MAX_VALUE;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i2) {
            case 0:
                j31 j31Var = (j31) obj4;
                Collator collator = (Collator) obj5;
                String str = "";
                CollationKey collationKey = collator.getCollationKey(obj instanceof Player ? tba.t((Player) obj) : obj instanceof Team ? tba.p(j31Var.i(), (Team) obj) : obj instanceof UniqueTournament ? tba.x((UniqueTournament) obj) : "");
                if (obj2 instanceof Player) {
                    str = tba.t((Player) obj2);
                } else if (obj2 instanceof Team) {
                    str = tba.p(j31Var.i(), (Team) obj2);
                } else if (obj2 instanceof UniqueTournament) {
                    str = tba.x((UniqueTournament) obj2);
                }
                return o93.b(collationKey, collator.getCollationKey(str));
            case 1:
                List list2 = (List) obj4;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj5;
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(((do7) obj).c.c));
                Integer valueOf = Integer.valueOf(num != null ? num.intValue() : list2.size());
                Integer num2 = (Integer) linkedHashMap.get(Integer.valueOf(((do7) obj2).c.c));
                return valueOf.compareTo(Integer.valueOf(num2 != null ? num2.intValue() : list2.size()));
            case 2:
                Function1 function1 = (Function1) obj4;
                int compare = ((cp) obj5).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                j67 j67Var = (j67) function1.invoke(obj);
                Integer valueOf2 = j67Var != null ? Integer.valueOf(j67Var.a) : -1;
                j67 j67Var2 = (j67) function1.invoke(obj2);
                return valueOf2.compareTo(j67Var2 != null ? Integer.valueOf(j67Var2.a) : -1);
            case 3:
                Map map = (Map) obj5;
                Function1 function12 = (Function1) obj4;
                j67 j67Var3 = (j67) function12.invoke(obj);
                Comparable comparable = (Comparable) tub.e(Integer.valueOf(j67Var3 != null ? j67Var3.a : -1), map);
                j67 j67Var4 = (j67) function12.invoke(obj2);
                return o93.b(comparable, (Comparable) rub.a(Integer.valueOf(j67Var4 != null ? j67Var4.a : -1), map));
            case 4:
                Map map2 = (Map) obj4;
                int compare2 = ((rs2) obj5).compare(obj, obj2);
                if (compare2 != 0) {
                    return compare2;
                }
                Integer num3 = (Integer) map2.get(Integer.valueOf(((Event) obj).getId()));
                if (num3 == null) {
                    num3 = r0;
                }
                Integer num4 = (Integer) map2.get(Integer.valueOf(((Event) obj2).getId()));
                return num3.compareTo(num4 != null ? num4 : Integer.MAX_VALUE);
            case 5:
                ArrayList arrayList = (ArrayList) obj4;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj5;
                Integer num5 = (Integer) linkedHashMap2.get(Integer.valueOf(((do7) obj).c.c));
                Integer valueOf3 = Integer.valueOf(num5 != null ? num5.intValue() : arrayList.size());
                Integer num6 = (Integer) linkedHashMap2.get(Integer.valueOf(((do7) obj2).c.c));
                return valueOf3.compareTo(Integer.valueOf(num6 != null ? num6.intValue() : arrayList.size()));
            case 6:
                int compare3 = ((wpb) obj5).compare(obj, obj2);
                return compare3 != 0 ? compare3 : ((Comparator) obj4).compare(((SettingsItem) obj).b, ((SettingsItem) obj2).b);
            case 7:
                dsf dsfVar = (dsf) obj4;
                tee teeVar = ((a3i) obj5).d;
                List list3 = (List) teeVar.get(Integer.valueOf(((RaceFlowModels$RaceEntrant) obj).a));
                Object obj6 = null;
                if (list3 != null) {
                    Iterator it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj3 = it.next();
                            if (((ykf) obj3).a == dsfVar.a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    ykf ykfVar = (ykf) obj3;
                    if (ykfVar != null) {
                        i = ykfVar.b;
                        Integer valueOf4 = Integer.valueOf(i);
                        list = (List) teeVar.get(Integer.valueOf(((RaceFlowModels$RaceEntrant) obj2).a));
                        if (list != null) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (((ykf) next).a == dsfVar.a) {
                                        obj6 = next;
                                    }
                                }
                            }
                            ykf ykfVar2 = (ykf) obj6;
                            if (ykfVar2 != null) {
                                i3 = ykfVar2.b;
                            }
                        }
                        return valueOf4.compareTo(Integer.valueOf(i3));
                    }
                }
                i = Integer.MAX_VALUE;
                Integer valueOf42 = Integer.valueOf(i);
                list = (List) teeVar.get(Integer.valueOf(((RaceFlowModels$RaceEntrant) obj2).a));
                if (list != null) {
                }
                return valueOf42.compareTo(Integer.valueOf(i3));
            case 8:
                Double valueOf5 = Double.valueOf(0.0d);
                ArrayList arrayList2 = (ArrayList) obj5;
                Integer num7 = (Integer) obj4;
                Double d = (Double) ((k3i) arrayList2.get(num7.intValue())).c.invoke(((l3i) obj2).a);
                if (d == null) {
                    d = valueOf5;
                }
                Double d2 = (Double) ((k3i) arrayList2.get(num7.intValue())).c.invoke(((l3i) obj).a);
                if (d2 != null) {
                    valueOf5 = d2;
                }
                return d.compareTo(valueOf5);
            default:
                zzao zzaoVar = (zzao) obj;
                zzao zzaoVar2 = (zzao) obj2;
                if (zzaoVar instanceof zzat) {
                    return !(zzaoVar2 instanceof zzat) ? 1 : 0;
                }
                if (zzaoVar2 instanceof zzat) {
                    return -1;
                }
                zzai zzaiVar = (zzai) obj5;
                return zzaiVar == null ? zzaoVar.zzc().compareTo(zzaoVar2.zzc()) : (int) zzh.h(zzaiVar.d((zzg) obj4, Arrays.asList(zzaoVar, zzaoVar2)).zzd().doubleValue());
        }
    }
}
