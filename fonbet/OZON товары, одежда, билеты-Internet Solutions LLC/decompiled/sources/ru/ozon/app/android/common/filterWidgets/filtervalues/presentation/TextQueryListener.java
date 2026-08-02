package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation;

import androidx.appcompat.widget.SearchView;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/TextQueryListener;", "Landroidx/appcompat/widget/SearchView$l;", "<init>", "()V", "", SearchIntents.EXTRA_QUERY, "", "onQueryTextSubmit", "(Ljava/lang/String;)Z", "newText", "onQueryTextChange", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public class TextQueryListener implements SearchView.l {
    @Override // androidx.appcompat.widget.SearchView.l
    public boolean onQueryTextChange(String newText) {
        return false;
    }

    @Override // androidx.appcompat.widget.SearchView.l
    public boolean onQueryTextSubmit(String query) {
        return false;
    }
}
