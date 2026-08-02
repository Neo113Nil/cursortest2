package ru.ozon.app.android.commonwidgets.widgets.themeSelector;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.commonwidgets.widgets.themeSelector.ThemeSelectorConfig;
import ru.ozon.app.android.commonwidgets.widgets.themeSelector.ThemeSelectorViewMapper;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/themeSelector/ThemeSelectorConfig$StubDTO;", "<unused var>", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/commonwidgets/widgets/themeSelector/ThemeSelectorViewMapper$StubVO;", "invoke", "(Lru/ozon/app/android/commonwidgets/widgets/themeSelector/ThemeSelectorConfig$StubDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ThemeSelectorViewMapper$mapper$1 extends AbstractC7737t implements Function2<ThemeSelectorConfig.StubDTO, d, List<? extends ThemeSelectorViewMapper.StubVO>> {
    public static final ThemeSelectorViewMapper$mapper$1 INSTANCE = new ThemeSelectorViewMapper$mapper$1();

    ThemeSelectorViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<ThemeSelectorViewMapper.StubVO> invoke(ThemeSelectorConfig.StubDTO stubDTO, d info) {
        Intrinsics.checkNotNullParameter(stubDTO, "<unused var>");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(new ThemeSelectorViewMapper.StubVO(info.d().hashCode()));
    }
}
