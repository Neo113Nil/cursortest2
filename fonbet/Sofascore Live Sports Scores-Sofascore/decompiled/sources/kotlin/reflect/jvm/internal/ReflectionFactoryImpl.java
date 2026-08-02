package kotlin.reflect.jvm.internal;

import defpackage.a70;
import defpackage.fuf;
import defpackage.hef;
import defpackage.jef;
import defpackage.lef;
import defpackage.mt8;
import defpackage.mz1;
import defpackage.nh2;
import defpackage.nt8;
import defpackage.q0d;
import defpackage.rv2;
import defpackage.s0d;
import defpackage.u0d;
import defpackage.xka;
import defpackage.yhk;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.ReflectLambdaKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class ReflectionFactoryImpl extends fuf {
    public static void clearCaches() {
        CachesKt.clearCaches();
        ModuleByClassLoaderKt.clearModuleByClassLoaderCache();
    }

    private static KDeclarationContainerImpl getOwner(nh2 nh2Var) {
        KDeclarationContainer owner = nh2Var.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.INSTANCE;
    }

    @Override // defpackage.fuf
    public KClass createKotlinClass(Class cls) {
        return new KClassImpl(cls);
    }

    @Override // defpackage.fuf
    public KFunction function(nt8 nt8Var) {
        return new KFunctionImpl(getOwner(nt8Var), nt8Var.getName(), nt8Var.getSignature(), nt8Var.getBoundReceiver());
    }

    @Override // defpackage.fuf
    public KClass getOrCreateKotlinClass(Class cls) {
        return CachesKt.getOrCreateKotlinClass(cls);
    }

    @Override // defpackage.fuf
    public KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return CachesKt.getOrCreateKotlinPackage(cls);
    }

    @Override // defpackage.fuf
    public KType mutableCollectionType(KType kType) {
        return TypeOfImplKt.createMutableCollectionKType(kType);
    }

    @Override // defpackage.fuf
    public KMutableProperty0 mutableProperty0(q0d q0dVar) {
        return new KMutableProperty0Impl(getOwner(q0dVar), q0dVar.getName(), q0dVar.getSignature(), q0dVar.getBoundReceiver());
    }

    @Override // defpackage.fuf
    public KMutableProperty1 mutableProperty1(s0d s0dVar) {
        return new KMutableProperty1Impl(getOwner(s0dVar), s0dVar.getName(), s0dVar.getSignature(), s0dVar.getBoundReceiver());
    }

    @Override // defpackage.fuf
    public KMutableProperty2 mutableProperty2(u0d u0dVar) {
        return new KMutableProperty2Impl(getOwner(u0dVar), u0dVar.getName(), u0dVar.getSignature());
    }

    public KType nothingType(KType kType) {
        return TypeOfImplKt.createNothingType(kType);
    }

    public KType platformType(KType kType, KType kType2) {
        return TypeOfImplKt.createPlatformKType(kType, kType2);
    }

    @Override // defpackage.fuf
    public KProperty0 property0(hef hefVar) {
        return new KProperty0Impl(getOwner(hefVar), hefVar.getName(), hefVar.getSignature(), hefVar.getBoundReceiver());
    }

    @Override // defpackage.fuf
    public KProperty1 property1(jef jefVar) {
        return new KProperty1Impl(getOwner(jefVar), jefVar.getName(), jefVar.getSignature(), jefVar.getBoundReceiver());
    }

    @Override // defpackage.fuf
    public KProperty2 property2(lef lefVar) {
        return new KProperty2Impl(getOwner(lefVar), lefVar.getName(), lefVar.getSignature());
    }

    @Override // defpackage.fuf
    public String renderLambdaToString(mt8 mt8Var) {
        KFunctionImpl asKFunctionImpl;
        KFunction reflect = ReflectLambdaKt.reflect(mt8Var);
        return (reflect == null || (asKFunctionImpl = UtilKt.asKFunctionImpl(reflect)) == null) ? super.renderLambdaToString(mt8Var) : ReflectionObjectRenderer.INSTANCE.renderLambda(asKFunctionImpl.getDescriptor());
    }

    @Override // defpackage.fuf
    public KType typeOf(KClassifier kClassifier, List<KTypeProjection> list, boolean z) {
        return kClassifier instanceof rv2 ? CachesKt.getOrCreateKType(((rv2) kClassifier).getJClass(), list, z) : KClassifiers.createType(kClassifier, list, z, Collections.EMPTY_LIST);
    }

    @Override // defpackage.fuf
    public KTypeParameter typeParameter(Object obj, String str, KVariance kVariance, boolean z) {
        List<KTypeParameter> typeParameters;
        if (obj instanceof KClass) {
            typeParameters = ((KClass) obj).getTypeParameters();
        } else {
            if (!(obj instanceof KCallable)) {
                a70.p(mz1.m(obj, "Type parameter container must be a class or a callable: "));
                return null;
            }
            typeParameters = ((KCallable) obj).getTypeParameters();
        }
        for (KTypeParameter kTypeParameter : typeParameters) {
            if (kTypeParameter.getName().equals(str)) {
                return kTypeParameter;
            }
        }
        yhk.m("Type parameter ", str, " is not found in container: ", obj);
        return null;
    }

    public KClass getOrCreateKotlinClass(Class cls, String str) {
        return CachesKt.getOrCreateKotlinClass(cls);
    }

    public KClass createKotlinClass(Class cls, String str) {
        return new KClassImpl(cls);
    }

    @Override // defpackage.fuf
    public String renderLambdaToString(xka xkaVar) {
        return renderLambdaToString((mt8) xkaVar);
    }

    @Override // defpackage.fuf
    public void setUpperBounds(KTypeParameter kTypeParameter, List<KType> list) {
    }
}
