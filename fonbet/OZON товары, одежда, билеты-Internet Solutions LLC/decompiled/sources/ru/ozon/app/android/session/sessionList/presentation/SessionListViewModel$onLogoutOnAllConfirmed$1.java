package ru.ozon.app.android.session.sessionList.presentation;

import Sc.s;
import Wc.a;
import androidx.lifecycle.x0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.session.SessionListUpdatedEventBus;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.session.sessionList.presentation.SessionListEvent;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SessionListViewModel$onLogoutOnAllConfirmed$1 extends AbstractC7737t implements Function1<ActionV2Response<Object>, Unit> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ boolean $logoutUser;
    final /* synthetic */ SessionListViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.session.sessionList.presentation.SessionListViewModel$onLogoutOnAllConfirmed$1$1", f = "SessionListViewModel.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.session.sessionList.presentation.SessionListViewModel$onLogoutOnAllConfirmed$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ SessionListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SessionListViewModel sessionListViewModel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = sessionListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SessionListUpdatedEventBus sessionListUpdatedEventBus;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                sessionListUpdatedEventBus = this.this$0.sessionListUpdatedEventBus;
                this.label = 1;
                if (sessionListUpdatedEventBus.emit(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionListViewModel$onLogoutOnAllConfirmed$1(AtomAction.ComposerAction composerAction, SessionListViewModel sessionListViewModel, boolean z11) {
        super(1);
        this.$action = composerAction;
        this.this$0 = sessionListViewModel;
        this.$logoutUser = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionV2Response<Object> actionV2Response) {
        invoke2(actionV2Response);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActionV2Response<Object> actionV2Response) {
        SessionListEvent closeScreen;
        Map<String, String> params = this.$action.getParams();
        String str = params != null ? params.get("restrictionMessage") : null;
        SingleLiveEvent<SessionListEvent> events = this.this$0.getEvents();
        if (this.$logoutUser) {
            closeScreen = new SessionListEvent.NavigateToHome(str);
        } else {
            C10727i.c(x0.a(this.this$0), null, null, new AnonymousClass1(this.this$0, null), 3);
            closeScreen = new SessionListEvent.CloseScreen(str);
        }
        events.setValue(closeScreen);
    }
}
