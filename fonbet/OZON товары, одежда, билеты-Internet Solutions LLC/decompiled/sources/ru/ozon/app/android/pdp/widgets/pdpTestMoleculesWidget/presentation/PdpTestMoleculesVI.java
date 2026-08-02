package ru.ozon.app.android.pdp.widgets.pdpTestMoleculesWidget.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.saleBadge.presentation.SaleBadgeVO;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI$MoleculesWrapper;", "moleculesWrapper", "<init>", "(JLru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI$MoleculesWrapper;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI$MoleculesWrapper;", "getMoleculesWrapper", "()Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI$MoleculesWrapper;", "MoleculesWrapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PdpTestMoleculesVI implements c {
    private final long id;

    @NotNull
    private final MoleculesWrapper moleculesWrapper;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI$MoleculesWrapper;", "", "<init>", "()V", "TimerMolecule", "SaleBadgeMolecule", "Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI$MoleculesWrapper$SaleBadgeMolecule;", "Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI$MoleculesWrapper$TimerMolecule;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class MoleculesWrapper {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI$MoleculesWrapper$SaleBadgeMolecule;", "Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI$MoleculesWrapper;", "Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO;", "badge", "<init>", "(Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO;", "getBadge", "()Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SaleBadgeMolecule extends MoleculesWrapper {

            @NotNull
            private final SaleBadgeVO badge;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SaleBadgeMolecule(@NotNull SaleBadgeVO badge) {
                super(null);
                Intrinsics.checkNotNullParameter(badge, "badge");
                this.badge = badge;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SaleBadgeMolecule) && Intrinsics.d(this.badge, ((SaleBadgeMolecule) other).badge);
            }

            @NotNull
            public final SaleBadgeVO getBadge() {
                return this.badge;
            }

            public int hashCode() {
                return this.badge.hashCode();
            }

            @NotNull
            public String toString() {
                return "SaleBadgeMolecule(badge=" + this.badge + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI$MoleculesWrapper$TimerMolecule;", "Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI$MoleculesWrapper;", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", DynamicElementDTO.TIMER, "<init>", "(Lru/ozon/app/android/timerMolecule/presentation/TimerVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "getTimer", "()Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TimerMolecule extends MoleculesWrapper {

            @NotNull
            private final TimerVO timer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TimerMolecule(@NotNull TimerVO timer) {
                super(null);
                Intrinsics.checkNotNullParameter(timer, "timer");
                this.timer = timer;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TimerMolecule) && Intrinsics.d(this.timer, ((TimerMolecule) other).timer);
            }

            @NotNull
            public final TimerVO getTimer() {
                return this.timer;
            }

            public int hashCode() {
                return this.timer.hashCode();
            }

            @NotNull
            public String toString() {
                return "TimerMolecule(timer=" + this.timer + ")";
            }
        }

        public /* synthetic */ MoleculesWrapper(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private MoleculesWrapper() {
        }
    }

    public PdpTestMoleculesVI(long j11, @NotNull MoleculesWrapper moleculesWrapper) {
        Intrinsics.checkNotNullParameter(moleculesWrapper, "moleculesWrapper");
        this.id = j11;
        this.moleculesWrapper = moleculesWrapper;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdpTestMoleculesVI)) {
            return false;
        }
        PdpTestMoleculesVI pdpTestMoleculesVI = (PdpTestMoleculesVI) other;
        return this.id == pdpTestMoleculesVI.id && Intrinsics.d(this.moleculesWrapper, pdpTestMoleculesVI.moleculesWrapper);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final MoleculesWrapper getMoleculesWrapper() {
        return this.moleculesWrapper;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.moleculesWrapper.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "PdpTestMoleculesVI(id=" + this.id + ", moleculesWrapper=" + this.moleculesWrapper + ")";
    }
}
