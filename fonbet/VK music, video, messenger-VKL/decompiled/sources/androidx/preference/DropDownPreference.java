package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import xsna.tyc0;

/* loaded from: classes12.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter b0;
    public Spinner c0;
    public final a d0;

    public DropDownPreference(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.preference.ListPreference
    public final void Q(@NonNull CharSequence[] charSequenceArr) {
        this.W = charSequenceArr;
        ArrayAdapter arrayAdapter = this.b0;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr2 = this.W;
        if (charSequenceArr2 != null) {
            for (CharSequence charSequence : charSequenceArr2) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void o() {
        super.o();
        ArrayAdapter arrayAdapter = this.b0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void s(@NonNull tyc0 tyc0Var) {
        int i;
        Spinner spinner = (Spinner) tyc0Var.itemView.findViewById(R.id.spinner);
        this.c0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.b0);
        this.c0.setOnItemSelectedListener(this.d0);
        Spinner spinner2 = this.c0;
        String str = this.Y;
        CharSequence[] charSequenceArr = this.X;
        if (str != null && charSequenceArr != null) {
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
        super.s(tyc0Var);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void t() {
        this.c0.performClick();
    }

    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.dropdownPreferenceStyle);
    }

    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d0 = new a();
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.b0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.W;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                DropDownPreference dropDownPreference = DropDownPreference.this;
                String charSequence = dropDownPreference.X[i].toString();
                if (charSequence.equals(dropDownPreference.Y) || !dropDownPreference.a(charSequence)) {
                    return;
                }
                dropDownPreference.R(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
