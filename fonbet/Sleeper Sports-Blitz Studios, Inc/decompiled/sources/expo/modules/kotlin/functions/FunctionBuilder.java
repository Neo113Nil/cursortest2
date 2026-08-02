package expo.modules.kotlin.functions;

import android.util.Log;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.RawTypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import io.github.lukmccall.pika.TypeInfoKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: FunctionBuilder.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u0011\u001a\u00020\u000b2\u0010\b\u0004\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0014J,\u0010\u0011\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0015\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0004\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0013H\u0086\bø\u0001\u0000JI\u0010\u0011\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0015\u0018\u0001\"\u0006\b\u0001\u0010\u0016\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00032#\b\u0004\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u0002H\u00150\u0017H\u0086\bø\u0001\u0000Jf\u0010\u0011\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0015\u0018\u0001\"\u0006\b\u0001\u0010\u0016\u0018\u0001\"\u0006\b\u0002\u0010\u001a\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u000328\b\u0004\u0010\u0012\u001a2\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u001a¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H\u00150\u001bH\u0086\bø\u0001\u0000J\u0083\u0001\u0010\u0011\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0015\u0018\u0001\"\u0006\b\u0001\u0010\u0016\u0018\u0001\"\u0006\b\u0002\u0010\u001a\u0018\u0001\"\u0006\b\u0003\u0010\u001d\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00032M\b\u0004\u0010\u0012\u001aG\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u001a¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002H\u00150\u001eH\u0086\bø\u0001\u0000J \u0001\u0010\u0011\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0015\u0018\u0001\"\u0006\b\u0001\u0010\u0016\u0018\u0001\"\u0006\b\u0002\u0010\u001a\u0018\u0001\"\u0006\b\u0003\u0010\u001d\u0018\u0001\"\u0006\b\u0004\u0010 \u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00032b\b\u0004\u0010\u0012\u001a\\\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u001a¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u0011H ¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u00150!H\u0086\bø\u0001\u0000J½\u0001\u0010\u0011\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0015\u0018\u0001\"\u0006\b\u0001\u0010\u0016\u0018\u0001\"\u0006\b\u0002\u0010\u001a\u0018\u0001\"\u0006\b\u0003\u0010\u001d\u0018\u0001\"\u0006\b\u0004\u0010 \u0018\u0001\"\u0006\b\u0005\u0010#\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00032w\b\u0004\u0010\u0012\u001aq\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u001a¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u0011H ¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\"\u0012\u0013\u0012\u0011H#¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(%\u0012\u0004\u0012\u0002H\u00150$H\u0086\bø\u0001\u0000JÜ\u0001\u0010\u0011\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0015\u0018\u0001\"\u0006\b\u0001\u0010\u0016\u0018\u0001\"\u0006\b\u0002\u0010\u001a\u0018\u0001\"\u0006\b\u0003\u0010\u001d\u0018\u0001\"\u0006\b\u0004\u0010 \u0018\u0001\"\u0006\b\u0005\u0010#\u0018\u0001\"\u0006\b\u0006\u0010&\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u008d\u0001\b\u0004\u0010\u0012\u001a\u0086\u0001\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u001a¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u0011H ¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\"\u0012\u0013\u0012\u0011H#¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(%\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0004\u0012\u0002H\u00150'H\u0086\bø\u0001\u0000Jù\u0001\u0010\u0011\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0015\u0018\u0001\"\u0006\b\u0001\u0010\u0016\u0018\u0001\"\u0006\b\u0002\u0010\u001a\u0018\u0001\"\u0006\b\u0003\u0010\u001d\u0018\u0001\"\u0006\b\u0004\u0010 \u0018\u0001\"\u0006\b\u0005\u0010#\u0018\u0001\"\u0006\b\u0006\u0010&\u0018\u0001\"\u0006\b\u0007\u0010)\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00032¢\u0001\b\u0004\u0010\u0012\u001a\u009b\u0001\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u001a¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u0011H ¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\"\u0012\u0013\u0012\u0011H#¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(%\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H)¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(+\u0012\u0004\u0012\u0002H\u00150*H\u0086\bø\u0001\u0000J\u0096\u0002\u0010\u0011\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0015\u0018\u0001\"\u0006\b\u0001\u0010\u0016\u0018\u0001\"\u0006\b\u0002\u0010\u001a\u0018\u0001\"\u0006\b\u0003\u0010\u001d\u0018\u0001\"\u0006\b\u0004\u0010 \u0018\u0001\"\u0006\b\u0005\u0010#\u0018\u0001\"\u0006\b\u0006\u0010&\u0018\u0001\"\u0006\b\u0007\u0010)\u0018\u0001\"\u0006\b\b\u0010,\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00032·\u0001\b\u0004\u0010\u0012\u001a°\u0001\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u001a¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H\u001d¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u0011H ¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(\"\u0012\u0013\u0012\u0011H#¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(%\u0012\u0013\u0012\u0011H&¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H)¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(+\u0012\u0013\u0012\u0011H,¢\u0006\f\b\u0018\u0012\b\b\u0002\u0012\u0004\b\b(.\u0012\u0004\u0012\u0002H\u00150-H\u0086\bø\u0001\u0000J\r\u0010/\u001a\u00020\u000bH\u0000¢\u0006\u0002\b0R\u001c\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR&\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00061"}, d2 = {"Lexpo/modules/kotlin/functions/FunctionBuilder;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "functionComponent", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getFunctionComponent$annotations", "getFunctionComponent", "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "setFunctionComponent", "(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V", "Body", "body", "Lkotlin/Function0;", "BodyWithoutArgs", "R", "P0", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "p0", "P1", "Lkotlin/Function2;", "p1", "P2", "Lkotlin/Function3;", "p2", "P3", "Lkotlin/Function4;", "p3", "P4", "Lkotlin/Function5;", "p4", "P5", "Lkotlin/Function6;", "p5", "P6", "Lkotlin/Function7;", "p6", "P7", "Lkotlin/Function8;", "p7", "build", "build$expo_modules_core_release", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FunctionBuilder {
    private SyncFunctionComponent functionComponent;
    private final String name;

    public static /* synthetic */ void getFunctionComponent$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public FunctionBuilder(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
    }

    public final String getName() {
        return this.name;
    }

    public final SyncFunctionComponent getFunctionComponent() {
        return this.functionComponent;
    }

    public final void setFunctionComponent(SyncFunctionComponent syncFunctionComponent) {
        this.functionComponent = syncFunctionComponent;
    }

    public final SyncFunctionComponent BodyWithoutArgs(final Function0<? extends Object> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        String name = getName();
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return body.invoke();
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R> SyncFunctionComponent Body(String name, final Function0<? extends R> body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        ReturnType returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types2.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return body.invoke();
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final SyncFunctionComponent build$expo_modules_core_release() {
        SyncFunctionComponent syncFunctionComponent = this.functionComponent;
        if (syncFunctionComponent != null) {
            return syncFunctionComponent;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final /* synthetic */ <R, P0> SyncFunctionComponent Body(String name, final Function1<? super P0, ? extends R> body) {
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.reifiedOperationMarker(4, "P0");
        AnyType[] anyTypeArr = new AnyType[1];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, null);
        }
        anyTypeArr[0] = anyType;
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        ReturnType returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types2.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1> SyncFunctionComponent Body(String name, final Function2<? super P0, ? super P1, ? extends R> body) {
        Object m13470constructorimpl;
        boolean z;
        Object m13470constructorimpl2;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        AnyType[] anyTypeArr = new AnyType[2];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType != null) {
            z = false;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$2
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                z = false;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                z = false;
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, null);
        }
        anyTypeArr[0] = anyType;
        AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        AnyType anyType2 = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, Boolean.valueOf(z)));
        if (anyType2 == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$3
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor2, null);
        }
        anyTypeArr[1] = anyType2;
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        ReturnType returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types2.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2> SyncFunctionComponent Body(String name, final Function3<? super P0, ? super P1, ? super P2, ? extends R> body) {
        boolean z;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        ReturnType returnType;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        AnyType[] anyTypeArr = new AnyType[3];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType3 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType3 != null) {
            z = false;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                z = false;
                try {
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$4
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            Intrinsics.reifiedOperationMarker(6, "P0");
                            return null;
                        }
                    }));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl != null) {
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    }
                    typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                    if (typeDescriptor == null) {
                    }
                    anyType3 = new AnyType(typeDescriptor, null);
                    anyTypeArr[0] = anyType3;
                    AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P1");
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P1");
                    anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, Boolean.valueOf(z)));
                    if (anyType == null) {
                    }
                    anyTypeArr[1] = anyType;
                    AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P2");
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P2");
                    anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, Boolean.valueOf(z)));
                    if (anyType2 == null) {
                    }
                    anyTypeArr[2] = anyType2;
                    ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                    Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
                    Intrinsics.reifiedOperationMarker(4, "R");
                    returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
                    if (returnType == null) {
                    }
                    SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2]);
                        }
                    });
                    setFunctionComponent(syncFunctionComponent);
                    return syncFunctionComponent;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor, null);
        }
        anyTypeArr[0] = anyType3;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, Boolean.valueOf(z)));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$5
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor2, null);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, Boolean.valueOf(z)));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$6
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor3, null);
        }
        anyTypeArr[2] = anyType2;
        ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types2 = returnTypeProvider2.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        returnType = types2.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types3 = returnTypeProvider2.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types3.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2]);
            }
        });
        setFunctionComponent(syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0229 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3> SyncFunctionComponent Body(String name, final Function4<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
        boolean z;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        AnyType anyType2;
        Object m13470constructorimpl3;
        AnyType anyType3;
        Object m13470constructorimpl4;
        ReturnType returnType;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        AnyType[] anyTypeArr = new AnyType[4];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType4 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType4 != null) {
            z = false;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                z = false;
                try {
                    RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                    Intrinsics.needClassReification();
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$7
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            Intrinsics.reifiedOperationMarker(6, "P0");
                            return null;
                        }
                    }));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl != null) {
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    }
                    typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                    if (typeDescriptor == null) {
                    }
                    anyType4 = new AnyType(typeDescriptor, null);
                    anyTypeArr[0] = anyType4;
                    AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P1");
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P1");
                    anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, Boolean.valueOf(z)));
                    if (anyType == null) {
                    }
                    anyTypeArr[1] = anyType;
                    AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P2");
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P2");
                    anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, Boolean.valueOf(z)));
                    if (anyType2 == null) {
                    }
                    anyTypeArr[2] = anyType2;
                    AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P3");
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P3");
                    anyType3 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, Boolean.valueOf(z)));
                    if (anyType3 == null) {
                    }
                    anyTypeArr[3] = anyType3;
                    ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                    Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
                    Intrinsics.reifiedOperationMarker(4, "R");
                    returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
                    if (returnType == null) {
                    }
                    SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3]);
                        }
                    });
                    setFunctionComponent(syncFunctionComponent);
                    return syncFunctionComponent;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor, null);
        }
        anyTypeArr[0] = anyType4;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, Boolean.valueOf(z)));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$8
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor2, null);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, Boolean.valueOf(z)));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$9
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor3, null);
        }
        anyTypeArr[2] = anyType2;
        AnyTypeCache anyTypeCache42 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass42 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        anyType3 = anyTypeCache42.getTypesMap().get(new Pair(orCreateKotlinClass42, Boolean.valueOf(z)));
        if (anyType3 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$10
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor4 == null) {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor4, null);
        }
        anyTypeArr[3] = anyType3;
        ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types2 = returnTypeProvider2.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        returnType = types2.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types3 = returnTypeProvider2.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types3.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        });
        setFunctionComponent(syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0238 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d5  */
    /* JADX WARN: Type inference failed for: r4v1, types: [expo.modules.kotlin.types.TypeConverterProvider] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4> SyncFunctionComponent Body(String name, final Function5<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        TypeConverterProvider typeConverterProvider;
        AnyType anyType2;
        Object m13470constructorimpl3;
        TypeConverterProvider typeConverterProvider2;
        AnyType anyType3;
        Object m13470constructorimpl4;
        TypeConverterProvider typeConverterProvider3;
        AnyType anyType4;
        Object m13470constructorimpl5;
        TypeConverterProvider typeConverterProvider4;
        TypeDescriptor typeDescriptor2;
        ReturnType returnType;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        AnyType[] anyTypeArr = new AnyType[5];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType5 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                kType = null;
                try {
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$11
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            Intrinsics.reifiedOperationMarker(6, "P0");
                            return null;
                        }
                    }));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl != null) {
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    }
                    typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                    if (typeDescriptor == null) {
                    }
                    anyType5 = new AnyType(typeDescriptor, kType);
                    anyTypeArr[0] = anyType5;
                    AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P1");
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P1");
                    anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
                    if (anyType == null) {
                    }
                    anyTypeArr[1] = anyType;
                    AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P2");
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P2");
                    anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
                    if (anyType2 == null) {
                    }
                    anyTypeArr[2] = anyType2;
                    AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P3");
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P3");
                    anyType3 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
                    if (anyType3 == null) {
                    }
                    anyTypeArr[3] = anyType3;
                    AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P4");
                    KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P4");
                    anyType4 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
                    if (anyType4 == null) {
                    }
                    anyTypeArr[4] = anyType4;
                    ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                    Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
                    Intrinsics.reifiedOperationMarker(4, "R");
                    returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
                    if (returnType == null) {
                    }
                    SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
                        }
                    });
                    setFunctionComponent(syncFunctionComponent);
                    return syncFunctionComponent;
                }
            } catch (Throwable th2) {
                th = th2;
                kType = null;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = kType;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType5 = new AnyType(typeDescriptor, kType);
        }
        anyTypeArr[0] = anyType5;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, false));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$12
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor3 != null) {
                typeConverterProvider = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeConverterProvider = null;
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor3, typeConverterProvider);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$13
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor4 != null) {
                typeConverterProvider2 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeConverterProvider2 = null;
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor4, typeConverterProvider2);
        }
        anyTypeArr[2] = anyType2;
        AnyTypeCache anyTypeCache42 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass42 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        anyType3 = anyTypeCache42.getTypesMap().get(new Pair(orCreateKotlinClass42, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$14
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor5 != null) {
                typeConverterProvider3 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeConverterProvider3 = null;
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor5, typeConverterProvider3);
        }
        anyTypeArr[3] = anyType3;
        AnyTypeCache anyTypeCache52 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass52 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        anyType4 = anyTypeCache52.getTypesMap().get(new Pair(orCreateKotlinClass52, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$15
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th6) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
            }
            Object obj = m13470constructorimpl5;
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(obj);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(obj)) {
                obj = null;
            }
            TypeDescriptor typeDescriptor6 = (TypeDescriptor) obj;
            if (typeDescriptor6 != null) {
                typeDescriptor2 = typeDescriptor6;
                typeConverterProvider4 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeConverterProvider4 = null;
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor2, typeConverterProvider4);
        }
        anyTypeArr[4] = anyType4;
        ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types2 = returnTypeProvider2.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        returnType = types2.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types3 = returnTypeProvider2.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types3.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        });
        setFunctionComponent(syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0372 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0244 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1, types: [expo.modules.kotlin.types.TypeConverterProvider] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> SyncFunctionComponent Body(String name, final Function6<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
        KType kType;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        TypeConverterProvider typeConverterProvider;
        AnyType anyType2;
        Object m13470constructorimpl3;
        TypeConverterProvider typeConverterProvider2;
        AnyType anyType3;
        Object m13470constructorimpl4;
        TypeConverterProvider typeConverterProvider3;
        AnyType anyType4;
        Object m13470constructorimpl5;
        TypeConverterProvider typeConverterProvider4;
        AnyType anyType5;
        Object m13470constructorimpl6;
        TypeConverterProvider typeConverterProvider5;
        TypeDescriptor typeDescriptor2;
        ReturnType returnType;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        Intrinsics.reifiedOperationMarker(4, "P5");
        AnyType[] anyTypeArr = new AnyType[6];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType6 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType6 == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                kType = null;
                try {
                    RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                    Intrinsics.needClassReification();
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$16
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            Intrinsics.reifiedOperationMarker(6, "P0");
                            return null;
                        }
                    }));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl != null) {
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    }
                    typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                    if (typeDescriptor == null) {
                    }
                    anyType6 = new AnyType(typeDescriptor, kType);
                    anyTypeArr[0] = anyType6;
                    AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P1");
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P1");
                    anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
                    if (anyType == null) {
                    }
                    anyTypeArr[1] = anyType;
                    AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P2");
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P2");
                    anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
                    if (anyType2 == null) {
                    }
                    anyTypeArr[2] = anyType2;
                    AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P3");
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P3");
                    anyType3 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
                    if (anyType3 == null) {
                    }
                    anyTypeArr[3] = anyType3;
                    AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P4");
                    KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P4");
                    anyType4 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
                    if (anyType4 == null) {
                    }
                    anyTypeArr[4] = anyType4;
                    AnyTypeCache anyTypeCache6 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P5");
                    KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P5");
                    anyType5 = anyTypeCache6.getTypesMap().get(new Pair(orCreateKotlinClass6, false));
                    if (anyType5 == null) {
                    }
                    anyTypeArr[5] = anyType5;
                    ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                    Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
                    Intrinsics.reifiedOperationMarker(4, "R");
                    returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
                    if (returnType == null) {
                    }
                    SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$15
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
                        }
                    });
                    setFunctionComponent(syncFunctionComponent);
                    return syncFunctionComponent;
                }
            } catch (Throwable th2) {
                th = th2;
                kType = null;
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = kType;
            }
            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(kType);
            }
            anyType6 = new AnyType(typeDescriptor, kType);
        }
        anyTypeArr[0] = anyType6;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, false));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$17
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor3 != null) {
                typeConverterProvider = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeConverterProvider = null;
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor3, typeConverterProvider);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$18
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor4 != null) {
                typeConverterProvider2 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeConverterProvider2 = null;
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor4, typeConverterProvider2);
        }
        anyTypeArr[2] = anyType2;
        AnyTypeCache anyTypeCache42 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass42 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        anyType3 = anyTypeCache42.getTypesMap().get(new Pair(orCreateKotlinClass42, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$19
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor5 != null) {
                typeConverterProvider3 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeConverterProvider3 = null;
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor5, typeConverterProvider3);
        }
        anyTypeArr[3] = anyType3;
        AnyTypeCache anyTypeCache52 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass52 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        anyType4 = anyTypeCache52.getTypesMap().get(new Pair(orCreateKotlinClass52, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$20
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th6) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor6 != null) {
                typeConverterProvider4 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeConverterProvider4 = null;
                typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor6, typeConverterProvider4);
        }
        anyTypeArr[4] = anyType4;
        AnyTypeCache anyTypeCache62 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P5");
        KClass orCreateKotlinClass62 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P5");
        anyType5 = anyTypeCache62.getTypesMap().get(new Pair(orCreateKotlinClass62, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion11 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P5");
                TypeInfo throwNonReifiedTypeError6 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor6 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError6);
                Intrinsics.needClassReification();
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$21
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P5");
                        return null;
                    }
                }));
            } catch (Throwable th7) {
                Result.Companion companion12 = Result.INSTANCE;
                m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th7));
            }
            Object obj = m13470constructorimpl6;
            Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(obj);
            if (m13473exceptionOrNullimpl6 != null) {
                Intrinsics.reifiedOperationMarker(4, "P5");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl6);
            }
            if (Result.m13476isFailureimpl(obj)) {
                obj = null;
            }
            TypeDescriptor typeDescriptor7 = (TypeDescriptor) obj;
            if (typeDescriptor7 != null) {
                typeDescriptor2 = typeDescriptor7;
                typeConverterProvider5 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P5");
                typeConverterProvider5 = null;
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor2, typeConverterProvider5);
        }
        anyTypeArr[5] = anyType5;
        ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types2 = returnTypeProvider2.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        returnType = types2.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types3 = returnTypeProvider2.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types3.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        });
        setFunctionComponent(syncFunctionComponent2);
        return syncFunctionComponent2;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> SyncFunctionComponent Body(String name, final Function7<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
        Object m13470constructorimpl;
        Object obj;
        Object m13470constructorimpl2;
        TypeConverterProvider typeConverterProvider;
        Object m13470constructorimpl3;
        TypeConverterProvider typeConverterProvider2;
        Object m13470constructorimpl4;
        TypeConverterProvider typeConverterProvider3;
        Object m13470constructorimpl5;
        TypeConverterProvider typeConverterProvider4;
        Object m13470constructorimpl6;
        TypeConverterProvider typeConverterProvider5;
        Object m13470constructorimpl7;
        char c;
        TypeConverterProvider typeConverterProvider6;
        TypeDescriptor typeDescriptor;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        Intrinsics.reifiedOperationMarker(4, "P5");
        Intrinsics.reifiedOperationMarker(4, "P6");
        AnyType[] anyTypeArr = new AnyType[7];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$22
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P0");
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                obj = m13470constructorimpl;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                obj = m13470constructorimpl;
            }
            if (Result.m13476isFailureimpl(obj)) {
                obj = null;
            }
            TypeDescriptor typeDescriptor2 = (TypeDescriptor) obj;
            if (typeDescriptor2 == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor2, null);
        }
        anyTypeArr[0] = anyType;
        AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        AnyType anyType2 = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$23
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor3 != null) {
                typeConverterProvider = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeConverterProvider = null;
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor3, typeConverterProvider);
        }
        anyTypeArr[1] = anyType2;
        AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        AnyType anyType3 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$24
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor4 != null) {
                typeConverterProvider2 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeConverterProvider2 = null;
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor4, typeConverterProvider2);
        }
        anyTypeArr[2] = anyType3;
        AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        AnyType anyType4 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$25
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor5 != null) {
                typeConverterProvider3 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeConverterProvider3 = null;
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor5, typeConverterProvider3);
        }
        anyTypeArr[3] = anyType4;
        AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        AnyType anyType5 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$26
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor6 != null) {
                typeConverterProvider4 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeConverterProvider4 = null;
                typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor6, typeConverterProvider4);
        }
        anyTypeArr[4] = anyType5;
        AnyTypeCache anyTypeCache6 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P5");
        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P5");
        AnyType anyType6 = anyTypeCache6.getTypesMap().get(new Pair(orCreateKotlinClass6, false));
        if (anyType6 == null) {
            try {
                Result.Companion companion11 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P5");
                TypeInfo throwNonReifiedTypeError6 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor6 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError6);
                Intrinsics.needClassReification();
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$27
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P5");
                        return null;
                    }
                }));
            } catch (Throwable th6) {
                Result.Companion companion12 = Result.INSTANCE;
                m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
            }
            Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
            if (m13473exceptionOrNullimpl6 != null) {
                Intrinsics.reifiedOperationMarker(4, "P5");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl6);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                m13470constructorimpl6 = null;
            }
            TypeDescriptor typeDescriptor7 = (TypeDescriptor) m13470constructorimpl6;
            if (typeDescriptor7 != null) {
                typeConverterProvider5 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P5");
                typeConverterProvider5 = null;
                typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType6 = new AnyType(typeDescriptor7, typeConverterProvider5);
        }
        anyTypeArr[5] = anyType6;
        AnyTypeCache anyTypeCache7 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P6");
        KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P6");
        AnyType anyType7 = anyTypeCache7.getTypesMap().get(new Pair(orCreateKotlinClass7, false));
        if (anyType7 != null) {
            c = 6;
        } else {
            try {
                Result.Companion companion13 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P6");
                TypeInfo throwNonReifiedTypeError7 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor7 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError7);
                Intrinsics.needClassReification();
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$28
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P6");
                        return null;
                    }
                }));
            } catch (Throwable th7) {
                Result.Companion companion14 = Result.INSTANCE;
                m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th7));
            }
            Object obj2 = m13470constructorimpl7;
            Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(obj2);
            if (m13473exceptionOrNullimpl7 != null) {
                Intrinsics.reifiedOperationMarker(4, "P6");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl7);
            }
            if (Result.m13476isFailureimpl(obj2)) {
                obj2 = null;
            }
            TypeDescriptor typeDescriptor8 = (TypeDescriptor) obj2;
            if (typeDescriptor8 != null) {
                typeDescriptor = typeDescriptor8;
                c = 6;
                typeConverterProvider6 = null;
            } else {
                c = 6;
                Intrinsics.reifiedOperationMarker(6, "P6");
                typeConverterProvider6 = null;
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType7 = new AnyType(typeDescriptor, typeConverterProvider6);
        }
        anyTypeArr[c] = anyType7;
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        ReturnType returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types2.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x04c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0429 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0391 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0264 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> SyncFunctionComponent Body(String name, final Function8<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
        Object obj;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        Object obj2;
        TypeDescriptor typeDescriptor;
        AnyType anyType;
        Object m13470constructorimpl2;
        TypeConverterProvider typeConverterProvider;
        AnyType anyType2;
        Object m13470constructorimpl3;
        TypeConverterProvider typeConverterProvider2;
        AnyType anyType3;
        Object m13470constructorimpl4;
        TypeConverterProvider typeConverterProvider3;
        AnyType anyType4;
        Object m13470constructorimpl5;
        TypeConverterProvider typeConverterProvider4;
        AnyType anyType5;
        Object m13470constructorimpl6;
        TypeConverterProvider typeConverterProvider5;
        AnyType anyType6;
        Object m13470constructorimpl7;
        char c;
        TypeConverterProvider typeConverterProvider6;
        AnyType anyType7;
        Object m13470constructorimpl8;
        TypeConverterProvider typeConverterProvider7;
        TypeDescriptor typeDescriptor2;
        ReturnType returnType;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.reifiedOperationMarker(4, "P0");
        Intrinsics.reifiedOperationMarker(4, "P1");
        Intrinsics.reifiedOperationMarker(4, "P2");
        Intrinsics.reifiedOperationMarker(4, "P3");
        Intrinsics.reifiedOperationMarker(4, "P4");
        Intrinsics.reifiedOperationMarker(4, "P5");
        Intrinsics.reifiedOperationMarker(4, "P6");
        Intrinsics.reifiedOperationMarker(4, "P7");
        AnyType[] anyTypeArr = new AnyType[8];
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P0");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P0");
        AnyType anyType8 = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType8 != null) {
            obj = "io.github.lukmccall.pika.typeInfo";
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P0");
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                obj = "io.github.lukmccall.pika.typeInfo";
                try {
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$29
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            Intrinsics.reifiedOperationMarker(6, "P0");
                            return null;
                        }
                    }));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl == null) {
                    }
                    if (Result.m13476isFailureimpl(obj2)) {
                    }
                    typeDescriptor = (TypeDescriptor) obj2;
                    if (typeDescriptor == null) {
                    }
                    anyType8 = new AnyType(typeDescriptor, null);
                    anyTypeArr[0] = anyType8;
                    AnyTypeCache anyTypeCache2 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P1");
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P1");
                    anyType = anyTypeCache2.getTypesMap().get(new Pair(orCreateKotlinClass2, false));
                    if (anyType == null) {
                    }
                    anyTypeArr[1] = anyType;
                    AnyTypeCache anyTypeCache3 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P2");
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P2");
                    anyType2 = anyTypeCache3.getTypesMap().get(new Pair(orCreateKotlinClass3, false));
                    if (anyType2 == null) {
                    }
                    anyTypeArr[2] = anyType2;
                    AnyTypeCache anyTypeCache4 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P3");
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P3");
                    anyType3 = anyTypeCache4.getTypesMap().get(new Pair(orCreateKotlinClass4, false));
                    if (anyType3 == null) {
                    }
                    anyTypeArr[3] = anyType3;
                    AnyTypeCache anyTypeCache5 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P4");
                    KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P4");
                    anyType4 = anyTypeCache5.getTypesMap().get(new Pair(orCreateKotlinClass5, false));
                    if (anyType4 == null) {
                    }
                    anyTypeArr[4] = anyType4;
                    AnyTypeCache anyTypeCache6 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P5");
                    KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P5");
                    anyType5 = anyTypeCache6.getTypesMap().get(new Pair(orCreateKotlinClass6, false));
                    if (anyType5 == null) {
                    }
                    anyTypeArr[5] = anyType5;
                    AnyTypeCache anyTypeCache7 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P6");
                    KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P6");
                    anyType6 = anyTypeCache7.getTypesMap().get(new Pair(orCreateKotlinClass7, false));
                    if (anyType6 == null) {
                    }
                    anyTypeArr[c] = anyType6;
                    AnyTypeCache anyTypeCache8 = AnyTypeCache.INSTANCE;
                    Intrinsics.reifiedOperationMarker(4, "P7");
                    KClass orCreateKotlinClass8 = Reflection.getOrCreateKotlinClass(Object.class);
                    Intrinsics.reifiedOperationMarker(3, "P7");
                    anyType7 = anyTypeCache8.getTypesMap().get(new Pair(orCreateKotlinClass8, false));
                    if (anyType7 == null) {
                    }
                    anyTypeArr[7] = anyType7;
                    ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                    Map<KClass<?>, ReturnType> types = returnTypeProvider.getTypes();
                    Intrinsics.reifiedOperationMarker(4, "R");
                    returnType = types.get(Reflection.getOrCreateKotlinClass(Object.class));
                    if (returnType == null) {
                    }
                    SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$19
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object[] objArr) {
                            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                            return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
                        }
                    });
                    setFunctionComponent(syncFunctionComponent);
                    return syncFunctionComponent;
                }
            } catch (Throwable th2) {
                th = th2;
                obj = "io.github.lukmccall.pika.typeInfo";
            }
            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl == null) {
                Intrinsics.reifiedOperationMarker(4, "P0");
                obj2 = m13470constructorimpl;
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            } else {
                obj2 = m13470constructorimpl;
            }
            if (Result.m13476isFailureimpl(obj2)) {
                obj2 = null;
            }
            typeDescriptor = (TypeDescriptor) obj2;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, "P0");
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType8 = new AnyType(typeDescriptor, null);
        }
        anyTypeArr[0] = anyType8;
        AnyTypeCache anyTypeCache22 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P1");
        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P1");
        anyType = anyTypeCache22.getTypesMap().get(new Pair(orCreateKotlinClass22, false));
        if (anyType == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P1");
                TypeInfo throwNonReifiedTypeError2 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor2 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError2);
                Intrinsics.needClassReification();
                m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor2, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$30
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P1");
                        return null;
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
            if (m13473exceptionOrNullimpl2 != null) {
                Intrinsics.reifiedOperationMarker(4, "P1");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl2);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                m13470constructorimpl2 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl2;
            if (typeDescriptor3 != null) {
                typeConverterProvider = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P1");
                typeConverterProvider = null;
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor3, typeConverterProvider);
        }
        anyTypeArr[1] = anyType;
        AnyTypeCache anyTypeCache32 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P2");
        KClass orCreateKotlinClass32 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P2");
        anyType2 = anyTypeCache32.getTypesMap().get(new Pair(orCreateKotlinClass32, false));
        if (anyType2 == null) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P2");
                TypeInfo throwNonReifiedTypeError3 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor3 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError3);
                Intrinsics.needClassReification();
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor3, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$31
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P2");
                        return null;
                    }
                }));
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Intrinsics.reifiedOperationMarker(4, "P2");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor4 != null) {
                typeConverterProvider2 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P2");
                typeConverterProvider2 = null;
                typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType2 = new AnyType(typeDescriptor4, typeConverterProvider2);
        }
        anyTypeArr[2] = anyType2;
        AnyTypeCache anyTypeCache42 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P3");
        KClass orCreateKotlinClass42 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P3");
        anyType3 = anyTypeCache42.getTypesMap().get(new Pair(orCreateKotlinClass42, false));
        if (anyType3 == null) {
            try {
                Result.Companion companion7 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P3");
                TypeInfo throwNonReifiedTypeError4 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor4 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError4);
                Intrinsics.needClassReification();
                m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor4, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$32
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P3");
                        return null;
                    }
                }));
            } catch (Throwable th5) {
                Result.Companion companion8 = Result.INSTANCE;
                m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
            if (m13473exceptionOrNullimpl4 != null) {
                Intrinsics.reifiedOperationMarker(4, "P3");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl4);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                m13470constructorimpl4 = null;
            }
            TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl4;
            if (typeDescriptor5 != null) {
                typeConverterProvider3 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P3");
                typeConverterProvider3 = null;
                typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType3 = new AnyType(typeDescriptor5, typeConverterProvider3);
        }
        anyTypeArr[3] = anyType3;
        AnyTypeCache anyTypeCache52 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P4");
        KClass orCreateKotlinClass52 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P4");
        anyType4 = anyTypeCache52.getTypesMap().get(new Pair(orCreateKotlinClass52, false));
        if (anyType4 == null) {
            try {
                Result.Companion companion9 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P4");
                TypeInfo throwNonReifiedTypeError5 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor5 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError5);
                Intrinsics.needClassReification();
                m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor5, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$33
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P4");
                        return null;
                    }
                }));
            } catch (Throwable th6) {
                Result.Companion companion10 = Result.INSTANCE;
                m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
            }
            Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
            if (m13473exceptionOrNullimpl5 != null) {
                Intrinsics.reifiedOperationMarker(4, "P4");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl5);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                m13470constructorimpl5 = null;
            }
            TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl5;
            if (typeDescriptor6 != null) {
                typeConverterProvider4 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P4");
                typeConverterProvider4 = null;
                typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType4 = new AnyType(typeDescriptor6, typeConverterProvider4);
        }
        anyTypeArr[4] = anyType4;
        AnyTypeCache anyTypeCache62 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P5");
        KClass orCreateKotlinClass62 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P5");
        anyType5 = anyTypeCache62.getTypesMap().get(new Pair(orCreateKotlinClass62, false));
        if (anyType5 == null) {
            try {
                Result.Companion companion11 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P5");
                TypeInfo throwNonReifiedTypeError6 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor6 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError6);
                Intrinsics.needClassReification();
                m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor6, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$34
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P5");
                        return null;
                    }
                }));
            } catch (Throwable th7) {
                Result.Companion companion12 = Result.INSTANCE;
                m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th7));
            }
            Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
            if (m13473exceptionOrNullimpl6 != null) {
                Intrinsics.reifiedOperationMarker(4, "P5");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl6);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                m13470constructorimpl6 = null;
            }
            TypeDescriptor typeDescriptor7 = (TypeDescriptor) m13470constructorimpl6;
            if (typeDescriptor7 != null) {
                typeConverterProvider5 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P5");
                typeConverterProvider5 = null;
                typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType5 = new AnyType(typeDescriptor7, typeConverterProvider5);
        }
        anyTypeArr[5] = anyType5;
        AnyTypeCache anyTypeCache72 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P6");
        KClass orCreateKotlinClass72 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P6");
        anyType6 = anyTypeCache72.getTypesMap().get(new Pair(orCreateKotlinClass72, false));
        if (anyType6 == null) {
            c = 6;
        } else {
            try {
                Result.Companion companion13 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P6");
                TypeInfo throwNonReifiedTypeError7 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor7 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError7);
                Intrinsics.needClassReification();
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor7, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$35
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P6");
                        return null;
                    }
                }));
            } catch (Throwable th8) {
                Result.Companion companion14 = Result.INSTANCE;
                m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th8));
            }
            Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
            if (m13473exceptionOrNullimpl7 != null) {
                Intrinsics.reifiedOperationMarker(4, "P6");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl7);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl7)) {
                m13470constructorimpl7 = null;
            }
            TypeDescriptor typeDescriptor8 = (TypeDescriptor) m13470constructorimpl7;
            if (typeDescriptor8 != null) {
                c = 6;
                typeConverterProvider6 = null;
            } else {
                c = 6;
                Intrinsics.reifiedOperationMarker(6, "P6");
                typeConverterProvider6 = null;
                typeDescriptor8 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType6 = new AnyType(typeDescriptor8, typeConverterProvider6);
        }
        anyTypeArr[c] = anyType6;
        AnyTypeCache anyTypeCache82 = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "P7");
        KClass orCreateKotlinClass82 = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, "P7");
        anyType7 = anyTypeCache82.getTypesMap().get(new Pair(orCreateKotlinClass82, false));
        if (anyType7 == null) {
            try {
                Result.Companion companion15 = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, "P7");
                TypeInfo throwNonReifiedTypeError8 = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall(obj);
                RawTypeDescriptor rawTypeDescriptor8 = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError8);
                Intrinsics.needClassReification();
                m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor8, new Function0<KType>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$36
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, "P7");
                        return null;
                    }
                }));
            } catch (Throwable th9) {
                Result.Companion companion16 = Result.INSTANCE;
                m13470constructorimpl8 = Result.m13470constructorimpl(ResultKt.createFailure(th9));
            }
            Object obj3 = m13470constructorimpl8;
            Throwable m13473exceptionOrNullimpl8 = Result.m13473exceptionOrNullimpl(obj3);
            if (m13473exceptionOrNullimpl8 != null) {
                Intrinsics.reifiedOperationMarker(4, "P7");
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl8);
            }
            if (Result.m13476isFailureimpl(obj3)) {
                obj3 = null;
            }
            TypeDescriptor typeDescriptor9 = (TypeDescriptor) obj3;
            if (typeDescriptor9 != null) {
                typeDescriptor2 = typeDescriptor9;
                typeConverterProvider7 = null;
            } else {
                Intrinsics.reifiedOperationMarker(6, "P7");
                typeConverterProvider7 = null;
                typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType7 = new AnyType(typeDescriptor2, typeConverterProvider7);
        }
        anyTypeArr[7] = anyType7;
        ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
        Map<KClass<?>, ReturnType> types2 = returnTypeProvider2.getTypes();
        Intrinsics.reifiedOperationMarker(4, "R");
        returnType = types2.get(Reflection.getOrCreateKotlinClass(Object.class));
        if (returnType == null) {
            Intrinsics.reifiedOperationMarker(4, "R");
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
            Map<KClass<?>, ReturnType> types3 = returnTypeProvider2.getTypes();
            Intrinsics.reifiedOperationMarker(4, "R");
            types3.put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
        });
        setFunctionComponent(syncFunctionComponent2);
        return syncFunctionComponent2;
    }
}
