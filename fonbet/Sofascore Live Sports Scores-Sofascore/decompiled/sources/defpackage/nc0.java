package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.b;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nc0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nc0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CharSequence convertSelectionToString;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                pc0 pc0Var = (pc0) obj;
                b bVar = pc0Var.G;
                bVar.setSelection(i);
                if (bVar.getOnItemClickListener() != null) {
                    bVar.performItemClick(view, i, pc0Var.D.getItemId(i));
                }
                pc0Var.dismiss();
                break;
            case 1:
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) obj;
                qcb qcbVar = materialAutoCompleteTextView.e;
                convertSelectionToString = materialAutoCompleteTextView.convertSelectionToString(i < 0 ? !qcbVar.z.isShowing() ? null : qcbVar.c.getSelectedItem() : materialAutoCompleteTextView.getAdapter().getItem(i));
                materialAutoCompleteTextView.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !qcbVar.z.isShowing() ? null : qcbVar.c.getSelectedView();
                        i = !qcbVar.z.isShowing() ? -1 : qcbVar.c.getSelectedItemPosition();
                        j = !qcbVar.z.isShowing() ? Long.MIN_VALUE : qcbVar.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(qcbVar.c, view, i, j);
                }
                qcbVar.dismiss();
                break;
            default:
                ((SearchView) obj).onItemClicked(i, 0, null);
                break;
        }
    }
}
