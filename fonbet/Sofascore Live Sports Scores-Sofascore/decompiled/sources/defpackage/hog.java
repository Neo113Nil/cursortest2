package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.view.WindowMetrics;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.core.util.function.Function;
import androidx.window.extensions.core.util.function.Predicate;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.AnimationBackground;
import androidx.window.extensions.embedding.AnimationParams;
import androidx.window.extensions.embedding.DividerAttributes;
import androidx.window.extensions.embedding.EmbeddedActivityWindowInfo;
import androidx.window.extensions.embedding.SplitAttributes;
import androidx.window.extensions.embedding.SplitAttributesCalculatorParams;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPinRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import androidx.window.extensions.embedding.SplitRule;
import androidx.window.extensions.embedding.WindowAttributes;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hog {
    public final ClassLoader a;
    public final hpo b;
    public final WindowExtensions c;
    public final cqa d;

    public hog(ClassLoader classLoader, hpo hpoVar, WindowExtensions windowExtensions) {
        windowExtensions.getClass();
        this.a = classLoader;
        this.b = hpoVar;
        this.c = windowExtensions;
        this.d = new cqa(classLoader);
    }

    public static final boolean A() {
        Method method = SplitPlaceholderRule.Builder.class.getMethod("setSplitRatio", Float.TYPE);
        Class cls = Integer.TYPE;
        Method method2 = SplitPlaceholderRule.Builder.class.getMethod("setLayoutDirection", cls);
        Method method3 = SplitPlaceholderRule.Builder.class.getMethod("setSticky", Boolean.TYPE);
        Method method4 = SplitPlaceholderRule.Builder.class.getMethod("setFinishPrimaryWithSecondary", cls);
        return ljg.v(method) && tz9.A(SplitPlaceholderRule.Builder.class, method) && ljg.v(method2) && tz9.A(SplitPlaceholderRule.Builder.class, method2) && ljg.v(method3) && tz9.A(SplitPlaceholderRule.Builder.class, method3) && ljg.v(method4) && tz9.A(SplitPlaceholderRule.Builder.class, method4);
    }

    public static final boolean B() {
        Constructor declaredConstructor = SplitPlaceholderRule.Builder.class.getDeclaredConstructor(Intent.class, Predicate.class, Predicate.class, Predicate.class);
        Method method = SplitPlaceholderRule.Builder.class.getMethod("setDefaultSplitAttributes", SplitAttributes.class);
        Method method2 = SplitPlaceholderRule.Builder.class.getMethod("setFinishPrimaryWithPlaceholder", Integer.TYPE);
        Method method3 = SplitPlaceholderRule.Builder.class.getMethod("setTag", String.class);
        declaredConstructor.getClass();
        return Modifier.isPublic(declaredConstructor.getModifiers()) && ljg.v(method) && tz9.A(SplitPlaceholderRule.Builder.class, method) && ljg.v(method2) && tz9.A(SplitPlaceholderRule.Builder.class, method2) && ljg.v(method3) && tz9.A(SplitPlaceholderRule.Builder.class, method3);
    }

    public static final boolean C() {
        Method method = SplitPlaceholderRule.class.getMethod("getPlaceholderIntent", null);
        Method method2 = SplitPlaceholderRule.class.getMethod("isSticky", null);
        Method method3 = SplitPlaceholderRule.class.getMethod("getFinishPrimaryWithSecondary", null);
        method.getClass();
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers()) || !method.getReturnType().equals(Intent.class) || !ljg.w(method2)) {
            return false;
        }
        Class cls = Boolean.TYPE;
        cls.getClass();
        if (!method2.getReturnType().equals(cls) || !ljg.w(method3)) {
            return false;
        }
        Class cls2 = Integer.TYPE;
        cls2.getClass();
        return method3.getReturnType().equals(cls2);
    }

    public static final boolean D() {
        Class cls = Float.TYPE;
        Constructor declaredConstructor = SplitAttributes.SplitType.RatioSplitType.class.getDeclaredConstructor(cls);
        Method method = SplitAttributes.SplitType.RatioSplitType.class.getMethod("getRatio", null);
        Method method2 = SplitAttributes.SplitType.RatioSplitType.class.getMethod("splitEqually", null);
        Constructor declaredConstructor2 = SplitAttributes.SplitType.HingeSplitType.class.getDeclaredConstructor(SplitAttributes.SplitType.class);
        Method method3 = SplitAttributes.SplitType.HingeSplitType.class.getMethod("getFallbackSplitType", null);
        Constructor declaredConstructor3 = SplitAttributes.SplitType.ExpandContainersSplitType.class.getDeclaredConstructor(null);
        declaredConstructor.getClass();
        if (!Modifier.isPublic(declaredConstructor.getModifiers()) || !ljg.v(method) || !tz9.A(cls, method)) {
            return false;
        }
        declaredConstructor2.getClass();
        if (!Modifier.isPublic(declaredConstructor2.getModifiers()) || !ljg.v(method2) || !tz9.A(SplitAttributes.SplitType.RatioSplitType.class, method2) || !ljg.v(method3) || !tz9.A(SplitAttributes.SplitType.class, method3)) {
            return false;
        }
        declaredConstructor3.getClass();
        return Modifier.isPublic(declaredConstructor3.getModifiers());
    }

    public static final boolean E() {
        Method method = WindowAttributes.class.getMethod("getDimAreaBehavior", null);
        Method method2 = SplitAttributes.class.getMethod("getWindowAttributes", null);
        Method method3 = SplitAttributes.Builder.class.getMethod("setWindowAttributes", WindowAttributes.class);
        if (!ljg.w(method)) {
            return false;
        }
        Class cls = Integer.TYPE;
        cls.getClass();
        return method.getReturnType().equals(cls) && ljg.w(method2) && method2.getReturnType().equals(WindowAttributes.class) && ljg.w(method3) && method3.getReturnType().equals(SplitAttributes.Builder.class);
    }

    public static final boolean F() {
        Method method = SplitAttributes.class.getMethod("getAnimationParams", null);
        method.getClass();
        method.getClass();
        return Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(AnimationParams.class);
    }

    public static final boolean G() {
        Method method = SplitRule.class.getMethod("getDefaultSplitAttributes", null);
        method.getClass();
        method.getClass();
        return Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(SplitAttributes.class);
    }

    public static final boolean H() {
        Method method = SplitAttributes.class.getMethod("getDividerAttributes", null);
        method.getClass();
        method.getClass();
        return Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(DividerAttributes.class);
    }

    public static final boolean I(hog hogVar) {
        Method method = hogVar.b().getMethod("getEmbeddedActivityWindowInfo", Activity.class);
        return ljg.v(method) && method.getReturnType().equals(EmbeddedActivityWindowInfo.class);
    }

    public static final boolean J() {
        Method method = SplitPlaceholderRule.class.getMethod("getFinishPrimaryWithPlaceholder", null);
        method.getClass();
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        Class cls = Integer.TYPE;
        cls.getClass();
        return method.getReturnType().equals(cls);
    }

    public static final boolean K() {
        Method method = SplitRule.class.getMethod("getLayoutDirection", null);
        method.getClass();
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        Class cls = Integer.TYPE;
        cls.getClass();
        return method.getReturnType().equals(cls);
    }

    public static final boolean L() {
        Method method = SplitInfo.class.getMethod("getSplitAttributes", null);
        method.getClass();
        method.getClass();
        return Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(SplitAttributes.class);
    }

    public static final boolean M() {
        Method method = SplitInfo.class.getMethod("getSplitInfoToken", null);
        method.getClass();
        method.getClass();
        return Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(SplitInfo.Token.class);
    }

    public static final boolean N() {
        Method method = SplitRule.class.getMethod("getSplitRatio", null);
        method.getClass();
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        Class cls = Float.TYPE;
        cls.getClass();
        return method.getReturnType().equals(cls);
    }

    public static final boolean O() {
        Method method = DividerAttributes.class.getMethod("isDraggingToFullscreenAllowed", null);
        method.getClass();
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        Class cls = Boolean.TYPE;
        cls.getClass();
        return method.getReturnType().equals(cls);
    }

    public static final boolean P(hog hogVar) {
        Method method = SplitPinRule.class.getMethod("isSticky", null);
        Class b = hogVar.b();
        Class cls = Integer.TYPE;
        Method method2 = b.getMethod("pinTopActivityStack", cls, SplitPinRule.class);
        Method method3 = hogVar.b().getMethod("unpinTopActivityStack", cls);
        if (!ljg.v(method)) {
            return false;
        }
        Class cls2 = Boolean.TYPE;
        cls2.getClass();
        return method.getReturnType().equals(cls2) && ljg.v(method2) && method2.getReturnType().equals(cls2) && ljg.v(method3);
    }

    public static final boolean Q(hog hogVar) {
        return ljg.v(hogVar.b().getMethod("registerActivityStackCallback", Executor.class, Consumer.class));
    }

    public static final boolean R() {
        Method method = SplitAttributes.Builder.class.getMethod("setAnimationParams", AnimationParams.class);
        return ljg.w(method) && method.getReturnType().equals(SplitAttributes.Builder.class);
    }

    public static final boolean S() {
        Method method = SplitAttributes.Builder.class.getMethod("setDividerAttributes", DividerAttributes.class);
        return ljg.w(method) && method.getReturnType().equals(SplitAttributes.Builder.class);
    }

    public static final boolean T() {
        Method method = DividerAttributes.Builder.class.getMethod("setDraggingToFullscreenAllowed", Boolean.TYPE);
        return ljg.w(method) && method.getReturnType().equals(DividerAttributes.Builder.class);
    }

    public static final boolean U(hog hogVar) {
        return ljg.v(hogVar.b().getMethod("setEmbeddedActivityWindowInfoCallback", Executor.class, Consumer.class));
    }

    public static final boolean V(hog hogVar) {
        return ljg.v(hogVar.b().getMethod("setSplitInfoCallback", Consumer.class));
    }

    public static final boolean W(hog hogVar) {
        Method method = hogVar.b().getMethod("setSplitAttributesCalculator", Function.class);
        Method method2 = hogVar.b().getMethod("clearSplitAttributesCalculator", null);
        method.getClass();
        return Modifier.isPublic(method.getModifiers()) && ljg.v(method2);
    }

    public static final boolean X() {
        Method method = SplitInfo.class.getMethod("getToken", null);
        method.getClass();
        method.getClass();
        return Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(IBinder.class);
    }

    public static final boolean Y(hog hogVar) {
        return ljg.v(hogVar.b().getMethod("unregisterActivityStackCallback", Consumer.class));
    }

    public static final boolean Z(hog hogVar) {
        return ljg.v(hogVar.b().getMethod("updateSplitAttributes", IBinder.class, SplitAttributes.class));
    }

    public static final boolean a0(hog hogVar) {
        return ljg.v(hogVar.b().getMethod("updateSplitAttributes", SplitInfo.Token.class, SplitAttributes.class));
    }

    public static final boolean i() {
        Method method = ActivityStack.class.getMethod("getActivityStackToken", null);
        method.getClass();
        method.getClass();
        return Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(ActivityStack.Token.class);
    }

    public static final boolean j() {
        Method method = ActivityRule.Builder.class.getMethod("setShouldAlwaysExpand", Boolean.TYPE);
        return ljg.w(method) && method.getReturnType().equals(ActivityRule.Builder.class);
    }

    public static final boolean k() {
        Constructor declaredConstructor = ActivityRule.Builder.class.getDeclaredConstructor(Predicate.class, Predicate.class);
        Method method = ActivityRule.Builder.class.getMethod("setTag", String.class);
        declaredConstructor.getClass();
        declaredConstructor.getClass();
        return Modifier.isPublic(declaredConstructor.getModifiers()) && ljg.w(method) && method.getReturnType().equals(ActivityRule.Builder.class);
    }

    public static final boolean l() {
        Method method = ActivityRule.class.getMethod("shouldAlwaysExpand", null);
        method.getClass();
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        Class cls = Boolean.TYPE;
        cls.getClass();
        return method.getReturnType().equals(cls);
    }

    public static final boolean m() {
        Method method = ActivityStack.Token.class.getMethod("toBundle", null);
        Method method2 = ActivityStack.Token.class.getMethod("readFromBundle", Bundle.class);
        Method method3 = ActivityStack.Token.class.getMethod("createFromBinder", IBinder.class);
        Field declaredField = ActivityStack.Token.class.getDeclaredField("INVALID_ACTIVITY_STACK_TOKEN");
        if (!ljg.v(method) || !tz9.A(Bundle.class, method) || !ljg.v(method2) || !tz9.A(ActivityStack.Token.class, method2) || !ljg.v(method3) || !tz9.A(ActivityStack.Token.class, method3)) {
            return false;
        }
        declaredField.getClass();
        return Modifier.isPublic(declaredField.getModifiers());
    }

    public static final boolean n() {
        Class cls = Integer.TYPE;
        Method method = AnimationBackground.class.getMethod("createColorBackground", cls);
        Field declaredField = AnimationBackground.class.getDeclaredField("ANIMATION_BACKGROUND_DEFAULT");
        Method method2 = AnimationBackground.ColorBackground.class.getMethod("getColor", null);
        Method method3 = SplitAttributes.class.getMethod("getAnimationBackground", null);
        Method method4 = SplitAttributes.Builder.class.getMethod("setAnimationBackground", AnimationBackground.class);
        if (!ljg.v(method) || !tz9.A(AnimationBackground.ColorBackground.class, method)) {
            return false;
        }
        declaredField.getClass();
        return Modifier.isPublic(declaredField.getModifiers()) && ljg.v(method2) && tz9.A(cls, method2) && ljg.v(method3) && tz9.A(AnimationBackground.class, method3) && ljg.v(method4) && tz9.A(SplitAttributes.Builder.class, method4);
    }

    public static final boolean o() {
        Method method = AnimationParams.Builder.class.getMethod("setAnimationBackground", AnimationBackground.class);
        Class cls = Integer.TYPE;
        Method method2 = AnimationParams.Builder.class.getMethod("setOpenAnimationResId", cls);
        Method method3 = AnimationParams.Builder.class.getMethod("setCloseAnimationResId", cls);
        Method method4 = AnimationParams.Builder.class.getMethod("setChangeAnimationResId", cls);
        return ljg.v(method) && tz9.A(AnimationParams.Builder.class, method) && ljg.v(method2) && tz9.A(AnimationParams.Builder.class, method2) && ljg.v(method3) && tz9.A(AnimationParams.Builder.class, method3) && ljg.v(method4) && tz9.A(AnimationParams.Builder.class, method4);
    }

    public static final boolean p() {
        Field declaredField = AnimationParams.class.getDeclaredField("DEFAULT_ANIMATION_RESOURCES_ID");
        Method method = AnimationParams.class.getMethod("getAnimationBackground", null);
        Method method2 = AnimationParams.class.getMethod("getOpenAnimationResId", null);
        Method method3 = AnimationParams.class.getMethod("getCloseAnimationResId", null);
        Method method4 = AnimationParams.class.getMethod("getChangeAnimationResId", null);
        declaredField.getClass();
        if (!Modifier.isPublic(declaredField.getModifiers()) || !ljg.v(method) || !tz9.A(AnimationBackground.class, method) || !ljg.v(method2)) {
            return false;
        }
        Class cls = Integer.TYPE;
        return tz9.A(cls, method2) && ljg.v(method3) && tz9.A(cls, method3) && ljg.v(method4) && tz9.A(cls, method4);
    }

    public static final boolean q() {
        Class cls = Integer.TYPE;
        Constructor declaredConstructor = DividerAttributes.Builder.class.getDeclaredConstructor(cls);
        Constructor declaredConstructor2 = DividerAttributes.Builder.class.getDeclaredConstructor(DividerAttributes.class);
        Method method = DividerAttributes.Builder.class.getMethod("setWidthDp", cls);
        Class cls2 = Float.TYPE;
        Method method2 = DividerAttributes.Builder.class.getMethod("setPrimaryMinRatio", cls2);
        Method method3 = DividerAttributes.Builder.class.getMethod("setPrimaryMaxRatio", cls2);
        Method method4 = DividerAttributes.Builder.class.getMethod("setDividerColor", cls);
        declaredConstructor.getClass();
        if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
            return false;
        }
        declaredConstructor2.getClass();
        return Modifier.isPublic(declaredConstructor2.getModifiers()) && ljg.v(method) && tz9.A(DividerAttributes.Builder.class, method) && ljg.v(method2) && tz9.A(DividerAttributes.Builder.class, method2) && ljg.v(method3) && tz9.A(DividerAttributes.Builder.class, method3) && ljg.v(method4) && tz9.A(DividerAttributes.Builder.class, method4);
    }

    public static final boolean r() {
        Method method = DividerAttributes.class.getMethod("getDividerType", null);
        Method method2 = DividerAttributes.class.getMethod("getWidthDp", null);
        Method method3 = DividerAttributes.class.getMethod("getPrimaryMinRatio", null);
        Method method4 = DividerAttributes.class.getMethod("getPrimaryMaxRatio", null);
        Method method5 = DividerAttributes.class.getMethod("getDividerColor", null);
        if (!ljg.v(method)) {
            return false;
        }
        Class cls = Integer.TYPE;
        if (!tz9.A(cls, method) || !ljg.v(method2) || !tz9.A(cls, method2) || !ljg.v(method3)) {
            return false;
        }
        Class cls2 = Float.TYPE;
        return tz9.A(cls2, method3) && ljg.v(method4) && tz9.A(cls2, method4) && ljg.v(method5) && tz9.A(cls, method5);
    }

    public static final boolean s() {
        Method method = EmbeddedActivityWindowInfo.class.getMethod("getActivity", null);
        Method method2 = EmbeddedActivityWindowInfo.class.getMethod("isEmbedded", null);
        Method method3 = EmbeddedActivityWindowInfo.class.getMethod("getTaskBounds", null);
        Method method4 = EmbeddedActivityWindowInfo.class.getMethod("getActivityStackBounds", null);
        return ljg.v(method) && tz9.A(Activity.class, method) && ljg.v(method2) && tz9.A(Boolean.TYPE, method2) && ljg.v(method3) && tz9.A(Rect.class, method3) && ljg.v(method4) && tz9.A(Rect.class, method4);
    }

    public static final boolean t() {
        Method method = SplitAttributesCalculatorParams.class.getMethod("getParentWindowMetrics", null);
        Method method2 = SplitAttributesCalculatorParams.class.getMethod("getParentConfiguration", null);
        Method method3 = SplitAttributesCalculatorParams.class.getMethod("getDefaultSplitAttributes", null);
        Method method4 = SplitAttributesCalculatorParams.class.getMethod("areDefaultConstraintsSatisfied", null);
        Method method5 = SplitAttributesCalculatorParams.class.getMethod("getParentWindowLayoutInfo", null);
        Method method6 = SplitAttributesCalculatorParams.class.getMethod("getSplitRuleTag", null);
        return ljg.v(method) && tz9.A(WindowMetrics.class, method) && ljg.v(method2) && tz9.A(Configuration.class, method2) && ljg.v(method3) && tz9.A(SplitAttributes.class, method3) && ljg.v(method4) && tz9.A(Boolean.TYPE, method4) && ljg.v(method5) && tz9.A(WindowLayoutInfo.class, method5) && ljg.v(method6) && tz9.A(String.class, method6);
    }

    public static final boolean u() {
        Method method = SplitAttributes.class.getMethod("getLayoutDirection", null);
        Method method2 = SplitAttributes.class.getMethod("getSplitType", null);
        Method method3 = SplitAttributes.Builder.class.getMethod("setSplitType", SplitAttributes.SplitType.class);
        Class cls = Integer.TYPE;
        Method method4 = SplitAttributes.Builder.class.getMethod("setLayoutDirection", cls);
        if (!ljg.w(method)) {
            return false;
        }
        cls.getClass();
        return method.getReturnType().equals(cls) && ljg.w(method2) && method2.getReturnType().equals(SplitAttributes.SplitType.class) && ljg.w(method3) && ljg.w(method4);
    }

    public static final boolean v() {
        Method method = SplitInfo.Token.class.getMethod("createFromBinder", IBinder.class);
        return ljg.w(method) && method.getReturnType().equals(SplitInfo.Token.class);
    }

    public static final boolean w() {
        Method method = SplitInfo.class.getMethod("getPrimaryActivityStack", null);
        Method method2 = SplitInfo.class.getMethod("getSecondaryActivityStack", null);
        Method method3 = SplitInfo.class.getMethod("getSplitRatio", null);
        method.getClass();
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers()) || !method.getReturnType().equals(ActivityStack.class) || !ljg.w(method2) || !method2.getReturnType().equals(ActivityStack.class) || !ljg.w(method3)) {
            return false;
        }
        Class cls = Float.TYPE;
        cls.getClass();
        return method3.getReturnType().equals(cls);
    }

    public static final boolean x() {
        Method method = SplitPairRule.Builder.class.getMethod("setSplitRatio", Float.TYPE);
        Method method2 = SplitPairRule.Builder.class.getMethod("setLayoutDirection", Integer.TYPE);
        return ljg.w(method) && method.getReturnType().equals(SplitPairRule.Builder.class) && ljg.w(method2) && method2.getReturnType().equals(SplitPairRule.Builder.class);
    }

    public static final boolean y() {
        Constructor declaredConstructor = SplitPairRule.Builder.class.getDeclaredConstructor(Predicate.class, Predicate.class, Predicate.class);
        Method method = SplitPairRule.Builder.class.getMethod("setDefaultSplitAttributes", SplitAttributes.class);
        Method method2 = SplitPairRule.Builder.class.getMethod("setTag", String.class);
        declaredConstructor.getClass();
        declaredConstructor.getClass();
        return Modifier.isPublic(declaredConstructor.getModifiers()) && ljg.w(method) && method.getReturnType().equals(SplitPairRule.Builder.class) && ljg.w(method2) && method2.getReturnType().equals(SplitPairRule.Builder.class);
    }

    public static final boolean z() {
        Method method = SplitPairRule.class.getMethod("getFinishPrimaryWithSecondary", null);
        Method method2 = SplitPairRule.class.getMethod("getFinishSecondaryWithPrimary", null);
        Method method3 = SplitPairRule.class.getMethod("shouldClearTop", null);
        method.getClass();
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        Class cls = Integer.TYPE;
        cls.getClass();
        if (!method.getReturnType().equals(cls) || !ljg.w(method2) || !method2.getReturnType().equals(cls) || !ljg.w(method3)) {
            return false;
        }
        Class cls2 = Boolean.TYPE;
        cls2.getClass();
        return method3.getReturnType().equals(cls2);
    }

    public final ActivityEmbeddingComponent a() {
        cqa cqaVar = this.d;
        boolean z = false;
        try {
            ((ClassLoader) cqaVar.a).loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (tz9.Z("WindowExtensionsProvider#getWindowExtensions is not valid", new e6g(cqaVar, 4)) && tz9.Z("WindowExtensions#getActivityEmbeddingComponent is not valid", new gog(this, 5))) {
                int a = bl6.a();
                if (a == 1) {
                    z = c();
                } else if (a == 2) {
                    z = d();
                } else if (3 <= a && a < 5) {
                    z = e();
                } else if (a == 5) {
                    z = f();
                } else if (a == 6) {
                    z = g();
                } else if (a == 7) {
                    z = h();
                } else if (8 <= a && a <= Integer.MAX_VALUE) {
                    z = h();
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z) {
            return null;
        }
        try {
            return this.c.getActivityEmbeddingComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final Class b() {
        Class<?> loadClass = this.a.loadClass("androidx.window.extensions.embedding.ActivityEmbeddingComponent");
        loadClass.getClass();
        return loadClass;
    }

    public final boolean c() {
        boolean z;
        if (tz9.Z("ActivityEmbeddingComponent#setEmbeddingRules is not valid", new gog(this, 3)) && tz9.Z("ActivityEmbeddingComponent#isActivityEmbedded is not valid", new gog(this, 0)) && tz9.Z("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new gog(this, 1)) && tz9.Z("SplitRule#getSplitRatio is not valid", new u9g(26)) && tz9.Z("SplitRule#getLayoutDirection is not valid", new u9g(19)) && tz9.Z("Class ActivityRule is not valid", new u9g(20)) && tz9.Z("Class ActivityRule.Builder is not valid", new u9g(25)) && tz9.Z("Class SplitInfo is not valid", new u9g(24)) && tz9.Z("Class SplitPairRule is not valid", new u9g(22)) && tz9.Z("Class SplitPairRule.Builder is not valid", new u9g(23)) && tz9.Z("Class SplitPlaceholderRule is not valid", new u9g(21))) {
            try {
                z = A();
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (c() && tz9.Z("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new gog(this, 2))) {
            try {
                Method method = b().getMethod("clearSplitInfoCallback", null);
                method.getClass();
                z = Modifier.isPublic(method.getModifiers());
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                z = false;
            }
            if (z && tz9.Z("ActivityEmbeddingComponent#setSplitAttributesCalculator is not valid", new gog(this, 4))) {
                try {
                    z2 = L();
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                    z2 = false;
                }
                if (z2) {
                    try {
                        z3 = J();
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                        z3 = false;
                    }
                    if (z3) {
                        try {
                            z4 = G();
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                            z4 = false;
                        }
                        if (z4) {
                            try {
                                z5 = k();
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                                z5 = false;
                            }
                            if (z5) {
                                try {
                                    Method method2 = lk5.class.getMethod("a", null);
                                    method2.getClass();
                                    if (Modifier.isPublic(method2.getModifiers())) {
                                        if (method2.getReturnType().equals(String.class)) {
                                            try {
                                                z6 = u();
                                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused6) {
                                                z6 = false;
                                            }
                                            if (z6) {
                                                try {
                                                    z7 = t();
                                                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused7) {
                                                    z7 = false;
                                                }
                                                if (z7) {
                                                    try {
                                                        z8 = D();
                                                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused8) {
                                                        z8 = false;
                                                    }
                                                    if (z8) {
                                                        try {
                                                            z9 = y();
                                                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused9) {
                                                            z9 = false;
                                                        }
                                                        if (z9) {
                                                            try {
                                                                z10 = B();
                                                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused10) {
                                                                z10 = false;
                                                            }
                                                            if (z10) {
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused11) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean e() {
        boolean z;
        boolean z2;
        boolean z3;
        if (d()) {
            try {
                Method method = b().getMethod("invalidateTopVisibleSplitAttributes", null);
                method.getClass();
                z = Modifier.isPublic(method.getModifiers());
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                z = false;
            }
            if (z) {
                try {
                    z2 = Z(this);
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                    z2 = false;
                }
                if (z2) {
                    try {
                        z3 = X();
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                        z3 = false;
                    }
                    if (z3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean f() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (e()) {
            try {
                z = i();
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                z = false;
            }
            if (z) {
                try {
                    z2 = Q(this);
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                    z2 = false;
                }
                if (z2) {
                    try {
                        z3 = Y(this);
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                        z3 = false;
                    }
                    if (z3) {
                        try {
                            z4 = P(this);
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                            z4 = false;
                        }
                        if (z4) {
                            try {
                                z5 = a0(this);
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                                z5 = false;
                            }
                            if (z5) {
                                try {
                                    z6 = M();
                                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused6) {
                                    z6 = false;
                                }
                                if (z6) {
                                    try {
                                        z7 = n();
                                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused7) {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        try {
                                            z8 = m();
                                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused8) {
                                            z8 = false;
                                        }
                                        if (z8) {
                                            try {
                                                z9 = E();
                                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused9) {
                                                z9 = false;
                                            }
                                            if (z9) {
                                                try {
                                                    z10 = v();
                                                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused10) {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean g() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (f()) {
            try {
                z = I(this);
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                z = false;
            }
            if (z) {
                try {
                    z2 = U(this);
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                    z2 = false;
                }
                if (z2) {
                    try {
                        Method method = b().getMethod("clearEmbeddedActivityWindowInfoCallback", null);
                        method.getClass();
                        z3 = Modifier.isPublic(method.getModifiers());
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                        z3 = false;
                    }
                    if (z3) {
                        try {
                            z4 = H();
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                            z4 = false;
                        }
                        if (z4) {
                            try {
                                z5 = S();
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                                z5 = false;
                            }
                            if (z5) {
                                try {
                                    z6 = s();
                                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused6) {
                                    z6 = false;
                                }
                                if (z6) {
                                    try {
                                        z7 = r();
                                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused7) {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        try {
                                            z8 = q();
                                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused8) {
                                            z8 = false;
                                        }
                                        if (z8) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean h() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (g()) {
            try {
                z = F();
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                z = false;
            }
            if (z) {
                try {
                    z2 = R();
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                    z2 = false;
                }
                if (z2) {
                    try {
                        z3 = O();
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                        z3 = false;
                    }
                    if (z3) {
                        try {
                            z4 = T();
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                            z4 = false;
                        }
                        if (z4) {
                            try {
                                z5 = p();
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                                z5 = false;
                            }
                            if (z5) {
                                try {
                                    z6 = o();
                                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused6) {
                                    z6 = false;
                                }
                                if (z6) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
