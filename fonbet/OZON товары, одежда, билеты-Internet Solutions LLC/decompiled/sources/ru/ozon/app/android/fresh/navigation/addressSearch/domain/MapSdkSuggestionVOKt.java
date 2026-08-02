package ru.ozon.app.android.fresh.navigation.addressSearch.domain;

import He0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHe0/a;", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;", "toVo", "(LHe0/a;)Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;", "navigation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapSdkSuggestionVOKt {
    @NotNull
    public static final MapSdkSuggestionVO toVo(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new MapSdkSuggestionVO(aVar.e().toString(), null, aVar.c().toString());
    }
}
