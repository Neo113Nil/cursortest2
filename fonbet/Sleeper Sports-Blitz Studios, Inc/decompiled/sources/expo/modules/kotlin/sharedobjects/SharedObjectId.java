package expo.modules.kotlin.sharedobjects;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import expo.modules.kotlin.runtime.Runtime;
import io.sentry.protocol.SentryRuntime;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharedObjectRegistry.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0005J\u0010\u0010\u001f\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006#"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedObjectId;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "toNativeObject", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", SentryRuntime.TYPE, "Lexpo/modules/kotlin/runtime/Runtime;", "toNativeObject-impl", "(ILexpo/modules/kotlin/runtime/Runtime;)Lexpo/modules/kotlin/sharedobjects/SharedObject;", "toNativeObjectOrNull", "toNativeObjectOrNull-impl", "toJavaScriptObjectNull", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "toJavaScriptObjectNull-impl", "(ILexpo/modules/kotlin/runtime/Runtime;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "toWeakJavaScriptObjectNull", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "toWeakJavaScriptObjectNull-impl", "(ILexpo/modules/kotlin/runtime/Runtime;)Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", InAppPurchaseConstants.METHOD_TO_STRING, "", "toString-impl", "(I)Ljava/lang/String;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes9.dex */
public final class SharedObjectId {
    private final int value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SharedObjectId m11873boximpl(int i) {
        return new SharedObjectId(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m11874constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11875equalsimpl(int i, Object obj) {
        return (obj instanceof SharedObjectId) && i == ((SharedObjectId) obj).m11883unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11876equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11877hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11881toStringimpl(int i) {
        return "SharedObjectId(value=" + i + ")";
    }

    public boolean equals(Object obj) {
        return m11875equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m11877hashCodeimpl(this.value);
    }

    public String toString() {
        return m11881toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m11883unboximpl() {
        return this.value;
    }

    private /* synthetic */ SharedObjectId(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* renamed from: toNativeObject-impl, reason: not valid java name */
    public static final SharedObject m11879toNativeObjectimpl(int i, Runtime runtime) {
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        return runtime.getSharedObjectRegistry().m11888toNativeObjectkyJHjyY$expo_modules_core_release(i);
    }

    /* renamed from: toNativeObjectOrNull-impl, reason: not valid java name */
    public static final SharedObject m11880toNativeObjectOrNullimpl(int i, Runtime runtime) {
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        return runtime.getSharedObjectRegistry().m11889toNativeObjectOrNullkyJHjyY$expo_modules_core_release(i);
    }

    /* renamed from: toJavaScriptObjectNull-impl, reason: not valid java name */
    public static final JavaScriptObject m11878toJavaScriptObjectNullimpl(int i, Runtime runtime) {
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        SharedObject m11880toNativeObjectOrNullimpl = m11880toNativeObjectOrNullimpl(i, runtime);
        if (m11880toNativeObjectOrNullimpl == null) {
            return null;
        }
        return runtime.getSharedObjectRegistry().toJavaScriptObjectOrNull$expo_modules_core_release(m11880toNativeObjectOrNullimpl);
    }

    /* renamed from: toWeakJavaScriptObjectNull-impl, reason: not valid java name */
    public static final JavaScriptWeakObject m11882toWeakJavaScriptObjectNullimpl(int i, Runtime runtime) {
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        SharedObject m11880toNativeObjectOrNullimpl = m11880toNativeObjectOrNullimpl(i, runtime);
        if (m11880toNativeObjectOrNullimpl == null) {
            return null;
        }
        return runtime.getSharedObjectRegistry().toWeakJavaScriptObjectOrNull$expo_modules_core_release(m11880toNativeObjectOrNullimpl);
    }
}
