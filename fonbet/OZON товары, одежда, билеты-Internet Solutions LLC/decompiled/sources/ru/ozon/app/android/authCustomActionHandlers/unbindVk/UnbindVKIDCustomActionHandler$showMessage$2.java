package ru.ozon.app.android.authCustomActionHandlers.unbindVk;

import Sc.s;
import Wc.a;
import a00.C4911f;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.authCustomActionHandlers.email.ActionDTO;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.authCustomActionHandlers.unbindVk.UnbindVKIDCustomActionHandler$showMessage$2", f = "UnbindVKIDCustomActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class UnbindVKIDCustomActionHandler$showMessage$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C4911f $container;
    final /* synthetic */ ActionDTO.MessageDTO $message;
    int label;
    final /* synthetic */ UnbindVKIDCustomActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnbindVKIDCustomActionHandler$showMessage$2(C4911f c4911f, UnbindVKIDCustomActionHandler unbindVKIDCustomActionHandler, ActionDTO.MessageDTO messageDTO, d<? super UnbindVKIDCustomActionHandler$showMessage$2> dVar) {
        super(2, dVar);
        this.$container = c4911f;
        this.this$0 = unbindVKIDCustomActionHandler;
        this.$message = messageDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UnbindVKIDCustomActionHandler$showMessage$2(this.$container, this.this$0, this.$message, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Pair messageIcon;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ViewGroup rootView = ContextExtKt.getRootView(this.$container.a());
        if (rootView == null) {
            return Unit.f71690a;
        }
        messageIcon = this.this$0.getMessageIcon(this.$message);
        Integer num = (Integer) messageIcon.a();
        String str = (String) messageIcon.b();
        FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(this.$message.getMessage());
        String subtitle = this.$message.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        FlashbarFactory.create$default(flashbarFactory, rootView, ozonSpannableString, OzonSpannableStringKt.toOzonSpannableString(subtitle), null, null, num, null, str, null, null, null, null, null, new Long(3000L), null, null, this.$container.g(), 57176, null).show();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((UnbindVKIDCustomActionHandler$showMessage$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
