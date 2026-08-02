package ru.ozon.app.android.ugc.core.widgets.timerButton.di;

import AL.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.timerButton.presentation.TimerButtonViewModel;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0013B\u0015\b\u0002\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001f\u0010\u000e\u001a\u00060\bj\u0002`\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/timerButton/di/TimerButtonComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "LSc/j;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonViewModel;", "getViewModel", "()Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonViewModel;", "viewModel", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimerButtonComponent implements InterfaceC6958a {

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j customActionHandlersStoreFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/timerButton/di/TimerButtonComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/timerButton/di/TimerButtonComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TimerButtonComponent getInstance$lambda$0(C7475g c7475g) {
            return new TimerButtonComponent(c7475g, null);
        }

        @NotNull
        public final C7473e<TimerButtonComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TimerButtonComponent.class), new a(storage, 6));
        }

        private Companion() {
        }
    }

    public /* synthetic */ TimerButtonComponent(C7475g c7475g, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7475g);
    }

    @NotNull
    public final d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @NotNull
    public final TimerButtonViewModel getViewModel() {
        return new TimerButtonViewModel();
    }

    private TimerButtonComponent(C7475g c7475g) {
        this.customActionHandlersStoreFactory = k.b(new TimerButtonComponent$customActionHandlersStoreFactory$2(c7475g));
    }
}
