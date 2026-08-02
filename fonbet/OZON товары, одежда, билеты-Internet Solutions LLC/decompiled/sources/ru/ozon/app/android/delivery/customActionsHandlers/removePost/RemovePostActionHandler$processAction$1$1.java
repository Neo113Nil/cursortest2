package ru.ozon.app.android.delivery.customActionsHandlers.removePost;

import Sc.o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.utils.Result;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/utils/Result;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/utils/Result;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RemovePostActionHandler$processAction$1$1 extends AbstractC7737t implements Function1<Result<Unit>, Unit> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ RemovePostActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemovePostActionHandler$processAction$1$1(AtomAction atomAction, RemovePostActionHandler removePostActionHandler, CustomActionHandler.HandlerReferences handlerReferences) {
        super(1);
        this.$action = atomAction;
        this.this$0 = removePostActionHandler;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Result<Unit> result) {
        invoke2(result);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Result<Unit> result) {
        String str;
        JsonParser jsonParser;
        String str2;
        JsonParser jsonParser2;
        if (result instanceof Result.Success) {
            Map<String, String> params = ((AtomAction.Click) this.$action).getParams();
            if (params == null || (str2 = params.get("successInfo")) == null) {
                return;
            }
            jsonParser2 = this.this$0.jsonDeserializer;
            DialogActionInfoDTO dialogActionInfoDTO = (DialogActionInfoDTO) jsonParser2.fromJson(str2, DialogActionInfoDTO.class);
            this.this$0.showSuccessNotification(dialogActionInfoDTO.getNotificationInfo(), this.$handlerRefs.getRefs());
            this.this$0.navigateTo(dialogActionInfoDTO.getLink(), this.$handlerRefs.getRefs().getNavigator());
            return;
        }
        if (!(result instanceof Result.Failure)) {
            throw new o();
        }
        Map<String, String> params2 = ((AtomAction.Click) this.$action).getParams();
        if (params2 == null || (str = params2.get("failureInfo")) == null) {
            return;
        }
        jsonParser = this.this$0.jsonDeserializer;
        DialogActionInfoDTO dialogActionInfoDTO2 = (DialogActionInfoDTO) jsonParser.fromJson(str, DialogActionInfoDTO.class);
        this.this$0.showErrorNotification(dialogActionInfoDTO2.getNotificationInfo(), this.$handlerRefs.getRefs());
        this.this$0.navigateTo(dialogActionInfoDTO2.getLink(), this.$handlerRefs.getRefs().getNavigator());
    }
}
