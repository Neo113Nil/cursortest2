package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.sofascore.local_persistance.Brand;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class lmj extends a3 {
    public final e1d k;
    public final e1d l;
    public final e1d m;
    public int n;
    public Function0 o;
    public Function1 p;
    public Function0 q;
    public zsk r;
    public zsk s;
    public final float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmj(Context context) {
        super(context, null, 0);
        context.getClass();
        this.k = e.f(null);
        this.l = e.f(null);
        this.m = e.f(Boolean.TRUE);
        this.o = new eej(12);
        this.p = new qaj(15);
        this.q = new eej(13);
        this.t = 8.0f;
        setVisibility(8);
    }

    private final Brand getBrand() {
        return (Brand) ((eoh) this.l).getValue();
    }

    private final vte getState() {
        return (vte) ((eoh) this.k).getValue();
    }

    private final void setBrand(Brand brand) {
        ((eoh) this.l).setValue(brand);
    }

    private final void setState(vte vteVar) {
        ((eoh) this.k).setValue(vteVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.d0(-1462235062);
        vte state = getState();
        if (state == null) {
            av8Var.s(false);
            return;
        }
        Brand brand = getBrand();
        if (brand == null || (!(state instanceof ute) && !(state instanceof rte) && state.a() == null)) {
            brand = null;
        }
        haa.f(yqo.H(1173170927, av8Var, new mfh(13, brand, this, state)), av8Var, 6);
        av8Var.s(false);
    }

    /* renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public float mo904getHorizontalPaddingD9Ej5fM() {
        return this.t;
    }

    public final boolean getShowVotingBubble() {
        return ((Boolean) ((eoh) this.m).getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if ((r5 != null ? r5.a() : null) != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(vte vteVar, int i, Brand brand, Function0 function0, Function1 function1, Function0 function02) {
        setState(vteVar);
        this.n = i;
        setBrand(brand);
        this.o = function0;
        this.p = function1;
        this.q = function02;
        if (getVisibility() != 0) {
            Brand brand2 = getBrand();
            int i2 = 0;
            if (brand2 != null) {
                vte state = getState();
                if (!(state instanceof ute) && !(state instanceof rte)) {
                }
                if (this.r == null) {
                    if (isAttachedToWindow()) {
                        g6b t = qea.t(this);
                        if (t != null) {
                            zsk zskVar = new zsk(t, 30);
                            zskVar.b(this, new kmj(i2, this, brand2), null);
                            this.r = zskVar;
                        }
                    } else {
                        addOnAttachStateChangeListener(new jf(this, this, brand2, 5));
                    }
                }
                setVisibility(0);
            }
            zsk zskVar2 = this.r;
            if (zskVar2 != null) {
                zskVar2.a();
            }
            this.r = null;
            setVisibility(0);
        }
        vte state2 = getState();
        if (!(state2 instanceof tte) ? (state2 instanceof ute) && ((ute) state2).a == null : ((tte) state2).c == null) {
            zsk zskVar3 = this.s;
            if (zskVar3 != null) {
                zskVar3.a();
            }
            this.s = null;
            return;
        }
        if (this.s != null) {
            return;
        }
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new a16(this, 7, this));
            return;
        }
        g6b t2 = qea.t(this);
        if (t2 != null) {
            zsk zskVar4 = new zsk(t2, 30);
            zskVar4.b(this, new ps4(this, 12), null);
            this.s = zskVar4;
        }
    }

    public boolean m() {
        return false;
    }

    public final void setShowVotingBubble(boolean z) {
        ((eoh) this.m).setValue(Boolean.valueOf(z));
    }
}
