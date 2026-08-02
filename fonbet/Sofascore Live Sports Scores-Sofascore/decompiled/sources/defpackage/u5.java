package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sofascore.model.chat.Message;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class u5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u5(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int i2 = this.a;
        Object obj = this.d;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                Message message = (Message) obj;
                Function2 function2 = ((nr2) obj2).m;
                if (function2 != null) {
                    function2.invoke(message, Integer.valueOf(i3));
                    return;
                }
                return;
            case 1:
                ((Function2) ((r7) obj2).e).invoke(Integer.valueOf(i3), obj);
                return;
            case 2:
                ((Function2) ((c8) obj2).c).invoke(Integer.valueOf(i3), (Event) obj);
                return;
            case 3:
                Stage stage = (Stage) obj2;
                t93 t93Var = (t93) obj;
                List list = t93Var.g;
                List<Stage> substages = stage.getSubstages();
                if (substages != null) {
                    int i4 = 0;
                    i = 0;
                    for (Object obj3 : substages) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            b.q();
                            throw null;
                        }
                        Stage stage2 = (Stage) obj3;
                        Stage currentSubstage = stage.getCurrentSubstage();
                        if (currentSubstage != null && stage2.getId() == currentSubstage.getId()) {
                            i = i4;
                        }
                        i4 = i5;
                    }
                } else {
                    i = 0;
                }
                z3f z3fVar = (z3f) t93Var.f.h;
                boolean contains = list.contains(Integer.valueOf(i3));
                boolean z = !contains;
                Integer valueOf = Integer.valueOf(i3);
                if (contains) {
                    list.remove(valueOf);
                } else {
                    list.add(valueOf);
                }
                ((ImageView) z3fVar.c).setRotation(!contains ? 180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Iterator it = new tsk((LinearLayout) z3fVar.d).iterator();
                int i6 = 0;
                while (true) {
                    usk uskVar = (usk) it;
                    if (!uskVar.hasNext()) {
                        return;
                    }
                    Object next = uskVar.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        b.q();
                        throw null;
                    }
                    ((View) next).setVisibility(i6 == i * 2 ? true : z ? 0 : 8);
                    i6 = i7;
                }
                break;
            case 4:
                ml8 ml8Var = (ml8) obj2;
                Team team = (Team) obj;
                ct8 ct8Var = ml8Var.e;
                if (ct8Var != null) {
                    ct8Var.invoke(ml8Var.getSelectedShot().getPlayer(), Integer.valueOf(i3), team);
                    return;
                }
                return;
            default:
                q56 q56Var = (q56) obj;
                ct8 ct8Var2 = (ct8) ((vh) obj2).e;
                if (ct8Var2 != null) {
                    view.getClass();
                    ct8Var2.invoke(view, Integer.valueOf(i3), q56Var);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ u5(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
