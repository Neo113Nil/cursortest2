package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo;

import Am.C2438a;
import B0.C2454a;
import G.g;
import J0.P;
import Tl.b;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002ABBW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014Jl\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101R\"\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010!\u001a\u0004\b2\u0010#\"\u0004\b3\u00104R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010<\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001b\"\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;", "items", "", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseFreshTileVO;", "tilesToMeasure", "", "backgroundColor", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO$PaddingsVO;", "paddings", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "playerPosition", "<init>", "(JLjava/util/List;Ljava/util/Set;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO$PaddingsVO;LWZ/t;J)V", "copy", "(JLjava/util/List;Ljava/util/Set;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO$PaddingsVO;LWZ/t;J)Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/util/Set;", "getTilesToMeasure", "()Ljava/util/Set;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO$PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO$PaddingsVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getPlayerPosition", "setPlayerPosition", "(J)V", "Landroid/os/Parcelable;", "layoutManagerState", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "setLayoutManagerState", "(Landroid/os/Parcelable;)V", "height", "I", "getHeight", "setHeight", "(I)V", "PaddingsVO", "BeakVO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WiseSkuScrollVO implements c {
    private final String backgroundColor;
    private int height;
    private final long id;

    @NotNull
    private final List<WiseSkuScrollElement> items;
    private Parcelable layoutManagerState;

    @NotNull
    private final PaddingsVO paddings;
    private long playerPosition;

    @NotNull
    private final Set<WiseFreshTileVO> tilesToMeasure;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO$BeakVO;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "pullEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "tokenizedEvent", "<init>", "(LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getPullEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getTokenizedEvent", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BeakVO implements WiseSkuScrollElement {
        private final AtomAction atomAction;
        private final t pullEvent;
        private final t tokenizedEvent;

        public BeakVO(t tVar, AtomAction atomAction, t tVar2) {
            this.pullEvent = tVar;
            this.atomAction = atomAction;
            this.tokenizedEvent = tVar2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BeakVO)) {
                return false;
            }
            BeakVO beakVO = (BeakVO) other;
            return Intrinsics.d(this.pullEvent, beakVO.pullEvent) && Intrinsics.d(this.atomAction, beakVO.atomAction) && Intrinsics.d(this.tokenizedEvent, beakVO.tokenizedEvent);
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement
        public AtomAction getAtomAction() {
            return this.atomAction;
        }

        public final t getPullEvent() {
            return this.pullEvent;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement
        public t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            t tVar = this.pullEvent;
            int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
            AtomAction atomAction = this.atomAction;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar2 = this.tokenizedEvent;
            return hashCode2 + (tVar2 != null ? tVar2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            t tVar = this.pullEvent;
            AtomAction atomAction = this.atomAction;
            t tVar2 = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("BeakVO(pullEvent=");
            sb2.append(tVar);
            sb2.append(", atomAction=");
            sb2.append(atomAction);
            sb2.append(", tokenizedEvent=");
            return b.d(sb2, tVar2, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO$PaddingsVO;", "", "", "top", "bottom", "left", "right", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getLeft", "getRight", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsVO {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public PaddingsVO(int i11, int i12, int i13, int i14) {
            this.top = i11;
            this.bottom = i12;
            this.left = i13;
            this.right = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsVO)) {
                return false;
            }
            PaddingsVO paddingsVO = (PaddingsVO) other;
            return this.top == paddingsVO.top && this.bottom == paddingsVO.bottom && this.left == paddingsVO.left && this.right == paddingsVO.right;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.right) + C2454a.a(this.left, C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.left, this.right, ", right=", ")", C2438a.a("PaddingsVO(top=", this.top, ", bottom=", ", left=", this.bottom));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WiseSkuScrollVO(long j11, @NotNull List<? extends WiseSkuScrollElement> items, @NotNull Set<WiseFreshTileVO> tilesToMeasure, String str, @NotNull PaddingsVO paddings, t tVar, long j12) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tilesToMeasure, "tilesToMeasure");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.items = items;
        this.tilesToMeasure = tilesToMeasure;
        this.backgroundColor = str;
        this.paddings = paddings;
        this.tokenizedEvent = tVar;
        this.playerPosition = j12;
        this.height = -1;
    }

    public static /* synthetic */ WiseSkuScrollVO copy$default(WiseSkuScrollVO wiseSkuScrollVO, long j11, List list, Set set, String str, PaddingsVO paddingsVO, t tVar, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = wiseSkuScrollVO.id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            list = wiseSkuScrollVO.items;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            set = wiseSkuScrollVO.tilesToMeasure;
        }
        Set set2 = set;
        if ((i11 & 8) != 0) {
            str = wiseSkuScrollVO.backgroundColor;
        }
        return wiseSkuScrollVO.copy(j13, list2, set2, str, (i11 & 16) != 0 ? wiseSkuScrollVO.paddings : paddingsVO, (i11 & 32) != 0 ? wiseSkuScrollVO.tokenizedEvent : tVar, (i11 & 64) != 0 ? wiseSkuScrollVO.playerPosition : j12);
    }

    @NotNull
    public final WiseSkuScrollVO copy(long id2, @NotNull List<? extends WiseSkuScrollElement> items, @NotNull Set<WiseFreshTileVO> tilesToMeasure, String backgroundColor, @NotNull PaddingsVO paddings, t tokenizedEvent, long playerPosition) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tilesToMeasure, "tilesToMeasure");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new WiseSkuScrollVO(id2, items, tilesToMeasure, backgroundColor, paddings, tokenizedEvent, playerPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WiseSkuScrollVO)) {
            return false;
        }
        WiseSkuScrollVO wiseSkuScrollVO = (WiseSkuScrollVO) other;
        return this.id == wiseSkuScrollVO.id && Intrinsics.d(this.items, wiseSkuScrollVO.items) && Intrinsics.d(this.tilesToMeasure, wiseSkuScrollVO.tilesToMeasure) && Intrinsics.d(this.backgroundColor, wiseSkuScrollVO.backgroundColor) && Intrinsics.d(this.paddings, wiseSkuScrollVO.paddings) && Intrinsics.d(this.tokenizedEvent, wiseSkuScrollVO.tokenizedEvent) && this.playerPosition == wiseSkuScrollVO.playerPosition;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<WiseSkuScrollElement> getItems() {
        return this.items;
    }

    public final Parcelable getLayoutManagerState() {
        return this.layoutManagerState;
    }

    @NotNull
    public final PaddingsVO getPaddings() {
        return this.paddings;
    }

    public final long getPlayerPosition() {
        return this.playerPosition;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Set<WiseFreshTileVO> getTilesToMeasure() {
        return this.tilesToMeasure;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.tilesToMeasure.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.items)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (this.paddings.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return Long.hashCode(this.playerPosition) + ((hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    public final void setHeight(int i11) {
        this.height = i11;
    }

    public final void setLayoutManagerState(Parcelable parcelable) {
        this.layoutManagerState = parcelable;
    }

    public final void setPlayerPosition(long j11) {
        this.playerPosition = j11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<WiseSkuScrollElement> list = this.items;
        Set<WiseFreshTileVO> set = this.tilesToMeasure;
        String str = this.backgroundColor;
        PaddingsVO paddingsVO = this.paddings;
        t tVar = this.tokenizedEvent;
        long j12 = this.playerPosition;
        StringBuilder b11 = Lh.b.b(j11, "WiseSkuScrollVO(id=", ", items=", list);
        b11.append(", tilesToMeasure=");
        b11.append(set);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", paddings=");
        b11.append(paddingsVO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", playerPosition=");
        b11.append(j12);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ WiseSkuScrollVO(long j11, List list, Set set, String str, PaddingsVO paddingsVO, t tVar, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, set, str, paddingsVO, tVar, (i11 & 64) != 0 ? 0L : j12);
    }
}
