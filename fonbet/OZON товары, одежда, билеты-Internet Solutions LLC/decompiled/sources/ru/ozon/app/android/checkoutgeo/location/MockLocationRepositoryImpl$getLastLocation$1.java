package ru.ozon.app.android.checkoutgeo.location;

import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "it", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Landroid/location/Location;)Landroid/location/Location;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class MockLocationRepositoryImpl$getLastLocation$1 extends AbstractC7737t implements Function1<Location, Location> {
    final /* synthetic */ MockLocationRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockLocationRepositoryImpl$getLastLocation$1(MockLocationRepositoryImpl mockLocationRepositoryImpl) {
        super(1);
        this.this$0 = mockLocationRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Location invoke(Location it) {
        Location mockLocation;
        Intrinsics.checkNotNullParameter(it, "it");
        mockLocation = this.this$0.getMockLocation();
        return mockLocation;
    }
}
