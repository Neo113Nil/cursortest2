package expo.modules.blur;

import android.util.Log;
import android.view.View;
import androidx.tracing.Trace;
import expo.modules.blur.enums.BlurMethod;
import expo.modules.blur.enums.TintStyle;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import expo.modules.kotlin.views.ConcreteViewProp;
import expo.modules.kotlin.views.ViewDefinitionBuilder;
import expo.modules.kotlin.views.decorators.CSSPropsKt;
import io.github.lukmccall.pika.TypeInfo;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: BlurModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/blur/BlurModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BlurModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
        Object m13470constructorimpl7;
        BlurModule blurModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (blurModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(blurModule);
            moduleDefinitionBuilder.Name("ExpoBlur");
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ExpoBlurView.class);
            try {
                Result.Companion companion = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.blur.ExpoBlurView", Reflection.getOrCreateKotlinClass(ExpoBlurView.class), false)), new Function0<KType>() { // from class: expo.modules.blur.BlurModule$definition$lambda$3$$inlined$View$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ExpoBlurView.class);
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
            if (m13473exceptionOrNullimpl != null) {
                Log.e("ExpoModulesCore", "Failed to get type info for " + ExpoBlurView.class.getName(), m13473exceptionOrNullimpl);
            }
            Object obj = null;
            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                m13470constructorimpl = null;
            }
            TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
            if (typeDescriptor == null) {
                typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(ExpoBlurView.class));
            }
            ViewDefinitionBuilder viewDefinitionBuilder = new ViewDefinitionBuilder(orCreateKotlinClass, typeDescriptor, moduleDefinitionBuilder2.getConverters());
            CSSPropsKt.UseCSSProps(viewDefinitionBuilder);
            viewDefinitionBuilder.Name("ExpoBlurView");
            BlurModule$definition$1$1$1 blurModule$definition$1$1$1 = new Function2<ExpoBlurView, Integer, Unit>() { // from class: expo.modules.blur.BlurModule$definition$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoBlurView expoBlurView, Integer num) {
                    invoke2(expoBlurView, num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoBlurView view, Integer num) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.setBlurTargetId(num);
                }
            };
            AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Integer.class), true));
            if (anyType == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Int", Reflection.getOrCreateKotlinClass(Integer.class), true)), new Function0<KType>() { // from class: expo.modules.blur.BlurModule$definition$lambda$3$lambda$1$$inlined$Prop$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(Integer.class);
                        }
                    }));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                if (m13473exceptionOrNullimpl2 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Integer.class.getName(), m13473exceptionOrNullimpl2);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                    m13470constructorimpl2 = null;
                }
                TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
                if (typeDescriptor2 == null) {
                    typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(Integer.class));
                }
                anyType = new AnyType(typeDescriptor2, null);
            }
            viewDefinitionBuilder.getProps().put("blurTargetId", new ConcreteViewProp("blurTargetId", anyType, blurModule$definition$1$1$1));
            BlurModule$definition$1$1$2 blurModule$definition$1$1$2 = new Function2<ExpoBlurView, Float, Unit>() { // from class: expo.modules.blur.BlurModule$definition$1$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoBlurView expoBlurView, Float f) {
                    invoke(expoBlurView, f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ExpoBlurView view, float f) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.setBlurRadius(f);
                }
            };
            AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Float.class), false));
            if (anyType2 == null) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Float", Reflection.getOrCreateKotlinClass(Float.class), false)), new Function0<KType>() { // from class: expo.modules.blur.BlurModule$definition$lambda$3$lambda$1$$inlined$Prop$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Float.TYPE);
                        }
                    }));
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
                }
                Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
                if (m13473exceptionOrNullimpl3 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Float.class.getName(), m13473exceptionOrNullimpl3);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                    m13470constructorimpl3 = null;
                }
                TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
                if (typeDescriptor3 == null) {
                    typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Float.TYPE));
                }
                anyType2 = new AnyType(typeDescriptor3, null);
            }
            viewDefinitionBuilder.getProps().put("intensity", new ConcreteViewProp("intensity", anyType2, blurModule$definition$1$1$2));
            BlurModule$definition$1$1$3 blurModule$definition$1$1$3 = new Function2<ExpoBlurView, TintStyle, Unit>() { // from class: expo.modules.blur.BlurModule$definition$1$1$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoBlurView expoBlurView, TintStyle tintStyle) {
                    invoke2(expoBlurView, tintStyle);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoBlurView view, TintStyle tint) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(tint, "tint");
                    view.setTint$expo_blur_release(tint);
                }
            };
            AnyType anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(TintStyle.class), false));
            if (anyType3 == null) {
                try {
                    Result.Companion companion7 = Result.INSTANCE;
                    m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.blur.enums.TintStyle", Reflection.getOrCreateKotlinClass(TintStyle.class), false)), new Function0<KType>() { // from class: expo.modules.blur.BlurModule$definition$lambda$3$lambda$1$$inlined$Prop$3
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(TintStyle.class);
                        }
                    }));
                } catch (Throwable th4) {
                    Result.Companion companion8 = Result.INSTANCE;
                    m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
                }
                Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
                if (m13473exceptionOrNullimpl4 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + TintStyle.class.getName(), m13473exceptionOrNullimpl4);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                    m13470constructorimpl4 = null;
                }
                TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
                if (typeDescriptor4 == null) {
                    typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(TintStyle.class));
                }
                anyType3 = new AnyType(typeDescriptor4, null);
            }
            viewDefinitionBuilder.getProps().put("tint", new ConcreteViewProp("tint", anyType3, blurModule$definition$1$1$3));
            BlurModule$definition$1$1$4 blurModule$definition$1$1$4 = new Function2<ExpoBlurView, Float, Unit>() { // from class: expo.modules.blur.BlurModule$definition$1$1$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoBlurView expoBlurView, Float f) {
                    invoke(expoBlurView, f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ExpoBlurView view, float f) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.applyBlurReduction(f);
                }
            };
            AnyType anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Float.class), false));
            if (anyType4 == null) {
                try {
                    Result.Companion companion9 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Float", Reflection.getOrCreateKotlinClass(Float.class), false)), new Function0<KType>() { // from class: expo.modules.blur.BlurModule$definition$lambda$3$lambda$1$$inlined$Prop$4
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Float.TYPE);
                        }
                    }));
                } catch (Throwable th5) {
                    Result.Companion companion10 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
                }
                Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
                if (m13473exceptionOrNullimpl5 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Float.class.getName(), m13473exceptionOrNullimpl5);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                    m13470constructorimpl5 = null;
                }
                TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
                if (typeDescriptor5 == null) {
                    typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Float.TYPE));
                }
                anyType4 = new AnyType(typeDescriptor5, null);
            }
            viewDefinitionBuilder.getProps().put("blurReductionFactor", new ConcreteViewProp("blurReductionFactor", anyType4, blurModule$definition$1$1$4));
            BlurModule$definition$1$1$5 blurModule$definition$1$1$5 = new Function2<ExpoBlurView, BlurMethod, Unit>() { // from class: expo.modules.blur.BlurModule$definition$1$1$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExpoBlurView expoBlurView, BlurMethod blurMethod) {
                    invoke2(expoBlurView, blurMethod);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpoBlurView view, BlurMethod blurMethod) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(blurMethod, "blurMethod");
                    view.setBlurMethod(blurMethod);
                }
            };
            AnyType anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(BlurMethod.class), false));
            if (anyType5 == null) {
                try {
                    Result.Companion companion11 = Result.INSTANCE;
                    m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.blur.enums.BlurMethod", Reflection.getOrCreateKotlinClass(BlurMethod.class), false)), new Function0<KType>() { // from class: expo.modules.blur.BlurModule$definition$lambda$3$lambda$1$$inlined$Prop$5
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(BlurMethod.class);
                        }
                    }));
                } catch (Throwable th6) {
                    Result.Companion companion12 = Result.INSTANCE;
                    m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
                }
                Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
                if (m13473exceptionOrNullimpl6 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + BlurMethod.class.getName(), m13473exceptionOrNullimpl6);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                    m13470constructorimpl6 = null;
                }
                TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl6;
                if (typeDescriptor6 == null) {
                    typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(BlurMethod.class));
                }
                anyType5 = new AnyType(typeDescriptor6, null);
            }
            viewDefinitionBuilder.getProps().put("blurMethod", new ConcreteViewProp("blurMethod", anyType5, blurModule$definition$1$1$5));
            viewDefinitionBuilder.setOnViewDidUpdateProps(new Function1<View, Unit>() { // from class: expo.modules.blur.BlurModule$definition$lambda$3$lambda$1$$inlined$OnViewDidUpdateProps$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ((ExpoBlurView) it).applyTint();
                }
            });
            moduleDefinitionBuilder2.registerViewDefinition(viewDefinitionBuilder.build());
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(ExpoBlurTargetView.class);
            try {
                Result.Companion companion13 = Result.INSTANCE;
                m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.blur.ExpoBlurTargetView", Reflection.getOrCreateKotlinClass(ExpoBlurTargetView.class), false)), new Function0<KType>() { // from class: expo.modules.blur.BlurModule$definition$lambda$3$$inlined$View$2
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ExpoBlurTargetView.class);
                    }
                }));
            } catch (Throwable th7) {
                Result.Companion companion14 = Result.INSTANCE;
                m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th7));
            }
            Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
            if (m13473exceptionOrNullimpl7 != null) {
                Log.e("ExpoModulesCore", "Failed to get type info for " + ExpoBlurTargetView.class.getName(), m13473exceptionOrNullimpl7);
            }
            if (!Result.m13476isFailureimpl(m13470constructorimpl7)) {
                obj = m13470constructorimpl7;
            }
            TypeDescriptor typeDescriptor7 = (TypeDescriptor) obj;
            if (typeDescriptor7 == null) {
                typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(ExpoBlurTargetView.class));
            }
            ViewDefinitionBuilder viewDefinitionBuilder2 = new ViewDefinitionBuilder(orCreateKotlinClass2, typeDescriptor7, moduleDefinitionBuilder3.getConverters());
            CSSPropsKt.UseCSSProps(viewDefinitionBuilder2);
            viewDefinitionBuilder2.Name("ExpoBlurTargetView");
            moduleDefinitionBuilder3.registerViewDefinition(viewDefinitionBuilder2.build());
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }
}
