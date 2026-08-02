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
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J$\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/braze/support/WebContentUtils;", "", "<init>", "()V", "ZIP_EXTENSION", "", "ASSET_LOADER_DUMMY_DOMAIN", "HTML_INAPP_MESSAGES_FOLDER", "getLocalHtmlUrlFromRemoteUrl", "localDirectory", "Ljava/io/File;", "remoteZipUrl", "unpackZipIntoDirectory", "", "unpackDirectory", "zipFile", "getHtmlInAppMessageAssetCacheDirectory", "context", "Landroid/content/Context;", "replacePrefetchedUrlsWithLocalAssets", "originalString", "remoteToLocalAssetMap", "", "validateChildFileExistsUnderParent", "intendedParentDirectory", "childFilePath", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebContentUtils {
    public static final String ASSET_LOADER_DUMMY_DOMAIN = "iamcache.braze";
    public static final String HTML_INAPP_MESSAGES_FOLDER = "braze-html-inapp-messages";
    public static final WebContentUtils INSTANCE = new WebContentUtils();
    private static final String ZIP_EXTENSION = ".zip";

    private WebContentUtils() {
    }

    @JvmStatic
    public static final File getHtmlInAppMessageAssetCacheDirectory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new File(context.getCacheDir().getPath() + "/braze-html-inapp-messages");
    }

    @JvmStatic
    public static final String getLocalHtmlUrlFromRemoteUrl(File localDirectory, final String remoteZipUrl) {
        Intrinsics.checkNotNullParameter(localDirectory, "localDirectory");
        Intrinsics.checkNotNullParameter(remoteZipUrl, "remoteZipUrl");
        if (StringsKt.isBlank(remoteZipUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.WebContentUtils$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localHtmlUrlFromRemoteUrl$lambda$0;
                    localHtmlUrlFromRemoteUrl$lambda$0 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$0();
                    return localHtmlUrlFromRemoteUrl$lambda$0;
                }
            }, 6, (Object) null);
            return null;
        }
        String absolutePath = localDirectory.getAbsolutePath();
        String valueOf = String.valueOf(IntentUtils.getRequestCode());
        final String str = absolutePath + "/" + valueOf;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        WebContentUtils webContentUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.WebContentUtils$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String localHtmlUrlFromRemoteUrl$lambda$1;
                localHtmlUrlFromRemoteUrl$lambda$1 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$1(remoteZipUrl, str);
                return localHtmlUrlFromRemoteUrl$lambda$1;
            }
        }, 7, (Object) null);
        try {
            File component1 = BrazeFileUtils.downloadFileToPath(str, remoteZipUrl, valueOf, ZIP_EXTENSION).component1();
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.WebContentUtils$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localHtmlUrlFromRemoteUrl$lambda$3;
                    localHtmlUrlFromRemoteUrl$lambda$3 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$3(remoteZipUrl, str);
                    return localHtmlUrlFromRemoteUrl$lambda$3;
                }
            }, 7, (Object) null);
            if (unpackZipIntoDirectory(str, component1)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.WebContentUtils$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String localHtmlUrlFromRemoteUrl$lambda$5;
                        localHtmlUrlFromRemoteUrl$lambda$5 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$5(str);
                        return localHtmlUrlFromRemoteUrl$lambda$5;
                    }
                }, 7, (Object) null);
                return str;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.WebContentUtils$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localHtmlUrlFromRemoteUrl$lambda$4;
                    localHtmlUrlFromRemoteUrl$lambda$4 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$4();
                    return localHtmlUrlFromRemoteUrl$lambda$4;
                }
            }, 6, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.support.WebContentUtils$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localHtmlUrlFromRemoteUrl$lambda$2;
                    localHtmlUrlFromRemoteUrl$lambda$2 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$2(remoteZipUrl);
                    return localHtmlUrlFromRemoteUrl$lambda$2;
                }
            }, 4, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$0() {
        return "Remote zip url is empty. No local URL will be created.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$1(String str, String str2) {
        return "Starting download of url: " + str + " to " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$2(String str) {
        return "Could not download zip file to local storage. " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$3(String str, String str2) {
        return "Html content zip downloaded. " + str + " to " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$4() {
        return "Error during the zip unpack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$5(String str) {
        return "Html content zip unpacked to to " + str + ".";
    }

    @JvmStatic
    public static final String replacePrefetchedUrlsWithLocalAssets(String originalString, Map<String, String> remoteToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(originalString, "originalString");
        Intrinsics.checkNotNullParameter(remoteToLocalAssetMap, "remoteToLocalAssetMap");
        String str = originalString;
        for (Map.Entry<String, String> entry : remoteToLocalAssetMap.entrySet()) {
            final String value = entry.getValue();
            if (new File(value).exists()) {
                final String key = entry.getKey();
                if (StringsKt.contains$default((CharSequence) value, (CharSequence) Constants.TRIGGERS_ASSETS_FOLDER, false, 2, (Object) null)) {
                    final String str2 = "https://iamcache.braze/ab_triggers" + ((String) StringsKt.split$default((CharSequence) value, new String[]{Constants.TRIGGERS_ASSETS_FOLDER}, false, 0, 6, (Object) null).get(1));
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) key, false, 2, (Object) null)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.support.WebContentUtils$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String replacePrefetchedUrlsWithLocalAssets$lambda$13;
                                replacePrefetchedUrlsWithLocalAssets$lambda$13 = WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$13(key, str2);
                                return replacePrefetchedUrlsWithLocalAssets$lambda$13;
                            }
                        }, 7, (Object) null);
                        str = StringsKt.replace$default(str, key, str2, false, 4, (Object) null);
                    }
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.WebContentUtils$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String replacePrefetchedUrlsWithLocalAssets$lambda$12;
                        replacePrefetchedUrlsWithLocalAssets$lambda$12 = WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$12(value);
                        return replacePrefetchedUrlsWithLocalAssets$lambda$12;
                    }
                }, 6, (Object) null);
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$12(String str) {
        return "Cannot find local asset file at path: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$13(String str, String str2) {
        return "Replacing remote url \"" + str + "\" with local uri \"" + str2 + "\"";
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.String] */
    @JvmStatic
    public static final boolean unpackZipIntoDirectory(final String unpackDirectory, final File zipFile) {
        Intrinsics.checkNotNullParameter(unpackDirectory, "unpackDirectory");
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        if (StringsKt.isBlank(unpackDirectory)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.support.WebContentUtils$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unpackZipIntoDirectory$lambda$6;
                    unpackZipIntoDirectory$lambda$6 = WebContentUtils.unpackZipIntoDirectory$lambda$6();
                    return unpackZipIntoDirectory$lambda$6;
                }
            }, 6, (Object) null);
            return false;
        }
        new File(unpackDirectory).mkdirs();
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    ?? name = nextEntry.getName();
                    objectRef.element = name;
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = name.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (!StringsKt.startsWith$default(lowerCase, "__macosx", false, 2, (Object) null)) {
                        try {
                            String validateChildFileExistsUnderParent = validateChildFileExistsUnderParent(unpackDirectory, unpackDirectory + "/" + objectRef.element);
                            if (nextEntry.isDirectory()) {
                                new File(validateChildFileExistsUnderParent).mkdirs();
                            } else {
                                try {
                                    File parentFile = new File(validateChildFileExistsUnderParent).getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                    }
                                } catch (Exception e) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.support.WebContentUtils$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            String unpackZipIntoDirectory$lambda$10$lambda$7;
                                            unpackZipIntoDirectory$lambda$10$lambda$7 = WebContentUtils.unpackZipIntoDirectory$lambda$10$lambda$7(Ref.ObjectRef.this);
                                            return unpackZipIntoDirectory$lambda$10$lambda$7;
                                        }
                                    }, 4, (Object) null);
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
                        } catch (Exception e2) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.support.WebContentUtils$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String unpackZipIntoDirectory$lambda$10$lambda$9;
                                    unpackZipIntoDirectory$lambda$10$lambda$9 = WebContentUtils.unpackZipIntoDirectory$lambda$10$lambda$9(Ref.ObjectRef.this);
                                    return unpackZipIntoDirectory$lambda$10$lambda$9;
                                }
                            }, 4, (Object) null);
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, th3, false, new Function0() { // from class: com.braze.support.WebContentUtils$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unpackZipIntoDirectory$lambda$11;
                    unpackZipIntoDirectory$lambda$11 = WebContentUtils.unpackZipIntoDirectory$lambda$11(zipFile, unpackDirectory);
                    return unpackZipIntoDirectory$lambda$11;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$10$lambda$7(Ref.ObjectRef objectRef) {
        return "Error creating parent directory " + objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$10$lambda$9(Ref.ObjectRef objectRef) {
        return "Error unpacking zipEntry " + objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$11(File file, String str) {
        return "Error during unpack of zip file " + file.getAbsolutePath() + " to " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$6() {
        return "Unpack directory is blank. Zip file not unpacked.";
    }

    @JvmStatic
    public static final String validateChildFileExistsUnderParent(String intendedParentDirectory, String childFilePath) {
        Intrinsics.checkNotNullParameter(intendedParentDirectory, "intendedParentDirectory");
        Intrinsics.checkNotNullParameter(childFilePath, "childFilePath");
        String canonicalPath = new File(intendedParentDirectory).getCanonicalPath();
        String canonicalPath2 = new File(childFilePath).getCanonicalPath();
        Intrinsics.checkNotNull(canonicalPath2);
        Intrinsics.checkNotNull(canonicalPath);
        if (StringsKt.startsWith$default(canonicalPath2, canonicalPath, false, 2, (Object) null)) {
            return canonicalPath2;
        }
        throw new IllegalStateException("Invalid file with original path: " + childFilePath + " with canonical path: " + canonicalPath2 + " does not exist under intended parent with  path: " + intendedParentDirectory + " and canonical path: " + canonicalPath);
    }
}
