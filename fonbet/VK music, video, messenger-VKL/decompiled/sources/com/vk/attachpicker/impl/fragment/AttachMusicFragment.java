package com.vk.attachpicker.impl.fragment;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.awt0;
import xsna.awu;
import xsna.b34;
import xsna.b5z;
import xsna.bpn0;
import xsna.c7k;
import xsna.de50;
import xsna.dx4;
import xsna.g380;
import xsna.izs;
import xsna.j34;
import xsna.ju1;
import xsna.lqk0;
import xsna.mh;
import xsna.ok40;
import xsna.pu5;
import xsna.rsg0;
import xsna.u24;
import xsna.u2b0;
import xsna.v24;
import xsna.vif0;
import xsna.vz4;
import xsna.w24;
import xsna.xo4;
import xsna.z4;
import xsna.zom0;

/* compiled from: AttachMusicFragment.kt */
/* loaded from: classes15.dex */
public final class AttachMusicFragment extends BaseAttachPickerFragment<MusicTrack, vif0<MusicTrack>> {
    public static final /* synthetic */ int I0 = 0;
    public LifecycleHandler B0;
    public long C0;
    public PlayState z0 = PlayState.IDLE;
    public final bpn0 A0 = new bpn0(new z4(this, 5));
    public String D0 = "";
    public final c E0 = new c();
    public final bpn0 F0 = new bpn0(new mh(this, 7));
    public final b G0 = new b();
    public final d H0 = new d();

    /* compiled from: AttachMusicFragment.kt */
    public static final class a extends BaseAttachPickerFragment.a {
        public a() {
            super(AttachMusicFragment.class, null, null);
        }
    }

    /* compiled from: AttachMusicFragment.kt */
    public static final class b implements vz4 {
        public b() {
        }

        @Override // xsna.vz4
        public final void a(int i) {
            int i2 = AttachMusicFragment.I0;
            AttachMusicFragment attachMusicFragment = AttachMusicFragment.this;
            awu awuVar = attachMusicFragment.a0;
            ArrayList y0 = awuVar != null ? awuVar.y0() : null;
            b34<T, VH> b34Var = attachMusicFragment.a0;
            if (i > (b34Var != 0 ? b34Var.m : 0) && ((b34Var != 0 && b34Var.o) || (b34Var != 0 && b34Var.n))) {
                i--;
            }
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = MusicPlaybackLaunchContext.o;
            if (y0 == null || i < 0 || i >= y0.size()) {
                return;
            }
            ((u2b0) attachMusicFragment.A0.getValue()).N0(new lqk0((StartPlaySource) null, (MusicTrack) y0.get(i), y0, musicPlaybackLaunchContext, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1009));
        }
    }

    /* compiled from: AttachMusicFragment.kt */
    public static final class c extends b5z {
        public c() {
        }

        @Override // xsna.b5z
        public final void d(String str, int i, int i2, Intent intent) {
            if (i == 23 && i2 == 22 && intent != null && intent.hasExtra("playlist")) {
                int i3 = AttachMusicFragment.I0;
                AttachMusicFragment attachMusicFragment = AttachMusicFragment.this;
                attachMusicFragment.oo().b();
                Intent putExtra = new Intent().putExtra("playlist", (Playlist) intent.getParcelableExtra("playlist"));
                attachMusicFragment.oo().a(putExtra);
                j34 io2 = attachMusicFragment.io();
                if (io2 != null) {
                    io2.V2(putExtra);
                }
            }
        }
    }

