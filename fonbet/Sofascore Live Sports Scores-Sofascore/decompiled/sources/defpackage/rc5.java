package defpackage;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.preference.DropDownPreference;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.results.stagesport.StageCategoryActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rc5 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rc5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        qc5 qc5Var;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                DropDownPreference dropDownPreference = (DropDownPreference) obj;
                if (i >= 0) {
                    String charSequence = dropDownPreference.T[i].toString();
                    if (!charSequence.equals(dropDownPreference.U)) {
                        dropDownPreference.A(charSequence);
                        break;
                    }
                }
                break;
            case 1:
                if (i != -1 && (qc5Var = ((qcb) obj).c) != null) {
                    qc5Var.setListSelectionHidden(false);
                    break;
                }
                break;
            case 2:
                ((SearchView) obj).onItemSelected(i);
                break;
            default:
                adapterView.getClass();
                Adapter adapter = adapterView.getAdapter();
                adapter.getClass();
                StageSeason stageSeason = (StageSeason) ((b8i) adapter).b.get(i);
                int i3 = StageCategoryActivity.R;
                g1i X = ((StageCategoryActivity) obj).X();
                stageSeason.getClass();
                X.j.j(stageSeason);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }

    private final void d(AdapterView adapterView) {
    }
}
