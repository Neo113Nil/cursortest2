package ru.ozon.app.android.fresh.unsorted.widgets.infoDropDown.data;

import j20.C7244b;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.unsorted.utils.FreshConfig;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\rB\u0015\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/infoDropDown/data/InfoDropDownConfig;", "Lru/ozon/app/android/fresh/unsorted/utils/FreshConfig;", "", "", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "parser", "Lru/ozon/app/android/fresh/unsorted/widgets/infoDropDown/data/InfoDropDownParser;", "getParser", "()Lru/ozon/app/android/fresh/unsorted/widgets/infoDropDown/data/InfoDropDownParser;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoDropDownConfig implements FreshConfig<List<? extends Object>> {

    @NotNull
    private final InfoDropDownParser parser;
    public static final int $stable = 8;

    public InfoDropDownConfig(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.parser = new InfoDropDownParser(jsonDeserializer);
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        return FreshConfig.DefaultImpls.canParse(this, c7244b);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return FreshConfig.DefaultImpls.getSupportedPlaceholders(this);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return FreshConfig.DefaultImpls.getSupportedVersions(this);
    }

    @NotNull
    public String getVertical() {
        return FreshConfig.DefaultImpls.getVertical(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.Config
    @NotNull
    public InfoDropDownParser getParser() {
        return this.parser;
    }

    @Override // j20.InterfaceC7243a
    public List<Object> parse(@NotNull C7244b c7244b) {
        return (List) FreshConfig.DefaultImpls.parse(this, c7244b);
    }
}
