package com.vk.attachpicker.impl.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.attachpicker.b;
import com.vk.attachpicker.c;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.bz;
import xsna.iin0;
import xsna.ikv0;
import xsna.msy;
import xsna.mt10;
import xsna.n24;
import xsna.nht;
import xsna.nyu;
import xsna.oz50;
import xsna.sw50;
import xsna.tvo;
import xsna.uai0;
import xsna.x3v0;
import xsna.yg;
import xsna.zg;

/* compiled from: AttachMediaFragment.kt */
/* loaded from: classes15.dex */
public final class AttachMediaFragment extends FragmentImpl implements tvo.a, x3v0, iin0, mt10.a, nht {
    public static final /* synthetic */ int S = 0;
    public final Object N;
    public final Object O;
    public VkMediaPicker P;
    public com.vk.attachpicker.b Q;
    public nyu R;

    /* compiled from: AttachMediaFragment.kt */
    public static final class a extends oz50 {
    }

    public AttachMediaFragment() {
        yg ygVar = new yg(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, ygVar);
        this.O = msy.a(lazyThreadSafetyMode, new zg(this, 4));
    }

    @Override // xsna.x3v0
    public final void C() {
        eo().C();
    }

    @Override // xsna.x3v0
    public final void C0() {
        eo().e(this, MediaPickerConfiguration.MediaType.Video);
    }

    @Override // xsna.x3v0
    public final void G0(uai0 uai0Var) {
        eo().f(uai0Var.a);
    }

    @Override // xsna.x3v0
    public final void Gj() {
        eo().D();
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        eo().K0(i, strArr);
    }

    @Override // xsna.mt10.a
    public final void K3(FrameLayout frameLayout) {
        VkMediaPicker vkMediaPicker = this.P;
        if (vkMediaPicker != null) {
            vkMediaPicker.setState(new VkMediaPicker.State.a(frameLayout));
        }
    }

    @Override // xsna.x3v0
    public final void N0() {
        eo().g();
    }

    @Override // xsna.x3v0
    public final void P0() {
        eo().e(this, MediaPickerConfiguration.MediaType.Image);
    }

    @Override // xsna.iin0
    public final ViewGroup Wj(Context context) {
        return this.R;
    }

    @Override // xsna.x3v0
    public final void Z1(uai0 uai0Var) {
        eo().a(uai0Var.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v4 xsna.ehw, still in use, count: 2, list:
          (r10v4 xsna.ehw) from 0x010b: MOVE (r18v0 xsna.ehw) = (r10v4 xsna.ehw) (LINE:268)
          (r10v4 xsna.ehw) from 0x00f8: MOVE (r18v4 xsna.ehw) = (r10v4 xsna.ehw) (LINE:249)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // xsna.mt10.a
    public final void bl(com.vk.mediapicker.api.models.MediaPickerViewState r21) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.attachpicker.impl.fragment.AttachMediaFragment.bl(com.vk.mediapicker.api.models.MediaPickerViewState):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final mt10 eo() {
        return (mt10) this.N.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        eo().h(this, i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.attach_media_fragment, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.P = null;
        this.R = null;
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        eo().onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        eo().onResume();
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.vk.attachpicker.b cVar;
        super.onViewCreated(view, bundle);
        this.P = (VkMediaPicker) view.findViewById(R.id.media_picker_view);
        nyu nyuVar = new nyu(requireContext());
        nyuVar.setShowCloseButton(false);
        nyuVar.setCallback(new n24(this));
        this.R = nyuVar;
        eo().l(this, new MediaPickerConfiguration(false, new MediaPickerConfiguration.MultiSelectMode.Counter(requireArguments().getInt("selection_limit", -1)), null, 5, null), EmptyList.b, this);
        b.InterfaceC0381b e = ((sw50) this.O.getValue()).p().e(this);
        if (e == null || (cVar = e.Yd()) == null) {
            cVar = new c();
        }
        this.Q = cVar;
        ((c) cVar).a = requireArguments().getInt("selection_limit", -1);
        int i = requireArguments().getInt("initial_padding", 0);
        VkMediaPicker vkMediaPicker = this.P;
        if (vkMediaPicker != null) {
            vkMediaPicker.d(new VkMediaPicker.c(this, false, false, VkMediaPicker.CellAspectRation.Square, VkMediaPicker.e.c.a, new VkMediaPicker.b.c(i)));
        }
        eo().d();
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        eo().j(i, (ArrayList) list);
    }

    @Override // xsna.mt10.a
    public final void tl(int i) {
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a(mo2getContext);
        aVar.u = new ikv0.d(mo2getContext.getString(i), (String) null, (ikv0.d.a) null, 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, mo2getContext.getString(R.string.picker_selection_snackbar_button), new bz(2));
        aVar.n();
    }

    @Override // xsna.x3v0
    public final void u2(uai0 uai0Var) {
        eo().i(uai0Var.a);
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        eo().c(i, (ArrayList) list);
    }

    @Override // xsna.mt10.a
    public final void Ag(List<? extends MediaStoreEntry> list) {
    }

    @Override // xsna.mt10.a
    public final void Kc(MediaStoreEntry mediaStoreEntry) {
    }

    @Override // xsna.mt10.a
    public final void U6(MediaPickerConfiguration.MediaType mediaType) {
    }
}
