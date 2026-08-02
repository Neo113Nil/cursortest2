package expo.modules.webview;

import android.util.Log;
import android.view.View;
import androidx.tracing.Trace;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.TypeConverterProvider;
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

/* compiled from: DomWebViewModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/webview/DomWebViewModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-dom-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DomWebViewModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
        Object m13470constructorimpl7;
        Object m13470constructorimpl8;
        Object m13470constructorimpl9;
        Object m13470constructorimpl10;
        Object m13470constructorimpl11;
        Object m13470constructorimpl12;
        Object m13470constructorimpl13;
        DomWebViewModule domWebViewModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (domWebViewModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(domWebViewModule);
            moduleDefinitionBuilder.Name("ExpoDomWebViewModule");
            moduleDefinitionBuilder.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$$inlined$OnDestroy$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DomWebViewRegistry.INSTANCE.reset();
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
            AnyType[] anyTypeArr = new AnyType[2];
            AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Integer.class), false));
            Object obj = null;
            if (anyType == null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Int", Reflection.getOrCreateKotlinClass(Integer.class), false)), new Function0<KType>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$$inlined$AsyncFunction$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Integer.TYPE);
                        }
                    }));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Integer.class.getName(), m13473exceptionOrNullimpl);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    m13470constructorimpl = null;
                }
                TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor == null) {
                    typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Integer.TYPE));
                }
                anyType = new AnyType(typeDescriptor, converters);
            }
            anyTypeArr[0] = anyType;
            AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType2 == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$$inlined$AsyncFunction$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                if (m13473exceptionOrNullimpl2 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl2);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                    m13470constructorimpl2 = null;
                }
                TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
                if (typeDescriptor2 == null) {
                    typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType2 = new AnyType(typeDescriptor2, converters);
            }
            anyTypeArr[1] = anyType2;
            moduleDefinitionBuilder2.getAsyncFunctions().put("evalJsForWebViewAsync", new UntypedAsyncFunctionComponent("evalJsForWebViewAsync", anyTypeArr, new Function1<Object[], Unit>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$$inlined$AsyncFunction$3
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj2 = objArr[0];
                    String str = (String) objArr[1];
                    DomWebView domWebView = DomWebViewRegistry.INSTANCE.get(((Number) obj2).intValue());
                    if (domWebView == null) {
                        return null;
                    }
                    domWebView.injectJavaScript(str);
                    return Unit.INSTANCE;
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DomWebView.class);
            try {
                Result.Companion companion5 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.webview.DomWebView", Reflection.getOrCreateKotlinClass(DomWebView.class), false)), new Function0<KType>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$$inlined$View$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(DomWebView.class);
                    }
                }));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
            if (m13473exceptionOrNullimpl3 != null) {
                Log.e("ExpoModulesCore", "Failed to get type info for " + DomWebView.class.getName(), m13473exceptionOrNullimpl3);
            }
            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                m13470constructorimpl3 = null;
            }
            TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
            if (typeDescriptor3 == null) {
                typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(DomWebView.class));
            }
            ViewDefinitionBuilder viewDefinitionBuilder = new ViewDefinitionBuilder(orCreateKotlinClass, typeDescriptor3, moduleDefinitionBuilder3.getConverters());
            CSSPropsKt.UseCSSProps(viewDefinitionBuilder);
            viewDefinitionBuilder.Events("onMessage");
            DomWebViewModule$definition$1$3$1 domWebViewModule$definition$1$3$1 = new Function2<DomWebView, DomWebViewSource, Unit>() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(DomWebView domWebView, DomWebViewSource domWebViewSource) {
                    invoke2(domWebView, domWebViewSource);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DomWebView view, DomWebViewSource source) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(source, "source");
                    view.setSource(source);
                }
            };
            AnyType anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DomWebViewSource.class), false));
            if (anyType3 == null) {
                try {
                    Result.Companion companion7 = Result.INSTANCE;
                    m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.webview.DomWebViewSource", Reflection.getOrCreateKotlinClass(DomWebViewSource.class), false)), new Function0<KType>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(DomWebViewSource.class);
                        }
                    }));
                } catch (Throwable th4) {
                    Result.Companion companion8 = Result.INSTANCE;
                    m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
                }
                Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
                if (m13473exceptionOrNullimpl4 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + DomWebViewSource.class.getName(), m13473exceptionOrNullimpl4);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                    m13470constructorimpl4 = null;
                }
                TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
                if (typeDescriptor4 == null) {
                    typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(DomWebViewSource.class));
                }
                anyType3 = new AnyType(typeDescriptor4, null);
            }
            viewDefinitionBuilder.getProps().put("source", new ConcreteViewProp("source", anyType3, domWebViewModule$definition$1$3$1));
            DomWebViewModule$definition$1$3$2 domWebViewModule$definition$1$3$2 = new Function2<DomWebView, String, Unit>() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(DomWebView domWebView, String str) {
                    invoke2(domWebView, str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DomWebView view, String script) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(script, "script");
                    view.setInjectedJSBeforeContentLoaded(script);
                }
            };
            AnyType anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType4 == null) {
                try {
                    Result.Companion companion9 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th5) {
                    Result.Companion companion10 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
                }
                Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
                if (m13473exceptionOrNullimpl5 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl5);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                    m13470constructorimpl5 = null;
                }
                TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
                if (typeDescriptor5 == null) {
                    typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType4 = new AnyType(typeDescriptor5, null);
            }
            viewDefinitionBuilder.getProps().put("injectedJavaScriptBeforeContentLoaded", new ConcreteViewProp("injectedJavaScriptBeforeContentLoaded", anyType4, domWebViewModule$definition$1$3$2));
            DomWebViewModule$definition$1$3$3 domWebViewModule$definition$1$3$3 = new Function2<DomWebView, Boolean, Unit>() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(DomWebView domWebView, Boolean bool) {
                    invoke(domWebView, bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(DomWebView view, boolean z) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.setWebviewDebuggingEnabled(z);
                }
            };
            AnyType anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), false));
            if (anyType5 == null) {
                try {
                    Result.Companion companion11 = Result.INSTANCE;
                    m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Boolean", Reflection.getOrCreateKotlinClass(Boolean.class), false)), new Function0<KType>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$3
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Boolean.TYPE);
                        }
                    }));
                } catch (Throwable th6) {
                    Result.Companion companion12 = Result.INSTANCE;
                    m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
                }
                Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
                if (m13473exceptionOrNullimpl6 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Boolean.class.getName(), m13473exceptionOrNullimpl6);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                    m13470constructorimpl6 = null;
                }
                TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl6;
                if (typeDescriptor6 == null) {
                    typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Boolean.TYPE));
                }
                anyType5 = new AnyType(typeDescriptor6, null);
            }
            viewDefinitionBuilder.getProps().put("webviewDebuggingEnabled", new ConcreteViewProp("webviewDebuggingEnabled", anyType5, domWebViewModule$definition$1$3$3));
            DomWebViewModule$definition$1$3$4 domWebViewModule$definition$1$3$4 = new Function2<DomWebView, Boolean, Unit>() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(DomWebView domWebView, Boolean bool) {
                    invoke(domWebView, bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final DomWebView view, final boolean z) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.getWebView().post(new Runnable() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            DomWebView.this.getWebView().setHorizontalScrollBarEnabled(z);
                        }
                    });
                }
            };
            AnyType anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), false));
            if (anyType6 == null) {
                try {
                    Result.Companion companion13 = Result.INSTANCE;
                    m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Boolean", Reflection.getOrCreateKotlinClass(Boolean.class), false)), new Function0<KType>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$4
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Boolean.TYPE);
                        }
                    }));
                } catch (Throwable th7) {
                    Result.Companion companion14 = Result.INSTANCE;
                    m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th7));
                }
                Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
                if (m13473exceptionOrNullimpl7 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Boolean.class.getName(), m13473exceptionOrNullimpl7);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl7)) {
                    m13470constructorimpl7 = null;
                }
                TypeDescriptor typeDescriptor7 = (TypeDescriptor) m13470constructorimpl7;
                if (typeDescriptor7 == null) {
                    typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Boolean.TYPE));
                }
                anyType6 = new AnyType(typeDescriptor7, null);
            }
            viewDefinitionBuilder.getProps().put("showsHorizontalScrollIndicator", new ConcreteViewProp("showsHorizontalScrollIndicator", anyType6, domWebViewModule$definition$1$3$4));
            DomWebViewModule$definition$1$3$5 domWebViewModule$definition$1$3$5 = new Function2<DomWebView, Boolean, Unit>() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(DomWebView domWebView, Boolean bool) {
                    invoke(domWebView, bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final DomWebView view, final boolean z) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.getWebView().post(new Runnable() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$5.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            DomWebView.this.getWebView().setVerticalScrollBarEnabled(z);
                        }
                    });
                }
            };
            AnyType anyType7 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), false));
            if (anyType7 == null) {
                try {
                    Result.Companion companion15 = Result.INSTANCE;
                    m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Boolean", Reflection.getOrCreateKotlinClass(Boolean.class), false)), new Function0<KType>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$5
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Boolean.TYPE);
                        }
                    }));
                } catch (Throwable th8) {
                    Result.Companion companion16 = Result.INSTANCE;
                    m13470constructorimpl8 = Result.m13470constructorimpl(ResultKt.createFailure(th8));
                }
                Throwable m13473exceptionOrNullimpl8 = Result.m13473exceptionOrNullimpl(m13470constructorimpl8);
                if (m13473exceptionOrNullimpl8 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Boolean.class.getName(), m13473exceptionOrNullimpl8);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl8)) {
                    m13470constructorimpl8 = null;
                }
                TypeDescriptor typeDescriptor8 = (TypeDescriptor) m13470constructorimpl8;
                if (typeDescriptor8 == null) {
                    typeDescriptor8 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Boolean.TYPE));
                }
                anyType7 = new AnyType(typeDescriptor8, null);
            }
            viewDefinitionBuilder.getProps().put("showsVerticalScrollIndicator", new ConcreteViewProp("showsVerticalScrollIndicator", anyType7, domWebViewModule$definition$1$3$5));
            DomWebViewModule$definition$1$3$6 domWebViewModule$definition$1$3$6 = new Function2<DomWebView, Boolean, Unit>() { // from class: expo.modules.webview.DomWebViewModule$definition$1$3$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(DomWebView domWebView, Boolean bool) {
                    invoke(domWebView, bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(DomWebView view, boolean z) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.setNestedScrollEnabled(z);
                }
            };
            AnyType anyType8 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), false));
            if (anyType8 == null) {
                try {
                    Result.Companion companion17 = Result.INSTANCE;
                    m13470constructorimpl9 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Boolean", Reflection.getOrCreateKotlinClass(Boolean.class), false)), new Function0<KType>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$Prop$6
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Boolean.TYPE);
                        }
                    }));
                } catch (Throwable th9) {
                    Result.Companion companion18 = Result.INSTANCE;
                    m13470constructorimpl9 = Result.m13470constructorimpl(ResultKt.createFailure(th9));
                }
                Throwable m13473exceptionOrNullimpl9 = Result.m13473exceptionOrNullimpl(m13470constructorimpl9);
                if (m13473exceptionOrNullimpl9 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Boolean.class.getName(), m13473exceptionOrNullimpl9);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl9)) {
                    m13470constructorimpl9 = null;
                }
                TypeDescriptor typeDescriptor9 = (TypeDescriptor) m13470constructorimpl9;
                if (typeDescriptor9 == null) {
                    typeDescriptor9 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Boolean.TYPE));
                }
                anyType8 = new AnyType(typeDescriptor9, null);
            }
            viewDefinitionBuilder.getProps().put("nestedScrollEnabled", new ConcreteViewProp("nestedScrollEnabled", anyType8, domWebViewModule$definition$1$3$6));
            TypeConverterProvider converters2 = viewDefinitionBuilder.getConverters();
            AnyType[] anyTypeArr2 = new AnyType[2];
            AnyType anyType9 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DomWebView.class), false));
            if (anyType9 == null) {
                try {
                    Result.Companion companion19 = Result.INSTANCE;
                    m13470constructorimpl10 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.webview.DomWebView", Reflection.getOrCreateKotlinClass(DomWebView.class), false)), new Function0<KType>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(DomWebView.class);
                        }
                    }));
                } catch (Throwable th10) {
                    Result.Companion companion20 = Result.INSTANCE;
                    m13470constructorimpl10 = Result.m13470constructorimpl(ResultKt.createFailure(th10));
                }
                Throwable m13473exceptionOrNullimpl10 = Result.m13473exceptionOrNullimpl(m13470constructorimpl10);
                if (m13473exceptionOrNullimpl10 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + DomWebView.class.getName(), m13473exceptionOrNullimpl10);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl10)) {
                    m13470constructorimpl10 = null;
                }
                TypeDescriptor typeDescriptor10 = (TypeDescriptor) m13470constructorimpl10;
                if (typeDescriptor10 == null) {
                    typeDescriptor10 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(DomWebView.class));
                }
                anyType9 = new AnyType(typeDescriptor10, converters2);
            }
            anyTypeArr2[0] = anyType9;
            AnyType anyType10 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ScrollToParam.class), false));
            if (anyType10 == null) {
                try {
                    Result.Companion companion21 = Result.INSTANCE;
                    m13470constructorimpl11 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.webview.ScrollToParam", Reflection.getOrCreateKotlinClass(ScrollToParam.class), false)), new Function0<KType>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ScrollToParam.class);
                        }
                    }));
                } catch (Throwable th11) {
                    Result.Companion companion22 = Result.INSTANCE;
                    m13470constructorimpl11 = Result.m13470constructorimpl(ResultKt.createFailure(th11));
                }
                Throwable m13473exceptionOrNullimpl11 = Result.m13473exceptionOrNullimpl(m13470constructorimpl11);
                if (m13473exceptionOrNullimpl11 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ScrollToParam.class.getName(), m13473exceptionOrNullimpl11);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl11)) {
                    m13470constructorimpl11 = null;
                }
                TypeDescriptor typeDescriptor11 = (TypeDescriptor) m13470constructorimpl11;
                if (typeDescriptor11 == null) {
                    typeDescriptor11 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(ScrollToParam.class));
                }
                anyType10 = new AnyType(typeDescriptor11, converters2);
            }
            anyTypeArr2[1] = anyType10;
            Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$3
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    ((DomWebView) objArr[0]).scrollTo((ScrollToParam) objArr[1]);
                    return Unit.INSTANCE;
                }
            };
            viewDefinitionBuilder.getAsyncFunctions().put("scrollTo", Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("scrollTo", anyTypeArr2, function1) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("scrollTo", anyTypeArr2, function1) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("scrollTo", anyTypeArr2, function1) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("scrollTo", anyTypeArr2, function1) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("scrollTo", anyTypeArr2, function1) : new UntypedAsyncFunctionComponent("scrollTo", anyTypeArr2, function1));
            TypeConverterProvider converters3 = viewDefinitionBuilder.getConverters();
            AnyType[] anyTypeArr3 = new AnyType[2];
            AnyType anyType11 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DomWebView.class), false));
            if (anyType11 == null) {
                try {
                    Result.Companion companion23 = Result.INSTANCE;
                    m13470constructorimpl12 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.webview.DomWebView", Reflection.getOrCreateKotlinClass(DomWebView.class), false)), new Function0<KType>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$4
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(DomWebView.class);
                        }
                    }));
                } catch (Throwable th12) {
                    Result.Companion companion24 = Result.INSTANCE;
                    m13470constructorimpl12 = Result.m13470constructorimpl(ResultKt.createFailure(th12));
                }
                Throwable m13473exceptionOrNullimpl12 = Result.m13473exceptionOrNullimpl(m13470constructorimpl12);
                if (m13473exceptionOrNullimpl12 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + DomWebView.class.getName(), m13473exceptionOrNullimpl12);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl12)) {
                    m13470constructorimpl12 = null;
                }
                TypeDescriptor typeDescriptor12 = (TypeDescriptor) m13470constructorimpl12;
                if (typeDescriptor12 == null) {
                    typeDescriptor12 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(DomWebView.class));
                }
                anyType11 = new AnyType(typeDescriptor12, converters3);
            }
            anyTypeArr3[0] = anyType11;
            AnyType anyType12 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType12 == null) {
                try {
                    Result.Companion companion25 = Result.INSTANCE;
                    m13470constructorimpl13 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$5
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th13) {
                    Result.Companion companion26 = Result.INSTANCE;
                    m13470constructorimpl13 = Result.m13470constructorimpl(ResultKt.createFailure(th13));
                }
                Throwable m13473exceptionOrNullimpl13 = Result.m13473exceptionOrNullimpl(m13470constructorimpl13);
                if (m13473exceptionOrNullimpl13 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl13);
                }
                if (!Result.m13476isFailureimpl(m13470constructorimpl13)) {
                    obj = m13470constructorimpl13;
                }
                TypeDescriptor typeDescriptor13 = (TypeDescriptor) obj;
                if (typeDescriptor13 == null) {
                    typeDescriptor13 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType12 = new AnyType(typeDescriptor13, converters3);
            }
            anyTypeArr3[1] = anyType12;
            Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$AsyncFunction$6
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    ((DomWebView) objArr[0]).injectJavaScript((String) objArr[1]);
                    return Unit.INSTANCE;
                }
            };
            viewDefinitionBuilder.getAsyncFunctions().put("injectJavaScript", Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("injectJavaScript", anyTypeArr3, function12) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("injectJavaScript", anyTypeArr3, function12) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("injectJavaScript", anyTypeArr3, function12) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("injectJavaScript", anyTypeArr3, function12) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("injectJavaScript", anyTypeArr3, function12) : new UntypedAsyncFunctionComponent("injectJavaScript", anyTypeArr3, function12));
            viewDefinitionBuilder.setOnViewDidUpdateProps(new Function1<View, Unit>() { // from class: expo.modules.webview.DomWebViewModule$definition$lambda$6$lambda$5$$inlined$OnViewDidUpdateProps$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ((DomWebView) it).reload();
                }
            });
            moduleDefinitionBuilder3.registerViewDefinition(viewDefinitionBuilder.build());
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }
}
