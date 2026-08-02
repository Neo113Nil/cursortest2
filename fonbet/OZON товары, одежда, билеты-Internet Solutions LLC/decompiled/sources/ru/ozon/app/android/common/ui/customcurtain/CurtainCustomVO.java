package ru.ozon.app.android.common.ui.customcurtain;

import Bl.C2639a;
import Ih.a;
import Kk.C3532b;
import Sh.b;
import T7.E;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001*B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010JP\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\u0006\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "isShown", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition;", "showCondition", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JZLru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "copy", "(JZLru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition;", "getShowCondition", "()Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Condition", "shared-views_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CurtainCustomVO implements c {

    @NotNull
    private final AtomActionDTO action;
    private final long id;
    private final boolean isShown;

    @NotNull
    private final Condition showCondition;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition;", "", "<init>", "()V", "PageLoaded", "Timer", "Offset", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition$Offset;", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition$PageLoaded;", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition$Timer;", "shared-views_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Condition {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition$Offset;", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition;", "", "offset", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getOffset", "shared-views_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class Offset extends Condition {
            private final int offset;

            public Offset(int i11) {
                super(null);
                this.offset = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Offset) && this.offset == ((Offset) other).offset;
            }

            public final int getOffset() {
                return this.offset;
            }

            public int hashCode() {
                return Integer.hashCode(this.offset);
            }

            @NotNull
            public String toString() {
                return E.a(this.offset, "Offset(offset=", ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition$PageLoaded;", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition;", "<init>", "()V", "shared-views_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PageLoaded extends Condition {

            @NotNull
            public static final PageLoaded INSTANCE = new PageLoaded();

            private PageLoaded() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition$Timer;", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition;", "", "time", "<init>", "(J)V", "copy", "(J)Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO$Condition$Timer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTime", "()J", "shared-views_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final /* data */ class Timer extends Condition {
            private final long time;

            public Timer(long j11) {
                super(null);
                this.time = j11;
            }

            @NotNull
            public final Timer copy(long time) {
                return new Timer(time);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Timer) && this.time == ((Timer) other).time;
            }

            public final long getTime() {
                return this.time;
            }

            public int hashCode() {
                return Long.hashCode(this.time);
            }

            @NotNull
            public String toString() {
                return b.b(this.time, "Timer(time=", ")");
            }
        }

        public /* synthetic */ Condition(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Condition() {
        }
    }

    public CurtainCustomVO(long j11, boolean z11, @NotNull Condition showCondition, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(showCondition, "showCondition");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.isShown = z11;
        this.showCondition = showCondition;
        this.action = action;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CurtainCustomVO copy$default(CurtainCustomVO curtainCustomVO, long j11, boolean z11, Condition condition, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = curtainCustomVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            z11 = curtainCustomVO.isShown;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            condition = curtainCustomVO.showCondition;
        }
        Condition condition2 = condition;
        if ((i11 & 8) != 0) {
            atomActionDTO = curtainCustomVO.action;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        if ((i11 & 16) != 0) {
            map = curtainCustomVO.trackingInfo;
        }
        return curtainCustomVO.copy(j12, z12, condition2, atomActionDTO2, map);
    }

    @NotNull
    public final CurtainCustomVO copy(long id2, boolean isShown, @NotNull Condition showCondition, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(showCondition, "showCondition");
        Intrinsics.checkNotNullParameter(action, "action");
        return new CurtainCustomVO(id2, isShown, showCondition, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainCustomVO)) {
            return false;
        }
        CurtainCustomVO curtainCustomVO = (CurtainCustomVO) other;
        return this.id == curtainCustomVO.id && this.isShown == curtainCustomVO.isShown && Intrinsics.d(this.showCondition, curtainCustomVO.showCondition) && Intrinsics.d(this.action, curtainCustomVO.action) && Intrinsics.d(this.trackingInfo, curtainCustomVO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Condition getShowCondition() {
        return this.showCondition;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = a.b(this.action, (this.showCondition.hashCode() + C3532b.a(Long.hashCode(this.id) * 31, 31, this.isShown)) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    /* renamed from: isShown, reason: from getter */
    public final boolean getIsShown() {
        return this.isShown;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isShown;
        Condition condition = this.showCondition;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = Bl.b.c(j11, "CurtainCustomVO(id=", ", isShown=", z11);
        c11.append(", showCondition=");
        c11.append(condition);
        c11.append(", action=");
        c11.append(atomActionDTO);
        return C2639a.b(c11, ", trackingInfo=", map, ")");
    }
}
