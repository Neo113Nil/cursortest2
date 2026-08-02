package com.braze.support;

import android.content.Context;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.io.files.FileSystemKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0007J$\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/braze/support/WebContentUtils;", "", "()V", "FILE_URI_SCHEME_PREFIX", "", "HTML_INAPP_MESSAGES_FOLDER", "ZIP_EXTENSION", "getHtmlInAppMessageAssetCacheDirectory", "Ljava/io/File;", "context", "Landroid/content/Context;", "getLocalHtmlUrlFromRemoteUrl", "localDirectory", "remoteZipUrl", "replacePrefetchedUrlsWithLocalAssets", "originalString", "remoteToLocalAssetMap", "", "unpackZipIntoDirectory", "", "unpackDirectory", "zipFile", "validateChildFileExistsUnderParent", "intendedParentDirectory", "childFilePath", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebContentUtils {
    private static final String FILE_URI_SCHEME_PREFIX = "file://";
    public static final String HTML_INAPP_MESSAGES_FOLDER = "braze-html-inapp-messages";
    public static final WebContentUtils INSTANCE = new WebContentUtils();
    private static final String ZIP_EXTENSION = ".zip";

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Remote zip url is empty. No local URL will be created.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Starting download of url: " + this.b + " to " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not download zip file to local storage. ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Html content zip downloaded. " + this.b + " to " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        public static final e b = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error during the zip unpack.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Html content zip unpacked to to " + this.b + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ Ref.ObjectRef<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Cannot find local asset file at path: ", this.b.element);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ Ref.ObjectRef<String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, Ref.ObjectRef<String> objectRef) {
            super(0);
            this.b = str;
            this.c = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Replacing remote url \"" + this.b + "\" with local uri \"" + this.c.element + '\"';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        public static final i b = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unpack directory is blank. Zip file not unpacked.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ Ref.ObjectRef<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Error creating parent directory ", this.b.element);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        final /* synthetic */ Ref.ObjectRef<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Error unpacking zipEntry ", this.b.element);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        final /* synthetic */ File b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(File file, String str) {
            super(0);
            this.b = file;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error during unpack of zip file " + ((Object) this.b.getAbsolutePath()) + " to " + this.c + '.';
        }
    }

    private WebContentUtils() {
    }

    @JvmStatic
    public static final File getHtmlInAppMessageAssetCacheDirectory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new File(((Object) context.getCacheDir().getPath()) + "/braze-html-inapp-messages");
    }

    @JvmStatic
    public static final String getLocalHtmlUrlFromRemoteUrl(File localDirectory, String remoteZipUrl) {
        Intrinsics.checkNotNullParameter(localDirectory, "localDirectory");
        Intrinsics.checkNotNullParameter(remoteZipUrl, "remoteZipUrl");
        if (StringsKt.isBlank(remoteZipUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
            return null;
        }
        String absolutePath = localDirectory.getAbsolutePath();
        String valueOf = String.valueOf(IntentUtils.getRequestCode());
        String str = ((Object) absolutePath) + FileSystemKt.UnixPathSeparator + valueOf;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        WebContentUtils webContentUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new b(remoteZipUrl, str), 3, (Object) null);
        try {
            File component1 = BrazeFileUtils.downloadFileToPath(str, remoteZipUrl, valueOf, ZIP_EXTENSION).component1();
            BrazeLogger.brazelog$default(brazeLogger, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new d(remoteZipUrl, str), 3, (Object) null);
            if (unpackZipIntoDirectory(str, component1)) {
                BrazeLogger.brazelog$default(brazeLogger, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new f(str), 3, (Object) null);
                return str;
            }
            BrazeLogger.brazelog$default(brazeLogger, webContentUtils, BrazeLogger.Priority.W, (Throwable) null, e.b, 2, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e2, new c(remoteZipUrl));
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @JvmStatic
    public static final String replacePrefetchedUrlsWithLocalAssets(String originalString, Map<String, String> remoteToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(originalString, "originalString");
        Intrinsics.checkNotNullParameter(remoteToLocalAssetMap, "remoteToLocalAssetMap");
        String str = originalString;
        for (Map.Entry<String, String> entry : remoteToLocalAssetMap.entrySet()) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = entry.getValue();
            if (new File((String) objectRef.element).exists()) {
                String str2 = (String) objectRef.element;
                WebContentUtils webContentUtils = INSTANCE;
                objectRef.element = StringsKt.startsWith$default(str2, "file://", false, 2, (Object) null) ? (String) objectRef.element : Intrinsics.stringPlus("file://", objectRef.element);
                String key = entry.getKey();
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) key, false, 2, (Object) null)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new h(key, objectRef), 3, (Object) null);
                    str = StringsKt.replace$default(str, key, (String) objectRef.element, false, 4, (Object) null);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new g(objectRef), 2, (Object) null);
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object, java.lang.String] */
    @JvmStatic
    public static final boolean unpackZipIntoDirectory(String unpackDirectory, File zipFile) {
        Intrinsics.checkNotNullParameter(unpackDirectory, "unpackDirectory");
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        if (StringsKt.isBlank(unpackDirectory)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, i.b, 2, (Object) null);
            return false;
        }
        new File(unpackDirectory).mkdirs();
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    ?? name = nextEntry.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "zipEntry.name");
                    objectRef.element = name;
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = name.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (!StringsKt.startsWith$default(lowerCase, "__macosx", false, 2, (Object) null)) {
                        try {
                            String validateChildFileExistsUnderParent = validateChildFileExistsUnderParent(unpackDirectory, unpackDirectory + FileSystemKt.UnixPathSeparator + ((String) objectRef.element));
                            if (nextEntry.isDirectory()) {
                                new File(validateChildFileExistsUnderParent).mkdirs();
                            } else {
                                try {
                                    File parentFile = new File(validateChildFileExistsUnderParent).getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                    }
                                } catch (Exception e2) {
                                    BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e2, new j(objectRef));
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(validateChildFileExistsUnderParent));
                                try {
                                    ByteStreamsKt.copyTo$default(zipInputStream, bufferedOutputStream, 0, 2, null);
                                    CloseableKt.closeFinally(bufferedOutputStream, null);
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        CloseableKt.closeFinally(bufferedOutputStream, th);
                                        throw th2;
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e3, new k(objectRef));
                        }
                    }
                    zipInputStream.closeEntry();
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(zipInputStream, null);
                return true;
            } finally {
            }
        } catch (Throwable th3) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, th3, new l(zipFile, unpackDirectory));
            return false;
        }
    }

    @JvmStatic
    public static final String validateChildFileExistsUnderParent(String intendedParentDirectory, String childFilePath) {
        Intrinsics.checkNotNullParameter(intendedParentDirectory, "intendedParentDirectory");
        Intrinsics.checkNotNullParameter(childFilePath, "childFilePath");
        String parentCanonicalPath = new File(intendedParentDirectory).getCanonicalPath();
        String childFileCanonicalPath = new File(childFilePath).getCanonicalPath();
        Intrinsics.checkNotNullExpressionValue(childFileCanonicalPath, "childFileCanonicalPath");
        Intrinsics.checkNotNullExpressionValue(parentCanonicalPath, "parentCanonicalPath");
        if (StringsKt.startsWith$default(childFileCanonicalPath, parentCanonicalPath, false, 2, (Object) null)) {
            return childFileCanonicalPath;
        }
        throw new IllegalStateException("Invalid file with original path: " + childFilePath + " with canonical path: " + ((Object) childFileCanonicalPath) + " does not exist under intended parent with  path: " + intendedParentDirectory + " and canonical path: " + ((Object) parentCanonicalPath));
    }
}
