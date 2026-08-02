package ru.ozon.uni.android.util;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/util/FontSizeUtils;", "", "<init>", "()V", "Landroid/content/res/Resources;", "resources", "", "isFontScalingIncreased$uni_release", "(Landroid/content/res/Resources;)Z", "isFontScalingIncreased", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FontSizeUtils {

    @NotNull
    public static final FontSizeUtils INSTANCE = new FontSizeUtils();

    private FontSizeUtils() {
    }

    public final boolean isFontScalingIncreased$uni_release(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return resources.getConfiguration().fontScale > 1.0f;
    }
}
