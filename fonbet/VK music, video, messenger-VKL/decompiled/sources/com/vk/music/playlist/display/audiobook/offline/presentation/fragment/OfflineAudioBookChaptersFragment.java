package com.vk.music.playlist.display.audiobook.offline.presentation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.at70;
import xsna.bt70;
import xsna.epx;
import xsna.fpf0;
import xsna.gzv;
import xsna.ikv0;
import xsna.izs;
import xsna.msy;
import xsna.nzw;
import xsna.oz50;
import xsna.qcy;
import xsna.s3q0;
import xsna.s6y;
import xsna.vs70;
import xsna.x4u;
import xsna.xpi;

/* compiled from: OfflineAudioBookChaptersFragment.kt */
/* loaded from: classes3.dex */
public final class OfflineAudioBookChaptersFragment extends FragmentImpl {
    public static final b Q;
    public static final /* synthetic */ qcy<Object>[] R;
    public final Object N;
    public final Object O;
    public final nzw P;

    /* compiled from: OfflineAudioBookChaptersFragment.kt */
    public static final class a extends oz50 {
        public a(int i, String str) {
            super(OfflineAudioBookChaptersFragment.class, null, null);
            b bVar = OfflineAudioBookChaptersFragment.Q;
            Bundle bundle = this.j;
            bVar.getClass();
            bundle.putInt("audio_book_id", i);
            Bundle bundle2 = this.j;
            str = str == null ? "" : str;
            bVar.getClass();
            bundle2.putString("audio_book_title", str);
        }

        public final void y(String str) {
            OfflineAudioBookChaptersFragment.Q.getClass();
            this.j.putString("launch_origin", str);
        }

        public final void z(String str) {
            OfflineAudioBookChaptersFragment.Q.getClass();
            this.j.putString("ref", str);
        }
    }

    /* compiled from: OfflineAudioBookChaptersFragment.kt */
    public static final class b {
    }

    /* compiled from: OfflineAudioBookChaptersFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<at70, s3q0> {
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(at70 at70Var) {
            at70 at70Var2 = at70Var;
            OfflineAudioBookChaptersFragment offlineAudioBookChaptersFragment = (OfflineAudioBookChaptersFragment) this.receiver;
            b bVar = OfflineAudioBookChaptersFragment.Q;
            offlineAudioBookChaptersFragment.getClass();
            if (epx.f(at70Var2, at70.c.a)) {
                offlineAudioBookChaptersFragment.finish();
            } else if (at70Var2 instanceof at70.b) {
                ((BridgeComponent) offlineAudioBookChaptersFragment.N.getValue()).Le().w().u(offlineAudioBookChaptersFragment.kn(), ((at70.b) at70Var2).a);
            } else {
                if (!epx.f(at70Var2, at70.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ikv0.a aVar = new ikv0.a(offlineAudioBookChaptersFragment.requireContext());
                aVar.u = new ikv0.d(offlineAudioBookChaptersFragment.requireContext().getString(R.string.audio_book_all_chapters_deleted), (String) null, (ikv0.d.a) null, 6);
                aVar.n();
                offlineAudioBookChaptersFragment.finish();
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(OfflineAudioBookChaptersFragment.class, X3.i.U, "getStore()Lcom/vk/music/playlist/display/audiobook/offline/presentation/feature/OfflineAudioBookChaptersMviStore;", 0);
        fpf0.a.getClass();
        R = new qcy[]{propertyReference1Impl};
        Q = new b();
    }

    public OfflineAudioBookChaptersFragment() {
        s6y s6yVar = new s6y(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, s6yVar);
        this.O = msy.a(lazyThreadSafetyMode, new gzv(this, 24));
        this.P = new nzw(fpf0.d(bt70.class).toString(), this, new x4u(this, 24));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vs70 vs70Var = new vs70(new c(1, this, OfflineAudioBookChaptersFragment.class, "handleEvent", "handleEvent(Lcom/vk/music/playlist/display/audiobook/offline/presentation/feature/OfflineAudioBookChaptersMviEvent;)V", 0));
        ComposeView a2 = xpi.a(requireContext());
        qcy<Object> qcyVar = R[0];
        vs70Var.c((bt70) this.P.getValue(), a2);
        return a2;
    }
}
