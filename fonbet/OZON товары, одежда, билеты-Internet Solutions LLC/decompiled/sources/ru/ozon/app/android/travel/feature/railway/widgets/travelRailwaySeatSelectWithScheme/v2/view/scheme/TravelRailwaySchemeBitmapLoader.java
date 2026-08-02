package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.content.a;
import androidx.core.graphics.drawable.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeVO;
import ru.ozon.app.android.travel.molecules.extensions.CanvasExtensionsKt;
import ru.ozon.app.android.travel.utils.extensions.IsActivityDarkThemeExtensionKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\n*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u0004\u0018\u00010\n2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00101\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u00103\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBitmapLoader;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "darkImageLink", "lightImageLink", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "mutateExt", "", "preloadThemedBitmap", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "bitmapLink", "callback", "getBitmap", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroid/graphics/Bitmap;", "mutateItemBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SchemeVO;", "schemeVO", "mutateBackgroundBitmap", "(Landroid/graphics/Bitmap;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SchemeVO;)Landroid/graphics/Bitmap;", "setOnItemBitmapReadyCallback", "(Lkotlin/jvm/functions/Function1;)V", "setOnBackgroundBitmapReadyCallback", "itemBitmapLink", "getItemBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "backgroundLink", "getBackgroundBitmap", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SchemeVO;)Landroid/graphics/Bitmap;", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "iconData", "getCancelIcon", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)Landroid/graphics/Bitmap;", "preloadItem", "(Ljava/lang/String;Ljava/lang/String;)V", "preloadBackground", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SchemeVO;)V", "Landroid/content/Context;", "", "dpMultiplier", "I", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBitmapLruCache;", "bitmapCache", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBitmapLruCache;", "onItemBitmapReadyCallback", "Lkotlin/jvm/functions/Function1;", "onBackgroundBitmapReadyCallback", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySchemeBitmapLoader {

    @NotNull
    private final TravelRailwaySchemeBitmapLruCache bitmapCache;

    @NotNull
    private final Context context;
    private final int dpMultiplier;
    private Function1<? super Bitmap, Unit> onBackgroundBitmapReadyCallback;
    private Function1<? super Bitmap, Unit> onItemBitmapReadyCallback;

    public TravelRailwaySchemeBitmapLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.dpMultiplier = ResourceExtKt.toPx(1, context);
        this.bitmapCache = new TravelRailwaySchemeBitmapLruCache();
    }

    private final Bitmap getBitmap(String bitmapLink, Function1<? super Bitmap, Bitmap> mutateExt, Function1<? super Bitmap, Unit> callback) {
        Bitmap bitmap = this.bitmapCache.get(bitmapLink);
        if (bitmap == null) {
            ContextExtKt.loadAsBitmap$default(this.context, bitmapLink, null, null, null, new TravelRailwaySchemeBitmapLoader$getBitmap$1(mutateExt, this, bitmapLink, callback), 14, null);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap mutateBackgroundBitmap(Bitmap bitmap, TravelRailwaySeatSelectWithSchemeVO.SchemeVO schemeVO) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            return bitmap;
        }
        Bitmap copy = bitmap.copy(config, true);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(ThemeExtKt.themeColor(this.context, R$attr.bgPrimary));
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(ThemeExtKt.themeColor(this.context, R$attr.graphicSecondary));
        Intrinsics.f(copy);
        Canvas canvas = new Canvas(copy);
        List<TravelRailwaySeatSelectWithSchemeVO.TextRectangleVO> compartmentGenders = schemeVO.getCompartmentGenders();
        if (compartmentGenders != null) {
            for (TravelRailwaySeatSelectWithSchemeVO.TextRectangleVO textRectangleVO : compartmentGenders) {
                CanvasExtensionsKt.drawMultilineText(canvas, textRectangleVO.getCacheHash(), textRectangleVO.getTextParams(), textRectangleVO.getTextRowsParams(), textRectangleVO.getTextBlockParams());
            }
        }
        List<TravelRailwaySeatSelectWithSchemeVO.GenderIndicatorVO> genderIndicator = schemeVO.getGenderIndicator();
        if (genderIndicator != null) {
            for (TravelRailwaySeatSelectWithSchemeVO.GenderIndicatorVO genderIndicatorVO : genderIndicator) {
                float x11 = genderIndicatorVO.getX();
                float y11 = genderIndicatorVO.getY();
                IconDTO.IconSize size = genderIndicatorVO.getIcon().getSize();
                int sizeShape = size != null ? size.getSizeShape() : 0;
                float cornerRadius = genderIndicatorVO.getIcon().getSize() != null ? r13.getCornerRadius() : 0.0f;
                StyleParser styleParser = StyleParser.INSTANCE;
                Integer parseColor = styleParser.parseColor(this.context, genderIndicatorVO.getIcon().getBackgroundColor());
                if (parseColor != null) {
                    paint.setColor(parseColor.intValue());
                }
                float f7 = sizeShape;
                canvas.drawRoundRect(new RectF(x11, y11, x11 + f7, y11 + f7), cornerRadius, cornerRadius, paint);
                IconDTO.IconSize size2 = genderIndicatorVO.getIcon().getSize();
                int size3 = size2 != null ? size2.getSize() : 0;
                Context context = this.context;
                CommonAtomIconDTO icon = genderIndicatorVO.getIcon().getIcon();
                Integer iconResByToken = TokensExtKt.getIconResByToken(context, icon != null ? icon.getIcon() : null);
                Drawable drawable = iconResByToken != null ? a.getDrawable(this.context, iconResByToken.intValue()) : null;
                float f11 = (f7 / 2.0f) - (size3 / 2.0f);
                if (drawable != null) {
                    Context context2 = this.context;
                    CommonAtomIconDTO icon2 = genderIndicatorVO.getIcon().getIcon();
                    Integer parseColor2 = styleParser.parseColor(context2, icon2 != null ? icon2.getTintColor() : null);
                    if (parseColor2 != null) {
                        paint2.setColor(parseColor2.intValue());
                    }
                    canvas.drawBitmap(b.a(drawable, size3, size3, Bitmap.Config.ARGB_8888), x11 + f11, y11 + f11, paint2);
                }
            }
        }
        if (schemeVO.getIsBorderVisible()) {
            RectF rectF = new RectF();
            float pxF = ResourceExtKt.toPxF(2, this.context);
            float f12 = pxF / 2;
            float pxF2 = ResourceExtKt.toPxF(4, this.context);
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context3 = this.context;
            UniColors uniColors = UniColors.GRAPHIC_NEGATIVE_PRIMARY;
            int parseColor3 = styleParser2.parseColor(context3, uniColors.getToken(), uniColors.getResId());
            Paint paint3 = new Paint();
            paint3.setAntiAlias(true);
            paint3.setColor(parseColor3);
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setStrokeWidth(pxF);
            rectF.set(f12, f12, bitmap.getWidth() - f12, bitmap.getHeight() - f12);
            new Canvas(copy).drawRoundRect(rectF, pxF2, pxF2, paint3);
        }
        return Bitmap.createScaledBitmap(copy, copy.getWidth() * this.dpMultiplier, copy.getHeight() * this.dpMultiplier, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap mutateItemBitmap(Bitmap bitmap) {
        return Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() * this.dpMultiplier, bitmap.getHeight() * this.dpMultiplier, true);
    }

    private final void preloadThemedBitmap(String darkImageLink, String lightImageLink, Function1<? super Bitmap, Bitmap> mutateExt) {
        if (!IsActivityDarkThemeExtensionKt.isActivityDarkThemeActive(this.context)) {
            darkImageLink = lightImageLink;
        }
        getBitmap(darkImageLink, mutateExt, null);
    }

    public final Bitmap getBackgroundBitmap(@NotNull String backgroundLink, @NotNull TravelRailwaySeatSelectWithSchemeVO.SchemeVO schemeVO) {
        Intrinsics.checkNotNullParameter(backgroundLink, "backgroundLink");
        Intrinsics.checkNotNullParameter(schemeVO, "schemeVO");
        String uri = Uri.parse(backgroundLink).buildUpon().appendQueryParameter("isBorderVisible", String.valueOf(schemeVO.getIsBorderVisible())).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return getBitmap(uri, new TravelRailwaySchemeBitmapLoader$getBackgroundBitmap$1(this, schemeVO), this.onBackgroundBitmapReadyCallback);
    }

    public final Bitmap getCancelIcon(@NotNull CommonAtomIconDTO iconData) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(iconData, "iconData");
        String str = "cancelIcon_" + IsActivityDarkThemeExtensionKt.isActivityDarkThemeActive(this.context);
        Bitmap bitmap = this.bitmapCache.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        Integer iconResByToken = TokensExtKt.getIconResByToken(this.context, iconData.getIcon());
        if (iconResByToken == null || (drawable = this.context.getDrawable(iconResByToken.intValue())) == null) {
            return null;
        }
        drawable.mutate().setTint(StyleParser.INSTANCE.parseColor(this.context, iconData.getTintColor(), UniColors.GRAPHIC_SECONDARY_INVERTED.getResId()));
        Bitmap b11 = b.b(drawable, 0, 0, 7);
        this.bitmapCache.set(str, b11);
        return b11;
    }

    public final Bitmap getItemBitmap(@NotNull String itemBitmapLink) {
        Intrinsics.checkNotNullParameter(itemBitmapLink, "itemBitmapLink");
        return getBitmap(itemBitmapLink, new TravelRailwaySchemeBitmapLoader$getItemBitmap$1(this), this.onItemBitmapReadyCallback);
    }

    public final void preloadBackground(@NotNull String darkImageLink, @NotNull String lightImageLink, @NotNull TravelRailwaySeatSelectWithSchemeVO.SchemeVO schemeVO) {
        Intrinsics.checkNotNullParameter(darkImageLink, "darkImageLink");
        Intrinsics.checkNotNullParameter(lightImageLink, "lightImageLink");
        Intrinsics.checkNotNullParameter(schemeVO, "schemeVO");
        preloadThemedBitmap(darkImageLink, lightImageLink, new TravelRailwaySchemeBitmapLoader$preloadBackground$1(this, schemeVO));
    }

    public final void preloadItem(@NotNull String darkImageLink, @NotNull String lightImageLink) {
        Intrinsics.checkNotNullParameter(darkImageLink, "darkImageLink");
        Intrinsics.checkNotNullParameter(lightImageLink, "lightImageLink");
        preloadThemedBitmap(darkImageLink, lightImageLink, new TravelRailwaySchemeBitmapLoader$preloadItem$1(this));
    }

    public final void setOnBackgroundBitmapReadyCallback(@NotNull Function1<? super Bitmap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onBackgroundBitmapReadyCallback = callback;
    }

    public final void setOnItemBitmapReadyCallback(@NotNull Function1<? super Bitmap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onItemBitmapReadyCallback = callback;
    }
}
