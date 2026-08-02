package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j3 implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f801a;

    public j3(SearchView searchView) {
        this.f801a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i5, KeyEvent keyEvent) {
        SearchView searchView = this.f801a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f639a;
        if (searchView.J != null) {
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i5 == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.b("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.J != null && searchView.f664z != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i5 == 66 || i5 == 84 || i5 == 61) {
                    searchView.f(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i5 == 21 || i5 == 22) {
                    searchAutoComplete.setSelection(i5 == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                    return true;
                }
                if (i5 == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
