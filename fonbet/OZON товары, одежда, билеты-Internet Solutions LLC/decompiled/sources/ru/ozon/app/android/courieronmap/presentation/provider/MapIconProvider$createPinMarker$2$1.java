package ru.ozon.app.android.courieronmap.presentation.provider;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;
import ru.ozon.app.android.courieronmap.databinding.ItemPinBinding;
import ru.ozon.app.android.courieronmap.presentation.vo.CourierOnMapVO;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.pinlocator.PinLocator;
import we0.InterfaceC10542A;
import we0.u;
import we0.z;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class MapIconProvider$createPinMarker$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CourierOnMapVO.PinInfo $pinInfo;
    final /* synthetic */ ItemPinBinding $this_with;
    final /* synthetic */ MapIconProvider this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pinBitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.courieronmap.presentation.provider.MapIconProvider$createPinMarker$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Bitmap, Unit> {
        final /* synthetic */ CourierOnMapVO.PinInfo $pinInfo;
        final /* synthetic */ J $xAnchor;
        final /* synthetic */ J $zIndex;
        final /* synthetic */ MapIconProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CourierOnMapVO.PinInfo pinInfo, MapIconProvider mapIconProvider, J j11, J j12) {
            super(1);
            this.$pinInfo = pinInfo;
            this.this$0 = mapIconProvider;
            this.$xAnchor = j11;
            this.$zIndex = j12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            invoke2(bitmap);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Bitmap pinBitmap) {
            OzonMapController ozonMapController;
            u uVar;
            u uVar2;
            OzonMapController ozonMapController2;
            Intrinsics.checkNotNullParameter(pinBitmap, "pinBitmap");
            if (this.$pinInfo.getIsCourier()) {
                uVar = this.this$0.courierPin;
                if (uVar != null) {
                    uVar2 = this.this$0.courierPin;
                    if (uVar2 != null) {
                        ozonMapController2 = this.this$0.mapController;
                        ozonMapController2.updateMarker(u.a(uVar2, null, z.a(uVar2.d(), new InterfaceC10542A.c(pinBitmap), null, false, 0.0f, 0.0f, 254), null, null, 1021));
                        return;
                    }
                    return;
                }
            }
            ozonMapController = this.this$0.mapController;
            u uVar3 = new u(this.$pinInfo.getCoordinates(), new z(new InterfaceC10542A.c(pinBitmap), new PointF(this.$xAnchor.f71784a, 0.5f), false, false, 0.0f, this.$zIndex.f71784a, 0.0f, 220), this.$pinInfo.getIsCourier() ? PinLocator.Courier.INSTANCE : PinLocator.User.INSTANCE, this.$pinInfo.getId(), null, 1008);
            CourierOnMapVO.PinInfo pinInfo = this.$pinInfo;
            MapIconProvider mapIconProvider = this.this$0;
            if (pinInfo.getIsCourier()) {
                mapIconProvider.courierPin = uVar3;
            } else {
                mapIconProvider.customerPin = uVar3;
            }
            ozonMapController.insertPlacemark(uVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapIconProvider$createPinMarker$2$1(CourierOnMapVO.PinInfo pinInfo, ItemPinBinding itemPinBinding, MapIconProvider mapIconProvider) {
        super(0);
        this.$pinInfo = pinInfo;
        this.$this_with = itemPinBinding;
        this.this$0 = mapIconProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        BitmapProcessor bitmapProcessor;
        J j11 = new J();
        J j12 = new J();
        j12.f71784a = 0.5f;
        String caption = this.$pinInfo.getCaption();
        if (caption != null && caption.length() != 0) {
            j12.f71784a = (this.$this_with.pinIv.getMeasuredWidth() * 0.5f) / this.$this_with.getConstraintLayout().getMeasuredWidth();
            j11.f71784a = 1.0f;
        }
        bitmapProcessor = this.this$0.bitmapProcessor;
        FrameLayout constraintLayout = this.$this_with.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        bitmapProcessor.shadeBitmap(constraintLayout, new AnonymousClass1(this.$pinInfo, this.this$0, j12, j11));
    }
}
