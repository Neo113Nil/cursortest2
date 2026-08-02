package ru.ozon.app.android.ugc.widgets.reviewSort.core;

import Tg.b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.ugc.widgets.reviewSort.FilterSelectUpdateKey;
import ru.ozon.app.android.ugc.widgets.reviewSort.presentation.ReviewSortVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTg/b;", "action", "", "invoke", "(LTg/b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$3$4$1$actionHandler$1$1 extends AbstractC7737t implements Function1<b, Boolean> {
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ ReviewSortVO $reviewSortVO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$3$4$1$actionHandler$1$1(ReviewSortVO reviewSortVO, InterfaceC7851b interfaceC7851b) {
        super(1);
        this.$reviewSortVO = reviewSortVO;
        this.$controller = interfaceC7851b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(b action) {
        AtomActionDTO action2;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.Click)) {
            return Boolean.FALSE;
        }
        Iterator<CellDTO> it = this.$reviewSortVO.getCells().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            CellDTO next = it.next();
            String id2 = ((AtomAction.Click) action).getId();
            CommonControlSettings common = next.getCommon();
            if (Intrinsics.d(id2, (common == null || (action2 = common.getAction()) == null) ? null : action2.getId())) {
                break;
            }
            i11++;
        }
        InterfaceC7851b interfaceC7851b = this.$controller;
        String id3 = ((AtomAction.Click) action).getId();
        if (id3 == null) {
            id3 = "";
        }
        interfaceC7851b.update(new FilterSelectUpdateKey(i11, id3));
        return Boolean.FALSE;
    }
}
