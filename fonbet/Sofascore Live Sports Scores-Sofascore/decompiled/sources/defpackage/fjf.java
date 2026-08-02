package defpackage;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.sofascore.model.newNetwork.Question;
import com.sofascore.results.main.SurveyActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fjf implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fjf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                compoundButton.getClass();
                bjf bjfVar = ((ejf) obj2).a;
                Context context = ((ja9) obj).b;
                bjfVar.getClass();
                context.getClass();
                n9e.u(context, new sx0(bjfVar, z, 6));
                return;
            case 1:
                yig yigVar = (yig) obj;
                compoundButton.getClass();
                Function1 function1 = ((rig) obj2).b;
                if (function1 != null) {
                    function1.invoke(yigVar);
                    return;
                }
                return;
            default:
                SurveyActivity surveyActivity = (SurveyActivity) obj2;
                Question question = (Question) obj;
                int i2 = SurveyActivity.L;
                compoundButton.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = new tsk(surveyActivity.N().c).iterator();
                int i3 = 0;
                while (true) {
                    usk uskVar = (usk) it;
                    if (!uskVar.hasNext()) {
                        surveyActivity.M(!arrayList.isEmpty(), question.getId(), arrayList, null);
                        return;
                    }
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        b.q();
                        throw null;
                    }
                    Object next = uskVar.next();
                    next.getClass();
                    if (((CheckBox) next).isChecked()) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                    i3 = i4;
                }
        }
    }
}
