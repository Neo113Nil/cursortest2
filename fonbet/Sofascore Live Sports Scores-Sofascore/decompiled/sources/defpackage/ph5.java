package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.sofascore.results.player.EditPlayerTransferDialog;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ph5 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditPlayerTransferDialog b;

    public /* synthetic */ ph5(EditPlayerTransferDialog editPlayerTransferDialog, int i) {
        this.a = i;
        this.b = editPlayerTransferDialog;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.a;
        EditPlayerTransferDialog editPlayerTransferDialog = this.b;
        switch (i) {
            case 0:
                editPlayerTransferDialog.B().q = StringsKt.l0(String.valueOf(editable)).toString();
                break;
            default:
                editPlayerTransferDialog.B().t = me4.h("\\D", String.valueOf(editable), "");
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
}
