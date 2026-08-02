package ru.ozon.app.android.account.orders.clicktodeliverymodal.core;

import android.content.Context;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.data.ButtonsDTO;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.data.ClickToDeliveryModalDTO;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.data.DeliveryDTO;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.data.TitleDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00112\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0011B\u001d\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/ClickToDeliveryModalConfig;", "Lj20/a;", "", "", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Landroid/content/Context;)V", "Lj20/b;", "state", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Landroid/content/Context;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClickToDeliveryModalConfig implements InterfaceC7243a<List<? extends Object>> {

    @NotNull
    private final Context context;

    @NotNull
    private final JsonParser jsonDeserializer;
    public static final int $stable = 8;

    public ClickToDeliveryModalConfig(@NotNull JsonParser jsonDeserializer, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.jsonDeserializer = jsonDeserializer;
        this.context = context;
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return j.b();
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ClickToDeliveryModalDTO clickToDeliveryModalDTO = (ClickToDeliveryModalDTO) this.jsonDeserializer.fromJson(state.b(), ClickToDeliveryModalDTO.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(SeparatorDTO.INSTANCE.createTransparentSeparator(ResourceExtKt.toDp(ResourceExtKt.dim(this.context, clickToDeliveryModalDTO.getVerticalPadding().getTop().getCellLayoutPadding()))));
        arrayList.add(new TitleDTO(clickToDeliveryModalDTO.getTitle(), clickToDeliveryModalDTO.getTrackingInfo()));
        TextDTO subtitle = clickToDeliveryModalDTO.getSubtitle();
        if (subtitle != null) {
            arrayList.add(new TitleDTO(subtitle, null, 2, null));
        }
        List<DeliveryDTO> deliveries = clickToDeliveryModalDTO.getDeliveries();
        ArrayList arrayList2 = new ArrayList(C7714v.z(deliveries, 10));
        int i11 = 0;
        for (Object obj : deliveries) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList2.add(DeliveryDTO.copy$default((DeliveryDTO) obj, null, null, null, null, null, null, i11, 63, null));
            i11 = i12;
        }
        arrayList.addAll(arrayList2);
        List<ButtonV3DTO> buttons = clickToDeliveryModalDTO.getButtons();
        if (buttons != null) {
            arrayList.add(new ButtonsDTO(buttons));
        }
        arrayList.add(SeparatorDTO.INSTANCE.createTransparentSeparator(ResourceExtKt.toDp(ResourceExtKt.dim(this.context, clickToDeliveryModalDTO.getVerticalPadding().getBottom().getCellLayoutPadding()))));
        return arrayList;
    }
}
