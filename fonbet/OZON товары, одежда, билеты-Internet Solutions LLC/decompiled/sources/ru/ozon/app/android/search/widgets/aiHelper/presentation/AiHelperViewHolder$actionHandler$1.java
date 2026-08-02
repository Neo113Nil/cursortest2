package ru.ozon.app.android.search.widgets.aiHelper.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.utils.ClipboardWrapperKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AiHelperViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ AiHelperViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiHelperViewHolder$actionHandler$1(AiHelperViewHolder aiHelperViewHolder) {
        super(1);
        this.this$0 = aiHelperViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click action) {
        AiHelperView aiHelperView;
        AiHelperView aiHelperView2;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(action, "action");
        String id2 = action.getId();
        if (id2 != null) {
            switch (id2.hashCode()) {
                case -1726803540:
                    if (id2.equals("copyDebugInfo")) {
                        Map<String, String> params = action.getParams();
                        String str = params != null ? params.get("debugInfo") : null;
                        if (str == null) {
                            str = "";
                        }
                        ClipboardWrapperKt.toClipboard$default(this.this$0.getContext(), null, str, 1, null);
                        this.this$0.showNotification();
                        break;
                    }
                    break;
                case 97275957:
                    if (id2.equals("dislikeSearchAi")) {
                        aiHelperView = this.this$0.view;
                        aiHelperView.changeDislikeIconState();
                        break;
                    }
                    break;
                case 591605927:
                    if (id2.equals("likeSearchAi")) {
                        aiHelperView2 = this.this$0.view;
                        aiHelperView2.changeLikeIconState();
                        break;
                    }
                    break;
                case 1556162335:
                    if (id2.equals("restartSearchAi")) {
                        composerReferences = this.this$0.refs;
                        InterfaceC7851b.a.e(composerReferences.getController(), action.getLink(), null, null, 6);
                        break;
                    }
                    break;
            }
        }
    }
}
