package ru.ozon.app.android.widgets.designSystemAtoms.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/core/TextAreaMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/widgets/designSystemAtoms/core/TextAreaVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;J)Lru/ozon/app/android/widgets/designSystemAtoms/core/TextAreaVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;Ll20/d;)Ljava/util/List;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextAreaMapper implements Function2<DesignSystemAtomsDTO, d, List<? extends TextAreaVO>> {
    private final TextAreaVO toVo(DesignSystemAtomsDTO designSystemAtomsDTO, long j11) {
        if (designSystemAtomsDTO.getAtom() instanceof DesignSystemAtomsDTO.TestOnlyTextAreaDTO) {
            return new TextAreaVO(j11, (DesignSystemAtomsDTO.TestOnlyTextAreaDTO) designSystemAtomsDTO.getAtom());
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TextAreaVO> invoke(@NotNull DesignSystemAtomsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        TextAreaVO vo = toVo(state, widgetInfo.d().hashCode());
        return vo == null ? K.f71697a : C7714v.a0(vo);
    }
}
