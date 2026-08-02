package ru.ozon.app.android.checkoutgeo.location;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.location.api.ComposerLocationResponse;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/location/api/ComposerLocationResponse$Location;", "response", "Lru/ozon/app/android/location/api/ComposerLocationResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ComposerLocationRepositoryImpl$initLocation$1 extends AbstractC7737t implements Function1<ComposerLocationResponse, ComposerLocationResponse.Location> {
    public static final ComposerLocationRepositoryImpl$initLocation$1 INSTANCE = new ComposerLocationRepositoryImpl$initLocation$1();

    ComposerLocationRepositoryImpl$initLocation$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ComposerLocationResponse.Location invoke(ComposerLocationResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return response.getCurrent();
    }
}
