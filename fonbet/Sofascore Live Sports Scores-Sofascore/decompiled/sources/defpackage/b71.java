package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.dialog.BaseSuggestChangesDialog;
import com.sofascore.results.profile.LoginScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class b71 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseSuggestChangesDialog b;

    public /* synthetic */ b71(BaseSuggestChangesDialog baseSuggestChangesDialog, int i) {
        this.a = i;
        this.b = baseSuggestChangesDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        BaseSuggestChangesDialog baseSuggestChangesDialog = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                FragmentActivity requireActivity = baseSuggestChangesDialog.requireActivity();
                requireActivity.getClass();
                View currentFocus = requireActivity.getCurrentFocus();
                if (currentFocus == null) {
                    currentFocus = new View(requireActivity);
                }
                EditText editText = currentFocus instanceof EditText ? (EditText) currentFocus : null;
                if (editText != null) {
                    editText.clearFocus();
                }
                Context context = currentFocus.getContext();
                context.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
                baseSuggestChangesDialog.k(false, false);
                break;
            default:
                int i2 = LoginScreenActivity.M;
                Context requireContext = baseSuggestChangesDialog.requireContext();
                requireContext.getClass();
                requireContext.startActivity(new Intent(requireContext, (Class<?>) LoginScreenActivity.class));
                break;
        }
        return Unit.a;
    }
}
