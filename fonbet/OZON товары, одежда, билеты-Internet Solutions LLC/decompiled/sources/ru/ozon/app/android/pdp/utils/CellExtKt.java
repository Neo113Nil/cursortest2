package ru.ozon.app.android.pdp.utils;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"getRightBlockParam", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "param", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CellExtKt {
    @NotNull
    public static final String getRightBlockParam(@NotNull CellDTO cellDTO, @NotNull String param) {
        CommonControlSettings common;
        AtomActionDTO action;
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(cellDTO, "<this>");
        Intrinsics.checkNotNullParameter(param, "param");
        CellDTO.RightBlock rightBlock = cellDTO.getRightBlock();
        String str = (rightBlock == null || (common = rightBlock.getCommon()) == null || (action = common.getAction()) == null || (params = action.getParams()) == null) ? null : params.get(param);
        return str == null ? "" : str;
    }
}
