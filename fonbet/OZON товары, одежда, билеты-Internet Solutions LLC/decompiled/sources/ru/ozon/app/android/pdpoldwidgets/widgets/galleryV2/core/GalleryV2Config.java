package ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.core;

import Sc.InterfaceC4008j;
import Sc.k;
import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.base.Config;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.data.GalleryV2DTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0006\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\f\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR2\u0010\u000f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/core/GalleryV2Config;", "Lru/ozon/app/android/composer/widgets/base/Config;", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "emptyGallery$delegate", "LSc/j;", "getEmptyGallery", "()Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO;", "emptyGallery", "Lkotlin/Function2;", "", "parser", "Lkotlin/jvm/functions/Function2;", "getParser", "()Lkotlin/jvm/functions/Function2;", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Companion", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GalleryV2Config implements Config<GalleryV2DTO> {

    /* renamed from: emptyGallery$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j emptyGallery;

    @NotNull
    private final Function2<String, String, GalleryV2DTO> parser;

    @NotNull
    private final long[] supportedVersions;

    public GalleryV2Config(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.emptyGallery = k.b(GalleryV2Config$emptyGallery$2.INSTANCE);
        this.parser = new GalleryV2Config$parser$1(this, jsonDeserializer);
        this.supportedVersions = new long[]{2};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GalleryV2DTO getEmptyGallery() {
        return (GalleryV2DTO) this.emptyGallery.getValue();
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return Config.DefaultImpls.canParse(this, c7244b);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, GalleryV2DTO> getParser() {
        return this.parser;
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

    @Override // j20.InterfaceC7243a
    public GalleryV2DTO parse(@NotNull C7244b c7244b) {
        return (GalleryV2DTO) Config.DefaultImpls.parse(this, c7244b);
    }
}
