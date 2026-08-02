package ru.ozon.app.android.returns.creation.widgets.selectedItems.core;

import Tc.b;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.data.SelectedItemDTO;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.data.SelectedItemsDTO;
import ru.ozon.app.android.returns.ui.data.parser.IslandSeparatorWidgetParser;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001d\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/selectedItems/core/ReturnCreationSelectedItemsParser;", "Lru/ozon/app/android/returns/ui/data/parser/IslandSeparatorWidgetParser;", "", "", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "context", "Landroid/content/Context;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Landroid/content/Context;)V", "invoke", "params", "", "state", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationSelectedItemsParser extends IslandSeparatorWidgetParser<List<? extends Object>> {

    @NotNull
    private final Context context;

    @NotNull
    private final JsonParser jsonDeserializer;

    public ReturnCreationSelectedItemsParser(@NotNull JsonParser jsonDeserializer, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.jsonDeserializer = jsonDeserializer;
        this.context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        if (state == null) {
            return K.f71697a;
        }
        b builder = C7714v.B();
        SelectedItemsDTO selectedItemsDTO = (SelectedItemsDTO) this.jsonDeserializer.fromJson(state, SelectedItemsDTO.class);
        int i11 = 0;
        for (Object obj : selectedItemsDTO.getItems()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            builder.add((SelectedItemDTO) obj);
            if (i11 < C7714v.P(selectedItemsDTO.getItems())) {
                builder.add(IslandSeparatorWidgetParser.createIslandSeparator$default(this, null, Integer.valueOf(AppTokensProvider.IslandSeparatorHeight.INSTANCE.between()), 1, null));
            } else if (!AppTokensProvider.INSTANCE.isSelect(this.context)) {
                builder.add(createEndIslandSeparator());
            }
            i11 = i12;
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
