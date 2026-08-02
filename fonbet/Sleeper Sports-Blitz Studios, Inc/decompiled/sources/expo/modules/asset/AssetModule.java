package expo.modules.asset;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.tracing.Trace;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.services.FilePermissionService;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import java.io.File;
import java.net.URI;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: AssetModule.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lexpo/modules/asset/AssetModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getMD5HashOfFilePath", "", "uri", "Ljava/net/URI;", "downloadAsset", "Landroid/net/Uri;", "appContext", "Lexpo/modules/kotlin/AppContext;", "localUrl", "Ljava/io/File;", "(Lexpo/modules/kotlin/AppContext;Ljava/net/URI;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-asset_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AssetModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.AppContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMD5HashOfFilePath(URI uri) {
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        byte[] bytes = uri2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: expo.modules.asset.AssetModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence mD5HashOfFilePath$lambda$0;
                mD5HashOfFilePath$lambda$0 = AssetModule.getMD5HashOfFilePath$lambda$0(((Byte) obj).byteValue());
                return mD5HashOfFilePath$lambda$0;
            }
        }, 30, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getMD5HashOfFilePath$lambda$0(byte b) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadAsset(AppContext appContext, URI uri, File file, Continuation<? super Uri> continuation) {
        AssetModule$downloadAsset$1 assetModule$downloadAsset$1;
        int i;
        if (continuation instanceof AssetModule$downloadAsset$1) {
            assetModule$downloadAsset$1 = (AssetModule$downloadAsset$1) continuation;
            if ((assetModule$downloadAsset$1.label & Integer.MIN_VALUE) != 0) {
                assetModule$downloadAsset$1.label -= Integer.MIN_VALUE;
                Object obj = assetModule$downloadAsset$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = assetModule$downloadAsset$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    File parentFile = file.getParentFile();
                    if (parentFile == null || !parentFile.exists()) {
                        file.mkdirs();
                    }
                    FilePermissionService filePermission = appContext.getFilePermission();
                    Context context = getContext();
                    String parent = file.getParent();
                    if (parent == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    if (!filePermission.getPathPermissions(context, parent).contains(FilePermissionService.Permission.WRITE)) {
                        String uri2 = uri.toString();
                        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                        throw new UnableToDownloadAssetException(uri2);
                    }
                    CoroutineContext coroutineContext = appContext.getBackgroundCoroutineScope().getCoroutineContext();
                    AssetModule$downloadAsset$2 assetModule$downloadAsset$2 = new AssetModule$downloadAsset$2(uri, this, file, null);
                    assetModule$downloadAsset$1.label = 1;
                    obj = BuildersKt.withContext(coroutineContext, assetModule$downloadAsset$2, assetModule$downloadAsset$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        assetModule$downloadAsset$1 = new AssetModule$downloadAsset$1(this, continuation);
        Object obj2 = assetModule$downloadAsset$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = assetModule$downloadAsset$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        AssetModule assetModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (assetModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(assetModule);
            moduleDefinitionBuilder.Name("ExpoAsset");
            AsyncFunctionBuilder AsyncFunction = moduleDefinitionBuilder.AsyncFunction("downloadAsync");
            String name = AsyncFunction.getName();
            TypeConverterProvider converters = AsyncFunction.getConverters();
            AnyType[] anyTypeArr = new AnyType[3];
            AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(URI.class), false));
            if (anyType == null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("java.net.URI", Reflection.getOrCreateKotlinClass(URI.class), false)), new Function0<KType>() { // from class: expo.modules.asset.AssetModule$definition$lambda$2$$inlined$Coroutine$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(URI.class);
                        }
                    }));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + URI.class.getName(), m13473exceptionOrNullimpl);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    m13470constructorimpl = null;
                }
                TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor == null) {
                    typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(URI.class));
                }
                anyType = new AnyType(typeDescriptor, converters);
            }
            anyTypeArr[0] = anyType;
            AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType2 == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.asset.AssetModule$definition$lambda$2$$inlined$Coroutine$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
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
                    typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType2 = new AnyType(typeDescriptor2, converters);
            }
            anyTypeArr[1] = anyType2;
            AnyType anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType3 == null) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.asset.AssetModule$definition$lambda$2$$inlined$Coroutine$3
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
                }
                Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
                if (m13473exceptionOrNullimpl3 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl3);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                    m13470constructorimpl3 = null;
                }
                TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
                if (typeDescriptor3 == null) {
                    typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType3 = new AnyType(typeDescriptor3, converters);
            }
            anyTypeArr[2] = anyType3;
            AsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, anyTypeArr, new AssetModule$definition$lambda$2$$inlined$Coroutine$4(null, this)));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }
}
