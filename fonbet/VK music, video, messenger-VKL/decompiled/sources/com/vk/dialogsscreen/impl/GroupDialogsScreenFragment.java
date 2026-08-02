package com.vk.dialogsscreen.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.View;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dialogsfab.impl.Mode;
import com.vk.dialogsscreen.impl.a;
import com.vk.dialogstoolbar.impl.di.DialogsToolbarInternalFeatureComponent;
import com.vk.dialogtags.api.TagsComponent;
import com.vk.dto.common.Peer;
import com.vk.im.engine.di.ImConfigurationScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleScopedComponent;
import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.mvicomponent.MultiComponentFragment;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.builders.ListBuilder;
import xsna.a1w;
import xsna.b1s;
import xsna.b2s;
import xsna.bpn0;
import xsna.bu00;
import xsna.bv0;
import xsna.d7p;
import xsna.dhr0;
import xsna.di3;
import xsna.dx90;
import xsna.e43;
import xsna.f1w;
import xsna.fpf0;
import xsna.g2v;
import xsna.i7o0;
import xsna.jpm;
import xsna.jyv;
import xsna.ko8;
import xsna.l0s;
import xsna.l1s;
import xsna.l7m;
import xsna.m7m;
import xsna.mb80;
import xsna.mdz;
import xsna.msy;
import xsna.mxv;
import xsna.mzp0;
import xsna.ni0;
import xsna.ow90;
import xsna.oz50;
import xsna.p1s;
import xsna.qhh0;
import xsna.rsr;
import xsna.rzp0;
import xsna.s3q0;
import xsna.sbw0;
import xsna.seb;
import xsna.szf0;
import xsna.tju;
import xsna.vmm;
import xsna.wuj;
import xsna.x5i;
import xsna.xds;
import xsna.xis;
import xsna.xq;
import xsna.xqf;
import xsna.y3i;
import xsna.y760;
import xsna.yj50;
import xsna.yq;
import xsna.yw90;
import xsna.z3i;
import xsna.zdw;
import xsna.zrd0;

/* compiled from: GroupDialogsScreenFragment.kt */
/* loaded from: classes18.dex */
public final class GroupDialogsScreenFragment extends MultiComponentFragment implements qhh0, xds, szf0, y760 {
    public static final /* synthetic */ int e0 = 0;
    public final bpn0 U;
    public final b V;
    public final OpenChatListReporter W;
    public final mdz<OpenChatListReporter.Span> X;
    public final Object Y;
    public final l0s Z;
    public final Object a0;
    public jpm b0;
    public yj50<?, ?, ?, ?, ?, ?, ?> c0;
    public l1s d0;

    /* compiled from: GroupDialogsScreenFragment.kt */
    public static final class a extends oz50 {
        public a(long j) {
            super(GroupDialogsScreenFragment.class, null, null);
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Peer b = Peer.a.b(j);
            b.getClass();
            if (!b.Ab(Peer.Type.GROUP)) {
                throw new IllegalArgumentException(yq.b(b, "Not a community id ").toString());
            }
            this.j.putParcelable("group_id", b);
        }

        @Override // xsna.oz50
        public final Intent n(Context context) {
            this.j.putString("performance_track_id", UUID.randomUUID().toString());
            return super.n(context);
        }
    }

    public GroupDialogsScreenFragment() {
        super(R.layout.im_dialogs_screen);
        this.U = new bpn0(new x5i(this, 26));
        this.V = new b();
        zdw zdwVar = i7o0.b;
        OpenChatListReporter l = (zdwVar == null ? null : zdwVar).d.n().l(UUID.randomUUID().toString());
        this.W = l;
        mdz<OpenChatListReporter.Span> mdzVar = new mdz<>(0L, OpenChatListReporter.Span.ROOT, null);
        l.c(mdzVar);
        this.X = mdzVar;
        xqf xqfVar = new xqf(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Y = msy.a(lazyThreadSafetyMode, xqfVar);
        zdw zdwVar2 = i7o0.b;
        this.Z = new l0s(mdzVar, l, (zdwVar2 == null ? null : zdwVar2).d.t().a());
        this.a0 = msy.a(lazyThreadSafetyMode, new xis(this, 6));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.IM_GROUP, null, false, 62).j();
        mzp0Var.init();
        l.d(mzp0Var);
        this.J = mzp0Var;
        zrd0 zrd0Var = zrd0.a;
        this.L = (yw90) zrd0.a(PerformanceScoreProduct.IM_GROUP).j();
        On().init();
    }

