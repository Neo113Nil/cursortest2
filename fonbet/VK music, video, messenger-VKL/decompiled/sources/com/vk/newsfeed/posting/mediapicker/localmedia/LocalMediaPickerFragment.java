package com.vk.newsfeed.posting.mediapicker.localmedia;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.vk.attachpicker.b;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import com.vk.mediapicker.api.models.MediaPickerViewState;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerPageLoadType;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$MeasureColdStart;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveStartTime;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.single.f0;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.abg0;
import xsna.ak3;
import xsna.asu0;
import xsna.b0y;
import xsna.bhc0;
import xsna.bn1;
import xsna.bwt0;
import xsna.c5g;
import xsna.com;
import xsna.d0w;
import xsna.d27;
import xsna.dhr0;
import xsna.efc0;
import xsna.epx;
import xsna.fk90;
import xsna.fmc0;
import xsna.foi;
import xsna.fvz;
import xsna.gvz;
import xsna.gz80;
import xsna.hvz;
import xsna.iin0;
import xsna.ikv0;
import xsna.ivz;
import xsna.iwg0;
import xsna.izs;
import xsna.j5g;
import xsna.k6p;
import xsna.kt10;
import xsna.kwg0;
import xsna.lk;
import xsna.m3g;
import xsna.msy;
import xsna.mt10;
import xsna.nht;
import xsna.oz50;
import xsna.pmc0;
import xsna.qcs;
import xsna.s3q0;
import xsna.smc0;
import xsna.sw50;
import xsna.tvo;
import xsna.uai0;
import xsna.v0q0;
import xsna.v9b;
import xsna.x3v0;

/* compiled from: LocalMediaPickerFragment.kt */
/* loaded from: classes.dex */
public final class LocalMediaPickerFragment extends FragmentImpl implements bhc0, v0q0, smc0, qcs, x3v0, iin0, mt10.a, tvo.a, nht {
    public static final /* synthetic */ int d0 = 0;
    public final Object N;
    public final io.reactivex.rxjava3.disposables.b O;
    public View P;
    public View Q;
    public View R;
    public VkText S;
    public VkText T;
    public VkButton U;
    public final d0w V;
    public final Object W;
    public final Object X;
    public VkMediaPicker Y;
    public List<? extends MediaStoreEntry> Z;
    public com.vk.attachpicker.b a0;
    public gvz b0;
    public gvz c0;

    /* compiled from: LocalMediaPickerFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a extends oz50 {
    }

    /* compiled from: LocalMediaPickerFragment.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public b(Object obj) {
            super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public LocalMediaPickerFragment() {
        lk lkVar = new lk(22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, lkVar);
        this.O = new io.reactivex.rxjava3.disposables.b();
        this.V = new d0w(this, 3);
        this.W = msy.a(lazyThreadSafetyMode, new hvz(this, 0));
        this.X = msy.a(lazyThreadSafetyMode, new foi(this, 19));
        MediaPickerViewState.Medias.c cVar = MediaPickerViewState.Medias.c.a;
        this.Z = EmptyList.b;
    }

    @Override // xsna.x3v0
    public final void C() {
        ho().C();
        if (gz80.a(34)) {
            PermissionHelper permissionHelper = PermissionHelper.a;
            Context mo2getContext = mo2getContext();
            permissionHelper.getClass();
            PermissionHelper.g(permissionHelper, mo2getContext, PermissionHelper.f, PermissionHelper.t, 0, 0, new m3g(this, 28), null, null, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
        }
    }

    @Override // xsna.x3v0
    public final void G0(uai0 uai0Var) {
        ho().f(uai0Var.a());
    }

    @Override // xsna.x3v0
    public final void Gj() {
        ho().D();
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        ho().K0(i, strArr);
    }

    @Override // xsna.mt10.a
    public final void K3(FrameLayout frameLayout) {
        VkMediaPicker vkMediaPicker = this.Y;
        if (vkMediaPicker != null) {
            vkMediaPicker.setState(new VkMediaPicker.State.a(frameLayout));
        }
    }

    @Override // xsna.mt10.a
    public final void Kc(MediaStoreEntry mediaStoreEntry) {
        this.V.invoke(new PostingAction.Navigation.OpenLocalPhotoVideoViewer(mediaStoreEntry));
    }

    @Override // xsna.x3v0
    public final void N0() {
        ho().g();
        this.V.invoke(new PostingAction.MediaPicker.LoadLocalMediaPage(MediaPickerPageLoadType.NextPage));
    }

    @Override // xsna.mt10.a
    public final void U6(MediaPickerConfiguration.MediaType mediaType) {
        this.V.invoke(PostingAction.MediaPicker.OpenCamera.b);
    }

    @Override // xsna.iin0
    public final /* bridge */ /* synthetic */ ViewGroup Wj(Context context) {
        return null;
    }

