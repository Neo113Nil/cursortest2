package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.data.DeleteAccountDescriptionDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;", "invoke", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DeleteAccountDescriptionStickyNoUIViewMapper$mapper$1 extends AbstractC7737t implements Function2<DeleteAccountDescriptionDTO, d, List<? extends DeleteAccountDescriptionStickyVO>> {
    final /* synthetic */ DeleteAccountDescriptionStickyNoUIViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteAccountDescriptionStickyNoUIViewMapper$mapper$1(DeleteAccountDescriptionStickyNoUIViewMapper deleteAccountDescriptionStickyNoUIViewMapper) {
        super(2);
        this.this$0 = deleteAccountDescriptionStickyNoUIViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<DeleteAccountDescriptionStickyVO> invoke(DeleteAccountDescriptionDTO dto, d info) {
        DeleteAccountDescriptionStickyVO stickyVO;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        stickyVO = this.this$0.toStickyVO(dto, info.d());
        List<DeleteAccountDescriptionStickyVO> a02 = stickyVO != null ? C7714v.a0(stickyVO) : null;
        return a02 == null ? K.f71697a : a02;
    }
}
