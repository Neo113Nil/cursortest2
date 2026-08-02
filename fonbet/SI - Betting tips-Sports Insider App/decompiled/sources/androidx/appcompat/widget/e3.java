package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e3 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f741a;

    public e3(SearchView searchView) {
        this.f741a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
        SearchView searchView = this.f741a;
        Editable text = searchView.f639a.getText();
        searchView.G = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.n(!isEmpty);
        int i12 = 8;
        if (searchView.F && !searchView.f663y && isEmpty) {
            searchView.f644f.setVisibility(8);
            i12 = 0;
        }
        searchView.f647h.setVisibility(i12);
        searchView.j();
        searchView.m();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
    }
}
