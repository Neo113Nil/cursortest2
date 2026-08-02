package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.data;

import e10.AbstractC6252b;
import j20.C7244b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.product.common.CommonProductWidgetDTO;
import ru.ozon.app.android.product.tiles.separator.presentation.SkuSeparatorVO;
import ru.ozon.app.android.product.tiles.utils.CollectionExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0013B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/data/SkuGrid3Config;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "", "", "addSeparator", "(Ljava/util/List;)V", "Lj20/b;", "state", "", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SkuGrid3Config extends AbstractC6252b {

    @NotNull
    private final JsonParser jsonDeserializer;

    public SkuGrid3Config(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final void addSeparator(List<Object> list) {
        list.add(new SkuSeparatorVO(list.hashCode()));
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        CommonProductWidgetDTO commonProductWidgetDTO = (CommonProductWidgetDTO) this.jsonDeserializer.fromJson(state.b(), CommonProductWidgetDTO.class);
        commonProductWidgetDTO.getProductContainer().setThin(CollectionExtKt.isThinWidget(commonProductWidgetDTO.getProductContainer().getProducts()));
        List<? extends Object> a02 = C7714v.a0(commonProductWidgetDTO);
        if (a02.size() % 3 == 0 || commonProductWidgetDTO.getFooter() != null) {
            return a02;
        }
        ArrayList W02 = C7714v.W0(a02);
        addSeparator(W02);
        return W02;
    }
}
