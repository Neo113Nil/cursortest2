package ru.ozon.app.android.mapcommon.mapcommon;

import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mapcommon.map.OzonMapController;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/mapcommon/mapcommon/OzonMapControllerWrapper;", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "Lkotlin/Function1;", "", "", "loading", "Lio/reactivex/b;", "initMap", "(Lkotlin/jvm/functions/Function1;)Lio/reactivex/b;", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface OzonMapControllerWrapper extends OzonMapController {
    @NotNull
    AbstractC7094b initMap(Function1<? super Boolean, Unit> loading);
}
