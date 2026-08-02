package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core;

import d00.C6020f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.data.WholeSaleModalDTO;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal.WholeSaleModalVI;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\f\u001a\u00020\u000b*\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u0014²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\u001a\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\nX\u008a\u0084\u0002²\u0006\u001a\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "wholeSaleModal", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$TextInput;", "", "isDigit", "", "maxLength", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$TextInput;", "toVI", "(Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO$TextInput;ZS)Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$TextInput;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/DeliveryType;", "selectedTab", "Lkotlin/Pair;", "", "countText", "regionText", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WholeSaleModalComposeWidgetKt {
    private static final WholeSaleModalVI.TextInput toVI(WholeSaleModalDTO.TextInput textInput, boolean z11, short s11) {
        return new WholeSaleModalVI.TextInput(textInput.getMessagePlaceholderKey(), textInput.getPlaceholder(), textInput.getHint(), textInput.getMinCount(), z11, s11, textInput.getErrorRequiredText());
    }

    static /* synthetic */ WholeSaleModalVI.TextInput toVI$default(WholeSaleModalDTO.TextInput textInput, boolean z11, short s11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            s11 = Short.MAX_VALUE;
        }
        return toVI(textInput, z11, s11);
    }

    @NotNull
    public static final i wholeSaleModal(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.b("pdp", "wholeSaleModal3P", null, new WholeSaleModalComposeWidgetKt$wholeSaleModal$1(jsonDeserializer), 4, null);
    }
}
