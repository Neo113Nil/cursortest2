package ru.ozon.app.android.pdp.widgets.aspectsV4.markdownReason.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data.AspectsV4DTO;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.aspectsV4.markdownReason.presentation.AspectsV4MarkdownReasonVO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/markdownReason/core/AspectsV4MarkdownReasonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$MarkdownReason;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/aspectsV4/markdownReason/presentation/AspectsV4MarkdownReasonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$MarkdownReason;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV4MarkdownReasonMapper implements Function2<AspectsV4DTO.MarkdownReason, d, List<? extends AspectsV4MarkdownReasonVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AspectsV4MarkdownReasonVO> invoke(@NotNull AspectsV4DTO.MarkdownReason state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new AspectsV4MarkdownReasonVO(MapperExtKt.widgetId(widgetInfo), TextDTO.copy$default(state.getText(), null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null), state.getButton()));
    }
}
