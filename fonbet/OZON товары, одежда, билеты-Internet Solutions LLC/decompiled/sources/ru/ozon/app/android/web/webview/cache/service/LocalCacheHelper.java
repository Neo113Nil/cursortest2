package ru.ozon.app.android.web.webview.cache.service;

import U7.d;
import android.content.Context;
import android.net.Uri;
import bd.h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\nJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0016\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cacheDir", "Ljava/io/File;", "getLocalCachedResourcesList", "", "", "removeLocalResource", "", "relativeResourceCachePath", "getRelativePathFromResourceUrl", "resourceUrl", "getAbsoluteTempFileFromResourceUrl", "getAbsoluteFileFromTempFile", "tempFile", "getAbsoluteFileFromRelativeCachePath", "relativeResourcePath", "getDirectoryFiles", "dir", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocalCacheHelper {

    @NotNull
    private final File cacheDir;

    public LocalCacheHelper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.cacheDir = new File(context.getNoBackupFilesDir().getAbsolutePath(), "WebViewCache");
    }

    private final List<String> getDirectoryFiles(File dir) {
        List<String> a02;
        File[] listFiles = dir.listFiles();
        if (listFiles == null) {
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            if (file.isDirectory()) {
                a02 = getDirectoryFiles(file);
                if (a02.isEmpty()) {
                    file.delete();
                }
            } else {
                a02 = C7714v.a0(h.f(file, this.cacheDir).getPath());
            }
            C7714v.p(a02, arrayList);
        }
        return arrayList;
    }

    @NotNull
    public final File getAbsoluteFileFromRelativeCachePath(@NotNull String relativeResourcePath) {
        Intrinsics.checkNotNullParameter(relativeResourcePath, "relativeResourcePath");
        return new File(this.cacheDir, relativeResourcePath);
    }

    @NotNull
    public final File getAbsoluteFileFromTempFile(@NotNull File tempFile) {
        Intrinsics.checkNotNullParameter(tempFile, "tempFile");
        String absolutePath = tempFile.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return new File(kotlin.text.h.U(absolutePath, ".download"));
    }

    @NotNull
    public final File getAbsoluteTempFileFromResourceUrl(@NotNull String resourceUrl) {
        Intrinsics.checkNotNullParameter(resourceUrl, "resourceUrl");
        return new File(this.cacheDir, d.e(getRelativePathFromResourceUrl(resourceUrl), ".download"));
    }

    @NotNull
    public final List<String> getLocalCachedResourcesList() {
        return getDirectoryFiles(this.cacheDir);
    }

    @NotNull
    public final String getRelativePathFromResourceUrl(@NotNull String resourceUrl) {
        Intrinsics.checkNotNullParameter(resourceUrl, "resourceUrl");
        String path = Uri.parse(resourceUrl).getPath();
        return String.valueOf(path != null ? kotlin.text.h.S(path, "/") : null);
    }

    public final void removeLocalResource(@NotNull String relativeResourceCachePath) {
        Intrinsics.checkNotNullParameter(relativeResourceCachePath, "relativeResourceCachePath");
        File absoluteFileFromRelativeCachePath = getAbsoluteFileFromRelativeCachePath(relativeResourceCachePath);
        absoluteFileFromRelativeCachePath.delete();
        File parentFile = absoluteFileFromRelativeCachePath.getParentFile();
        String[] list = parentFile.list();
        if (list == null || list.length == 0) {
            parentFile.delete();
        }
    }
}
