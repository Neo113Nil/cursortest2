package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.sofascore.results.team.editteam.EditTeamDialog;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zh5 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTeamDialog b;

    public /* synthetic */ zh5(EditTeamDialog editTeamDialog, int i) {
        this.a = i;
        this.b = editTeamDialog;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.a;
        EditTeamDialog editTeamDialog = this.b;
        switch (i) {
            case 0:
                di5 B = editTeamDialog.B();
                String obj = StringsKt.l0(String.valueOf(editable)).toString();
                obj.getClass();
                B.o = obj;
                break;
            case 1:
                break;
            case 2:
                editTeamDialog.B().q = StringsKt.l0(String.valueOf(editable)).toString();
                break;
            case 3:
                di5 B2 = editTeamDialog.B();
                String obj2 = StringsKt.l0(String.valueOf(editable)).toString();
                obj2.getClass();
                B2.p = obj2;
                break;
            case 4:
                editTeamDialog.B().v = StringsKt.l0(String.valueOf(editable)).toString();
                break;
            default:
                editTeamDialog.B().w = StringsKt.toIntOrNull(String.valueOf(editable));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 1:
                EditTeamDialog editTeamDialog = this.b;
                editTeamDialog.B().r = null;
                if (charSequence != null && charSequence.length() > 2) {
                    di5 B = editTeamDialog.B();
                    String obj = StringsKt.l0(charSequence.toString()).toString();
                    obj.getClass();
                    g9i g9iVar = B.g;
                    if (g9iVar != null) {
                        g9iVar.e(null);
                    }
                    B.g = xw3.L(un0.z(B), null, null, new ci5(B, obj, null, 0), 3);
                    break;
                } else {
                    ((uh5) editTeamDialog.E.getValue()).clear();
                    break;
                }
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }
}
