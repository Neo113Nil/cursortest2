package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation;

import android.graphics.Bitmap;
import android.graphics.PointF;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.location.GeofenceStatusCodes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ve0.b;
import we0.InterfaceC10542A;
import we0.m;
import we0.u;
import we0.z;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsPageMapPreviewV2WidgetViewHolder$setUpMarker$onBitmapReady$1 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ PointF $pinAnchorPoint;
    final /* synthetic */ m $pinCoordinate;
    final /* synthetic */ b $this_setUpMarker;
    final /* synthetic */ HotelsPageMapPreviewV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsPageMapPreviewV2WidgetViewHolder$setUpMarker$onBitmapReady$1(HotelsPageMapPreviewV2WidgetViewHolder hotelsPageMapPreviewV2WidgetViewHolder, String str, m mVar, PointF pointF, b bVar) {
        super(1);
        this.this$0 = hotelsPageMapPreviewV2WidgetViewHolder;
        this.$cacheKey = str;
        this.$pinCoordinate = mVar;
        this.$pinAnchorPoint = pointF;
        this.$this_setUpMarker = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        i iVar;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        iVar = this.this$0.container;
        if (iVar.Q().g().getLifecycle().b() != AbstractC5434v.b.DESTROYED) {
            this.this$0.cachedMarkerIconCacheKey = this.$cacheKey;
            this.this$0.cachedMarkerIcon = bitmap;
            this.$this_setUpMarker.b().insertPlacemark(new u(this.$pinCoordinate, new z(new InterfaceC10542A.c(bitmap, this.$cacheKey), this.$pinAnchorPoint, false, false, 0.0f, 0.0f, 0.0f, 252), null, null, new HotelsPageMapPreviewV2WidgetViewHolder$setUpMarker$onBitmapReady$1$placemark$1(this.this$0), GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
        }
    }
}
