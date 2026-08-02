package com.vk.newsfeed.posting.mediapicker.photovk;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.movika.sdk.base.logic.interactor.e;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$MeasureColdStart;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveInteractiveTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveStartTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.mediapicker.photovk.VkPhotoPickerFragment;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.single.f0;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a920;
import xsna.asu0;
import xsna.b6f0;
import xsna.bhc0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.efc0;
import xsna.em1;
import xsna.fmc0;
import xsna.g3p0;
import xsna.gm6;
import xsna.hmq0;
import xsna.iha0;
import xsna.iin0;
import xsna.ipq0;
import xsna.iwg0;
import xsna.izs;
import xsna.j5g;
import xsna.jlj;
import xsna.jn1;
import xsna.kwg0;
import xsna.l4k0;
import xsna.mha0;
import xsna.msy;
import xsna.or4;
import xsna.pmc0;
import xsna.rcs0;
import xsna.s3q0;
import xsna.smc0;
import xsna.v0q0;
import xsna.wss0;
import xsna.y8g0;
import xsna.yvw;

/* compiled from: VkPhotoPickerFragment.kt */
/* loaded from: classes.dex */
public final class VkPhotoPickerFragment extends BasePhotoListFragment<Object> implements iha0, iin0, bhc0, v0q0, smc0 {
    public static final /* synthetic */ int r0 = 0;
    public int n0;
    public final Object p0;
    public final Object q0;
    public final mha0 m0 = new mha0(this);
    public final bpn0 o0 = new bpn0(new ipq0(this, 13));

    /* compiled from: VkPhotoPickerFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a extends BasePhotoListFragment.a {
    }

    /* compiled from: VkPhotoPickerFragment.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<PhotoAlbum, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(PhotoAlbum photoAlbum) {
            PhotoAlbum photoAlbum2 = photoAlbum;
            VkPhotoPickerFragment vkPhotoPickerFragment = (VkPhotoPickerFragment) this.receiver;
            int i = VkPhotoPickerFragment.r0;
            efc0 mo = vkPhotoPickerFragment.mo();
            if (mo != null) {
                mo.C(new PostingAction.Navigation.OpenInCurrentStep(new PostingStepScreen.VkPhotoAlbum(photoAlbum2)));
            }
            return s3q0.a;
        }
    }

    /* compiled from: VkPhotoPickerFragment.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public c(Object obj) {
            super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public VkPhotoPickerFragment() {
        b6f0 b6f0Var = new b6f0(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.p0 = msy.a(lazyThreadSafetyMode, b6f0Var);
        this.q0 = msy.a(lazyThreadSafetyMode, new rcs0(7));
    }

    @Override // xsna.iha0
    public final void P(PhotosGetAlbums.a aVar) {
        ArrayList<PhotoAlbum> arrayList = aVar.a;
        int size = arrayList.size();
        ArrayList<PhotoAlbum> arrayList2 = aVar.b;
        this.n0 = arrayList2.size() + size;
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.addAll(arrayList2);
        oo().clear();
        oo().n0(j5g.H0(arrayList3, 10));
    }

    @Override // xsna.iha0
    public final void R(int i) {
        oo().R(i);
        this.n0--;
        l4k0 l4k0Var = new l4k0(13);
        jlj jljVar = new jlj(kn().getString(R.string.media_picker_albums), this.n0, true, new or4(this, 18));
        jljVar.c();
        this.h0.G0(jljVar, l4k0Var);
    }

    @Override // xsna.iha0
    public final void U(int i, String str) {
        oo().U(i, str);
    }

    @Override // xsna.iin0
    public final ViewGroup Wj(Context context) {
        Toolbar toolbar = new Toolbar(context, null);
        toolbar.setTitle(R.string.photos);
        g3p0.c(toolbar);
        bwt0.Z(R.attr.vk_ui_background_modal, toolbar);
        return toolbar;
    }

    @Override // xsna.iha0
    public final void X(PhotoAlbum photoAlbum) {
        oo().X(photoAlbum);
    }

    @Override // com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment, com.vk.core.fragments.BaseMvpFragment
    public final gm6 io() {
        return this.m0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment
    public final void jo() {
        yvw yvwVar = this.h0;
        yvwVar.clear();
        if (this.n0 > 0) {
            jlj jljVar = new jlj(kn().getString(R.string.media_picker_albums), this.n0, true, new or4(this, 18));
            jljVar.c();
            yvwVar.x0(jljVar);
            jn1 jn1Var = new jn1(oo());
            jn1Var.d(new wss0(5));
            yvwVar.x0(jn1Var);
        }
        ?? r02 = this.q0;
        ((yvw) r02.getValue()).clear();
        if (this.c0 > 0) {
            ((yvw) r02.getValue()).x0(new jlj(y8g0.e(R.string.media_picker_all_photos), this.c0));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment
    public final a920 ko() {
        a920 a920Var = new a920();
        a920Var.K0(this.h0);
        a920Var.K0((yvw) this.q0.getValue());
        a920Var.K0(lo());
        return a920Var;
    }

    @Override // com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment
    /* renamed from: no */
    public final Object io() {
        return this.m0;
    }

    @Override // xsna.smc0
    public final void o6(fmc0 fmc0Var) {
        efc0 mo;
        if (!(fmc0Var instanceof pmc0)) {
            if (!(fmc0Var instanceof fmc0.i.e) || (mo = mo()) == null) {
                return;
            }
            mo.j0(new fmc0.i.b(k9(((fmc0.i.e) fmc0Var).a())));
            return;
        }
        if (((pmc0) fmc0Var).a() == MobileOfficialAppsFeedStat$PickerType.PHOTO_VK) {
            v vVar = new v(new Callable() { // from class: xsna.tcv0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i = VkPhotoPickerFragment.r0;
                    VkPhotoPickerFragment.this.f0.invoke(new PostingAction$TechStats$Picker$SaveInteractiveTime(MobileOfficialAppsFeedStat$PickerType.PHOTO_VK, SystemClock.elapsedRealtime()));
                    return s3q0.a;
                }
            });
            asu0.a.getClass();
            f0 q = vVar.q(asu0.m());
            int i = kwg0.a;
            io.reactivex.rxjava3.disposables.c subscribe = q.subscribe(new iwg0(), new hmq0(new c(com.vk.metrics.eventtracking.b.a), 6));
            if (subscribe != null) {
                this.e0.b(subscribe);
            }
        }
    }

    @Override // com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
        MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.PHOTO_VK;
        PostingAction$TechStats$Picker$SaveStartTime postingAction$TechStats$Picker$SaveStartTime = new PostingAction$TechStats$Picker$SaveStartTime(mobileOfficialAppsFeedStat$PickerType, SystemClock.elapsedRealtime());
        e eVar = this.f0;
        eVar.invoke(postingAction$TechStats$Picker$SaveStartTime);
        eVar.invoke(new PostingAction$TechStats$Picker$MeasureColdStart(mobileOfficialAppsFeedStat$PickerType));
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view.hasOnClickListeners()) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: xsna.scv0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i = VkPhotoPickerFragment.r0;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final em1 oo() {
        return (em1) this.p0.getValue();
    }

    @Override // xsna.iha0
    public final void q() {
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView = this.a0;
        if (pickerRecyclerPaginatedView == null) {
            pickerRecyclerPaginatedView = null;
        }
        pickerRecyclerPaginatedView.f0();
        C1(null);
    }

    @Override // xsna.v0q0
    public final boolean sk() {
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_PHOTO;
    }

    @Override // xsna.bhc0
    public final void tb(float f, int i) {
    }
}
