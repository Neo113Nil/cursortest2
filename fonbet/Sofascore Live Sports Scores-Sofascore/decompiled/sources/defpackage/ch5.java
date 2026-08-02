package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.sofascore.results.player.EditPlayerDialog;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ch5 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditPlayerDialog b;

    public /* synthetic */ ch5(EditPlayerDialog editPlayerDialog, int i) {
        this.a = i;
        this.b = editPlayerDialog;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.a;
        EditPlayerDialog editPlayerDialog = this.b;
        switch (i) {
            case 0:
                editPlayerDialog.B().i = StringsKt.l0(String.valueOf(editable)).toString();
                break;
            case 1:
                editPlayerDialog.B().p = me4.h("\\D", String.valueOf(editable), "");
                break;
            case 2:
                editPlayerDialog.B().k = StringsKt.toIntOrNull(StringsKt.l0(String.valueOf(editable)).toString());
                break;
            case 3:
                editPlayerDialog.B().j = StringsKt.l0(String.valueOf(editable)).toString();
                break;
            default:
                editPlayerDialog.B().l = StringsKt.l0(String.valueOf(editable)).toString();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
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
}
