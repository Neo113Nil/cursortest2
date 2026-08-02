package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.material.textfield.TextInputLayout;
import com.sofascore.results.dialog.TransferFilterModal;
import com.sofascore.results.feedback.FeedbackActivity;
import com.sofascore.results.main.search.SearchActivity;
import com.sofascore.results.profile.edit.ProfileEditFragment;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ql4 implements TextWatcher {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ql4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                editable.getClass();
                EditText editText = (EditText) obj;
                editText.removeTextChangedListener(this);
                try {
                    String obj2 = editable.toString();
                    if (StringsKt.J(obj2, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, false) || StringsKt.J(obj2, ".", false)) {
                        obj2 = new Regex("[.,]").replace(obj2, "");
                    }
                    editText.setText(String.format(dla.d(), "%,d", Arrays.copyOf(new Object[]{Long.valueOf(Long.parseLong(obj2))}, 1)));
                    editText.setSelection(editText.getText().toString().length());
                } catch (NumberFormatException unused) {
                }
                editText.addTextChangedListener(this);
                break;
            case 1:
                FeedbackActivity feedbackActivity = (FeedbackActivity) obj;
                CharSequence l0 = editable != null ? StringsKt.l0(editable) : null;
                if (l0 != null && !StringsKt.R(l0)) {
                    int i2 = FeedbackActivity.M;
                    feedbackActivity.M().k.setEnabled(feedbackActivity.N() && feedbackActivity.O());
                    feedbackActivity.N();
                    break;
                }
                break;
            case 2:
                ProfileEditFragment profileEditFragment = (ProfileEditFragment) obj;
                px0 px0Var = profileEditFragment.z;
                if (!profileEditFragment.D() && !profileEditFragment.C()) {
                    r1 = false;
                }
                px0Var.f(r1);
                break;
            case 3:
                String obj3 = StringsKt.l0(String.valueOf(editable)).toString();
                int i3 = SearchActivity.Q;
                ((SearchActivity) obj).S().g.l(obj3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                charSequence.getClass();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Boolean bool;
        int i4 = this.a;
        Object obj = this.b;
        switch (i4) {
            case 0:
                charSequence.getClass();
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                ((SearchView) obj).onTextChanged(charSequence);
                return;
            default:
                TransferFilterModal transferFilterModal = (TransferFilterModal) obj;
                js2 js2Var = transferFilterModal.x;
                rq3 rq3Var = null;
                if (js2Var == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                TextInputLayout textInputLayout = (TextInputLayout) js2Var.n;
                if (charSequence != null) {
                    bool = Boolean.valueOf(charSequence.length() > 0);
                } else {
                    bool = null;
                }
                textInputLayout.setEndIconVisible(Intrinsics.c(bool, Boolean.TRUE));
                transferFilterModal.A = null;
                uvj F = transferFilterModal.F();
                Context requireContext = transferFilterModal.requireContext();
                requireContext.getClass();
                xw3.L(un0.z(F), null, null, new jk((Serializable) String.valueOf(charSequence != null ? StringsKt.l0(charSequence) : null), (ltk) F, (Object) requireContext, rq3Var, 24), 3);
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
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
