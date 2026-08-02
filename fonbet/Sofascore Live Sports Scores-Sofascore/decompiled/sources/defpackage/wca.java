package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.IPlayerCustomActionButton;
import com.blaze.blazesdk.style.players.IPlayerItemButtonStyle;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.newNetwork.EventMediaNews;
import com.sofascore.results.R;
import com.sofascore.results.service.WidgetPeriodicRefreshWorker;
import com.sofascore.results.wc26.widget.LaunchEventDetailsAction;
import com.sofascore.results.wc26.widget.WorldCupWidgetReceiver;
import com.sofascore.results.widget.SofaWidgetReceiver;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.serialization.json.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wca {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static final boolean A(fsa fsaVar, int i) {
        return i <= fsaVar.e() && fsaVar.c() <= i;
    }

    public static final usk B(ViewGroup viewGroup) {
        viewGroup.getClass();
        return new usk(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.coordinatorlayout.widget.CoordinatorLayout] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static final dmh C(CoordinatorLayout coordinatorLayout, String str, String str2, kdk kdkVar) {
        ViewGroup viewGroup;
        str.getClass();
        int[] iArr = dmh.E;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (coordinatorLayout instanceof CoordinatorLayout) {
                viewGroup = coordinatorLayout;
                break;
            }
            if (coordinatorLayout instanceof FrameLayout) {
                if (coordinatorLayout.getId() == 16908290) {
                    viewGroup = coordinatorLayout;
                    break;
                }
                viewGroup2 = coordinatorLayout;
            }
            Object parent = coordinatorLayout.getParent();
            coordinatorLayout = parent instanceof View ? (View) parent : 0;
            if (coordinatorLayout == 0) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            a70.p("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(dmh.E);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        dmh dmhVar = new dmh(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        m71 m71Var = dmhVar.i;
        ((SnackbarContentLayout) m71Var.getChildAt(0)).getMessageView().setText(str);
        dmhVar.k = -2;
        if (str2 != null) {
            dmhVar.l(str2, kdkVar);
        }
        ((SnackbarContentLayout) m71Var.getChildAt(0)).getMessageView().setTextColor(context.getColor(R.color.on_color_primary));
        ((SnackbarContentLayout) m71Var.getChildAt(0)).getActionView().setTextColor(context.getColor(R.color.primary_default));
        m71Var.setBackgroundTintList(ColorStateList.valueOf(context.getColor(R.color.sofaSnackBar)));
        return dmhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wvd D(gc2... gc2VarArr) {
        if (gc2VarArr.length == 0) {
            return new wvd(new gc2[0], new int[]{0, -1});
        }
        ArrayList Z = ph0.Z(gc2VarArr);
        n13.t(Z);
        int size = Z.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i = lnb.f(-1, arrayList, i, 1)) {
        }
        int length = gc2VarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.set(b.f(Z, gc2VarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((gc2) Z.get(0)).h() <= 0) {
            a70.p("the empty byte string is not a supported option");
            return null;
        }
        int i4 = 0;
        while (i4 < Z.size()) {
            gc2 gc2Var = (gc2) Z.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < Z.size()) {
                gc2 gc2Var2 = (gc2) Z.get(i6);
                gc2Var2.getClass();
                gc2Var.getClass();
                if (gc2Var2.q(gc2Var, 0, gc2Var.h())) {
                    if (gc2Var2.h() == gc2Var.h()) {
                        hg6.e(gc2Var2, "duplicate option: ");
                        return null;
                    }
                    if (((Number) arrayList.get(i6)).intValue() > ((Number) arrayList.get(i4)).intValue()) {
                        Z.remove(i6);
                        ((Number) arrayList.remove(i6)).intValue();
                    } else {
                        i6++;
                    }
                }
            }
            i4 = i5;
        }
        x52 x52Var = new x52();
        q(0L, x52Var, 0, Z, 0, Z.size(), arrayList);
        int i7 = (int) (x52Var.b / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = x52Var.readInt();
        }
        return new wvd((gc2[]) Arrays.copyOf(gc2VarArr, gc2VarArr.length), iArr);
    }

    public static final Object E(yea yeaVar, String str, c cVar, dy4 dy4Var) {
        yeaVar.getClass();
        str.getClass();
        return new aha(yeaVar, cVar, str, dy4Var.getDescriptor()).y(dy4Var);
    }

    public static final Object F(Function2 function2) {
        Thread.interrupted();
        return td4.t0(g.a, new m1f(function2, null, 5));
    }

    public static void G(Context context) {
        context.getClass();
        TimeUnit.MINUTES.getClass();
        xde xdeVar = new xde(WidgetPeriodicRefreshWorker.class);
        lcl lclVar = xdeVar.c;
        lclVar.h = 1800000L;
        lclVar.i = llf.e(1800000L, 300000L, 1800000L);
        jbd jbdVar = jbd.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        xdeVar.c.j = new zm3(new nad(null), jbd.b, false, false, false, false, -1L, -1L, CollectionsKt.W0(linkedHashSet));
        yde ydeVar = (yde) xdeVar.a();
        xbl d = xbl.d(context);
        d.getClass();
        mf6[] mf6VarArr = mf6.a;
        dti dtiVar = d.b.g;
        String concat = "enqueueUniquePeriodic_".concat("widget_periodic_refresh");
        n5h n5hVar = ((zbl) d.d).a;
        n5hVar.getClass();
        nq8.G(dtiVar, concat, n5hVar, new fej(25, d, ydeVar));
    }

    public static final void H(dmh dmhVar, String str) {
        dmhVar.getClass();
        str.getClass();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(dmhVar.h.getColor(R.color.k_ff)), 0, str.length(), 0);
        ((SnackbarContentLayout) dmhVar.i.getChildAt(0)).getMessageView().setText(spannableString);
    }

    public static void I(RecyclerView recyclerView, int i) {
        nl2 nl2Var = new nl2(recyclerView.getContext(), 6);
        nl2Var.setTargetPosition(i);
        n layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(nl2Var);
        }
    }

    public static final b20 J(List list, b20 b20Var) {
        Path path;
        int i;
        float f;
        int i2;
        wbe wbeVar;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        List list2 = list;
        b20 b20Var2 = b20Var;
        Path path2 = b20Var2.a;
        int i3 = path2.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        path2.rewind();
        b20Var2.j(i3);
        wbe wbeVar2 = list2.isEmpty() ? ebe.c : (wbe) list2.get(0);
        int size = list2.size();
        float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i4 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (i4 < size) {
            wbe wbeVar3 = (wbe) list2.get(i4);
            if (wbeVar3 instanceof ebe) {
                b20Var2.d();
                path = path2;
                i = size;
                f = f12;
                i2 = i4;
                wbeVar = wbeVar3;
                f13 = f17;
                f15 = f13;
                f14 = f18;
                f16 = f14;
            } else {
                if (wbeVar3 instanceof qbe) {
                    qbe qbeVar = (qbe) wbeVar3;
                    float f19 = qbeVar.c;
                    f15 += f19;
                    float f20 = qbeVar.d;
                    f16 += f20;
                    path2.rMoveTo(f19, f20);
                    path = path2;
                    i = size;
                    f = f12;
                    i2 = i4;
                    f17 = f15;
                    f18 = f16;
                } else {
                    if (wbeVar3 instanceof ibe) {
                        ibe ibeVar = (ibe) wbeVar3;
                        float f21 = ibeVar.c;
                        float f22 = ibeVar.d;
                        b20Var2.g(f21, f22);
                        path = path2;
                        f16 = f22;
                        f18 = f16;
                        f15 = f21;
                        f17 = f15;
                    } else {
                        if (wbeVar3 instanceof pbe) {
                            pbe pbeVar = (pbe) wbeVar3;
                            float f23 = pbeVar.d;
                            float f24 = pbeVar.c;
                            path2.rLineTo(f24, f23);
                            f15 += f24;
                            f16 += f23;
                        } else if (wbeVar3 instanceof hbe) {
                            hbe hbeVar = (hbe) wbeVar3;
                            float f25 = hbeVar.d;
                            float f26 = hbeVar.c;
                            b20Var2.f(f26, f25);
                            path = path2;
                            f15 = f26;
                            f16 = f25;
                        } else if (wbeVar3 instanceof obe) {
                            float f27 = ((obe) wbeVar3).c;
                            path2.rLineTo(f27, f12);
                            f15 += f27;
                        } else if (wbeVar3 instanceof gbe) {
                            float f28 = ((gbe) wbeVar3).c;
                            b20Var2.f(f28, f16);
                            path = path2;
                            f15 = f28;
                        } else if (wbeVar3 instanceof ube) {
                            float f29 = ((ube) wbeVar3).c;
                            path2.rLineTo(f12, f29);
                            f16 += f29;
                        } else if (wbeVar3 instanceof vbe) {
                            float f30 = ((vbe) wbeVar3).c;
                            b20Var2.f(f15, f30);
                            path = path2;
                            f16 = f30;
                        } else {
                            if (wbeVar3 instanceof nbe) {
                                nbe nbeVar = (nbe) wbeVar3;
                                path2.rCubicTo(nbeVar.c, nbeVar.d, nbeVar.e, nbeVar.f, nbeVar.g, nbeVar.h);
                                f4 = nbeVar.e + f15;
                                f5 = nbeVar.f + f16;
                                f15 += nbeVar.g;
                                f11 = nbeVar.h;
                            } else {
                                if (wbeVar3 instanceof fbe) {
                                    fbe fbeVar = (fbe) wbeVar3;
                                    path2.cubicTo(fbeVar.c, fbeVar.d, fbeVar.e, fbeVar.f, fbeVar.g, fbeVar.h);
                                    f4 = fbeVar.e;
                                    f6 = fbeVar.f;
                                    f7 = fbeVar.g;
                                    f8 = fbeVar.h;
                                } else if (wbeVar3 instanceof sbe) {
                                    if (wbeVar2.a) {
                                        f9 = f15 - f13;
                                        f10 = f16 - f14;
                                    } else {
                                        f9 = f12;
                                        f10 = f9;
                                    }
                                    sbe sbeVar = (sbe) wbeVar3;
                                    path2.rCubicTo(f9, f10, sbeVar.c, sbeVar.d, sbeVar.e, sbeVar.f);
                                    f4 = sbeVar.c + f15;
                                    f5 = sbeVar.d + f16;
                                    f15 += sbeVar.e;
                                    f11 = sbeVar.f;
                                } else if (wbeVar3 instanceof kbe) {
                                    if (wbeVar2.a) {
                                        f15 = (f15 * 2.0f) - f13;
                                        f16 = (2.0f * f16) - f14;
                                    }
                                    kbe kbeVar = (kbe) wbeVar3;
                                    path2.cubicTo(f15, f16, kbeVar.c, kbeVar.d, kbeVar.e, kbeVar.f);
                                    f4 = kbeVar.c;
                                    f6 = kbeVar.d;
                                    f7 = kbeVar.e;
                                    f8 = kbeVar.f;
                                } else if (wbeVar3 instanceof rbe) {
                                    rbe rbeVar = (rbe) wbeVar3;
                                    float f31 = rbeVar.f;
                                    float f32 = rbeVar.e;
                                    float f33 = rbeVar.d;
                                    float f34 = rbeVar.c;
                                    path2.rQuadTo(f34, f33, f32, f31);
                                    float f35 = f34 + f15;
                                    float f36 = f33 + f16;
                                    f15 += f32;
                                    f16 += f31;
                                    path = path2;
                                    f13 = f35;
                                    f14 = f36;
                                } else if (wbeVar3 instanceof jbe) {
                                    jbe jbeVar = (jbe) wbeVar3;
                                    float f37 = jbeVar.f;
                                    float f38 = jbeVar.e;
                                    float f39 = jbeVar.d;
                                    f4 = jbeVar.c;
                                    path2.quadTo(f4, f39, f38, f37);
                                    path = path2;
                                    f16 = f37;
                                    f15 = f38;
                                    f14 = f39;
                                    i = size;
                                    f = f12;
                                    i2 = i4;
                                    wbeVar = wbeVar3;
                                    f13 = f4;
                                } else if (wbeVar3 instanceof tbe) {
                                    if (wbeVar2.b) {
                                        f2 = f15 - f13;
                                        f3 = f16 - f14;
                                    } else {
                                        f2 = f12;
                                        f3 = f2;
                                    }
                                    tbe tbeVar = (tbe) wbeVar3;
                                    float f40 = tbeVar.d;
                                    float f41 = tbeVar.c;
                                    path2.rQuadTo(f2, f3, f41, f40);
                                    f4 = f2 + f15;
                                    f5 = f3 + f16;
                                    f15 += f41;
                                    f16 += f40;
                                    path = path2;
                                    f14 = f5;
                                    i = size;
                                    f = f12;
                                    i2 = i4;
                                    wbeVar = wbeVar3;
                                    f13 = f4;
                                } else if (wbeVar3 instanceof lbe) {
                                    if (wbeVar2.b) {
                                        f15 = (f15 * 2.0f) - f13;
                                        f16 = (2.0f * f16) - f14;
                                    }
                                    lbe lbeVar = (lbe) wbeVar3;
                                    float f42 = lbeVar.d;
                                    float f43 = lbeVar.c;
                                    path2.quadTo(f15, f16, f43, f42);
                                    path = path2;
                                    i = size;
                                    f = f12;
                                    i2 = i4;
                                    f14 = f16;
                                    wbeVar = wbeVar3;
                                    f16 = f42;
                                    f13 = f15;
                                    f15 = f43;
                                } else if (wbeVar3 instanceof mbe) {
                                    mbe mbeVar = (mbe) wbeVar3;
                                    float f44 = mbeVar.h + f15;
                                    float f45 = mbeVar.i + f16;
                                    double d = mbeVar.c;
                                    double d2 = mbeVar.d;
                                    double d3 = mbeVar.e;
                                    boolean z = mbeVar.f;
                                    boolean z2 = mbeVar.g;
                                    i = size;
                                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    path = path2;
                                    i2 = i4;
                                    s(b20Var, f15, f16, f44, f45, d, d2, d3, z, z2);
                                    f13 = f44;
                                    f15 = f13;
                                    f14 = f45;
                                    f16 = f14;
                                    wbeVar = wbeVar3;
                                } else {
                                    path = path2;
                                    i = size;
                                    f = f12;
                                    i2 = i4;
                                    if (!(wbeVar3 instanceof dbe)) {
                                        zzl.b();
                                        return null;
                                    }
                                    dbe dbeVar = (dbe) wbeVar3;
                                    float f46 = dbeVar.i;
                                    float f47 = dbeVar.h;
                                    wbeVar = wbeVar3;
                                    s(b20Var, f15, f16, f47, f46, dbeVar.c, dbeVar.d, dbeVar.e, dbeVar.f, dbeVar.g);
                                    f14 = f46;
                                    f16 = f14;
                                    f13 = f47;
                                    f15 = f13;
                                }
                                path = path2;
                                f15 = f7;
                                f16 = f8;
                                i = size;
                                f = f12;
                                i2 = i4;
                                wbeVar = wbeVar3;
                                f14 = f6;
                                f13 = f4;
                            }
                            f16 += f11;
                            path = path2;
                            f14 = f5;
                            i = size;
                            f = f12;
                            i2 = i4;
                            wbeVar = wbeVar3;
                            f13 = f4;
                        }
                        path = path2;
                    }
                    i = size;
                    f = f12;
                    i2 = i4;
                }
                wbeVar = wbeVar3;
            }
            i4 = i2 + 1;
            list2 = list;
            b20Var2 = b20Var;
            size = i;
            path2 = path;
            wbeVar2 = wbeVar;
            f12 = f;
        }
        return b20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(ogj ogjVar, big bigVar, sq3 sq3Var) {
        bjj bjjVar;
        int i;
        try {
            if (sq3Var instanceof bjj) {
                bjjVar = (bjj) sq3Var;
                int i2 = bjjVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bjjVar.t = i2 - Integer.MIN_VALUE;
                    Object obj = bjjVar.s;
                    lu3 lu3Var = lu3.a;
                    i = bjjVar.t;
                    rq3 rq3Var = null;
                    if (i != 0) {
                        y6a.M(obj);
                        bjjVar.r = bigVar;
                        bjjVar.t = 1;
                        Object r = s9a.r(new h4i(bigVar, ogjVar, rq3Var, 18), bjjVar);
                        return r == lu3Var ? lu3Var : r;
                    }
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    big bigVar2 = bjjVar.r;
                    y6a.M(obj);
                    return obj;
                }
            }
            if (i != 0) {
            }
        } catch (rij e) {
            if (e.b == bigVar.hashCode()) {
                return null;
            }
            throw e;
        }
        bjjVar = new bjj(sq3Var);
        Object obj2 = bjjVar.s;
        lu3 lu3Var2 = lu3.a;
        i = bjjVar.t;
        rq3 rq3Var2 = null;
    }

    public static String O(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(Q(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(Q(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String Q(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String m = wt3.m(name, "@", new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(m.length() + 8 + name2.length() + 1);
            bf3.v(sb, "<", m, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static final void a(mll mllVar, vy8 vy8Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2014696694);
        int i2 = (av8Var.i(mllVar) ? 4 : 2) | i | (av8Var.g(vy8Var) ? 32 : 16);
        int i3 = 0;
        int i4 = 1;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            rd0.b(nq8.A(vy8Var), 1, 0, yqo.H(1505880556, av8Var, new lll(mllVar, i3)), av8Var, 3072, 4);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kll(mllVar, vy8Var, i, i4);
        }
    }

    public static final void b(mll mllVar, vy8 vy8Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(490557686);
        int i2 = 2;
        int i3 = (av8Var.i(mllVar) ? 4 : 2) | i | (av8Var.g(vy8Var) ? 32 : 16);
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            nq8.g(nq8.A(vy8Var), 0, 1, yqo.H(343494930, av8Var, new lll(mllVar, i4)), av8Var, 3072, 2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kll(mllVar, vy8Var, i, i2);
        }
    }

    public static final void c(final Function0 function0, final long j, final dtc dtcVar, q50 q50Var, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        long j2;
        dtc dtcVar2;
        int i3;
        Object obj;
        ema emaVar;
        int i4;
        int i5;
        int i6;
        Object obj2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(766784632);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= av8Var.f(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            dtcVar2 = dtcVar;
            i2 |= av8Var.g(dtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            dtcVar2 = dtcVar;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? av8Var.g(q50Var) : av8Var.i(q50Var) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.i(tc3Var) ? 16384 : 8192;
        }
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) av8Var.k(nz.f);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            ema emaVar2 = (ema) av8Var.k(dh3.n);
            androidx.compose.runtime.a S = z8e.S(av8Var);
            e1d g = e.g(tc3Var, av8Var);
            Object[] objArr = new Object[0];
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                i3 = i2;
                b1c b1cVar = new b1c(27);
                av8Var.n0(b1cVar);
                obj = b1cVar;
            } else {
                i3 = i2;
                obj = O;
            }
            UUID uuid = (UUID) o3a.N(objArr, (Function0) obj, av8Var, 48);
            Object O2 = av8Var.O();
            Object obj3 = O2;
            if (O2 == a99Var) {
                ku3 G = hz8.G(g.a, av8Var);
                av8Var.n0(G);
                obj3 = G;
            }
            ku3 ku3Var = (ku3) obj3;
            boolean g2 = av8Var.g(view) | av8Var.g(kx4Var);
            Object O3 = av8Var.O();
            if (g2 || O3 == a99Var) {
                emaVar = emaVar2;
                i4 = i3;
                i5 = 1;
                i6 = 0;
                rsc rscVar = new rsc(function0, dtcVar2, j2, view, emaVar, kx4Var, uuid, q50Var, ku3Var);
                tc3 tc3Var2 = new tc3(-1051373467, new ug4(i5, g), true);
                osc oscVar = rscVar.i;
                oscVar.setParentCompositionContext(S);
                ((eoh) oscVar.l).setValue(tc3Var2);
                oscVar.m = true;
                oscVar.d();
                av8Var.n0(rscVar);
                obj2 = rscVar;
            } else {
                emaVar = emaVar2;
                i4 = i3;
                i5 = 1;
                i6 = 0;
                obj2 = O3;
            }
            final rsc rscVar2 = (rsc) obj2;
            boolean i7 = av8Var.i(rscVar2);
            Object O4 = av8Var.O();
            Object obj4 = O4;
            if (i7 || O4 == a99Var) {
                mnc mncVar = new mnc(rscVar2, 7);
                av8Var.n0(mncVar);
                obj4 = mncVar;
            }
            hz8.d(rscVar2, (Function1) obj4, av8Var);
            int i8 = i4;
            int i9 = (av8Var.i(rscVar2) ? 1 : 0) | ((i8 & 14) == 4 ? i5 : i6) | ((i8 & 896) == 256 ? i5 : i6) | ((i8 & 112) == 32 ? i5 : i6) | (av8Var.e(emaVar.ordinal()) ? 1 : 0);
            Object O5 = av8Var.O();
            Object obj5 = O5;
            if (i9 != 0 || O5 == a99Var) {
                final ema emaVar3 = emaVar;
                Function0 function02 = new Function0() { // from class: etc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        rsc.this.d(function0, dtcVar, j, emaVar3);
                        return Unit.a;
                    }
                };
                av8Var.n0(function02);
                obj5 = function02;
            }
            hz8.t((Function0) obj5, av8Var);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ftc(function0, j, dtcVar, q50Var, tc3Var, i, 0);
        }
    }

    public static final void d(c56 c56Var, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1605556952);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(c56Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            int i4 = c56Var.g;
            x43 x43Var = c56Var.o;
            boolean z = c56Var.e;
            tc3 H = yqo.H(-1549065358, av8Var2, new qwe(c56Var, r11));
            tc3 H2 = yqo.H(195856120, av8Var2, new qwe(c56Var, i3));
            tc3 H3 = yqo.H(668195766, av8Var2, new qwe(c56Var, 3));
            int i5 = i2 & 112;
            boolean i6 = (i5 == 32) | av8Var2.i(c56Var);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i6 || O == a99Var) {
                O = new rwe(function1, c56Var, r11);
                av8Var2.n0(O);
            }
            Function0 function0 = (Function0) O;
            int i7 = (av8Var2.i(c56Var) ? 1 : 0) | (i5 != 32 ? 0 : 1);
            Object O2 = av8Var2.O();
            if (i7 != 0 || O2 == a99Var) {
                O2 = new rwe(function1, c56Var, 2);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i4, x43Var, xtcVar, H, H2, null, H3, null, null, null, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i2 & 896) | 1600512, (i2 << 15) & 3670016, 63392);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new swe(c56Var, function1, xtcVar, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r8, "25_or_older") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0223, code lost:
    
        if (r5 == com.sofascore.results.R.string.points) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(gta gtaVar, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        List j;
        char c;
        char c2;
        int i2;
        boolean z;
        Integer valueOf = Integer.valueOf(R.string.points);
        gtaVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1391609134);
        int i3 = (av8Var.e(gtaVar.ordinal()) ? 4 : 2) | i | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            Context context = (Context) av8Var.k(nz.b);
            Object O = av8Var.O();
            if (O == nf3.a) {
                context.getClass();
                if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences = a5f.d(applicationContext);
                            uic.j = sharedPreferences;
                        }
                        sharedPreferences.getClass();
                    }
                    ccd ccdVar = vl.b;
                    String string = sharedPreferences.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18");
                    ccd ccdVar2 = vl.b;
                }
                if (xld.g(context)) {
                    z = true;
                    O = Boolean.valueOf(z);
                    av8Var.n0(O);
                }
                z = false;
                O = Boolean.valueOf(z);
                av8Var.n0(O);
            }
            boolean booleanValue = ((Boolean) O).booleanValue();
            int ordinal = gtaVar.ordinal();
            if (ordinal == 0) {
                j = b.j(Integer.valueOf(R.string.voted), Integer.valueOf(R.string.correct), Integer.valueOf(booleanValue ? R.string.virtual_roi_short : R.string.points));
            } else if (ordinal == 1) {
                j = b.j(Integer.valueOf(R.string.contribution_profile_reputation_score_leaderboard), valueOf);
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return;
                }
                j = kotlin.collections.a.c(valueOf);
            }
            xtc d0 = l98.d0(l98.f0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            yf8 yf8Var = xth.a;
            udj.c("#", bkh.p(utcVar, 32.0f), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.m(), av8Var, 54, 24960, 109560);
            udj.c(oea.v(R.string.nickname, av8Var), new goa(1.0f, true), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.m(), av8Var, 0, 384, 126968);
            av8Var = av8Var;
            av8Var.d0(1592479684);
            Iterator it = j.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (gtaVar == gta.b) {
                    c = 1784;
                    if (intValue == R.string.contribution_profile_reputation_score_leaderboard) {
                        c2 = 5404;
                        i2 = 72;
                        String v = oea.v(intValue, av8Var);
                        yf8 yf8Var2 = xth.a;
                        av8 av8Var2 = av8Var;
                        udj.c(v, bkh.p(utc.a, i2), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(6), 0L, 2, false, 0, 0, null, xth.m(), av8Var2, 0, 384, 125944);
                        av8Var = av8Var2;
                    }
                } else {
                    c = 1784;
                }
                if (gtaVar == gta.c) {
                    c2 = 5404;
                } else {
                    c2 = 5404;
                }
                i2 = 48;
                String v2 = oea.v(intValue, av8Var);
                yf8 yf8Var22 = xth.a;
                av8 av8Var22 = av8Var;
                udj.c(v2, bkh.p(utc.a, i2), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(6), 0L, 2, false, 0, 0, null, xth.m(), av8Var22, 0, 384, 125944);
                av8Var = av8Var22;
            }
            av8Var.s(false);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(gtaVar, xtcVar2, i, 16);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r8 == defpackage.nf3.a) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(vnb vnbVar, Function1 function1, Function0 function0, of3 of3Var, int i) {
        av8 av8Var;
        Function1 function12;
        hzh[] hzhVarArr;
        gv9 gv9Var;
        Object obj;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(149184126);
        int i2 = i | (av8Var2.g(vnbVar) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            p2h p2hVar = (p2h) vnbVar.a();
            boolean z = p2hVar != null ? p2hVar.c : false;
            boolean g = av8Var2.g(p2hVar != null ? p2hVar.a : null);
            Object O = av8Var2.O();
            if (!g) {
                obj = O;
            }
            if (p2hVar == null || (gv9Var = p2hVar.a) == null || (hzhVarArr = (hzh[]) gv9Var.toArray(new hzh[0])) == null) {
                hzhVarArr = new hzh[0];
            }
            Object[] copyOf = Arrays.copyOf(hzhVarArr, hzhVarArr.length);
            SnapshotStateList snapshotStateList = new SnapshotStateList();
            snapshotStateList.addAll(ph0.X(copyOf));
            av8Var2.n0(snapshotStateList);
            obj = snapshotStateList;
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
            f70 f70Var = new f70(function0, p2hVar, z, function1, snapshotStateList2);
            function12 = function1;
            av8Var = av8Var2;
            q5a.p(null, yqo.H(1625139770, av8Var2, f70Var), null, null, null, 0, 0L, 0L, null, yqo.H(593025743, av8Var2, new zya(8, vnbVar, snapshotStateList2, function12)), av8Var, 805306416, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW);
        } else {
            av8Var = av8Var2;
            function12 = function1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(i, 29, vnbVar, function0, function12);
        }
    }

    public static final void g(a0i a0iVar, Function1 function1, Function0 function0, of3 of3Var, int i) {
        int i2;
        function1.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-26603544);
        int i3 = i | (av8Var.i(a0iVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            e1d x = rfo.x(a0iVar.f, av8Var, 0);
            hof hofVar = a0iVar.h;
            boolean z = (i3 & 112) == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new k1e(6, function1);
                av8Var.n0(O);
            }
            w1a.c(hofVar, null, (Function1) O, av8Var, 0, 14);
            vnb vnbVar = (vnb) x.getValue();
            boolean i4 = av8Var.i(a0iVar);
            Object O2 = av8Var.O();
            if (i4 || O2 == a99Var) {
                i2 = i3;
                chf chfVar = new chf(1, a0iVar, a0i.class, "onAction", "onAction(Lcom/sofascore/results/main/matches/redesign/sportreorder/SelectSportAction;)V", 0, 10);
                av8Var.n0(chfVar);
                O2 = chfVar;
            } else {
                i2 = i3;
            }
            f(vnbVar, (Function1) ((KFunction) O2), function0, av8Var, i2 & 896);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(i, 28, a0iVar, function0, function1);
        }
    }

    public static final void h(Bitmap bitmap, jfj jfjVar, jfj jfjVar2, vy8 vy8Var, of3 of3Var, int i) {
        vy8 vy8Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(756208578);
        int i2 = 16;
        int i3 = i | (av8Var.i(bitmap) ? 4 : 2) | (av8Var.g(jfjVar) ? 32 : 16) | (av8Var.g(jfjVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            ty8 ty8Var = ty8.a;
            nq8.g(nq8.A(ty8Var), 0, 1, yqo.H(-1469141026, av8Var, new zya(i2, bitmap, jfjVar, jfjVar2)), av8Var, 3072, 2);
            vy8Var2 = ty8Var;
        } else {
            av8Var.W();
            vy8Var2 = vy8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(i, 20, bitmap, jfjVar, jfjVar2, vy8Var2);
        }
    }

    public static final void i(z6j z6jVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1495831248);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(z6jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i3 = 0;
        int i4 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            int i5 = z6jVar.g;
            x43 x43Var = z6jVar.n;
            String str = z6jVar.h;
            String str2 = z6jVar.i;
            boolean z = z6jVar.e;
            tc3 H = yqo.H(659504374, av8Var2, new w6j(z6jVar, i3));
            tc3 H2 = yqo.H(-2059306958, av8Var2, new w6j(z6jVar, i4));
            int i6 = i2 & 112;
            int i7 = i2 & 14;
            boolean z2 = (i6 == 32) | (i7 == 4);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new x6j(function1, z6jVar, 0);
                av8Var2.n0(O);
            }
            Function0 function0 = (Function0) O;
            boolean z3 = (i6 == 32) | (i7 == 4);
            Object O2 = av8Var2.O();
            if (z3 || O2 == a99Var) {
                O2 = new x6j(function1, z6jVar, 1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i5, x43Var, xtcVar, H, null, null, H2, null, str, str2, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i2 & 896) | 1575936, ((i2 << 15) & 3670016) | 24576, 46256);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y6j(z6jVar, function1, xtcVar, i, 0);
        }
    }

    public static final void j(int i, of3 of3Var, xtc xtcVar, Function0 function0, boolean z) {
        SharedPreferences d;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2049695181);
        int i2 = i | (av8Var.h(z) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                context.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                O = e.f(Boolean.valueOf(sharedPreferences.getBoolean("PREF_SHOW_DAILY_BONUS_INFO", true)));
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            xtc Y = fz8.Y(bkh.d(xtcVar, 1.0f), n9a.a);
            long D = lz.D(R.color.surface_1, av8Var);
            jf9 jf9Var = oyn.e;
            xtc y = tol.y(n9e.q(wnn.A(l98.b0(n9e.q(Y, D, jf9Var), 12.0f), o7g.a(8.0f)), lz.D(R.color.primary_highlight, av8Var), jf9Var), false, false, false, 0L, null, function0, av8Var, 31);
            av8Var.d0(-1003410150);
            av8Var.d0(212064437);
            av8Var.s(false);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            Object O2 = av8Var.O();
            if (O2 == obj) {
                O2 = new t1c(kx4Var);
                av8Var.n0(O2);
            }
            t1c t1cVar = (t1c) O2;
            Object O3 = av8Var.O();
            if (O3 == obj) {
                O3 = new am3();
                av8Var.n0(O3);
            }
            am3 am3Var = (am3) O3;
            Object O4 = av8Var.O();
            if (O4 == obj) {
                O4 = e.f(Boolean.FALSE);
                av8Var.n0(O4);
            }
            e1d e1dVar2 = (e1d) O4;
            Object O5 = av8Var.O();
            if (O5 == obj) {
                O5 = new pm3(am3Var);
                av8Var.n0(O5);
            }
            pm3 pm3Var = (pm3) O5;
            Object O6 = av8Var.O();
            if (O6 == obj) {
                O6 = e.e(Unit.a, f7a.k);
                av8Var.n0(O6);
            }
            e1d e1dVar3 = (e1d) O6;
            boolean i3 = av8Var.i(t1cVar) | av8Var.e(257);
            Object O7 = av8Var.O();
            if (i3 || O7 == obj) {
                Object kd3Var = new kd3(e1dVar3, t1cVar, pm3Var, e1dVar2, 14);
                av8Var.n0(kd3Var);
                O7 = kd3Var;
            }
            k1c k1cVar = (k1c) O7;
            Object O8 = av8Var.O();
            int i4 = 14;
            if (O8 == obj) {
                O8 = new ld3(e1dVar2, pm3Var, i4);
                av8Var.n0(O8);
            }
            Function0 function02 = (Function0) O8;
            boolean i5 = av8Var.i(t1cVar);
            Object O9 = av8Var.O();
            if (i5 || O9 == obj) {
                O9 = new md3(t1cVar, i4);
                av8Var.n0(O9);
            }
            s6a.h(o3h.a(y, false, (Function1) O9), yqo.H(1200550679, av8Var, new lfk(e1dVar3, am3Var, function02, z, e1dVar)), k1cVar, av8Var, 48);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s27(i, 3, xtcVar, function0, z);
        }
    }

    public static final void k(mll mllVar, vy8 vy8Var, of3 of3Var, int i) {
        Pair pair;
        Integer valueOf = Integer.valueOf(R.color.on_color_secondary);
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1591842523);
        int i2 = (av8Var.i(mllVar) ? 4 : 2) | i | (av8Var.g(vy8Var) ? 32 : 16);
        int i3 = 0;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) av8Var.k(bh3.b);
            p7l p7lVar = mllVar.b;
            v20 v20Var = p7lVar == p7l.b ? new v20(R.drawable.wc_widget_live_match_card_border) : new v20(R.color.on_color_highlight_2);
            int ordinal = p7lVar.ordinal();
            if (ordinal == 0) {
                pair = new Pair(Integer.valueOf(R.string.previous), valueOf);
            } else if (ordinal == 1) {
                pair = new Pair(Integer.valueOf(R.string.standings_live), Integer.valueOf(R.color.stayDarkLive));
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return;
                }
                pair = new Pair(Integer.valueOf(R.string.next), valueOf);
            }
            int intValue = ((Number) pair.a).intValue();
            int intValue2 = ((Number) pair.b).intValue();
            vy8 N = h5a.N(gz8.E(nq8.y(vy8Var).d(new fy0(v20Var)), 8.0f), 8.0f);
            int i4 = mllVar.a;
            if (i4 != 0) {
                N = j72.x(N, new x9g(LaunchEventDetailsAction.class, zm2.A((lc[]) Arrays.copyOf(new lc[]{new lc(fz8.l, Integer.valueOf(i4))}, 1))));
            }
            rd0.b(N, 0, 1, yqo.H(-382130149, av8Var, new ffh(context, intValue, intValue2, mllVar)), av8Var, 3072, 2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kll(mllVar, vy8Var, i, i3);
        }
    }

    public static final ImageView l(Context context, String str, List list, Function1 function1) {
        Object obj;
        context.getClass();
        str.getClass();
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.c(((IPlayerCustomActionButton) obj).getCustomParams().getId(), str)) {
                break;
            }
        }
        IPlayerCustomActionButton iPlayerCustomActionButton = (IPlayerCustomActionButton) obj;
        if (iPlayerCustomActionButton == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(iPlayerCustomActionButton.getStyle().getWidth().getToPx$blazesdk_release());
        Integer valueOf2 = Integer.valueOf(iPlayerCustomActionButton.getStyle().getHeight().getToPx$blazesdk_release());
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setTag(str);
        imageView.setLayoutParams(new tl3(intValue, intValue2));
        imageView.setOnClickListener(new ivj(9, function1, iPlayerCustomActionButton));
        return imageView;
    }

    public static final void m(ViewGroup viewGroup, List list, n4m n4mVar, mol molVar) {
        viewGroup.getClass();
        list.getClass();
        molVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IPlayerCustomActionButton iPlayerCustomActionButton = (IPlayerCustomActionButton) it.next();
            ImageView imageView = (ImageView) viewGroup.findViewWithTag(iPlayerCustomActionButton.getCustomParams().getId());
            if (imageView != null) {
                IPlayerItemButtonStyle style = iPlayerCustomActionButton.getStyle();
                gim gimVar = n4mVar.b;
                boolean z = true;
                Map mergedExtraInfo$default = yjm.mergedExtraInfo$default(gimVar, null, 1, null);
                Function1<Map<String, String>, Boolean> visibilityEvaluator$blazesdk_release = iPlayerCustomActionButton.getCustomParams().getVisibilityEvaluator$blazesdk_release();
                if (visibilityEvaluator$blazesdk_release != null) {
                    try {
                        z = ((Boolean) visibilityEvaluator$blazesdk_release.invoke(mergedExtraInfo$default)).booleanValue();
                    } catch (Exception unused) {
                        z = false;
                    }
                }
                ctl.c(imageView, style, z, gimVar, molVar);
            }
        }
    }

    public static final void n(CastContext castContext) {
        castContext.getClass();
        try {
            SessionManager b2 = castContext.b();
            b2.getClass();
            if (b2.c() == null) {
                return;
            }
            b2.b(true);
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3 A[Catch: uba -> 0x01bc, TRY_ENTER, TRY_LEAVE, TryCatch #8 {uba -> 0x01bc, blocks: (B:26:0x00c5, B:33:0x00e3, B:41:0x010d, B:43:0x0123, B:46:0x0138, B:49:0x0140), top: B:25:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0190 -> B:21:0x019b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(fsa fsaVar, int i, int i2, int i3, kx4 kx4Var, sq3 sq3Var) {
        hra hraVar;
        lu3 lu3Var;
        int i4;
        ?? r9;
        int i5;
        int i6;
        hra hraVar2;
        fsa fsaVar2;
        float H0;
        float H02;
        float H03;
        asf asfVar;
        fsf fsfVar;
        fsa fsaVar3;
        final int i7;
        final int i8;
        final dsf dsfVar;
        float f;
        float f2;
        int i9;
        d80 B;
        Float f3;
        boolean z;
        zz zzVar;
        fsa fsaVar4;
        int i10;
        int i11;
        final float f4;
        hra hraVar3;
        int i12;
        float f5;
        final int i13;
        final float f6;
        final asf asfVar2;
        final fsf fsfVar2;
        final fsa fsaVar5;
        dsf dsfVar2;
        int i14;
        int i15;
        int i16 = i;
        if (sq3Var instanceof hra) {
            hraVar = (hra) sq3Var;
            int i17 = hraVar.D;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                hraVar.D = i17 - Integer.MIN_VALUE;
                Object obj = hraVar.C;
                lu3Var = lu3.a;
                i4 = hraVar.D;
                float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                boolean z2 = true;
                if (i4 != 0) {
                    y6a.M(obj);
                    if (i16 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        u3a.a("Index should be non-negative");
                    }
                    try {
                        H0 = kx4Var.H0(2500.0f);
                        H02 = kx4Var.H0(1500.0f);
                        H03 = kx4Var.H0(50.0f);
                        asfVar = new asf();
                        asfVar.a = true;
                        fsfVar = new fsf();
                        fsfVar.a = t62.a(30, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        r9 = A(fsaVar, i);
                        try {
                        } catch (uba e) {
                            e = e;
                            i5 = i2;
                            i6 = i16;
                            hraVar2 = hraVar;
                            fsaVar2 = r9;
                            B = t62.B(e.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                            float f8 = e.a + i5;
                            csf csfVar = new csf();
                            f3 = new Float(f8);
                            if (((Number) B.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            }
                            zzVar = new zz(f8, csfVar, fsaVar2, 1);
                            hraVar2.r = fsaVar2;
                            hraVar2.s = null;
                            hraVar2.t = null;
                            hraVar2.u = null;
                            hraVar2.v = i6;
                            hraVar2.w = i5;
                            hraVar2.D = 2;
                            if (d2a.p(B, f3, null, !z, zzVar, hraVar2, 2) != lu3Var) {
                            }
                            return lu3Var;
                        }
                    } catch (uba e2) {
                        e = e2;
                        r9 = fsaVar;
                    }
                    if (r9 != 0) {
                        throw new uba(fsaVar.b(i), (d80) fsfVar.a);
                    }
                    fsaVar3 = fsaVar;
                    int i18 = i16 > ((ksa) fsaVar3.c).h() ? 1 : 0;
                    dsf dsfVar3 = new dsf();
                    dsfVar3.a = 1;
                    i7 = i2;
                    i8 = i3;
                    dsfVar = dsfVar3;
                    f = H0;
                    f2 = H03;
                    i9 = i18;
                    f4 = H02;
                    if (asfVar.a) {
                    }
                    return Unit.a;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i10 = hraVar.w;
                    i11 = hraVar.v;
                    fsaVar4 = hraVar.r;
                    y6a.M(obj);
                    fsaVar4.f(i11, i10);
                    return Unit.a;
                }
                i9 = hraVar.y;
                float f9 = hraVar.B;
                H02 = hraVar.A;
                f = hraVar.z;
                int i19 = hraVar.x;
                int i20 = hraVar.w;
                i6 = hraVar.v;
                dsf dsfVar4 = hraVar.u;
                fsfVar = hraVar.t;
                asf asfVar3 = hraVar.s;
                fsaVar2 = hraVar.r;
                try {
                    y6a.M(obj);
                    fsaVar3 = fsaVar2;
                    asfVar = asfVar3;
                    f2 = f9;
                    i15 = 1;
                    i8 = i19;
                    i7 = i20;
                    try {
                        try {
                            dsfVar4.a += i15;
                            dsfVar = dsfVar4;
                            i16 = i6;
                            f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            z2 = true;
                        } catch (uba e3) {
                            e = e3;
                            hraVar2 = hraVar;
                            fsaVar2 = fsaVar3;
                            i5 = i7;
                            B = t62.B(e.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                            float f82 = e.a + i5;
                            csf csfVar2 = new csf();
                            f3 = new Float(f82);
                            if (((Number) B.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            }
                            zzVar = new zz(f82, csfVar2, fsaVar2, 1);
                            hraVar2.r = fsaVar2;
                            hraVar2.s = null;
                            hraVar2.t = null;
                            hraVar2.u = null;
                            hraVar2.v = i6;
                            hraVar2.w = i5;
                            hraVar2.D = 2;
                            if (d2a.p(B, f3, null, !z, zzVar, hraVar2, 2) != lu3Var) {
                            }
                            return lu3Var;
                        }
                    } catch (uba e4) {
                        e = e4;
                        i6 = i16;
                        hraVar3 = hraVar;
                        fsaVar2 = fsaVar3;
                    }
                    f4 = H02;
                } catch (uba e5) {
                    e = e5;
                    hraVar2 = hraVar;
                    i5 = i20;
                }
                if (asfVar.a) {
                    try {
                    } catch (uba e6) {
                        e = e6;
                        i6 = i16;
                        hraVar3 = hraVar;
                        fsaVar2 = fsaVar3;
                    }
                    switch (fsaVar3.a) {
                        case 0:
                            i12 = ((ksa) fsaVar3.c).j().n;
                            if (i12 > 0) {
                                try {
                                    try {
                                        try {
                                            int b2 = fsaVar3.b(i16) + i7;
                                            if (Math.abs(b2) >= f) {
                                                f5 = i9 != 0 ? f : -f;
                                            } else {
                                                try {
                                                    f5 = Math.max(Math.abs(b2), f2);
                                                    if (i9 == 0) {
                                                        f5 = -f5;
                                                    }
                                                } catch (uba e7) {
                                                    e = e7;
                                                    i6 = i16;
                                                    hraVar2 = hraVar;
                                                    fsaVar2 = fsaVar3;
                                                    i5 = i7;
                                                    B = t62.B(e.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                                                    float f822 = e.a + i5;
                                                    csf csfVar22 = new csf();
                                                    f3 = new Float(f822);
                                                    if (((Number) B.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                    }
                                                    zzVar = new zz(f822, csfVar22, fsaVar2, 1);
                                                    hraVar2.r = fsaVar2;
                                                    hraVar2.s = null;
                                                    hraVar2.t = null;
                                                    hraVar2.u = null;
                                                    hraVar2.v = i6;
                                                    hraVar2.w = i5;
                                                    hraVar2.D = 2;
                                                    if (d2a.p(B, f3, null, !z, zzVar, hraVar2, 2) != lu3Var) {
                                                    }
                                                    return lu3Var;
                                                }
                                            }
                                            d80 B2 = t62.B((d80) fsfVar.a, f7, f7, 30);
                                            fsfVar.a = B2;
                                            final csf csfVar3 = new csf();
                                            Float f10 = new Float(f5);
                                            boolean z3 = (((Number) ((d80) fsfVar.a).c()).floatValue() == f7 ? z2 : false) ^ z2;
                                            final boolean z4 = i9 != 0 ? z2 : false;
                                            Function1 function1 = new Function1() { // from class: gra
                                                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v26 float, still in use, count: 2, list:
                                                      (r2v26 float) from 0x002d: PHI (r2v21 float) = (r2v8 float), (r2v26 float) binds: [B:36:0x003f, B:6:0x002a] A[DONT_GENERATE, DONT_INLINE]
                                                      (r2v26 float) from 0x0028: CMP_L (r2v26 float), (r7v0 float) A[WRAPPED] (LINE:41)
                                                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                                                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                                                    	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
                                                    	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
                                                    	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                    	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
                                                    	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
                                                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
                                                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                                                    */
                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Object invoke(java.lang.Object r11) {
                                                    /*
                                                        Method dump skipped, instructions count: 234
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.gra.invoke(java.lang.Object):java.lang.Object");
                                                }
                                            };
                                            hraVar.r = fsaVar2;
                                            hraVar.s = asfVar2;
                                            hraVar.t = fsfVar;
                                            hraVar.u = dsfVar2;
                                            hraVar.v = i6;
                                            hraVar.w = i5;
                                            hraVar.x = i14;
                                            hraVar.z = f;
                                            hraVar.A = H02;
                                            hraVar.B = f2;
                                            hraVar.y = i9;
                                            i15 = 1;
                                            hraVar.D = 1;
                                            if (d2a.p(B2, f10, null, z3, function1, hraVar3, 2) != lu3Var) {
                                                fsaVar3 = fsaVar2;
                                                asfVar = asfVar2;
                                                i7 = i5;
                                                hraVar = hraVar3;
                                                dsfVar4 = dsfVar2;
                                                i8 = i14;
                                                dsfVar4.a += i15;
                                                dsfVar = dsfVar4;
                                                i16 = i6;
                                                f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                z2 = true;
                                                f4 = H02;
                                                if (asfVar.a) {
                                                }
                                            }
                                        } catch (uba e8) {
                                            e = e8;
                                            hraVar3 = hraVar;
                                            fsaVar2 = fsaVar5;
                                            i6 = i13;
                                            i5 = i7;
                                            hraVar2 = hraVar3;
                                            B = t62.B(e.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                                            float f8222 = e.a + i5;
                                            csf csfVar222 = new csf();
                                            f3 = new Float(f8222);
                                            if (((Number) B.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            }
                                            zzVar = new zz(f8222, csfVar222, fsaVar2, 1);
                                            hraVar2.r = fsaVar2;
                                            hraVar2.s = null;
                                            hraVar2.t = null;
                                            hraVar2.u = null;
                                            hraVar2.v = i6;
                                            hraVar2.w = i5;
                                            hraVar2.D = 2;
                                            if (d2a.p(B, f3, null, !z, zzVar, hraVar2, 2) != lu3Var) {
                                            }
                                            return lu3Var;
                                        }
                                        i13 = i16;
                                        f6 = f5;
                                        asfVar2 = asfVar;
                                        fsfVar2 = fsfVar;
                                        fsaVar5 = fsaVar3;
                                    } catch (uba e9) {
                                        e = e9;
                                        hraVar3 = hraVar;
                                    }
                                    fsaVar2 = fsaVar5;
                                    i6 = i13;
                                    H02 = f4;
                                    dsfVar2 = dsfVar;
                                    i14 = i8;
                                    i5 = i7;
                                    fsfVar = fsfVar2;
                                } catch (uba e10) {
                                    e = e10;
                                    hraVar2 = hraVar3;
                                    B = t62.B(e.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                                    float f82222 = e.a + i5;
                                    csf csfVar2222 = new csf();
                                    f3 = new Float(f82222);
                                    if (((Number) B.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    }
                                    zzVar = new zz(f82222, csfVar2222, fsaVar2, 1);
                                    hraVar2.r = fsaVar2;
                                    hraVar2.s = null;
                                    hraVar2.t = null;
                                    hraVar2.u = null;
                                    hraVar2.v = i6;
                                    hraVar2.w = i5;
                                    hraVar2.D = 2;
                                    if (d2a.p(B, f3, null, !z, zzVar, hraVar2, 2) != lu3Var) {
                                    }
                                    return lu3Var;
                                }
                                hraVar3 = hraVar;
                                return lu3Var;
                            }
                            break;
                        default:
                            i12 = ((a6e) fsaVar3.c).n();
                            if (i12 > 0) {
                            }
                            break;
                    }
                }
                return Unit.a;
                B = t62.B(e.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                float f822222 = e.a + i5;
                csf csfVar22222 = new csf();
                f3 = new Float(f822222);
                z = ((Number) B.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                zzVar = new zz(f822222, csfVar22222, fsaVar2, 1);
                hraVar2.r = fsaVar2;
                hraVar2.s = null;
                hraVar2.t = null;
                hraVar2.u = null;
                hraVar2.v = i6;
                hraVar2.w = i5;
                hraVar2.D = 2;
                if (d2a.p(B, f3, null, !z, zzVar, hraVar2, 2) != lu3Var) {
                    fsaVar4 = fsaVar2;
                    i10 = i5;
                    i11 = i6;
                    fsaVar4.f(i11, i10);
                    return Unit.a;
                }
                return lu3Var;
            }
        }
        hraVar = new hra(sq3Var);
        Object obj2 = hraVar.C;
        lu3Var = lu3.a;
        i4 = hraVar.D;
        float f72 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z22 = true;
        if (i4 != 0) {
        }
        B = t62.B(e.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
        float f8222222 = e.a + i5;
        csf csfVar222222 = new csf();
        f3 = new Float(f8222222);
        if (((Number) B.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        zzVar = new zz(f8222222, csfVar222222, fsaVar2, 1);
        hraVar2.r = fsaVar2;
        hraVar2.s = null;
        hraVar2.t = null;
        hraVar2.u = null;
        hraVar2.v = i6;
        hraVar2.w = i5;
        hraVar2.D = 2;
        if (d2a.p(B, f3, null, !z, zzVar, hraVar2, 2) != lu3Var) {
        }
        return lu3Var;
    }

    public static final boolean p(boolean z, fsa fsaVar, int i, int i2) {
        if (z) {
            if (fsaVar.c() > i) {
                return true;
            }
            return fsaVar.c() == i && fsaVar.d() > i2;
        }
        if (fsaVar.c() < i) {
            return true;
        }
        return fsaVar.c() == i && fsaVar.d() < i2;
    }

    public static void q(long j, x52 x52Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            a70.p("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((gc2) arrayList4.get(i8)).h() < i7) {
                a70.p("Failed requirement.");
                return;
            }
        }
        gc2 gc2Var = (gc2) arrayList.get(i2);
        gc2 gc2Var2 = (gc2) arrayList4.get(i3 - 1);
        if (i7 == gc2Var.h()) {
            int intValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            gc2 gc2Var3 = (gc2) arrayList4.get(i9);
            i4 = i9;
            i5 = intValue;
            gc2Var = gc2Var3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (gc2Var.m(i7) == gc2Var2.m(i7)) {
            int min = Math.min(gc2Var.h(), gc2Var2.h());
            int i10 = 0;
            for (int i11 = i7; i11 < min && gc2Var.m(i11) == gc2Var2.m(i11); i11++) {
                i10++;
            }
            long j3 = (x52Var.b / 4) + j + 2 + i10 + 1;
            x52Var.b1(-i10);
            x52Var.b1(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                x52Var.b1(gc2Var.m(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((gc2) arrayList4.get(i4)).h()) {
                    x52Var.b1(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    a70.r("Check failed.");
                    return;
                }
            }
            x52 x52Var2 = new x52();
            x52Var.b1(((int) ((x52Var2.b / 4) + j3)) * (-1));
            q(j3, x52Var2, i12, arrayList4, i4, i3, arrayList5);
            x52Var.M0(x52Var2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((gc2) arrayList4.get(i14 - 1)).m(i7) != ((gc2) arrayList4.get(i14)).m(i7)) {
                i13++;
            }
        }
        long j4 = (x52Var.b / 4) + j + 2 + (i13 * 2);
        x52Var.b1(i13);
        x52Var.b1(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int m = ((gc2) arrayList4.get(i15)).m(i7);
            if (i15 == i4 || m != ((gc2) arrayList4.get(i15 - 1)).m(i7)) {
                x52Var.b1(m & 255);
            }
        }
        x52 x52Var3 = new x52();
        int i16 = i4;
        while (i16 < i3) {
            byte m2 = ((gc2) arrayList4.get(i16)).m(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (m2 != ((gc2) arrayList4.get(i18)).m(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((gc2) arrayList4.get(i16)).h()) {
                x52Var.b1(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                x52Var.b1(((int) ((x52Var3.b / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                q(j2, x52Var3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        x52Var.M0(x52Var3);
    }

    public static void r(Context context) {
        context.getClass();
        List j = b.j(SofaWidgetReceiver.class, WorldCupWidgetReceiver.class);
        if (j == null || !j.isEmpty()) {
            Iterator it = j.iterator();
            while (it.hasNext()) {
                int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) it.next()));
                appWidgetIds.getClass();
                if (appWidgetIds.length != 0) {
                    return;
                }
            }
        }
        xbl d = xbl.d(context);
        d.getClass();
        d.c();
    }

    public static final void s(b20 b20Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            s(b20Var, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d16 * sqrt2;
        double d23 = sqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = Math.atan2(d13 - d9, d12 - d8);
        double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * cos) - (d25 * sin);
        double d27 = (d25 * cos) + (d24 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d28 = -d10;
        double d29 = d28 * cos2;
        double d30 = d6 * sin2;
        double d31 = (d29 * sin3) - (d30 * cos3);
        double d32 = d28 * sin2;
        double d33 = d6 * cos2;
        double d34 = (cos3 * d33) + (sin3 * d32);
        double d35 = atan22 / ceil;
        double d36 = atan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < ceil) {
            double d40 = d36 + d35;
            double sin4 = Math.sin(d40);
            double cos4 = Math.cos(d40);
            int i2 = ceil;
            double d41 = (((d10 * cos2) * cos4) + d26) - (d30 * sin4);
            double d42 = (d33 * sin4) + (d10 * sin2 * cos4) + d27;
            double d43 = (d29 * sin4) - (d30 * cos4);
            double d44 = (cos4 * d33) + (sin4 * d32);
            double d45 = d40 - d36;
            double tan = Math.tan(d45 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            b20Var.a.cubicTo((float) ((d37 * sqrt3) + d), (float) ((d38 * sqrt3) + d39), (float) (d41 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            sin2 = sin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            ceil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static final int t(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int u(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static ecd v(EventMediaNews eventMediaNews) {
        eventMediaNews.getClass();
        int id = eventMediaNews.getId();
        String B = jca.B(eventMediaNews.getHeader());
        String description = eventMediaNews.getDescription();
        String B2 = description != null ? jca.B(description) : null;
        String thumbnailUrl = eventMediaNews.getThumbnailUrl();
        String externalUrl = eventMediaNews.getExternalUrl();
        Long publishedAtTimestamp = eventMediaNews.getPublishedAtTimestamp();
        return new ecd(id, B, B2, publishedAtTimestamp != null ? publishedAtTimestamp.longValue() : 0L, externalUrl, thumbnailUrl, eventMediaNews.getNewsProvider());
    }

    public static final View w(ViewPager2 viewPager2) {
        viewPager2.getClass();
        View childAt = viewPager2.getChildAt(0);
        if (childAt != null) {
            return childAt;
        }
        zzl.r(ljg.j(viewPager2.getChildCount(), "Index: 0, Size: "));
        return null;
    }

    public static final k6b x(g6b g6bVar) {
        g6bVar.getClass();
        t9d t9dVar = g6bVar.a;
        while (true) {
            k6b k6bVar = (k6b) ((AtomicReference) t9dVar.a).get();
            if (k6bVar != null) {
                return k6bVar;
            }
            smi o = tz9.o();
            hs4 hs4Var = z45.a;
            k6b k6bVar2 = new k6b(g6bVar, kotlin.coroutines.e.d(o, rob.a.f));
            AtomicReference atomicReference = (AtomicReference) t9dVar.a;
            do {
                rq3 rq3Var = null;
                if (atomicReference.compareAndSet(null, k6bVar2)) {
                    hs4 hs4Var2 = z45.a;
                    xw3.L(k6bVar2, rob.a.f, null, new qa7(k6bVar2, rq3Var, 20), 2);
                    return k6bVar2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static int y(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        int i = typedValue.type;
        if (i == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i != 6) {
                return -2;
            }
            int i2 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i2, i2);
        }
        return (int) fraction;
    }

    public static final boolean z(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public abstract iwn L(zzcu zzcuVar);

    public abstract qwn M(zzcu zzcuVar);

    public abstract void N(qwn qwnVar, qwn qwnVar2);

    public abstract void P(qwn qwnVar, Thread thread);

    public abstract boolean R(zzcu zzcuVar, iwn iwnVar, iwn iwnVar2);

    public abstract boolean S(twn twnVar, Object obj, Object obj2);

    public abstract boolean T(twn twnVar, qwn qwnVar, qwn qwnVar2);
}
