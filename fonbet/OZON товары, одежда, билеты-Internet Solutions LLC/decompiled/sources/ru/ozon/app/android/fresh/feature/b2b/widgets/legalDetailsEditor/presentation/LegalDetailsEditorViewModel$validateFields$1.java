package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorVO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;", "field", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class LegalDetailsEditorViewModel$validateFields$1 extends AbstractC7737t implements Function1<LegalDetailsEditorVO.FileFieldVO, LegalDetailsEditorVO.FileFieldVO> {
    final /* synthetic */ I $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDetailsEditorViewModel$validateFields$1(I i11) {
        super(1);
        this.$result = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final LegalDetailsEditorVO.FileFieldVO invoke(LegalDetailsEditorVO.FileFieldVO field) {
        Intrinsics.checkNotNullParameter(field, "field");
        if (field.getStatus() instanceof LegalDetailsEditorVO.Status.Success) {
            return field;
        }
        this.$result.f71783a = false;
        return LegalDetailsEditorVO.FileFieldVO.copy$default(field, null, null, null, 0L, null, null, LegalDetailsEditorVO.Status.ErrorRequired.INSTANCE, 63, null);
    }
}
