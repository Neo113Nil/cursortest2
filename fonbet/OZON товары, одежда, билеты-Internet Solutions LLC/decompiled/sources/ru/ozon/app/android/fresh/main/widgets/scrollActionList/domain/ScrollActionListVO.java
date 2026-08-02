package ru.ozon.app.android.fresh.main.widgets.scrollActionList.domain;

import Am.C2438a;
import B0.C2454a;
import G.g;
import J0.P;
import Lh.b;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00010BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J^\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "", "backgroundColor", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO$PaddingsVO;", "paddings", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Landroid/os/Parcelable;", "scrollState", "<init>", "(JLjava/util/List;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO$PaddingsVO;LWZ/t;Landroid/os/Parcelable;)V", "copy", "(JLjava/util/List;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO$PaddingsVO;LWZ/t;Landroid/os/Parcelable;)Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO$PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO$PaddingsVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "PaddingsVO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ScrollActionListVO implements c {
    private final String backgroundColor;

    @NotNull
    private final List<BadgeDTO> badges;
    private final long id;

    @NotNull
    private final PaddingsVO paddings;
    private final Parcelable scrollState;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO$PaddingsVO;", "", "", "top", "horizontal", "bottom", "between", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getHorizontal", "getBottom", "getBetween", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsVO {
        private final int between;
        private final int bottom;
        private final int horizontal;
        private final int top;

        public PaddingsVO(int i11, int i12, int i13, int i14) {
            this.top = i11;
            this.horizontal = i12;
            this.bottom = i13;
            this.between = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsVO)) {
                return false;
            }
            PaddingsVO paddingsVO = (PaddingsVO) other;
            return this.top == paddingsVO.top && this.horizontal == paddingsVO.horizontal && this.bottom == paddingsVO.bottom && this.between == paddingsVO.between;
        }

        public final int getBetween() {
            return this.between;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getHorizontal() {
            return this.horizontal;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.between) + C2454a.a(this.bottom, C2454a.a(this.horizontal, Integer.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.bottom, this.between, ", between=", ")", C2438a.a("PaddingsVO(top=", this.top, ", horizontal=", ", bottom=", this.horizontal));
        }
    }

    public ScrollActionListVO(long j11, @NotNull List<BadgeDTO> badges, String str, @NotNull PaddingsVO paddings, t tVar, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.badges = badges;
        this.backgroundColor = str;
        this.paddings = paddings;
        this.tokenizedEvent = tVar;
        this.scrollState = parcelable;
    }

    public static /* synthetic */ ScrollActionListVO copy$default(ScrollActionListVO scrollActionListVO, long j11, List list, String str, PaddingsVO paddingsVO, t tVar, Parcelable parcelable, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = scrollActionListVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = scrollActionListVO.badges;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            str = scrollActionListVO.backgroundColor;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            paddingsVO = scrollActionListVO.paddings;
        }
        PaddingsVO paddingsVO2 = paddingsVO;
        if ((i11 & 16) != 0) {
            tVar = scrollActionListVO.tokenizedEvent;
        }
        t tVar2 = tVar;
        if ((i11 & 32) != 0) {
            parcelable = scrollActionListVO.scrollState;
        }
        return scrollActionListVO.copy(j12, list2, str2, paddingsVO2, tVar2, parcelable);
    }

    @NotNull
    public final ScrollActionListVO copy(long id2, @NotNull List<BadgeDTO> badges, String backgroundColor, @NotNull PaddingsVO paddings, t tokenizedEvent, Parcelable scrollState) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new ScrollActionListVO(id2, badges, backgroundColor, paddings, tokenizedEvent, scrollState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollActionListVO)) {
            return false;
        }
        ScrollActionListVO scrollActionListVO = (ScrollActionListVO) other;
        return this.id == scrollActionListVO.id && Intrinsics.d(this.badges, scrollActionListVO.badges) && Intrinsics.d(this.backgroundColor, scrollActionListVO.backgroundColor) && Intrinsics.d(this.paddings, scrollActionListVO.paddings) && Intrinsics.d(this.tokenizedEvent, scrollActionListVO.tokenizedEvent) && Intrinsics.d(this.scrollState, scrollActionListVO.scrollState);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final PaddingsVO getPaddings() {
        return this.paddings;
    }

    public final Parcelable getScrollState() {
        return this.scrollState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.badges);
        String str = this.backgroundColor;
        int hashCode = (this.paddings.hashCode() + ((b11 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Parcelable parcelable = this.scrollState;
        return hashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<BadgeDTO> list = this.badges;
        String str = this.backgroundColor;
        PaddingsVO paddingsVO = this.paddings;
        t tVar = this.tokenizedEvent;
        Parcelable parcelable = this.scrollState;
        StringBuilder b11 = b.b(j11, "ScrollActionListVO(id=", ", badges=", list);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", paddings=");
        b11.append(paddingsVO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", scrollState=");
        b11.append(parcelable);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ ScrollActionListVO(long j11, List list, String str, PaddingsVO paddingsVO, t tVar, Parcelable parcelable, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, str, paddingsVO, tVar, (i11 & 32) != 0 ? null : parcelable);
    }
}
