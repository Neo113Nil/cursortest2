package ru.ozon.app.android.pikazon.extensions.internal;

import com.bumptech.glide.m;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrl;
import ru.ozon.app.android.pikazon.glide.thumbnail.Thumb;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Source", "Resource", "Lcom/bumptech/glide/m;", "source", "withThumbnail", "(Lcom/bumptech/glide/m;Ljava/lang/Object;)Lcom/bumptech/glide/m;", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThumbnailExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <Source, Resource> m<Resource> withThumbnail(@NotNull m<Resource> mVar, @NotNull Source source) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof PikazonUrl) {
            PikazonUrl pikazonUrl = (PikazonUrl) source;
            Thumb thumb = (Thumb) C7714v.L(Pikazon.INSTANCE.getInstance().getThumbCache().get(pikazonUrl.getUrl()));
            if (thumb != null) {
                m<Resource> thumbnail = mVar.thumbnail(mVar.mo17clone().onlyRetrieveFromCache(true).load(Thumb.copy$lib_release$default(thumb, null, pikazonUrl.getUuid(), 0, 0, false, null, 61, null)));
                Intrinsics.checkNotNullExpressionValue(thumbnail, "thumbnail(...)");
                return thumbnail;
            }
        }
        return mVar;
    }
}
