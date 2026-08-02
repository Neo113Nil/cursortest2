package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.permission.PermissionRequest;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/permission/PermissionRequest$Builder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapViewV2$requestLocationPermission$1 extends AbstractC7737t implements Function1<PermissionRequest.Builder, Unit> {
    final /* synthetic */ boolean $isRationaleNeeded;
    final /* synthetic */ HotelsMapViewV2 this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapViewV2$requestLocationPermission$1$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function0<Unit> {
        AnonymousClass1(Object obj) {
            super(0, obj, HotelsMapViewV2.class, "requestLocationSuccess", "requestLocationSuccess()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((HotelsMapViewV2) this.receiver).requestLocationSuccess();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapViewV2$requestLocationPermission$1$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function0<Unit> {
        AnonymousClass2(Object obj) {
            super(0, obj, HotelsMapViewV2.class, "showPermissionRationalErrorRestriction", "showPermissionRationalErrorRestriction()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((HotelsMapViewV2) this.receiver).showPermissionRationalErrorRestriction();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapViewV2$requestLocationPermission$1$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends C7735q implements Function0<Unit> {
        AnonymousClass3(Object obj) {
            super(0, obj, HotelsMapViewV2.class, "showPermissionRationalErrorRestriction", "showPermissionRationalErrorRestriction()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((HotelsMapViewV2) this.receiver).showPermissionRationalErrorRestriction();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapViewV2$requestLocationPermission$1(HotelsMapViewV2 hotelsMapViewV2, boolean z11) {
        super(1);
        this.this$0 = hotelsMapViewV2;
        this.$isRationaleNeeded = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PermissionRequest.Builder builder) {
        invoke2(builder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PermissionRequest.Builder requestPermission) {
        Intrinsics.checkNotNullParameter(requestPermission, "$this$requestPermission");
        requestPermission.permissions("android.permission.ACCESS_FINE_LOCATION");
        requestPermission.onPermissionGranted(new AnonymousClass1(this.this$0));
        requestPermission.showRequestPermissionRationale(this.$isRationaleNeeded, new AnonymousClass2(this.this$0));
        requestPermission.onPermissionDenied(new AnonymousClass3(this.this$0));
    }
}
