package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.data;

import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarConfig;", "Lj20/a;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "state", "parse", "(Lj20/b;)Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "", "supportedPlaceholders", "Ljava/util/Set;", "getSupportedPlaceholders", "()Ljava/util/Set;", "Companion", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OrderNavBarConfig implements InterfaceC7243a<OrderNavBarDTO> {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final Set<String> supportedPlaceholders;
    public static final int $stable = 8;

    public OrderNavBarConfig(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.supportedPlaceholders = e0.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "content");
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return this.supportedPlaceholders;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return j.b();
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public OrderNavBarDTO parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        final JsonParser jsonParser = this.jsonDeserializer;
        return new Function2<String, String, OrderNavBarDTO>() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.data.OrderNavBarConfig$parse$$inlined$getDefaultWidgetParser$1
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.data.OrderNavBarDTO] */
            @Override // kotlin.jvm.functions.Function2
            public OrderNavBarDTO invoke(String params, String state2) {
                JsonParser jsonParser2 = JsonParser.this;
                if (state2 != null) {
                    return jsonParser2.fromJson(state2, OrderNavBarDTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }.invoke(null, state.b());
    }
}
