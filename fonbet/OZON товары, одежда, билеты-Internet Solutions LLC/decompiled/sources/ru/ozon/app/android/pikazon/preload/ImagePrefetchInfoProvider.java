package ru.ozon.app.android.pikazon.preload;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "T", "", "getSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "item", "context", "Landroid/content/Context;", "(Ljava/lang/Object;Landroid/content/Context;)Lru/ozon/app/android/pikazon/image/ImageSize;", "getUrl", "", "(Ljava/lang/Object;)Ljava/lang/String;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ImagePrefetchInfoProvider<T> {
    ImageSize getSize(T item, @NotNull Context context);

    String getUrl(T item);
}
