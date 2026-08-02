package ru.ozon.app.android.pdp.widgets.delivery.core;

import Sc.r;
import Sc.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTO;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTOHolder;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u0013\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/core/DeliveryConfigParser;", "Lkotlin/Function2;", "", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryConfigParser implements Function2<String, String, DeliveryDTOHolder> {

    @NotNull
    private final JsonParser deserializer;

    public DeliveryConfigParser(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [Sc.r$b] */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public DeliveryDTOHolder invoke(String params, String state) {
        DeliveryDTO deliveryDTO;
        if (state != null) {
            try {
                r.Companion companion = r.INSTANCE;
                deliveryDTO = (DeliveryDTO) this.deserializer.fromJson(state, DeliveryDTO.class);
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                deliveryDTO = s.a(th2);
            }
            r3 = deliveryDTO instanceof r.b ? null : deliveryDTO;
        }
        return new DeliveryDTOHolder(r3);
    }
}
