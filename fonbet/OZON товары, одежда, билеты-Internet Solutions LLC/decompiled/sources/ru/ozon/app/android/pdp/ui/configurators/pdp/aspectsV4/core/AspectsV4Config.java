package ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.core;

import Sc.InterfaceC4008j;
import j20.C7244b;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.base.Config;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0018B\u0015\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/core/AspectsV4Config;", "Lru/ozon/app/android/composer/widgets/base/Config;", "", "", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/core/AspectsV4Parser;", "subWidgetsParser$delegate", "LSc/j;", "getSubWidgetsParser", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/core/AspectsV4Parser;", "subWidgetsParser", "parser", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/core/AspectsV4Parser;", "getParser", "", "supportedVersions", "[J", "getSupportedVersions", "()[J", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AspectsV4Config implements Config<List<? extends Object>> {

    @NotNull
    private final JsonParser deserializer;

    @NotNull
    private final AspectsV4Parser parser;

    /* renamed from: subWidgetsParser$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j subWidgetsParser;

    @NotNull
    private final long[] supportedVersions;
    public static final int $stable = 8;

    public AspectsV4Config(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
        this.subWidgetsParser = LazyUtilsKt.unsafeLazy(new AspectsV4Config$subWidgetsParser$2(this));
        this.parser = getSubWidgetsParser();
        this.supportedVersions = new long[]{4};
    }

    private final AspectsV4Parser getSubWidgetsParser() {
        return (AspectsV4Parser) this.subWidgetsParser.getValue();
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
    public Function2<String, String, List<? extends Object>> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    public List<Object> parse(@NotNull C7244b c7244b) {
        return (List) Config.DefaultImpls.parse(this, c7244b);
    }
}
