package f1;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f62431a = new d();

    public final AutofillId a(@NotNull ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    public final boolean b(@NotNull AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public final boolean c(@NotNull AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public final boolean d(@NotNull AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public final boolean e(@NotNull AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public final void f(@NotNull ViewStructure viewStructure, @NotNull String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(@NotNull ViewStructure viewStructure, @NotNull AutofillId autofillId, int i11) {
        viewStructure.setAutofillId(autofillId, i11);
    }

    public final void h(@NotNull ViewStructure viewStructure, int i11) {
        viewStructure.setAutofillType(i11);
    }

    @NotNull
    public final CharSequence i(@NotNull AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
