package ru.ozon.uni.android.notificationbar.handler;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/android/notificationbar/handler/DismissibleActionHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "notificationBar", "actionHandler", "<init>", "(Lru/ozon/uni/android/notificationbar/NotificationBar;Lkotlin/jvm/functions/Function1;)V", "action", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "Lkotlin/jvm/functions/Function1;", "", "Lkotlin/reflect/d;", "nonDismissActions", "Ljava/util/List;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DismissibleActionHandler implements Function1<AtomAction, Unit> {
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final List<d<? extends AtomAction>> nonDismissActions;

    @NotNull
    private final NotificationBar notificationBar;

    /* JADX WARN: Multi-variable type inference failed */
    public DismissibleActionHandler(@NotNull NotificationBar notificationBar, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
        this.notificationBar = notificationBar;
        this.actionHandler = function1;
        this.nonDismissActions = C7714v.b0(N.b(AtomAction.ViewAction.class), N.b(AtomAction.IgnoreViewPoolViewAction.class), N.b(AtomAction.InvalidAction.class), N.b(AtomAction.AppendPayloads.class));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Function1<AtomAction, Unit> function1 = this.actionHandler;
        if (function1 != null) {
            function1.invoke(action);
        }
        if (this.nonDismissActions.contains(N.b(action.getClass()))) {
            return;
        }
        this.notificationBar.dismiss();
    }
}
