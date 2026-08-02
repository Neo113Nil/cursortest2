package defpackage;

import android.content.Context;
import android.text.Editable;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.sofascore.results.R;
import com.sofascore.results.chat.view.ChatMessageInputView;
import com.sofascore.results.feedback.FeedbackActivity;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import com.sofascore.results.player.EditPlayerTransferDialog;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class jr2 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jr2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ChatMessageInputView chatMessageInputView = (ChatMessageInputView) obj;
                int i2 = ChatMessageInputView.x;
                if (z) {
                    chatMessageInputView.o();
                    return;
                }
                return;
            case 1:
                jw2 jw2Var = (jw2) obj;
                jw2Var.s(jw2Var.t());
                return;
            case 2:
                for (EditText editText : (EditText[]) obj) {
                    if (editText.hasFocus()) {
                        return;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    return;
                }
                return;
            case 3:
                ed5 ed5Var = (ed5) obj;
                ed5Var.l = z;
                ed5Var.p();
                if (z) {
                    return;
                }
                ed5Var.s(false);
                ed5Var.m = false;
                return;
            case 4:
                EditPlayerTransferDialog editPlayerTransferDialog = (EditPlayerTransferDialog) obj;
                view.getClass();
                EditText editText2 = (EditText) view;
                String obj2 = editText2.getText().toString();
                if (z) {
                    return;
                }
                if (Patterns.WEB_URL.matcher(obj2).matches()) {
                    editText2.setError(null);
                    return;
                } else {
                    editText2.setError(editPlayerTransferDialog.getString(R.string.not_valid_url));
                    return;
                }
            case 5:
                FeedbackActivity feedbackActivity = (FeedbackActivity) obj;
                int i3 = FeedbackActivity.M;
                if (z) {
                    return;
                }
                view.getClass();
                Editable text = ((EditText) view).getText();
                text.getClass();
                if (StringsKt.R(text)) {
                    return;
                }
                feedbackActivity.O();
                return;
            case 6:
                LeagueEventsFragment leagueEventsFragment = (LeagueEventsFragment) obj;
                if (z) {
                    return;
                }
                krk krkVar = leagueEventsFragment.l;
                krkVar.getClass();
                MaterialAutoCompleteTextView materialAutoCompleteTextView = ((po8) krkVar).j;
                Context context = materialAutoCompleteTextView.getContext();
                context.getClass();
                InputMethodManager inputMethodManager2 = (InputMethodManager) context.getSystemService(InputMethodManager.class);
                if (inputMethodManager2 != null) {
                    inputMethodManager2.hideSoftInputFromWindow(materialAutoCompleteTextView.getWindowToken(), 0);
                    return;
                }
                return;
            case 7:
                tdg tdgVar = (tdg) obj;
                if (tdgVar.v != ndg.b || z) {
                    return;
                }
                sdg sdgVar = tdgVar.n;
                if (sdgVar != null) {
                    sdgVar.requestFocus();
                    return;
                } else {
                    Intrinsics.i("rootLayout");
                    throw null;
                }
            default:
                yhg yhgVar = (yhg) obj;
                if (yhgVar.q != mhg.b || z) {
                    return;
                }
                sdg sdgVar2 = yhgVar.m;
                if (sdgVar2 != null) {
                    sdgVar2.requestFocus();
                    return;
                } else {
                    Intrinsics.i("rootLayout");
                    throw null;
                }
        }
    }
}
