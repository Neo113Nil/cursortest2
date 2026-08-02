package ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation;

import B0.C2454a;
import Bi.a;
import D3.h;
import Kk.C3532b;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004%&'(B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJB\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$State;", "state", "", "asyncData", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$State;Ljava/lang/String;LWZ/t;)V", "copy", "(JLru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$State;Ljava/lang/String;LWZ/t;)Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$State;", "getState", "()Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$State;", "Ljava/lang/String;", "getAsyncData", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "State", "Item", "Skeleton", "BadgeWrapper", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BadgeListVO implements c {
    private final String asyncData;
    private final long id;

    @NotNull
    private final State state;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$BadgeWrapper;", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$Item;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BadgeWrapper implements Item {

        @NotNull
        private final BadgeDTO badge;
        private final long id;

        public BadgeWrapper(long j11, @NotNull BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.id = j11;
            this.badge = badge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadgeWrapper)) {
                return false;
            }
            BadgeWrapper badgeWrapper = (BadgeWrapper) other;
            return this.id == badgeWrapper.id && Intrinsics.d(this.badge, badgeWrapper.badge);
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @Override // ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.BadgeListVO.Item
        public long getId() {
            return this.id;
        }

        public int hashCode() {
            return this.badge.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "BadgeWrapper(id=" + this.id + ", badge=" + this.badge + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$Item;", "", "id", "", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$BadgeWrapper;", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$Skeleton;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Item {
        long getId();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0018\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$Skeleton;", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$Item;", "", "id", "", "width", "height", "<init>", "(JII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getWidth", "getHeight", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Skeleton implements Item {
        private final int height;
        private final long id;
        private final int width;

        public Skeleton(long j11, int i11, int i12) {
            this.id = j11;
            this.width = i11;
            this.height = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Skeleton)) {
                return false;
            }
            Skeleton skeleton = (Skeleton) other;
            return this.id == skeleton.id && this.width == skeleton.width && this.height == skeleton.height;
        }

        public final int getHeight() {
            return this.height;
        }

        @Override // ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.BadgeListVO.Item
        public long getId() {
            return this.id;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + C2454a.a(this.width, Long.hashCode(this.id) * 31, 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            int i11 = this.width;
            return h.b(Ql.c.b(j11, "Skeleton(id=", i11, ", width="), ", height=", this.height, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u0006\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0007\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\n\u0010\u001bR%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$State;", "", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$Item;", "items", "", "isLastBadgeMustBeVisible", "isHorizontalScrollEnabled", "", "maxLines", "isUpdateRequired", "", "", "asyncParameters", "<init>", "(Ljava/util/List;ZZIZLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Z", "()Z", "I", "getMaxLines", "Ljava/util/Map;", "getAsyncParameters", "()Ljava/util/Map;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class State {
        private final Map<String, Object> asyncParameters;
        private final boolean isHorizontalScrollEnabled;
        private final boolean isLastBadgeMustBeVisible;
        private final boolean isUpdateRequired;

        @NotNull
        private final List<Item> items;
        private final int maxLines;

        /* JADX WARN: Multi-variable type inference failed */
        public State(@NotNull List<? extends Item> items, boolean z11, boolean z12, int i11, boolean z13, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
            this.isLastBadgeMustBeVisible = z11;
            this.isHorizontalScrollEnabled = z12;
            this.maxLines = i11;
            this.isUpdateRequired = z13;
            this.asyncParameters = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.d(this.items, state.items) && this.isLastBadgeMustBeVisible == state.isLastBadgeMustBeVisible && this.isHorizontalScrollEnabled == state.isHorizontalScrollEnabled && this.maxLines == state.maxLines && this.isUpdateRequired == state.isUpdateRequired && Intrinsics.d(this.asyncParameters, state.asyncParameters);
        }

        public final Map<String, Object> getAsyncParameters() {
            return this.asyncParameters;
        }

        @NotNull
        public final List<Item> getItems() {
            return this.items;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public int hashCode() {
            int a11 = C3532b.a(C2454a.a(this.maxLines, C3532b.a(C3532b.a(this.items.hashCode() * 31, 31, this.isLastBadgeMustBeVisible), 31, this.isHorizontalScrollEnabled), 31), 31, this.isUpdateRequired);
            Map<String, Object> map = this.asyncParameters;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        /* renamed from: isHorizontalScrollEnabled, reason: from getter */
        public final boolean getIsHorizontalScrollEnabled() {
            return this.isHorizontalScrollEnabled;
        }

        /* renamed from: isLastBadgeMustBeVisible, reason: from getter */
        public final boolean getIsLastBadgeMustBeVisible() {
            return this.isLastBadgeMustBeVisible;
        }

        /* renamed from: isUpdateRequired, reason: from getter */
        public final boolean getIsUpdateRequired() {
            return this.isUpdateRequired;
        }

        @NotNull
        public String toString() {
            return "State(items=" + this.items + ", isLastBadgeMustBeVisible=" + this.isLastBadgeMustBeVisible + ", isHorizontalScrollEnabled=" + this.isHorizontalScrollEnabled + ", maxLines=" + this.maxLines + ", isUpdateRequired=" + this.isUpdateRequired + ", asyncParameters=" + this.asyncParameters + ")";
        }
    }

    public BadgeListVO(long j11, @NotNull State state, String str, t tVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
        this.asyncData = str;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ BadgeListVO copy$default(BadgeListVO badgeListVO, long j11, State state, String str, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = badgeListVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            state = badgeListVO.state;
        }
        State state2 = state;
        if ((i11 & 4) != 0) {
            str = badgeListVO.asyncData;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            tVar = badgeListVO.tokenizedEvent;
        }
        return badgeListVO.copy(j12, state2, str2, tVar);
    }

    @NotNull
    public final BadgeListVO copy(long id2, @NotNull State state, String asyncData, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new BadgeListVO(id2, state, asyncData, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeListVO)) {
            return false;
        }
        BadgeListVO badgeListVO = (BadgeListVO) other;
        return this.id == badgeListVO.id && Intrinsics.d(this.state, badgeListVO.state) && Intrinsics.d(this.asyncData, badgeListVO.asyncData) && Intrinsics.d(this.tokenizedEvent, badgeListVO.tokenizedEvent);
    }

    public final String getAsyncData() {
        return this.asyncData;
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
    public final State getState() {
        return this.state;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.state.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        String str = this.asyncData;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        State state = this.state;
        String str = this.asyncData;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("BadgeListVO(id=");
        sb2.append(j11);
        sb2.append(", state=");
        sb2.append(state);
        a.f(sb2, ", asyncData=", str, ", tokenizedEvent=", tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
