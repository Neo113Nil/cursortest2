package ru.ozon.app.android.cabinet.scanItIntro.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cabinet.databinding.WidgetScanItIntroBinding;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ScanItIntroViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ ScanItIntroViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScanItIntroViewHolder$actionHandler$1(ScanItIntroViewHolder scanItIntroViewHolder) {
        super(1);
        this.this$0 = scanItIntroViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click action) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        WidgetScanItIntroBinding widgetScanItIntroBinding;
        int i11;
        WidgetScanItIntroBinding widgetScanItIntroBinding2;
        Intrinsics.checkNotNullParameter(action, "action");
        String id2 = action.getId();
        if (id2 != null) {
            ScanItIntroViewHolder scanItIntroViewHolder = this.this$0;
            if (!id2.equals("next")) {
                if (id2.equals("scanIt")) {
                    composerReferences = scanItIntroViewHolder.composerRefs;
                    ComposerExtKt.setResult$default(composerReferences.getContainer(), null, 0, null, 7, null);
                    composerReferences2 = scanItIntroViewHolder.composerRefs;
                    ComposerExtKt.closeFlow(composerReferences2.getContainer());
                    return;
                }
                return;
            }
            widgetScanItIntroBinding = scanItIntroViewHolder.binding;
            RecyclerView.o layoutManager = widgetScanItIntroBinding.pagesRv.getLayoutManager();
            Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            i11 = scanItIntroViewHolder.pagesCount;
            if (findFirstVisibleItemPosition < i11 - 1) {
                widgetScanItIntroBinding2 = scanItIntroViewHolder.binding;
                widgetScanItIntroBinding2.pagesRv.smoothScrollToPosition(findFirstVisibleItemPosition + 1);
            }
        }
    }
}
