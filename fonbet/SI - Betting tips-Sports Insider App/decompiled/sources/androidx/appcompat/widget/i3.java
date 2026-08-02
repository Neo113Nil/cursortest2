package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i3 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f778a;

    public i3(SearchView searchView) {
        this.f778a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f778a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f639a;
        if (view == searchView.f643e) {
            searchView.o(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f661w;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f645g) {
            searchView.e();
            return;
        }
        if (view == searchView.f644f) {
            searchView.i();
            return;
        }
        if (view != searchView.f647h) {
            if (view == searchAutoComplete) {
                searchView.d();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.J;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.c(searchView.f658t, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f657s);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            io.sentry.android.core.w0.m("SearchView", "Could not find voice search activity");
        }
    }
}
