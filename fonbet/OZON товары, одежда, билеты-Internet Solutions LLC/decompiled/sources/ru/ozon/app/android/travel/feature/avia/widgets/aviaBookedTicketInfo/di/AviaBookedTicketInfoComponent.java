package ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.di;

import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.data.AviaBookedTicketInfoMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.presentation.AviaBookedTicketInfoViewModel;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0011R\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/di/AviaBookedTicketInfoComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/data/AviaBookedTicketInfoMapper;", "getAviaBookedTicketInfoMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/data/AviaBookedTicketInfoMapper;", "aviaBookedTicketInfoMapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/presentation/AviaBookedTicketInfoViewModel;", "getAviaBookedTicketInfoViewModelProvider", "()LPc/a;", "aviaBookedTicketInfoViewModelProvider", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AviaBookedTicketInfoComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/di/AviaBookedTicketInfoComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/di/AviaBookedTicketInfoComponent;", "create", "(Lk20/g;)Lk20/e;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AviaBookedTicketInfoComponent create$lambda$0(C7475g c7475g) {
            return new AviaBookedTicketInfoComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<AviaBookedTicketInfoComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(AviaBookedTicketInfoComponent.class), new EV.a(storage, 13));
        }
    }

    @NotNull
    AviaBookedTicketInfoMapper getAviaBookedTicketInfoMapper();

    @NotNull
    Pc.a<AviaBookedTicketInfoViewModel> getAviaBookedTicketInfoViewModelProvider();

    @NotNull
    l getTokenizedAnalytics();
}
