package expo.modules.kotlin.objects;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: PropertyComponentBuilder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\b\u0001\u0010\f\u0018\u00012\u0014\b\u0004\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\f0\u000eH\u0086\bø\u0001\u0000JT\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\b\u0001\u0010\u0010\u0018\u000128\b\u0004\u0010\r\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0005\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u0011H\u0010¢\u0006\f\b\u0012\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0011H\u0086\bø\u0001\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", "ThisType", "Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "thisType", "Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "name", "", "<init>", "(Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;Ljava/lang/String;)V", "getThisType", "()Lexpo/modules/kotlin/types/descriptors/TypeDescriptor;", "get", "R", "body", "Lkotlin/Function1;", "set", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "self", "newValue", "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PropertyComponentBuilderWithThis<ThisType> extends PropertyComponentBuilder {
    private final TypeDescriptor thisType;

    public final TypeDescriptor getThisType() {
        return this.thisType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyComponentBuilderWithThis(TypeDescriptor thisType, String name) {
        super(name);
        Intrinsics.checkNotNullParameter(thisType, "thisType");
        Intrinsics.checkNotNullParameter(name, "name");
        this.thisType = thisType;
    }

    public final /* synthetic */ <R> PropertyComponentBuilderWithThis<ThisType> get(Function1<? super ThisType, ? extends R> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        AnyType[] anyTypeArr = {new AnyType(getThisType(), null, 2, null)};
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
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr, returnType, new PropertyComponentBuilderWithThis$get$1$1(body));
        syncFunctionComponent.setOwnerType(getThisType());
        syncFunctionComponent.setCanTakeOwner(true);
        setGetter(syncFunctionComponent);
        return this;
    }

    public final /* synthetic */ <T> PropertyComponentBuilderWithThis<ThisType> set(final Function2<? super ThisType, ? super T, Unit> body) {
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(body, "body");
        AnyType[] anyTypeArr = new AnyType[2];
        anyTypeArr[0] = new AnyType(getThisType(), null, 2, null);
        AnyTypeCache anyTypeCache = AnyTypeCache.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        AnyType anyType = anyTypeCache.getTypesMap().get(new Pair(orCreateKotlinClass, false));
        if (anyType == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                TypeInfo throwNonReifiedTypeError = TypeInfoKt.throwNonReifiedTypeError();
                MagicApiIntrinsics.voidMagicApiCall("io.github.lukmccall.pika.typeInfo");
                RawTypeDescriptor rawTypeDescriptor = TypeDescriptorOfKt.toRawTypeDescriptor(throwNonReifiedTypeError);
                Intrinsics.needClassReification();
                Intrinsics.needClassReification();
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(rawTypeDescriptor, new Function0<KType>() { // from class: expo.modules.kotlin.objects.PropertyComponentBuilderWithThis$set$$inlined$apply$lambda$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                        return null;
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                Log.e("ExpoModulesCore", "Failed to get type info for " + Object.class.getName(), m13473exceptionOrNullimpl);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(null);
            }
            anyType = new AnyType(typeDescriptor, null);
        }
        anyTypeArr[1] = anyType;
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Unit.class));
        if (returnType == null) {
            returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Unit.class));
            returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Unit.class), returnType);
        }
        Intrinsics.needClassReification();
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("set", anyTypeArr, returnType, new Function1<Object[], Unit>() { // from class: expo.modules.kotlin.objects.PropertyComponentBuilderWithThis$set$1$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Function2<ThisType, T, Unit> function2 = body;
                Object obj = it[0];
                Object obj2 = it[1];
                Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
                function2.invoke(obj, obj2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr) {
                invoke2(objArr);
                return Unit.INSTANCE;
            }
        });
        syncFunctionComponent.setOwnerType(getThisType());
        syncFunctionComponent.setCanTakeOwner(true);
        setSetter(syncFunctionComponent);
        return this;
    }
}
