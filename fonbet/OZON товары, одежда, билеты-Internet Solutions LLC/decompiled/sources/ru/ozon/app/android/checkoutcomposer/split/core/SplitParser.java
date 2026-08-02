package ru.ozon.app.android.checkoutcomposer.split.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.checkoutcomposer.celllist.data.CheckoutCellListWidgetDTO;
import ru.ozon.app.android.checkoutcomposer.split.data.Indexed;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitDTO;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/core/SplitParser;", "", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "invoke", "", "jsonState", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitParser {

    @NotNull
    private final JsonParser jsonDeserializer;

    public SplitParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    @NotNull
    public final List<Object> invoke(@NotNull String jsonState) {
        Intrinsics.checkNotNullParameter(jsonState, "jsonState");
        List<SplitElementDTO> elements = ((SplitDTO) this.jsonDeserializer.fromJson(jsonState, SplitDTO.class)).getElements();
        Intrinsics.g(elements, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : elements) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (obj instanceof Indexed) {
                ((Indexed) obj).setIndex(Long.valueOf(i11));
            } else if (obj instanceof CheckoutCellListDTO) {
                obj = new CheckoutCellListWidgetDTO((CheckoutCellListDTO) obj, Boolean.FALSE, Boolean.TRUE);
            } else if (!(obj instanceof IslandSeparatorDTO)) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            i11 = i12;
        }
        return arrayList;
    }
}
