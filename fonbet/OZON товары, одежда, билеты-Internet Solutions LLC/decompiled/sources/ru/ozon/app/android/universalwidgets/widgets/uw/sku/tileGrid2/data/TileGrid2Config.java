package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.data;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import e10.AbstractC6252b;
import j20.C7244b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.tiles.tilegrid2.data.mapper.TileGrid2Mapper;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.data.logger.TileGrid2Logger;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/data/TileGrid2Config;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Landroid/content/Context;", "context", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Landroid/content/Context;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "state", "", "", "parse", "(Lj20/b;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker$delegate", "LSc/j;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2Mapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2Mapper;", "mapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/data/logger/TileGrid2Logger;", "logger$delegate", "getLogger", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/data/logger/TileGrid2Logger;", "logger", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2Config extends AbstractC6252b {

    @NotNull
    private final Context context;

    /* renamed from: featureChecker$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j featureChecker;

    @NotNull
    private final JsonParser jsonDeserializer;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j logger;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    public TileGrid2Config(@NotNull Context context, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.context = context;
        this.jsonDeserializer = jsonDeserializer;
        this.featureChecker = k.b(new TileGrid2Config$featureChecker$2(this));
        this.mapper = k.b(new TileGrid2Config$mapper$2(this));
        this.logger = k.b(new TileGrid2Config$logger$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeatureChecker getFeatureChecker() {
        return (FeatureChecker) this.featureChecker.getValue();
    }

    private final TileGrid2Logger getLogger() {
        return (TileGrid2Logger) this.logger.getValue();
    }

    private final TileGrid2Mapper getMapper() {
        return (TileGrid2Mapper) this.mapper.getValue();
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        try {
            return getMapper().map((TileGrid2DTO) this.jsonDeserializer.fromJson(state.b(), TileGrid2DTO.class));
        } catch (Exception e11) {
            getLogger().logDecodingError(state, e11);
            throw e11;
        }
    }
}
