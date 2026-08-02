package X8;

import a9.C1924a;
import android.content.Context;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final a f13652c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public ReadableMap f13653a;

    /* renamed from: b, reason: collision with root package name */
    public S8.e f13654b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final S8.c b(String str) {
            if (str == null) {
                return null;
            }
            for (S8.c cVar : S8.c.values()) {
                if (Intrinsics.areEqual(cVar.name(), C1924a.f15105a.a(str))) {
                    return cVar;
                }
            }
            return null;
        }

        public a() {
        }
    }

    public l(Context context, ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13653a = readableMap;
        S8.c b10 = f13652c.b(readableMap != null ? readableMap.getString("preset") : null);
        this.f13654b = (b10 == null ? m.a() : b10).b(context);
    }

    public final void a() {
        S8.b bVar = S8.b.f10652a;
        bVar.H(d("handleBarColor"));
        bVar.F(d("emojiDrawerGradientTopColor"));
        bVar.E(d("emojiDrawerGradientBottomColor"));
        bVar.G(d("emojiDrawerSeparatorColor"));
        bVar.K(d("searchBackButtonColor"));
        bVar.L(d("searchBarBackgroundColor"));
        bVar.N(d("searchTextColor"));
        bVar.M(d("searchPlaceholderTextColor"));
        bVar.O(d("suggestionCellBackgroundColor"));
        bVar.P(d("suggestionCellTextColor"));
        bVar.Q(d("tabBarSwitchDefaultColor"));
        bVar.R(d("tabBarSwitchSelectedColor"));
        bVar.z(d("confirmationSelectButtonColor"));
        bVar.A(d("confirmationSelectButtonTextColor"));
        bVar.y(d("confirmationBackButtonColor"));
        bVar.B(d("confirmationViewOnGiphyColor"));
        bVar.C(d("defaultTextColor"));
        bVar.D(d("dialogOverlayBackgroundColor"));
        bVar.x(d(ViewProps.BACKGROUND_COLOR));
        bVar.S(d("usernameColor"));
        bVar.I(c("retryButtonBackgroundColor"));
        bVar.J(c("retryButtonTextColor"));
    }

    public final Integer b(String str) {
        ReadableMap readableMap = this.f13653a;
        if (readableMap == null) {
            return null;
        }
        if (readableMap != null && !readableMap.hasKey(str)) {
            return null;
        }
        ReadableMap readableMap2 = this.f13653a;
        Intrinsics.checkNotNull(readableMap2);
        return Integer.valueOf(readableMap2.getInt(str));
    }

    public final Integer c(String str) {
        Integer b10 = b(str);
        return b10 == null ? (Integer) e(str) : b10;
    }

    public final int d(String str) {
        Integer b10 = b(str);
        if (b10 != null) {
            return b10.intValue();
        }
        Object e10 = e(str);
        Intrinsics.checkNotNull(e10, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) e10).intValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final Object e(String str) {
        switch (str.hashCode()) {
            case -2087882462:
                if (str.equals("searchBackButtonColor")) {
                    return Integer.valueOf(this.f13654b.n());
                }
                break;
            case -2010136843:
                if (str.equals("confirmationBackButtonColor")) {
                    return Integer.valueOf(this.f13654b.b());
                }
                break;
            case -1774109037:
                if (str.equals("searchButtonIcon")) {
                    return this.f13654b.p();
                }
                break;
            case -1718808740:
                if (str.equals("retryButtonTextColor")) {
                    return this.f13654b.m();
                }
                break;
            case -1578810419:
                if (str.equals("dialogOverlayBackgroundColor")) {
                    return Integer.valueOf(this.f13654b.g());
                }
                break;
            case -1055096488:
                if (str.equals("handleBarColor")) {
                    return Integer.valueOf(this.f13654b.k());
                }
                break;
            case -996043370:
                if (str.equals("tabBarSwitchSelectedColor")) {
                    return Integer.valueOf(this.f13654b.v());
                }
                break;
            case -695106219:
                if (str.equals("emojiDrawerGradientTopColor")) {
                    return Integer.valueOf(this.f13654b.i());
                }
                break;
            case -233557494:
                if (str.equals("searchBarBackgroundColor")) {
                    return Integer.valueOf(this.f13654b.o());
                }
                break;
            case -111638272:
                if (str.equals("confirmationSelectButtonColor")) {
                    return Integer.valueOf(this.f13654b.c());
                }
                break;
            case -61796396:
                if (str.equals("tabBarSwitchDefaultColor")) {
                    return Integer.valueOf(this.f13654b.u());
                }
                break;
            case 556393339:
                if (str.equals("retryButtonBackgroundColor")) {
                    return this.f13654b.l();
                }
                break;
            case 653328208:
                if (str.equals("suggestionCellTextColor")) {
                    return Integer.valueOf(this.f13654b.t());
                }
                break;
            case 747630837:
                if (str.equals("defaultTextColor")) {
                    return Integer.valueOf(this.f13654b.f());
                }
                break;
            case 890178671:
                if (str.equals("suggestionCellBackgroundColor")) {
                    return Integer.valueOf(this.f13654b.s());
                }
                break;
            case 1167903789:
                if (str.equals("usernameColor")) {
                    return Integer.valueOf(this.f13654b.w());
                }
                break;
            case 1210347467:
                if (str.equals("searchPlaceholderTextColor")) {
                    return Integer.valueOf(this.f13654b.q());
                }
                break;
            case 1254806609:
                if (str.equals("emojiDrawerGradientBottomColor")) {
                    return Integer.valueOf(this.f13654b.h());
                }
                break;
            case 1287124693:
                if (str.equals(ViewProps.BACKGROUND_COLOR)) {
                    return Integer.valueOf(this.f13654b.a());
                }
                break;
            case 1361495406:
                if (str.equals("searchTextColor")) {
                    return Integer.valueOf(this.f13654b.r());
                }
                break;
            case 1654419795:
                if (str.equals("confirmationSelectButtonTextColor")) {
                    return Integer.valueOf(this.f13654b.d());
                }
                break;
            case 1678394909:
                if (str.equals("confirmationViewOnGiphyColor")) {
                    return Integer.valueOf(this.f13654b.e());
                }
                break;
            case 1922434101:
                if (str.equals("emojiDrawerSeparatorColor")) {
                    return Integer.valueOf(this.f13654b.j());
                }
                break;
        }
        throw new IllegalArgumentException("Unknown field: " + str);
    }
}
