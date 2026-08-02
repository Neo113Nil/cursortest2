package defpackage;

import android.os.CountDownTimer;
import android.widget.ImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import com.sofascore.results.tutorial.AbstractTutorialActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uyf extends CountDownTimer {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyf(long j, u2k u2kVar) {
        super(j, 10L);
        this.b = u2kVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((vyf) obj).onFinish();
                break;
            case 1:
                ((StageDetailsResultsFragment) obj).I();
                break;
            case 2:
                bhi bhiVar = (bhi) obj;
                ((ImageView) bhiVar.f.c).setVisibility(0);
                ((ImageView) bhiVar.q.c).setVisibility(0);
                break;
            default:
                u2k u2kVar = (u2k) obj;
                u2kVar.g = null;
                u2kVar.f = null;
                AbstractTutorialActivity abstractTutorialActivity = u2kVar.h;
                u2kVar.h = null;
                if (abstractTutorialActivity != null) {
                    abstractTutorialActivity.X(1.0d);
                }
                if (abstractTutorialActivity != null) {
                    List q = i5h.q(new tsk(abstractTutorialActivity.R().e));
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : q) {
                        if (obj2 instanceof LinearProgressIndicator) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                        } else if (((LinearProgressIndicator) it.next()).getProgress() >= 100) {
                            i2++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i2);
                    if (i2 < 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        AbstractTutorialActivity.Z(abstractTutorialActivity, valueOf.intValue(), i8.a);
                        ((u2k) abstractTutorialActivity.K.getValue()).k(7000L, null, abstractTutorialActivity);
                        break;
                    } else {
                        abstractTutorialActivity.finish();
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                ((StageDetailsResultsFragment) obj).I();
                break;
            case 2:
                break;
            default:
                u2k u2kVar = (u2k) obj;
                u2kVar.f = Long.valueOf(j);
                Long l = u2kVar.g;
                if (l != null) {
                    long longValue = l.longValue();
                    long j2 = longValue - j;
                    AbstractTutorialActivity abstractTutorialActivity = u2kVar.h;
                    if (abstractTutorialActivity != null) {
                        abstractTutorialActivity.X(j2 / longValue);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyf(long j, vyf vyfVar) {
        super(j, 1000L);
        this.b = vyfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyf(bhi bhiVar) {
        super(5000L, 5000L);
        this.b = bhiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyf(StageDetailsResultsFragment stageDetailsResultsFragment, long j) {
        super(j, 1000L);
        this.b = stageDetailsResultsFragment;
    }

    private final void a(long j) {
    }

    private final void b(long j) {
    }
}
