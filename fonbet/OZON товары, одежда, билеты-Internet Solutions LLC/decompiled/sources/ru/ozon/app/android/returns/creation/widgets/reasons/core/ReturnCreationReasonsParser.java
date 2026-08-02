package ru.ozon.app.android.returns.creation.widgets.reasons.core;

import Tc.b;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.data.ItemDTO;
import ru.ozon.app.android.returns.creation.widgets.reasons.data.HeaderDTO;
import ru.ozon.app.android.returns.creation.widgets.reasons.data.ItemWithReasonDTO;
import ru.ozon.app.android.returns.creation.widgets.reasons.data.MultipleReasonSelectionDTO;
import ru.ozon.app.android.returns.creation.widgets.reasons.data.ReturnCreationReasonsDTO;
import ru.ozon.app.android.returns.ui.data.parser.IslandSeparatorWidgetParser;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.data.StickyBottomEarsDTO;
import ru.ozon.app.android.returns.ui.molecules.opencloud.data.OpenCloudDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u001d\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00100\u0002H\u0002J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0002R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/core/ReturnCreationReasonsParser;", "Lru/ozon/app/android/returns/ui/data/parser/IslandSeparatorWidgetParser;", "", "", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "appContext", "Landroid/content/Context;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Landroid/content/Context;)V", "invoke", "params", "", "state", "mapToItems", "Lru/ozon/app/android/returns/creation/widgets/reasons/data/MultipleReasonSelectionDTO;", "mapToItemWithReasons", "Lru/ozon/app/android/returns/creation/widgets/reasons/data/ItemWithReasonDTO;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationReasonsParser extends IslandSeparatorWidgetParser<List<? extends Object>> {

    @NotNull
    private final Context appContext;

    @NotNull
    private final JsonParser jsonDeserializer;

    public ReturnCreationReasonsParser(@NotNull JsonParser jsonDeserializer, @NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.jsonDeserializer = jsonDeserializer;
        this.appContext = appContext;
    }

    private final List<Object> mapToItemWithReasons(List<ItemWithReasonDTO> list) {
        ArrayList arrayList = new ArrayList();
        for (ItemWithReasonDTO itemWithReasonDTO : list) {
            b builder = C7714v.B();
            builder.add(AppTokensProvider.INSTANCE.isSelect(this.appContext) ? createBeginIslandSeparator() : IslandSeparatorWidgetParser.createIslandSeparator$default(this, null, null, 3, null));
            ItemDTO item = itemWithReasonDTO.getItem();
            if (item != null) {
                builder.add(item);
            }
            HeaderDTO header = itemWithReasonDTO.getHeader();
            if (header != null) {
                builder.add(header);
            }
            builder.addAll(itemWithReasonDTO.getReasons());
            Intrinsics.checkNotNullParameter(builder, "builder");
            C7714v.p(builder.B(), arrayList);
        }
        return arrayList;
    }

    private final List<Object> mapToItems(List<MultipleReasonSelectionDTO> list) {
        ArrayList arrayList = new ArrayList();
        for (MultipleReasonSelectionDTO multipleReasonSelectionDTO : list) {
            b builder = C7714v.B();
            OpenCloudDTO openCloudDTO = multipleReasonSelectionDTO.getOpenCloudDTO();
            if (openCloudDTO != null) {
                builder.add(IslandSeparatorWidgetParser.createIslandSeparator$default(this, null, null, 3, null));
                builder.add(openCloudDTO);
            }
            builder.addAll(mapToItemWithReasons(multipleReasonSelectionDTO.getItemWithReasons()));
            if (!AppTokensProvider.INSTANCE.isSelect(this.appContext)) {
                builder.add(IslandSeparatorWidgetParser.createIslandSeparator$default(this, IslandSeparatorDTO.Configuration.SECTION_END, null, 2, null));
            }
            ButtonV3DTO button = multipleReasonSelectionDTO.getButton();
            if (button != null) {
                builder.add(button);
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            C7714v.p(builder.B(), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public List<Object> invoke(String params, String state) {
        if (state == null) {
            return K.f71697a;
        }
        ReturnCreationReasonsDTO returnCreationReasonsDTO = (ReturnCreationReasonsDTO) this.jsonDeserializer.fromJson(state, ReturnCreationReasonsDTO.class);
        b builder = C7714v.B();
        ItemDTO item = returnCreationReasonsDTO.getItem();
        if (item != null) {
            builder.add(item);
        }
        AppTokensProvider appTokensProvider = AppTokensProvider.INSTANCE;
        if (appTokensProvider.isSelect(this.appContext)) {
            builder.add(new StickyBottomEarsDTO(createBeginIslandSeparator()));
        }
        builder.addAll(mapToItems(returnCreationReasonsDTO.getReasonSelection()));
        if (!appTokensProvider.isSelect(this.appContext)) {
            builder.add(IslandSeparatorWidgetParser.createIslandSeparator$default(this, IslandSeparatorDTO.Configuration.SECTION_END, null, 2, null));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
