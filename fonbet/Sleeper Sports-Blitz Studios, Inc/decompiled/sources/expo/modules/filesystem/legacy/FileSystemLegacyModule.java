package expo.modules.filesystem.legacy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import androidx.documentfile.provider.DocumentFile;
import androidx.tracing.Trace;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.common.util.UriUtil;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.common.net.HttpHeaders;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.filesystem.legacy.FileSystemLegacyModule;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.OnActivityResultPayload;
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
import expo.modules.kotlin.objects.ConstantComponentBuilder;
import expo.modules.kotlin.services.FilePermissionService;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Okio__JvmOkioKt;
import okio.Source;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: FileSystemLegacyModule.kt */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0005XYZ[\\B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0017J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002J\f\u0010\u0017\u001a\u00020\u0015*\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001a\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u0016H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u0016H\u0002J \u0010\"\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u000eH\u0002J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u001dH\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0016H\u0002J\u0012\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u000eH\u0003J \u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u001aH\u0002J(\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J \u00109\u001a\u00020:2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00100\u001a\u00020\u001aH\u0002J\u0018\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020>H\u0082@¢\u0006\u0002\u0010?J\u0010\u0010C\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u001aH\u0002J\u0010\u0010D\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u001aH\u0002J\u0010\u0010E\u001a\u00020F2\u0006\u00100\u001a\u00020\u001aH\u0002J\u0010\u0010G\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0016H\u0002J\u001a\u0010H\u001a\u00020I2\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010J\u001a\u00020.H\u0002J\u0012\u0010K\u001a\u0004\u0018\u00010+2\u0006\u0010 \u001a\u00020\u0016H\u0002J\f\u0010L\u001a\u00020\u001a*\u00020\u0016H\u0002J\u0010\u0010O\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020\u000eH\u0002J\u0010\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020&H\u0002J\u0010\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010@\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0018\u0010M\u001a\u00020.*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006]"}, d2 = {"Lexpo/modules/filesystem/legacy/FileSystemLegacyModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", AnalyticsConstantsKt.KEY_CLIENT, "Lokhttp3/OkHttpClient;", "dirPermissionsRequest", "Lexpo/modules/kotlin/Promise;", "taskHandlers", "", "", "Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$TaskHandler;", "moduleCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "checkIfFileExists", "", "Landroid/net/Uri;", "checkIfFileDirExists", "ensureDirExists", "dir", "Ljava/io/File;", "permissionsForPath", "Ljava/util/EnumSet;", "Lexpo/modules/kotlin/services/FilePermissionService$Permission;", "path", "permissionsForUri", "uri", "permissionsForSAFUri", "ensurePermission", "permission", "errorMsg", "openAssetInputStream", "Ljava/io/InputStream;", "openResourceInputStream", "resourceName", "transformFilesFromSAF", "documentFile", "Landroidx/documentfile/provider/DocumentFile;", "outputDir", "copy", "", "contentUriFromFile", "file", "createUploadRequest", "Lokhttp3/Request;", "url", "fileUriString", "options", "Lexpo/modules/filesystem/legacy/FileSystemUploadOptions;", "decorator", "Lexpo/modules/filesystem/legacy/RequestBodyDecorator;", "createRequestBody", "Lokhttp3/RequestBody;", "downloadResumableTask", "", "params", "Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$DownloadResumableTaskParams;", "(Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$DownloadResumableTaskParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "okHttpClient", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "md5", "forceDelete", "getFileSize", "", "getInputStream", "getOutputStream", "Ljava/io/OutputStream;", AgentOptions.APPEND, "getNearestSAFFile", "toFile", "isSAFUri", "(Landroid/net/Uri;)Z", "parseFileUri", "uriStr", "getInputStreamBytes", "", "inputStream", "translateHeaders", "Landroid/os/Bundle;", "headers", "Lokhttp3/Headers;", "DownloadResumableTaskParams", "TaskHandler", "DownloadTaskHandler", "ProgressResponseBody", "ProgressListener", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public class FileSystemLegacyModule extends Module {
    private OkHttpClient client;
    private Promise dirPermissionsRequest;
    private final Map<String, TaskHandler> taskHandlers = new HashMap();
    private final CoroutineScope moduleCoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());

    /* compiled from: FileSystemLegacyModule.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;", "", "update", "", "bytesRead", "", "contentLength", "done", "", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ProgressListener {
        void update(long bytesRead, long contentLength, boolean done);
    }

    /* compiled from: FileSystemLegacyModule.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FileSystemUploadType.values().length];
            try {
                iArr[FileSystemUploadType.BINARY_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FileSystemUploadType.MULTIPART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.AppContextLost();
    }

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
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent;
        Object m13470constructorimpl11;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent2;
        Object m13470constructorimpl12;
        Object m13470constructorimpl13;
        Object m13470constructorimpl14;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent3;
        Object m13470constructorimpl15;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent4;
        Object m13470constructorimpl16;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent5;
        Object m13470constructorimpl17;
        Object m13470constructorimpl18;
        Object m13470constructorimpl19;
        Object m13470constructorimpl20;
        Object m13470constructorimpl21;
        Object m13470constructorimpl22;
        Object m13470constructorimpl23;
        Object m13470constructorimpl24;
        Object m13470constructorimpl25;
        Object m13470constructorimpl26;
        Object m13470constructorimpl27;
        Object m13470constructorimpl28;
        Object m13470constructorimpl29;
        Object m13470constructorimpl30;
        Object m13470constructorimpl31;
        Object m13470constructorimpl32;
        Object m13470constructorimpl33;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        Object m13470constructorimpl34;
        Object m13470constructorimpl35;
        Object m13470constructorimpl36;
        Object m13470constructorimpl37;
        Object m13470constructorimpl38;
        Object m13470constructorimpl39;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent6;
        FileSystemLegacyModule fileSystemLegacyModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (fileSystemLegacyModule.getClass() + ".ModuleDefinition"));
        try {
            final ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(fileSystemLegacyModule);
            moduleDefinitionBuilder.Name("ExponentFileSystem");
            ConstantComponentBuilder constantComponentBuilder = new ConstantComponentBuilder("documentDirectory");
            constantComponentBuilder.setGetter(new Function0<String>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$Constant$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    Context context;
                    context = FileSystemLegacyModule.this.getContext();
                    return Uri.fromFile(context.getFilesDir()) + "/";
                }
            });
            moduleDefinitionBuilder.getConstants().put("documentDirectory", constantComponentBuilder);
            ConstantComponentBuilder constantComponentBuilder2 = new ConstantComponentBuilder("cacheDirectory");
            constantComponentBuilder2.setGetter(new Function0<String>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$Constant$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    Context context;
                    context = FileSystemLegacyModule.this.getContext();
                    return Uri.fromFile(context.getCacheDir()) + "/";
                }
            });
            moduleDefinitionBuilder.getConstants().put("cacheDirectory", constantComponentBuilder2);
            ConstantComponentBuilder constantComponentBuilder3 = new ConstantComponentBuilder("bundleDirectory");
            constantComponentBuilder3.setGetter(new Function0<String>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$Constant$3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "asset:///";
                }
            });
            moduleDefinitionBuilder.getConstants().put("bundleDirectory", constantComponentBuilder3);
            moduleDefinitionBuilder.Events("expo-file-system.downloadProgress", "expo-file-system.uploadProgress");
            moduleDefinitionBuilder.getEventListeners().put(EventName.MODULE_CREATE, new BasicEventListener(EventName.MODULE_CREATE, new Function0<Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$OnCreate$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Context context;
                    Context context2;
                    try {
                        FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                        context = fileSystemLegacyModule2.getContext();
                        File filesDir = context.getFilesDir();
                        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
                        fileSystemLegacyModule2.ensureDirExists(filesDir);
                        FileSystemLegacyModule fileSystemLegacyModule3 = FileSystemLegacyModule.this;
                        context2 = fileSystemLegacyModule3.getContext();
                        File cacheDir = context2.getCacheDir();
                        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
                        fileSystemLegacyModule3.ensureDirExists(cacheDir);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
            AnyType[] anyTypeArr = new AnyType[2];
            AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType == null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    m13470constructorimpl = null;
                }
                TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor == null) {
                    typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType = new AnyType(typeDescriptor, converters);
            }
            anyTypeArr[0] = anyType;
            AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(InfoOptionsLegacy.class), false));
            if (anyType2 == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.filesystem.legacy.InfoOptionsLegacy", Reflection.getOrCreateKotlinClass(InfoOptionsLegacy.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(InfoOptionsLegacy.class);
                        }
                    }));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                if (m13473exceptionOrNullimpl2 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + InfoOptionsLegacy.class.getName(), m13473exceptionOrNullimpl2);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                    m13470constructorimpl2 = null;
                }
                TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
                if (typeDescriptor2 == null) {
                    typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(InfoOptionsLegacy.class));
                }
                anyType2 = new AnyType(typeDescriptor2, converters);
            }
            anyTypeArr[1] = anyType2;
            Function1<Object[], Bundle> function1 = new Function1<Object[], Bundle>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$3
                /* JADX WARN: Removed duplicated region for block: B:37:0x0140 A[Catch: FileNotFoundException -> 0x0181, TryCatch #0 {FileNotFoundException -> 0x0181, blocks: (B:26:0x00fd, B:28:0x0103, B:33:0x0112, B:35:0x0118, B:37:0x0140, B:39:0x0165, B:41:0x017b, B:42:0x0180, B:43:0x0127, B:46:0x012e, B:47:0x0138), top: B:25:0x00fd }] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x017b A[Catch: FileNotFoundException -> 0x0181, TryCatch #0 {FileNotFoundException -> 0x0181, blocks: (B:26:0x00fd, B:28:0x0103, B:33:0x0112, B:35:0x0118, B:37:0x0140, B:39:0x0165, B:41:0x017b, B:42:0x0180, B:43:0x0127, B:46:0x012e, B:47:0x0138), top: B:25:0x00fd }] */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Bundle invoke(Object[] objArr) {
                    Uri uri;
                    InputStream openResourceInputStream;
                    Context context;
                    File file;
                    long fileSize;
                    String md5;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    InfoOptionsLegacy infoOptionsLegacy = (InfoOptionsLegacy) objArr[1];
                    String slashifyFilePath = FileSystemLegacyModuleKt.slashifyFilePath((String) obj);
                    Uri parse = Uri.parse(slashifyFilePath);
                    if (Intrinsics.areEqual(parse.getScheme(), "file")) {
                        FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(slashifyFilePath, "null cannot be cast to non-null type kotlin.String");
                        slashifyFilePath = fileSystemLegacyModule2.parseFileUri(slashifyFilePath);
                        uri = Uri.parse(slashifyFilePath);
                    } else {
                        uri = parse;
                    }
                    FileSystemLegacyModule fileSystemLegacyModule3 = FileSystemLegacyModule.this;
                    Intrinsics.checkNotNull(uri);
                    fileSystemLegacyModule3.ensurePermission(uri, FilePermissionService.Permission.READ);
                    if (Intrinsics.areEqual(parse.getScheme(), "file")) {
                        FileSystemLegacyModule fileSystemLegacyModule4 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(uri);
                        file = fileSystemLegacyModule4.toFile(uri);
                        if (!file.exists()) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("exists", false);
                            bundle.putBoolean("isDirectory", false);
                            return bundle;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("exists", true);
                        bundle2.putBoolean("isDirectory", file.isDirectory());
                        bundle2.putString("uri", Uri.fromFile(file).toString());
                        fileSize = FileSystemLegacyModule.this.getFileSize(file);
                        bundle2.putDouble(RRWebVideoEvent.JsonKeys.SIZE, fileSize);
                        bundle2.putDouble("modificationTime", file.lastModified() * 0.001d);
                        Boolean md52 = infoOptionsLegacy.getMd5();
                        if (!Intrinsics.areEqual((Object) md52, (Object) true)) {
                            md52 = null;
                        }
                        if (md52 != null) {
                            md52.booleanValue();
                            md5 = FileSystemLegacyModule.this.md5(file);
                            bundle2.putString("md5", md5);
                        }
                        return bundle2;
                    }
                    if (!Intrinsics.areEqual(parse.getScheme(), "content") && !Intrinsics.areEqual(parse.getScheme(), UriUtil.LOCAL_ASSET_SCHEME) && parse.getScheme() != null) {
                        throw new IOException("Unsupported scheme for location '" + parse + "'.");
                    }
                    try {
                        String scheme = parse.getScheme();
                        if (scheme != null) {
                            int hashCode = scheme.hashCode();
                            if (hashCode != 93121264) {
                                if (hashCode == 951530617 && scheme.equals("content")) {
                                    context = FileSystemLegacyModule.this.getContext();
                                    openResourceInputStream = context.getContentResolver().openInputStream(parse);
                                }
                            } else if (scheme.equals(UriUtil.LOCAL_ASSET_SCHEME)) {
                                FileSystemLegacyModule fileSystemLegacyModule5 = FileSystemLegacyModule.this;
                                Intrinsics.checkNotNull(parse);
                                openResourceInputStream = fileSystemLegacyModule5.openAssetInputStream(parse);
                            }
                            if (openResourceInputStream != null) {
                                throw new FileNotFoundException();
                            }
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("exists", true);
                            bundle3.putBoolean("isDirectory", false);
                            bundle3.putString("uri", parse.toString());
                            bundle3.putDouble(RRWebVideoEvent.JsonKeys.SIZE, openResourceInputStream.available());
                            if (Intrinsics.areEqual((Object) infoOptionsLegacy.getMd5(), (Object) true)) {
                                char[] encodeHex = Hex.encodeHex(DigestUtils.md5(openResourceInputStream));
                                Intrinsics.checkNotNullExpressionValue(encodeHex, "encodeHex(...)");
                                bundle3.putString("md5", new String(encodeHex));
                            }
                            return bundle3;
                        }
                        openResourceInputStream = FileSystemLegacyModule.this.openResourceInputStream(slashifyFilePath);
                        if (openResourceInputStream != null) {
                        }
                    } catch (FileNotFoundException unused) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putBoolean("exists", false);
                        bundle4.putBoolean("isDirectory", false);
                        return bundle4;
                    }
                }
            };
            moduleDefinitionBuilder2.getAsyncFunctions().put("getInfoAsync", Intrinsics.areEqual(Bundle.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getInfoAsync", anyTypeArr, function1) : Intrinsics.areEqual(Bundle.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getInfoAsync", anyTypeArr, function1) : Intrinsics.areEqual(Bundle.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getInfoAsync", anyTypeArr, function1) : Intrinsics.areEqual(Bundle.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getInfoAsync", anyTypeArr, function1) : Intrinsics.areEqual(Bundle.class, String.class) ? new StringAsyncFunctionComponent("getInfoAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getInfoAsync", anyTypeArr, function1));
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            TypeConverterProvider converters2 = moduleDefinitionBuilder3.getConverters();
            AnyType[] anyTypeArr2 = new AnyType[2];
            AnyType anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType3 == null) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$4
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
                anyType3 = new AnyType(typeDescriptor3, converters2);
            }
            anyTypeArr2[0] = anyType3;
            AnyType anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ReadingOptions.class), false));
            if (anyType4 == null) {
                try {
                    Result.Companion companion7 = Result.INSTANCE;
                    m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.filesystem.legacy.ReadingOptions", Reflection.getOrCreateKotlinClass(ReadingOptions.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$5
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ReadingOptions.class);
                        }
                    }));
                } catch (Throwable th4) {
                    Result.Companion companion8 = Result.INSTANCE;
                    m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
                }
                Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
                if (m13473exceptionOrNullimpl4 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ReadingOptions.class.getName(), m13473exceptionOrNullimpl4);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                    m13470constructorimpl4 = null;
                }
                TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
                if (typeDescriptor4 == null) {
                    typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(ReadingOptions.class));
                }
                anyType4 = new AnyType(typeDescriptor4, converters2);
            }
            anyTypeArr2[1] = anyType4;
            moduleDefinitionBuilder3.getAsyncFunctions().put("readAsStringAsync", new UntypedAsyncFunctionComponent("readAsStringAsync", anyTypeArr2, new Function1<Object[], String>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$6
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(Object[] objArr) {
                    boolean isSAFUri;
                    Context context;
                    InputStream openResourceInputStream;
                    InputStream openAssetInputStream;
                    File file;
                    InputStream inputStream;
                    byte[] inputStreamBytes;
                    String encodeToString;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    ReadingOptions readingOptions = (ReadingOptions) objArr[1];
                    String str = (String) obj;
                    Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath(str));
                    FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                    Intrinsics.checkNotNull(parse);
                    fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.READ);
                    if (readingOptions.getEncoding() == EncodingType.BASE64) {
                        inputStream = FileSystemLegacyModule.this.getInputStream(parse);
                        InputStream inputStream2 = inputStream;
                        try {
                            InputStream inputStream3 = inputStream2;
                            if (readingOptions.getLength() == null || readingOptions.getPosition() == null) {
                                inputStreamBytes = FileSystemLegacyModule.this.getInputStreamBytes(inputStream3);
                                encodeToString = Base64.encodeToString(inputStreamBytes, 2);
                            } else {
                                byte[] bArr = new byte[readingOptions.getLength().intValue()];
                                inputStream3.skip(readingOptions.getPosition().intValue());
                                encodeToString = Base64.encodeToString(bArr, 0, inputStream3.read(bArr, 0, readingOptions.getLength().intValue()), 2);
                            }
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(inputStream2, null);
                            return encodeToString;
                        } finally {
                        }
                    } else {
                        if (Intrinsics.areEqual(parse.getScheme(), "file")) {
                            file = FileSystemLegacyModule.this.toFile(parse);
                            return IOUtils.toString(new FileInputStream(file));
                        }
                        if (Intrinsics.areEqual(parse.getScheme(), UriUtil.LOCAL_ASSET_SCHEME)) {
                            openAssetInputStream = FileSystemLegacyModule.this.openAssetInputStream(parse);
                            return IOUtils.toString(openAssetInputStream);
                        }
                        if (parse.getScheme() == null) {
                            openResourceInputStream = FileSystemLegacyModule.this.openResourceInputStream(str);
                            return IOUtils.toString(openResourceInputStream);
                        }
                        isSAFUri = FileSystemLegacyModule.this.isSAFUri(parse);
                        if (isSAFUri) {
                            context = FileSystemLegacyModule.this.getContext();
                            return IOUtils.toString(context.getContentResolver().openInputStream(parse));
                        }
                        throw new IOException("Unsupported scheme for location '" + parse + "'.");
                    }
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder;
            TypeConverterProvider converters3 = moduleDefinitionBuilder4.getConverters();
            AnyType[] anyTypeArr3 = new AnyType[3];
            AnyType anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType5 == null) {
                try {
                    Result.Companion companion9 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$7
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
                anyType5 = new AnyType(typeDescriptor5, converters3);
            }
            anyTypeArr3[0] = anyType5;
            AnyType anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType6 == null) {
                try {
                    Result.Companion companion11 = Result.INSTANCE;
                    m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$8
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th6) {
                    Result.Companion companion12 = Result.INSTANCE;
                    m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
                }
                Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
                if (m13473exceptionOrNullimpl6 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl6);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                    m13470constructorimpl6 = null;
                }
                TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl6;
                if (typeDescriptor6 == null) {
                    typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType6 = new AnyType(typeDescriptor6, converters3);
            }
            anyTypeArr3[1] = anyType6;
            AnyType anyType7 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(WritingOptions.class), false));
            if (anyType7 == null) {
                try {
                    Result.Companion companion13 = Result.INSTANCE;
                    m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.filesystem.legacy.WritingOptions", Reflection.getOrCreateKotlinClass(WritingOptions.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$9
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(WritingOptions.class);
                        }
                    }));
                } catch (Throwable th7) {
                    Result.Companion companion14 = Result.INSTANCE;
                    m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th7));
                }
                Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
                if (m13473exceptionOrNullimpl7 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + WritingOptions.class.getName(), m13473exceptionOrNullimpl7);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl7)) {
                    m13470constructorimpl7 = null;
                }
                TypeDescriptor typeDescriptor7 = (TypeDescriptor) m13470constructorimpl7;
                if (typeDescriptor7 == null) {
                    typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(WritingOptions.class));
                }
                anyType7 = new AnyType(typeDescriptor7, converters3);
            }
            anyTypeArr3[2] = anyType7;
            Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$10
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] objArr) {
                    OutputStream outputStream;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    WritingOptions writingOptions = (WritingOptions) objArr[2];
                    String str = (String) obj2;
                    Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath((String) obj));
                    FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                    Intrinsics.checkNotNull(parse);
                    fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.WRITE);
                    EncodingType encoding = writingOptions.getEncoding();
                    outputStream = FileSystemLegacyModule.this.getOutputStream(parse, writingOptions.getAppend());
                    OutputStreamWriter outputStreamWriter = outputStream;
                    try {
                        OutputStream outputStream2 = outputStreamWriter;
                        if (encoding == EncodingType.BASE64) {
                            outputStream2.write(Base64.decode(str, 0));
                        } else {
                            outputStreamWriter = new OutputStreamWriter(outputStream2);
                            try {
                                outputStreamWriter.write(str);
                                Unit unit = Unit.INSTANCE;
                                CloseableKt.closeFinally(outputStreamWriter, null);
                            } finally {
                            }
                        }
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(outputStreamWriter, null);
                        return Unit.INSTANCE;
                    } finally {
                    }
                }
            };
            moduleDefinitionBuilder4.getAsyncFunctions().put("writeAsStringAsync", Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("writeAsStringAsync", anyTypeArr3, function12) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("writeAsStringAsync", anyTypeArr3, function12) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("writeAsStringAsync", anyTypeArr3, function12) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("writeAsStringAsync", anyTypeArr3, function12) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("writeAsStringAsync", anyTypeArr3, function12) : new UntypedAsyncFunctionComponent("writeAsStringAsync", anyTypeArr3, function12));
            ModuleDefinitionBuilder moduleDefinitionBuilder5 = moduleDefinitionBuilder;
            TypeConverterProvider converters4 = moduleDefinitionBuilder5.getConverters();
            AnyType[] anyTypeArr4 = new AnyType[2];
            AnyType anyType8 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType8 == null) {
                try {
                    Result.Companion companion15 = Result.INSTANCE;
                    m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$11
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th8) {
                    Result.Companion companion16 = Result.INSTANCE;
                    m13470constructorimpl8 = Result.m13470constructorimpl(ResultKt.createFailure(th8));
                }
                Throwable m13473exceptionOrNullimpl8 = Result.m13473exceptionOrNullimpl(m13470constructorimpl8);
                if (m13473exceptionOrNullimpl8 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl8);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl8)) {
                    m13470constructorimpl8 = null;
                }
                TypeDescriptor typeDescriptor8 = (TypeDescriptor) m13470constructorimpl8;
                if (typeDescriptor8 == null) {
                    typeDescriptor8 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType8 = new AnyType(typeDescriptor8, converters4);
            }
            anyTypeArr4[0] = anyType8;
            AnyType anyType9 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DeletingOptions.class), false));
            if (anyType9 == null) {
                try {
                    Result.Companion companion17 = Result.INSTANCE;
                    m13470constructorimpl9 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.filesystem.legacy.DeletingOptions", Reflection.getOrCreateKotlinClass(DeletingOptions.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$12
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(DeletingOptions.class);
                        }
                    }));
                } catch (Throwable th9) {
                    Result.Companion companion18 = Result.INSTANCE;
                    m13470constructorimpl9 = Result.m13470constructorimpl(ResultKt.createFailure(th9));
                }
                Throwable m13473exceptionOrNullimpl9 = Result.m13473exceptionOrNullimpl(m13470constructorimpl9);
                if (m13473exceptionOrNullimpl9 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + DeletingOptions.class.getName(), m13473exceptionOrNullimpl9);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl9)) {
                    m13470constructorimpl9 = null;
                }
                TypeDescriptor typeDescriptor9 = (TypeDescriptor) m13470constructorimpl9;
                if (typeDescriptor9 == null) {
                    typeDescriptor9 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(DeletingOptions.class));
                }
                anyType9 = new AnyType(typeDescriptor9, converters4);
            }
            anyTypeArr4[1] = anyType9;
            Function1<Object[], Unit> function13 = new Function1<Object[], Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$13
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] objArr) {
                    boolean isSAFUri;
                    DocumentFile nearestSAFFile;
                    File file;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    DeletingOptions deletingOptions = (DeletingOptions) objArr[1];
                    Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath((String) obj));
                    Uri withAppendedPath = Uri.withAppendedPath(parse, "..");
                    FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                    Intrinsics.checkNotNull(withAppendedPath);
                    fileSystemLegacyModule2.ensurePermission(withAppendedPath, FilePermissionService.Permission.WRITE, "Location '" + parse + "' isn't deletable.");
                    if (Intrinsics.areEqual(parse.getScheme(), "file")) {
                        FileSystemLegacyModule fileSystemLegacyModule3 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse);
                        file = fileSystemLegacyModule3.toFile(parse);
                        if (file.exists()) {
                            if (Build.VERSION.SDK_INT < 26) {
                                FileSystemLegacyModule.this.forceDelete(file);
                            } else {
                                FileUtils.forceDelete(file);
                            }
                        } else if (!deletingOptions.getIdempotent()) {
                            throw new FileSystemFileNotFoundException(parse);
                        }
                    } else {
                        FileSystemLegacyModule fileSystemLegacyModule4 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse);
                        isSAFUri = fileSystemLegacyModule4.isSAFUri(parse);
                        if (isSAFUri) {
                            nearestSAFFile = FileSystemLegacyModule.this.getNearestSAFFile(parse);
                            if (nearestSAFFile != null && nearestSAFFile.exists()) {
                                nearestSAFFile.delete();
                            } else if (!deletingOptions.getIdempotent()) {
                                throw new FileSystemFileNotFoundException(parse);
                            }
                        } else {
                            throw new IOException("Unsupported scheme for location '" + parse + "'.");
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            moduleDefinitionBuilder5.getAsyncFunctions().put("deleteAsync", Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("deleteAsync", anyTypeArr4, function13) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("deleteAsync", anyTypeArr4, function13) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("deleteAsync", anyTypeArr4, function13) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("deleteAsync", anyTypeArr4, function13) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("deleteAsync", anyTypeArr4, function13) : new UntypedAsyncFunctionComponent("deleteAsync", anyTypeArr4, function13));
            ModuleDefinitionBuilder moduleDefinitionBuilder6 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(RelocatingOptions.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("moveAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$14
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        boolean isSAFUri;
                        DocumentFile nearestSAFFile;
                        File file;
                        File file2;
                        File file3;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        RelocatingOptions relocatingOptions = (RelocatingOptions) promise;
                        Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath(relocatingOptions.getFrom()));
                        FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                        Uri withAppendedPath = Uri.withAppendedPath(parse, "..");
                        Intrinsics.checkNotNullExpressionValue(withAppendedPath, "withAppendedPath(...)");
                        fileSystemLegacyModule2.ensurePermission(withAppendedPath, FilePermissionService.Permission.WRITE, "Location '" + parse + "' isn't movable.");
                        Uri parse2 = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath(relocatingOptions.getTo()));
                        FileSystemLegacyModule fileSystemLegacyModule3 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse2);
                        fileSystemLegacyModule3.ensurePermission(parse2, FilePermissionService.Permission.WRITE);
                        if (Intrinsics.areEqual(parse.getScheme(), "file")) {
                            FileSystemLegacyModule fileSystemLegacyModule4 = FileSystemLegacyModule.this;
                            Intrinsics.checkNotNull(parse);
                            file2 = fileSystemLegacyModule4.toFile(parse);
                            file3 = FileSystemLegacyModule.this.toFile(parse2);
                            if (!file2.renameTo(file3)) {
                                throw new FileSystemCannotMoveFileException(parse, parse2);
                            }
                            return;
                        }
                        FileSystemLegacyModule fileSystemLegacyModule5 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse);
                        isSAFUri = fileSystemLegacyModule5.isSAFUri(parse);
                        if (isSAFUri) {
                            nearestSAFFile = FileSystemLegacyModule.this.getNearestSAFFile(parse);
                            if (nearestSAFFile != null && nearestSAFFile.exists()) {
                                file = FileSystemLegacyModule.this.toFile(parse2);
                                FileSystemLegacyModule.this.transformFilesFromSAF(nearestSAFFile, file, false);
                                return;
                            }
                            throw new FileSystemCannotMoveFileException(parse, parse2);
                        }
                        throw new IOException("Unsupported scheme for location '" + parse + "'.");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters5 = moduleDefinitionBuilder6.getConverters();
                AnyType[] anyTypeArr5 = new AnyType[1];
                AnyType anyType10 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelocatingOptions.class), false));
                if (anyType10 == null) {
                    try {
                        Result.Companion companion19 = Result.INSTANCE;
                        m13470constructorimpl10 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.filesystem.legacy.RelocatingOptions", Reflection.getOrCreateKotlinClass(RelocatingOptions.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$15
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(RelocatingOptions.class);
                            }
                        }));
                    } catch (Throwable th10) {
                        Result.Companion companion20 = Result.INSTANCE;
                        m13470constructorimpl10 = Result.m13470constructorimpl(ResultKt.createFailure(th10));
                    }
                    Throwable m13473exceptionOrNullimpl10 = Result.m13473exceptionOrNullimpl(m13470constructorimpl10);
                    if (m13473exceptionOrNullimpl10 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + RelocatingOptions.class.getName(), m13473exceptionOrNullimpl10);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl10)) {
                        m13470constructorimpl10 = null;
                    }
                    TypeDescriptor typeDescriptor10 = (TypeDescriptor) m13470constructorimpl10;
                    if (typeDescriptor10 == null) {
                        typeDescriptor10 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(RelocatingOptions.class));
                    }
                    anyType10 = new AnyType(typeDescriptor10, converters5);
                }
                anyTypeArr5[0] = anyType10;
                Function1<Object[], Unit> function14 = new Function1<Object[], Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$16
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        boolean isSAFUri;
                        DocumentFile nearestSAFFile;
                        File file;
                        File file2;
                        File file3;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        RelocatingOptions relocatingOptions = (RelocatingOptions) objArr[0];
                        Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath(relocatingOptions.getFrom()));
                        FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                        Uri withAppendedPath = Uri.withAppendedPath(parse, "..");
                        Intrinsics.checkNotNullExpressionValue(withAppendedPath, "withAppendedPath(...)");
                        fileSystemLegacyModule2.ensurePermission(withAppendedPath, FilePermissionService.Permission.WRITE, "Location '" + parse + "' isn't movable.");
                        Uri parse2 = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath(relocatingOptions.getTo()));
                        FileSystemLegacyModule fileSystemLegacyModule3 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse2);
                        fileSystemLegacyModule3.ensurePermission(parse2, FilePermissionService.Permission.WRITE);
                        if (Intrinsics.areEqual(parse.getScheme(), "file")) {
                            FileSystemLegacyModule fileSystemLegacyModule4 = FileSystemLegacyModule.this;
                            Intrinsics.checkNotNull(parse);
                            file2 = fileSystemLegacyModule4.toFile(parse);
                            file3 = FileSystemLegacyModule.this.toFile(parse2);
                            if (!file2.renameTo(file3)) {
                                throw new FileSystemCannotMoveFileException(parse, parse2);
                            }
                        } else {
                            FileSystemLegacyModule fileSystemLegacyModule5 = FileSystemLegacyModule.this;
                            Intrinsics.checkNotNull(parse);
                            isSAFUri = fileSystemLegacyModule5.isSAFUri(parse);
                            if (isSAFUri) {
                                nearestSAFFile = FileSystemLegacyModule.this.getNearestSAFFile(parse);
                                if (nearestSAFFile != null && nearestSAFFile.exists()) {
                                    file = FileSystemLegacyModule.this.toFile(parse2);
                                    FileSystemLegacyModule.this.transformFilesFromSAF(nearestSAFFile, file, false);
                                } else {
                                    throw new FileSystemCannotMoveFileException(parse, parse2);
                                }
                            } else {
                                throw new IOException("Unsupported scheme for location '" + parse + "'.");
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("moveAsync", anyTypeArr5, function14) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("moveAsync", anyTypeArr5, function14) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("moveAsync", anyTypeArr5, function14) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("moveAsync", anyTypeArr5, function14) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("moveAsync", anyTypeArr5, function14) : new UntypedAsyncFunctionComponent("moveAsync", anyTypeArr5, function14);
            }
            moduleDefinitionBuilder6.getAsyncFunctions().put("moveAsync", intAsyncFunctionComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder7 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(RelocatingOptions.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("copyAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$17
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        boolean isSAFUri;
                        InputStream openResourceInputStream;
                        File file;
                        InputStream openAssetInputStream;
                        File file2;
                        Context context;
                        File file3;
                        DocumentFile nearestSAFFile;
                        File file4;
                        File file5;
                        File file6;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        RelocatingOptions relocatingOptions = (RelocatingOptions) promise;
                        Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath(relocatingOptions.getFrom()));
                        FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse);
                        fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.READ, "Location '" + parse + "' isn't readable.");
                        Uri parse2 = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath(relocatingOptions.getTo()));
                        FileSystemLegacyModule fileSystemLegacyModule3 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse2);
                        fileSystemLegacyModule3.ensurePermission(parse2, FilePermissionService.Permission.WRITE);
                        if (Intrinsics.areEqual(parse.getScheme(), "file")) {
                            file5 = FileSystemLegacyModule.this.toFile(parse);
                            file6 = FileSystemLegacyModule.this.toFile(parse2);
                            if (file5.isDirectory()) {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    FileUtils.copyDirectory(file5, file6);
                                    return;
                                } else {
                                    FilesKt.copyRecursively$default(file5, file6, true, null, 4, null);
                                    return;
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                FileUtils.copyFile(file5, file6);
                                return;
                            } else {
                                FilesKt.copyTo$default(file5, file6, true, 0, 4, null);
                                return;
                            }
                        }
                        isSAFUri = FileSystemLegacyModule.this.isSAFUri(parse);
                        if (isSAFUri) {
                            nearestSAFFile = FileSystemLegacyModule.this.getNearestSAFFile(parse);
                            if (nearestSAFFile != null && nearestSAFFile.exists()) {
                                file4 = FileSystemLegacyModule.this.toFile(parse2);
                                FileSystemLegacyModule.this.transformFilesFromSAF(nearestSAFFile, file4, true);
                                return;
                            }
                            throw new FileSystemCopyFailedException(parse);
                        }
                        if (Intrinsics.areEqual(parse.getScheme(), "content")) {
                            context = FileSystemLegacyModule.this.getContext();
                            InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                            file3 = FileSystemLegacyModule.this.toFile(parse2);
                            IOUtils.copy(openInputStream, new FileOutputStream(file3));
                            return;
                        }
                        if (Intrinsics.areEqual(parse.getScheme(), UriUtil.LOCAL_ASSET_SCHEME)) {
                            openAssetInputStream = FileSystemLegacyModule.this.openAssetInputStream(parse);
                            file2 = FileSystemLegacyModule.this.toFile(parse2);
                            IOUtils.copy(openAssetInputStream, new FileOutputStream(file2));
                        } else if (parse.getScheme() == null) {
                            openResourceInputStream = FileSystemLegacyModule.this.openResourceInputStream(relocatingOptions.getFrom());
                            file = FileSystemLegacyModule.this.toFile(parse2);
                            IOUtils.copy(openResourceInputStream, new FileOutputStream(file));
                        } else {
                            throw new IOException("Unsupported scheme for location '" + parse + "'.");
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters6 = moduleDefinitionBuilder7.getConverters();
                AnyType[] anyTypeArr6 = new AnyType[1];
                AnyType anyType11 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(RelocatingOptions.class), false));
                if (anyType11 == null) {
                    try {
                        Result.Companion companion21 = Result.INSTANCE;
                        m13470constructorimpl11 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.filesystem.legacy.RelocatingOptions", Reflection.getOrCreateKotlinClass(RelocatingOptions.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$18
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(RelocatingOptions.class);
                            }
                        }));
                    } catch (Throwable th11) {
                        Result.Companion companion22 = Result.INSTANCE;
                        m13470constructorimpl11 = Result.m13470constructorimpl(ResultKt.createFailure(th11));
                    }
                    Throwable m13473exceptionOrNullimpl11 = Result.m13473exceptionOrNullimpl(m13470constructorimpl11);
                    if (m13473exceptionOrNullimpl11 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + RelocatingOptions.class.getName(), m13473exceptionOrNullimpl11);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl11)) {
                        m13470constructorimpl11 = null;
                    }
                    TypeDescriptor typeDescriptor11 = (TypeDescriptor) m13470constructorimpl11;
                    if (typeDescriptor11 == null) {
                        typeDescriptor11 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(RelocatingOptions.class));
                    }
                    anyType11 = new AnyType(typeDescriptor11, converters6);
                }
                anyTypeArr6[0] = anyType11;
                Function1<Object[], Object> function15 = new Function1<Object[], Object>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$19
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object[] objArr) {
                        boolean isSAFUri;
                        InputStream openResourceInputStream;
                        File file;
                        InputStream openAssetInputStream;
                        File file2;
                        Context context;
                        File file3;
                        DocumentFile nearestSAFFile;
                        File file4;
                        File file5;
                        File file6;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        RelocatingOptions relocatingOptions = (RelocatingOptions) objArr[0];
                        Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath(relocatingOptions.getFrom()));
                        FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse);
                        fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.READ, "Location '" + parse + "' isn't readable.");
                        Uri parse2 = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath(relocatingOptions.getTo()));
                        FileSystemLegacyModule fileSystemLegacyModule3 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse2);
                        fileSystemLegacyModule3.ensurePermission(parse2, FilePermissionService.Permission.WRITE);
                        if (Intrinsics.areEqual(parse.getScheme(), "file")) {
                            file5 = FileSystemLegacyModule.this.toFile(parse);
                            file6 = FileSystemLegacyModule.this.toFile(parse2);
                            if (file5.isDirectory()) {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    FileUtils.copyDirectory(file5, file6);
                                    return Unit.INSTANCE;
                                }
                                return Boolean.valueOf(FilesKt.copyRecursively$default(file5, file6, true, null, 4, null));
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                FileUtils.copyFile(file5, file6);
                                return Unit.INSTANCE;
                            }
                            return FilesKt.copyTo$default(file5, file6, true, 0, 4, null);
                        }
                        isSAFUri = FileSystemLegacyModule.this.isSAFUri(parse);
                        if (isSAFUri) {
                            nearestSAFFile = FileSystemLegacyModule.this.getNearestSAFFile(parse);
                            if (nearestSAFFile != null && nearestSAFFile.exists()) {
                                file4 = FileSystemLegacyModule.this.toFile(parse2);
                                FileSystemLegacyModule.this.transformFilesFromSAF(nearestSAFFile, file4, true);
                                return Unit.INSTANCE;
                            }
                            throw new FileSystemCopyFailedException(parse);
                        }
                        if (Intrinsics.areEqual(parse.getScheme(), "content")) {
                            context = FileSystemLegacyModule.this.getContext();
                            InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                            file3 = FileSystemLegacyModule.this.toFile(parse2);
                            return Integer.valueOf(IOUtils.copy(openInputStream, new FileOutputStream(file3)));
                        }
                        if (Intrinsics.areEqual(parse.getScheme(), UriUtil.LOCAL_ASSET_SCHEME)) {
                            openAssetInputStream = FileSystemLegacyModule.this.openAssetInputStream(parse);
                            file2 = FileSystemLegacyModule.this.toFile(parse2);
                            return Integer.valueOf(IOUtils.copy(openAssetInputStream, new FileOutputStream(file2)));
                        }
                        if (parse.getScheme() == null) {
                            openResourceInputStream = FileSystemLegacyModule.this.openResourceInputStream(relocatingOptions.getFrom());
                            file = FileSystemLegacyModule.this.toFile(parse2);
                            return Integer.valueOf(IOUtils.copy(openResourceInputStream, new FileOutputStream(file)));
                        }
                        throw new IOException("Unsupported scheme for location '" + parse + "'.");
                    }
                };
                intAsyncFunctionComponent2 = Intrinsics.areEqual(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent("copyAsync", anyTypeArr6, function15) : Intrinsics.areEqual(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("copyAsync", anyTypeArr6, function15) : Intrinsics.areEqual(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("copyAsync", anyTypeArr6, function15) : Intrinsics.areEqual(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent("copyAsync", anyTypeArr6, function15) : Intrinsics.areEqual(Object.class, String.class) ? new StringAsyncFunctionComponent("copyAsync", anyTypeArr6, function15) : new UntypedAsyncFunctionComponent("copyAsync", anyTypeArr6, function15);
            }
            moduleDefinitionBuilder7.getAsyncFunctions().put("copyAsync", intAsyncFunctionComponent2);
            ModuleDefinitionBuilder moduleDefinitionBuilder8 = moduleDefinitionBuilder;
            TypeConverterProvider converters7 = moduleDefinitionBuilder8.getConverters();
            AnyType[] anyTypeArr7 = new AnyType[2];
            AnyType anyType12 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType12 == null) {
                try {
                    Result.Companion companion23 = Result.INSTANCE;
                    m13470constructorimpl12 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$20
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th12) {
                    Result.Companion companion24 = Result.INSTANCE;
                    m13470constructorimpl12 = Result.m13470constructorimpl(ResultKt.createFailure(th12));
                }
                Throwable m13473exceptionOrNullimpl12 = Result.m13473exceptionOrNullimpl(m13470constructorimpl12);
                if (m13473exceptionOrNullimpl12 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl12);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl12)) {
                    m13470constructorimpl12 = null;
                }
                TypeDescriptor typeDescriptor12 = (TypeDescriptor) m13470constructorimpl12;
                if (typeDescriptor12 == null) {
                    typeDescriptor12 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType12 = new AnyType(typeDescriptor12, converters7);
            }
            anyTypeArr7[0] = anyType12;
            AnyType anyType13 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(MakeDirectoryOptions.class), false));
            if (anyType13 == null) {
                try {
                    Result.Companion companion25 = Result.INSTANCE;
                    m13470constructorimpl13 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.filesystem.legacy.MakeDirectoryOptions", Reflection.getOrCreateKotlinClass(MakeDirectoryOptions.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$21
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(MakeDirectoryOptions.class);
                        }
                    }));
                } catch (Throwable th13) {
                    Result.Companion companion26 = Result.INSTANCE;
                    m13470constructorimpl13 = Result.m13470constructorimpl(ResultKt.createFailure(th13));
                }
                Throwable m13473exceptionOrNullimpl13 = Result.m13473exceptionOrNullimpl(m13470constructorimpl13);
                if (m13473exceptionOrNullimpl13 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + MakeDirectoryOptions.class.getName(), m13473exceptionOrNullimpl13);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl13)) {
                    m13470constructorimpl13 = null;
                }
                TypeDescriptor typeDescriptor13 = (TypeDescriptor) m13470constructorimpl13;
                if (typeDescriptor13 == null) {
                    typeDescriptor13 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(MakeDirectoryOptions.class));
                }
                anyType13 = new AnyType(typeDescriptor13, converters7);
            }
            anyTypeArr7[1] = anyType13;
            Function1<Object[], Unit> function16 = new Function1<Object[], Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$22
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] objArr) {
                    File file;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    MakeDirectoryOptions makeDirectoryOptions = (MakeDirectoryOptions) objArr[1];
                    Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath((String) obj));
                    FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                    Intrinsics.checkNotNull(parse);
                    fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.WRITE);
                    if (!Intrinsics.areEqual(parse.getScheme(), "file")) {
                        throw new IOException("Unsupported scheme for location '" + parse + "'.");
                    }
                    file = FileSystemLegacyModule.this.toFile(parse);
                    boolean isDirectory = file.isDirectory();
                    boolean intermediates = makeDirectoryOptions.getIntermediates();
                    if (!(intermediates ? file.mkdirs() : file.mkdir()) && (!intermediates || !isDirectory)) {
                        throw new FileSystemCannotCreateDirectoryException(parse);
                    }
                    return Unit.INSTANCE;
                }
            };
            moduleDefinitionBuilder8.getAsyncFunctions().put("makeDirectoryAsync", Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("makeDirectoryAsync", anyTypeArr7, function16) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("makeDirectoryAsync", anyTypeArr7, function16) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("makeDirectoryAsync", anyTypeArr7, function16) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("makeDirectoryAsync", anyTypeArr7, function16) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("makeDirectoryAsync", anyTypeArr7, function16) : new UntypedAsyncFunctionComponent("makeDirectoryAsync", anyTypeArr7, function16));
            ModuleDefinitionBuilder moduleDefinitionBuilder9 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                intAsyncFunctionComponent3 = new AsyncFunctionWithPromiseComponent("readDirectoryAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$23
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        boolean isSAFUri;
                        File file;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath((String) promise));
                        FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse);
                        fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.READ);
                        if (Intrinsics.areEqual(parse.getScheme(), "file")) {
                            file = FileSystemLegacyModule.this.toFile(parse);
                            File[] listFiles = file.listFiles();
                            if (listFiles == null) {
                                throw new FileSystemCannotReadDirectoryException(parse);
                            }
                            ArrayList arrayList = new ArrayList(listFiles.length);
                            int length = listFiles.length;
                            for (int i = 0; i < length; i++) {
                                File file2 = listFiles[i];
                                arrayList.add(file2 != null ? file2.getName() : null);
                            }
                            return;
                        }
                        isSAFUri = FileSystemLegacyModule.this.isSAFUri(parse);
                        if (isSAFUri) {
                            throw new FileSystemUnsupportedSchemeException();
                        }
                        throw new IOException("Unsupported scheme for location '" + parse + "'.");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters8 = moduleDefinitionBuilder9.getConverters();
                AnyType[] anyTypeArr8 = new AnyType[1];
                AnyType anyType14 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
                if (anyType14 == null) {
                    try {
                        Result.Companion companion27 = Result.INSTANCE;
                        m13470constructorimpl14 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$24
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.nullableTypeOf(String.class);
                            }
                        }));
                    } catch (Throwable th14) {
                        Result.Companion companion28 = Result.INSTANCE;
                        m13470constructorimpl14 = Result.m13470constructorimpl(ResultKt.createFailure(th14));
                    }
                    Throwable m13473exceptionOrNullimpl14 = Result.m13473exceptionOrNullimpl(m13470constructorimpl14);
                    if (m13473exceptionOrNullimpl14 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl14);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl14)) {
                        m13470constructorimpl14 = null;
                    }
                    TypeDescriptor typeDescriptor14 = (TypeDescriptor) m13470constructorimpl14;
                    if (typeDescriptor14 == null) {
                        typeDescriptor14 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                    }
                    anyType14 = new AnyType(typeDescriptor14, converters8);
                }
                anyTypeArr8[0] = anyType14;
                Function1<Object[], List<? extends String>> function17 = new Function1<Object[], List<? extends String>>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$25
                    @Override // kotlin.jvm.functions.Function1
                    public final List<? extends String> invoke(Object[] objArr) {
                        boolean isSAFUri;
                        File file;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath((String) objArr[0]));
                        FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse);
                        fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.READ);
                        if (Intrinsics.areEqual(parse.getScheme(), "file")) {
                            file = FileSystemLegacyModule.this.toFile(parse);
                            File[] listFiles = file.listFiles();
                            if (listFiles == null) {
                                throw new FileSystemCannotReadDirectoryException(parse);
                            }
                            ArrayList arrayList = new ArrayList(listFiles.length);
                            int length = listFiles.length;
                            for (int i = 0; i < length; i++) {
                                File file2 = listFiles[i];
                                arrayList.add(file2 != null ? file2.getName() : null);
                            }
                            return arrayList;
                        }
                        isSAFUri = FileSystemLegacyModule.this.isSAFUri(parse);
                        if (isSAFUri) {
                            throw new FileSystemUnsupportedSchemeException();
                        }
                        throw new IOException("Unsupported scheme for location '" + parse + "'.");
                    }
                };
                intAsyncFunctionComponent3 = Intrinsics.areEqual(List.class, Integer.TYPE) ? new IntAsyncFunctionComponent("readDirectoryAsync", anyTypeArr8, function17) : Intrinsics.areEqual(List.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("readDirectoryAsync", anyTypeArr8, function17) : Intrinsics.areEqual(List.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("readDirectoryAsync", anyTypeArr8, function17) : Intrinsics.areEqual(List.class, Float.TYPE) ? new FloatAsyncFunctionComponent("readDirectoryAsync", anyTypeArr8, function17) : Intrinsics.areEqual(List.class, String.class) ? new StringAsyncFunctionComponent("readDirectoryAsync", anyTypeArr8, function17) : new UntypedAsyncFunctionComponent("readDirectoryAsync", anyTypeArr8, function17);
            }
            moduleDefinitionBuilder9.getAsyncFunctions().put("readDirectoryAsync", intAsyncFunctionComponent3);
            ModuleDefinitionBuilder moduleDefinitionBuilder10 = moduleDefinitionBuilder;
            AnyType[] anyTypeArr9 = new AnyType[0];
            Function1<Object[], Double> function18 = new Function1<Object[], Double>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$26
                @Override // kotlin.jvm.functions.Function1
                public final Double invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    return Double.valueOf(RangesKt.coerceAtMost(BigInteger.valueOf(statFs.getBlockCountLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong())).doubleValue(), Math.pow(2.0d, 53.0d) - 1));
                }
            };
            moduleDefinitionBuilder10.getAsyncFunctions().put("getTotalDiskCapacityAsync", Intrinsics.areEqual(Double.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getTotalDiskCapacityAsync", anyTypeArr9, function18) : Intrinsics.areEqual(Double.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getTotalDiskCapacityAsync", anyTypeArr9, function18) : Intrinsics.areEqual(Double.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getTotalDiskCapacityAsync", anyTypeArr9, function18) : Intrinsics.areEqual(Double.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getTotalDiskCapacityAsync", anyTypeArr9, function18) : Intrinsics.areEqual(Double.class, String.class) ? new StringAsyncFunctionComponent("getTotalDiskCapacityAsync", anyTypeArr9, function18) : new UntypedAsyncFunctionComponent("getTotalDiskCapacityAsync", anyTypeArr9, function18));
            ModuleDefinitionBuilder moduleDefinitionBuilder11 = moduleDefinitionBuilder;
            AnyType[] anyTypeArr10 = new AnyType[0];
            Function1<Object[], Double> function19 = new Function1<Object[], Double>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$27
                @Override // kotlin.jvm.functions.Function1
                public final Double invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    return Double.valueOf(RangesKt.coerceAtMost(BigInteger.valueOf(statFs.getAvailableBlocksLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong())).doubleValue(), Math.pow(2.0d, 53.0d) - 1));
                }
            };
            moduleDefinitionBuilder11.getAsyncFunctions().put("getFreeDiskStorageAsync", Intrinsics.areEqual(Double.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getFreeDiskStorageAsync", anyTypeArr10, function19) : Intrinsics.areEqual(Double.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getFreeDiskStorageAsync", anyTypeArr10, function19) : Intrinsics.areEqual(Double.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getFreeDiskStorageAsync", anyTypeArr10, function19) : Intrinsics.areEqual(Double.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getFreeDiskStorageAsync", anyTypeArr10, function19) : Intrinsics.areEqual(Double.class, String.class) ? new StringAsyncFunctionComponent("getFreeDiskStorageAsync", anyTypeArr10, function19) : new UntypedAsyncFunctionComponent("getFreeDiskStorageAsync", anyTypeArr10, function19));
            ModuleDefinitionBuilder moduleDefinitionBuilder12 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                intAsyncFunctionComponent4 = new AsyncFunctionWithPromiseComponent("getContentUriAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$28
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        File file;
                        Uri contentUriFromFile;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        String str = (String) promise;
                        Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath(str));
                        FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse);
                        fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.WRITE);
                        FileSystemLegacyModule.this.ensurePermission(parse, FilePermissionService.Permission.READ);
                        FileSystemLegacyModule.this.checkIfFileDirExists(parse);
                        if (Intrinsics.areEqual(parse.getScheme(), "file")) {
                            file = FileSystemLegacyModule.this.toFile(parse);
                            contentUriFromFile = FileSystemLegacyModule.this.contentUriFromFile(file);
                            contentUriFromFile.toString();
                            return;
                        }
                        throw new FileSystemUnreadableDirectoryException(str);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters9 = moduleDefinitionBuilder12.getConverters();
                AnyType[] anyTypeArr11 = new AnyType[1];
                AnyType anyType15 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType15 == null) {
                    try {
                        Result.Companion companion29 = Result.INSTANCE;
                        m13470constructorimpl15 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$29
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(String.class);
                            }
                        }));
                    } catch (Throwable th15) {
                        Result.Companion companion30 = Result.INSTANCE;
                        m13470constructorimpl15 = Result.m13470constructorimpl(ResultKt.createFailure(th15));
                    }
                    Throwable m13473exceptionOrNullimpl15 = Result.m13473exceptionOrNullimpl(m13470constructorimpl15);
                    if (m13473exceptionOrNullimpl15 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl15);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl15)) {
                        m13470constructorimpl15 = null;
                    }
                    TypeDescriptor typeDescriptor15 = (TypeDescriptor) m13470constructorimpl15;
                    if (typeDescriptor15 == null) {
                        typeDescriptor15 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                    }
                    anyType15 = new AnyType(typeDescriptor15, converters9);
                }
                anyTypeArr11[0] = anyType15;
                Function1<Object[], String> function110 = new Function1<Object[], String>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$30
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(Object[] objArr) {
                        File file;
                        Uri contentUriFromFile;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath(str));
                        FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse);
                        fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.WRITE);
                        FileSystemLegacyModule.this.ensurePermission(parse, FilePermissionService.Permission.READ);
                        FileSystemLegacyModule.this.checkIfFileDirExists(parse);
                        if (Intrinsics.areEqual(parse.getScheme(), "file")) {
                            file = FileSystemLegacyModule.this.toFile(parse);
                            contentUriFromFile = FileSystemLegacyModule.this.contentUriFromFile(file);
                            return contentUriFromFile.toString();
                        }
                        throw new FileSystemUnreadableDirectoryException(str);
                    }
                };
                intAsyncFunctionComponent4 = Intrinsics.areEqual(String.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getContentUriAsync", anyTypeArr11, function110) : Intrinsics.areEqual(String.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getContentUriAsync", anyTypeArr11, function110) : Intrinsics.areEqual(String.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getContentUriAsync", anyTypeArr11, function110) : Intrinsics.areEqual(String.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getContentUriAsync", anyTypeArr11, function110) : Intrinsics.areEqual(String.class, String.class) ? new StringAsyncFunctionComponent("getContentUriAsync", anyTypeArr11, function110) : new UntypedAsyncFunctionComponent("getContentUriAsync", anyTypeArr11, function110);
            }
            moduleDefinitionBuilder12.getAsyncFunctions().put("getContentUriAsync", intAsyncFunctionComponent4);
            ModuleDefinitionBuilder moduleDefinitionBuilder13 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                intAsyncFunctionComponent5 = new AsyncFunctionWithPromiseComponent("readSAFDirectoryAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$31
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        boolean isSAFUri;
                        Context context;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath((String) promise));
                        FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse);
                        fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.READ);
                        isSAFUri = FileSystemLegacyModule.this.isSAFUri(parse);
                        if (isSAFUri) {
                            context = FileSystemLegacyModule.this.getContext();
                            DocumentFile fromTreeUri = DocumentFile.fromTreeUri(context, parse);
                            if (fromTreeUri == null || !fromTreeUri.exists() || !fromTreeUri.isDirectory()) {
                                throw new FileSystemCannotReadDirectoryException(parse);
                            }
                            DocumentFile[] listFiles = fromTreeUri.listFiles();
                            Intrinsics.checkNotNullExpressionValue(listFiles, "listFiles(...)");
                            ArrayList arrayList = new ArrayList(listFiles.length);
                            for (DocumentFile documentFile : listFiles) {
                                arrayList.add(documentFile.getUri().toString());
                            }
                            return;
                        }
                        throw new IOException("The URI '" + parse + "' is not a Storage Access Framework URI. Try using FileSystem.readDirectoryAsync instead.");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters10 = moduleDefinitionBuilder13.getConverters();
                AnyType[] anyTypeArr12 = new AnyType[1];
                AnyType anyType16 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType16 == null) {
                    try {
                        Result.Companion companion31 = Result.INSTANCE;
                        m13470constructorimpl16 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$32
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(String.class);
                            }
                        }));
                    } catch (Throwable th16) {
                        Result.Companion companion32 = Result.INSTANCE;
                        m13470constructorimpl16 = Result.m13470constructorimpl(ResultKt.createFailure(th16));
                    }
                    Throwable m13473exceptionOrNullimpl16 = Result.m13473exceptionOrNullimpl(m13470constructorimpl16);
                    if (m13473exceptionOrNullimpl16 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl16);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl16)) {
                        m13470constructorimpl16 = null;
                    }
                    TypeDescriptor typeDescriptor16 = (TypeDescriptor) m13470constructorimpl16;
                    if (typeDescriptor16 == null) {
                        typeDescriptor16 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                    }
                    anyType16 = new AnyType(typeDescriptor16, converters10);
                }
                anyTypeArr12[0] = anyType16;
                Function1<Object[], List<? extends String>> function111 = new Function1<Object[], List<? extends String>>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$33
                    @Override // kotlin.jvm.functions.Function1
                    public final List<? extends String> invoke(Object[] objArr) {
                        boolean isSAFUri;
                        Context context;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath((String) objArr[0]));
                        FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                        Intrinsics.checkNotNull(parse);
                        fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.READ);
                        isSAFUri = FileSystemLegacyModule.this.isSAFUri(parse);
                        if (isSAFUri) {
                            context = FileSystemLegacyModule.this.getContext();
                            DocumentFile fromTreeUri = DocumentFile.fromTreeUri(context, parse);
                            if (fromTreeUri == null || !fromTreeUri.exists() || !fromTreeUri.isDirectory()) {
                                throw new FileSystemCannotReadDirectoryException(parse);
                            }
                            DocumentFile[] listFiles = fromTreeUri.listFiles();
                            Intrinsics.checkNotNullExpressionValue(listFiles, "listFiles(...)");
                            ArrayList arrayList = new ArrayList(listFiles.length);
                            for (DocumentFile documentFile : listFiles) {
                                arrayList.add(documentFile.getUri().toString());
                            }
                            return arrayList;
                        }
                        throw new IOException("The URI '" + parse + "' is not a Storage Access Framework URI. Try using FileSystem.readDirectoryAsync instead.");
                    }
                };
                intAsyncFunctionComponent5 = Intrinsics.areEqual(List.class, Integer.TYPE) ? new IntAsyncFunctionComponent("readSAFDirectoryAsync", anyTypeArr12, function111) : Intrinsics.areEqual(List.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("readSAFDirectoryAsync", anyTypeArr12, function111) : Intrinsics.areEqual(List.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("readSAFDirectoryAsync", anyTypeArr12, function111) : Intrinsics.areEqual(List.class, Float.TYPE) ? new FloatAsyncFunctionComponent("readSAFDirectoryAsync", anyTypeArr12, function111) : Intrinsics.areEqual(List.class, String.class) ? new StringAsyncFunctionComponent("readSAFDirectoryAsync", anyTypeArr12, function111) : new UntypedAsyncFunctionComponent("readSAFDirectoryAsync", anyTypeArr12, function111);
            }
            moduleDefinitionBuilder13.getAsyncFunctions().put("readSAFDirectoryAsync", intAsyncFunctionComponent5);
            ModuleDefinitionBuilder moduleDefinitionBuilder14 = moduleDefinitionBuilder;
            TypeConverterProvider converters11 = moduleDefinitionBuilder14.getConverters();
            AnyType[] anyTypeArr13 = new AnyType[2];
            AnyType anyType17 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType17 == null) {
                try {
                    Result.Companion companion33 = Result.INSTANCE;
                    m13470constructorimpl17 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$34
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th17) {
                    Result.Companion companion34 = Result.INSTANCE;
                    m13470constructorimpl17 = Result.m13470constructorimpl(ResultKt.createFailure(th17));
                }
                Throwable m13473exceptionOrNullimpl17 = Result.m13473exceptionOrNullimpl(m13470constructorimpl17);
                if (m13473exceptionOrNullimpl17 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl17);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl17)) {
                    m13470constructorimpl17 = null;
                }
                TypeDescriptor typeDescriptor17 = (TypeDescriptor) m13470constructorimpl17;
                if (typeDescriptor17 == null) {
                    typeDescriptor17 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType17 = new AnyType(typeDescriptor17, converters11);
            }
            anyTypeArr13[0] = anyType17;
            AnyType anyType18 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType18 == null) {
                try {
                    Result.Companion companion35 = Result.INSTANCE;
                    m13470constructorimpl18 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$35
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th18) {
                    Result.Companion companion36 = Result.INSTANCE;
                    m13470constructorimpl18 = Result.m13470constructorimpl(ResultKt.createFailure(th18));
                }
                Throwable m13473exceptionOrNullimpl18 = Result.m13473exceptionOrNullimpl(m13470constructorimpl18);
                if (m13473exceptionOrNullimpl18 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl18);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl18)) {
                    m13470constructorimpl18 = null;
                }
                TypeDescriptor typeDescriptor18 = (TypeDescriptor) m13470constructorimpl18;
                if (typeDescriptor18 == null) {
                    typeDescriptor18 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType18 = new AnyType(typeDescriptor18, converters11);
            }
            anyTypeArr13[1] = anyType18;
            Function1<Object[], String> function112 = new Function1<Object[], String>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$36
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(Object[] objArr) {
                    boolean isSAFUri;
                    DocumentFile nearestSAFFile;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath((String) obj));
                    FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                    Intrinsics.checkNotNull(parse);
                    fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.WRITE);
                    isSAFUri = FileSystemLegacyModule.this.isSAFUri(parse);
                    if (isSAFUri) {
                        nearestSAFFile = FileSystemLegacyModule.this.getNearestSAFFile(parse);
                        if (nearestSAFFile != null && !nearestSAFFile.isDirectory()) {
                            throw new FileSystemCannotCreateDirectoryException(parse);
                        }
                        DocumentFile createDirectory = nearestSAFFile != null ? nearestSAFFile.createDirectory(str) : null;
                        if (createDirectory == null) {
                            throw new FileSystemCannotCreateDirectoryException(null);
                        }
                        return createDirectory.getUri().toString();
                    }
                    throw new IOException("The URI '" + parse + "' is not a Storage Access Framework URI. Try using FileSystem.makeDirectoryAsync instead.");
                }
            };
            moduleDefinitionBuilder14.getAsyncFunctions().put("makeSAFDirectoryAsync", Intrinsics.areEqual(String.class, Integer.TYPE) ? new IntAsyncFunctionComponent("makeSAFDirectoryAsync", anyTypeArr13, function112) : Intrinsics.areEqual(String.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("makeSAFDirectoryAsync", anyTypeArr13, function112) : Intrinsics.areEqual(String.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("makeSAFDirectoryAsync", anyTypeArr13, function112) : Intrinsics.areEqual(String.class, Float.TYPE) ? new FloatAsyncFunctionComponent("makeSAFDirectoryAsync", anyTypeArr13, function112) : Intrinsics.areEqual(String.class, String.class) ? new StringAsyncFunctionComponent("makeSAFDirectoryAsync", anyTypeArr13, function112) : new UntypedAsyncFunctionComponent("makeSAFDirectoryAsync", anyTypeArr13, function112));
            ModuleDefinitionBuilder moduleDefinitionBuilder15 = moduleDefinitionBuilder;
            TypeConverterProvider converters12 = moduleDefinitionBuilder15.getConverters();
            AnyType[] anyTypeArr14 = new AnyType[3];
            AnyType anyType19 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType19 == null) {
                try {
                    Result.Companion companion37 = Result.INSTANCE;
                    m13470constructorimpl19 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$37
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th19) {
                    Result.Companion companion38 = Result.INSTANCE;
                    m13470constructorimpl19 = Result.m13470constructorimpl(ResultKt.createFailure(th19));
                }
                Throwable m13473exceptionOrNullimpl19 = Result.m13473exceptionOrNullimpl(m13470constructorimpl19);
                if (m13473exceptionOrNullimpl19 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl19);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl19)) {
                    m13470constructorimpl19 = null;
                }
                TypeDescriptor typeDescriptor19 = (TypeDescriptor) m13470constructorimpl19;
                if (typeDescriptor19 == null) {
                    typeDescriptor19 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType19 = new AnyType(typeDescriptor19, converters12);
            }
            anyTypeArr14[0] = anyType19;
            AnyType anyType20 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType20 == null) {
                try {
                    Result.Companion companion39 = Result.INSTANCE;
                    m13470constructorimpl20 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$38
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th20) {
                    Result.Companion companion40 = Result.INSTANCE;
                    m13470constructorimpl20 = Result.m13470constructorimpl(ResultKt.createFailure(th20));
                }
                Throwable m13473exceptionOrNullimpl20 = Result.m13473exceptionOrNullimpl(m13470constructorimpl20);
                if (m13473exceptionOrNullimpl20 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl20);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl20)) {
                    m13470constructorimpl20 = null;
                }
                TypeDescriptor typeDescriptor20 = (TypeDescriptor) m13470constructorimpl20;
                if (typeDescriptor20 == null) {
                    typeDescriptor20 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType20 = new AnyType(typeDescriptor20, converters12);
            }
            anyTypeArr14[1] = anyType20;
            AnyType anyType21 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType21 == null) {
                try {
                    Result.Companion companion41 = Result.INSTANCE;
                    m13470constructorimpl21 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$39
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th21) {
                    Result.Companion companion42 = Result.INSTANCE;
                    m13470constructorimpl21 = Result.m13470constructorimpl(ResultKt.createFailure(th21));
                }
                Throwable m13473exceptionOrNullimpl21 = Result.m13473exceptionOrNullimpl(m13470constructorimpl21);
                if (m13473exceptionOrNullimpl21 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl21);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl21)) {
                    m13470constructorimpl21 = null;
                }
                TypeDescriptor typeDescriptor21 = (TypeDescriptor) m13470constructorimpl21;
                if (typeDescriptor21 == null) {
                    typeDescriptor21 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType21 = new AnyType(typeDescriptor21, converters12);
            }
            anyTypeArr14[2] = anyType21;
            Function1<Object[], String> function113 = new Function1<Object[], String>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$40
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(Object[] objArr) {
                    boolean isSAFUri;
                    DocumentFile nearestSAFFile;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    String str = (String) objArr[2];
                    String str2 = (String) obj2;
                    Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath((String) obj));
                    FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                    Intrinsics.checkNotNull(parse);
                    fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.WRITE);
                    isSAFUri = FileSystemLegacyModule.this.isSAFUri(parse);
                    if (isSAFUri) {
                        nearestSAFFile = FileSystemLegacyModule.this.getNearestSAFFile(parse);
                        if (nearestSAFFile == null || !nearestSAFFile.isDirectory()) {
                            throw new FileSystemCannotCreateFileException(parse);
                        }
                        DocumentFile createFile = nearestSAFFile.createFile(str, str2);
                        if (createFile == null) {
                            throw new FileSystemCannotCreateFileException(null);
                        }
                        return createFile.getUri().toString();
                    }
                    throw new IOException("The URI '" + parse + "' is not a Storage Access Framework URI.");
                }
            };
            moduleDefinitionBuilder15.getAsyncFunctions().put("createSAFFileAsync", Intrinsics.areEqual(String.class, Integer.TYPE) ? new IntAsyncFunctionComponent("createSAFFileAsync", anyTypeArr14, function113) : Intrinsics.areEqual(String.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("createSAFFileAsync", anyTypeArr14, function113) : Intrinsics.areEqual(String.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("createSAFFileAsync", anyTypeArr14, function113) : Intrinsics.areEqual(String.class, Float.TYPE) ? new FloatAsyncFunctionComponent("createSAFFileAsync", anyTypeArr14, function113) : Intrinsics.areEqual(String.class, String.class) ? new StringAsyncFunctionComponent("createSAFFileAsync", anyTypeArr14, function113) : new UntypedAsyncFunctionComponent("createSAFFileAsync", anyTypeArr14, function113));
            ModuleDefinitionBuilder moduleDefinitionBuilder16 = moduleDefinitionBuilder;
            TypeConverterProvider converters13 = moduleDefinitionBuilder16.getConverters();
            AnyType[] anyTypeArr15 = new AnyType[1];
            AnyType anyType22 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType22 == null) {
                try {
                    Result.Companion companion43 = Result.INSTANCE;
                    m13470constructorimpl22 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th22) {
                    Result.Companion companion44 = Result.INSTANCE;
                    m13470constructorimpl22 = Result.m13470constructorimpl(ResultKt.createFailure(th22));
                }
                Throwable m13473exceptionOrNullimpl22 = Result.m13473exceptionOrNullimpl(m13470constructorimpl22);
                if (m13473exceptionOrNullimpl22 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl22);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl22)) {
                    m13470constructorimpl22 = null;
                }
                TypeDescriptor typeDescriptor22 = (TypeDescriptor) m13470constructorimpl22;
                if (typeDescriptor22 == null) {
                    typeDescriptor22 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType22 = new AnyType(typeDescriptor22, converters13);
            }
            anyTypeArr15[0] = anyType22;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("requestDirectoryPermissionsAsync", anyTypeArr15, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Promise promise2;
                    Uri parse;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    String str = (String) objArr[0];
                    promise2 = FileSystemLegacyModule.this.dirPermissionsRequest;
                    if (promise2 != null) {
                        throw new FileSystemPendingPermissionsRequestException();
                    }
                    Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                    if (Build.VERSION.SDK_INT >= 26 && str != null && (parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath(str))) != null) {
                        intent.putExtra("android.provider.extra.INITIAL_URI", parse);
                    }
                    FileSystemLegacyModule.this.dirPermissionsRequest = promise;
                    FileSystemLegacyModule.this.getAppContext().getThrowingActivity().startActivityForResult(intent, 5394);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder16.getAsyncFunctions().put("requestDirectoryPermissionsAsync", asyncFunctionWithPromiseComponent);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = asyncFunctionWithPromiseComponent;
            ModuleDefinitionBuilder moduleDefinitionBuilder17 = moduleDefinitionBuilder;
            TypeConverterProvider converters14 = moduleDefinitionBuilder17.getConverters();
            AnyType[] anyTypeArr16 = new AnyType[3];
            AnyType anyType23 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType23 == null) {
                try {
                    Result.Companion companion45 = Result.INSTANCE;
                    m13470constructorimpl23 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$3
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th23) {
                    Result.Companion companion46 = Result.INSTANCE;
                    m13470constructorimpl23 = Result.m13470constructorimpl(ResultKt.createFailure(th23));
                }
                Throwable m13473exceptionOrNullimpl23 = Result.m13473exceptionOrNullimpl(m13470constructorimpl23);
                if (m13473exceptionOrNullimpl23 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl23);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl23)) {
                    m13470constructorimpl23 = null;
                }
                TypeDescriptor typeDescriptor23 = (TypeDescriptor) m13470constructorimpl23;
                if (typeDescriptor23 == null) {
                    typeDescriptor23 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType23 = new AnyType(typeDescriptor23, converters14);
            }
            anyTypeArr16[0] = anyType23;
            AnyType anyType24 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType24 == null) {
                try {
                    Result.Companion companion47 = Result.INSTANCE;
                    m13470constructorimpl24 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$4
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th24) {
                    Result.Companion companion48 = Result.INSTANCE;
                    m13470constructorimpl24 = Result.m13470constructorimpl(ResultKt.createFailure(th24));
                }
                Throwable m13473exceptionOrNullimpl24 = Result.m13473exceptionOrNullimpl(m13470constructorimpl24);
                if (m13473exceptionOrNullimpl24 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl24);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl24)) {
                    m13470constructorimpl24 = null;
                }
                TypeDescriptor typeDescriptor24 = (TypeDescriptor) m13470constructorimpl24;
                if (typeDescriptor24 == null) {
                    typeDescriptor24 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType24 = new AnyType(typeDescriptor24, converters14);
            }
            anyTypeArr16[1] = anyType24;
            AnyType anyType25 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(FileSystemUploadOptions.class), false));
            if (anyType25 == null) {
                try {
                    Result.Companion companion49 = Result.INSTANCE;
                    m13470constructorimpl25 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.filesystem.legacy.FileSystemUploadOptions", Reflection.getOrCreateKotlinClass(FileSystemUploadOptions.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$5
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(FileSystemUploadOptions.class);
                        }
                    }));
                } catch (Throwable th25) {
                    Result.Companion companion50 = Result.INSTANCE;
                    m13470constructorimpl25 = Result.m13470constructorimpl(ResultKt.createFailure(th25));
                }
                Throwable m13473exceptionOrNullimpl25 = Result.m13473exceptionOrNullimpl(m13470constructorimpl25);
                if (m13473exceptionOrNullimpl25 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + FileSystemUploadOptions.class.getName(), m13473exceptionOrNullimpl25);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl25)) {
                    m13470constructorimpl25 = null;
                }
                TypeDescriptor typeDescriptor25 = (TypeDescriptor) m13470constructorimpl25;
                if (typeDescriptor25 == null) {
                    typeDescriptor25 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(FileSystemUploadOptions.class));
                }
                anyType25 = new AnyType(typeDescriptor25, converters14);
            }
            anyTypeArr16[2] = anyType25;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("uploadAsync", anyTypeArr16, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) {
                    Request createUploadRequest;
                    OkHttpClient okHttpClient;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    FileSystemUploadOptions fileSystemUploadOptions = (FileSystemUploadOptions) objArr[2];
                    FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                    createUploadRequest = fileSystemLegacyModule2.createUploadRequest((String) obj, (String) obj2, fileSystemUploadOptions, new RequestBodyDecorator() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$1$20$request$1
                        @Override // expo.modules.filesystem.legacy.RequestBodyDecorator
                        public final RequestBody decorate(RequestBody requestBody) {
                            Intrinsics.checkNotNullParameter(requestBody, "requestBody");
                            return requestBody;
                        }
                    });
                    okHttpClient = FileSystemLegacyModule.this.getOkHttpClient();
                    if (okHttpClient != null) {
                        Call newCall = okHttpClient.newCall(createUploadRequest);
                        final FileSystemLegacyModule fileSystemLegacyModule3 = FileSystemLegacyModule.this;
                        newCall.enqueue(new Callback() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$1$20$1$1
                            @Override // okhttp3.Callback
                            public void onFailure(Call call, IOException e) {
                                String str;
                                String str2;
                                Intrinsics.checkNotNullParameter(call, "call");
                                Intrinsics.checkNotNullParameter(e, "e");
                                str = FileSystemLegacyModuleKt.TAG;
                                Log.e(str, String.valueOf(e.getMessage()));
                                Promise promise2 = Promise.this;
                                str2 = FileSystemLegacyModuleKt.TAG;
                                promise2.reject(str2, e.getMessage(), e);
                            }

                            @Override // okhttp3.Callback
                            public void onResponse(Call call, Response response) {
                                Bundle translateHeaders;
                                Intrinsics.checkNotNullParameter(call, "call");
                                Intrinsics.checkNotNullParameter(response, "response");
                                Bundle bundle = new Bundle();
                                FileSystemLegacyModule fileSystemLegacyModule4 = fileSystemLegacyModule3;
                                ResponseBody body = response.body();
                                bundle.putString("body", body != null ? body.string() : null);
                                bundle.putInt("status", response.code());
                                translateHeaders = fileSystemLegacyModule4.translateHeaders(response.headers());
                                bundle.putBundle("headers", translateHeaders);
                                response.close();
                                Promise.this.resolve(bundle);
                            }
                        });
                        return;
                    }
                    promise.reject(new FileSystemOkHttpNullException());
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder17.getAsyncFunctions().put("uploadAsync", asyncFunctionWithPromiseComponent3);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent4 = asyncFunctionWithPromiseComponent3;
            ModuleDefinitionBuilder moduleDefinitionBuilder18 = moduleDefinitionBuilder;
            TypeConverterProvider converters15 = moduleDefinitionBuilder18.getConverters();
            AnyType[] anyTypeArr17 = new AnyType[4];
            AnyType anyType26 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType26 == null) {
                try {
                    Result.Companion companion51 = Result.INSTANCE;
                    m13470constructorimpl26 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$7
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th26) {
                    Result.Companion companion52 = Result.INSTANCE;
                    m13470constructorimpl26 = Result.m13470constructorimpl(ResultKt.createFailure(th26));
                }
                Throwable m13473exceptionOrNullimpl26 = Result.m13473exceptionOrNullimpl(m13470constructorimpl26);
                if (m13473exceptionOrNullimpl26 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl26);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl26)) {
                    m13470constructorimpl26 = null;
                }
                TypeDescriptor typeDescriptor26 = (TypeDescriptor) m13470constructorimpl26;
                if (typeDescriptor26 == null) {
                    typeDescriptor26 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType26 = new AnyType(typeDescriptor26, converters15);
            }
            anyTypeArr17[0] = anyType26;
            AnyType anyType27 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType27 == null) {
                try {
                    Result.Companion companion53 = Result.INSTANCE;
                    m13470constructorimpl27 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$8
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th27) {
                    Result.Companion companion54 = Result.INSTANCE;
                    m13470constructorimpl27 = Result.m13470constructorimpl(ResultKt.createFailure(th27));
                }
                Throwable m13473exceptionOrNullimpl27 = Result.m13473exceptionOrNullimpl(m13470constructorimpl27);
                if (m13473exceptionOrNullimpl27 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl27);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl27)) {
                    m13470constructorimpl27 = null;
                }
                TypeDescriptor typeDescriptor27 = (TypeDescriptor) m13470constructorimpl27;
                if (typeDescriptor27 == null) {
                    typeDescriptor27 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType27 = new AnyType(typeDescriptor27, converters15);
            }
            anyTypeArr17[1] = anyType27;
            AnyType anyType28 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType28 == null) {
                try {
                    Result.Companion companion55 = Result.INSTANCE;
                    m13470constructorimpl28 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$9
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th28) {
                    Result.Companion companion56 = Result.INSTANCE;
                    m13470constructorimpl28 = Result.m13470constructorimpl(ResultKt.createFailure(th28));
                }
                Throwable m13473exceptionOrNullimpl28 = Result.m13473exceptionOrNullimpl(m13470constructorimpl28);
                if (m13473exceptionOrNullimpl28 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl28);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl28)) {
                    m13470constructorimpl28 = null;
                }
                TypeDescriptor typeDescriptor28 = (TypeDescriptor) m13470constructorimpl28;
                if (typeDescriptor28 == null) {
                    typeDescriptor28 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType28 = new AnyType(typeDescriptor28, converters15);
            }
            anyTypeArr17[2] = anyType28;
            AnyType anyType29 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(FileSystemUploadOptions.class), false));
            if (anyType29 == null) {
                try {
                    Result.Companion companion57 = Result.INSTANCE;
                    m13470constructorimpl29 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.filesystem.legacy.FileSystemUploadOptions", Reflection.getOrCreateKotlinClass(FileSystemUploadOptions.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$10
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(FileSystemUploadOptions.class);
                        }
                    }));
                } catch (Throwable th29) {
                    Result.Companion companion58 = Result.INSTANCE;
                    m13470constructorimpl29 = Result.m13470constructorimpl(ResultKt.createFailure(th29));
                }
                Throwable m13473exceptionOrNullimpl29 = Result.m13473exceptionOrNullimpl(m13470constructorimpl29);
                if (m13473exceptionOrNullimpl29 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + FileSystemUploadOptions.class.getName(), m13473exceptionOrNullimpl29);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl29)) {
                    m13470constructorimpl29 = null;
                }
                TypeDescriptor typeDescriptor29 = (TypeDescriptor) m13470constructorimpl29;
                if (typeDescriptor29 == null) {
                    typeDescriptor29 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(FileSystemUploadOptions.class));
                }
                anyType29 = new AnyType(typeDescriptor29, converters15);
            }
            anyTypeArr17[3] = anyType29;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent5 = new AsyncFunctionWithPromiseComponent("uploadTaskStartAsync", anyTypeArr17, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$11
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) {
                    Request createUploadRequest;
                    OkHttpClient okHttpClient;
                    Map map;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    Object obj3 = objArr[2];
                    FileSystemUploadOptions fileSystemUploadOptions = (FileSystemUploadOptions) objArr[3];
                    final String str = (String) obj3;
                    final FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                    final CountingRequestListener countingRequestListener = new CountingRequestListener() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$1$21$progressListener$1
                        private long mLastUpdate = -1;

                        @Override // expo.modules.filesystem.legacy.CountingRequestListener
                        public void onProgress(long bytesWritten, long contentLength) {
                            Bundle bundle = new Bundle();
                            Bundle bundle2 = new Bundle();
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis > this.mLastUpdate + 100 || bytesWritten == contentLength) {
                                this.mLastUpdate = currentTimeMillis;
                                bundle2.putDouble("totalBytesSent", bytesWritten);
                                bundle2.putDouble("totalBytesExpectedToSend", contentLength);
                                bundle.putString("uuid", str);
                                bundle.putBundle("data", bundle2);
                                fileSystemLegacyModule2.sendEvent("expo-file-system.uploadProgress", bundle);
                            }
                        }
                    };
                    FileSystemLegacyModule fileSystemLegacyModule3 = FileSystemLegacyModule.this;
                    createUploadRequest = fileSystemLegacyModule3.createUploadRequest((String) obj, (String) obj2, fileSystemUploadOptions, new RequestBodyDecorator() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$1$21$request$1
                        @Override // expo.modules.filesystem.legacy.RequestBodyDecorator
                        public final RequestBody decorate(RequestBody requestBody) {
                            Intrinsics.checkNotNullParameter(requestBody, "requestBody");
                            return new CountingRequestBody(requestBody, CountingRequestListener.this);
                        }
                    });
                    okHttpClient = FileSystemLegacyModule.this.getOkHttpClient();
                    Intrinsics.checkNotNull(okHttpClient);
                    Call newCall = okHttpClient.newCall(createUploadRequest);
                    map = FileSystemLegacyModule.this.taskHandlers;
                    map.put(str, new FileSystemLegacyModule.TaskHandler(newCall));
                    final FileSystemLegacyModule fileSystemLegacyModule4 = FileSystemLegacyModule.this;
                    newCall.enqueue(new Callback() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$1$21$1
                        @Override // okhttp3.Callback
                        public void onFailure(Call call, IOException e) {
                            String str2;
                            String str3;
                            Intrinsics.checkNotNullParameter(call, "call");
                            Intrinsics.checkNotNullParameter(e, "e");
                            if (!call.getCanceled()) {
                                str2 = FileSystemLegacyModuleKt.TAG;
                                Log.e(str2, String.valueOf(e.getMessage()));
                                Promise promise2 = Promise.this;
                                str3 = FileSystemLegacyModuleKt.TAG;
                                promise2.reject(str3, e.getMessage(), e);
                                return;
                            }
                            Promise.this.resolve((Object) null);
                        }

                        @Override // okhttp3.Callback
                        public void onResponse(Call call, Response response) {
                            Bundle translateHeaders;
                            Intrinsics.checkNotNullParameter(call, "call");
                            Intrinsics.checkNotNullParameter(response, "response");
                            Bundle bundle = new Bundle();
                            ResponseBody body = response.body();
                            FileSystemLegacyModule fileSystemLegacyModule5 = fileSystemLegacyModule4;
                            bundle.putString("body", body != null ? body.string() : null);
                            bundle.putInt("status", response.code());
                            translateHeaders = fileSystemLegacyModule5.translateHeaders(response.headers());
                            bundle.putBundle("headers", translateHeaders);
                            response.close();
                            Promise.this.resolve(bundle);
                        }
                    });
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder18.getAsyncFunctions().put("uploadTaskStartAsync", asyncFunctionWithPromiseComponent5);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent6 = asyncFunctionWithPromiseComponent5;
            ModuleDefinitionBuilder moduleDefinitionBuilder19 = moduleDefinitionBuilder;
            TypeConverterProvider converters16 = moduleDefinitionBuilder19.getConverters();
            AnyType[] anyTypeArr18 = new AnyType[3];
            AnyType anyType30 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType30 == null) {
                try {
                    Result.Companion companion59 = Result.INSTANCE;
                    m13470constructorimpl30 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$12
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th30) {
                    Result.Companion companion60 = Result.INSTANCE;
                    m13470constructorimpl30 = Result.m13470constructorimpl(ResultKt.createFailure(th30));
                }
                Throwable m13473exceptionOrNullimpl30 = Result.m13473exceptionOrNullimpl(m13470constructorimpl30);
                if (m13473exceptionOrNullimpl30 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl30);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl30)) {
                    m13470constructorimpl30 = null;
                }
                TypeDescriptor typeDescriptor30 = (TypeDescriptor) m13470constructorimpl30;
                if (typeDescriptor30 == null) {
                    typeDescriptor30 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType30 = new AnyType(typeDescriptor30, converters16);
            }
            anyTypeArr18[0] = anyType30;
            AnyType anyType31 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType31 == null) {
                try {
                    Result.Companion companion61 = Result.INSTANCE;
                    m13470constructorimpl31 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$13
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th31) {
                    Result.Companion companion62 = Result.INSTANCE;
                    m13470constructorimpl31 = Result.m13470constructorimpl(ResultKt.createFailure(th31));
                }
                Throwable m13473exceptionOrNullimpl31 = Result.m13473exceptionOrNullimpl(m13470constructorimpl31);
                if (m13473exceptionOrNullimpl31 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl31);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl31)) {
                    m13470constructorimpl31 = null;
                }
                TypeDescriptor typeDescriptor31 = (TypeDescriptor) m13470constructorimpl31;
                if (typeDescriptor31 == null) {
                    typeDescriptor31 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType31 = new AnyType(typeDescriptor31, converters16);
            }
            anyTypeArr18[1] = anyType31;
            AnyType anyType32 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DownloadOptionsLegacy.class), false));
            if (anyType32 == null) {
                try {
                    Result.Companion companion63 = Result.INSTANCE;
                    m13470constructorimpl32 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.filesystem.legacy.DownloadOptionsLegacy", Reflection.getOrCreateKotlinClass(DownloadOptionsLegacy.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$14
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(DownloadOptionsLegacy.class);
                        }
                    }));
                } catch (Throwable th32) {
                    Result.Companion companion64 = Result.INSTANCE;
                    m13470constructorimpl32 = Result.m13470constructorimpl(ResultKt.createFailure(th32));
                }
                Throwable m13473exceptionOrNullimpl32 = Result.m13473exceptionOrNullimpl(m13470constructorimpl32);
                if (m13473exceptionOrNullimpl32 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + DownloadOptionsLegacy.class.getName(), m13473exceptionOrNullimpl32);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl32)) {
                    m13470constructorimpl32 = null;
                }
                TypeDescriptor typeDescriptor32 = (TypeDescriptor) m13470constructorimpl32;
                if (typeDescriptor32 == null) {
                    typeDescriptor32 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(DownloadOptionsLegacy.class));
                }
                anyType32 = new AnyType(typeDescriptor32, converters16);
            }
            anyTypeArr18[2] = anyType32;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent7 = new AsyncFunctionWithPromiseComponent("downloadAsync", anyTypeArr18, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$15
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) {
                    OkHttpClient okHttpClient;
                    Call newCall;
                    Context context;
                    File file;
                    String md5;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    final DownloadOptionsLegacy downloadOptionsLegacy = (DownloadOptionsLegacy) objArr[2];
                    String str = (String) obj;
                    final Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath((String) obj2));
                    FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                    Intrinsics.checkNotNull(parse);
                    fileSystemLegacyModule2.ensurePermission(parse, FilePermissionService.Permission.WRITE);
                    FileSystemLegacyModule.this.checkIfFileDirExists(parse);
                    if (!StringsKt.contains$default((CharSequence) str, (CharSequence) ":", false, 2, (Object) null)) {
                        context = FileSystemLegacyModule.this.getContext();
                        InputStream openRawResource = context.getResources().openRawResource(context.getResources().getIdentifier(str, "raw", context.getPackageName()));
                        Intrinsics.checkNotNullExpressionValue(openRawResource, "openRawResource(...)");
                        BufferedSource buffer = Okio.buffer(Okio.source(openRawResource));
                        file = FileSystemLegacyModule.this.toFile(parse);
                        file.delete();
                        BufferedSink buffer2 = Okio.buffer(Okio__JvmOkioKt.sink$default(file, false, 1, null));
                        buffer2.writeAll(buffer);
                        buffer2.close();
                        Bundle bundle = new Bundle();
                        bundle.putString("uri", Uri.fromFile(file).toString());
                        boolean md52 = downloadOptionsLegacy.getMd5();
                        Boolean valueOf = Boolean.valueOf(md52);
                        valueOf.getClass();
                        Boolean bool = md52 ? valueOf : null;
                        if (bool != null) {
                            bool.booleanValue();
                            md5 = FileSystemLegacyModule.this.md5(file);
                            bundle.putString("md5", md5);
                        }
                        promise.resolve(bundle);
                        return;
                    }
                    if (Intrinsics.areEqual("file", parse.getScheme())) {
                        Request.Builder url = new Request.Builder().url(str);
                        if (downloadOptionsLegacy.getHeaders() != null) {
                            for (Map.Entry<String, String> entry : downloadOptionsLegacy.getHeaders().entrySet()) {
                                url.addHeader(entry.getKey(), entry.getValue());
                            }
                        }
                        okHttpClient = FileSystemLegacyModule.this.getOkHttpClient();
                        if (okHttpClient == null || (newCall = okHttpClient.newCall(url.build())) == null) {
                            promise.reject(new FileSystemOkHttpNullException());
                            return;
                        } else {
                            final FileSystemLegacyModule fileSystemLegacyModule3 = FileSystemLegacyModule.this;
                            newCall.enqueue(new Callback() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$1$22$4
                                @Override // okhttp3.Callback
                                public void onFailure(Call call, IOException e) {
                                    String str2;
                                    String str3;
                                    Intrinsics.checkNotNullParameter(call, "call");
                                    Intrinsics.checkNotNullParameter(e, "e");
                                    str2 = FileSystemLegacyModuleKt.TAG;
                                    Log.e(str2, String.valueOf(e.getMessage()));
                                    Promise promise2 = Promise.this;
                                    str3 = FileSystemLegacyModuleKt.TAG;
                                    promise2.reject(str3, e.getMessage(), e);
                                }

                                @Override // okhttp3.Callback
                                public void onResponse(Call call, Response response) throws IOException {
                                    File file2;
                                    Bundle translateHeaders;
                                    String md53;
                                    Intrinsics.checkNotNullParameter(call, "call");
                                    Intrinsics.checkNotNullParameter(response, "response");
                                    FileSystemLegacyModule fileSystemLegacyModule4 = fileSystemLegacyModule3;
                                    Uri uri = parse;
                                    Intrinsics.checkNotNull(uri);
                                    file2 = fileSystemLegacyModule4.toFile(uri);
                                    file2.delete();
                                    BufferedSink buffer3 = Okio.buffer(Okio__JvmOkioKt.sink$default(file2, false, 1, null));
                                    ResponseBody body = response.body();
                                    Intrinsics.checkNotNull(body);
                                    buffer3.writeAll(body.getSource());
                                    buffer3.close();
                                    Bundle bundle2 = new Bundle();
                                    FileSystemLegacyModule fileSystemLegacyModule5 = fileSystemLegacyModule3;
                                    DownloadOptionsLegacy downloadOptionsLegacy2 = downloadOptionsLegacy;
                                    bundle2.putString("uri", Uri.fromFile(file2).toString());
                                    bundle2.putInt("status", response.code());
                                    translateHeaders = fileSystemLegacyModule5.translateHeaders(response.headers());
                                    bundle2.putBundle("headers", translateHeaders);
                                    if (downloadOptionsLegacy2.getMd5()) {
                                        md53 = fileSystemLegacyModule5.md5(file2);
                                        bundle2.putString("md5", md53);
                                    }
                                    response.close();
                                    Promise.this.resolve(bundle2);
                                }
                            });
                            return;
                        }
                    }
                    throw new IOException("Unsupported scheme for location '" + parse + "'.");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder19.getAsyncFunctions().put("downloadAsync", asyncFunctionWithPromiseComponent7);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent8 = asyncFunctionWithPromiseComponent7;
            ModuleDefinitionBuilder moduleDefinitionBuilder20 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("networkTaskCancelAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$41
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Map map;
                        Call call;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        map = FileSystemLegacyModule.this.taskHandlers;
                        FileSystemLegacyModule.TaskHandler taskHandler = (FileSystemLegacyModule.TaskHandler) map.get((String) promise);
                        if (taskHandler == null || (call = taskHandler.getCall()) == null) {
                            return;
                        }
                        call.cancel();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters17 = moduleDefinitionBuilder20.getConverters();
                AnyType[] anyTypeArr19 = new AnyType[1];
                AnyType anyType33 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType33 == null) {
                    try {
                        Result.Companion companion65 = Result.INSTANCE;
                        m13470constructorimpl33 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$42
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(String.class);
                            }
                        }));
                    } catch (Throwable th33) {
                        Result.Companion companion66 = Result.INSTANCE;
                        m13470constructorimpl33 = Result.m13470constructorimpl(ResultKt.createFailure(th33));
                    }
                    Throwable m13473exceptionOrNullimpl33 = Result.m13473exceptionOrNullimpl(m13470constructorimpl33);
                    if (m13473exceptionOrNullimpl33 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl33);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl33)) {
                        m13470constructorimpl33 = null;
                    }
                    TypeDescriptor typeDescriptor33 = (TypeDescriptor) m13470constructorimpl33;
                    if (typeDescriptor33 == null) {
                        typeDescriptor33 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                    }
                    anyType33 = new AnyType(typeDescriptor33, converters17);
                }
                anyTypeArr19[0] = anyType33;
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("networkTaskCancelAsync", anyTypeArr19, new Function1<Object[], Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$43
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Map map;
                        Call call;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        map = FileSystemLegacyModule.this.taskHandlers;
                        FileSystemLegacyModule.TaskHandler taskHandler = (FileSystemLegacyModule.TaskHandler) map.get(str);
                        if (taskHandler == null || (call = taskHandler.getCall()) == null) {
                            return null;
                        }
                        call.cancel();
                        return Unit.INSTANCE;
                    }
                });
            }
            moduleDefinitionBuilder20.getAsyncFunctions().put("networkTaskCancelAsync", untypedAsyncFunctionComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder21 = moduleDefinitionBuilder;
            TypeConverterProvider converters18 = moduleDefinitionBuilder21.getConverters();
            AnyType[] anyTypeArr20 = new AnyType[5];
            AnyType anyType34 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType34 == null) {
                try {
                    Result.Companion companion67 = Result.INSTANCE;
                    m13470constructorimpl34 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$16
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th34) {
                    Result.Companion companion68 = Result.INSTANCE;
                    m13470constructorimpl34 = Result.m13470constructorimpl(ResultKt.createFailure(th34));
                }
                Throwable m13473exceptionOrNullimpl34 = Result.m13473exceptionOrNullimpl(m13470constructorimpl34);
                if (m13473exceptionOrNullimpl34 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl34);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl34)) {
                    m13470constructorimpl34 = null;
                }
                TypeDescriptor typeDescriptor34 = (TypeDescriptor) m13470constructorimpl34;
                if (typeDescriptor34 == null) {
                    typeDescriptor34 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType34 = new AnyType(typeDescriptor34, converters18);
            }
            anyTypeArr20[0] = anyType34;
            AnyType anyType35 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType35 == null) {
                try {
                    Result.Companion companion69 = Result.INSTANCE;
                    m13470constructorimpl35 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$17
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th35) {
                    Result.Companion companion70 = Result.INSTANCE;
                    m13470constructorimpl35 = Result.m13470constructorimpl(ResultKt.createFailure(th35));
                }
                Throwable m13473exceptionOrNullimpl35 = Result.m13473exceptionOrNullimpl(m13470constructorimpl35);
                if (m13473exceptionOrNullimpl35 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl35);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl35)) {
                    m13470constructorimpl35 = null;
                }
                TypeDescriptor typeDescriptor35 = (TypeDescriptor) m13470constructorimpl35;
                if (typeDescriptor35 == null) {
                    typeDescriptor35 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType35 = new AnyType(typeDescriptor35, converters18);
            }
            anyTypeArr20[1] = anyType35;
            AnyType anyType36 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType36 == null) {
                try {
                    Result.Companion companion71 = Result.INSTANCE;
                    m13470constructorimpl36 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$18
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th36) {
                    Result.Companion companion72 = Result.INSTANCE;
                    m13470constructorimpl36 = Result.m13470constructorimpl(ResultKt.createFailure(th36));
                }
                Throwable m13473exceptionOrNullimpl36 = Result.m13473exceptionOrNullimpl(m13470constructorimpl36);
                if (m13473exceptionOrNullimpl36 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl36);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl36)) {
                    m13470constructorimpl36 = null;
                }
                TypeDescriptor typeDescriptor36 = (TypeDescriptor) m13470constructorimpl36;
                if (typeDescriptor36 == null) {
                    typeDescriptor36 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType36 = new AnyType(typeDescriptor36, converters18);
            }
            anyTypeArr20[2] = anyType36;
            AnyType anyType37 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(DownloadOptionsLegacy.class), false));
            if (anyType37 == null) {
                try {
                    Result.Companion companion73 = Result.INSTANCE;
                    m13470constructorimpl37 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.filesystem.legacy.DownloadOptionsLegacy", Reflection.getOrCreateKotlinClass(DownloadOptionsLegacy.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$19
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(DownloadOptionsLegacy.class);
                        }
                    }));
                } catch (Throwable th37) {
                    Result.Companion companion74 = Result.INSTANCE;
                    m13470constructorimpl37 = Result.m13470constructorimpl(ResultKt.createFailure(th37));
                }
                Throwable m13473exceptionOrNullimpl37 = Result.m13473exceptionOrNullimpl(m13470constructorimpl37);
                if (m13473exceptionOrNullimpl37 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + DownloadOptionsLegacy.class.getName(), m13473exceptionOrNullimpl37);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl37)) {
                    m13470constructorimpl37 = null;
                }
                TypeDescriptor typeDescriptor37 = (TypeDescriptor) m13470constructorimpl37;
                if (typeDescriptor37 == null) {
                    typeDescriptor37 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(DownloadOptionsLegacy.class));
                }
                anyType37 = new AnyType(typeDescriptor37, converters18);
            }
            anyTypeArr20[3] = anyType37;
            AnyType anyType38 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType38 == null) {
                try {
                    Result.Companion companion75 = Result.INSTANCE;
                    m13470constructorimpl38 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), true)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$20
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(String.class);
                        }
                    }));
                } catch (Throwable th38) {
                    Result.Companion companion76 = Result.INSTANCE;
                    m13470constructorimpl38 = Result.m13470constructorimpl(ResultKt.createFailure(th38));
                }
                Throwable m13473exceptionOrNullimpl38 = Result.m13473exceptionOrNullimpl(m13470constructorimpl38);
                if (m13473exceptionOrNullimpl38 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl38);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl38)) {
                    m13470constructorimpl38 = null;
                }
                TypeDescriptor typeDescriptor38 = (TypeDescriptor) m13470constructorimpl38;
                if (typeDescriptor38 == null) {
                    typeDescriptor38 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(String.class));
                }
                anyType38 = new AnyType(typeDescriptor38, converters18);
            }
            anyTypeArr20[4] = anyType38;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent9 = new AsyncFunctionWithPromiseComponent("downloadResumableStartAsync", anyTypeArr20, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunctionWithPromise$21
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    OkHttpClient okHttpClient;
                    Map map;
                    File file;
                    CoroutineScope coroutineScope;
                    OkHttpClient.Builder newBuilder;
                    OkHttpClient.Builder addInterceptor;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    Object obj3 = objArr[2];
                    Object obj4 = objArr[3];
                    final String str = (String) objArr[4];
                    DownloadOptionsLegacy downloadOptionsLegacy = (DownloadOptionsLegacy) obj4;
                    final String str2 = (String) obj3;
                    String str3 = (String) obj;
                    Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath((String) obj2));
                    FileSystemLegacyModule fileSystemLegacyModule2 = FileSystemLegacyModule.this;
                    Intrinsics.checkNotNull(parse);
                    fileSystemLegacyModule2.checkIfFileDirExists(parse);
                    if (!Intrinsics.areEqual(parse.getScheme(), "file")) {
                        throw new IOException("Unsupported scheme for location '" + parse + "'.");
                    }
                    final FileSystemLegacyModule fileSystemLegacyModule3 = FileSystemLegacyModule.this;
                    final FileSystemLegacyModule.ProgressListener progressListener = new FileSystemLegacyModule.ProgressListener() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$1$24$progressListener$1
                        private long mLastUpdate = -1;

                        public final long getMLastUpdate() {
                            return this.mLastUpdate;
                        }

                        public final void setMLastUpdate(long j) {
                            this.mLastUpdate = j;
                        }

                        @Override // expo.modules.filesystem.legacy.FileSystemLegacyModule.ProgressListener
                        public void update(long bytesRead, long contentLength, boolean done) {
                            Bundle bundle = new Bundle();
                            Bundle bundle2 = new Bundle();
                            String str4 = str;
                            long parseLong = bytesRead + (str4 != null ? Long.parseLong(str4) : 0L);
                            String str5 = str;
                            long parseLong2 = contentLength + (str5 != null ? Long.parseLong(str5) : 0L);
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis > this.mLastUpdate + 100 || parseLong == parseLong2) {
                                this.mLastUpdate = currentTimeMillis;
                                bundle2.putDouble("totalBytesWritten", parseLong);
                                bundle2.putDouble("totalBytesExpectedToWrite", parseLong2);
                                bundle.putString("uuid", str2);
                                bundle.putBundle("data", bundle2);
                                fileSystemLegacyModule3.sendEvent("expo-file-system.downloadProgress", bundle);
                            }
                        }
                    };
                    okHttpClient = FileSystemLegacyModule.this.getOkHttpClient();
                    OkHttpClient build = (okHttpClient == null || (newBuilder = okHttpClient.newBuilder()) == null || (addInterceptor = newBuilder.addInterceptor(new Interceptor() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$lambda$45$$inlined$-addInterceptor$1
                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) {
                            Intrinsics.checkNotNullParameter(chain, "chain");
                            Response proceed = chain.proceed(chain.request());
                            return proceed.newBuilder().body(new FileSystemLegacyModule.ProgressResponseBody(proceed.body(), FileSystemLegacyModule.ProgressListener.this)).build();
                        }
                    })) == null) ? null : addInterceptor.build();
                    if (build == null) {
                        promise.reject(new FileSystemOkHttpNullException());
                        return;
                    }
                    Request.Builder builder = new Request.Builder();
                    if (str != null) {
                        builder.addHeader(HttpHeaders.RANGE, "bytes=" + str + "-");
                    }
                    if (downloadOptionsLegacy.getHeaders() != null) {
                        for (Map.Entry<String, String> entry : downloadOptionsLegacy.getHeaders().entrySet()) {
                            builder.addHeader(entry.getKey(), entry.getValue());
                        }
                    }
                    Call newCall = build.newCall(builder.url(str3).build());
                    map = FileSystemLegacyModule.this.taskHandlers;
                    map.put(str2, new FileSystemLegacyModule.DownloadTaskHandler(parse, newCall));
                    file = FileSystemLegacyModule.this.toFile(parse);
                    FileSystemLegacyModule.DownloadResumableTaskParams downloadResumableTaskParams = new FileSystemLegacyModule.DownloadResumableTaskParams(downloadOptionsLegacy, newCall, file, str != null, promise);
                    coroutineScope = FileSystemLegacyModule.this.moduleCoroutineScope;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FileSystemLegacyModule$definition$1$24$3(FileSystemLegacyModule.this, downloadResumableTaskParams, null), 3, null);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder21.getAsyncFunctions().put("downloadResumableStartAsync", asyncFunctionWithPromiseComponent9);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent10 = asyncFunctionWithPromiseComponent9;
            ModuleDefinitionBuilder moduleDefinitionBuilder22 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                intAsyncFunctionComponent6 = new AsyncFunctionWithPromiseComponent("downloadResumablePauseAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$44
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Map map;
                        Map map2;
                        File file;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        String str = (String) promise;
                        map = FileSystemLegacyModule.this.taskHandlers;
                        FileSystemLegacyModule.TaskHandler taskHandler = (FileSystemLegacyModule.TaskHandler) map.get(str);
                        if (taskHandler == null) {
                            throw new IOException("No download object available");
                        }
                        if (!(taskHandler instanceof FileSystemLegacyModule.DownloadTaskHandler)) {
                            throw new FileSystemCannotFindTaskException();
                        }
                        taskHandler.getCall().cancel();
                        map2 = FileSystemLegacyModule.this.taskHandlers;
                        map2.remove(str);
                        file = FileSystemLegacyModule.this.toFile(((FileSystemLegacyModule.DownloadTaskHandler) taskHandler).getFileUri());
                        new Bundle().putString("resumeData", String.valueOf(file.length()));
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters19 = moduleDefinitionBuilder22.getConverters();
                AnyType[] anyTypeArr21 = new AnyType[1];
                AnyType anyType39 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType39 == null) {
                    try {
                        Result.Companion companion77 = Result.INSTANCE;
                        m13470constructorimpl39 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$45
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(String.class);
                            }
                        }));
                    } catch (Throwable th39) {
                        Result.Companion companion78 = Result.INSTANCE;
                        m13470constructorimpl39 = Result.m13470constructorimpl(ResultKt.createFailure(th39));
                    }
                    Throwable m13473exceptionOrNullimpl39 = Result.m13473exceptionOrNullimpl(m13470constructorimpl39);
                    if (m13473exceptionOrNullimpl39 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl39);
                    }
                    TypeDescriptor typeDescriptor39 = (TypeDescriptor) (Result.m13476isFailureimpl(m13470constructorimpl39) ? null : m13470constructorimpl39);
                    if (typeDescriptor39 == null) {
                        typeDescriptor39 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                    }
                    anyType39 = new AnyType(typeDescriptor39, converters19);
                }
                anyTypeArr21[0] = anyType39;
                Function1<Object[], Bundle> function114 = new Function1<Object[], Bundle>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$AsyncFunction$46
                    @Override // kotlin.jvm.functions.Function1
                    public final Bundle invoke(Object[] objArr) {
                        Map map;
                        Map map2;
                        File file;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        map = FileSystemLegacyModule.this.taskHandlers;
                        FileSystemLegacyModule.TaskHandler taskHandler = (FileSystemLegacyModule.TaskHandler) map.get(str);
                        if (taskHandler == null) {
                            throw new IOException("No download object available");
                        }
                        if (!(taskHandler instanceof FileSystemLegacyModule.DownloadTaskHandler)) {
                            throw new FileSystemCannotFindTaskException();
                        }
                        taskHandler.getCall().cancel();
                        map2 = FileSystemLegacyModule.this.taskHandlers;
                        map2.remove(str);
                        file = FileSystemLegacyModule.this.toFile(((FileSystemLegacyModule.DownloadTaskHandler) taskHandler).getFileUri());
                        Bundle bundle = new Bundle();
                        bundle.putString("resumeData", String.valueOf(file.length()));
                        return bundle;
                    }
                };
                intAsyncFunctionComponent6 = Intrinsics.areEqual(Bundle.class, Integer.TYPE) ? new IntAsyncFunctionComponent("downloadResumablePauseAsync", anyTypeArr21, function114) : Intrinsics.areEqual(Bundle.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("downloadResumablePauseAsync", anyTypeArr21, function114) : Intrinsics.areEqual(Bundle.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("downloadResumablePauseAsync", anyTypeArr21, function114) : Intrinsics.areEqual(Bundle.class, Float.TYPE) ? new FloatAsyncFunctionComponent("downloadResumablePauseAsync", anyTypeArr21, function114) : Intrinsics.areEqual(Bundle.class, String.class) ? new StringAsyncFunctionComponent("downloadResumablePauseAsync", anyTypeArr21, function114) : new UntypedAsyncFunctionComponent("downloadResumablePauseAsync", anyTypeArr21, function114);
            }
            moduleDefinitionBuilder22.getAsyncFunctions().put("downloadResumablePauseAsync", intAsyncFunctionComponent6);
            moduleDefinitionBuilder.getEventListeners().put(EventName.ON_ACTIVITY_RESULT, new EventListenerWithSenderAndPayload(EventName.ON_ACTIVITY_RESULT, new Function2<Activity, OnActivityResultPayload, Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$OnActivityResult$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Activity activity, OnActivityResultPayload onActivityResultPayload) {
                    invoke2(activity, onActivityResultPayload);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Activity sender, OnActivityResultPayload payload) {
                    Promise promise;
                    Promise promise2;
                    Intrinsics.checkNotNullParameter(sender, "sender");
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    int requestCode = payload.getRequestCode();
                    int resultCode = payload.getResultCode();
                    Intent data = payload.getData();
                    if (requestCode == 5394) {
                        promise = FileSystemLegacyModule.this.dirPermissionsRequest;
                        if (promise != null) {
                            Bundle bundle = new Bundle();
                            if (resultCode == -1 && data != null) {
                                Uri data2 = data.getData();
                                int flags = data.getFlags() & 3;
                                if (data2 != null) {
                                    FileSystemLegacyModule.this.getAppContext().getThrowingActivity().getContentResolver().takePersistableUriPermission(data2, flags);
                                }
                                bundle.putBoolean(PermissionsResponse.GRANTED_KEY, true);
                                bundle.putString("directoryUri", String.valueOf(data2));
                            } else {
                                bundle.putBoolean(PermissionsResponse.GRANTED_KEY, false);
                            }
                            promise2 = FileSystemLegacyModule.this.dirPermissionsRequest;
                            if (promise2 != null) {
                                promise2.resolve(bundle);
                            }
                            FileSystemLegacyModule.this.dirPermissionsRequest = null;
                        }
                    }
                }
            }));
            moduleDefinitionBuilder.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$lambda$51$$inlined$OnDestroy$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    String str;
                    CoroutineScope coroutineScope;
                    try {
                        coroutineScope = FileSystemLegacyModule.this.moduleCoroutineScope;
                        CoroutineScopeKt.cancel(coroutineScope, new ModuleDestroyedException(null, 1, null));
                    } catch (IllegalStateException unused) {
                        str = FileSystemLegacyModuleKt.TAG;
                        Log.e(str, "The scope does not have a job in it");
                    }
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    private final void checkIfFileExists(Uri uri) throws IOException {
        File file = toFile(uri);
        if (file.exists()) {
            return;
        }
        throw new IOException("Directory for '" + file.getPath() + "' doesn't exist.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkIfFileDirExists(Uri uri) throws IOException {
        File file = toFile(uri);
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            throw new IOException("Directory for '" + file.getPath() + "' doesn't exist. Please make sure directory '" + file.getParent() + "' exists before calling downloadAsync.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureDirExists(File dir) throws IOException {
        if (dir.isDirectory() || dir.mkdirs()) {
            return;
        }
        throw new IOException("Couldn't create directory '" + dir + "'");
    }

    private final EnumSet<FilePermissionService.Permission> permissionsForPath(String path) {
        if (path == null) {
            return null;
        }
        return getAppContext().getFilePermission().getPathPermissions(getContext(), path);
    }

    private final EnumSet<FilePermissionService.Permission> permissionsForUri(Uri uri) {
        if (isSAFUri(uri)) {
            return permissionsForSAFUri(uri);
        }
        if (!Intrinsics.areEqual(uri.getScheme(), "content") && !Intrinsics.areEqual(uri.getScheme(), UriUtil.LOCAL_ASSET_SCHEME)) {
            return Intrinsics.areEqual(uri.getScheme(), "file") ? permissionsForPath(uri.getPath()) : uri.getScheme() == null ? EnumSet.of(FilePermissionService.Permission.READ) : EnumSet.noneOf(FilePermissionService.Permission.class);
        }
        return EnumSet.of(FilePermissionService.Permission.READ);
    }

    private final EnumSet<FilePermissionService.Permission> permissionsForSAFUri(Uri uri) {
        DocumentFile nearestSAFFile = getNearestSAFFile(uri);
        EnumSet<FilePermissionService.Permission> noneOf = EnumSet.noneOf(FilePermissionService.Permission.class);
        if (nearestSAFFile != null) {
            if (nearestSAFFile.canRead()) {
                noneOf.add(FilePermissionService.Permission.READ);
            }
            if (nearestSAFFile.canWrite()) {
                noneOf.add(FilePermissionService.Permission.WRITE);
            }
        }
        Intrinsics.checkNotNullExpressionValue(noneOf, "apply(...)");
        return noneOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensurePermission(Uri uri, FilePermissionService.Permission permission, String errorMsg) throws IOException {
        EnumSet<FilePermissionService.Permission> permissionsForUri = permissionsForUri(uri);
        if (permissionsForUri == null || !permissionsForUri.contains(permission)) {
            throw new IOException(errorMsg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensurePermission(Uri uri, FilePermissionService.Permission permission) throws IOException {
        if (permission == FilePermissionService.Permission.READ) {
            ensurePermission(uri, permission, "Location '" + uri + "' isn't readable.");
        }
        if (permission == FilePermissionService.Permission.WRITE) {
            ensurePermission(uri, permission, "Location '" + uri + "' isn't writable.");
        }
        ensurePermission(uri, permission, "Location '" + uri + "' doesn't have permission '" + permission.name() + "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream openAssetInputStream(Uri uri) throws IOException {
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String substring = path.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        InputStream open = getContext().getAssets().open(substring);
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        return open;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream openResourceInputStream(String resourceName) throws IOException {
        int identifier = getContext().getResources().getIdentifier(resourceName, "raw", getContext().getPackageName());
        if (identifier == 0 && (identifier = getContext().getResources().getIdentifier(resourceName, "drawable", getContext().getPackageName())) == 0) {
            throw new FileNotFoundException("No resource found with the name '" + resourceName + "'");
        }
        InputStream openRawResource = getContext().getResources().openRawResource(identifier);
        Intrinsics.checkNotNullExpressionValue(openRawResource, "openRawResource(...)");
        return openRawResource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void transformFilesFromSAF(DocumentFile documentFile, File outputDir, boolean copy) throws IOException {
        File file;
        if (!documentFile.exists()) {
            return;
        }
        if (!outputDir.isDirectory()) {
            File parentFile = outputDir.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Couldn't create folder in output dir.");
            }
        } else if (!outputDir.exists() && !outputDir.mkdirs()) {
            throw new IOException("Couldn't create folder in output dir.");
        }
        if (documentFile.isDirectory()) {
            for (DocumentFile documentFile2 : documentFile.listFiles()) {
                Intrinsics.checkNotNull(documentFile2);
                transformFilesFromSAF(documentFile2, outputDir, copy);
            }
            if (copy) {
                return;
            }
            documentFile.delete();
            return;
        }
        String name = documentFile.getName();
        if (name == null) {
            return;
        }
        if (outputDir.isDirectory()) {
            file = new File(outputDir.getPath(), name);
        } else {
            file = new File(outputDir.getPath());
        }
        FileOutputStream openInputStream = getContext().getContentResolver().openInputStream(documentFile.getUri());
        try {
            InputStream inputStream = openInputStream;
            openInputStream = new FileOutputStream(file);
            try {
                IOUtils.copy(inputStream, openInputStream);
                CloseableKt.closeFinally(openInputStream, null);
                CloseableKt.closeFinally(openInputStream, null);
                if (copy) {
                    return;
                }
                documentFile.delete();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri contentUriFromFile(File file) {
        Uri uriForFile = FileProvider.getUriForFile(getAppContext().getThrowingActivity().getApplication(), getAppContext().getThrowingActivity().getApplication().getPackageName() + ".FileSystemFileProvider", file);
        Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Request createUploadRequest(String url, String fileUriString, FileSystemUploadOptions options, RequestBodyDecorator decorator) throws IOException {
        Uri parse = Uri.parse(FileSystemLegacyModuleKt.slashifyFilePath(fileUriString));
        Intrinsics.checkNotNull(parse);
        ensurePermission(parse, FilePermissionService.Permission.READ);
        checkIfFileExists(parse);
        Request.Builder url2 = new Request.Builder().url(url);
        Map<String, String> headers = options.getHeaders();
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                url2.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return url2.method(options.getHttpMethod().getValue(), createRequestBody(options, decorator, toFile(parse))).build();
    }

    private final RequestBody createRequestBody(FileSystemUploadOptions options, RequestBodyDecorator decorator, File file) {
        int i = WhenMappings.$EnumSwitchMapping$0[options.getUploadType().ordinal()];
        if (i == 1) {
            return decorator.decorate(RequestBody.INSTANCE.create(file, (MediaType) null));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        MultipartBody.Builder type = new MultipartBody.Builder(null, 1, null).setType(MultipartBody.FORM);
        Map<String, String> parameters = options.getParameters();
        if (parameters != null) {
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                type.addFormDataPart(entry.getKey(), entry.getValue().toString());
            }
        }
        String mimeType = options.getMimeType();
        if (mimeType == null) {
            mimeType = URLConnection.guessContentTypeFromName(file.getName());
            Intrinsics.checkNotNullExpressionValue(mimeType, "guessContentTypeFromName(...)");
        }
        String fieldName = options.getFieldName();
        if (fieldName == null) {
            fieldName = file.getName();
        }
        Intrinsics.checkNotNull(fieldName);
        type.addFormDataPart(fieldName, file.getName(), decorator.decorate(RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse(mimeType))));
        return type.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileSystemLegacyModule.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$DownloadResumableTaskParams;", "", "options", "Lexpo/modules/filesystem/legacy/DownloadOptionsLegacy;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "file", "Ljava/io/File;", "isResume", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/Promise;", "<init>", "(Lexpo/modules/filesystem/legacy/DownloadOptionsLegacy;Lokhttp3/Call;Ljava/io/File;ZLexpo/modules/kotlin/Promise;)V", "getOptions", "()Lexpo/modules/filesystem/legacy/DownloadOptionsLegacy;", "getCall", "()Lokhttp3/Call;", "getFile", "()Ljava/io/File;", "()Z", "getPromise", "()Lexpo/modules/kotlin/Promise;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class DownloadResumableTaskParams {
        private final Call call;
        private final File file;
        private final boolean isResume;
        private final DownloadOptionsLegacy options;
        private final Promise promise;

        public static /* synthetic */ DownloadResumableTaskParams copy$default(DownloadResumableTaskParams downloadResumableTaskParams, DownloadOptionsLegacy downloadOptionsLegacy, Call call, File file, boolean z, Promise promise, int i, Object obj) {
            if ((i & 1) != 0) {
                downloadOptionsLegacy = downloadResumableTaskParams.options;
            }
            if ((i & 2) != 0) {
                call = downloadResumableTaskParams.call;
            }
            if ((i & 4) != 0) {
                file = downloadResumableTaskParams.file;
            }
            if ((i & 8) != 0) {
                z = downloadResumableTaskParams.isResume;
            }
            if ((i & 16) != 0) {
                promise = downloadResumableTaskParams.promise;
            }
            Promise promise2 = promise;
            File file2 = file;
            return downloadResumableTaskParams.copy(downloadOptionsLegacy, call, file2, z, promise2);
        }

        /* renamed from: component1, reason: from getter */
        public final DownloadOptionsLegacy getOptions() {
            return this.options;
        }

        /* renamed from: component2, reason: from getter */
        public final Call getCall() {
            return this.call;
        }

        /* renamed from: component3, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsResume() {
            return this.isResume;
        }

        /* renamed from: component5, reason: from getter */
        public final Promise getPromise() {
            return this.promise;
        }

        public final DownloadResumableTaskParams copy(DownloadOptionsLegacy options, Call call, File file, boolean isResume, Promise promise) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(promise, "promise");
            return new DownloadResumableTaskParams(options, call, file, isResume, promise);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadResumableTaskParams)) {
                return false;
            }
            DownloadResumableTaskParams downloadResumableTaskParams = (DownloadResumableTaskParams) other;
            return Intrinsics.areEqual(this.options, downloadResumableTaskParams.options) && Intrinsics.areEqual(this.call, downloadResumableTaskParams.call) && Intrinsics.areEqual(this.file, downloadResumableTaskParams.file) && this.isResume == downloadResumableTaskParams.isResume && Intrinsics.areEqual(this.promise, downloadResumableTaskParams.promise);
        }

        public int hashCode() {
            return (((((((this.options.hashCode() * 31) + this.call.hashCode()) * 31) + this.file.hashCode()) * 31) + Boolean.hashCode(this.isResume)) * 31) + this.promise.hashCode();
        }

        public String toString() {
            return "DownloadResumableTaskParams(options=" + this.options + ", call=" + this.call + ", file=" + this.file + ", isResume=" + this.isResume + ", promise=" + this.promise + ")";
        }

        public DownloadResumableTaskParams(DownloadOptionsLegacy options, Call call, File file, boolean z, Promise promise) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(promise, "promise");
            this.options = options;
            this.call = call;
            this.file = file;
            this.isResume = z;
            this.promise = promise;
        }

        public final DownloadOptionsLegacy getOptions() {
            return this.options;
        }

        public final Call getCall() {
            return this.call;
        }

        public final File getFile() {
            return this.file;
        }

        public final boolean isResume() {
            return this.isResume;
        }

        public final Promise getPromise() {
            return this.promise;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadResumableTask(DownloadResumableTaskParams downloadResumableTaskParams, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new FileSystemLegacyModule$downloadResumableTask$2(downloadResumableTaskParams, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileSystemLegacyModule.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$TaskHandler;", "", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "<init>", "(Lokhttp3/Call;)V", "getCall", "()Lokhttp3/Call;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static class TaskHandler {
        private final Call call;

        public TaskHandler(Call call) {
            Intrinsics.checkNotNullParameter(call, "call");
            this.call = call;
        }

        public final Call getCall() {
            return this.call;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileSystemLegacyModule.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$DownloadTaskHandler;", "Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$TaskHandler;", "fileUri", "Landroid/net/Uri;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "<init>", "(Landroid/net/Uri;Lokhttp3/Call;)V", "getFileUri", "()Landroid/net/Uri;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class DownloadTaskHandler extends TaskHandler {
        private final Uri fileUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadTaskHandler(Uri fileUri, Call call) {
            super(call);
            Intrinsics.checkNotNullParameter(fileUri, "fileUri");
            Intrinsics.checkNotNullParameter(call, "call");
            this.fileUri = fileUri;
        }

        public final Uri getFileUri() {
            return this.fileUri;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileSystemLegacyModule.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressResponseBody;", "Lokhttp3/ResponseBody;", "responseBody", "progressListener", "Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;", "<init>", "(Lokhttp3/ResponseBody;Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;)V", "bufferedSource", "Lokio/BufferedSource;", "contentType", "Lokhttp3/MediaType;", "contentLength", "", "source", "Lokio/Source;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class ProgressResponseBody extends ResponseBody {
        private BufferedSource bufferedSource;
        private final ProgressListener progressListener;
        private final ResponseBody responseBody;

        public ProgressResponseBody(ResponseBody responseBody, ProgressListener progressListener) {
            Intrinsics.checkNotNullParameter(progressListener, "progressListener");
            this.responseBody = responseBody;
            this.progressListener = progressListener;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public MediaType get$contentType() {
            ResponseBody responseBody = this.responseBody;
            if (responseBody != null) {
                return responseBody.get$contentType();
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            ResponseBody responseBody = this.responseBody;
            if (responseBody != null) {
                return responseBody.getContentLength();
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public BufferedSource getSource() {
            BufferedSource bufferedSource = this.bufferedSource;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            ResponseBody responseBody = this.responseBody;
            Intrinsics.checkNotNull(responseBody);
            return Okio.buffer(source(responseBody.getSource()));
        }

        private final Source source(final Source source) {
            return new ForwardingSource(source) { // from class: expo.modules.filesystem.legacy.FileSystemLegacyModule$ProgressResponseBody$source$1
                private long totalBytesRead;

                public final long getTotalBytesRead() {
                    return this.totalBytesRead;
                }

                public final void setTotalBytesRead(long j) {
                    this.totalBytesRead = j;
                }

                @Override // okio.ForwardingSource, okio.Source
                public long read(Buffer sink, long byteCount) throws IOException {
                    FileSystemLegacyModule.ProgressListener progressListener;
                    ResponseBody responseBody;
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    long read = super.read(sink, byteCount);
                    this.totalBytesRead += read != -1 ? read : 0L;
                    progressListener = this.progressListener;
                    long j = this.totalBytesRead;
                    responseBody = this.responseBody;
                    progressListener.update(j, responseBody != null ? responseBody.getContentLength() : -1L, read == -1);
                    return read;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized OkHttpClient getOkHttpClient() {
        if (this.client == null) {
            this.client = new OkHttpClient.Builder().connectTimeout(60L, TimeUnit.SECONDS).readTimeout(60L, TimeUnit.SECONDS).writeTimeout(60L, TimeUnit.SECONDS).build();
        }
        return this.client;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String md5(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            char[] encodeHex = Hex.encodeHex(DigestUtils.md5(fileInputStream));
            Intrinsics.checkNotNullExpressionValue(encodeHex, "encodeHex(...)");
            String str = new String(encodeHex);
            CloseableKt.closeFinally(fileInputStream, null);
            return str;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forceDelete(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("Failed to list contents of " + file);
            }
            IOException e = null;
            for (File file2 : listFiles) {
                try {
                    Intrinsics.checkNotNull(file2);
                    forceDelete(file2);
                } catch (IOException e2) {
                    e = e2;
                }
            }
            if (e != null) {
                throw e;
            }
            if (file.delete()) {
                return;
            }
            throw new IOException("Unable to delete directory " + file + ".");
        }
        if (file.delete()) {
            return;
        }
        throw new IOException("Unable to delete file: " + file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getFileSize(File file) {
        Object obj;
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0L;
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file2 : listFiles) {
            Intrinsics.checkNotNull(file2);
            arrayList.add(Long.valueOf(getFileSize(file2)));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() + ((Number) it.next()).longValue());
            }
            obj = next;
        } else {
            obj = null;
        }
        Long l = (Long) obj;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream getInputStream(Uri uri) throws IOException {
        if (Intrinsics.areEqual(uri.getScheme(), "file")) {
            return new FileInputStream(toFile(uri));
        }
        if (Intrinsics.areEqual(uri.getScheme(), UriUtil.LOCAL_ASSET_SCHEME)) {
            return openAssetInputStream(uri);
        }
        if (isSAFUri(uri)) {
            InputStream openInputStream = getContext().getContentResolver().openInputStream(uri);
            Intrinsics.checkNotNull(openInputStream);
            return openInputStream;
        }
        throw new IOException("Unsupported scheme for location '" + uri + "'.");
    }

    static /* synthetic */ OutputStream getOutputStream$default(FileSystemLegacyModule fileSystemLegacyModule, Uri uri, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOutputStream");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystemLegacyModule.getOutputStream(uri, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OutputStream getOutputStream(Uri uri, boolean append) throws IOException {
        if (Intrinsics.areEqual(uri.getScheme(), "file")) {
            return new FileOutputStream(toFile(uri), append);
        }
        if (isSAFUri(uri)) {
            OutputStream openOutputStream = getContext().getContentResolver().openOutputStream(uri, append ? "wa" : "w");
            Intrinsics.checkNotNull(openOutputStream);
            return openOutputStream;
        }
        throw new IOException("Unsupported scheme for location '" + uri + "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocumentFile getNearestSAFFile(Uri uri) {
        DocumentFile fromSingleUri = DocumentFile.fromSingleUri(getContext(), uri);
        return (fromSingleUri == null || !fromSingleUri.isFile()) ? DocumentFile.fromTreeUri(getContext(), uri) : fromSingleUri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File toFile(Uri uri) {
        if (uri.getPath() != null) {
            String path = uri.getPath();
            Intrinsics.checkNotNull(path);
            return new File(path);
        }
        throw new IOException("Invalid Uri: " + uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSAFUri(Uri uri) {
        if (Intrinsics.areEqual(uri.getScheme(), "content")) {
            String host = uri.getHost();
            if (host != null ? StringsKt.startsWith$default(host, "com.android.externalstorage", false, 2, (Object) null) : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String parseFileUri(String uriStr) {
        String substring = uriStr.substring(StringsKt.indexOf$default((CharSequence) uriStr, AbstractJsonLexerKt.COLON, 0, false, 6, (Object) null) + 3);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getInputStreamBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle translateHeaders(Headers headers) {
        Bundle bundle = new Bundle();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            if (bundle.containsKey(name)) {
                bundle.putString(name, bundle.getString(name) + ", " + headers.value(i));
            } else {
                bundle.putString(name, headers.value(i));
            }
        }
        return bundle;
    }
}
