package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f implements View.OnKeyListener {
    public final /* synthetic */ SearchView a;

    public f(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.a;
        if (searchView.mSearchable != null) {
            if (searchView.mSearchSrcTextView.isPopupShowing() && searchView.mSearchSrcTextView.getListSelection() != -1) {
                return searchView.onSuggestionsKey(view, i, keyEvent);
            }
            if (TextUtils.getTrimmedLength(searchView.mSearchSrcTextView.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                view.cancelLongPress();
                searchView.launchQuerySearch(0, null, searchView.mSearchSrcTextView.getText().toString());
                return true;
            }
        }
        return false;
    }
}
