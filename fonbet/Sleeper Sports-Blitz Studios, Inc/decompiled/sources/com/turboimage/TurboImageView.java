package com.turboimage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import coil.size.Size;
import coil.transform.CircleCropTransformation;
import coil.transform.Transformation;
import com.commit451.coiltransformations.BlurTransformation;
import com.commit451.coiltransformations.ColorFilterTransformation;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.uimanager.ThemedReactContext;
import com.microsoft.codepush.react.CodePushConstants;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.turboimage.ThumbHash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* compiled from: TurboImageView.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010a\u001a\u00020M2\u0006\u0010b\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\u0007H\u0002J\u0018\u0010d\u001a\u00020M2\u0006\u0010b\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010\u000bR6\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'0&j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'`(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010:\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b;\u00100\"\u0004\b<\u00102R\u001e\u0010=\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b>\u0010\u001b\"\u0004\b?\u0010\u001dR\u001e\u0010@\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\bA\u0010\u001b\"\u0004\bB\u0010\u001dR\u001e\u0010C\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\bD\u0010\u001b\"\u0004\bE\u0010\u001dR\u001e\u0010F\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\bG\u00100\"\u0004\bH\u00102R\u001c\u0010I\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\t\"\u0004\bK\u0010\u000bR\u0013\u0010L\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0013\u0010P\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u001c\u0010R\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\t\"\u0004\bT\u0010\u000bR\u001c\u0010U\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\t\"\u0004\bW\u0010\u000bR\u0013\u0010X\u001a\u0004\u0018\u00010Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]8F¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006e"}, d2 = {"Lcom/turboimage/TurboImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "uri", "", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "headers", "Lokhttp3/Headers;", "getHeaders", "()Lokhttp3/Headers;", "setHeaders", "(Lokhttp3/Headers;)V", "cacheKey", "getCacheKey", "setCacheKey", "cachePolicy", "getCachePolicy", "setCachePolicy", "crossfade", "", "getCrossfade", "()Ljava/lang/Integer;", "setCrossfade", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "blurhash", "getBlurhash", "setBlurhash", "thumbhash", "getThumbhash", "setThumbhash", "indicator", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getIndicator", "()Ljava/util/HashMap;", "setIndicator", "(Ljava/util/HashMap;)V", "showPlaceholderOnFailure", "", "getShowPlaceholderOnFailure", "()Ljava/lang/Boolean;", "setShowPlaceholderOnFailure", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "resize", "Lcoil/size/Size;", "getResize", "()Lcoil/size/Size;", "setResize", "(Lcoil/size/Size;)V", "rounded", "getRounded", "setRounded", ConstantsKt.BLUR, "getBlur", "setBlur", "monochrome", "getMonochrome", "setMonochrome", "tint", "getTint", "setTint", "allowHardware", "getAllowHardware", "setAllowHardware", "format", "getFormat", "setFormat", "blurhashDrawable", "Landroid/graphics/drawable/Drawable;", "getBlurhashDrawable", "()Landroid/graphics/drawable/Drawable;", "thumbhashDrawable", "getThumbhashDrawable", "memoryCacheKey", "getMemoryCacheKey", "setMemoryCacheKey", "currentProgressId", "getCurrentProgressId", "setCurrentProgressId", "circleProgressDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "getCircleProgressDrawable", "()Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "transformations", "", "Lcoil/transform/Transformation;", "getTransformations", "()Ljava/util/List;", "drawThumbhash", ViewHierarchyConstants.VIEW_KEY, CodePushConstants.PENDING_UPDATE_HASH_KEY, "drawBlurhash", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TurboImageView extends AppCompatImageView {
    private Boolean allowHardware;
    private Integer blur;
    private String blurhash;
    private String cacheKey;
    private String cachePolicy;
    private Integer crossfade;
    private String currentProgressId;
    private String format;
    private Headers headers;
    private HashMap<String, Object> indicator;
    private String memoryCacheKey;
    private Integer monochrome;
    private final ThemedReactContext reactContext;
    private Size resize;
    private Boolean rounded;
    private Boolean showPlaceholderOnFailure;
    private String thumbhash;
    private Integer tint;
    private String uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TurboImageView(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.cachePolicy = "urlCache";
        this.indicator = new HashMap<>();
    }

    public final String getUri() {
        return this.uri;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public final Headers getHeaders() {
        return this.headers;
    }

    public final void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final void setCacheKey(String str) {
        this.cacheKey = str;
    }

    public final String getCachePolicy() {
        return this.cachePolicy;
    }

    public final void setCachePolicy(String str) {
        this.cachePolicy = str;
    }

    public final Integer getCrossfade() {
        return this.crossfade;
    }

    public final void setCrossfade(Integer num) {
        this.crossfade = num;
    }

    public final String getBlurhash() {
        return this.blurhash;
    }

    public final void setBlurhash(String str) {
        this.blurhash = str;
    }

    public final String getThumbhash() {
        return this.thumbhash;
    }

    public final void setThumbhash(String str) {
        this.thumbhash = str;
    }

    public final HashMap<String, Object> getIndicator() {
        return this.indicator;
    }

    public final void setIndicator(HashMap<String, Object> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.indicator = hashMap;
    }

    public final Boolean getShowPlaceholderOnFailure() {
        return this.showPlaceholderOnFailure;
    }

    public final void setShowPlaceholderOnFailure(Boolean bool) {
        this.showPlaceholderOnFailure = bool;
    }

    public final Size getResize() {
        return this.resize;
    }

    public final void setResize(Size size) {
        this.resize = size;
    }

    public final Boolean getRounded() {
        return this.rounded;
    }

    public final void setRounded(Boolean bool) {
        this.rounded = bool;
    }

    public final Integer getBlur() {
        return this.blur;
    }

    public final void setBlur(Integer num) {
        this.blur = num;
    }

    public final Integer getMonochrome() {
        return this.monochrome;
    }

    public final void setMonochrome(Integer num) {
        this.monochrome = num;
    }

    public final Integer getTint() {
        return this.tint;
    }

    public final void setTint(Integer num) {
        this.tint = num;
    }

    public final Boolean getAllowHardware() {
        return this.allowHardware;
    }

    public final void setAllowHardware(Boolean bool) {
        this.allowHardware = bool;
    }

    public final String getFormat() {
        return this.format;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final Drawable getBlurhashDrawable() {
        String str = this.blurhash;
        if (str != null) {
            return drawBlurhash(this, str);
        }
        return null;
    }

    public final Drawable getThumbhashDrawable() {
        String str = this.thumbhash;
        if (str != null) {
            return drawThumbhash(this, str);
        }
        return null;
    }

    public final String getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    public final void setMemoryCacheKey(String str) {
        this.memoryCacheKey = str;
    }

    public final String getCurrentProgressId() {
        return this.currentProgressId;
    }

    public final void setCurrentProgressId(String str) {
        this.currentProgressId = str;
    }

    public final CircularProgressDrawable getCircleProgressDrawable() {
        HashMap<String, Object> hashMap = this.indicator;
        Object obj = hashMap.get("style");
        if (Intrinsics.areEqual(obj, "medium")) {
            CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
            circularProgressDrawable.setStyle(1);
            Object obj2 = hashMap.get("color");
            if (obj2 != null) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                circularProgressDrawable.setColorSchemeColors(((Integer) obj2).intValue());
            }
            return circularProgressDrawable;
        }
        if (!Intrinsics.areEqual(obj, "large")) {
            return null;
        }
        CircularProgressDrawable circularProgressDrawable2 = new CircularProgressDrawable(getContext());
        circularProgressDrawable2.setStyle(0);
        Object obj3 = hashMap.get("color");
        if (obj3 != null) {
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            circularProgressDrawable2.setColorSchemeColors(((Integer) obj3).intValue());
        }
        return circularProgressDrawable2;
    }

    public final List<Transformation> getTransformations() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.rounded;
        if (bool != null) {
            bool.booleanValue();
            arrayList.add(new CircleCropTransformation());
        }
        if (this.blur != null) {
            arrayList.add(new BlurTransformation(this.reactContext, r1.intValue(), 0.0f, 4, null));
        }
        Integer num = this.monochrome;
        if (num != null) {
            arrayList.add(new MonochromeTransformation(num.intValue()));
        }
        Integer num2 = this.tint;
        if (num2 != null) {
            arrayList.add(new ColorFilterTransformation(num2.intValue()));
        }
        return arrayList;
    }

    private final Drawable drawThumbhash(TurboImageView view, String hash) {
        ThumbHash thumbHash = ThumbHash.INSTANCE;
        byte[] decode = Base64.decode(hash, 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        ThumbHash.Image thumbHashToRGBA = thumbHash.thumbHashToRGBA(decode);
        int width = thumbHashToRGBA.getWidth() * thumbHashToRGBA.getHeight();
        int[] iArr = new int[width];
        for (int i = 0; i < width; i++) {
            int i2 = i * 4;
            byte b = thumbHashToRGBA.getRgba()[i2];
            int i3 = (b & 255) << 16;
            iArr[i] = i3 | ((thumbHashToRGBA.getRgba()[i2 + 3] & 255) << 24) | ((thumbHashToRGBA.getRgba()[i2 + 1] & 255) << 8) | (thumbHashToRGBA.getRgba()[i2 + 2] & 255);
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, thumbHashToRGBA.getWidth(), thumbHashToRGBA.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return new BitmapDrawable(view.getContext().getResources(), createBitmap);
    }

    private final Drawable drawBlurhash(TurboImageView view, String blurhash) {
        return new BitmapDrawable(view.getContext().getResources(), BlurHashDecoder.decode$default(BlurHashDecoder.INSTANCE, blurhash, 8, 8, 0.0f, false, 24, null));
    }
}
