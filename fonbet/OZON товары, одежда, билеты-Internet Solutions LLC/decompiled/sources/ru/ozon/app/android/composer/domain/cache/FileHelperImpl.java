package ru.ozon.app.android.composer.domain.cache;

import android.content.Context;
import bd.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.utils.FileExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/composer/domain/cache/FileHelperImpl;", "Lru/ozon/app/android/composer/domain/cache/FileHelper;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "filesDir", "Ljava/io/File;", "getFilesDir", "()Ljava/io/File;", "createDir", "path", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "findDirectory", "parentPath", "predicate", "Lkotlin/Function1;", "", "clear", "", "dir", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FileHelperImpl implements FileHelper {

    @NotNull
    private final Context context;

    public FileHelperImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // ru.ozon.app.android.composer.domain.cache.FileHelper
    public void clear(@NotNull File dir, @NotNull Function1<? super File, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        File[] listFiles = new File(dir.getPath()).listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            Intrinsics.f(file);
            if (predicate.invoke(file).booleanValue()) {
                h.h(file);
            }
        }
    }

    @Override // ru.ozon.app.android.composer.domain.cache.FileHelper
    @NotNull
    public File createDir(@NotNull String path, @NotNull String name) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(name, "name");
        return FileExtKt.createDirectory(new File(path, name), true);
    }

    @Override // ru.ozon.app.android.composer.domain.cache.FileHelper
    public File findDirectory(@NotNull String parentPath, @NotNull Function1<? super File, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(parentPath, "parentPath");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        File[] listFiles = new File(parentPath).listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file : listFiles) {
            if (file.isDirectory() && predicate.invoke(file).booleanValue()) {
                return file;
            }
        }
        return null;
    }

    @Override // ru.ozon.app.android.composer.domain.cache.FileHelper
    @NotNull
    public File getFilesDir() {
        File filesDir = this.context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        return filesDir;
    }
}