    /* compiled from: AttachMusicFragment.kt */
    public static final class d extends e.a {
        public d() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            PlayState playState2 = playState == null ? PlayState.IDLE : playState;
            AttachMusicFragment attachMusicFragment = AttachMusicFragment.this;
            attachMusicFragment.z0 = playState2;
            if (playState != PlayState.IDLE) {
                PlayState playState3 = PlayState.STOPPED;
            }
            ((BaseAttachPickerFragment.f) attachMusicFragment.x0.getValue()).run();
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void W3(f fVar) {
            if (AttachMusicFragment.this.z0 != PlayState.IDLE) {
                PlayState.a aVar = PlayState.Companion;
            }
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void y4(List<PlayerTrack> list) {
            int i = AttachMusicFragment.I0;
            ((BaseAttachPickerFragment.f) AttachMusicFragment.this.x0.getValue()).run();
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void z3() {
            int i = AttachMusicFragment.I0;
            ((BaseAttachPickerFragment.f) AttachMusicFragment.this.x0.getValue()).run();
        }
    }

    @Override // xsna.txt0
    public final vif0 Cl(ViewGroup viewGroup, zom0 zom0Var) {
        viewGroup.getContext();
        return new de50(viewGroup, zom0Var, this.G0, this, (u2b0) this.A0.getValue());
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        oo().c(this);
        return false;
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, xsna.txt0
    public final RecyclerView.e0 bn(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        LifecycleHandler lifecycleHandler = this.B0;
        return new c7k(viewGroup, lifecycleHandler != null ? lifecycleHandler : null, this.E0, ((ok40) this.F0.getValue()).a(viewGroup.getContext(), this.C0, this.D0));
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final q<VkPaginationList<MusicTrack>> ko(int i, com.vk.lists.c cVar) {
        return rsg0.y0(new dx4(i, cVar.k(), UserId.d, this.q0, null), null, null, 3).U(new u24((izs) this.o0.getValue(), 0)).U(new ju1(new v24(i, this), 1));
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final String mo() {
        return "mMusic";
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final String no() {
        return "audio";
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        RecyclerView recyclerView;
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.Z;
        if (vkRecyclerPaginatedView != null && (recyclerView = vkRecyclerPaginatedView.getRecyclerView()) != null) {
            View[] d2 = awt0.d(recyclerView);
            ArrayList arrayList = new ArrayList();
            for (View view : d2) {
                Object findContainingViewHolder = recyclerView.findContainingViewHolder(view);
                g380 g380Var = findContainingViewHolder instanceof g380 ? (g380) findContainingViewHolder : null;
                if (g380Var != null) {
                    arrayList.add(g380Var);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((g380) it.next()).onConfigurationChanged(configuration);
            }
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Bundle arguments = getArguments();
        this.C0 = arguments != null ? arguments.getLong("peer_id") : 0L;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("peer_title")) == null) {
            str = "";
        }
        this.D0 = str;
        super.onCreate(bundle);
        LifecycleHandler c2 = LifecycleHandler.c(kn());
        this.B0 = c2;
        c2.a(this.E0);
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        LifecycleHandler lifecycleHandler = this.B0;
        if (lifecycleHandler == null) {
            lifecycleHandler = null;
        }
        lifecycleHandler.e(this.E0);
        super.onDestroy();
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        bpn0 bpn0Var = this.A0;
        ((u2b0) bpn0Var.getValue()).n0(this.H0);
        ((u2b0) bpn0Var.getValue()).release();
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        kn().setVolumeControlStream(Integer.MIN_VALUE);
        super.onPause();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        kn().setVolumeControlStream(3);
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((u2b0) this.A0.getValue()).P0(this.H0, true);
        ((AppCompatActivity) getActivity()).setTitle(R.string.music);
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final q<VkPaginationList<MusicTrack>> po(int i, com.vk.lists.c cVar) {
        xo4 xo4Var = new xo4(this.b0, 50);
        xo4Var.C(i, SignalingProtocol.KEY_OFFSET);
        return rsg0.y0(xo4Var, null, null, 3).U(new w24((izs) this.o0.getValue(), 0));
    }

    @Override // com.vk.attachpicker.base.BaseAttachPickerFragment
    public final boolean qo() {
        if (!com.vk.dto.common.b.a(this.C0)) {
            return false;
        }
        Peer a2 = com.vk.dto.common.a.a(this.b0);
        a2.getClass();
        return !a2.Ab(Peer.Type.GROUP);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        VkRecyclerPaginatedView vkRecyclerPaginatedView;
        RecyclerView recyclerView;
        super.setUserVisibleHint(z);
        if (!z || (vkRecyclerPaginatedView = this.Z) == null || (recyclerView = vkRecyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        View[] d2 = awt0.d(recyclerView);
        ArrayList arrayList = new ArrayList();
        for (View view : d2) {
            RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(view);
            c7k c7kVar = findContainingViewHolder instanceof c7k ? (c7k) findContainingViewHolder : null;
            if (c7kVar != null) {
                arrayList.add(c7kVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c7k c7kVar2 = (c7k) it.next();
            c7kVar2.itemView.postDelayed(new pu5(c7kVar2, 3), 300L);
        }
    }
}
