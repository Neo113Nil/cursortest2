package expo.modules.kotlin.jni;

import android.util.Log;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.facebook.jni.HybridData;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.types.JSTypeConverterProvider;
import expo.modules.kotlin.types.TypeConverter;
import expo.modules.kotlin.types.TypeConverterProviderImpl;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;

/* compiled from: JavaScriptFunction.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0003B\u0011\b\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J2\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 ¢\u0006\u0002\u0010\u0019J>\u0010\u0012\u001a\u00028\u00002\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0016\"\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0086\u0002¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0004J\b\u0010\u001f\u001a\u00020\u0005H\u0016R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptFunction;", "ReturnType", "", "Lexpo/modules/kotlin/jni/Destructible;", "mHybridData", "Lcom/facebook/jni/HybridData;", "<init>", "(Lcom/facebook/jni/HybridData;)V", "returnType", "Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "getReturnType$annotations", "()V", "getReturnType", "()Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "setReturnType", "(Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;)V", "isValid", "", "invoke", "thisValue", "Lexpo/modules/kotlin/jni/JavaScriptObject;", StepData.ARGS, "", "expectedReturnType", "Lexpo/modules/kotlin/jni/ExpectedType;", "(Lexpo/modules/kotlin/jni/JavaScriptObject;[Ljava/lang/Object;Lexpo/modules/kotlin/jni/ExpectedType;)Ljava/lang/Object;", "appContext", "Lexpo/modules/kotlin/AppContext;", "([Ljava/lang/Object;Lexpo/modules/kotlin/jni/JavaScriptObject;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Object;", "finalize", "", "getHybridDataForJNIDeallocator", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JavaScriptFunction<ReturnType> implements Destructible {
    private final HybridData mHybridData;
    private TypeDescriptor returnType;

    public static /* synthetic */ void getReturnType$annotations() {
    }

    private final native Object invoke(JavaScriptObject thisValue, Object[] args, ExpectedType expectedReturnType);

    private JavaScriptFunction(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final TypeDescriptor getReturnType() {
        return this.returnType;
    }

    public final void setReturnType(TypeDescriptor typeDescriptor) {
        this.returnType = typeDescriptor;
    }

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    public static /* synthetic */ Object invoke$default(JavaScriptFunction javaScriptFunction, Object[] objArr, JavaScriptObject javaScriptObject, AppContext appContext, int i, Object obj) {
        if ((i & 2) != 0) {
            javaScriptObject = null;
        }
        if ((i & 4) != 0) {
            appContext = null;
        }
        return javaScriptFunction.invoke(objArr, javaScriptObject, appContext);
    }

    protected final void finalize() throws Throwable {
        this.mHybridData.resetNative();
    }

    @Override // expo.modules.kotlin.jni.Destructible
    /* renamed from: getHybridDataForJNIDeallocator, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final ReturnType invoke(Object[] args, JavaScriptObject thisValue, AppContext appContext) {
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(args, "args");
        ArrayList arrayList = new ArrayList(args.length);
        for (Object obj : args) {
            arrayList.add(JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, obj, null, false, 6, null));
        }
        Object[] array = arrayList.toArray(new Object[0]);
        TypeConverterProviderImpl typeConverterProviderImpl = TypeConverterProviderImpl.INSTANCE;
        TypeDescriptor typeDescriptor = this.returnType;
        if (typeDescriptor == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Unit", Reflection.getOrCreateKotlinClass(Unit.class), false)), new Function0<KType>() { // from class: expo.modules.kotlin.jni.JavaScriptFunction$invoke$$inlined$typeDescriptorOf$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(Unit.class);
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Log.e("ExpoModulesCore", "Failed to get type info for " + Unit.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Unit.class));
            }
        }
        TypeConverter<?> obtainTypeConverter = typeConverterProviderImpl.obtainTypeConverter(typeDescriptor);
        return (ReturnType) obtainTypeConverter.convert(invoke(thisValue, array, obtainTypeConverter.get$cppRequireType()), appContext, false);
    }
}
