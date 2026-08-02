package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ReconciliationActsDeclinerViewHolder$submitActionHandler$2 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ ReconciliationActsDeclinerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReconciliationActsDeclinerViewHolder$submitActionHandler$2(ReconciliationActsDeclinerViewHolder reconciliationActsDeclinerViewHolder) {
        super(1);
        this.this$0 = reconciliationActsDeclinerViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click action) {
        String str;
        ReconciliationActsDeclinerViewModel reconciliationActsDeclinerViewModel;
        JsonParser jsonParser;
        ViewGroup rootView;
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action == null || (params = action.getParams()) == null || (str = params.get("postData")) == null) {
            str = "";
        }
        String link = action.getLink();
        String str2 = link != null ? link : "";
        reconciliationActsDeclinerViewModel = this.this$0.viewModel;
        jsonParser = this.this$0.jsonDeserializer;
        reconciliationActsDeclinerViewModel.submitDecline(jsonParser, str2, str);
        ComponentCallbacksC5392m c11 = this.this$0.references.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        KeyboardUtilsKt.hideKeyboard(rootView);
        rootView.clearFocus();
    }
}
