package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.dialog.TransferFilterModal;
import com.sofascore.results.feedback.FeedbackActivity;
import com.sofascore.results.player.details.view.PlayerCompareView;
import com.sofascore.results.player.statistics.compare.search.CompareSearchModal;
import com.sofascore.results.team.editteam.EditTeamDialog;
import com.sofascore.results.view.SofaTextInputLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i63 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i63(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        CharSequence l0;
        int i = this.a;
        r1 = false;
        boolean z = false;
        Boolean bool = null;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                fdi fdiVar = ((p63) ((CompareSearchModal) obj).B.getValue()).g;
                if (editable == null || (l0 = StringsKt.l0(editable)) == null || (str = l0.toString()) == null) {
                    str = "";
                }
                fdiVar.getClass();
                fdiVar.m(null, str);
                ImageView imageView = (ImageView) ((dd) obj2).c;
                if (editable != null) {
                    bool = Boolean.valueOf(editable.length() > 0);
                }
                imageView.setVisibility(Intrinsics.c(bool, Boolean.TRUE) ? 0 : 8);
                break;
            case 2:
                FeedbackActivity feedbackActivity = (FeedbackActivity) obj2;
                SofaTextInputLayout sofaTextInputLayout = ((fd) obj).d;
                if (sofaTextInputLayout.getError() != null) {
                    int i2 = FeedbackActivity.M;
                    if (feedbackActivity.O()) {
                        sofaTextInputLayout.setError(null);
                    }
                }
                if (editable != null && !StringsKt.R(editable)) {
                    int i3 = FeedbackActivity.M;
                    MaterialButton materialButton = feedbackActivity.M().k;
                    if (feedbackActivity.N() && feedbackActivity.O()) {
                        z = true;
                    }
                    materialButton.setEnabled(z);
                    feedbackActivity.O();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        pme callback;
        Boolean bool;
        int i4 = this.a;
        rq3 rq3Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i4) {
            case 0:
                return;
            case 1:
                EditTeamDialog editTeamDialog = (EditTeamDialog) obj2;
                editTeamDialog.v().k(null);
                l15 l15Var = (l15) obj;
                l15Var.o.setEnabled(false);
                TextInputEditText textInputEditText = l15Var.n;
                textInputEditText.setEnabled(false);
                l15Var.o.setText("");
                textInputEditText.setText("");
                if (charSequence == null || charSequence.length() <= 2) {
                    return;
                }
                di5 v = editTeamDialog.v();
                String obj3 = StringsKt.l0(charSequence.toString()).toString();
                obj3.getClass();
                g9i g9iVar = v.h;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                v.h = xw3.L(un0.z(v), null, null, new ci5(v, obj3, rq3Var, r1 ? 1 : 0), 3);
                return;
            case 2:
                return;
            case 3:
                PlayerCompareView playerCompareView = (PlayerCompareView) obj2;
                if (charSequence != null) {
                    pme callback2 = playerCompareView.getCallback();
                    if (callback2 != null) {
                        ((fl8) ((ujg) callback2).c).invoke();
                    }
                    ((SofaTextInputLayout) playerCompareView.d.d).setEndIconVisible(charSequence.length() > 0);
                    if (charSequence.length() <= 2 || (callback = playerCompareView.getCallback()) == null) {
                        return;
                    }
                    Player player = (Player) obj;
                    String obj4 = StringsKt.l0(charSequence.toString()).toString();
                    player.getClass();
                    obj4.getClass();
                    ((p1) ((ujg) callback).d).invoke(player, obj4);
                    return;
                }
                return;
            default:
                TransferFilterModal transferFilterModal = (TransferFilterModal) obj2;
                js2 js2Var = transferFilterModal.x;
                if (js2Var == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                TextInputLayout textInputLayout = (TextInputLayout) js2Var.g;
                if (charSequence != null) {
                    bool = Boolean.valueOf(charSequence.length() > 0);
                } else {
                    bool = null;
                }
                textInputLayout.setEndIconVisible(Intrinsics.c(bool, Boolean.TRUE));
                transferFilterModal.z = null;
                if ((charSequence != null ? charSequence.length() : 0) >= 0) {
                    new zk2((eh5) obj, 6).filter(charSequence);
                    return;
                }
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
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
