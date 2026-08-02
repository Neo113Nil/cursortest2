package ru.ozon.app.android.checkoutcomposer.deeplink;

import android.content.Context;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.csma.preload.PreferencesPreloadCache;
import ru.ozon.app.android.csma.preload.PreloadCache;
import ru.ozon.app.android.csma.preload.PreloadEntry;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deeplink/PreloadImagesConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/network/serialize/JsonSerializer;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "onComposerInitialized", "()V", "Landroid/content/Context;", "Lru/ozon/app/android/csma/preload/PreloadCache;", "preloadCache", "Lru/ozon/app/android/csma/preload/PreloadCache;", "getPreloadCache", "()Lru/ozon/app/android/csma/preload/PreloadCache;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreloadImagesConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final Context context;

    @NotNull
    private final PreloadCache preloadCache;

    public PreloadImagesConfigurator(@NotNull Context context, @NotNull JsonSerializer jsonSerializer, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.context = context;
        this.preloadCache = new PreferencesPreloadCache(jsonSerializer, jsonDeserializer, context);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        super.onComposerInitialized();
        for (PreloadEntry preloadEntry : this.preloadCache.getEntries()) {
            ContextExtKt.load(this.context, preloadEntry.getImageUrl(), (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : null, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : new ImageSize(preloadEntry.getWidth(), preloadEntry.getHeight()));
        }
    }
}
