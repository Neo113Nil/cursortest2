package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import GZ.g;
import Ib.b;

/* loaded from: classes12.dex */
public final class AddressSearchFragment_MembersInjector implements b<AddressSearchFragment> {
    public static void injectOzonRouter(AddressSearchFragment addressSearchFragment, g gVar) {
        addressSearchFragment.ozonRouter = gVar;
    }

    public static void injectViewModel(AddressSearchFragment addressSearchFragment, AddressSearchViewModel addressSearchViewModel) {
        addressSearchFragment.viewModel = addressSearchViewModel;
    }
}
