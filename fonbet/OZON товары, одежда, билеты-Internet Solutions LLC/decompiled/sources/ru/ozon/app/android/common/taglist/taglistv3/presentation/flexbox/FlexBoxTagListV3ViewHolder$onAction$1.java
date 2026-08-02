package ru.ozon.app.android.common.taglist.taglistv3.presentation.flexbox;

import i10.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.common.taglist.taglistv3.TagListUtilsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FlexBoxTagListV3ViewHolder$onAction$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ FlexBoxTagListV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlexBoxTagListV3ViewHolder$onAction$1(FlexBoxTagListV3ViewHolder flexBoxTagListV3ViewHolder) {
        super(1);
        this.this$0 = flexBoxTagListV3ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        d dVar;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AtomAction.Refresh) {
            AtomAction.Refresh refresh = (AtomAction.Refresh) it;
            if (Intrinsics.d(refresh.getId(), "refreshAndScroll")) {
                dVar = this.this$0.widgetInfo;
                l.a loaderType = TagListUtilsKt.getLoaderType(dVar);
                composerReferences = this.this$0.refs;
                TagListUtilsKt.refreshAndScroll(refresh, composerReferences, loaderType);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
