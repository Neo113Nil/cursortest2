package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import android.content.Context;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.MapSdkSuggestionVO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<unused var>", "Landroid/content/Context;", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SuggestionsAdapter$onAddressClick$1 extends AbstractC7737t implements InterfaceC6511n<Context, MapSdkSuggestionVO, Integer, Unit> {
    public static final SuggestionsAdapter$onAddressClick$1 INSTANCE = new SuggestionsAdapter$onAddressClick$1();

    SuggestionsAdapter$onAddressClick$1() {
        super(3);
    }

    public final void invoke(Context context, MapSdkSuggestionVO mapSdkSuggestionVO, int i11) {
        Intrinsics.checkNotNullParameter(context, "<unused var>");
        Intrinsics.checkNotNullParameter(mapSdkSuggestionVO, "<unused var>");
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Context context, MapSdkSuggestionVO mapSdkSuggestionVO, Integer num) {
        invoke(context, mapSdkSuggestionVO, num.intValue());
        return Unit.f71690a;
    }
}
