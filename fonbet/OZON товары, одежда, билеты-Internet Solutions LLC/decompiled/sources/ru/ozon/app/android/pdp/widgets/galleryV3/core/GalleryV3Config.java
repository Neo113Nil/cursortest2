package ru.ozon.app.android.pdp.widgets.galleryV3.core;

import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.base.Config;
import ru.ozon.app.android.pdp.widgets.galleryV3.data.GalleryV3DTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0004\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/core/GalleryV3Config;", "Lru/ozon/app/android/composer/widgets/base/Config;", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO;", "parser", "Lru/ozon/app/android/pdp/widgets/galleryV3/core/GalleryV3Parser;", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV3/core/GalleryV3Parser;)V", "getParser", "()Lru/ozon/app/android/pdp/widgets/galleryV3/core/GalleryV3Parser;", "supportedVersions", "", "getSupportedVersions", "()[J", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GalleryV3Config implements Config<GalleryV3DTO> {

    @NotNull
    private final GalleryV3Parser parser;

    @NotNull
    private final long[] supportedVersions;
    public static final int $stable = 8;

    public GalleryV3Config(@NotNull GalleryV3Parser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.parser = parser;
        this.supportedVersions = new long[]{3};
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return Config.DefaultImpls.canParse(this, c7244b);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return Config.DefaultImpls.getSupportedPlaceholders(this);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return this.supportedVersions;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, GalleryV3DTO> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    public GalleryV3DTO parse(@NotNull C7244b c7244b) {
        return (GalleryV3DTO) Config.DefaultImpls.parse(this, c7244b);
    }
}
