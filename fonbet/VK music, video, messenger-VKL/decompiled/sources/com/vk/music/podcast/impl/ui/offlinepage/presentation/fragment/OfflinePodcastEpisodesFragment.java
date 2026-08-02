package com.vk.music.podcast.impl.ui.offlinepage.presentation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.dv70;
import xsna.epx;
import xsna.ev70;
import xsna.fl4;
import xsna.fpf0;
import xsna.ic40;
import xsna.ikv0;
import xsna.izs;
import xsna.k7y;
import xsna.msy;
import xsna.nzw;
import xsna.oz50;
import xsna.qcy;
import xsna.s3q0;
import xsna.ubw;
import xsna.wp40;
import xsna.xpi;
import xsna.xu70;

/* compiled from: OfflinePodcastEpisodesFragment.kt */
/* loaded from: classes3.dex */
public final class OfflinePodcastEpisodesFragment extends FragmentImpl {
    public static final b Q;
    public static final /* synthetic */ qcy<Object>[] R;
    public final Object N;
    public final Object O;
    public final nzw P;

    /* compiled from: OfflinePodcastEpisodesFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, String str) {
            super(OfflinePodcastEpisodesFragment.class, null, null);
            b bVar = OfflinePodcastEpisodesFragment.Q;
            Bundle bundle = this.j;
            bVar.getClass();
            bundle.putParcelable("owner_id", userId);
            this.j.putString("podcast_title", str);
        }

        public final void y(String str) {
            OfflinePodcastEpisodesFragment.Q.getClass();
            this.j.putString("launch_origin", str);
        }

        public final void z(String str) {
            OfflinePodcastEpisodesFragment.Q.getClass();
            this.j.putString("ref", str);
        }
    }

    /* compiled from: OfflinePodcastEpisodesFragment.kt */
    public static final class b {
    }

    /* compiled from: OfflinePodcastEpisodesFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<dv70, s3q0> {
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(dv70 dv70Var) {
            dv70 dv70Var2 = dv70Var;
            OfflinePodcastEpisodesFragment offlinePodcastEpisodesFragment = (OfflinePodcastEpisodesFragment) this.receiver;
            b bVar = OfflinePodcastEpisodesFragment.Q;
            offlinePodcastEpisodesFragment.getClass();
            if (epx.f(dv70Var2, dv70.b.a)) {
                offlinePodcastEpisodesFragment.finish();
            } else if (dv70Var2 instanceof dv70.c) {
                FragmentActivity activity = offlinePodcastEpisodesFragment.getActivity();
                if (activity != null) {
                    dv70.c cVar = (dv70.c) dv70Var2;
                    ic40.r(((fl4) offlinePodcastEpisodesFragment.N.getValue()).w(), activity, cVar.b, cVar.a, null, null, false, false, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                }
            } else {
                if (!epx.f(dv70Var2, dv70.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ikv0.a aVar = new ikv0.a(offlinePodcastEpisodesFragment.requireContext());
                aVar.u = new ikv0.d(offlinePodcastEpisodesFragment.requireContext().getString(R.string.podcast_all_episodes_deleted), (String) null, (ikv0.d.a) null, 6);
                aVar.n();
                offlinePodcastEpisodesFragment.finish();
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(OfflinePodcastEpisodesFragment.class, X3.i.U, "getStore()Lcom/vk/music/podcast/impl/ui/offlinepage/presentation/feature/OfflinePodcastEpisodesMviStore;", 0);
        fpf0.a.getClass();
        R = new qcy[]{propertyReference1Impl};
        Q = new b();
    }

    public OfflinePodcastEpisodesFragment() {
        k7y k7yVar = new k7y(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, k7yVar);
        this.O = msy.a(lazyThreadSafetyMode, new ubw(this, 16));
        this.P = new nzw(fpf0.d(ev70.class).toString(), this, new wp40(this, 6));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        xu70 xu70Var = new xu70(new c(1, this, OfflinePodcastEpisodesFragment.class, "handleEvent", "handleEvent(Lcom/vk/music/podcast/impl/ui/offlinepage/presentation/feature/OfflinePodcastEpisodesMviEvent;)V", 0));
        ComposeView a2 = xpi.a(requireContext());
        qcy<Object> qcyVar = R[0];
        xu70Var.c((ev70) this.P.getValue(), a2);
        return a2;
    }
}
