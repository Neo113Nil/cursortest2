package ru.ozon.app.android.update;

import Sc.o;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ActivityC5043j;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.update.InAppUpdateControllerImpl;
import ru.ozon.app.android.update.analytics.InAppUpdateAnalyticsDelegate;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/update/InAppUpdateControllerImpl$StateMessage;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/update/InAppUpdateControllerImpl$StateMessage;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class InAppUpdateControllerImpl$onActivityCreated$1 extends AbstractC7737t implements Function1<InAppUpdateControllerImpl.StateMessage, Unit> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ InAppUpdateControllerImpl this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.update.InAppUpdateControllerImpl$onActivityCreated$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ String $buttonText;
        final /* synthetic */ InAppUpdateControllerImpl.StateMessage $state;
        final /* synthetic */ InAppUpdateControllerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InAppUpdateControllerImpl inAppUpdateControllerImpl, InAppUpdateControllerImpl.StateMessage stateMessage, String str) {
            super(0);
            this.this$0 = inAppUpdateControllerImpl;
            this.$state = stateMessage;
            this.$buttonText = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InAppUpdateAnalyticsDelegate inAppUpdateAnalyticsDelegate;
            InAppUpdateRepository inAppUpdateRepository;
            inAppUpdateAnalyticsDelegate = this.this$0.inAppUpdateAnalyticsDelegate;
            inAppUpdateAnalyticsDelegate.track(ActionType.CLICK.INSTANCE, ((InAppUpdateControllerImpl.StateMessage.SuccessMessage) this.$state).getType(), this.$buttonText);
            inAppUpdateRepository = this.this$0.inAppUpdateRepository;
            inAppUpdateRepository.completeUpdate(((InAppUpdateControllerImpl.StateMessage.SuccessMessage) this.$state).getType());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppUpdateControllerImpl$onActivityCreated$1(InAppUpdateControllerImpl inAppUpdateControllerImpl, Activity activity) {
        super(1);
        this.this$0 = inAppUpdateControllerImpl;
        this.$activity = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InAppUpdateControllerImpl.StateMessage stateMessage) {
        invoke2(stateMessage);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InAppUpdateControllerImpl.StateMessage stateMessage) {
        InAppUpdateAnalyticsDelegate inAppUpdateAnalyticsDelegate;
        InAppUpdateAnalyticsDelegate inAppUpdateAnalyticsDelegate2;
        if (stateMessage instanceof InAppUpdateControllerImpl.StateMessage.ErrorMessage) {
            String string = StringProvider.getString(R$string.error_flashbar_update_in_app_failed_android);
            inAppUpdateAnalyticsDelegate2 = this.this$0.inAppUpdateAnalyticsDelegate;
            inAppUpdateAnalyticsDelegate2.track(ActionType.PAGE_VIEW.INSTANCE, ((InAppUpdateControllerImpl.StateMessage.ErrorMessage) stateMessage).getType(), string);
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            View decorView = ((ActivityC5043j) this.$activity).getWindow().getDecorView();
            Intrinsics.g(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            FlashbarFactory.createDefaultError$default(flashbarFactory, (ViewGroup) decorView, null, string, null, null, null, (J) this.$activity, 58, null).show();
            return;
        }
        if (!(stateMessage instanceof InAppUpdateControllerImpl.StateMessage.SuccessMessage)) {
            throw new o();
        }
        String string2 = StringProvider.getString(R$string.flashbar_update_in_app_title_android);
        String string3 = StringProvider.getString(R$string.flashbar_update_in_app_restart_android);
        inAppUpdateAnalyticsDelegate = this.this$0.inAppUpdateAnalyticsDelegate;
        inAppUpdateAnalyticsDelegate.track(ActionType.PAGE_VIEW.INSTANCE, ((InAppUpdateControllerImpl.StateMessage.SuccessMessage) stateMessage).getType(), string2);
        FlashbarFactory flashbarFactory2 = FlashbarFactory.INSTANCE;
        View decorView2 = ((ActivityC5043j) this.$activity).getWindow().getDecorView();
        Intrinsics.g(decorView2, "null cannot be cast to non-null type android.view.ViewGroup");
        FlashbarFactory.create$default(flashbarFactory2, (ViewGroup) decorView2, OzonSpannableStringKt.toOzonSpannableString(string2), OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.flashbar_update_in_app_message_android)), null, null, null, null, null, null, new Action(string3, true, new AnonymousClass1(this.this$0, stateMessage, string3)), null, null, null, null, null, null, (J) this.$activity, 65016, null).show();
    }
}
