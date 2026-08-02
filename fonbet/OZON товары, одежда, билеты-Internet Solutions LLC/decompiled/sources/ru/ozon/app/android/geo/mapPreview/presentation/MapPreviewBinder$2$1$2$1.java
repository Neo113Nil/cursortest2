package ru.ozon.app.android.geo.mapPreview.presentation;

import android.graphics.Bitmap;
import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.geo.mapPreview.data.Pin;
import ru.ozon.app.android.mapcommon.mapcommon.OzonMapControllerWrapper;
import ru.ozon.app.android.pinlocator.PinLocator;
import we0.InterfaceC10542A;
import we0.m;
import we0.u;
import we0.z;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "placemarkIcon", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MapPreviewBinder$2$1$2$1 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ Pin $pin;
    final /* synthetic */ MapPreviewBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapPreviewBinder$2$1$2$1(MapPreviewBinder mapPreviewBinder, Pin pin) {
        super(1);
        this.this$0 = mapPreviewBinder;
        this.$pin = pin;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap placemarkIcon) {
        OzonMapControllerWrapper ozonMapControllerWrapper;
        Intrinsics.checkNotNullParameter(placemarkIcon, "placemarkIcon");
        ozonMapControllerWrapper = this.this$0.ozonMapController;
        ozonMapControllerWrapper.insertPlacemark(new u(new m(this.$pin.getCoordinates().getLatitude(), this.$pin.getCoordinates().getLongitude()), new z(new InterfaceC10542A.c(placemarkIcon), new PointF((float) this.$pin.getAnchorPoint().getX(), (float) this.$pin.getAnchorPoint().getY()), false, false, 0.0f, 0.0f, 0.0f, 252), PinLocator.Placemark.INSTANCE, null, null, 1016));
    }
}
