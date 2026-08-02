package ru.ozon.app.android.storefront.widgets.financeWidget.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00142.\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u0005:\u0001\u0014B\u0013\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetCardParser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO;", "", "addWidgetFields", "(Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetDTO;)V", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FinanceWidgetCardParser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final JsonParser deserializer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/data/FinanceWidgetCardParser$Companion;", "", "<init>", "()V", "LEFT_SPAN_INDEX", "", "RIGHT_SPAN_INDEX", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FinanceWidgetCardParser(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
    }

    private final void addWidgetFields(FinanceWidgetDTO financeWidgetDTO) {
        financeWidgetDTO.getLeftCard().setWidgetBackgroundColor(financeWidgetDTO.getBackgroundColor());
        financeWidgetDTO.getLeftCard().setCompactSize(financeWidgetDTO.isCompactSize());
        financeWidgetDTO.getLeftCard().setSpanIndex(0);
        financeWidgetDTO.getLeftCard().setWidgetTrackingInfo(financeWidgetDTO.getTrackingInfo());
        financeWidgetDTO.getRightCard().setWidgetBackgroundColor(financeWidgetDTO.getBackgroundColor());
        financeWidgetDTO.getRightCard().setCompactSize(financeWidgetDTO.isCompactSize());
        financeWidgetDTO.getRightCard().setSpanIndex(1);
        financeWidgetDTO.getRightCard().setWidgetTrackingInfo(financeWidgetDTO.getTrackingInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        FinanceWidgetDTO financeWidgetDTO;
        if (state == null || (financeWidgetDTO = (FinanceWidgetDTO) this.deserializer.fromJson(state, FinanceWidgetDTO.class)) == null) {
            return K.f71697a;
        }
        addWidgetFields(financeWidgetDTO);
        return C7714v.b0(financeWidgetDTO.getLeftCard(), financeWidgetDTO.getRightCard());
    }
}
