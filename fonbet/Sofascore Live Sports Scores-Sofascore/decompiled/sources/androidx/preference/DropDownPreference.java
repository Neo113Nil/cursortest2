package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import defpackage.c5f;
import defpackage.rc5;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final Context X;
    public final ArrayAdapter Y;
    public Spinner Z;
    public final rc5 a0;

    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.a0 = new rc5(this, 0);
        this.X = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.Y = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.S;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void g() {
        super.g();
        ArrayAdapter arrayAdapter = this.Y;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void k(c5f c5fVar) {
        int i;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) c5fVar.itemView.findViewById(R.id.spinner);
        this.Z = spinner;
        spinner.setAdapter((SpinnerAdapter) this.Y);
        this.Z.setOnItemSelectedListener(this.a0);
        Spinner spinner2 = this.Z;
        String str = this.U;
        if (str != null && (charSequenceArr = this.T) != null) {
            i = charSequenceArr.length - 1;
            while (i >= 0) {
                if (TextUtils.equals(charSequenceArr[i].toString(), str)) {
                    break;
                } else {
                    i--;
                }
            }
        }
        i = -1;
        spinner2.setSelection(i);
        super.k(c5fVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void l() {
        this.Z.performClick();
    }
}