    @Override // xsna.x3v0
    public final void Z1(uai0 uai0Var) {
        ho().a(uai0Var.a());
    }

    @Override // xsna.mt10.a
    public final void bl(MediaPickerViewState mediaPickerViewState) {
        List<MediaStoreEntry> list;
        d0w d0wVar;
        MediaPickerViewState.Medias a2 = mediaPickerViewState.a();
        MediaPickerViewState.Medias.b bVar = a2 instanceof MediaPickerViewState.Medias.b ? (MediaPickerViewState.Medias.b) a2 : null;
        if (bVar == null || (list = bVar.a()) == null) {
            list = EmptyList.b;
        }
        com.vk.attachpicker.b bVar2 = this.a0;
        if (bVar2 != null) {
            bVar2.i(list);
        }
        List<MediaStoreEntry> list2 = list;
        Iterator it = j5g.t0(this.Z, j5g.S0(list2)).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            d0wVar = this.V;
            if (!hasNext) {
                break;
            } else {
                d0wVar.invoke(new PostingAction.MediaPicker.Selection.ToggleLocalMediaItemSelection(kt10.a((MediaStoreEntry) it.next()), SystemClock.elapsedRealtime()));
            }
        }
        Iterator it2 = j5g.t0(list2, j5g.S0(this.Z)).iterator();
        while (it2.hasNext()) {
            d0wVar.invoke(new PostingAction.MediaPicker.Selection.AddLocalMediaItemSelection(kt10.a((MediaStoreEntry) it2.next()), SystemClock.elapsedRealtime()));
        }
        this.Z = list;
    }

    public final void eo() {
        View view = this.P;
        if (view != null) {
            bwt0.p0(view, true);
        }
        VkMediaPicker vkMediaPicker = this.Y;
        if (vkMediaPicker != null) {
            bwt0.p0(vkMediaPicker, false);
        }
        VkText vkText = this.S;
        if (vkText != null) {
            vkText.setText(R.string.media_picker_grant_gallery_view_permission);
        }
        VkText vkText2 = this.T;
        if (vkText2 != null) {
            vkText2.setText(R.string.media_picker_grant_gallery_view_permission_description);
        }
        VkButton vkButton = this.U;
        if (vkButton != null) {
            vkButton.setOnClickListener(new k6p(this, 3));
        }
        VkButton vkButton2 = this.U;
        if (vkButton2 != null) {
            vkButton2.setText(R.string.media_picker_grant_permission);
        }
        VkButton vkButton3 = this.U;
        if (vkButton3 != null) {
            int[] iArr = VkButton.W;
            vkButton3.a5(true, null);
        }
    }

    public final void fo(gvz gvzVar) {
        this.b0 = gvzVar;
        if (!(gvzVar instanceof gvz.b)) {
            if (gvzVar instanceof gvz.c) {
                eo();
                return;
            }
            if (gvzVar instanceof gvz.a) {
                io(((gvz.a) gvzVar).a());
                return;
            }
            if (!(gvzVar instanceof gvz.d)) {
                throw new NoWhenBranchMatchedException();
            }
            View view = this.P;
            if (view != null) {
                bwt0.p0(view, false);
            }
            VkMediaPicker vkMediaPicker = this.Y;
            if (vkMediaPicker != null) {
                bwt0.p0(vkMediaPicker, true);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 20; i++) {
                arrayList.add(fvz.c.a);
            }
            io(arrayList);
            return;
        }
        if (PermissionHelper.o(requireContext())) {
            View view2 = this.P;
            if (view2 != null) {
                bwt0.p0(view2, false);
            }
            VkMediaPicker vkMediaPicker2 = this.Y;
            if (vkMediaPicker2 != null) {
                bwt0.p0(vkMediaPicker2, true);
            }
            io(Collections.singletonList(fvz.b.a));
            return;
        }
        View view3 = this.P;
        if (view3 != null) {
            bwt0.p0(view3, true);
        }
        VkMediaPicker vkMediaPicker3 = this.Y;
        if (vkMediaPicker3 != null) {
            bwt0.p0(vkMediaPicker3, false);
        }
        VkText vkText = this.S;
        if (vkText != null) {
            vkText.setText(R.string.media_picker_empty_gallery);
        }
        VkText vkText2 = this.T;
        if (vkText2 != null) {
            vkText2.setText(R.string.media_picker_empty_gallery_description);
        }
        VkButton vkButton = this.U;
        if (vkButton != null) {
            vkButton.setOnClickListener(new d27(this, 5));
        }
        VkButton vkButton2 = this.U;
        if (vkButton2 != null) {
            vkButton2.setText(R.string.media_picker_open_camera);
        }
        VkButton vkButton3 = this.U;
        if (vkButton3 != null) {
            Integer valueOf = Integer.valueOf(R.drawable.vk_icon_camera_outline_24);
            int[] iArr = VkButton.W;
            vkButton3.a5(true, valueOf);
        }
    }

    public final efc0 go() {
        Fragment parentFragment = getParentFragment();
        PostingFragment postingFragment = parentFragment instanceof PostingFragment ? (PostingFragment) parentFragment : null;
        if (postingFragment != null) {
            return postingFragment.getFeature();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final mt10 ho() {
        return (mt10) this.X.getValue();
    }

    public final void io(List<? extends fvz> list) {
        ArrayList arrayList = new ArrayList();
        List<? extends fvz> list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(kt10.b((fvz) it.next()));
        }
        arrayList.addAll(arrayList2);
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null ? PermissionHelper.o(mo2getContext) : false) {
            arrayList.add(fk90.a);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof fvz.a) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((fvz.a) next).b()) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            fvz.a aVar = (fvz.a) it3.next();
            arrayList5.add(new uai0(aVar.a().ba().getId(), aVar.a().ba().f()));
        }
        VkMediaPicker vkMediaPicker = this.Y;
        if (vkMediaPicker != null) {
            vkMediaPicker.setState(new VkMediaPicker.State.b(arrayList, arrayList5));
        }
        View view = this.P;
        if (view != null) {
            bwt0.p0(view, false);
        }
        VkMediaPicker vkMediaPicker2 = this.Y;
        if (vkMediaPicker2 != null) {
            bwt0.p0(vkMediaPicker2, true);
        }
    }

    @Override // xsna.smc0
    public final void o6(fmc0 fmc0Var) {
        if (!(fmc0Var instanceof pmc0)) {
            if (fmc0Var instanceof fmc0.h.a) {
                ho().b(((fmc0.h.a) fmc0Var).a());
            }
        } else if (((pmc0) fmc0Var).a() == MobileOfficialAppsFeedStat$PickerType.PHOTO) {
            v vVar = new v(new ivz(this, 0));
            asu0.a.getClass();
            f0 q = vVar.q(asu0.m());
            int i = kwg0.a;
            c subscribe = q.subscribe(new iwg0(), new b0y(new b(com.vk.metrics.eventtracking.b.a), 1));
            if (subscribe != null) {
                this.O.b(subscribe);
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ho().h(this, i, i2, intent);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
        MobileOfficialAppsFeedStat$PickerType mobileOfficialAppsFeedStat$PickerType = MobileOfficialAppsFeedStat$PickerType.PHOTO;
        PostingAction$TechStats$Picker$SaveStartTime postingAction$TechStats$Picker$SaveStartTime = new PostingAction$TechStats$Picker$SaveStartTime(mobileOfficialAppsFeedStat$PickerType, SystemClock.elapsedRealtime());
        d0w d0wVar = this.V;
        d0wVar.invoke(postingAction$TechStats$Picker$SaveStartTime);
        d0wVar.invoke(new PostingAction$TechStats$Picker$MeasureColdStart(mobileOfficialAppsFeedStat$PickerType));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.media_picker_local_media_tab_fragment_ds, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.O.e();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Y = null;
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ho().onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ho().onResume();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.vk.attachpicker.b cVar;
        LocalMediaPickerFragment localMediaPickerFragment;
        efc0 go;
        super.onViewCreated(view, bundle);
        this.Y = (VkMediaPicker) view.findViewById(R.id.local_media_picker_view);
        this.P = view.findViewById(R.id.media_picker_unavailable_gallery_view);
        this.Q = view.findViewById(R.id.unavailable_gallery_banner_content);
        this.R = view.findViewById(R.id.unavailable_gallery_banner_close_button);
        this.U = (VkButton) view.findViewById(R.id.media_picker_unavailable_gallery_action_button);
        this.S = (VkText) view.findViewById(R.id.unavailable_gallery_banner_title);
        this.T = (VkText) view.findViewById(R.id.unavailable_gallery_banner_description);
        View view2 = this.R;
        if (view2 != null) {
            view2.setOnClickListener(new bn1(this, 6));
        }
        VkButton vkButton = this.U;
        if (vkButton != null) {
            vkButton.setOnClickListener(new v9b(this, 5));
        }
        ho().l(this, new MediaPickerConfiguration(true, new MediaPickerConfiguration.MultiSelectMode.Check(0, 1, null), null, 4, null), EmptyList.b, this);
        b.InterfaceC0381b e = ((sw50) this.W.getValue()).p().e(this);
        if (e == null || (cVar = e.Yd()) == null) {
            cVar = new com.vk.attachpicker.c();
        }
        this.a0 = cVar;
        VkMediaPicker vkMediaPicker = this.Y;
        if (vkMediaPicker != null) {
            localMediaPickerFragment = this;
            vkMediaPicker.d(new VkMediaPicker.c(localMediaPickerFragment, false, false, VkMediaPicker.CellAspectRation.Square, VkMediaPicker.e.c.a, VkMediaPicker.h.b.a, new VkMediaPicker.b.c(0)));
        } else {
            localMediaPickerFragment = this;
        }
        ho().d();
        if (bundle == null && (go = go()) != null) {
            go.C(PostingAction.MediaPicker.PageViewCreated.b);
        }
        gvz gvzVar = localMediaPickerFragment.c0;
        if (gvzVar != null) {
            fo(gvzVar);
            localMediaPickerFragment.c0 = null;
        }
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        ho().j(i, (ArrayList) list);
    }

    @Override // xsna.v0q0
    public final boolean sk() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bhc0
    public final void tb(float f, int i) {
        gvz gvzVar = this.b0;
        if (epx.f(gvzVar, gvz.b.a) || epx.f(gvzVar, gvz.c.a)) {
            abg0 abg0Var = dhr0.t;
            int c = abg0Var.c(R.attr.vk_ui_background_secondary);
            int c2 = abg0Var.c(R.attr.vk_ui_background_content);
            ak3 ak3Var = (ak3) this.N.getValue();
            Integer valueOf = Integer.valueOf(c);
            Integer valueOf2 = Integer.valueOf(c2);
            ak3Var.getClass();
            int intValue = ak3.a(f, valueOf, valueOf2).intValue();
            View view = this.P;
            if (view != null) {
                view.setBackgroundColor(intValue);
            }
            View view2 = this.Q;
            int measuredHeight = view2 != null ? view2.getMeasuredHeight() : 0;
            View view3 = this.Q;
            if (view3 != null) {
                view3.setTranslationY((i - measuredHeight) / 2.0f);
            }
            View view4 = this.R;
            if (view4 != null) {
                view4.setAlpha(1 - f);
            }
            View view5 = this.R;
            if (view5 != null) {
                bwt0.p0(view5, f < 0.99f);
            }
        }
    }

    @Override // xsna.mt10.a
    public final void tl(int i) {
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a(mo2getContext);
        aVar.i(new ikv0.d(mo2getContext.getString(i), (String) null, (ikv0.d.a) null, 6));
        aVar.j(new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, mo2getContext.getString(R.string.vk_ok), new com(11)));
        aVar.n();
    }

    @Override // xsna.x3v0
    public final void u2(uai0 uai0Var) {
        ho().i(uai0Var.a());
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        ho().c(i, (ArrayList) list);
        eo();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_PHOTO;
    }

    @Override // xsna.x3v0
    public final void C0() {
    }

    @Override // xsna.x3v0
    public final void P0() {
    }

    @Override // xsna.qcs
    public final void Vk() {
    }

    @Override // xsna.mt10.a
    public final void Ag(List<? extends MediaStoreEntry> list) {
    }
}
