package ru.ozon.app.android.widgets.designSystemAtoms.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.o;
import kotlin.reflect.q;
import l20.d;
import ld.C7925f;
import nd.AbstractC8504A;
import nd.R0;
import nd.X;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTO;
import ru.ozon.app.android.widgets.designSystemAtoms.presentation.DesignSystemAtomsVO;
import ru.ozon.uni.atoms.common.HTMLTagSupport;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.BadgeMapperKt;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/core/DsAtomsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/widgets/designSystemAtoms/presentation/DesignSystemAtomsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;J)Lru/ozon/app/android/widgets/designSystemAtoms/presentation/DesignSystemAtomsVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;Ll20/d;)Ljava/util/List;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DsAtomsMapper implements Function2<DesignSystemAtomsDTO, d, List<? extends DesignSystemAtomsVO>> {
    private final DesignSystemAtomsVO toVo(DesignSystemAtomsDTO designSystemAtomsDTO, long j11) {
        Boolean tagSupported = designSystemAtomsDTO.getTagSupported();
        if (tagSupported != null ? tagSupported.booleanValue() : false) {
            if (designSystemAtomsDTO.getAtom() instanceof HTMLTagSupport) {
                ((HTMLTagSupport) designSystemAtomsDTO.getAtom()).setTagSupported(true);
            } else {
                kotlin.reflect.d b11 = N.b(designSystemAtomsDTO.getAtom().getClass());
                Intrinsics.checkNotNullParameter(b11, "<this>");
                Collection<AbstractC8504A<?>> i11 = ((X.a) ((X) b11).N().getValue()).i();
                ArrayList arrayList = new ArrayList();
                for (Object obj : i11) {
                    AbstractC8504A abstractC8504A = (AbstractC8504A) obj;
                    if (!(abstractC8504A.t().d0() != null) && (abstractC8504A instanceof o)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    q returnType = ((o) next).getReturnType();
                    Intrinsics.checkNotNullParameter(returnType, "<this>");
                    R0 k11 = ((R0) returnType).k();
                    kotlin.reflect.d b12 = N.b(HTMLTagSupport.class);
                    K k12 = K.f71697a;
                    R0 other = C7925f.a(b12, k12, false, k12);
                    Intrinsics.checkNotNullParameter(k11, "<this>");
                    Intrinsics.checkNotNullParameter(other, "other");
                    if (C8701c.n(k11.i(), other.i())) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    HTMLTagSupport hTMLTagSupport = (HTMLTagSupport) ((o) it2.next()).call(designSystemAtomsDTO.getAtom());
                    if (hTMLTagSupport != null) {
                        hTMLTagSupport.setTagSupported(true);
                    }
                }
            }
        }
        AtomDTO atom = designSystemAtomsDTO.getAtom();
        AtomDTO mapToDsBadge = atom instanceof Badge ? BadgeMapperKt.mapToDsBadge((Badge) designSystemAtomsDTO.getAtom()) : atom instanceof TextAtom ? TextMapperKt.dsTextAtom$default((TextAtom) designSystemAtomsDTO.getAtom(), null, null, null, null, null, null, null, null, null, null, null, false, 4095, null) : designSystemAtomsDTO.getAtom();
        DesignSystemAtomsDTO.AtomLayoutRule atomLayoutRule = designSystemAtomsDTO.getAtomLayoutRule();
        if (atomLayoutRule == null) {
            atomLayoutRule = DesignSystemAtomsDTO.AtomLayoutRule.WIDGET_WIDTH;
        }
        DesignSystemAtomsDTO.AtomLayoutRule atomLayoutRule2 = atomLayoutRule;
        float intValue = (designSystemAtomsDTO.getWidgetWidthPercent() != null ? r0.intValue() : 100) / 100.0f;
        Boolean showWidgetBackground = designSystemAtomsDTO.getShowWidgetBackground();
        return new DesignSystemAtomsVO(j11, mapToDsBadge, atomLayoutRule2, intValue, showWidgetBackground != null ? showWidgetBackground.booleanValue() : false, false, 32, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DesignSystemAtomsVO> invoke(@NotNull DesignSystemAtomsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
