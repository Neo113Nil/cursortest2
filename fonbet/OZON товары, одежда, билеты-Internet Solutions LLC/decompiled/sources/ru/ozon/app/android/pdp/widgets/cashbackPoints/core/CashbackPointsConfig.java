package ru.ozon.app.android.pdp.widgets.cashbackPoints.core;

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
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.data.CashbackPointsDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00122\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0012B\u0015\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cashbackPoints/core/CashbackPointsConfig;", "Lru/ozon/app/android/composer/widgets/base/Config;", "", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/data/CashbackPointsDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/core/CashbackPointsParser;", "cashbackPointsParser$delegate", "LSc/j;", "getCashbackPointsParser", "()Lru/ozon/app/android/pdp/widgets/cashbackPoints/core/CashbackPointsParser;", "cashbackPointsParser", "parser", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/core/CashbackPointsParser;", "getParser", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashbackPointsConfig implements Config<List<? extends CashbackPointsDTO>> {

    /* renamed from: cashbackPointsParser$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cashbackPointsParser;

    @NotNull
    private final CashbackPointsParser parser;
    public static final int $stable = 8;

    public CashbackPointsConfig(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.cashbackPointsParser = DelegatesKt.lazyUnsafe(new CashbackPointsConfig$cashbackPointsParser$2(jsonDeserializer));
        this.parser = getCashbackPointsParser();
    }

    private final CashbackPointsParser getCashbackPointsParser() {
        return (CashbackPointsParser) this.cashbackPointsParser.getValue();
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
        return Config.DefaultImpls.getSupportedVersions(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public Function2<String, String, List<? extends CashbackPointsDTO>> getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    public List<CashbackPointsDTO> parse(@NotNull C7244b c7244b) {
        return (List) Config.DefaultImpls.parse(this, c7244b);
    }
}
