package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data.UniversalWidgetDTO;
import ru.ozon.app.android.utils.CollectionExtKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002&\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0004B\u0013\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetParser;", "Lkotlin/Function2;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO$ObjectGrid3NewItemDTO;", "items", "", "gridsInTheLastLine", "", "addEmptyItems", "(Ljava/util/List;I)V", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalWidgetParser implements Function2<String, String, UniversalWidgetDTO> {

    @NotNull
    private final JsonParser jsonDeserializer;

    public UniversalWidgetParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final void addEmptyItems(List<UniversalWidgetDTO.ObjectGrid3NewDTO.ObjectGrid3NewItemDTO> items, int gridsInTheLastLine) {
        int i11 = 3 - gridsInTheLastLine;
        for (int i12 = 0; i12 < i11; i12++) {
            String str = null;
            items.add(new UniversalWidgetDTO.ObjectGrid3NewDTO.ObjectGrid3NewItemDTO(new ImageDTO(null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null), null, null, null, str, null, null, null, 254, null));
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public UniversalWidgetDTO invoke(String params, String state) {
        UniversalWidgetDTO universalWidgetDTO;
        int size;
        if (state == null || (universalWidgetDTO = (UniversalWidgetDTO) this.jsonDeserializer.fromJson(state, UniversalWidgetDTO.class)) == null) {
            return null;
        }
        List<UniversalWidgetDTO.ItemDTO> items = universalWidgetDTO.getItems();
        UniversalWidgetDTO.ObjectGrid3NewDTO objectGrid3New = universalWidgetDTO.getObjectGrid3New();
        List<UniversalWidgetDTO.ObjectGrid3NewDTO.ObjectGrid3NewItemDTO> items2 = objectGrid3New != null ? objectGrid3New.getItems() : null;
        if (CollectionExtKt.isNullOrEmpty(items2) && CollectionExtKt.isNullOrEmpty(items)) {
            return null;
        }
        if (items2 != null && (size = items2.size() % 3) != 0) {
            addEmptyItems(items2, size);
        }
        return universalWidgetDTO;
    }
}
