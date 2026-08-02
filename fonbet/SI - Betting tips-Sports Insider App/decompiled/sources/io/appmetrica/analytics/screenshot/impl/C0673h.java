package io.appmetrica.analytics.screenshot.impl;

import android.os.Bundle;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673h implements BundleToServiceConfigConverter {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D fromBundle(@NotNull Bundle bundle) {
        bundle.setClassLoader(D.class.getClassLoader());
        D d10 = (D) bundle.getParcelable("config");
        return d10 == null ? new D(new j0()) : d10;
    }
}
