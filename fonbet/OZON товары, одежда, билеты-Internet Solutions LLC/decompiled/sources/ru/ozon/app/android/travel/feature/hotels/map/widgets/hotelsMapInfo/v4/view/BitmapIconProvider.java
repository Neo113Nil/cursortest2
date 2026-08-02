package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import androidx.core.graphics.drawable.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\n*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0010J\u001a\u0010\u0016\u001a\u00020\n*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/BitmapIconProvider;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "gradientPaint", "Landroid/graphics/Paint;", "colorPaint", "getColoredBitmapFromDTO", "Landroid/graphics/Bitmap;", "dto", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getGradientFromDTO", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "getColorFromDTO", "", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)Ljava/lang/Integer;", "fillBitmapWithColor", "size", "", "color", "fillBitmapWithGradient", "gradient", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BitmapIconProvider {

    @NotNull
    private final Paint colorPaint;

    @NotNull
    private final Context context;

    @NotNull
    private final Paint gradientPaint;

    public BitmapIconProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Paint paint = new Paint();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setXfermode(new PorterDuffXfermode(mode));
        this.gradientPaint = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.colorPaint = paint2;
    }

    @NotNull
    public final Bitmap fillBitmapWithColor(@NotNull Bitmap bitmap, float f7, int i11) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        this.colorPaint.setColor(i11);
        new Canvas(bitmap).drawRect(0.0f, 0.0f, f7, f7, this.colorPaint);
        return bitmap;
    }

    @NotNull
    public final Bitmap fillBitmapWithGradient(@NotNull Bitmap bitmap, float f7, @NotNull Color.Gradient gradient) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.gradientPaint.setShader(new LinearGradient(0.0f, 0.0f, f7, f7, gradient.getColors(), gradient.getPositions(), Shader.TileMode.CLAMP));
        new Canvas(bitmap).drawRect(0.0f, 0.0f, f7, f7, this.gradientPaint);
        return bitmap;
    }

    public final Integer getColorFromDTO(IconDTO dto) {
        CommonAtomIconDTO icon;
        String tintColor;
        if (dto == null || (icon = dto.getIcon()) == null || (tintColor = icon.getTintColor()) == null) {
            return null;
        }
        return StyleParser.INSTANCE.parseColor(this.context, tintColor);
    }

    public final Bitmap getColoredBitmapFromDTO(IconDTO dto) {
        IconDTO.IconSize size;
        CommonAtomIconDTO icon;
        Integer iconResByToken = TokensExtKt.getIconResByToken(this.context, (dto == null || (icon = dto.getIcon()) == null) ? null : icon.getIcon());
        if (iconResByToken != null) {
            Drawable drawable = a.getDrawable(this.context, iconResByToken.intValue());
            if (drawable != null && dto != null && (size = dto.getSize()) != null) {
                int px = ResourceExtKt.toPx(size.getSize(), this.context);
                Bitmap a11 = b.a(drawable, px, px, Bitmap.Config.ARGB_8888);
                Color.Gradient gradientFromDTO = getGradientFromDTO(dto);
                if (gradientFromDTO != null) {
                    return fillBitmapWithGradient(a11, px, gradientFromDTO);
                }
                Integer colorFromDTO = getColorFromDTO(dto);
                if (colorFromDTO != null) {
                    return fillBitmapWithColor(a11, px, colorFromDTO.intValue());
                }
            }
        }
        return null;
    }

    public final Color.Gradient getGradientFromDTO(IconDTO dto) {
        CommonAtomIconDTO icon;
        String tintColor;
        UniGradient gradientByToken;
        if (dto == null || (icon = dto.getIcon()) == null || (tintColor = icon.getTintColor()) == null || (gradientByToken = TokensExtKt.getGradientByToken(tintColor)) == null) {
            return null;
        }
        return TokensExtKt.toGradient(gradientByToken, this.context);
    }
}
