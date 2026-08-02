package ru.ozon.app.android.fresh.common.widgets.horizontalListWidget;

import A00.a;
import Tc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Ljava/lang/Class;", "LA00/a$J$a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class AbstractHorizontalListViewMapper$supportedUpdates$2 extends AbstractC7737t implements Function0<List<? extends Class<? extends a.J.InterfaceC0007a>>> {
    final /* synthetic */ AbstractHorizontalListViewMapper<C, State, VO> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractHorizontalListViewMapper$supportedUpdates$2(AbstractHorizontalListViewMapper<C, State, VO> abstractHorizontalListViewMapper) {
        super(0);
        this.this$0 = abstractHorizontalListViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Class<? extends a.J.InterfaceC0007a>> invoke() {
        AbstractHorizontalListViewMapper<C, State, VO> abstractHorizontalListViewMapper = this.this$0;
        b builder = C7714v.B();
        builder.add(PageRefreshUpdate.class);
        builder.add(ScrollStateUpdate.class);
        builder.addAll(abstractHorizontalListViewMapper.getCustomSupportedUpdates());
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
