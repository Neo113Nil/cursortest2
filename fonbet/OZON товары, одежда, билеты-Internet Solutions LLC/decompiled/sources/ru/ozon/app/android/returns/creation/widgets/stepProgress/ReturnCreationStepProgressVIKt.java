package ru.ozon.app.android.returns.creation.widgets.stepProgress;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVi", "Lru/ozon/app/android/returns/creation/widgets/stepProgress/ReturnCreationStepProgressVI;", "Lru/ozon/app/android/returns/creation/widgets/stepProgress/ReturnCreationStepProgressDTO;", "id", "", "creation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationStepProgressVIKt {
    @NotNull
    public static final ReturnCreationStepProgressVI toVi(@NotNull ReturnCreationStepProgressDTO returnCreationStepProgressDTO, long j11) {
        Intrinsics.checkNotNullParameter(returnCreationStepProgressDTO, "<this>");
        return new ReturnCreationStepProgressVI(j11, returnCreationStepProgressDTO.getCount(), returnCreationStepProgressDTO.getCountOfSelected(), returnCreationStepProgressDTO.getSelectedColor(), returnCreationStepProgressDTO.getUnselectedColor(), returnCreationStepProgressDTO.getHorizontalPadding(), returnCreationStepProgressDTO.getBetweenSpacing(), returnCreationStepProgressDTO.getBottomPadding(), returnCreationStepProgressDTO.getTopPadding(), returnCreationStepProgressDTO.getBottomCornersRadius(), null);
    }
}
