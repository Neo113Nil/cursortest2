package ru.ozon.uni.ozi.components.notificationBar.presets;

import Sc.InterfaceC3999a;
import Sc.s;
import Wc.a;
import androidx.compose.foundation.gestures.C5158a;
import androidx.compose.foundation.gestures.C5167j;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m0.InterfaceC7976A;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9133m;
import ru.ozon.uni.foundation.utils.AnimationFactory;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B7\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bB\t\b\u0017¢\u0006\u0004\b\n\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0013R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0011\u0010#\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010&\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState;", "", "Lm0/A;", "", "decayAnimationSpec", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarVisibility;", "initialValue", "Lkotlin/Function1;", "", "confirmValueChange", "<init>", "(Lm0/A;Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarVisibility;Lkotlin/jvm/functions/Function1;)V", "()V", "Lr0/m;", "newAnchors", "", "updateAnchors", "(Lr0/m;)V", "show", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "dismiss", "Lkotlin/Function0;", "onDismiss", "Lkotlin/jvm/functions/Function0;", "getOnDismiss$uni_release", "()Lkotlin/jvm/functions/Function0;", "setOnDismiss$uni_release", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/gestures/j;", "anchoredDraggableState", "Landroidx/compose/foundation/gestures/j;", "getAnchoredDraggableState$uni_release", "()Landroidx/compose/foundation/gestures/j;", "getCurrentValue", "()Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarVisibility;", "currentValue", "getOffset", "()F", "offset", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNotificationBarState {
    public static InterfaceC7976A<Float> decayAnimationSpec;

    @NotNull
    private final C5167j<OziNotificationBarVisibility> anchoredDraggableState;
    private Function0<Unit> onDismiss;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarVisibility;", "invoke", "(Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarVisibility;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarState$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<OziNotificationBarVisibility, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(OziNotificationBarVisibility it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState$Companion;", "", "<init>", "()V", "Lm0/A;", "", "decayAnimationSpec", "Lm0/A;", "getDecayAnimationSpec$uni_release", "()Lm0/A;", "setDecayAnimationSpec$uni_release", "(Lm0/A;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setDecayAnimationSpec$uni_release(@NotNull InterfaceC7976A<Float> interfaceC7976A) {
            Intrinsics.checkNotNullParameter(interfaceC7976A, "<set-?>");
            OziNotificationBarState.decayAnimationSpec = interfaceC7976A;
        }

        private Companion() {
        }
    }

    public OziNotificationBarState(@NotNull InterfaceC7976A<Float> decayAnimationSpec2, @NotNull OziNotificationBarVisibility initialValue, @NotNull Function1<? super OziNotificationBarVisibility, Boolean> confirmValueChange) {
        Intrinsics.checkNotNullParameter(decayAnimationSpec2, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        this.anchoredDraggableState = new C5167j<>(initialValue, OziNotificationBarState$anchoredDraggableState$1.INSTANCE, OziNotificationBarState$anchoredDraggableState$2.INSTANCE, AnimationFactory.INSTANCE.animNotificationBarSwipe$uni_release(), decayAnimationSpec2, confirmValueChange);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dismiss(@NotNull d<? super Unit> dVar) {
        OziNotificationBarState$dismiss$1 oziNotificationBarState$dismiss$1;
        int i11;
        OziNotificationBarState oziNotificationBarState;
        Function0<Unit> function0;
        if (dVar instanceof OziNotificationBarState$dismiss$1) {
            oziNotificationBarState$dismiss$1 = (OziNotificationBarState$dismiss$1) dVar;
            int i12 = oziNotificationBarState$dismiss$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                oziNotificationBarState$dismiss$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = oziNotificationBarState$dismiss$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = oziNotificationBarState$dismiss$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    C5167j<OziNotificationBarVisibility> c5167j = this.anchoredDraggableState;
                    OziNotificationBarVisibility oziNotificationBarVisibility = OziNotificationBarVisibility.Hidden;
                    oziNotificationBarState$dismiss$1.L$0 = this;
                    oziNotificationBarState$dismiss$1.label = 1;
                    if (C5158a.f(c5167j, oziNotificationBarVisibility, oziNotificationBarState$dismiss$1) == aVar) {
                        return aVar;
                    }
                    oziNotificationBarState = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oziNotificationBarState = (OziNotificationBarState) oziNotificationBarState$dismiss$1.L$0;
                    s.b(obj);
                }
                function0 = oziNotificationBarState.onDismiss;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f71690a;
            }
        }
        oziNotificationBarState$dismiss$1 = new OziNotificationBarState$dismiss$1(this, dVar);
        Object obj2 = oziNotificationBarState$dismiss$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = oziNotificationBarState$dismiss$1.label;
        if (i11 != 0) {
        }
        function0 = oziNotificationBarState.onDismiss;
        if (function0 != null) {
        }
        return Unit.f71690a;
    }

    @NotNull
    public final C5167j<OziNotificationBarVisibility> getAnchoredDraggableState$uni_release() {
        return this.anchoredDraggableState;
    }

    @NotNull
    public final OziNotificationBarVisibility getCurrentValue() {
        return this.anchoredDraggableState.l();
    }

    public final float getOffset() {
        return this.anchoredDraggableState.o();
    }

    public final Function0<Unit> getOnDismiss$uni_release() {
        return this.onDismiss;
    }

    public final void setOnDismiss$uni_release(Function0<Unit> function0) {
        this.onDismiss = function0;
    }

    public final Object show(@NotNull d<? super Unit> dVar) {
        Object f7 = C5158a.f(this.anchoredDraggableState, OziNotificationBarVisibility.Shown, dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public final void updateAnchors(@NotNull InterfaceC9133m<OziNotificationBarVisibility> newAnchors) {
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        C5167j.w(this.anchoredDraggableState, newAnchors);
    }

    public /* synthetic */ OziNotificationBarState(InterfaceC7976A interfaceC7976A, OziNotificationBarVisibility oziNotificationBarVisibility, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7976A, (i11 & 2) != 0 ? OziNotificationBarVisibility.Hidden : oziNotificationBarVisibility, (i11 & 4) != 0 ? AnonymousClass1.INSTANCE : function1);
    }

    @InterfaceC3999a
    public OziNotificationBarState() {
        throw new IllegalStateException("Не вызывайте deprecated internal constructor");
    }
}
