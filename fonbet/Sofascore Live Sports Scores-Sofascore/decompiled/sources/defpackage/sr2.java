package defpackage;

import android.content.Context;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.model.newNetwork.Question;
import com.sofascore.results.R;
import com.sofascore.results.main.SurveyActivity;
import com.sofascore.results.settings.deleteAccount.DeleteAccountActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class sr2 implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sr2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = this.a;
        int i3 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                ez0 ez0Var = (ez0) obj2;
                Context context = (Context) obj;
                radioGroup.getClass();
                ((TextInputEditText) ez0Var.d).clearFocus();
                MaterialButton materialButton = (MaterialButton) ez0Var.c;
                materialButton.setEnabled(radioGroup.getCheckedRadioButtonId() != -1);
                if (materialButton.isEnabled()) {
                    z8e.V(context.getColor(R.color.error), materialButton);
                    return;
                }
                return;
            case 1:
                DeleteAccountActivity deleteAccountActivity = (DeleteAccountActivity) obj;
                int i4 = DeleteAccountActivity.N;
                radioGroup.getClass();
                ((MaterialButton) ((e92) obj2).b).setEnabled(true);
                if (i == R.id.radio_something_else) {
                    deleteAccountActivity.M = ww4.SOMETHING_ELSE;
                    return;
                } else if (i == R.id.radio_too_many) {
                    deleteAccountActivity.M = ww4.TOO_MANY_ACCOUNTS;
                    return;
                } else {
                    if (i == R.id.radio_no_value) {
                        deleteAccountActivity.M = ww4.NO_VALUE;
                        return;
                    }
                    return;
                }
            default:
                SurveyActivity surveyActivity = (SurveyActivity) obj2;
                Question question = (Question) obj;
                int i5 = SurveyActivity.L;
                radioGroup.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = new tsk(surveyActivity.N().d).iterator();
                while (true) {
                    usk uskVar = (usk) it;
                    if (!uskVar.hasNext()) {
                        surveyActivity.M(!arrayList.isEmpty(), question.getId(), arrayList, null);
                        return;
                    }
                    int i6 = i3 + 1;
                    if (i3 < 0) {
                        b.q();
                        throw null;
                    }
                    Object next = uskVar.next();
                    next.getClass();
                    if (((RadioButton) next).isChecked()) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                    i3 = i6;
                }
        }
    }
}
