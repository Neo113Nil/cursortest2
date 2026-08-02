package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.sofascore.results.R;
import com.sofascore.results.player.EditPlayerTransferDialog;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oh5 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditPlayerTransferDialog b;
    public final /* synthetic */ k15 c;

    public /* synthetic */ oh5(EditPlayerTransferDialog editPlayerTransferDialog, k15 k15Var, int i) {
        this.a = i;
        this.b = editPlayerTransferDialog;
        this.c = k15Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                EditPlayerTransferDialog editPlayerTransferDialog = this.b;
                rq3 rq3Var = null;
                editPlayerTransferDialog.v().o = null;
                this.c.d.setEndIconDrawable(R.drawable.ic_search);
                editPlayerTransferDialog.C();
                if (yid.m(editable != null ? Integer.valueOf(editable.length()) : null) <= 2) {
                    ((fh5) editPlayerTransferDialog.E.getValue()).clear();
                    break;
                } else {
                    sh5 v = editPlayerTransferDialog.v();
                    String obj = StringsKt.l0(String.valueOf(editable)).toString();
                    obj.getClass();
                    g9i g9iVar = v.g;
                    if (g9iVar != null) {
                        g9iVar.e(null);
                    }
                    v.g = xw3.L(un0.z(v), null, null, new rh5(v, obj, rq3Var, 0), 3);
                    break;
                }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                break;
            default:
                EditPlayerTransferDialog editPlayerTransferDialog = this.b;
                rq3 rq3Var = null;
                editPlayerTransferDialog.v().p = null;
                this.c.g.setEndIconDrawable(R.drawable.ic_search);
                editPlayerTransferDialog.C();
                if (yid.m(charSequence != null ? Integer.valueOf(charSequence.length()) : null) <= 2) {
                    ((fh5) editPlayerTransferDialog.F.getValue()).clear();
                    break;
                } else {
                    sh5 v = editPlayerTransferDialog.v();
                    String obj = StringsKt.l0(String.valueOf(charSequence)).toString();
                    obj.getClass();
                    g9i g9iVar = v.h;
                    if (g9iVar != null) {
                        g9iVar.e(null);
                    }
                    v.h = xw3.L(un0.z(v), null, null, new rh5(v, obj, rq3Var, 1), 3);
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
}
