package ru.ozon.app.android.marketing.utils;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/content/Context;", "", "radius", "Lru/ozon/app/android/marketing/utils/CornersConfig;", "type", "", "colorRes", "colorInt", "Landroid/graphics/drawable/ShapeDrawable;", "createRoundRectShape", "(Landroid/content/Context;FLru/ozon/app/android/marketing/utils/CornersConfig;II)Landroid/graphics/drawable/ShapeDrawable;", "marketing_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExtensionsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CornersConfig.values().length];
            try {
                iArr[CornersConfig.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CornersConfig.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CornersConfig.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ShapeDrawable createRoundRectShape(@NotNull Context context, float f7, @NotNull CornersConfig type, int i11, int i12) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i13 = iArr[type.ordinal()];
        float f11 = (i13 == 1 || i13 == 2) ? f7 : 0.0f;
        int i14 = iArr[type.ordinal()];
        if (i14 != 2 && i14 != 3) {
            f7 = 0.0f;
        }
        shapeDrawable.setShape(new RoundRectShape(new float[]{f11, f11, f11, f11, f7, f7, f7, f7}, null, null));
        shapeDrawable.getPaint().setColor(i12);
        return shapeDrawable;
    }

    public static /* synthetic */ ShapeDrawable createRoundRectShape$default(Context context, float f7, CornersConfig cornersConfig, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f7 = ResourceExtKt.toPxF(16);
        }
        if ((i13 & 2) != 0) {
            cornersConfig = CornersConfig.NONE;
        }
        if ((i13 & 4) != 0) {
            i11 = R$color.bg_primary;
        }
        if ((i13 & 8) != 0) {
            i12 = a.getColor(context, i11);
        }
        return createRoundRectShape(context, f7, cornersConfig, i11, i12);
    }
}
