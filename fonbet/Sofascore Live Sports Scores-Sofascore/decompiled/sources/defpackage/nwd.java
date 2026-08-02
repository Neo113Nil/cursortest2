package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nwd extends y21 {
    public final Event O;

    public nwd(Event event) {
        event.getClass();
        this.O = event;
    }

    @Override // defpackage.y21
    public final Event d() {
        return this.O;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f0, code lost:
    
        if (defpackage.n9e.F(r1) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f2, code lost:
    
        r6.x = new defpackage.jfj(4, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f9, code lost:
    
        r7 = com.sofascore.model.mvvm.model.Event.getHomeScore$default(r8, null, 1, null).getScoreByPeriodName(r8.getLastPeriod());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0105, code lost:
    
        if (r7 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0107, code lost:
    
        r7 = java.lang.String.valueOf(r7.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0111, code lost:
    
        r8 = com.sofascore.model.mvvm.model.Event.getAwayScore$default(r8, null, 1, null).getScoreByPeriodName(r8.getLastPeriod());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x011d, code lost:
    
        if (r8 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011f, code lost:
    
        r4 = java.lang.String.valueOf(r8.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012b, code lost:
    
        if (defpackage.n9e.F(r7) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x012d, code lost:
    
        r6.y = new defpackage.jfj(4, r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0138, code lost:
    
        if (defpackage.n9e.F(r4) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x013a, code lost:
    
        r6.z = new defpackage.jfj(4, r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0110, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0142, code lost:
    
        r6.t = false;
        r6.u = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        if (r7.equals(com.sofascore.model.Sports.BEACH_VOLLEY) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0038, code lost:
    
        if (r7.equals(com.sofascore.model.Sports.VOLLEYBALL) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r7.equals(com.sofascore.model.Sports.TABLE_TENNIS) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00c6, code lost:
    
        defpackage.s9a.C(r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c0, code lost:
    
        if (r7.equals(com.sofascore.model.Sports.BADMINTON) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00cd, code lost:
    
        if (defpackage.ok3.D(r8) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00cf, code lost:
    
        r7 = com.sofascore.model.mvvm.model.Event.getHomeScore$default(r8, null, 1, null).getPoint();
        r1 = com.sofascore.model.mvvm.model.Event.getAwayScore$default(r8, null, 1, null).getPoint();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00e3, code lost:
    
        if (defpackage.n9e.F(r7) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00e5, code lost:
    
        r6.w = new defpackage.jfj(4, r7, r0);
     */
    @Override // defpackage.y21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Context context, Event event) {
        Integer coverage;
        Integer valueOf = Integer.valueOf(R.color.secondary_default);
        context.getClass();
        event.getClass();
        String s = ok3.s(event);
        boolean z = false;
        switch (s.hashCode()) {
            case -2005973498:
                break;
            case -1452201948:
                if (s.equals(Sports.E_SPORTS)) {
                    if (ok3.D(event) && (coverage = event.getCoverage()) != null && coverage.intValue() == 92) {
                        z = true;
                    }
                    s9a.C(this, event);
                    if (z && Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName(event.getLastPeriod()) != null && Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName(event.getLastPeriod()) != null) {
                        Integer scoreByPeriodName = Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName(event.getLastPeriod());
                        this.y = new jfj(4, scoreByPeriodName != null ? String.valueOf(scoreByPeriodName.intValue()) : null, valueOf);
                        Integer scoreByPeriodName2 = Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName(event.getLastPeriod());
                        this.z = new jfj(4, scoreByPeriodName2 != null ? String.valueOf(scoreByPeriodName2.intValue()) : null, valueOf);
                        break;
                    }
                }
                s9a.C(this, event);
                break;
            case -1160328212:
                break;
            case -433846249:
                break;
            case 203883450:
                break;
            default:
                s9a.C(this, event);
                break;
        }
    }
}
