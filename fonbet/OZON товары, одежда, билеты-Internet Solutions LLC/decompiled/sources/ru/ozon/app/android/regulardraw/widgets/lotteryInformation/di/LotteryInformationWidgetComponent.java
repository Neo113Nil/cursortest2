package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.di;

import Bw.C2676a;
import Sc.InterfaceC4008j;
import Sc.k;
import Ug.a;
import Vg.c;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.core.LotteryInformationMapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0001\u0018B\u0015\b\u0002\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/di/LotteryInformationWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "LUg/a;", "actionHandlerComponent$delegate", "LSc/j;", "getActionHandlerComponent", "()LUg/a;", "actionHandlerComponent", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/core/LotteryInformationMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/core/LotteryInformationMapper;", "mapper", "LVg/c;", "customActionHandlersStore$delegate", "getCustomActionHandlersStore", "()LVg/c;", "customActionHandlersStore", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LotteryInformationWidgetComponent implements InterfaceC6958a {

    /* renamed from: actionHandlerComponent$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandlerComponent;

    /* renamed from: customActionHandlersStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j customActionHandlersStore;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/di/LotteryInformationWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/di/LotteryInformationWidgetComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LotteryInformationWidgetComponent getInstance$lambda$0(C7475g c7475g) {
            return new LotteryInformationWidgetComponent(c7475g, null);
        }

        @NotNull
        public final C7473e<LotteryInformationWidgetComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(LotteryInformationWidgetComponent.class), new C2676a(storage, 6));
        }

        private Companion() {
        }
    }

    public /* synthetic */ LotteryInformationWidgetComponent(C7475g c7475g, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7475g);
    }

    @NotNull
    public final a getActionHandlerComponent() {
        return (a) this.actionHandlerComponent.getValue();
    }

    @NotNull
    public final c getCustomActionHandlersStore() {
        return (c) this.customActionHandlersStore.getValue();
    }

    @NotNull
    public final LotteryInformationMapper getMapper() {
        return (LotteryInformationMapper) this.mapper.getValue();
    }

    private LotteryInformationWidgetComponent(C7475g c7475g) {
        this.actionHandlerComponent = k.b(new LotteryInformationWidgetComponent$actionHandlerComponent$2(c7475g));
        this.mapper = k.b(LotteryInformationWidgetComponent$mapper$2.INSTANCE);
        this.customActionHandlersStore = k.b(new LotteryInformationWidgetComponent$customActionHandlersStore$2(c7475g));
    }
}
