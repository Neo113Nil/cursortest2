package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import we0.h;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwe0/h;", "update", "", "invoke", "(Lwe0/h;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsMapViewV2$cameraChangeListener$1 extends AbstractC7737t implements Function1<h, Unit> {
    final /* synthetic */ HotelsMapViewV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapViewV2$cameraChangeListener$1(HotelsMapViewV2 hotelsMapViewV2) {
        super(1);
        this.this$0 = hotelsMapViewV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(h hVar) {
        invoke2(hVar);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r4.b() == we0.EnumC10550f.APPLICATION) goto L17;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(h update) {
        boolean z11;
        Boolean bool;
        boolean z12;
        boolean z13;
        boolean performZoom;
        Intrinsics.checkNotNullParameter(update, "update");
        if (update.c()) {
            this.this$0.updateZoomButtons();
            this.this$0.isZoomingInProcess = false;
            z11 = this.this$0.isZoomingByZoomControls;
            if (z11) {
                HotelsMapViewV2 hotelsMapViewV2 = this.this$0;
                performZoom = hotelsMapViewV2.performZoom(hotelsMapViewV2.getController());
                if (performZoom) {
                    return;
                }
            }
            bool = this.this$0.isSerpPage;
            if (!Intrinsics.d(bool, Boolean.FALSE)) {
                z12 = this.this$0.isMoveToUserLocation;
                if (!z12) {
                    z13 = this.this$0.isZoomingByZoomControls;
                    if (!z13) {
                    }
                }
                HotelsMapViewV2.updateMap$default(this.this$0, false, null, 2, null);
            }
            this.this$0.isMoveToUserLocation = false;
            this.this$0.previousClickedPinId = null;
            this.this$0.isZoomingByZoomControls = false;
        }
    }
}
