package com.facebook.react.views.text.frescosupport;

import E6.a;
import W6.b;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.internal.ReactTextInlineImageShadowNode;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.facebook.yoga.g;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(level = DeprecationLevel.WARNING, message = "This class is part of Legacy Architecture and will be removed in a future release")
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\t\b\u0001\u0018\u0000 =2\u00020\u0001:\u0001=B+\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b-\u0010.R&\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0018\u00101\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00107R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageShadowNode;", "Lcom/facebook/react/views/text/internal/ReactTextInlineImageShadowNode;", "LW6/b;", "Lcom/facebook/imagepipeline/request/b;", "draweeControllerBuilder", "", "callerContext", "<init>", "(LW6/b;Ljava/lang/Object;)V", "Lcom/facebook/react/bridge/ReadableArray;", "sources", "", "setSource", "(Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/bridge/ReadableMap;", "newHeaders", "setHeaders", "(Lcom/facebook/react/bridge/ReadableMap;)V", "", "newTintColor", "setTintColor", "(I)V", "Lcom/facebook/react/bridge/Dynamic;", "newWidth", "setWidth", "(Lcom/facebook/react/bridge/Dynamic;)V", "newHeight", "setHeight", "", "newResizeMode", "setResizeMode", "(Ljava/lang/String;)V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "getHeaders", "()Lcom/facebook/react/bridge/ReadableMap;", "", "isVirtual", "()Z", "Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;", "buildInlineImageSpan", "()Lcom/facebook/react/views/text/internal/span/TextInlineImageSpan;", "getDraweeControllerBuilder", "()LW6/b;", "getCallerContext", "()Ljava/lang/Object;", "LW6/b;", "Ljava/lang/Object;", "uri", "Landroid/net/Uri;", "headers", "Lcom/facebook/react/bridge/ReadableMap;", "", "width", "F", ViewProps.RESIZE_MODE, "Ljava/lang/String;", "height", "tintColor", "I", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FrescoBasedReactTextInlineImageShadowNode extends ReactTextInlineImageShadowNode {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Object callerContext;

    @NotNull
    private final b draweeControllerBuilder;

    @Nullable
    private ReadableMap headers;
    private float height;

    @Nullable
    private String resizeMode;
    private int tintColor;

    @Nullable
    private Uri uri;
    private float width;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageShadowNode$Companion;", "", "<init>", "()V", "getResourceDrawableUri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "name", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Uri getResourceDrawableUri(@NotNull Context context, @Nullable String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (name == null || name.length() == 0) {
                return null;
            }
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = name.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(StringsKt.replace$default(lowerCase, "-", "_", false, 4, (Object) null), "drawable", context.getPackageName()))).build();
        }

        private Companion() {
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("FrescoBasedReactTextInlineImageShadowNode", LegacyArchitectureLogLevel.ERROR);
    }

    public FrescoBasedReactTextInlineImageShadowNode(@NotNull b draweeControllerBuilder, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(draweeControllerBuilder, "draweeControllerBuilder");
        this.draweeControllerBuilder = draweeControllerBuilder;
        this.callerContext = obj;
        float f10 = g.f31669b;
        this.width = f10;
        this.height = f10;
    }

    @Override // com.facebook.react.views.text.internal.ReactTextInlineImageShadowNode
    @NotNull
    public TextInlineImageSpan buildInlineImageSpan() {
        Resources resources = getThemedContext().getResources();
        int ceil = (int) Math.ceil(this.width);
        int ceil2 = (int) Math.ceil(this.height);
        Intrinsics.checkNotNull(resources);
        return new FrescoBasedReactTextInlineImageSpan(resources, ceil2, ceil, this.tintColor, getUri(), getHeaders(), getDraweeControllerBuilder(), getCallerContext(), this.resizeMode);
    }

    @Nullable
    public final Object getCallerContext() {
        return this.callerContext;
    }

    @NotNull
    public final b getDraweeControllerBuilder() {
        return this.draweeControllerBuilder;
    }

    @Nullable
    public final ReadableMap getHeaders() {
        return this.headers;
    }

    @Nullable
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return true;
    }

    @ReactProp(name = "headers")
    public final void setHeaders(@Nullable ReadableMap newHeaders) {
        this.headers = newHeaders;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    public void setHeight(@NotNull Dynamic newHeight) {
        Intrinsics.checkNotNullParameter(newHeight, "newHeight");
        if (newHeight.getType() == ReadableType.Number) {
            this.height = (float) newHeight.asDouble();
        } else {
            a.K(ReactConstants.TAG, "Inline images must not have percentage based height");
            this.height = g.f31669b;
        }
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public final void setResizeMode(@Nullable String newResizeMode) {
        this.resizeMode = newResizeMode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r1.getScheme() == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    @ReactProp(name = "src")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setSource(@Nullable ReadableArray sources) {
        String str;
        Uri parse;
        Uri uri = null;
        if (sources == null || sources.size() == 0 || sources.getType(0) != ReadableType.Map) {
            str = null;
        } else {
            ReadableMap map = sources.getMap(0);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            str = map.getString("uri");
        }
        if (str != null) {
            try {
                parse = Uri.parse(str);
            } catch (Exception unused) {
            }
        }
        if (!Intrinsics.areEqual(uri, this.uri)) {
            markUpdated();
        }
        this.uri = uri;
        uri = parse;
        if (uri == null) {
            Companion companion = INSTANCE;
            ThemedReactContext themedContext = getThemedContext();
            Intrinsics.checkNotNullExpressionValue(themedContext, "getThemedContext(...)");
            uri = companion.getResourceDrawableUri(themedContext, str);
        }
        if (!Intrinsics.areEqual(uri, this.uri)) {
        }
        this.uri = uri;
        if (uri == null) {
        }
        if (!Intrinsics.areEqual(uri, this.uri)) {
        }
        this.uri = uri;
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public final void setTintColor(int newTintColor) {
        this.tintColor = newTintColor;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    public void setWidth(@NotNull Dynamic newWidth) {
        Intrinsics.checkNotNullParameter(newWidth, "newWidth");
        if (newWidth.getType() == ReadableType.Number) {
            this.width = (float) newWidth.asDouble();
        } else {
            a.K(ReactConstants.TAG, "Inline images must not have percentage based width");
            this.width = g.f31669b;
        }
    }
}
