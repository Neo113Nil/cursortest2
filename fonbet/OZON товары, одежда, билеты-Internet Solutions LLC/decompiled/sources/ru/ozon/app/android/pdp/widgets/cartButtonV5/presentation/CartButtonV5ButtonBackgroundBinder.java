package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientOrientationMapperKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0014\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ1\u0010\u001d\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonBackgroundBinder;", "", "Landroid/view/View;", "view", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "configuration", "<init>", "(Landroid/view/View;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;)V", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "gradientColor", "", "cornerRadius", "", "bindGradientBackground", "(Landroid/view/View;Lru/ozon/uni/android/uikitsdk/Color$Gradient;F)V", "", "showBorder", "", "backgroundColor", "strokeColor", "bindStaticBackground", "(Landroid/view/View;ZFLjava/lang/String;Ljava/lang/String;)V", "model", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/LinearGradient;", "getShaderGradientBySquare", "(Lru/ozon/uni/android/uikitsdk/Color$Gradient;Landroid/graphics/Rect;)Landroid/graphics/LinearGradient;", "getShaderGradient", "bind", "(Ljava/lang/String;FZLjava/lang/String;)V", "Landroid/view/View;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "Landroid/graphics/Matrix;", "gradientTransformMatrix$delegate", "LSc/j;", "getGradientTransformMatrix", "()Landroid/graphics/Matrix;", "gradientTransformMatrix", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/GradientBackgroundInfo;", "gradientInfo", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/GradientBackgroundInfo;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5ButtonBackgroundBinder {

    @NotNull
    private final CartButtonV5Configuration configuration;
    private GradientBackgroundInfo gradientInfo;

    /* renamed from: gradientTransformMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gradientTransformMatrix;

    @NotNull
    private final View view;

    public CartButtonV5ButtonBackgroundBinder(@NotNull View view, @NotNull CartButtonV5Configuration configuration) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.view = view;
        this.configuration = configuration;
        this.gradientTransformMatrix = LazyUtilsKt.unsafeLazy(CartButtonV5ButtonBackgroundBinder$gradientTransformMatrix$2.INSTANCE);
    }

    private final void bindGradientBackground(final View view, final Color.Gradient gradient, final float f7) {
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5ButtonBackgroundBinder$bindGradientBackground$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    GradientBackgroundInfo gradientBackgroundInfo = new GradientBackgroundInfo(view.getWidth(), view.getHeight(), gradient);
                    if (gradientBackgroundInfo.equals(this.gradientInfo)) {
                        return;
                    }
                    this.gradientInfo = gradientBackgroundInfo;
                    Rect rect = new Rect();
                    rect.set(0, 0, view.getWidth(), view.getHeight());
                    LinearGradient shaderGradientBySquare = this.configuration.getIsMatrixGradient() ? this.getShaderGradientBySquare(gradient, rect) : this.getShaderGradient(gradient, rect);
                    View view3 = view;
                    Context context = view3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    view3.setBackground(ContextExtKt.createRoundRectShape$default(context, f7, CornersConfig.ALL, 0, 0, shaderGradientBySquare, 12, null));
                }
            });
            return;
        }
        GradientBackgroundInfo gradientBackgroundInfo = new GradientBackgroundInfo(view.getWidth(), view.getHeight(), gradient);
        if (gradientBackgroundInfo.equals(this.gradientInfo)) {
            return;
        }
        this.gradientInfo = gradientBackgroundInfo;
        Rect rect = new Rect();
        rect.set(0, 0, view.getWidth(), view.getHeight());
        LinearGradient shaderGradientBySquare = this.configuration.getIsMatrixGradient() ? getShaderGradientBySquare(gradient, rect) : getShaderGradient(gradient, rect);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackground(ContextExtKt.createRoundRectShape$default(context, f7, CornersConfig.ALL, 0, 0, shaderGradientBySquare, 12, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (ru.ozon.uni.android.uikit.extensions.ThemeExtKt.isDarkThemeActive(r14) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindStaticBackground(View view, boolean z11, float f7, String str, String str2) {
        boolean z12;
        if (z11) {
            if (this.configuration.getIsInModal()) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            }
            z12 = true;
            this.gradientInfo = null;
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            CornersConfig cornersConfig = CornersConfig.ALL;
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer mapColor = styleParser.mapColor(context3, str);
            int intValue = mapColor == null ? mapColor.intValue() : UniColors.BG_ACTION_PRIMARY.getResId();
            Context context4 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            Integer mapColor2 = styleParser.mapColor(context4, str2);
            view.setBackground(ContextExtKt.createRoundGradientDrawable$default(context2, f7, cornersConfig, intValue, 0, (mapColor2 == null && z12) ? mapColor2 : null, null, 0, 104, null));
        }
        z12 = false;
        this.gradientInfo = null;
        Context context22 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context22, "getContext(...)");
        CornersConfig cornersConfig2 = CornersConfig.ALL;
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context32 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context32, "getContext(...)");
        Integer mapColor3 = styleParser2.mapColor(context32, str);
        if (mapColor3 == null) {
        }
        Context context42 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context42, "getContext(...)");
        Integer mapColor22 = styleParser2.mapColor(context42, str2);
        view.setBackground(ContextExtKt.createRoundGradientDrawable$default(context22, f7, cornersConfig2, intValue, 0, (mapColor22 == null && z12) ? mapColor22 : null, null, 0, 104, null));
    }

    private final Matrix getGradientTransformMatrix() {
        return (Matrix) this.gradientTransformMatrix.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearGradient getShaderGradient(Color.Gradient model, Rect rect) {
        float[] coordinates = OzGradientOrientationMapperKt.getCoordinates(model.getOrientation(), rect);
        return new LinearGradient(coordinates[0], coordinates[1], coordinates[2], coordinates[3], model.getColors(), model.getPositions(), Shader.TileMode.CLAMP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearGradient getShaderGradientBySquare(Color.Gradient model, Rect rect) {
        int width = rect.width();
        int height = rect.height();
        int min = Math.min(width, height);
        LinearGradient shaderGradient = getShaderGradient(model, new Rect(0, 0, min, min));
        float f7 = min;
        getGradientTransformMatrix().setScale(width / f7, height / f7);
        shaderGradient.setLocalMatrix(getGradientTransformMatrix());
        return shaderGradient;
    }

    public final void bind(String backgroundColor, float cornerRadius, boolean showBorder, String strokeColor) {
        Color.Gradient gradient;
        UniGradient gradientByToken;
        View view = this.view;
        if (backgroundColor == null || (gradientByToken = TokensExtKt.getGradientByToken(backgroundColor)) == null) {
            gradient = null;
        } else {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradient = TokensExtKt.toGradient(gradientByToken, context);
        }
        if (gradient != null) {
            bindGradientBackground(view, gradient, cornerRadius);
        } else {
            bindStaticBackground(view, showBorder, cornerRadius, backgroundColor, strokeColor);
        }
    }
}
