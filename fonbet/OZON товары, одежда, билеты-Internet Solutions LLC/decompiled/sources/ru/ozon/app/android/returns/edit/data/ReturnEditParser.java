package ru.ozon.app.android.returns.edit.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.returns.edit.data.dto.ReturnEditDto;
import ru.ozon.app.android.returns.ui.data.parser.IslandSeparatorWidgetParser;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0015\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/returns/edit/data/ReturnEditParser;", "Lru/ozon/app/android/returns/ui/data/parser/IslandSeparatorWidgetParser;", "", "", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "invoke", "params", "", "state", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnEditParser extends IslandSeparatorWidgetParser<List<? extends Object>> {

    @NotNull
    private final JsonParser jsonDeserializer;

    public ReturnEditParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        if (state == null) {
            return K.f71697a;
        }
        ReturnEditDto returnEditDto = (ReturnEditDto) this.jsonDeserializer.fromJson(state, ReturnEditDto.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(returnEditDto.getTextEditBlock());
        if (returnEditDto.getImageEditBlock() != null) {
            arrayList.add(IslandSeparatorWidgetParser.createIslandSeparator$default(this, IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS, null, 2, null));
            arrayList.add(returnEditDto.getImageEditBlock());
        }
        arrayList.add(returnEditDto.getSticky());
        return arrayList;
    }
}
