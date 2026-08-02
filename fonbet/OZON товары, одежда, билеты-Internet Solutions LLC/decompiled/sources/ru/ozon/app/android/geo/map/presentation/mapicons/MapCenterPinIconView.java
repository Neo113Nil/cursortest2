package ru.ozon.app.android.geo.map.presentation.mapicons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import androidx.vectordrawable.graphics.drawable.e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.databinding.MapPinCenterContainerBinding;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/MapCenterPinIconView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;", "target", "Landroid/graphics/Bitmap;", "resource", "Landroidx/vectordrawable/graphics/drawable/e;", "drawable", "Lkotlin/Pair;", "pinSize", "", "bind", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;Landroid/graphics/Bitmap;Landroidx/vectordrawable/graphics/drawable/e;Lkotlin/Pair;)V", "Lru/ozon/app/android/geo/databinding/MapPinCenterContainerBinding;", "binding", "Lru/ozon/app/android/geo/databinding/MapPinCenterContainerBinding;", "Landroid/widget/ImageView;", "iconIv", "Landroid/widget/ImageView;", "getIconIv", "()Landroid/widget/ImageView;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapCenterPinIconView extends ConstraintLayout {

    @NotNull
    private final MapPinCenterContainerBinding binding;

    @NotNull
    private final ImageView iconIv;

    public /* synthetic */ MapCenterPinIconView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bind(@NotNull AddressEditMapVO.Pin target, Bitmap resource, e drawable, @NotNull Pair<Integer, Integer> pinSize) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(pinSize, "pinSize");
        int intValue = pinSize.a().intValue();
        int intValue2 = pinSize.b().intValue();
        ViewGroup.LayoutParams layoutParams = this.iconIv.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = intValue;
        }
        if (layoutParams != null) {
            layoutParams.height = intValue2;
        }
        this.binding.clusterCountTv.setText(target.getPinsCount());
        if (resource != null) {
            this.iconIv.setImageBitmap(resource);
        } else {
            this.iconIv.setImageDrawable(drawable);
        }
        AddressEditMapVO.Pin.Badge badge = target.getBadge();
        if (badge == null) {
            View badgeV = this.binding.badgeV;
            Intrinsics.checkNotNullExpressionValue(badgeV, "badgeV");
            ViewExtKt.gone(badgeV);
            return;
        }
        View view = this.binding.badgeV;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Y.F(view, ColorStateList.valueOf(styleParser.parseColor(context, badge.getColor(), R$color.bg_express_primary)));
        View badgeV2 = this.binding.badgeV;
        Intrinsics.checkNotNullExpressionValue(badgeV2, "badgeV");
        ViewExtKt.show(badgeV2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapCenterPinIconView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        MapPinCenterContainerBinding inflate = MapPinCenterContainerBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        ImageView iconIv = inflate.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        this.iconIv = iconIv;
    }
}
