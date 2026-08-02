package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pif extends ii6 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r3 = r2.getString(com.sofascore.results.R.string.quarter_4_short);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r0.equals("2nd quarter") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        r3 = r2.getString(com.sofascore.results.R.string.quarter_2_short);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r0.equals("Q4") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r0.equals("Q3") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r0.equals("Q2") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r0.equals("Q1") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        r3 = r2.getString(com.sofascore.results.R.string.quarter_1_short);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r0.equals("1st quarter") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0.equals("3rd quarter") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0045, code lost:
    
        r3 = r2.getString(com.sofascore.results.R.string.quarter_3_short);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r0.equals("4th quarter") == false) goto L34;
     */
    @Override // defpackage.yy9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String H(fz9 fz9Var) {
        String str = fz9Var.d;
        int hashCode = str.hashCode();
        Context context = this.b;
        switch (hashCode) {
            case -1900047650:
                break;
            case 2560:
                break;
            case 2561:
                break;
            case 2562:
                break;
            case 2563:
                break;
            case 435036148:
                break;
            case 1317136436:
                break;
            case 2146998065:
                break;
            default:
                return super.H(fz9Var);
        }
    }

    @Override // defpackage.yy9
    public final boolean I() {
        return true;
    }

    @Override // defpackage.ii6
    public final LinkedHashMap L(ArrayList arrayList, Event event) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Incident incident = (Incident) it.next();
            if (incident instanceof Incident.PeriodIncident) {
                Set keySet = this.p.keySet();
                keySet.getClass();
                Iterator it2 = keySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.c(((fz9) obj).c, ((Incident.PeriodIncident) incident).getId())) {
                        break;
                    }
                }
                fz9 fz9Var = (fz9) obj;
                Incident.PeriodIncident periodIncident = (Incident.PeriodIncident) incident;
                linkedHashMap.put(new fz9(periodIncident.getId(), periodIncident.getText(), periodIncident.getIsLive(), periodIncident.getSport(), periodIncident.getPeriod(), Incident.getHomeScore$default(periodIncident, null, 1, null), Incident.getAwayScore$default(periodIncident, null, 1, null), Intrinsics.c(fz9Var != null ? Boolean.valueOf(fz9Var.j) : null, Boolean.TRUE) || (this.p.isEmpty() && linkedHashMap.isEmpty())), new hi6());
            } else if ((incident instanceof Incident.GoalIncident) || (incident instanceof Incident.OvertimeBreakIncident)) {
                Collection values = linkedHashMap.values();
                values.getClass();
                hi6 hi6Var = (hi6) CollectionsKt.i0(values);
                if (hi6Var != null) {
                    hi6Var.a.add(jz9.a(this.b, incident, null));
                }
            }
        }
        return linkedHashMap;
    }
}
