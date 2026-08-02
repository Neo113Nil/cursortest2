package A5;

import android.util.SparseBooleanArray;
import android.widget.AbsListView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: A5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1013a extends C1019g {

    /* renamed from: G, reason: collision with root package name */
    public final AbsListView f95G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f96H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f97I;

    /* renamed from: J, reason: collision with root package name */
    public final int f98J;

    /* renamed from: K, reason: collision with root package name */
    public final int f99K;

    /* renamed from: L, reason: collision with root package name */
    public final List f100L;

    /* renamed from: M, reason: collision with root package name */
    public final String f101M;

    /* renamed from: N, reason: collision with root package name */
    public final int f102N;

    /* renamed from: O, reason: collision with root package name */
    public final int f103O;

    /* renamed from: P, reason: collision with root package name */
    public final int f104P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f105Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f106R;

    /* renamed from: S, reason: collision with root package name */
    public final boolean f107S;

    /* renamed from: T, reason: collision with root package name */
    public final boolean f108T;

    /* renamed from: U, reason: collision with root package name */
    public final boolean f109U;

    /* renamed from: V, reason: collision with root package name */
    public final boolean f110V;

    /* renamed from: W, reason: collision with root package name */
    public final boolean f111W;

    /* renamed from: X, reason: collision with root package name */
    public final boolean f112X;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r6 = A5.AbstractC1014b.d(r6);
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1013a(AbsListView absListView, boolean z10, boolean z11, int i10, int i11, List list, String str, int i12, int i13, int i14, int i15, int i16, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(absListView, r2, r3, r4, r5, r6, (i17 & 64) != 0 ? AbstractC1014b.c(absListView) : str, (i17 & 128) != 0 ? absListView.getPaddingTop() : i12, (i17 & 256) != 0 ? absListView.getPaddingBottom() : i13, (i17 & 512) != 0 ? absListView.getPaddingLeft() : i14, (i17 & 1024) != 0 ? absListView.getPaddingRight() : i15, (i17 & 2048) != 0 ? absListView.getSolidColor() : i16, (i17 & 4096) != 0 ? absListView.hasTextFilter() : z12, (i17 & 8192) != 0 ? absListView.isFastScrollAlwaysVisible() : z13, (i17 & 16384) != 0 ? absListView.isScrollingCacheEnabled() : z14, (i17 & 32768) != 0 ? absListView.isSmoothScrollbarEnabled() : z15, (i17 & PKIFailureInfo.notAuthorized) != 0 ? absListView.isStackFromBottom() : z16, (i17 & PKIFailureInfo.unsupportedVersion) != 0 ? absListView.isTextFilterEnabled() : z17);
        List list2;
        boolean canScrollList = (i17 & 2) != 0 ? absListView.canScrollList(1) : z10;
        boolean canScrollList2 = (i17 & 4) != 0 ? absListView.canScrollList(-1) : z11;
        int cacheColorHint = (i17 & 8) != 0 ? absListView.getCacheColorHint() : i10;
        int checkedItemCount = (i17 & 16) != 0 ? absListView.getCheckedItemCount() : i11;
        if ((i17 & 32) != 0) {
            SparseBooleanArray checkedItemPositions = absListView.getCheckedItemPositions();
            if (checkedItemPositions == null || list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
        } else {
            list2 = list;
        }
    }

    @Override // A5.C1019g, A5.E, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1013a) || !super.equals(obj)) {
            return false;
        }
        C1013a c1013a = (C1013a) obj;
        return Intrinsics.areEqual(this.f95G, c1013a.f95G) && this.f96H == c1013a.f96H && this.f97I == c1013a.f97I && this.f98J == c1013a.f98J && this.f99K == c1013a.f99K && Intrinsics.areEqual(this.f100L, c1013a.f100L) && Intrinsics.areEqual(this.f101M, c1013a.f101M) && this.f102N == c1013a.f102N && this.f103O == c1013a.f103O && this.f104P == c1013a.f104P && this.f105Q == c1013a.f105Q && this.f106R == c1013a.f106R && this.f107S == c1013a.f107S && this.f108T == c1013a.f108T && this.f109U == c1013a.f109U && this.f110V == c1013a.f110V && this.f111W == c1013a.f111W && this.f112X == c1013a.f112X;
    }

    @Override // A5.C1019g, A5.E, A5.H
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f95G.hashCode()) * 31) + Boolean.hashCode(this.f96H)) * 31) + Boolean.hashCode(this.f97I)) * 31) + this.f98J) * 31) + this.f99K) * 31) + this.f100L.hashCode()) * 31) + this.f101M.hashCode()) * 31) + this.f102N) * 31) + this.f103O) * 31) + this.f104P) * 31) + this.f105Q) * 31) + this.f106R) * 31) + Boolean.hashCode(this.f107S)) * 31) + Boolean.hashCode(this.f108T)) * 31) + Boolean.hashCode(this.f109U)) * 31) + Boolean.hashCode(this.f110V)) * 31) + Boolean.hashCode(this.f111W)) * 31) + Boolean.hashCode(this.f112X);
    }

    @Override // A5.C1019g, A5.E, A5.H
    public String toString() {
        return "AbsListViewMetadata(stackFromBottom=" + this.f111W + ", textFilterEnabled=" + this.f112X + ", smoothScrollbarEnabled=" + this.f110V + ", scrollingCacheEnabled=" + this.f109U + ", fastScrollAlwaysVisible=" + this.f108T + ", hasTextFilter=" + this.f107S + ", solidColor=" + this.f106R + ", listPaddingRight=" + this.f105Q + ", listPaddingLeft=" + this.f104P + ", listPaddingBottom=" + this.f103O + ", listPaddingTop=" + this.f102N + ", choiceMode='" + this.f101M + "', checkedItemPositions=" + this.f100L + ", checkedItemCount=" + this.f99K + ", cacheColorHint=" + this.f98J + ", canScrollListUp=" + this.f97I + ", canScrollListDown=" + this.f96H + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1013a(AbsListView absListView, boolean z10, boolean z11, int i10, int i11, List checkedItemPositions, String choiceMode, int i12, int i13, int i14, int i15, int i16, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        super(absListView, 0, 0, 0L, 0, 0, 0, 126, null);
        Intrinsics.checkNotNullParameter(absListView, "absListView");
        Intrinsics.checkNotNullParameter(checkedItemPositions, "checkedItemPositions");
        Intrinsics.checkNotNullParameter(choiceMode, "choiceMode");
        this.f95G = absListView;
        this.f96H = z10;
        this.f97I = z11;
        this.f98J = i10;
        this.f99K = i11;
        this.f100L = checkedItemPositions;
        this.f101M = choiceMode;
        this.f102N = i12;
        this.f103O = i13;
        this.f104P = i14;
        this.f105Q = i15;
        this.f106R = i16;
        this.f107S = z12;
        this.f108T = z13;
        this.f109U = z14;
        this.f110V = z15;
        this.f111W = z16;
        this.f112X = z17;
    }
}
