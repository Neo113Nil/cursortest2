package com.reactnativevectoricons.common;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.util.RNLog;
import com.facebook.react.views.text.ReactFontManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* compiled from: VectorIconsModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J(\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0017¨\u0006\u0013"}, d2 = {"Lcom/reactnativevectoricons/common/VectorIconsModule;", "Lcom/reactnativevectoricons/common/VectorIconsSpec;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getImageForFont", "", "fontFamilyName", "glyph", "fontSize", "", "color", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getImageForFontSync", "Companion", "react-native-vector-icons_common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VectorIconsModule extends VectorIconsSpec {
    public static final String NAME = "VectorIcons";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorIconsModule(ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.reactnativevectoricons.common.NativeVectorIconsSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "VectorIcons";
    }

    @Override // com.reactnativevectoricons.common.NativeVectorIconsSpec
    @ReactMethod
    public void getImageForFont(String fontFamilyName, String glyph, double fontSize, double color, Promise promise) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(glyph, "glyph");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(getImageForFontSync(fontFamilyName, glyph, fontSize, color));
        } catch (Throwable th) {
            promise.reject("Failed to get image for font family \"" + fontFamilyName + "\":" + th.getMessage(), th);
        }
    }

    @Override // com.reactnativevectoricons.common.NativeVectorIconsSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getImageForFontSync(String fontFamilyName, String glyph, double fontSize, double color) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(glyph, "glyph");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        String str = reactApplicationContext.getCacheDir().getAbsolutePath() + "/";
        float f = reactApplicationContext.getResources().getDisplayMetrics().density;
        int i = (int) f;
        String str2 = "@" + (f == ((float) i) ? Integer.valueOf(i) : Float.valueOf(f)) + "x";
        int round = (int) Math.round(f * fontSize);
        String num = Integer.toString((fontFamilyName + ":" + glyph + ":" + color).hashCode(), CharsKt.checkRadix(32));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        String str3 = str + num + "_" + fontSize + str2 + ".png";
        String str4 = "file://" + str3;
        File file = new File(str3);
        if (file.exists()) {
            return str4;
        }
        ReactFontManager companion = ReactFontManager.INSTANCE.getInstance();
        AssetManager assets = reactApplicationContext.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        Typeface typeface = companion.getTypeface(fontFamilyName, 0, assets);
        if (Intrinsics.areEqual(typeface, Typeface.DEFAULT)) {
            RNLog.w(reactApplicationContext, "getImageForFontSync: the lookup for " + fontFamilyName + " returned the default typeface, this likely means that the font is not available on the device.");
        }
        Paint paint = new Paint();
        paint.setTypeface(typeface);
        paint.setColor((int) color);
        paint.setTextSize(round);
        paint.setAntiAlias(true);
        paint.getTextBounds(glyph, 0, glyph.length(), new Rect());
        int i2 = round - ((int) paint.getFontMetrics().bottom);
        Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        new Canvas(createBitmap).drawText(glyph, 0, i2, paint);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                FileOutputStream fileOutputStream2 = fileOutputStream;
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                fileOutputStream2.flush();
                CloseableKt.closeFinally(fileOutputStream, null);
                return str4;
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
