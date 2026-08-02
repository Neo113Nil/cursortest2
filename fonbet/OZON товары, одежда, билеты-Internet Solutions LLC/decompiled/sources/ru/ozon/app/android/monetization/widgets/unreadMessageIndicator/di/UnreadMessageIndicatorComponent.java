package ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.di;

import EV.b;
import Fo.C3057a;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.core.UnreadMessageIndicatorMapper;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation.UnreadMessageIndicatorViewModel;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001a2\u00060\u0001j\u0002`\u0002:\u0001\u001aB\u0015\b\u0002\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0013\u001a\u00060\u000ej\u0002`\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/di/UnreadMessageIndicatorComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/core/UnreadMessageIndicatorMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/core/UnreadMessageIndicatorMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics$delegate", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LPc/a;", "Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Companion", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnreadMessageIndicatorComponent implements InterfaceC6958a {

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j tokenizedAnalytics;

    @NotNull
    private final a<UnreadMessageIndicatorViewModel> viewModelProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/di/UnreadMessageIndicatorComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/di/UnreadMessageIndicatorComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UnreadMessageIndicatorComponent getInstance$lambda$0(C7475g c7475g) {
            return new UnreadMessageIndicatorComponent(c7475g, null);
        }

        @NotNull
        public final C7473e<UnreadMessageIndicatorComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(UnreadMessageIndicatorComponent.class), new C3057a(storage, 2));
        }

        private Companion() {
        }
    }

    public /* synthetic */ UnreadMessageIndicatorComponent(C7475g c7475g, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7475g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UnreadMessageIndicatorViewModel viewModelProvider$lambda$0(C7475g c7475g) {
        return new UnreadMessageIndicatorViewModel(((ActionComponentApi) c7475g.getComponent(ActionComponentApi.class)).getActionRepository());
    }

    @NotNull
    public final UnreadMessageIndicatorMapper getMapper() {
        return (UnreadMessageIndicatorMapper) this.mapper.getValue();
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return (l) this.tokenizedAnalytics.getValue();
    }

    @NotNull
    public final a<UnreadMessageIndicatorViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }

    private UnreadMessageIndicatorComponent(C7475g c7475g) {
        this.mapper = k.b(UnreadMessageIndicatorComponent$mapper$2.INSTANCE);
        this.tokenizedAnalytics = k.b(new UnreadMessageIndicatorComponent$tokenizedAnalytics$2(c7475g));
        this.viewModelProvider = new b(c7475g, 1);
    }
}
