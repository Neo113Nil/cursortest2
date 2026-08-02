package ru.ozon.app.android.common.tabs.presentation;

import A00.a;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TabsV2ViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ TabsV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabsV2ViewHolder$actionHandler$2(TabsV2ViewHolder tabsV2ViewHolder) {
        super(1);
        this.this$0 = tabsV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        Integer scrollWidgetKey;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.Refresh)) {
            return Boolean.FALSE;
        }
        AtomAction.Refresh refresh = (AtomAction.Refresh) action;
        if (!Intrinsics.d(refresh.getScrollPosition(), AtomAction.ScrollPosition.None.INSTANCE)) {
            return Boolean.FALSE;
        }
        TabsV2VO boundedData = this.this$0.getBoundedData();
        if (boundedData == null || (scrollWidgetKey = boundedData.getScrollWidgetKey()) == null) {
            return Boolean.FALSE;
        }
        int intValue = scrollWidgetKey.intValue();
        composerReferences = this.this$0.refs;
        InterfaceC7851b.a.a(composerReferences.getController(), refresh.getLink(), null, null, new h.b(new a.C.d(intValue, (int) this.this$0.itemView.getY(), 24, false), null, 2), 6);
        return Boolean.TRUE;
    }
}
