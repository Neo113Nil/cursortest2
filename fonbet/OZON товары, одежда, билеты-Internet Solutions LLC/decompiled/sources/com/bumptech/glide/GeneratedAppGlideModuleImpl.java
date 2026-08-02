package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import i6.p;
import java.util.Collections;
import java.util.Set;
import ru.ozon.app.android.pikazon.glide.GlideAppModule;

/* loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a, reason: collision with root package name */
    private final GlideAppModule f57541a = new GlideAppModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: ru.ozon.app.android.pikazon.glide.GlideAppModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.webp.WebpGlideLibraryModule");
        }
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public final Set<Class<?>> a() {
        return Collections.EMPTY_SET;
    }

    @Override // j6.AbstractC7287a
    public final void applyOptions(@NonNull Context context, @NonNull d dVar) {
        this.f57541a.applyOptions(context, dVar);
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    final p.b b() {
        return new a();
    }

    @Override // j6.AbstractC7287a
    public final boolean isManifestParsingEnabled() {
        return this.f57541a.isManifestParsingEnabled();
    }

    @Override // j6.AbstractC7289c
    public final void registerComponents(@NonNull Context context, @NonNull c cVar, @NonNull j jVar) {
        new com.bumptech.glide.integration.webp.b().registerComponents(context, cVar, jVar);
        this.f57541a.registerComponents(context, cVar, jVar);
    }
}
