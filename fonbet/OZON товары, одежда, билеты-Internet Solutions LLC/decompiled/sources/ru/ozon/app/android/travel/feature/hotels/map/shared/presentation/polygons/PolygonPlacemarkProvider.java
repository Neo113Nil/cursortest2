package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.polygons;

import WZ.t;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.BitmapContainer;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DescriptorCache;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import we0.InterfaceC10542A;
import we0.u;
import we0.z;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR.\u0010\u0013\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/polygons/PolygonPlacemarkProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon$PolygonPin;", "pin", "Landroid/graphics/Bitmap;", "createBitmapFromView", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon$PolygonPin;)Landroid/graphics/Bitmap;", "", "cacheHash", "getBitmapFromCache", "(I)Landroid/graphics/Bitmap;", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "", "onAction", "setOnPinClickListener", "(Lkotlin/jvm/functions/Function2;)V", "Lwe0/u;", "provide", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon$PolygonPin;)Lwe0/u;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DescriptorCache;", "cache", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DescriptorCache;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Lkotlin/jvm/functions/Function2;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PolygonPlacemarkProvider {

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final DescriptorCache cache;
    private Function2<? super AtomAction, ? super t, Unit> onAction;

    public PolygonPlacemarkProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.cache = new DescriptorCache();
        this.badgeView = (BadgeView) q.f64554a.g(N.b(BadgeView.class), context);
    }

    private final Bitmap createBitmapFromView(DistrictsVO.Polygon.PolygonPin pin) {
        BadgeHolderKt.bind$default(this.badgeView, pin.getBadge(), (Function1) null, 2, (Object) null);
        Bitmap bitmap = MapExtKt.getBitmap(this.badgeView);
        this.cache.put(new BitmapContainer(bitmap), pin.getCacheHash());
        return bitmap;
    }

    private final Bitmap getBitmapFromCache(int cacheHash) {
        BitmapContainer bitmapContainer = this.cache.get(cacheHash);
        if (bitmapContainer != null) {
            return bitmapContainer.getBitmap();
        }
        return null;
    }

    @NotNull
    public final u provide(@NotNull DistrictsVO.Polygon.PolygonPin pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Bitmap bitmapFromCache = getBitmapFromCache(pin.getCacheHash());
        if (bitmapFromCache == null) {
            bitmapFromCache = createBitmapFromView(pin);
        }
        return new u(pin.getCoords(), new z(new InterfaceC10542A.c(bitmapFromCache), new PointF(0.5f, 0.5f), false, false, 0.0f, 4.0f, 0.0f, 220), null, pin.getId(), new PolygonPlacemarkProvider$provide$1(this, pin), 992);
    }

    public final void setOnPinClickListener(@NotNull Function2<? super AtomAction, ? super t, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
    }
}
