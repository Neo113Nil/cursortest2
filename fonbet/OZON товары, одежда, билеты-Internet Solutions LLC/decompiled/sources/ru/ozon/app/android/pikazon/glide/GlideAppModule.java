package ru.ozon.app.android.pikazon.glide;

import T5.b;
import X5.g;
import X5.i;
import android.content.Context;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.j;
import j6.AbstractC7287a;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrl;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlLoader;
import ru.ozon.app.android.pikazon.glide.loaders.ResizeUrlLoader;
import ru.ozon.app.android.pikazon.glide.memoryCategory.MemoryCategoryExtKt;
import ru.ozon.app.android.pikazon.glide.thumbnail.Thumb;
import ru.ozon.app.android.pikazon.glide.thumbnail.ThumbUrlLoader;
import ru.ozon.app.android.pikazon.logging.error.PikazonErrorLogsProducer;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pikazon/glide/GlideAppModule;", "Lj6/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/bumptech/glide/d;", "builder", "", "applyOptions", "(Landroid/content/Context;Lcom/bumptech/glide/d;)V", "Lcom/bumptech/glide/c;", "glide", "Lcom/bumptech/glide/j;", "registry", "registerComponents", "(Landroid/content/Context;Lcom/bumptech/glide/c;Lcom/bumptech/glide/j;)V", "", "isManifestParsingEnabled", "()Z", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GlideAppModule extends AbstractC7287a {
    @Override // j6.AbstractC7287a
    public void applyOptions(@NotNull Context context, @NotNull d builder) {
        int i11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Pikazon companion = Pikazon.INSTANCE.getInstance();
        float a11 = MemoryCategoryExtKt.toGlideValue(companion.getMemoryCategory()).a();
        i.a aVar = new i.a(context);
        aVar.c(2 * a11);
        i11 = GlideAppModuleKt.DEFAULT_BITMAP_POOL_SCREENS;
        aVar.b(i11 * a11);
        builder.e(aVar.a());
        builder.b(new l6.i().format(b.DEFAULT));
        builder.d(companion.isInMemoryRetainCacheEnabled$lib_release());
        if (companion.getMaxDiskCacheSizeInBytes$lib_release() > 0) {
            builder.c(new g(companion.getMaxDiskCacheSizeInBytes$lib_release(), context));
        }
    }

    @Override // j6.AbstractC7287a
    public boolean isManifestParsingEnabled() {
        return false;
    }

    @Override // j6.AbstractC7289c
    public void registerComponents(@NotNull Context context, @NotNull c glide, @NotNull j registry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(glide, "glide");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Pikazon companion = Pikazon.INSTANCE.getInstance();
        C9067a c9067a = new C9067a(context);
        PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker = companion.getConfig().getPerformanceAvailabilityChecker();
        Pikazon.NetworkConfiguration networkConfiguration = companion.getConfig().getNetworkConfiguration();
        registry.d(PikazonUrl.class, InputStream.class, new PikazonUrlLoader.Factory(companion, C7714v.a0(new PikazonErrorLogsProducer(companion, c9067a, performanceAvailabilityChecker, networkConfiguration != null ? networkConfiguration.getIsCronetEnabled() : false))));
        registry.d(Thumb.class, InputStream.class, new ThumbUrlLoader.Factory(companion.getThumbCache()));
        registry.r(new ResizeUrlLoader.Factory());
    }
}
