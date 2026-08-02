package com.sofascore.results.view.typeheader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.e;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a16;
import defpackage.aee;
import defpackage.av8;
import defpackage.bf3;
import defpackage.bkh;
import defpackage.crj;
import defpackage.ct8;
import defpackage.d5k;
import defpackage.e12;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.esk;
import defpackage.f50;
import defpackage.ff3;
import defpackage.fqj;
import defpackage.goa;
import defpackage.gv9;
import defpackage.h3i;
import defpackage.haa;
import defpackage.hf3;
import defpackage.hje;
import defpackage.hrh;
import defpackage.hz8;
import defpackage.if3;
import defpackage.k13;
import defpackage.k1c;
import defpackage.k8g;
import defpackage.kda;
import defpackage.ksa;
import defpackage.kv1;
import defpackage.l6g;
import defpackage.l8g;
import defpackage.l98;
import defpackage.lqj;
import defpackage.lrh;
import defpackage.msa;
import defpackage.n9e;
import defpackage.nf3;
import defpackage.nq8;
import defpackage.o8;
import defpackage.of3;
import defpackage.p3a;
import defpackage.r13;
import defpackage.rlh;
import defpackage.ry;
import defpackage.sea;
import defpackage.t23;
import defpackage.t3e;
import defpackage.t60;
import defpackage.tc3;
import defpackage.trh;
import defpackage.tz9;
import defpackage.u23;
import defpackage.ujf;
import defpackage.utc;
import defpackage.uxf;
import defpackage.vt2;
import defpackage.waa;
import defpackage.wlj;
import defpackage.ww9;
import defpackage.xtc;
import defpackage.yqo;
import defpackage.zg3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b&\b\u0007\u0018\u00002\u00020\u0001:\u0002??J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001dRC\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010%R/\u0010,\u001a\u0004\u0018\u00010\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u00101\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u001dR+\u00105\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010/\"\u0004\b4\u0010\u001dR\"\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0004\"\u0004\b9\u0010\fR$\u0010>\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0004\"\u0004\b=\u0010\f¨\u0006@"}, d2 = {"Lcom/sofascore/results/view/typeheader/TypeHeaderView;", "Lo8;", "", "getLayoutId", "()I", "Landroid/graphics/drawable/Drawable;", "background", "", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "color", "setBackgroundColor", "(I)V", "Lgv9;", "Lvt2;", "", "getHeaderTypes", "()Lgv9;", "Llrh;", TtmlNode.TAG_STYLE, "setStyle", "(Llrh;)V", "Lkotlin/Function1;", "composable", "setEndContent", "(Lct8;)V", "", "isEnabled", "setEnabledStateAll", "(Z)V", "visibility", "setVisibility", "<set-?>", "d", "Le1d;", "getItemsState", "setItemsState", "(Lgv9;)V", "itemsState", "e", "getSelectedItem", "()Ljava/lang/String;", "setSelectedItem", "(Ljava/lang/String;)V", "selectedItem", InneractiveMediationDefs.GENDER_FEMALE, "getShowDivider", "()Z", "setShowDivider", "showDivider", "l", "getTriggerOnInitialization", "setTriggerOnInitialization", "triggerOnInitialization", TtmlNode.TAG_P, "I", "getHorizontalPadding", "setHorizontalPadding", "horizontalPadding", U3.i.X, "getSelectedIndex", "setSelectedIndex", "selectedIndex", "g5k", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TypeHeaderView extends o8 {
    public static final /* synthetic */ int q = 0;

    /* renamed from: d, reason: from kotlin metadata */
    public final e1d itemsState;

    /* renamed from: e, reason: from kotlin metadata */
    public final e1d selectedItem;

    /* renamed from: f, reason: from kotlin metadata */
    public final e1d showDivider;
    public Function1 g;
    public lrh h;
    public kv1 i;
    public Pair j;
    public Function1 k;

    /* renamed from: l, reason: from kotlin metadata */
    public final e1d triggerOnInitialization;
    public boolean m;
    public d5k n;
    public ct8 o;

    /* renamed from: p, reason: from kotlin metadata */
    public int horizontalPadding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TypeHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        esk a = esk.a(getRoot());
        this.itemsState = e.f(rlh.b);
        this.selectedItem = e.f(null);
        Boolean bool = Boolean.FALSE;
        this.showDivider = e.f(bool);
        this.h = hrh.m;
        this.i = uxf.o;
        this.j = new Pair(bool, bool);
        this.k = new crj(23);
        this.triggerOnInitialization = e.f(bool);
        int i2 = 8;
        this.horizontalPadding = 8;
        setNewLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.s, 0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        setElevation(obtainStyledAttributes.getDimension(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        getRoot().setElevation(getElevation());
        if (drawable != null) {
            getRoot().setBackground(drawable);
        } else {
            getRoot().setBackgroundColor(context.getColor(R.color.surface_1));
        }
        obtainStyledAttributes.recycle();
        if (isAttachedToWindow()) {
            Pair pair = this.j;
            boolean booleanValue = ((Boolean) pair.a).booleanValue();
            boolean booleanValue2 = ((Boolean) pair.b).booleanValue();
            if (booleanValue || booleanValue2) {
                sea.v(getRoot(), booleanValue, booleanValue2, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            }
        } else {
            addOnAttachStateChangeListener(new a16(this, i2, this));
        }
        a.a.setContent(new tc3(797661636, new lqj(this, 6), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gv9 getItemsState() {
        return (gv9) ((eoh) this.itemsState).getValue();
    }

    private final boolean getShowDivider() {
        return ((Boolean) ((eoh) this.showDivider).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getTriggerOnInitialization() {
        return ((Boolean) ((eoh) this.triggerOnInitialization).getValue()).booleanValue();
    }

    public static final Unit j(TypeHeaderView typeHeaderView, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            Function1 function1 = typeHeaderView.k;
            gv9 itemsState = typeHeaderView.getItemsState();
            ArrayList arrayList = new ArrayList(k13.r(itemsState, 10));
            Iterator<E> it = itemsState.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((vt2) it.next()).a);
            }
            boolean booleanValue = ((Boolean) function1.invoke(arrayList)).booleanValue();
            typeHeaderView.setVisibility(booleanValue);
            haa.f(yqo.H(1459843903, av8Var, new t60(typeHeaderView, booleanValue, msa.a(0, 0, av8Var, 0, 3), 29)), av8Var, 6);
            gv9 itemsState2 = typeHeaderView.getItemsState();
            Boolean valueOf = Boolean.valueOf(typeHeaderView.getTriggerOnInitialization());
            boolean i2 = av8Var.i(typeHeaderView);
            Object O = av8Var.O();
            if (i2 || O == nf3.a) {
                O = new hje(typeHeaderView, null, 11);
                av8Var.n0(O);
            }
            hz8.q(itemsState2, valueOf, (Function2) O, av8Var);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    public static final Unit r(TypeHeaderView typeHeaderView, boolean z, ksa ksaVar, of3 of3Var, int i) {
        ff3 ff3Var;
        ry ryVar;
        f50 f50Var;
        f50 f50Var2;
        av8 av8Var;
        utc utcVar;
        float f;
        zg3 zg3Var;
        f50 f50Var3;
        Integer num;
        boolean z2;
        boolean z3;
        boolean z4;
        av8 av8Var2 = (av8) of3Var;
        if (av8Var2.T(i & 1, (i & 3) != 2)) {
            utc utcVar2 = utc.a;
            xtc d = bkh.d(utcVar2, 1.0f);
            u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var2);
            } else {
                av8Var2.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var2, a, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var2, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var2, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var2, C, f50Var6);
            xtc d2 = bkh.d(utcVar2, 1.0f);
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var2);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, f50Var4);
            waa.K(av8Var2, m2, ff3Var2);
            bf3.s(hashCode2, av8Var2, f50Var5, av8Var2, ryVar2);
            waa.K(av8Var2, C2, f50Var6);
            if (z) {
                av8Var2.d0(-1493783888);
                av8Var2.d0(-1018013859);
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                xtc goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                if (!ksaVar.d() || typeHeaderView.o == null) {
                    z3 = false;
                } else {
                    z3 = false;
                    goaVar = goaVar.z(kda.M(3, av8Var2, utcVar2, false, false));
                }
                xtc xtcVar = goaVar;
                av8Var2.s(z3);
                gv9 itemsState = typeHeaderView.getItemsState();
                String selectedItem = typeHeaderView.getSelectedItem();
                if (selectedItem == null) {
                    vt2 vt2Var = (vt2) CollectionsKt.firstOrNull(typeHeaderView.getItemsState());
                    selectedItem = vt2Var != null ? (String) vt2Var.a : null;
                }
                String str = selectedItem;
                boolean z5 = typeHeaderView.m;
                boolean i2 = av8Var2.i(typeHeaderView);
                Object O = av8Var2.O();
                if (i2 || O == nf3.a) {
                    z4 = z5;
                    ff3Var = ff3Var2;
                    ryVar = ryVar2;
                    f50Var = f50Var5;
                    f50Var2 = f50Var6;
                    wlj wljVar = new wlj(1, typeHeaderView, TypeHeaderView.class, "onItemSelected", "onItemSelected(Ljava/lang/String;)V", 0, 2);
                    av8Var2.n0(wljVar);
                    O = wljVar;
                } else {
                    z4 = z5;
                    ff3Var = ff3Var2;
                    ryVar = ryVar2;
                    f50Var = f50Var5;
                    f50Var2 = f50Var6;
                }
                lrh lrhVar = typeHeaderView.h;
                kv1 kv1Var = typeHeaderView.i;
                float f2 = typeHeaderView.horizontalPadding;
                t3e t3eVar = new t3e(f2, 8.0f, f2, 8.0f);
                zg3Var = zg3Var2;
                f50Var3 = f50Var4;
                utcVar = utcVar2;
                f = 1.0f;
                trh.a(itemsState, str, (Function1) ((KFunction) O), xtcVar, ksaVar, t3eVar, lrhVar, false, true, z4, kv1Var, null, av8Var2, 100663296, 2176);
                av8Var = av8Var2;
                av8Var.s(false);
            } else {
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                f50Var = f50Var5;
                f50Var2 = f50Var6;
                av8Var = av8Var2;
                utcVar = utcVar2;
                f = 1.0f;
                zg3Var = zg3Var2;
                f50Var3 = f50Var4;
                av8Var.d0(-1492833397);
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                nq8.h(av8Var, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                av8Var.s(false);
            }
            if (typeHeaderView.o != null) {
                av8Var.d0(-1492679265);
                xtc c0 = l98.c0(bkh.b(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 1), 16.0f, 8.0f);
                k1c c = e12.c(uxf.g, false);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, c0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c, f50Var3);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var2);
                ct8 ct8Var = typeHeaderView.o;
                if (ct8Var == null) {
                    av8Var.d0(2042032831);
                    z2 = false;
                    av8Var.s(false);
                    num = 0;
                } else {
                    z2 = false;
                    av8Var.d0(-765411966);
                    num = 0;
                    ct8Var.invoke(typeHeaderView.h, av8Var, null);
                    av8Var.s(false);
                    Unit unit = Unit.a;
                }
                av8Var.s(true);
                av8Var.s(z2);
            } else {
                num = 0;
                av8Var.d0(-1492239127);
                av8Var.s(false);
            }
            av8Var.s(true);
            if (typeHeaderView.getShowDivider()) {
                av8Var.d0(-837851274);
                tz9.d(1.0f, 390, 8, ((r13) typeHeaderView.h.k.invoke(av8Var, num)).a, 0L, av8Var, bkh.d(utcVar, f));
                av8Var.s(false);
            } else {
                av8Var.d0(-837622835);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var2.W();
        }
        return Unit.a;
    }

    private final void setItemsState(gv9 gv9Var) {
        ((eoh) this.itemsState).setValue(gv9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedItem(String str) {
        ((eoh) this.selectedItem).setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowDivider(boolean z) {
        ((eoh) this.showDivider).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTriggerOnInitialization(boolean z) {
        ((eoh) this.triggerOnInitialization).setValue(Boolean.valueOf(z));
    }

    private final void setVisibility(boolean visibility) {
        boolean z = getVisibility() == 0;
        setVisibility(visibility ? 0 : 8);
        if (z != visibility) {
            requestLayout();
        }
    }

    public static /* synthetic */ void x(TypeHeaderView typeHeaderView, Collection collection, Boolean bool, int i) {
        if ((i & 4) != 0) {
            bool = null;
        }
        typeHeaderView.w(collection, null, bool);
    }

    public static /* synthetic */ void z(TypeHeaderView typeHeaderView, List list, String str, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        typeHeaderView.y(list, str, bool);
    }

    @NotNull
    public final gv9 getHeaderTypes() {
        return getItemsState();
    }

    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.view_compose_view;
    }

    public final int getSelectedIndex() {
        Integer D = n9e.D(getItemsState(), new h3i(this, 1));
        if (D != null) {
            return D.intValue();
        }
        return 0;
    }

    @Nullable
    public final String getSelectedItem() {
        return (String) ((eoh) this.selectedItem).getValue();
    }

    public final void s(String str) {
        setSelectedItem(str);
        d5k d5kVar = this.n;
        if (d5kVar != null) {
            Iterator it = getItemsState().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.c(((vt2) it.next()).a, getSelectedItem())) {
                    break;
                } else {
                    i++;
                }
            }
            d5kVar.a(i, str);
        }
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable background) {
        getRoot().setBackground(background);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        getRoot().setBackgroundColor(color);
    }

    public final void setEnabledStateAll(boolean isEnabled) {
        gv9 itemsState = getItemsState();
        ArrayList arrayList = new ArrayList(k13.r(itemsState, 10));
        Iterator<E> it = itemsState.iterator();
        while (it.hasNext()) {
            arrayList.add(vt2.a((vt2) it.next(), isEnabled, null, 251));
        }
        setItemsState(l6g.W(arrayList));
    }

    public final void setEndContent(@NotNull ct8 composable) {
        composable.getClass();
        if (this.o == null) {
            this.o = composable;
        }
    }

    public final void setHorizontalPadding(int i) {
        this.horizontalPadding = i;
    }

    public final void setSelectedIndex(int i) {
        vt2 vt2Var = (vt2) CollectionsKt.a0(i, getItemsState());
        setSelectedItem(vt2Var != null ? (String) vt2Var.a : null);
    }

    public final void setStyle(@NotNull lrh style) {
        style.getClass();
        this.h = style;
    }

    public final void t(String str, boolean z) {
        setTriggerOnInitialization(z);
        gv9 itemsState = getItemsState();
        if (itemsState == null || !itemsState.isEmpty()) {
            Iterator<E> it = itemsState.iterator();
            while (it.hasNext()) {
                if (Intrinsics.c(((vt2) it.next()).a, str)) {
                    break;
                }
            }
        }
        vt2 vt2Var = (vt2) CollectionsKt.firstOrNull(getItemsState());
        str = vt2Var != null ? (String) vt2Var.a : null;
        setSelectedItem(str);
    }

    public final void u(boolean z) {
        setShowDivider(z);
    }

    public final void v() {
        d5k d5kVar;
        int i = 0;
        setTriggerOnInitialization(false);
        String selectedItem = getSelectedItem();
        if (selectedItem == null) {
            vt2 vt2Var = (vt2) CollectionsKt.firstOrNull(getItemsState());
            selectedItem = vt2Var != null ? (String) vt2Var.a : null;
        }
        if (selectedItem == null || (d5kVar = this.n) == null) {
            return;
        }
        Iterator it = getItemsState().iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.c(((vt2) it.next()).a, selectedItem)) {
                break;
            } else {
                i++;
            }
        }
        d5kVar.a(i, selectedItem);
    }

    public final void w(Collection collection, String str, Boolean bool) {
        gv9 itemsState;
        collection.getClass();
        setItemsState(l6g.W(collection));
        if (str != null && ((itemsState = getItemsState()) == null || !itemsState.isEmpty())) {
            Iterator<E> it = itemsState.iterator();
            while (it.hasNext()) {
                if (Intrinsics.c(((vt2) it.next()).a, str)) {
                    setSelectedItem(str);
                    break;
                }
            }
        }
        gv9 itemsState2 = getItemsState();
        if (itemsState2 == null || !itemsState2.isEmpty()) {
            Iterator<E> it2 = itemsState2.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.c(((vt2) it2.next()).a, getSelectedItem())) {
                    break;
                }
            }
        }
        vt2 vt2Var = (vt2) CollectionsKt.firstOrNull(getItemsState());
        setSelectedItem(vt2Var != null ? (String) vt2Var.a : null);
        if (Intrinsics.c(bool, Boolean.TRUE)) {
            v();
        }
    }

    public final void y(Collection collection, String str, Boolean bool) {
        String str2;
        collection.getClass();
        Collection<String> collection2 = collection;
        ArrayList arrayList = new ArrayList(k13.r(collection2, 10));
        for (String str3 : collection2) {
            Function1 function1 = this.g;
            arrayList.add(new vt2(str3, (function1 == null || (str2 = (String) function1.invoke(str3)) == null) ? str3 : str2, false, null, null, null, null, 252));
        }
        w(arrayList, str, bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
