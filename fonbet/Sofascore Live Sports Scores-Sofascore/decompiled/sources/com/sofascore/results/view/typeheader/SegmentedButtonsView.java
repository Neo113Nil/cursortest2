package com.sofascore.results.view.typeheader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.e;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a99;
import defpackage.ao2;
import defpackage.av8;
import defpackage.chf;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.esk;
import defpackage.fvg;
import defpackage.gv9;
import defpackage.haa;
import defpackage.hje;
import defpackage.hz8;
import defpackage.jf;
import defpackage.k13;
import defpackage.l4a;
import defpackage.l6g;
import defpackage.l98;
import defpackage.lz;
import defpackage.m81;
import defpackage.n9e;
import defpackage.nf3;
import defpackage.o8;
import defpackage.of3;
import defpackage.oyn;
import defpackage.rlh;
import defpackage.s1h;
import defpackage.sea;
import defpackage.sha;
import defpackage.t1h;
import defpackage.tc3;
import defpackage.ujf;
import defpackage.utc;
import defpackage.v1h;
import defpackage.vqg;
import defpackage.y1h;
import defpackage.yqo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015RC\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u001bR/\u0010\"\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R/\u0010(\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010,\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0004\"\u0004\b+\u0010\f¨\u0006-"}, d2 = {"Lcom/sofascore/results/view/typeheader/SegmentedButtonsView;", "Lo8;", "", "getLayoutId", "()I", "Landroid/graphics/drawable/Drawable;", "background", "", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "color", "setBackgroundColor", "(I)V", "Lgv9;", "Lt1h;", "", "getHeaderTypes", "()Lgv9;", "", "visibility", "setVisibility", "(Z)V", "<set-?>", "e", "Le1d;", "getItemsState", "setItemsState", "(Lgv9;)V", "itemsState", InneractiveMediationDefs.GENDER_FEMALE, "getSelectedItem", "()Ljava/lang/String;", "setSelectedItem", "(Ljava/lang/String;)V", "selectedItem", "l", "getFallbackToLabel", "()Ljava/lang/Boolean;", "setFallbackToLabel", "(Ljava/lang/Boolean;)V", "fallbackToLabel", U3.i.X, "getSelectedIndex", "setSelectedIndex", "selectedIndex", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SegmentedButtonsView extends o8 {
    public static final /* synthetic */ int m = 0;
    public final esk d;

    /* renamed from: e, reason: from kotlin metadata */
    public final e1d itemsState;

    /* renamed from: f, reason: from kotlin metadata */
    public final e1d selectedItem;
    public boolean g;
    public Pair h;
    public Function1 i;
    public y1h j;
    public Function2 k;

    /* renamed from: l, reason: from kotlin metadata */
    public final e1d fallbackToLabel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SegmentedButtonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        esk a = esk.a(getRoot());
        this.d = a;
        this.itemsState = e.f(rlh.b);
        this.selectedItem = e.f(null);
        Boolean bool = Boolean.FALSE;
        this.h = new Pair(bool, bool);
        this.i = new vqg(28);
        this.j = v1h.f;
        this.fallbackToLabel = e.f(null);
        setNewLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.n, 0, 0);
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
            Pair pair = this.h;
            boolean booleanValue = ((Boolean) pair.a).booleanValue();
            boolean booleanValue2 = ((Boolean) pair.b).booleanValue();
            if (booleanValue || booleanValue2) {
                setElevation(ao2.u(2, context));
                sea.v(getRoot(), booleanValue, booleanValue2, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            }
        } else {
            addOnAttachStateChangeListener(new jf(this, this, context, 4));
        }
        a.a.setContent(new tc3(577251956, new fvg(this, 6), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gv9 getItemsState() {
        return (gv9) ((eoh) this.itemsState).getValue();
    }

    public static final Unit j(SegmentedButtonsView segmentedButtonsView, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            Function1 function1 = segmentedButtonsView.i;
            gv9 itemsState = segmentedButtonsView.getItemsState();
            ArrayList arrayList = new ArrayList(k13.r(itemsState, 10));
            Iterator<E> it = itemsState.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((t1h) it.next()).getItem());
            }
            boolean booleanValue = ((Boolean) function1.invoke(arrayList)).booleanValue();
            segmentedButtonsView.setVisibility(booleanValue);
            haa.f(yqo.H(980869999, av8Var, new m81(segmentedButtonsView, booleanValue, 12)), av8Var, 6);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit o(SegmentedButtonsView segmentedButtonsView, boolean z, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            gv9 itemsState = segmentedButtonsView.getItemsState();
            Boolean valueOf = Boolean.valueOf(segmentedButtonsView.g);
            boolean i2 = av8Var.i(segmentedButtonsView);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            Object[] objArr = 0;
            if (i2 || O == a99Var) {
                O = new hje(segmentedButtonsView, objArr == true ? 1 : 0, 5);
                av8Var.n0(O);
            }
            hz8.q(itemsState, valueOf, (Function2) O, av8Var);
            if (z && (segmentedButtonsView.getFallbackToLabel() == null || segmentedButtonsView.getItemsState().size() > 1)) {
                av8Var.d0(-1859018753);
                gv9 itemsState2 = segmentedButtonsView.getItemsState();
                String selectedItem = segmentedButtonsView.getSelectedItem();
                if (selectedItem == null) {
                    selectedItem = (String) ((t1h) CollectionsKt.Y(segmentedButtonsView.getItemsState())).getItem();
                }
                String str = selectedItem;
                boolean i3 = av8Var.i(segmentedButtonsView);
                Object O2 = av8Var.O();
                if (i3 || O2 == a99Var) {
                    chf chfVar = new chf(1, segmentedButtonsView, SegmentedButtonsView.class, "onItemSelected", "onItemSelected(Ljava/lang/String;)V", 0, 9);
                    av8Var.n0(chfVar);
                    O2 = chfVar;
                }
                l4a.a(itemsState2, str, (Function1) ((KFunction) O2), null, segmentedButtonsView.j, false, av8Var, 0, 40);
                av8Var.s(false);
            } else if (z && Intrinsics.c(segmentedButtonsView.getFallbackToLabel(), Boolean.TRUE)) {
                av8Var.d0(-1858665570);
                Object Y = CollectionsKt.Y(segmentedButtonsView.getItemsState());
                s1h s1hVar = Y instanceof s1h ? (s1h) Y : null;
                String str2 = s1hVar != null ? s1hVar.b : null;
                if (str2 == null) {
                    str2 = "";
                }
                sha.a(0, 0, av8Var, l98.d0(n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), str2);
                av8Var.s(false);
            } else {
                av8Var.d0(-1858337869);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
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

    private final void setVisibility(boolean visibility) {
        boolean z = getVisibility() == 0;
        setVisibility(visibility ? 0 : 8);
        if (z != visibility) {
            requestLayout();
        }
    }

    public static /* synthetic */ void t(SegmentedButtonsView segmentedButtonsView, Collection collection, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        segmentedButtonsView.s(collection, str, (i & 4) == 0);
    }

    @Nullable
    public final Boolean getFallbackToLabel() {
        return (Boolean) ((eoh) this.fallbackToLabel).getValue();
    }

    @NotNull
    public final gv9 getHeaderTypes() {
        return getItemsState();
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.view_compose_view;
    }

    public final int getSelectedIndex() {
        Iterator it = getItemsState().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.c(((t1h) it.next()).getItem(), getSelectedItem())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Nullable
    public final String getSelectedItem() {
        return (String) ((eoh) this.selectedItem).getValue();
    }

    public final void p(String str) {
        setSelectedItem(str);
        Function2 function2 = this.k;
        if (function2 != null) {
            Iterator it = getItemsState().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.c(((t1h) it.next()).getItem(), getSelectedItem())) {
                    break;
                } else {
                    i++;
                }
            }
            function2.invoke(str, Integer.valueOf(i));
        }
    }

    public final void q(String str, boolean z) {
        str.getClass();
        this.g = z;
        gv9 itemsState = getItemsState();
        if (itemsState == null || !itemsState.isEmpty()) {
            Iterator<E> it = itemsState.iterator();
            while (it.hasNext()) {
                if (Intrinsics.c(((t1h) it.next()).getItem(), str)) {
                    break;
                }
            }
        }
        t1h t1hVar = (t1h) CollectionsKt.firstOrNull(getItemsState());
        str = t1hVar != null ? (String) t1hVar.getItem() : null;
        setSelectedItem(str);
    }

    public final void r() {
        Function2 function2;
        int i = 0;
        this.g = false;
        String selectedItem = getSelectedItem();
        if (selectedItem == null) {
            t1h t1hVar = (t1h) CollectionsKt.firstOrNull(getItemsState());
            selectedItem = t1hVar != null ? (String) t1hVar.getItem() : null;
        }
        if (selectedItem == null || (function2 = this.k) == null) {
            return;
        }
        Iterator it = getItemsState().iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.c(((t1h) it.next()).getItem(), selectedItem)) {
                break;
            } else {
                i++;
            }
        }
        function2.invoke(selectedItem, Integer.valueOf(i));
    }

    public final void s(Collection collection, String str, boolean z) {
        gv9 itemsState;
        collection.getClass();
        setItemsState(l6g.W(collection));
        if (str != null && ((itemsState = getItemsState()) == null || !itemsState.isEmpty())) {
            Iterator<E> it = itemsState.iterator();
            while (it.hasNext()) {
                if (Intrinsics.c(((t1h) it.next()).getItem(), str)) {
                    setSelectedItem(str);
                    break;
                }
            }
        }
        gv9 itemsState2 = getItemsState();
        if (itemsState2 == null || !itemsState2.isEmpty()) {
            Iterator<E> it2 = itemsState2.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.c(((t1h) it2.next()).getItem(), getSelectedItem())) {
                    break;
                }
            }
        }
        t1h t1hVar = (t1h) CollectionsKt.firstOrNull(getItemsState());
        setSelectedItem(t1hVar != null ? (String) t1hVar.getItem() : null);
        if (z) {
            r();
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

    public final void setFallbackToLabel(@Nullable Boolean bool) {
        ((eoh) this.fallbackToLabel).setValue(bool);
    }

    public final void setSelectedIndex(int i) {
        if (i < getItemsState().size()) {
            setSelectedItem((String) ((t1h) getItemsState().get(i)).getItem());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
