package com.vk.channels.impl.channel_screen.profile;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.im.ui.fragments.ImFragment;
import com.vk.im.ui.fragments.chat.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import io.reactivex.rxjava3.disposables.b;
import kotlin.LazyThreadSafetyMode;
import xsna.a1w;
import xsna.ah;
import xsna.bpn0;
import xsna.e4;
import xsna.eb;
import xsna.eu1;
import xsna.g2v;
import xsna.gy0;
import xsna.ixa;
import xsna.kbj0;
import xsna.m4;
import xsna.msy;
import xsna.nr4;
import xsna.oz50;
import xsna.pu;
import xsna.q;
import xsna.q1w;
import xsna.q9b;
import xsna.too0;
import xsna.vxd0;
import xsna.wqx0;
import xsna.yg;
import xsna.zg;
import xsna.zwb;
import xsna.zy;

/* compiled from: ChannelProfileFragment.kt */
/* loaded from: classes16.dex */
public final class ChannelProfileFragment extends ImFragment implements zwb.a, too0 {
    public static final /* synthetic */ int e0 = 0;
    public final b P = new b();
    public final a1w Q;
    public final kbj0 R;
    public final Object S;
    public final Object T;
    public final bpn0 U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final Object c0;
    public zwb d0;

    /* compiled from: ChannelProfileFragment.kt */
    public static final class a extends oz50 {
    }

    public ChannelProfileFragment() {
        a1w a1wVar = q1w.a;
        this.Q = a1wVar == null ? null : a1wVar;
        this.R = nr4.b();
        eb ebVar = new eb(this, 10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, ebVar);
        this.T = msy.a(lazyThreadSafetyMode, new eu1(this, 11));
        this.U = new bpn0(new q(this, 12));
        this.V = msy.a(lazyThreadSafetyMode, new zy(this, 18));
        this.W = msy.a(lazyThreadSafetyMode, new yg(this, 12));
        this.X = msy.a(lazyThreadSafetyMode, new zg(this, 15));
        this.Y = msy.a(lazyThreadSafetyMode, new ah(this, 11));
        this.Z = msy.a(lazyThreadSafetyMode, new m4(this, 14));
        this.a0 = msy.a(lazyThreadSafetyMode, new pu(this, 18));
        this.b0 = msy.a(lazyThreadSafetyMode, new e4(this, 8));
        this.c0 = msy.a(lazyThreadSafetyMode, new gy0(this, 14));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        zwb zwbVar = this.d0;
        if (zwbVar == null) {
            zwbVar = null;
        }
        if (zwbVar.d) {
            zwbVar.X0().m();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Vn() {
        wqx0.b(requireView());
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        if (this.x) {
            zwb zwbVar = this.d0;
            (zwbVar != null ? zwbVar : null).X0().b(rect, rect2);
            return false;
        }
        zwb zwbVar2 = this.d0;
        (zwbVar2 != null ? zwbVar2 : null).X0().d(rect2);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        zwb zwbVar = this.d0;
        if (zwbVar == null) {
            zwbVar = null;
        }
        zwbVar.m.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vxd0.a aVar = new vxd0.a((q9b) this.a0.getValue(), ((c) this.b0.getValue()).a());
        Context requireContext = requireContext();
        g2v.c().getClass();
        zwb zwbVar = new zwb(requireContext, aVar, true, this.Q.r().h);
        this.d0 = zwbVar;
        this.O.add(zwbVar);
        zwb zwbVar2 = this.d0;
        if (zwbVar2 == null) {
            zwbVar2 = null;
        }
        zwbVar2.k = this;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zwb zwbVar = this.d0;
        if (zwbVar == null) {
            zwbVar = null;
        }
        return zwbVar.D0(layoutInflater.getContext(), viewGroup, null, bundle);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((ixa) this.V.getValue()).destroy();
        this.P.e();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CHANNEL, Long.valueOf(((Number) this.S.getValue()).longValue()), null, null, null, null, 60, null);
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.IM_CHANNEL_PROFILE;
    }
}
