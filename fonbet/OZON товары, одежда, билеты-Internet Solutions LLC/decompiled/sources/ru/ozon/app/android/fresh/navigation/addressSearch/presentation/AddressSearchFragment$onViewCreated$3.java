package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import android.widget.SearchView;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import ru.ozon.app.android.utils.KeyboardUtilsKt;

@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"ru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchFragment$onViewCreated$3", "Landroid/widget/SearchView$OnQueryTextListener;", "Landroidx/appcompat/widget/SearchView$l;", "", SearchIntents.EXTRA_QUERY, "", "onQueryTextSubmit", "(Ljava/lang/String;)Z", "newText", "onQueryTextChange", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressSearchFragment$onViewCreated$3 implements SearchView.OnQueryTextListener, SearchView.l {
    final /* synthetic */ AddressSearchFragment this$0;

    AddressSearchFragment$onViewCreated$3(AddressSearchFragment addressSearchFragment) {
        this.this$0 = addressSearchFragment;
    }

    @Override // android.widget.SearchView.OnQueryTextListener, androidx.appcompat.widget.SearchView.l
    public boolean onQueryTextChange(String newText) {
        if (newText == null) {
            return true;
        }
        AddressSearchFragment addressSearchFragment = this.this$0;
        addressSearchFragment.getViewModel().onQueryChanged(newText);
        addressSearchFragment.switchLayouts(newText);
        return true;
    }

    @Override // android.widget.SearchView.OnQueryTextListener, androidx.appcompat.widget.SearchView.l
    public boolean onQueryTextSubmit(String query) {
        if (query == null) {
            return true;
        }
        if (query.length() < 2) {
            query = null;
        }
        if (query == null) {
            return true;
        }
        AddressSearchFragment addressSearchFragment = this.this$0;
        KeyboardUtilsKt.hideKeyboard(addressSearchFragment);
        if (addressSearchFragment.getContext() == null) {
            return true;
        }
        addressSearchFragment.getViewModel().onQueryChanged(query);
        return true;
    }
}
