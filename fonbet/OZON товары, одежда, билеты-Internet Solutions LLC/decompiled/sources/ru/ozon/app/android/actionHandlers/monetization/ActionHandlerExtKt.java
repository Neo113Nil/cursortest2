package ru.ozon.app.android.actionHandlers.monetization;

import Vg.f;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "createActionHandler", "(LVg/f$a;Lk20/g;)Lkotlin/jvm/functions/Function1;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionHandlerExtKt {
    @NotNull
    public static final Function1<AtomAction, Unit> createActionHandler(@NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        return new ActionHandler.Builder(((RetainComposerComponentApi) widgetComponentStorage.getComponent(RetainComposerComponentApi.class)).getComposerReferencesFactory().create(widgetInfo.a(), widgetInfo.b()), new ActionHandlerExtKt$createActionHandler$1(widgetInfo), new ActionHandlerExtKt$createActionHandler$2(widgetInfo), new ActionHandlerExtKt$createActionHandler$3(widgetInfo)).buildHandler();
    }
}
