package ru.ozon.app.android.storefront.widgets.cms.richtext;

import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.base.Config;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0015\b\u0007\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetConfig;", "Lru/ozon/app/android/composer/widgets/base/Config;", "Lru/ozon/app/android/storefront/widgets/cms/richtext/TextBlockDTO;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "supportedVersions", "", "getSupportedVersions", "()[J", "parser", "Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetParser;", "getParser", "()Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetParser;", "Companion", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RichTextWidgetConfig implements Config<TextBlockDTO> {

    @NotNull
    private final RichTextWidgetParser parser;

    @NotNull
    private final long[] supportedVersions;
    public static final int $stable = 8;

    public RichTextWidgetConfig(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.supportedVersions = new long[]{1};
        this.parser = new RichTextWidgetParser(jsonDeserializer);
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
    public Function2<String, String, TextBlockDTO> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    public TextBlockDTO parse(@NotNull C7244b c7244b) {
        return (TextBlockDTO) Config.DefaultImpls.parse(this, c7244b);
    }
}
