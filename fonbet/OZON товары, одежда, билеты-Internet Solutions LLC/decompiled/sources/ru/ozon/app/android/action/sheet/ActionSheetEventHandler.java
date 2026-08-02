package ru.ozon.app.android.action.sheet;

import BT.b;
import L9.c;
import Lz.d;
import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@InterfaceC3999a
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "", "<init>", "()V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "requestId", "", "accept", "(Lru/ozon/uni/atoms/af/AtomAction;J)V", "Lkotlin/Function1;", "onNext", "Lnc/b;", "handle", "(Lkotlin/jvm/functions/Function1;J)Lnc/b;", "LL9/c;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler$ActionDTO;", "kotlin.jvm.PlatformType", "actions", "LL9/c;", "ActionDTO", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionSheetEventHandler {

    @NotNull
    private final c<ActionDTO> actions;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetEventHandler$ActionDTO;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "requestId", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "J", "getRequestId", "()J", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    static final /* data */ class ActionDTO {

        @NotNull
        private final AtomAction action;
        private final long requestId;

        public ActionDTO(@NotNull AtomAction action, long j11) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.requestId = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionDTO)) {
                return false;
            }
            ActionDTO actionDTO = (ActionDTO) other;
            return Intrinsics.d(this.action, actionDTO.action) && this.requestId == actionDTO.requestId;
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public final long getRequestId() {
            return this.requestId;
        }

        public int hashCode() {
            return Long.hashCode(this.requestId) + (this.action.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ActionDTO(action=" + this.action + ", requestId=" + this.requestId + ")";
        }
    }

    public ActionSheetEventHandler() {
        c<ActionDTO> c11 = c.c();
        Intrinsics.checkNotNullExpressionValue(c11, "create(...)");
        this.actions = c11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handle$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtomAction handle$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AtomAction) function1.invoke(p02);
    }

    public final void accept(@NotNull AtomAction action, long requestId) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.actions.accept(new ActionDTO(action, requestId));
    }

    @NotNull
    public final InterfaceC8487b handle(@NotNull Function1<? super AtomAction, Unit> onNext, long requestId) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        InterfaceC8487b subscribe = this.actions.filter(new Cw.c(new ActionSheetEventHandler$handle$1(requestId), 17)).map(new b(ActionSheetEventHandler$handle$2.INSTANCE, 13)).subscribe(new BT.c(new ActionSheetEventHandler$handle$3(onNext), 8), new d(ActionSheetEventHandler$handle$4.INSTANCE, 9));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        return subscribe;
    }
}
