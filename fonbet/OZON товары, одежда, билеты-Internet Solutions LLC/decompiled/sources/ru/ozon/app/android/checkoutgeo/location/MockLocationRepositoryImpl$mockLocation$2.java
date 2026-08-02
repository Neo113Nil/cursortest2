package ru.ozon.app.android.checkoutgeo.location;

import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/location/Location;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MockLocationRepositoryImpl$mockLocation$2 extends AbstractC7737t implements Function0<Location> {
    public static final MockLocationRepositoryImpl$mockLocation$2 INSTANCE = new MockLocationRepositoryImpl$mockLocation$2();

    MockLocationRepositoryImpl$mockLocation$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Location invoke() {
        Location location = new Location("mock_provider");
        location.setLatitude(55.75396d);
        location.setLongitude(37.620393d);
        return location;
    }
}
