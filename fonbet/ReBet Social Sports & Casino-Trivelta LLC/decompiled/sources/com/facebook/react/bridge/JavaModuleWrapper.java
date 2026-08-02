package com.facebook.react.bridge;

import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC4488a
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 '2\u00020\u0001:\u0003%&'B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0003J\u0018\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\tj\b\u0012\u0004\u0012\u00020\r`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00198G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/facebook/react/bridge/JavaModuleWrapper;", "", "jsInstance", "Lcom/facebook/react/bridge/JSInstance;", "moduleHolder", "Lcom/facebook/react/bridge/ModuleHolder;", "<init>", "(Lcom/facebook/react/bridge/JSInstance;Lcom/facebook/react/bridge/ModuleHolder;)V", "methods", "Ljava/util/ArrayList;", "Lcom/facebook/react/bridge/JavaModuleWrapper$NativeMethod;", "Lkotlin/collections/ArrayList;", "descs", "Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;", "module", "Lcom/facebook/react/bridge/BaseJavaModule;", "getModule", "()Lcom/facebook/react/bridge/BaseJavaModule;", "name", "", "getName", "()Ljava/lang/String;", "findMethods", "", "methodDescriptors", "", "getMethodDescriptors", "()Ljava/util/List;", "constants", "Lcom/facebook/react/bridge/NativeMap;", "getConstants", "()Lcom/facebook/react/bridge/NativeMap;", "invoke", "methodId", "", "parameters", "Lcom/facebook/react/bridge/ReadableNativeArray;", "NativeMethod", "MethodDescriptor", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JavaModuleWrapper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ArrayList<MethodDescriptor> descs;

    @NotNull
    private final JSInstance jsInstance;

    @NotNull
    private final ArrayList<NativeMethod> methods;

    @NotNull
    private final ModuleHolder moduleHolder;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/bridge/JavaModuleWrapper$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @InterfaceC4488a
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;", "", "<init>", "()V", "method", "Ljava/lang/reflect/Method;", "getMethod", "()Ljava/lang/reflect/Method;", "setMethod", "(Ljava/lang/reflect/Method;)V", "signature", "", "getSignature", "()Ljava/lang/String;", "setSignature", "(Ljava/lang/String;)V", "name", "getName", "setName", "type", "getType", "setType", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MethodDescriptor {

        @InterfaceC4488a
        @Nullable
        private Method method;

        @InterfaceC4488a
        @Nullable
        private String name;

        @InterfaceC4488a
        @Nullable
        private String signature;

        @InterfaceC4488a
        @Nullable
        private String type;

        @Nullable
        public final Method getMethod() {
            return this.method;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getSignature() {
            return this.signature;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public final void setMethod(@Nullable Method method) {
            this.method = method;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setSignature(@Nullable String str) {
            this.signature = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/JavaModuleWrapper$NativeMethod;", "", "invoke", "", "jsInstance", "Lcom/facebook/react/bridge/JSInstance;", "parameters", "Lcom/facebook/react/bridge/ReadableArray;", "type", "", "getType", "()Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface NativeMethod {
        @NotNull
        String getType();

        void invoke(@NotNull JSInstance jsInstance, @NotNull ReadableArray parameters);
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("JavaModuleWrapper", LegacyArchitectureLogLevel.WARNING);
    }

    public JavaModuleWrapper(@NotNull JSInstance jsInstance, @NotNull ModuleHolder moduleHolder) {
        Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
        Intrinsics.checkNotNullParameter(moduleHolder, "moduleHolder");
        this.jsInstance = jsInstance;
        this.moduleHolder = moduleHolder;
        this.methods = new ArrayList<>();
        this.descs = new ArrayList<>();
    }

    @InterfaceC4488a
    private final void findMethods() {
        A8.a.c(0L, "findMethods");
        Class<?> cls = this.moduleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        Iterator it = ArrayIteratorKt.iterator(cls.getDeclaredMethods());
        while (it.hasNext()) {
            Method method = (Method) it.next();
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                Intrinsics.checkNotNull(method);
                JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                methodDescriptor.setName(name);
                methodDescriptor.setType(javaMethodWrapper.getType());
                if (Intrinsics.areEqual(BaseJavaModule.METHOD_TYPE_SYNC, methodDescriptor.getType())) {
                    methodDescriptor.setSignature(javaMethodWrapper.getSignature());
                    methodDescriptor.setMethod(method);
                }
                this.methods.add(javaMethodWrapper);
                this.descs.add(methodDescriptor);
            }
        }
        A8.a.i(0L);
    }

    @InterfaceC4488a
    @NotNull
    public final NativeMap getConstants() {
        String name = getName();
        A8.b.a(0L, "JavaModuleWrapper.getConstants").b("moduleName", name).c();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        A8.a.c(0L, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        A8.a.i(0L);
        A8.a.c(0L, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap((Map<String, ? extends Object>) constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            A8.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            A8.b.b(0L).c();
        }
    }

    @InterfaceC4488a
    @NotNull
    public final List<MethodDescriptor> getMethodDescriptors() {
        if (this.descs.isEmpty()) {
            findMethods();
        }
        return this.descs;
    }

    @InterfaceC4488a
    @NotNull
    public final BaseJavaModule getModule() {
        NativeModule module = this.moduleHolder.getModule();
        Intrinsics.checkNotNull(module, "null cannot be cast to non-null type com.facebook.react.bridge.BaseJavaModule");
        return (BaseJavaModule) module;
    }

    @InterfaceC4488a
    @NotNull
    public final String getName() {
        return this.moduleHolder.getName();
    }

    @InterfaceC4488a
    public final void invoke(int methodId, @NotNull ReadableNativeArray parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        if (methodId >= this.methods.size()) {
            return;
        }
        this.methods.get(methodId).invoke(this.jsInstance, parameters);
    }
}
