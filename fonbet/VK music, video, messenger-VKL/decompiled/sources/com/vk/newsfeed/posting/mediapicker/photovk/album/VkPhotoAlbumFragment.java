package com.vk.newsfeed.posting.mediapicker.photovk.album;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.vk.dto.photo.Photo;
import com.vk.lists.AbstractPaginatedView;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$MeasureColdStart;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveStartTime;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import io.reactivex.rxjava3.internal.operators.single.f0;
import io.reactivex.rxjava3.internal.operators.single.v;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asu0;
import xsna.bhc0;
import xsna.efc0;
import xsna.faa0;
import xsna.fmc0;
import xsna.g5a0;
import xsna.gm6;
import xsna.iwg0;
import xsna.izs;
import xsna.kwg0;
import xsna.le50;
import xsna.nv9;
import xsna.pmc0;
import xsna.ppa;
import xsna.s3q0;
import xsna.smc0;
import xsna.v4a0;

/* compiled from: VkPhotoAlbumFragment.kt */
/* loaded from: classes4.dex */
public class VkPhotoAlbumFragment extends BasePhotoListFragment<Object> implements v4a0, bhc0, smc0 {
    public static final /* synthetic */ int p0 = 0;
    public final nv9 m0 = new nv9();
    public final g5a0 n0 = new g5a0(this);
    public final c o0 = new c();

    /* compiled from: VkPhotoAlbumFragment.kt */
    public static final class a extends BasePhotoListFragment.a {
    }

    /* compiled from: VkPhotoAlbumFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    @Override // com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment, xsna.ij6
    public final void I0() {
        g5a0 g5a0Var = this.n0;
        C1(g5a0Var != null ? g5a0Var.h : null);
    }

    @Override // com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment, xsna.ij6
    public final void g1(Photo photo) {
        faa0 lo = lo();
        g5a0 g5a0Var = this.n0;
        lo.x0(this.m0.d(g5a0Var != null ? g5a0Var.h : null, photo, false));
        C1(g5a0Var != null ? g5a0Var.h : null);
    }

    @Override // com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment, com.vk.core.fragments.BaseMvpFragment
    public final gm6 io() {
        return this.n0;
    }

    @Override // com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment
    /* renamed from: no */
    public final Object io() {
        return this.n0;
    }

    @Override // xsna.smc0
    public final void o6(fmc0 fmc0Var) {
        if ((fmc0Var instanceof pmc0) && ((pmc0) fmc0Var).a == MobileOfficialAppsFeedStat$PickerType.ALBUM) {
            v vVar = new v(new ppa(this, 3));
            asu0.a.getClass();
            f0 q = vVar.q(asu0.m());
            int i = kwg0.a;
            this.e0.b(q.subscribe(new iwg0(), new le50(new b(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 27)));
        }
    }

    @Override // com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g5a0 g5a0Var = this.n0;
        C1(g5a0Var != null ? g5a0Var.h : null);
        this.o = false;
        efc0 mo = mo();
        if (mo != null) {
            mo.C(new PostingAction$TechStats$Picker$SaveStartTime(MobileOfficialAppsFeedStat$PickerType.ALBUM, SystemClock.elapsedRealtime()));
        }
        efc0 mo2 = mo();
        if (mo2 != null) {
            mo2.C(new PostingAction$TechStats$Picker$MeasureColdStart(MobileOfficialAppsFeedStat$PickerType.ALBUM));
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView = this.a0;
        if (pickerRecyclerPaginatedView == null) {
            pickerRecyclerPaginatedView = null;
        }
        pickerRecyclerPaginatedView.setUiStateCallbacks(this.o0);
    }

    @Override // com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment, xsna.ij6
    public final void r0(int i) {
        super.r0(i);
        lo().getItemCount();
    }

    /* compiled from: VkPhotoAlbumFragment.kt */
    public static final class c extends AbstractPaginatedView.i {
        public c() {
        }

        @Override // com.vk.lists.AbstractPaginatedView.i
        public final void b() {
            int i = VkPhotoAlbumFragment.p0;
            VkPhotoAlbumFragment.this.lo().getItemCount();
        }

        @Override // com.vk.lists.AbstractPaginatedView.i
        public final void c() {
        }
    }

    @Override // xsna.bhc0
    public final void tb(float f, int i) {
    }
}
