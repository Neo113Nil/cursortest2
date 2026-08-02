package ru.ozon.app.android.returns.cancels.cancelpostingsv2.core.mappers;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.data.AnnotationModel;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.annotation.AnnotationVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/core/mappers/CancelPostingsV2AnnotationMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/AnnotationModel;", "Ll20/d;", "", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/annotation/AnnotationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/AnnotationModel;J)Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/annotation/AnnotationVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/AnnotationModel;Ll20/d;)Ljava/util/List;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CancelPostingsV2AnnotationMapper implements Function2<AnnotationModel, d, List<? extends AnnotationVO>> {
    private final AnnotationVO toVo(AnnotationModel annotationModel, long j11) {
        return new AnnotationVO(j11, annotationModel.getAnnotation());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AnnotationVO> invoke(@NotNull AnnotationModel state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, c.a(widgetInfo.d(), "_annotation")));
    }
}
