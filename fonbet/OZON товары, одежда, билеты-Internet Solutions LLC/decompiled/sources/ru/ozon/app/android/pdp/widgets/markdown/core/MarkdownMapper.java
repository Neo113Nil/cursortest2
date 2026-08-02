package ru.ozon.app.android.pdp.widgets.markdown.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.markdown.data.MarkdownDTO;
import ru.ozon.app.android.pdp.widgets.markdown.presentation.MarkdownVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/markdown/core/MarkdownMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/markdown/data/MarkdownDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/markdown/presentation/MarkdownVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/markdown/data/MarkdownDTO;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarkdownMapper implements Function2<MarkdownDTO, d, List<? extends MarkdownVO>> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MarkdownVO> invoke(@NotNull MarkdownDTO state, @NotNull d widgetInfo) {
        String deeplink;
        List list;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        if ((state.getCharacteristics() == null && state.getDescription() == null) || (deeplink = state.getDeeplink()) == null || h.K(deeplink)) {
            return K.f71697a;
        }
        long hashCode = widgetInfo.d().hashCode();
        List<MarkdownDTO.Characteristic> characteristics = state.getCharacteristics();
        if (characteristics != null) {
            List<MarkdownDTO.Characteristic> list2 = characteristics;
            list = new ArrayList(C7714v.z(list2, 10));
            for (MarkdownDTO.Characteristic characteristic : list2) {
                list.add(new MarkdownVO.Characteristic(characteristic.getName(), C7714v.V(characteristic.getValue(), ", ", null, null, null, 62)));
            }
        } else {
            list = K.f71697a;
        }
        return C7714v.a0(new MarkdownVO(hashCode, list, state.getDescription(), state.getDeeplink()));
    }
}
