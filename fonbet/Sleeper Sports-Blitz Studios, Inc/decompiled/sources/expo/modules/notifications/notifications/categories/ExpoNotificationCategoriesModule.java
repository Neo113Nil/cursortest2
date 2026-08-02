package expo.modules.notifications.notifications.categories;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.tracing.Trace;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.errors.InvalidArgumentException;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
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
import expo.modules.notifications.UtilsKt;
import expo.modules.notifications.notifications.categories.NotificationActionRecord;
import expo.modules.notifications.notifications.categories.serializers.ExpoNotificationsCategoriesSerializer;
import expo.modules.notifications.notifications.model.NotificationAction;
import expo.modules.notifications.notifications.model.NotificationCategory;
import expo.modules.notifications.notifications.model.TextInputNotificationAction;
import expo.modules.notifications.service.NotificationsService;
import io.github.lukmccall.pika.TypeInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* compiled from: ExpoNotificationCategoriesModule.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016JF\u0010\u000e\u001a\u00020\u000f2<\u0010\u0010\u001a8\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0011j\u0002`\u0019H\u0002J>\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010!2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016J\u001e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u001e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006*"}, d2 = {"Lexpo/modules/notifications/notifications/categories/ExpoNotificationCategoriesModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "serializer", "Lexpo/modules/notifications/notifications/categories/serializers/ExpoNotificationsCategoriesSerializer;", "getSerializer", "()Lexpo/modules/notifications/notifications/categories/serializers/ExpoNotificationsCategoriesSerializer;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "createResultReceiver", "Landroid/os/ResultReceiver;", "body", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "resultCode", "Landroid/os/Bundle;", "resultData", "", "Lexpo/modules/notifications/ResultReceiverBody;", "setNotificationCategoryAsync", "identifier", "", "actionArguments", "", "Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;", "categoryOptions", "", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/Promise;", "deleteNotificationCategoryAsync", "serializeCategories", "categories", "", "Lexpo/modules/notifications/notifications/model/NotificationCategory;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class ExpoNotificationCategoriesModule extends Module {
    private final ExpoNotificationsCategoriesSerializer serializer = new ExpoNotificationsCategoriesSerializer();

    protected final ExpoNotificationsCategoriesSerializer getSerializer() {
        return this.serializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0326 A[Catch: all -> 0x0439, TryCatch #8 {all -> 0x0439, blocks: (B:3:0x002b, B:6:0x004a, B:7:0x0149, B:99:0x01ac, B:101:0x01b2, B:102:0x01c7, B:105:0x01ce, B:108:0x01dd, B:109:0x01d3, B:10:0x01e3, B:13:0x02a5, B:17:0x036f, B:20:0x041a, B:27:0x03e2, B:29:0x03e8, B:30:0x03fd, B:33:0x0404, B:36:0x0413, B:37:0x0409, B:40:0x03d8, B:46:0x0320, B:48:0x0326, B:49:0x033b, B:52:0x0342, B:55:0x0369, B:56:0x0347, B:59:0x0316, B:74:0x0262, B:76:0x0268, B:77:0x027d, B:80:0x0284, B:83:0x029f, B:84:0x0289, B:87:0x0258, B:112:0x01a2, B:113:0x005c, B:134:0x00ae, B:136:0x00b4, B:137:0x00c9, B:140:0x00d0, B:143:0x00df, B:144:0x00d5, B:115:0x00e5, B:117:0x00f8, B:119:0x0101, B:121:0x0109, B:122:0x0111, B:124:0x0119, B:125:0x0121, B:127:0x0129, B:128:0x0131, B:130:0x0139, B:131:0x0141, B:147:0x00a4, B:98:0x0182, B:133:0x0082, B:26:0x03b7), top: B:2:0x002b, inners: #2, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0347 A[Catch: all -> 0x0439, TryCatch #8 {all -> 0x0439, blocks: (B:3:0x002b, B:6:0x004a, B:7:0x0149, B:99:0x01ac, B:101:0x01b2, B:102:0x01c7, B:105:0x01ce, B:108:0x01dd, B:109:0x01d3, B:10:0x01e3, B:13:0x02a5, B:17:0x036f, B:20:0x041a, B:27:0x03e2, B:29:0x03e8, B:30:0x03fd, B:33:0x0404, B:36:0x0413, B:37:0x0409, B:40:0x03d8, B:46:0x0320, B:48:0x0326, B:49:0x033b, B:52:0x0342, B:55:0x0369, B:56:0x0347, B:59:0x0316, B:74:0x0262, B:76:0x0268, B:77:0x027d, B:80:0x0284, B:83:0x029f, B:84:0x0289, B:87:0x0258, B:112:0x01a2, B:113:0x005c, B:134:0x00ae, B:136:0x00b4, B:137:0x00c9, B:140:0x00d0, B:143:0x00df, B:144:0x00d5, B:115:0x00e5, B:117:0x00f8, B:119:0x0101, B:121:0x0109, B:122:0x0111, B:124:0x0119, B:125:0x0121, B:127:0x0129, B:128:0x0131, B:130:0x0139, B:131:0x0141, B:147:0x00a4, B:98:0x0182, B:133:0x0082, B:26:0x03b7), top: B:2:0x002b, inners: #2, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0268 A[Catch: all -> 0x0439, TryCatch #8 {all -> 0x0439, blocks: (B:3:0x002b, B:6:0x004a, B:7:0x0149, B:99:0x01ac, B:101:0x01b2, B:102:0x01c7, B:105:0x01ce, B:108:0x01dd, B:109:0x01d3, B:10:0x01e3, B:13:0x02a5, B:17:0x036f, B:20:0x041a, B:27:0x03e2, B:29:0x03e8, B:30:0x03fd, B:33:0x0404, B:36:0x0413, B:37:0x0409, B:40:0x03d8, B:46:0x0320, B:48:0x0326, B:49:0x033b, B:52:0x0342, B:55:0x0369, B:56:0x0347, B:59:0x0316, B:74:0x0262, B:76:0x0268, B:77:0x027d, B:80:0x0284, B:83:0x029f, B:84:0x0289, B:87:0x0258, B:112:0x01a2, B:113:0x005c, B:134:0x00ae, B:136:0x00b4, B:137:0x00c9, B:140:0x00d0, B:143:0x00df, B:144:0x00d5, B:115:0x00e5, B:117:0x00f8, B:119:0x0101, B:121:0x0109, B:122:0x0111, B:124:0x0119, B:125:0x0121, B:127:0x0129, B:128:0x0131, B:130:0x0139, B:131:0x0141, B:147:0x00a4, B:98:0x0182, B:133:0x0082, B:26:0x03b7), top: B:2:0x002b, inners: #2, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0289 A[Catch: all -> 0x0439, TryCatch #8 {all -> 0x0439, blocks: (B:3:0x002b, B:6:0x004a, B:7:0x0149, B:99:0x01ac, B:101:0x01b2, B:102:0x01c7, B:105:0x01ce, B:108:0x01dd, B:109:0x01d3, B:10:0x01e3, B:13:0x02a5, B:17:0x036f, B:20:0x041a, B:27:0x03e2, B:29:0x03e8, B:30:0x03fd, B:33:0x0404, B:36:0x0413, B:37:0x0409, B:40:0x03d8, B:46:0x0320, B:48:0x0326, B:49:0x033b, B:52:0x0342, B:55:0x0369, B:56:0x0347, B:59:0x0316, B:74:0x0262, B:76:0x0268, B:77:0x027d, B:80:0x0284, B:83:0x029f, B:84:0x0289, B:87:0x0258, B:112:0x01a2, B:113:0x005c, B:134:0x00ae, B:136:0x00b4, B:137:0x00c9, B:140:0x00d0, B:143:0x00df, B:144:0x00d5, B:115:0x00e5, B:117:0x00f8, B:119:0x0101, B:121:0x0109, B:122:0x0111, B:124:0x0119, B:125:0x0121, B:127:0x0129, B:128:0x0131, B:130:0x0139, B:131:0x0141, B:147:0x00a4, B:98:0x0182, B:133:0x0082, B:26:0x03b7), top: B:2:0x002b, inners: #2, #3, #6 }] */
    /* JADX WARN: Type inference failed for: r16v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    @Override // expo.modules.kotlin.modules.Module
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent;
        Object m13470constructorimpl2;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        ModuleDefinitionBuilder moduleDefinitionBuilder2;
        boolean z;
        Object m13470constructorimpl3;
        boolean z2;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        ?? r16;
        AnyType anyType;
        char c;
        Object m13470constructorimpl4;
        char c2;
        Throwable m13473exceptionOrNullimpl2;
        TypeDescriptor typeDescriptor2;
        char c3;
        AnyType anyType2;
        Object m13470constructorimpl5;
        ExpoNotificationCategoriesModule expoNotificationCategoriesModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (expoNotificationCategoriesModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = new ModuleDefinitionBuilder(expoNotificationCategoriesModule);
            moduleDefinitionBuilder3.Name("ExpoNotificationCategoriesModule");
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder3;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getNotificationCategoriesAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Context context;
                        ResultReceiver createResultReceiver;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        NotificationsService.Companion companion = NotificationsService.INSTANCE;
                        context = ExpoNotificationCategoriesModule.this.getContext();
                        createResultReceiver = ExpoNotificationCategoriesModule.this.createResultReceiver(new ExpoNotificationCategoriesModule$definition$1$1$1(promise, ExpoNotificationCategoriesModule.this));
                        companion.getCategories(context, createResultReceiver);
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder4.getConverters();
                AnyType[] anyTypeArr = new AnyType[1];
                AnyType anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType3 == null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunction$2
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Promise.class);
                            }
                        }));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl3 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Promise.class.getName(), m13473exceptionOrNullimpl3);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                        m13470constructorimpl = null;
                    }
                    TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl;
                    if (typeDescriptor3 == null) {
                        typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Promise.class));
                    }
                    anyType3 = new AnyType(typeDescriptor3, converters);
                }
                anyTypeArr[0] = anyType3;
                Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Context context;
                        ResultReceiver createResultReceiver;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        NotificationsService.Companion companion3 = NotificationsService.INSTANCE;
                        context = ExpoNotificationCategoriesModule.this.getContext();
                        createResultReceiver = ExpoNotificationCategoriesModule.this.createResultReceiver(new ExpoNotificationCategoriesModule$definition$1$1$1(promise, ExpoNotificationCategoriesModule.this));
                        companion3.getCategories(context, createResultReceiver);
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getNotificationCategoriesAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getNotificationCategoriesAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getNotificationCategoriesAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getNotificationCategoriesAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("getNotificationCategoriesAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getNotificationCategoriesAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder4.getAsyncFunctions().put("getNotificationCategoriesAsync", intAsyncFunctionComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder5 = moduleDefinitionBuilder3;
            TypeConverterProvider converters2 = moduleDefinitionBuilder5.getConverters();
            AnyType[] anyTypeArr2 = new AnyType[3];
            AnyType anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType4 == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                if (m13473exceptionOrNullimpl4 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl4);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                    m13470constructorimpl2 = null;
                }
                TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl2;
                if (typeDescriptor4 == null) {
                    typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType4 = new AnyType(typeDescriptor4, converters2);
            }
            anyTypeArr2[0] = anyType4;
            AnyType anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(List.class), false));
            if (anyType5 != null) {
                moduleDefinitionBuilder = moduleDefinitionBuilder3;
                moduleDefinitionBuilder2 = moduleDefinitionBuilder5;
                r16 = 1;
            } else {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(List.class);
                    TypeInfo[] typeInfoArr = new TypeInfo[1];
                    z = true;
                    try {
                        moduleDefinitionBuilder = moduleDefinitionBuilder3;
                        try {
                            moduleDefinitionBuilder2 = moduleDefinitionBuilder5;
                            try {
                                typeInfoArr[0] = new TypeInfo.Simple("expo.modules.notifications.notifications.categories.NotificationActionRecord", Reflection.getOrCreateKotlinClass(NotificationActionRecord.class), false);
                                m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Parameterized("kotlin.collections.List", orCreateKotlinClass, false, ArraysKt.asList(typeInfoArr))), new Function0<KType>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final KType invoke() {
                                        return Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(NotificationActionRecord.class)));
                                    }
                                }));
                                z2 = true;
                            } catch (Throwable th3) {
                                th = th3;
                                Result.Companion companion6 = Result.INSTANCE;
                                m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                                z2 = z;
                                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
                                if (m13473exceptionOrNullimpl != null) {
                                }
                                if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                                }
                                typeDescriptor = (TypeDescriptor) m13470constructorimpl3;
                                if (typeDescriptor == null) {
                                }
                                anyType5 = new AnyType(typeDescriptor, converters2);
                                r16 = z2;
                                anyTypeArr2[r16] = anyType5;
                                anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), Boolean.valueOf((boolean) r16)));
                                if (anyType != null) {
                                }
                                anyTypeArr2[c3] = anyType;
                                AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("setNotificationCategoryAsync", anyTypeArr2, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$4
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Object[] objArr, Promise promise) {
                                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                        Intrinsics.checkNotNullParameter(promise, "promise");
                                        Object obj = objArr[0];
                                        Object obj2 = objArr[1];
                                        Map<String, ? extends Object> map = (Map) objArr[2];
                                        ExpoNotificationCategoriesModule expoNotificationCategoriesModule2 = ExpoNotificationCategoriesModule.this;
                                        expoNotificationCategoriesModule2.setNotificationCategoryAsync((String) obj, (List) obj2, map, promise);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                        invoke2(objArr, promise);
                                        return Unit.INSTANCE;
                                    }
                                });
                                moduleDefinitionBuilder2.getAsyncFunctions().put("setNotificationCategoryAsync", asyncFunctionWithPromiseComponent);
                                AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = asyncFunctionWithPromiseComponent;
                                ModuleDefinitionBuilder moduleDefinitionBuilder6 = moduleDefinitionBuilder;
                                TypeConverterProvider converters3 = moduleDefinitionBuilder6.getConverters();
                                AnyType[] anyTypeArr3 = new AnyType[1];
                                anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                                if (anyType2 == null) {
                                }
                                anyTypeArr3[0] = anyType2;
                                AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("deleteNotificationCategoryAsync", anyTypeArr3, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$6
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Object[] objArr, Promise promise) {
                                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                        Intrinsics.checkNotNullParameter(promise, "promise");
                                        ExpoNotificationCategoriesModule.this.deleteNotificationCategoryAsync((String) objArr[0], promise);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                        invoke2(objArr, promise);
                                        return Unit.INSTANCE;
                                    }
                                });
                                moduleDefinitionBuilder6.getAsyncFunctions().put("deleteNotificationCategoryAsync", asyncFunctionWithPromiseComponent3);
                                AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent4 = asyncFunctionWithPromiseComponent3;
                                return moduleDefinitionBuilder.buildModule();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            moduleDefinitionBuilder2 = moduleDefinitionBuilder5;
                            Result.Companion companion62 = Result.INSTANCE;
                            m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                            z2 = z;
                            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
                            if (m13473exceptionOrNullimpl != null) {
                            }
                            if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                            }
                            typeDescriptor = (TypeDescriptor) m13470constructorimpl3;
                            if (typeDescriptor == null) {
                            }
                            anyType5 = new AnyType(typeDescriptor, converters2);
                            r16 = z2;
                            anyTypeArr2[r16] = anyType5;
                            anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), Boolean.valueOf((boolean) r16)));
                            if (anyType != null) {
                            }
                            anyTypeArr2[c3] = anyType;
                            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent5 = new AsyncFunctionWithPromiseComponent("setNotificationCategoryAsync", anyTypeArr2, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$4
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Object[] objArr, Promise promise) {
                                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                    Intrinsics.checkNotNullParameter(promise, "promise");
                                    Object obj = objArr[0];
                                    Object obj2 = objArr[1];
                                    Map<String, ? extends Object> map = (Map) objArr[2];
                                    ExpoNotificationCategoriesModule expoNotificationCategoriesModule2 = ExpoNotificationCategoriesModule.this;
                                    expoNotificationCategoriesModule2.setNotificationCategoryAsync((String) obj, (List) obj2, map, promise);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                    invoke2(objArr, promise);
                                    return Unit.INSTANCE;
                                }
                            });
                            moduleDefinitionBuilder2.getAsyncFunctions().put("setNotificationCategoryAsync", asyncFunctionWithPromiseComponent5);
                            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent22 = asyncFunctionWithPromiseComponent5;
                            ModuleDefinitionBuilder moduleDefinitionBuilder62 = moduleDefinitionBuilder;
                            TypeConverterProvider converters32 = moduleDefinitionBuilder62.getConverters();
                            AnyType[] anyTypeArr32 = new AnyType[1];
                            anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                            if (anyType2 == null) {
                            }
                            anyTypeArr32[0] = anyType2;
                            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent32 = new AsyncFunctionWithPromiseComponent("deleteNotificationCategoryAsync", anyTypeArr32, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$6
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Object[] objArr, Promise promise) {
                                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                    Intrinsics.checkNotNullParameter(promise, "promise");
                                    ExpoNotificationCategoriesModule.this.deleteNotificationCategoryAsync((String) objArr[0], promise);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                    invoke2(objArr, promise);
                                    return Unit.INSTANCE;
                                }
                            });
                            moduleDefinitionBuilder62.getAsyncFunctions().put("deleteNotificationCategoryAsync", asyncFunctionWithPromiseComponent32);
                            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent42 = asyncFunctionWithPromiseComponent32;
                            return moduleDefinitionBuilder.buildModule();
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        moduleDefinitionBuilder = moduleDefinitionBuilder3;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    moduleDefinitionBuilder = moduleDefinitionBuilder3;
                    moduleDefinitionBuilder2 = moduleDefinitionBuilder5;
                    z = true;
                }
                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
                if (m13473exceptionOrNullimpl != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + List.class.getName(), m13473exceptionOrNullimpl);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                    m13470constructorimpl3 = null;
                }
                typeDescriptor = (TypeDescriptor) m13470constructorimpl3;
                if (typeDescriptor == null) {
                    typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(NotificationActionRecord.class))));
                }
                anyType5 = new AnyType(typeDescriptor, converters2);
                r16 = z2;
            }
            anyTypeArr2[r16] = anyType5;
            anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), Boolean.valueOf((boolean) r16)));
            if (anyType != null) {
                c3 = 2;
            } else {
                try {
                    Result.Companion companion7 = Result.INSTANCE;
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Map.class);
                    TypeInfo[] typeInfoArr2 = new TypeInfo[2];
                    typeInfoArr2[0] = new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false);
                    c = 2;
                    boolean z3 = r16;
                    try {
                        typeInfoArr2[z3 ? 1 : 0] = new TypeInfo.Simple("kotlin.Any", Reflection.getOrCreateKotlinClass(Object.class), z3);
                        m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Parameterized("kotlin.collections.Map", orCreateKotlinClass2, z3, ArraysKt.asList(typeInfoArr2))), new Function0<KType>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$3
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.nullableTypeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(Object.class)));
                            }
                        }));
                        c2 = 2;
                    } catch (Throwable th7) {
                        th = th7;
                        Result.Companion companion8 = Result.INSTANCE;
                        m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        c2 = c;
                        m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
                        if (m13473exceptionOrNullimpl2 != null) {
                        }
                        if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                        }
                        typeDescriptor2 = (TypeDescriptor) m13470constructorimpl4;
                        if (typeDescriptor2 != null) {
                        }
                        anyType = new AnyType(typeDescriptor2, converters2);
                        c3 = c2;
                        anyTypeArr2[c3] = anyType;
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent52 = new AsyncFunctionWithPromiseComponent("setNotificationCategoryAsync", anyTypeArr2, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$4
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Object[] objArr, Promise promise) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Intrinsics.checkNotNullParameter(promise, "promise");
                                Object obj = objArr[0];
                                Object obj2 = objArr[1];
                                Map<String, ? extends Object> map = (Map) objArr[2];
                                ExpoNotificationCategoriesModule expoNotificationCategoriesModule2 = ExpoNotificationCategoriesModule.this;
                                expoNotificationCategoriesModule2.setNotificationCategoryAsync((String) obj, (List) obj2, map, promise);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                invoke2(objArr, promise);
                                return Unit.INSTANCE;
                            }
                        });
                        moduleDefinitionBuilder2.getAsyncFunctions().put("setNotificationCategoryAsync", asyncFunctionWithPromiseComponent52);
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent222 = asyncFunctionWithPromiseComponent52;
                        ModuleDefinitionBuilder moduleDefinitionBuilder622 = moduleDefinitionBuilder;
                        TypeConverterProvider converters322 = moduleDefinitionBuilder622.getConverters();
                        AnyType[] anyTypeArr322 = new AnyType[1];
                        anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                        if (anyType2 == null) {
                        }
                        anyTypeArr322[0] = anyType2;
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent322 = new AsyncFunctionWithPromiseComponent("deleteNotificationCategoryAsync", anyTypeArr322, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$6
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Object[] objArr, Promise promise) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Intrinsics.checkNotNullParameter(promise, "promise");
                                ExpoNotificationCategoriesModule.this.deleteNotificationCategoryAsync((String) objArr[0], promise);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                invoke2(objArr, promise);
                                return Unit.INSTANCE;
                            }
                        });
                        moduleDefinitionBuilder622.getAsyncFunctions().put("deleteNotificationCategoryAsync", asyncFunctionWithPromiseComponent322);
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent422 = asyncFunctionWithPromiseComponent322;
                        return moduleDefinitionBuilder.buildModule();
                    }
                } catch (Throwable th8) {
                    th = th8;
                    c = 2;
                }
                m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
                if (m13473exceptionOrNullimpl2 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Map.class.getName(), m13473exceptionOrNullimpl2);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                    m13470constructorimpl4 = null;
                }
                typeDescriptor2 = (TypeDescriptor) m13470constructorimpl4;
                if (typeDescriptor2 != null) {
                    typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(Object.class))));
                }
                anyType = new AnyType(typeDescriptor2, converters2);
                c3 = c2;
            }
            anyTypeArr2[c3] = anyType;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent522 = new AsyncFunctionWithPromiseComponent("setNotificationCategoryAsync", anyTypeArr2, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    Map<String, ? extends Object> map = (Map) objArr[2];
                    ExpoNotificationCategoriesModule expoNotificationCategoriesModule2 = ExpoNotificationCategoriesModule.this;
                    expoNotificationCategoriesModule2.setNotificationCategoryAsync((String) obj, (List) obj2, map, promise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder2.getAsyncFunctions().put("setNotificationCategoryAsync", asyncFunctionWithPromiseComponent522);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2222 = asyncFunctionWithPromiseComponent522;
            ModuleDefinitionBuilder moduleDefinitionBuilder6222 = moduleDefinitionBuilder;
            TypeConverterProvider converters3222 = moduleDefinitionBuilder6222.getConverters();
            AnyType[] anyTypeArr3222 = new AnyType[1];
            anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType2 == null) {
                try {
                    Result.Companion companion9 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$5
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th9) {
                    Result.Companion companion10 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th9));
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
                anyType2 = new AnyType(typeDescriptor5, converters3222);
            }
            anyTypeArr3222[0] = anyType2;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3222 = new AsyncFunctionWithPromiseComponent("deleteNotificationCategoryAsync", anyTypeArr3222, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    ExpoNotificationCategoriesModule.this.deleteNotificationCategoryAsync((String) objArr[0], promise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder6222.getAsyncFunctions().put("deleteNotificationCategoryAsync", asyncFunctionWithPromiseComponent3222);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent4222 = asyncFunctionWithPromiseComponent3222;
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResultReceiver createResultReceiver(Function2<? super Integer, ? super Bundle, Unit> body) {
        return UtilsKt.createDefaultResultReceiver(null, body);
    }

    public void setNotificationCategoryAsync(String identifier, List<NotificationActionRecord> actionArguments, Map<String, ? extends Object> categoryOptions, final Promise promise) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(actionArguments, "actionArguments");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ArrayList arrayList = new ArrayList();
        for (NotificationActionRecord notificationActionRecord : actionArguments) {
            NotificationActionRecord.TextInput textInput = notificationActionRecord.getTextInput();
            if (textInput != null) {
                arrayList.add(new TextInputNotificationAction(notificationActionRecord.getIdentifier(), notificationActionRecord.getButtonTitle(), notificationActionRecord.getOptions().getOpensAppToForeground(), textInput.getPlaceholder()));
            } else {
                arrayList.add(new NotificationAction(notificationActionRecord.getIdentifier(), notificationActionRecord.getButtonTitle(), notificationActionRecord.getOptions().getOpensAppToForeground()));
            }
        }
        if (arrayList.isEmpty()) {
            throw new InvalidArgumentException("Invalid arguments provided for notification category. Must provide at least one action.");
        }
        NotificationsService.INSTANCE.setCategory(getContext(), new NotificationCategory(identifier, arrayList), createResultReceiver(new Function2() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit notificationCategoryAsync$lambda$3;
                notificationCategoryAsync$lambda$3 = ExpoNotificationCategoriesModule.setNotificationCategoryAsync$lambda$3(Promise.this, this, ((Integer) obj).intValue(), (Bundle) obj2);
                return notificationCategoryAsync$lambda$3;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setNotificationCategoryAsync$lambda$3(Promise promise, ExpoNotificationCategoriesModule expoNotificationCategoriesModule, int i, Bundle bundle) {
        NotificationCategory notificationCategory = bundle != null ? (NotificationCategory) bundle.getParcelable(NotificationsService.NOTIFICATION_CATEGORY_KEY) : null;
        if (i == 0 && notificationCategory != null) {
            promise.resolve(expoNotificationCategoriesModule.serializer.toBundle(notificationCategory));
        } else {
            promise.reject("ERR_CATEGORY_SET_FAILED", "The provided category could not be set.", null);
        }
        return Unit.INSTANCE;
    }

    public void deleteNotificationCategoryAsync(String identifier, final Promise promise) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(promise, "promise");
        NotificationsService.INSTANCE.deleteCategory(getContext(), identifier, createResultReceiver(new Function2() { // from class: expo.modules.notifications.notifications.categories.ExpoNotificationCategoriesModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit deleteNotificationCategoryAsync$lambda$4;
                deleteNotificationCategoryAsync$lambda$4 = ExpoNotificationCategoriesModule.deleteNotificationCategoryAsync$lambda$4(Promise.this, ((Integer) obj).intValue(), (Bundle) obj2);
                return deleteNotificationCategoryAsync$lambda$4;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteNotificationCategoryAsync$lambda$4(Promise promise, int i, Bundle bundle) {
        if (i == 0) {
            promise.resolve(bundle != null ? Boolean.valueOf(bundle.getBoolean("succeeded")) : null);
        } else {
            promise.reject("ERR_CATEGORY_DELETE_FAILED", "The category could not be deleted.", null);
        }
        return Unit.INSTANCE;
    }

    protected List<Bundle> serializeCategories(Collection<? extends NotificationCategory> categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Collection<? extends NotificationCategory> collection = categories;
        ExpoNotificationsCategoriesSerializer expoNotificationsCategoriesSerializer = this.serializer;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(expoNotificationsCategoriesSerializer.toBundle((NotificationCategory) it.next()));
        }
        return arrayList;
    }
}
