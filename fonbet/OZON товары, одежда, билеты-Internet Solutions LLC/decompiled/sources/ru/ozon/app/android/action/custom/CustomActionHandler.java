package ru.ozon.app.android.action.custom;

import Sc.InterfaceC3999a;
import Tg.b;
import Vg.f;
import W10.c;
import a00.C4911f;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@InterfaceC3999a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/action/custom/CustomActionHandler;", "LVg/f;", "<init>", "()V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "LTg/b;", "LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "HandlerReferences", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CustomActionHandler extends f {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R6\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010 \u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function0;", "", "", "nestedPagesProvider", "Lru/ozon/composer/ui/widget/l;", "viewItem", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function0;Lru/ozon/composer/ui/widget/l;LW10/c;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "getRefs", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function0;", "getNestedPagesProvider", "()Lkotlin/jvm/functions/Function0;", "setNestedPagesProvider", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/composer/ui/widget/l;", "getViewItem", "()Lru/ozon/composer/ui/widget/l;", "LW10/c;", "getTrackingData", "()LW10/c;", "", "getVoId", "()Ljava/lang/Long;", "voId", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class HandlerReferences {

        @NotNull
        private Function0<? extends Map<String, String>> nestedPagesProvider;

        @NotNull
        private final ComposerReferences refs;
        private final c trackingData;
        private final l viewItem;

        public HandlerReferences(@NotNull ComposerReferences refs, @NotNull Function0<? extends Map<String, String>> nestedPagesProvider, l lVar, c cVar) {
            Intrinsics.checkNotNullParameter(refs, "refs");
            Intrinsics.checkNotNullParameter(nestedPagesProvider, "nestedPagesProvider");
            this.refs = refs;
            this.nestedPagesProvider = nestedPagesProvider;
            this.viewItem = lVar;
            this.trackingData = cVar;
        }

        @NotNull
        public final Function0<Map<String, String>> getNestedPagesProvider() {
            return this.nestedPagesProvider;
        }

        @NotNull
        public final ComposerReferences getRefs() {
            return this.refs;
        }

        public final c getTrackingData() {
            return this.trackingData;
        }

        public final l getViewItem() {
            return this.viewItem;
        }

        public final Long getVoId() {
            l lVar = this.viewItem;
            if (lVar != null) {
                return Long.valueOf(lVar.f());
            }
            return null;
        }
    }

    public abstract void processAction(@NotNull AtomAction action, @NotNull HandlerReferences handlerRefs);

    @Override // Vg.f
    public final void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        processAction((AtomAction) action, new HandlerReferences(((RetainComposerComponentApi) widgetComponentStorage.getComponent(RetainComposerComponentApi.class)).getComposerReferencesFactory().create(new C4911f(widgetInfo.a().e()), widgetInfo.b()), new CustomActionHandler$processWidgetAction$1(widgetInfo), widgetInfo.c(), widgetInfo.c().n()));
    }
}
