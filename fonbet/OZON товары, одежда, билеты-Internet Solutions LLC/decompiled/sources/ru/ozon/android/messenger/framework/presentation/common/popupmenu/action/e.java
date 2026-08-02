package ru.ozon.android.messenger.framework.presentation.common.popupmenu.action;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.c;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class e {
    @NotNull
    public static c.a a(@NotNull OzonSpannableString text, @NotNull String icon, @NotNull AtomActionDTO action, boolean z11, @NotNull String textColor, @NotNull String iconTintColor, Map map) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(iconTintColor, "iconTintColor");
        IconDTO.IconShape iconShape = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Boolean bool = null;
        String str5 = null;
        TestInfo testInfo = null;
        Map map2 = null;
        return new c.a(new TextDTO(text, null, CommonCellSettings.LayoutPadding.PADDING_500, null, null, null, null, "tsBody500Medium", textColor, null, null, null, null, false, null, null, null, null, null, 523898, null), new IconDTO(IconDTO.IconSize.SIZE_500, null, iconShape, str, new CommonAtomIconDTO(icon, iconTintColor), str2, "layerFloor2", null, str3, str4, num, bool, null, str5, testInfo, map2, 65454, null), action, z11, map);
    }
}
