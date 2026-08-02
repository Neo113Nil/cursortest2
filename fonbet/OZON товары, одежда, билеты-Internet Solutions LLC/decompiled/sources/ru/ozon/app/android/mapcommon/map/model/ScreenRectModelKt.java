package ru.ozon.app.android.mapcommon.map.model;

import android.graphics.Point;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toRect", "Landroid/graphics/Rect;", "Lru/ozon/app/android/mapcommon/map/model/ScreenRectModel;", "toScreenRectModel", "map-common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScreenRectModelKt {
    @NotNull
    public static final Rect toRect(@NotNull ScreenRectModel screenRectModel) {
        Intrinsics.checkNotNullParameter(screenRectModel, "<this>");
        return new Rect(screenRectModel.getTopLeft().x, screenRectModel.getTopLeft().y, screenRectModel.getBottomRight().x, screenRectModel.getBottomRight().y);
    }

    @NotNull
    public static final ScreenRectModel toScreenRectModel(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new ScreenRectModel(new Point(rect.left, rect.top), new Point(rect.right, rect.bottom));
    }
}
