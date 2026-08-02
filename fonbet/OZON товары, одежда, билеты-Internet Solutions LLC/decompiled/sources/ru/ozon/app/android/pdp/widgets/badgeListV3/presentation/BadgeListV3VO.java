package ru.ozon.app.android.pdp.widgets.badgeListV3.presentation;

import G.g;
import GR.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.saleBadge.presentation.SaleBadgeVO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import v0.I;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001:\u00010BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV3/presentation/BadgeListV3VO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/pdp/widgets/badgeListV3/presentation/BadgeListV3VO$BadgeWrapper;", "badges", "Lru/ozon/uni/atoms/data/common/Paddings;", "spacedBy", "inset", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lv0/I;", "scrollState", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;Lv0/I;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getSpacedBy", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getInset", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lv0/I;", "getScrollState", "()Lv0/I;", "BadgeWrapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BadgeListV3VO implements c {

    @NotNull
    private final List<BadgeWrapper> badges;
    private final long id;

    @NotNull
    private final Paddings inset;

    @NotNull
    private final I scrollState;

    @NotNull
    private final Paddings spacedBy;
    private final TestInfo testInfo;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV3/presentation/BadgeListV3VO$BadgeWrapper;", "", "<init>", "()V", "DsBadge", "SaleBadge", "Lru/ozon/app/android/pdp/widgets/badgeListV3/presentation/BadgeListV3VO$BadgeWrapper$DsBadge;", "Lru/ozon/app/android/pdp/widgets/badgeListV3/presentation/BadgeListV3VO$BadgeWrapper$SaleBadge;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class BadgeWrapper {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV3/presentation/BadgeListV3VO$BadgeWrapper$DsBadge;", "Lru/ozon/app/android/pdp/widgets/badgeListV3/presentation/BadgeListV3VO$BadgeWrapper;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DsBadge extends BadgeWrapper {

            @NotNull
            private final BadgeDTO badge;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DsBadge(@NotNull BadgeDTO badge) {
                super(null);
                Intrinsics.checkNotNullParameter(badge, "badge");
                this.badge = badge;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DsBadge) && Intrinsics.d(this.badge, ((DsBadge) other).badge);
            }

            @NotNull
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public int hashCode() {
                return this.badge.hashCode();
            }

            @NotNull
            public String toString() {
                return "DsBadge(badge=" + this.badge + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV3/presentation/BadgeListV3VO$BadgeWrapper$SaleBadge;", "Lru/ozon/app/android/pdp/widgets/badgeListV3/presentation/BadgeListV3VO$BadgeWrapper;", "Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO;", "badge", "<init>", "(Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO;", "getBadge", "()Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SaleBadge extends BadgeWrapper {

            @NotNull
            private final SaleBadgeVO badge;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SaleBadge(@NotNull SaleBadgeVO badge) {
                super(null);
                Intrinsics.checkNotNullParameter(badge, "badge");
                this.badge = badge;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SaleBadge) && Intrinsics.d(this.badge, ((SaleBadge) other).badge);
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
                return "SaleBadge(badge=" + this.badge + ")";
            }
        }

        public /* synthetic */ BadgeWrapper(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private BadgeWrapper() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BadgeListV3VO(long j11, @NotNull List<? extends BadgeWrapper> badges, @NotNull Paddings spacedBy, @NotNull Paddings inset, t tVar, TestInfo testInfo, @NotNull I scrollState) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(spacedBy, "spacedBy");
        Intrinsics.checkNotNullParameter(inset, "inset");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.id = j11;
        this.badges = badges;
        this.spacedBy = spacedBy;
        this.inset = inset;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
        this.scrollState = scrollState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeListV3VO)) {
            return false;
        }
        BadgeListV3VO badgeListV3VO = (BadgeListV3VO) other;
        return this.id == badgeListV3VO.id && Intrinsics.d(this.badges, badgeListV3VO.badges) && this.spacedBy == badgeListV3VO.spacedBy && this.inset == badgeListV3VO.inset && Intrinsics.d(this.tokenizedEvent, badgeListV3VO.tokenizedEvent) && Intrinsics.d(this.testInfo, badgeListV3VO.testInfo) && Intrinsics.d(this.scrollState, badgeListV3VO.scrollState);
    }

    @NotNull
    public final List<BadgeWrapper> getBadges() {
        return this.badges;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Paddings getInset() {
        return this.inset;
    }

    @NotNull
    public final I getScrollState() {
        return this.scrollState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Paddings getSpacedBy() {
        return this.spacedBy;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = b.b(this.inset, b.b(this.spacedBy, g.b(Long.hashCode(this.id) * 31, 31, this.badges), 31), 31);
        t tVar = this.tokenizedEvent;
        int hashCode = (b11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return this.scrollState.hashCode() + ((hashCode + (testInfo != null ? testInfo.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<BadgeWrapper> list = this.badges;
        Paddings paddings = this.spacedBy;
        Paddings paddings2 = this.inset;
        t tVar = this.tokenizedEvent;
        TestInfo testInfo = this.testInfo;
        I i11 = this.scrollState;
        StringBuilder b11 = Lh.b.b(j11, "BadgeListV3VO(id=", ", badges=", list);
        b11.append(", spacedBy=");
        b11.append(paddings);
        b11.append(", inset=");
        b11.append(paddings2);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", testInfo=");
        b11.append(testInfo);
        b11.append(", scrollState=");
        b11.append(i11);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ BadgeListV3VO(long j11, List list, Paddings paddings, Paddings paddings2, t tVar, TestInfo testInfo, I i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, paddings, paddings2, tVar, testInfo, (i12 & 64) != 0 ? new I(0, 0) : i11);
    }
}