    public static Peer lo(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("group_id", Peer.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("group_id");
                if (!(parcelable3 instanceof Peer)) {
                    parcelable3 = null;
                }
                parcelable = (Peer) parcelable3;
            }
            Peer peer = (Peer) parcelable;
            if (peer != null) {
                return peer;
            }
        }
        return Peer.Unknown.e;
    }

    @Override // xsna.szf0
    public final boolean Hg(Bundle bundle) {
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        finish();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final Iterable<yj50<?, ?, ?, ?, ?, ?, ?>> fo() {
        ListBuilder e = e43.e();
        zdw zdwVar = i7o0.b;
        wuj wujVar = (wuj) (zdwVar != null ? zdwVar : null).m.a;
        if (zdwVar == null) {
            zdwVar = null;
        }
        b2s b2sVar = (b2s) zdwVar.p.a;
        bpn0 bpn0Var = this.U;
        a1w a1wVar = (a1w) bpn0Var.getValue();
        mxv c = g2v.c();
        seb.a.C3664a c3664a = seb.a.a;
        l0s l0sVar = this.Z;
        d7p.a.C2710a c2710a = d7p.a.a;
        l1s l1sVar = new l1s(this, wujVar, b2sVar, null, null, a1wVar, c, c3664a, l0sVar, c2710a);
        this.d0 = l1sVar;
        e.add(l1sVar);
        jpm jpmVar = new jpm(this, g2v.c().b(), lo(getArguments()), Mode.NEW_CHAT, null, 16);
        this.b0 = jpmVar;
        e.add(jpmVar);
        yj50<?, ?, ?, ?, ?, ?, ?> a2 = ((DialogsToolbarInternalFeatureComponent) this.a0.getValue()).ra().a(this, new com.vk.dialogsscreen.impl.a((a1w) bpn0Var.getValue(), new a.b(g2v.c().b(), g2v.c().k()), new a.C0895a(new vmm(this, g2v.c().d(), ((VkClientMultiAccountComponent) m7m.d(this).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments(), new y3i(this, 14)), new jyv(kn(), g2v.c().j(), ((VoipCallComponent) m7m.d(this).a(fpf0.a(VoipCallComponent.class))).a())), new di3((a1w) bpn0Var.getValue(), c3664a), ((TagsComponent) m7m.d(this).mo408a(fpf0.a(TagsComponent.class))).we(), ko8.a.a, c2710a, this.d0.B));
        this.c0 = a2;
        e.add(a2);
        e.add(new sbw0(this, (a1w) bpn0Var.getValue(), new bv0(21), null, 18));
        return e.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.Parcelable] */
    @Override // xsna.y760
    public final void h9(Intent intent) {
        l1s l1sVar;
        b1s b1sVar;
        FolderType folderType;
        Object parcelable;
        rsr rsrVar = oz50.k;
        FragmentEntry c = oz50.b.c(intent.getExtras());
        Bundle bundle = c != null ? c.c : null;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = bundle.getParcelable("open_target_folder", FolderType.class);
                folderType = (Parcelable) parcelable;
            } else {
                ?? parcelable2 = bundle.getParcelable("open_target_folder");
                folderType = parcelable2 instanceof FolderType ? parcelable2 : null;
            }
            r0 = (FolderType) folderType;
        }
        if (r0 != null && (l1sVar = this.d0) != null && (b1sVar = l1sVar.B) != null) {
            b1sVar.d(new mb80(r0));
        }
        mo(lo(bundle));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final void io() {
        this.W.c((mdz) this.Y.getValue());
    }

    @Override // xsna.xoo0
    public final int l2() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zdwVar.k.getClass();
        return dhr0.t.c(R.attr.vk_ui_background_content);
    }

    public final void mo(Peer peer) {
        l7m d = m7m.d(this);
        f1w b0 = ((ImConfigurationScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), peer, d).a(fpf0.a(ImConfigurationScopedComponent.class))).b0();
        l7m d2 = m7m.d(this);
        ((ImEngineLifecycleScopedComponent) xq.f((ImFeatureScopeProviderComponent) d2.a(fpf0.a(ImFeatureScopeProviderComponent.class)), peer, d2).a(fpf0.a(ImEngineLifecycleScopedComponent.class))).N().e(b0.c().g(peer), EngineInvalidateSource.UPDATE_COMMUNITY);
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        OpenChatListReporter openChatListReporter = this.W;
        bu00.m(openChatListReporter, bundle);
        mdz<OpenChatListReporter.Span> a2 = this.X.a(OpenChatListReporter.Span.ON_CREATE);
        openChatListReporter.c(a2);
        super.onCreate(bundle);
        s3q0 s3q0Var = s3q0.a;
        openChatListReporter.f(a2, null);
        String string = requireArguments().getString("performance_track_id");
        if (string != null) {
            openChatListReporter.m(string);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.V.e();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.W.b();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        yj50<?, ?, ?, ?, ?, ?, ?> yj50Var = this.c0;
        if (yj50Var != null) {
            yj50Var.l(new z3i(this, 17));
        }
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zdwVar.d.h().a();
        this.W.n(OpenChatListReporter.MeasuringPoint.RESUMED);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bu00.o(bundle);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        jpm jpmVar = this.b0;
        if (jpmVar != null) {
            jpmVar.l(new ni0(6, this, view));
        }
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zdwVar.k.getClass();
        dhr0.a.e0(R.attr.vk_ui_background_content, view.findViewById(R.id.dialogs_toolbar_container));
        yj50<?, ?, ?, ?, ?, ?, ?> yj50Var = this.c0;
        if (yj50Var != null) {
            yj50Var.l(new tju(this, view));
        }
        super.onViewCreated(view, bundle);
        dx90 dx90Var = ow90.e;
        dx90Var.getClass();
        dx90Var.h = System.currentTimeMillis();
        dx90Var.r();
        this.W.f((mdz) this.Y.getValue(), null);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        ho(p1s.e.b);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        l1s l1sVar = this.d0;
        if (l1sVar != null) {
            l1sVar.n(uiTrackingScreen);
        }
    }
}
