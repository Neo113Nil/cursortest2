package ru.ozon.app.android.search.widgets.commonTapTags;

import Vg.d;
import WZ.e;
import WZ.l;
import WZ.t;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewHolder;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0002\b\u00030\u000ej\u0006\u0012\u0002\b\u0003`\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J[\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00130\u00182\u0012\u0010\u0010\u001a\u000e\u0012\u0002\b\u00030\u000ej\u0006\u0012\u0002\b\u0003`\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u001a\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\f\u0012\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b0\u00182\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/search/widgets/commonTapTags/ApplyTapTagActionHandlerFactory;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/d;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "vh", "", "hideKeyboardOnTapTagClick", "", "applyTapTag", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lru/ozon/composer/ui/widget/k;Z)V", "LWZ/e;", "pageIdAnalyticModifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getTokenizedEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "createActionHandler", "(Lru/ozon/composer/ui/widget/k;LWZ/e;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "LVg/d;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ApplyTapTagActionHandlerFactory {

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;

    public ApplyTapTagActionHandlerFactory(@NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTapTag(AtomAction.Click action, k<?> vh2, boolean hideKeyboardOnTapTagClick) {
        ComponentCallbacksC5392m c11;
        Map<String, String> params = action.getParams();
        String str = params != null ? params.get("text") : null;
        if (str == null) {
            str = "";
        }
        Map<String, String> params2 = action.getParams();
        this.refs.getController().update(new SuggestedTapTagClickKey(str, Boolean.parseBoolean(params2 != null ? params2.get("overrideText") : null)));
        if ((vh2 instanceof TapTagsV3ViewHolder) && hideKeyboardOnTapTagClick && (c11 = this.refs.getContainer().c()) != null) {
            KeyboardUtilsKt.hideKeyboard(c11);
        }
    }

    public static /* synthetic */ Function1 createActionHandler$default(ApplyTapTagActionHandlerFactory applyTapTagActionHandlerFactory, k kVar, e eVar, Function1 function1, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return applyTapTagActionHandlerFactory.createActionHandler(kVar, eVar, function1, z11);
    }

    @NotNull
    public final Function1<AtomAction, Unit> createActionHandler(@NotNull k<?> vh2, @NotNull e pageIdAnalyticModifier, @NotNull Function1<? super AtomAction.SendAnalytics, t> getTokenizedEvent, boolean hideKeyboardOnTapTagClick) {
        Intrinsics.checkNotNullParameter(vh2, "vh");
        Intrinsics.checkNotNullParameter(pageIdAnalyticModifier, "pageIdAnalyticModifier");
        Intrinsics.checkNotNullParameter(getTokenizedEvent, "getTokenizedEvent");
        return new ActionHandler.Builder(this.refs, vh2).customAnalyticHandler(new ApplyTapTagActionHandlerFactory$createActionHandler$1(getTokenizedEvent, this, pageIdAnalyticModifier)).customActionHandlers(new ApplyTapTagActionHandlerFactory$createActionHandler$2(this)).onClick(new ApplyTapTagActionHandlerFactory$createActionHandler$3(this, vh2, hideKeyboardOnTapTagClick)).buildHandler();
    }
}
