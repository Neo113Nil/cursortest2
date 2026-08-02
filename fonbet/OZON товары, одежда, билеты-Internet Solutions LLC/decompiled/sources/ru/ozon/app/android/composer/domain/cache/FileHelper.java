package ru.ozon.app.android.composer.domain.cache;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J&\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH&J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/composer/domain/cache/FileHelper;", "", "filesDir", "Ljava/io/File;", "getFilesDir", "()Ljava/io/File;", "createDir", "path", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "findDirectory", "parentPath", "predicate", "Lkotlin/Function1;", "", "clear", "", "dir", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FileHelper {
    void clear(@NotNull File dir, @NotNull Function1<? super File, Boolean> predicate);

    @NotNull
    File createDir(@NotNull String path, @NotNull String name);

    File findDirectory(@NotNull String parentPath, @NotNull Function1<? super File, Boolean> predicate);

    @NotNull
    File getFilesDir();
}
