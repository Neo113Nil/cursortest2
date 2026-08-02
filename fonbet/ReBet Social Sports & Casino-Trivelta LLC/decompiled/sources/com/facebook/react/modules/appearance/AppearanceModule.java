package com.facebook.react.modules.appearance;

import android.content.Context;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.views.common.UiModeUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m.AbstractC5484f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(name = "Appearance")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000fJ\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\tJ\u0006\u0010\u001c\u001a\u00020\fJ\b\u0010\u001d\u001a\u00020\fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/facebook/react/modules/appearance/AppearanceModule;", "Lcom/facebook/fbreact/specs/NativeAppearanceSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "overrideColorScheme", "Lcom/facebook/react/modules/appearance/AppearanceModule$OverrideColorScheme;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/modules/appearance/AppearanceModule$OverrideColorScheme;)V", "lastEmittedColorScheme", "", "schemeChangeListener", "Lkotlin/Function0;", "", "colorSchemeForCurrentConfiguration", "context", "Landroid/content/Context;", "getColorScheme", "setColorScheme", "style", "addListener", "eventName", "removeListeners", "count", "", "onConfigurationChanged", "currentContext", "emitAppearanceChanged", "colorScheme", "invalidatePlatformColorCache", "invalidate", "OverrideColorScheme", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppearanceModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppearanceModule.kt\ncom/facebook/react/modules/appearance/AppearanceModule\n+ 2 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n*L\n1#1,143:1\n30#2,3:144\n*S KotlinDebug\n*F\n+ 1 AppearanceModule.kt\ncom/facebook/react/modules/appearance/AppearanceModule\n*L\n116#1:144,3\n*E\n"})
/* loaded from: classes2.dex */
public final class AppearanceModule extends NativeAppearanceSpec {

    @NotNull
    private static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";

    @NotNull
    public static final String NAME = "Appearance";

    @DoNotStrip
    @Nullable
    private static Runnable invalidatePlatformColorCache;

    @Nullable
    private String lastEmittedColorScheme;

    @Nullable
    private final OverrideColorScheme overrideColorScheme;

    @NotNull
    private final Function0<Unit> schemeChangeListener;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/appearance/AppearanceModule$OverrideColorScheme;", "", "getScheme", "", "addSchemeChangeListener", "", "listener", "Lkotlin/Function0;", "removeSchemeChangeListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OverrideColorScheme {
        default void addSchemeChangeListener(@NotNull Function0<Unit> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
        }

        @NotNull
        String getScheme();

        default void removeSchemeChangeListener(@NotNull Function0<Unit> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AppearanceModule(@NotNull ReactApplicationContext reactContext) {
        this(reactContext, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    private final String colorSchemeForCurrentConfiguration(Context context) {
        OverrideColorScheme overrideColorScheme = this.overrideColorScheme;
        return overrideColorScheme != null ? overrideColorScheme.getScheme() : UiModeUtils.isDarkMode(context) ? "dark" : "light";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit schemeChangeListener$lambda$0(AppearanceModule appearanceModule) {
        Context currentActivity = appearanceModule.getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = appearanceModule.getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(currentActivity, "getReactApplicationContext(...)");
        }
        appearanceModule.onConfigurationChanged(currentActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setColorScheme$lambda$1(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1626174665) {
            if (str.equals("unspecified")) {
                AbstractC5484f.N(-1);
            }
        } else if (hashCode == 3075958) {
            if (str.equals("dark")) {
                AbstractC5484f.N(2);
            }
        } else if (hashCode == 102970646 && str.equals("light")) {
            AbstractC5484f.N(1);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void addListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    public final void emitAppearanceChanged(@NotNull String colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        WritableMap createMap = Arguments.createMap();
        new ReadableMapBuilder(createMap).put("colorScheme", colorScheme);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent(APPEARANCE_CHANGED_EVENT_NAME, createMap);
        }
        invalidatePlatformColorCache();
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    @NotNull
    public String getColorScheme() {
        Context currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(currentActivity, "getReactApplicationContext(...)");
        }
        return colorSchemeForCurrentConfiguration(currentActivity);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        OverrideColorScheme overrideColorScheme = this.overrideColorScheme;
        if (overrideColorScheme != null) {
            overrideColorScheme.removeSchemeChangeListener(this.schemeChangeListener);
        }
        invalidatePlatformColorCache();
        super.invalidate();
    }

    public final void invalidatePlatformColorCache() {
        Runnable runnable = invalidatePlatformColorCache;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void onConfigurationChanged(@NotNull Context currentContext) {
        Intrinsics.checkNotNullParameter(currentContext, "currentContext");
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(currentContext);
        if (Intrinsics.areEqual(this.lastEmittedColorScheme, colorSchemeForCurrentConfiguration)) {
            return;
        }
        this.lastEmittedColorScheme = colorSchemeForCurrentConfiguration;
        emitAppearanceChanged(colorSchemeForCurrentConfiguration);
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void setColorScheme(@NotNull final String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: l8.b
            @Override // java.lang.Runnable
            public final void run() {
                AppearanceModule.setColorScheme$lambda$1(style);
            }
        });
    }

    public /* synthetic */ AppearanceModule(ReactApplicationContext reactApplicationContext, OverrideColorScheme overrideColorScheme, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i10 & 2) != 0 ? null : overrideColorScheme);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AppearanceModule(@NotNull ReactApplicationContext reactContext, @Nullable OverrideColorScheme overrideColorScheme) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.overrideColorScheme = overrideColorScheme;
        Function0<Unit> function0 = new Function0() { // from class: l8.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit schemeChangeListener$lambda$0;
                schemeChangeListener$lambda$0 = AppearanceModule.schemeChangeListener$lambda$0(AppearanceModule.this);
                return schemeChangeListener$lambda$0;
            }
        };
        this.schemeChangeListener = function0;
        if (overrideColorScheme != null) {
            overrideColorScheme.addSchemeChangeListener(function0);
        }
    }
}
