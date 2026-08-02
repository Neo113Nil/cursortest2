package ru.ozon.app.android.widgets.designSystemAtoms.core.aspect;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/core/aspect/AspectMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/widgets/designSystemAtoms/core/aspect/AspectVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;J)Lru/ozon/app/android/widgets/designSystemAtoms/core/aspect/AspectVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "createTextDTO", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;Ll20/d;)Ljava/util/List;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AspectMapper implements Function2<DesignSystemAtomsDTO, d, List<? extends AspectVO>> {
    private final TextDTO createTextDTO() {
        return new TextDTO(new OzonSpannableString("I am super TextAtom"), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
    }

    private final AspectVO toVo(DesignSystemAtomsDTO designSystemAtomsDTO, long j11) {
        if (designSystemAtomsDTO.getAtom() instanceof AspectDTO) {
            return new AspectVO(j11, (AspectDTO) designSystemAtomsDTO.getAtom(), createTextDTO());
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AspectVO> invoke(@NotNull DesignSystemAtomsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        AspectVO vo = toVo(state, widgetInfo.d().hashCode());
        return vo == null ? K.f71697a : C7714v.a0(vo);
    }
}
