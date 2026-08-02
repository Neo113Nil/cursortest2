package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import android.content.Context;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.MapSdkSuggestionVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class AddressSearchBinder$setView$1 extends C7735q implements InterfaceC6511n<Context, MapSdkSuggestionVO, Integer, Unit> {
    AddressSearchBinder$setView$1(Object obj) {
        super(3, obj, AddressSearchViewModel.class, "suggestClicked", "suggestClicked(Landroid/content/Context;Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;I)V", 0);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Context context, MapSdkSuggestionVO mapSdkSuggestionVO, Integer num) {
        invoke(context, mapSdkSuggestionVO, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(Context p02, MapSdkSuggestionVO p12, int i11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((AddressSearchViewModel) this.receiver).suggestClicked(p02, p12, i11);
    }
}
