package oe0;

import android.location.LocationManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: oe0.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8709H extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LocationManager f78127b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ I f78128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8709H(LocationManager locationManager, I i11) {
        super(1);
        this.f78127b = locationManager;
        this.f78128c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        this.f78127b.removeUpdates(this.f78128c);
        return Unit.f71690a;
    }
}
