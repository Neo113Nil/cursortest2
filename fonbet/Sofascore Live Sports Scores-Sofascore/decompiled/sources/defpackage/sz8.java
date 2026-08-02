package defpackage;

import android.app.Activity;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.e;
import androidx.recyclerview.widget.l;
import com.google.android.gms.internal.cast.zzym;
import com.google.android.gms.internal.pal.zzadg;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.core.fid.Constants;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sz8 implements tec, xcb, xfc, sjb, ph2, OnSuccessListener, OnFailureListener, OnCanceledListener, pjd, oy3, xj6, g49, vyf {
    public static volatile sz8 c;
    public static final wud d = new wud(1);
    public static final wud e = new wud(0);
    public static final h9n f = new h9n(1);
    public static final wje g = new wje(28);
    public final /* synthetic */ int a;
    public Object b;

    public sz8(int i) {
        lbn lbnVar;
        this.a = i;
        int i2 = 10;
        switch (i) {
            case 2:
                try {
                    lbnVar = (lbn) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                } catch (Exception unused) {
                    lbnVar = f;
                }
                wan wanVar = new wan(h9n.b, lbnVar);
                Charset charset = zzadg.a;
                this.b = wanVar;
                break;
            case 3:
                int i3 = tbp.a;
                muo muoVar = new muo(new dfp[]{wxf.q, g}, 7);
                Charset charset2 = zzym.a;
                this.b = muoVar;
                break;
            case 9:
                this.b = new AtomicLong();
                break;
            case 10:
                this.b = new CopyOnWriteArrayList();
                break;
            case 14:
                this.b = new CountDownLatch(1);
                break;
            case 16:
                this.b = cga.c(new q73(i2));
                break;
            case 19:
                this.b = gdi.a(t9k.b);
                break;
            case 21:
                break;
            case 22:
                av9 av9Var = hv9.b;
                this.b = vvf.e;
                break;
            case 26:
                this.b = new axn();
                break;
            case 29:
                this.b = new nkk(10);
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public Map A(String str) {
        if (str == null) {
            return null;
        }
        bga bgaVar = (bga) this.b;
        p5c p5cVar = bgaVar.b;
        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
        KTypeProjection invariant = companion.invariant(duf.b(String.class));
        KTypeProjection invariant2 = companion.invariant(duf.c(List.class, companion.invariant(duf.b(String.class))));
        fuf fufVar = duf.a;
        return (Map) bgaVar.b(sha.Q(p5cVar, fufVar.typeOf(fufVar.getOrCreateKotlinClass(Map.class), Arrays.asList(invariant, invariant2), true)), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r5.a > ((defpackage.od4) r1).a) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B(adi adiVar) {
        Object value;
        adi adiVar2;
        adiVar.getClass();
        fdi fdiVar = (fdi) this.b;
        do {
            value = fdiVar.getValue();
            adiVar2 = (adi) value;
            if (!(adiVar2 instanceof wnf) && !Intrinsics.c(adiVar2, t9k.b)) {
                if (!(adiVar2 instanceof od4)) {
                    if (!(adiVar2 instanceof e38)) {
                        if (adiVar2 instanceof mdd) {
                            a70.r("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return;
                        } else {
                            zzl.b();
                            return;
                        }
                    }
                }
            }
            adiVar2 = adiVar;
        } while (!fdiVar.k(value, adiVar2));
    }

    public void C(int i, Object obj, usg usgVar) {
        g03 g03Var = (g03) this.b;
        g03Var.y(i, 3);
        usgVar.f((r5) obj, g03Var.a);
        g03Var.y(i, 4);
    }

    @Override // defpackage.g49
    public Object a(Object obj) {
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
        return new Pair(Integer.valueOf(fantasyRoundPlayerUiModel.h), fantasyRoundPlayerUiModel.i);
    }

    @Override // defpackage.xfc
    public void b(vec vecVar, boolean z) {
        ((ub0) this.b).v(vecVar);
    }

    @Override // defpackage.oy3
    public void c(Object obj) {
        ex8 ex8Var = (ex8) obj;
        ex8Var.getClass();
        lj2 lj2Var = (lj2) this.b;
        if (lj2Var.r() instanceof oed) {
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(new u2g(ex8Var));
        }
    }

    @Override // defpackage.xcb
    public void d(int i, int i2) {
        ((l) this.b).notifyItemRangeInserted(i, i2);
    }

    @Override // defpackage.ph2
    public void e(zg2 zg2Var, c2g c2gVar) {
        ((ua3) this.b).complete(c2gVar);
    }

    @Override // defpackage.xcb
    public void f(int i, int i2) {
        ((l) this.b).notifyItemRangeRemoved(i, i2);
    }

    @Override // defpackage.xcb
    public void g(int i, int i2, Object obj) {
        ((l) this.b).notifyItemRangeChanged(i, i2, obj);
    }

    @Override // defpackage.xj6
    public int getHeight() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedSize();
    }

    @Override // defpackage.xj6
    public ViewGroup.LayoutParams getLayoutParams() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.b;
        return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
    }

    @Override // defpackage.xj6
    public int getPaddingEnd() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedPadding();
    }

    @Override // defpackage.xj6
    public int getPaddingStart() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedPadding();
    }

    @Override // defpackage.xj6
    public int getWidth() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedSize();
    }

    @Override // defpackage.xcb
    public void h(int i, int i2) {
        ((l) this.b).notifyItemMoved(i, i2);
    }

    @Override // defpackage.sjb
    public void i() {
        ((AtomicLong) this.b).getAndAdd(1L);
    }

    @Override // defpackage.tec
    public void j(vec vecVar) {
        tec tecVar = ((ActionMenuView) this.b).g;
        if (tecVar != null) {
            tecVar.j(vecVar);
        }
    }

    @Override // defpackage.xfc
    public boolean k(vec vecVar) {
        Window.Callback callback = ((ub0) this.b).l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, vecVar);
        return true;
    }

    @Override // defpackage.g49
    public Iterator l() {
        return ((Iterable) this.b).iterator();
    }

    @Override // defpackage.ph2
    public void m(zg2 zg2Var, Throwable th) {
        ((ua3) this.b).completeExceptionally(th);
    }

    @Override // defpackage.pjd
    public Object n() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            vp2.c(type, "Invalid EnumSet type: ");
            return null;
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        vp2.c(type, "Invalid EnumSet type: ");
        return null;
    }

    public String o(List list) {
        if (list == null) {
            return null;
        }
        bga bgaVar = (bga) this.b;
        return bgaVar.c(sha.Q(bgaVar.b, duf.c(List.class, KTypeProjection.INSTANCE.invariant(duf.b(String.class)))), list);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.vyf
    public void onFinish() {
        e48 e48Var;
        z38 z38Var = (z38) this.b;
        b48 b48Var = z38Var.f;
        if (b48Var.j != null && (e48Var = b48Var.k) != null) {
            ((d55) e48Var).g(c48.b);
        }
        b48Var.a(z38Var.d);
        b48Var.j = null;
        b48Var.k = null;
    }

    @Override // defpackage.oy3
    public void onResult(Object obj) {
        gx8 gx8Var = (gx8) obj;
        gx8Var.getClass();
        lj2 lj2Var = (lj2) this.b;
        if (lj2Var.r() instanceof oed) {
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(gx8Var);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 14:
                ((CountDownLatch) this.b).countDown();
                break;
            default:
                ((x09) this.b).invoke(obj);
                break;
        }
    }

    @Override // defpackage.tec
    public boolean p(vec vecVar, MenuItem menuItem) {
        boolean onMenuItemClick;
        gc gcVar = ((ActionMenuView) this.b).l;
        if (gcVar != null) {
            Toolbar toolbar = (Toolbar) ((d4a) gcVar).b;
            Iterator it = toolbar.G.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ekj ekjVar = toolbar.I;
                    onMenuItemClick = ekjVar != null ? ekjVar.onMenuItemClick(menuItem) : false;
                } else if (((zfc) it.next()).c(menuItem)) {
                    onMenuItemClick = true;
                    break;
                }
            }
            if (onMenuItemClick) {
                return true;
            }
        }
        return false;
    }

    public d2k q(int i, ejg ejgVar) {
        String str = (String) ejgVar.b;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new pfe(new jxc(str));
            }
            if (i == 21) {
                return new pfe(new te5(2));
            }
            if (i == 27) {
                return new pfe(new k59(new b2h(s(ejgVar), 0), false, false));
            }
            if (i == 36) {
                return new pfe(new m59(new b2h(s(ejgVar), 0)));
            }
            if (i == 89) {
                return new pfe(new te5((List) ejgVar.c, 0));
            }
            if (i == 138) {
                return new pfe(new ld5(str));
            }
            if (i == 172) {
                return new pfe(new f9(str, 1));
            }
            if (i == 257) {
                return new pzg(new hcc("application/vnd.dvb.ait"));
            }
            if (i == 134) {
                return new pzg(new hcc(MimeTypes.APPLICATION_SCTE35));
            }
            if (i != 135) {
                switch (i) {
                    case 15:
                        return new pfe(new jl(false, str));
                    case 16:
                        return new pfe(new g59(new b2h(s(ejgVar), 1)));
                    case 17:
                        return new pfe(new jla(str));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case 129:
                                break;
                            case 130:
                            default:
                                return null;
                        }
                }
            }
            return new pfe(new f9(str, 0));
        }
        return new pfe(new c59(new b2h(s(ejgVar), 1)));
    }

    public String r(Map map) {
        if (map == null) {
            return null;
        }
        bga bgaVar = (bga) this.b;
        p5c p5cVar = bgaVar.b;
        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
        return bgaVar.c(sha.Q(p5cVar, duf.e(companion.invariant(duf.b(String.class)), companion.invariant(duf.c(List.class, companion.invariant(duf.b(String.class)))))), map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    public List s(ejg ejgVar) {
        String str;
        int i;
        vvf vvfVar = (vvf) this.b;
        nkk nkkVar = new nkk((byte[]) ejgVar.d);
        ArrayList arrayList = vvfVar;
        while (nkkVar.c() > 0) {
            int s = nkkVar.s();
            int s2 = nkkVar.b + nkkVar.s();
            if (s == 134) {
                arrayList = new ArrayList();
                int s3 = nkkVar.s() & 31;
                for (int i2 = 0; i2 < s3; i2++) {
                    String q = nkkVar.q(3, xp2.c);
                    int s4 = nkkVar.s();
                    boolean z = (s4 & 128) != 0;
                    if (z) {
                        i = s4 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte s5 = (byte) nkkVar.s();
                    nkkVar.F(1);
                    List singletonList = z ? Collections.singletonList((s5 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    pm8 pm8Var = new pm8();
                    pm8Var.k = str;
                    pm8Var.c = q;
                    pm8Var.C = i;
                    pm8Var.m = singletonList;
                    arrayList.add(new sm8(pm8Var));
                }
            }
            nkkVar.E(s2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public adi t() {
        return (adi) ((fdi) this.b).getValue();
    }

    public cdi u() {
        cl5 a = cl5.a();
        if (a.c() == 1) {
            return new su9(true);
        }
        e1d f2 = e.f(Boolean.FALSE);
        a.h(new fq4(f2, this));
        return f2;
    }

    public String v(Map map) {
        if (map == null) {
            return null;
        }
        bga bgaVar = (bga) this.b;
        p5c p5cVar = bgaVar.b;
        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
        return bgaVar.c(sha.Q(p5cVar, duf.e(companion.invariant(duf.b(String.class)), companion.invariant(duf.b(String.class)))), map);
    }

    public void w() {
        long j;
        id4 id4Var = (id4) this.b;
        synchronized (td4.g) {
            try {
                j = td4.h ? td4.i : C.TIME_UNSET;
            } catch (Throwable th) {
                throw th;
            }
        }
        id4Var.K = j;
        id4Var.w(true);
    }

    public void x(Activity activity) {
        axn axnVar = (axn) this.b;
        ArrayList arrayList = (ArrayList) axnVar.c;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener((gr8) axnVar.d);
    }

    public List y(String str) {
        if (str == null) {
            return null;
        }
        bga bgaVar = (bga) this.b;
        p5c p5cVar = bgaVar.b;
        KTypeProjection invariant = KTypeProjection.INSTANCE.invariant(duf.b(String.class));
        fuf fufVar = duf.a;
        return (List) bgaVar.b(sha.Q(p5cVar, fufVar.typeOf(fufVar.getOrCreateKotlinClass(List.class), Collections.singletonList(invariant), true)), str);
    }

    public Map z(String str) {
        if (str == null) {
            return null;
        }
        bga bgaVar = (bga) this.b;
        p5c p5cVar = bgaVar.b;
        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
        KTypeProjection invariant = companion.invariant(duf.b(String.class));
        KTypeProjection invariant2 = companion.invariant(duf.b(String.class));
        fuf fufVar = duf.a;
        return (Map) bgaVar.b(sha.Q(p5cVar, fufVar.typeOf(fufVar.getOrCreateKotlinClass(Map.class), Arrays.asList(invariant, invariant2), true)), str);
    }

    public sz8(g03 g03Var) {
        this.a = 12;
        Charset charset = u7a.a;
        this.b = g03Var;
        g03Var.a = this;
    }

    public /* synthetic */ sz8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public sz8(au3 au3Var) {
        this.a = 6;
        au3Var.getClass();
        this.b = au3Var;
    }

    public sz8(yzc yzcVar, ddb ddbVar) {
        this.a = 1;
        ddbVar.getClass();
        this.b = ddbVar;
    }
}
