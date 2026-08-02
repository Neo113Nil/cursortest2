package ru.ozon.app.android.geo.map.presentation.viewmapper;

import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.geo.map.presentation.mapicons.MapIconProvider;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapViewWrapper$moveToPoint$1$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ CameraPositionModel $cameraPosition;
    final /* synthetic */ Function0<Unit> $endAction;
    final /* synthetic */ AddressEditMapViewWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewWrapper$moveToPoint$1$1$1(AddressEditMapViewWrapper addressEditMapViewWrapper, CameraPositionModel cameraPositionModel, Function0<Unit> function0) {
        super(1);
        this.this$0 = addressEditMapViewWrapper;
        this.$cameraPosition = cameraPositionModel;
        this.$endAction = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        Float f7;
        MapIconProvider mapIconProvider;
        if (this.this$0.getSubscribeOwner().getLifecycle().b() != AbstractC5434v.b.DESTROYED) {
            f7 = this.this$0.pinsCachingZoom;
            if (!Intrinsics.b(f7, this.$cameraPosition.getZoom())) {
                this.this$0.pinsCachingZoom = Float.valueOf(this.$cameraPosition.getZoom());
                mapIconProvider = this.this$0.iconProvider;
                mapIconProvider.clearPlacemarksCache();
            }
            Function0<Unit> function0 = this.$endAction;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }
}
