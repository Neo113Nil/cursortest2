package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import android.content.Context;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.MapSdkSuggestionVO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "context", "Landroid/content/Context;", "item", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;", "index", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressSearchView$1$1$1 extends AbstractC7737t implements InterfaceC6511n<Context, MapSdkSuggestionVO, Integer, Unit> {
    final /* synthetic */ AddressSearchView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressSearchView$1$1$1(AddressSearchView addressSearchView) {
        super(3);
        this.this$0 = addressSearchView;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Context context, MapSdkSuggestionVO mapSdkSuggestionVO, Integer num) {
        invoke(context, mapSdkSuggestionVO, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(Context context, MapSdkSuggestionVO item, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        InterfaceC6511n<Context, MapSdkSuggestionVO, Integer, Unit> onSuggestClicked = this.this$0.getOnSuggestClicked();
        if (onSuggestClicked != null) {
            onSuggestClicked.invoke(context, item, Integer.valueOf(i11));
        }
    }
}
