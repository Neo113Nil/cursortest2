package ru.ozon.app.android.pdp.ui.configurators.ugc.selections;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.text.h;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class RefreshSelectionConfigurator$requestKey$2 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ RefreshSelectionConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshSelectionConfigurator$requestKey$2(RefreshSelectionConfigurator refreshSelectionConfigurator) {
        super(0);
        this.this$0 = refreshSelectionConfigurator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String tag;
        ComponentCallbacksC5392m c11 = this.this$0.getContainer().c();
        if (c11 == null || (tag = c11.getTag()) == null) {
            return "submitSelectionFormMobile";
        }
        if (!h.t(tag, "selections", false) || !h.t(tag, "list", false)) {
            tag = null;
        }
        return tag != null ? "refresh_after_dismiss_and_pop_key" : "submitSelectionFormMobile";
    }
}
