package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.navigation.newrouter.destinations.tabs.switchs.ClearToRootTabDestination;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BottomCartWidgetOverlayHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ BottomCartWidgetOverlayHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomCartWidgetOverlayHolder$actionHandler$1(BottomCartWidgetOverlayHolder bottomCartWidgetOverlayHolder) {
        super(1);
        this.this$0 = bottomCartWidgetOverlayHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AtomAction.Move) {
            String link = ((AtomAction.Move) it).getLink();
            if (link == null) {
                return Boolean.FALSE;
            }
            String uri = Uri.parse(link).buildUpon().clearQuery().build().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            if (h.t(uri, "25000", false) || h.t(uri, "25001", false)) {
                composerReferences = this.this$0.refs;
                composerReferences.getNavigator().navigate(new ClearToRootTabDestination(MiniAppExtKt.appendExpress(LinkGenerator.INSTANCE.express()).toString()), 0);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
