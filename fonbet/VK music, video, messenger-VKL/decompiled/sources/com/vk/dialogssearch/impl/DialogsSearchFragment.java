package com.vk.dialogssearch.impl;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Peer;
import com.vk.im.engine.di.ImCmdRxExecutorScopedComponent;
import com.vk.im.engine.di.ImConfigurationScopedComponent;
import com.vk.im.engine.di.ImExperimentsScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.c;
import com.vk.im.mvicomponent.SingleComponentFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.io.Serializable;
import xsna.a1w;
import xsna.fpf0;
import xsna.g2v;
import xsna.l7m;
import xsna.lvm;
import xsna.lzv;
import xsna.m7m;
import xsna.mxv;
import xsna.o0q0;
import xsna.oz50;
import xsna.q1w;
import xsna.rw30;
import xsna.xq;
import xsna.yj50;
import xsna.zn8;

/* compiled from: DialogsSearchFragment.kt */
/* loaded from: classes18.dex */
public final class DialogsSearchFragment extends SingleComponentFragment implements o0q0 {
    public lvm U;

    /* compiled from: DialogsSearchFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: DialogsSearchFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchMode.values().length];
            try {
                iArr[SearchMode.MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchMode.CHANNELS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DialogsSearchFragment() {
        super(R.layout.dialogs_search_container);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r0 == null) goto L15;
     */
    @Override // com.vk.im.mvicomponent.SingleComponentFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yj50<?, ?, ?, ?, ?, ?, ?> jo() {
        SearchMode searchMode;
        Peer peer;
        a1w a1wVar;
        Serializable serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                serializable = zn8.a.b(arguments);
            } else {
                serializable = arguments.getSerializable("arg_search_mode");
                if (!SearchMode.class.isInstance(serializable)) {
                    serializable = null;
                }
            }
            searchMode = (SearchMode) serializable;
        }
        searchMode = SearchMode.PEERS;
        SearchMode searchMode2 = searchMode;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (peer = (Peer) arguments2.getParcelable("owner_id")) == null) {
            peer = Peer.Unknown.e;
        }
        a1w a1wVar2 = (!(BuildInfo.s() && peer.Ab(Peer.Type.GROUP)) ? (a1wVar = q1w.a) != null : (a1wVar = q1w.b) != null) ? null : a1wVar;
        mxv c = g2v.c();
        l7m d = m7m.d(this);
        lzv g = ((ImCmdRxExecutorScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), peer, d).a(fpf0.a(ImCmdRxExecutorScopedComponent.class))).g();
        l7m d2 = m7m.d(this);
        c experiments = ((ImExperimentsScopedComponent) xq.f((ImFeatureScopeProviderComponent) d2.a(fpf0.a(ImFeatureScopeProviderComponent.class)), peer, d2).a(fpf0.a(ImExperimentsScopedComponent.class))).getExperiments();
        l7m d3 = m7m.d(this);
        lvm lvmVar = new lvm(this, c, a1wVar2, searchMode2, ((ImConfigurationScopedComponent) xq.f((ImFeatureScopeProviderComponent) d3.a(fpf0.a(ImFeatureScopeProviderComponent.class)), peer, d3).a(fpf0.a(ImConfigurationScopedComponent.class))).b0(), g, experiments);
        this.U = lvmVar;
        return lvmVar;
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.U = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        rw30 rw30Var;
        lvm lvmVar = this.U;
        SearchMode searchMode = null;
        if (lvmVar != null && (rw30Var = lvmVar.w) != null) {
            searchMode = rw30Var.p.h;
        }
        int i = searchMode == null ? -1 : b.$EnumSwitchMapping$0[searchMode.ordinal()];
        uiTrackingScreen.a = i != 1 ? i != 2 ? MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT_SEARCH : MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_CHANNELS : MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_MESSAGES;
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        return this;
    }
}
