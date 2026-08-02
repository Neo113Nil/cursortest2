package ru.ozon.app.android.pikazon.glide.targets;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m6.AbstractC8090c;
import m6.h;
import n6.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Resource", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "Lm6/h;", "createCustomTarget", "(Lru/ozon/app/android/pikazon/image/ImageSize;)Lm6/h;", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TargetCreatorKt {
    @NotNull
    public static final <Resource> h<Resource> createCustomTarget(ImageSize imageSize) {
        final int i11 = LinearLayoutManager.INVALID_OFFSET;
        final int width = imageSize != null ? imageSize.getWidth() : Integer.MIN_VALUE;
        if (imageSize != null) {
            i11 = imageSize.getHeight();
        }
        return new AbstractC8090c<Resource>(width, i11) { // from class: ru.ozon.app.android.pikazon.glide.targets.TargetCreatorKt$createCustomTarget$4
            @Override // m6.h
            public void onLoadCleared(Drawable placeholder) {
            }

            @Override // m6.h
            public void onResourceReady(Resource resource, c<? super Resource> transition) {
                Intrinsics.checkNotNullParameter(resource, "resource");
            }
        };
    }
}
