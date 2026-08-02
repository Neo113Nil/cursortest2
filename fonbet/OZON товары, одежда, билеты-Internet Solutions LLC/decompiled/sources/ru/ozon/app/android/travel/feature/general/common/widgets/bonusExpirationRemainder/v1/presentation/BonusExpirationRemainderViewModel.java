package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Bl.b;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.data.BonusExpirationRemainderRepository;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0004%&'(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\n2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderRepository;", "repository", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchers", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderRepository;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "key", "", "getTimestamp", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "item", "", "processItem", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;)V", "id", "", "params", "onCloseClicked", "(JLjava/util/Map;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderRepository;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "LAe/x0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$BonusAction;", "_resultFlow", "LAe/x0;", "LAe/M0;", "resultFlow", "LAe/M0;", "getResultFlow", "()LAe/M0;", "Lxe/B0;", "processJob", "Lxe/B0;", "Ignore", "BonusAction", "RemoveWidget", "ShowItem", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BonusExpirationRemainderViewModel extends w0 {

    @NotNull
    private final x0<BonusAction> _resultFlow;

    @NotNull
    private final CoroutineDispatcherProvider dispatchers;
    private B0 processJob;

    @NotNull
    private final BonusExpirationRemainderRepository repository;

    @NotNull
    private final M0<BonusAction> resultFlow;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$BonusAction;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$Ignore;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$RemoveWidget;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$ShowItem;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface BonusAction {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$Ignore;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$BonusAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Ignore implements BonusAction {

        @NotNull
        public static final Ignore INSTANCE = new Ignore();

        private Ignore() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Ignore);
        }

        public int hashCode() {
            return -624825354;
        }

        @NotNull
        public String toString() {
            return "Ignore";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$RemoveWidget;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$BonusAction;", "", "id", "", "withoutAnimation", "<init>", "(JZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getWithoutAnimation", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveWidget implements BonusAction {
        private final long id;
        private final boolean withoutAnimation;

        public RemoveWidget(long j11, boolean z11) {
            this.id = j11;
            this.withoutAnimation = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoveWidget)) {
                return false;
            }
            RemoveWidget removeWidget = (RemoveWidget) other;
            return this.id == removeWidget.id && this.withoutAnimation == removeWidget.withoutAnimation;
        }

        public final long getId() {
            return this.id;
        }

        public final boolean getWithoutAnimation() {
            return this.withoutAnimation;
        }

        public int hashCode() {
            return Boolean.hashCode(this.withoutAnimation) + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder c11 = b.c(this.id, "RemoveWidget(id=", ", withoutAnimation=", this.withoutAnimation);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$ShowItem;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel$BonusAction;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "item", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "getItem", "()Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowItem implements BonusAction {

        @NotNull
        private final BonusExpirationRemainderVI item;

        public ShowItem(@NotNull BonusExpirationRemainderVI item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowItem) && Intrinsics.d(this.item, ((ShowItem) other).item);
        }

        @NotNull
        public final BonusExpirationRemainderVI getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        @NotNull
        public String toString() {
            return "ShowItem(item=" + this.item + ")";
        }
    }

    public BonusExpirationRemainderViewModel(@NotNull BonusExpirationRemainderRepository repository, @NotNull CoroutineDispatcherProvider dispatchers) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.repository = repository;
        this.dispatchers = dispatchers;
        x0<BonusAction> a11 = O0.a(Ignore.INSTANCE);
        this._resultFlow = a11;
        this.resultFlow = C2399j.b(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getTimestamp(String str, d<? super Long> dVar) {
        return C10727i.f(this.dispatchers.getIO(), new BonusExpirationRemainderViewModel$getTimestamp$2(this, str, null), dVar);
    }

    @NotNull
    public final M0<BonusAction> getResultFlow() {
        return this.resultFlow;
    }

    public final void onCloseClicked(long id2, Map<String, String> params) {
        String str;
        String str2;
        Long y02;
        if (params == null || (str = params.get("key")) == null || (str2 = params.get("keyValue")) == null || (y02 = h.y0(str2)) == null) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new BonusExpirationRemainderViewModel$onCloseClicked$1(this, id2, str, y02.longValue(), null), 3);
    }

    public final void processItem(@NotNull BonusExpirationRemainderVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        B0 b02 = this.processJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.processJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new BonusExpirationRemainderViewModel$processItem$1(item, this, null), 3);
    }
}
