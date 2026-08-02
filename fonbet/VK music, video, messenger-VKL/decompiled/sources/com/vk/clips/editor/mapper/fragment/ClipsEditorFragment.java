package com.vk.clips.editor.mapper.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.editor.di.ClipsEditorComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.clips.model.ClipsEditorInitParams;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.clips.upload.ClipsEditorUploadParams;
import com.vk.dto.common.id.UserId;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.movika.sdk.base.ui.f;
import com.vk.movika.sdk.base.ui.g;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aeg0;
import xsna.axd;
import xsna.bpn0;
import xsna.byd;
import xsna.c5g;
import xsna.chd;
import xsna.e3m;
import xsna.efs;
import xsna.ey50;
import xsna.fkq0;
import xsna.fpf0;
import xsna.hd;
import xsna.i0q0;
import xsna.ies;
import xsna.izs;
import xsna.j1;
import xsna.j5g;
import xsna.kbk;
import xsna.kes;
import xsna.kod;
import xsna.l1;
import xsna.lbk;
import xsna.m7m;
import xsna.msy;
import xsna.nk9;
import xsna.o1f;
import xsna.o25;
import xsna.ow90;
import xsna.oz50;
import xsna.rhd;
import xsna.rl3;
import xsna.s3q0;
import xsna.tb0;
import xsna.uds;
import xsna.vds;
import xsna.vhk0;
import xsna.w0e;
import xsna.wrp;
import xsna.wvd;
import xsna.xds;
import xsna.yc;
import xsna.yxd;

/* compiled from: ClipsEditorFragment.kt */
/* loaded from: classes16.dex */
public final class ClipsEditorFragment extends FragmentImpl implements ies, kes, xds, uds, vds, tb0 {
    public static Integer W;
    public final bpn0 N = new bpn0(new yc(this, 23));
    public final bpn0 O;
    public final Object P;
    public final Object Q;
    public final bpn0 R;
    public final int S;
    public final int T;
    public o1f U;
    public wvd V;

    /* compiled from: ClipsEditorFragment.kt */
    public static final class a extends oz50 {
        public a(ClipsEditorInitParams clipsEditorInitParams) {
            super(ClipsEditorFragment.class, null, null);
            this.j.putParcelable("input_params", clipsEditorInitParams);
        }

        public final void y(boolean z) {
            this.j.putBoolean("finish_on_done", z);
        }
    }

    /* compiled from: ClipsEditorFragment.kt */
    public final class b extends axd {
        public final ClipsEditorInitParams b;

        public b(o1f o1fVar, ClipsEditorInitParams clipsEditorInitParams) {
            super(o1fVar);
            this.b = clipsEditorInitParams;
        }

        public final void b(int i, Intent intent) {
            ClipsEditorFragment clipsEditorFragment = ClipsEditorFragment.this;
            lbk c4 = ((CameraClipsComponent) m7m.d(clipsEditorFragment).a(fpf0.a(CameraClipsComponent.class))).c4();
            kbk context = c4.getContext();
            ClipsEditorInputData clipsEditorInputData = this.b.b;
            if (!clipsEditorInputData.e) {
                c4.i();
            }
            if (i != -1) {
                clipsEditorFragment.Mf(i, intent);
                return;
            }
            if (clipsEditorInputData.e) {
                clipsEditorFragment.Mf(i, intent);
                return;
            }
            if (context != null && context.d) {
                clipsEditorFragment.Mf(i, intent);
                return;
            }
            Context mo2getContext = clipsEditorFragment.mo2getContext();
            if ((mo2getContext != null ? e3m.h(mo2getContext) : null) instanceof ey50) {
                clipsEditorFragment.Mf(i, intent);
                i0q0.f(new byd(clipsEditorFragment.requireContext(), 0));
            } else {
                com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("clips editor navigation handle inconsistency"));
                clipsEditorFragment.Mf(i, intent);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        public final UserId c() {
            chd f = ((rhd) ClipsEditorFragment.this.Q.getValue()).f();
            UserId e = f instanceof chd.b ? fkq0.e(((chd.b) f).a) : f != null ? f.getId() : null;
            return e == null ? o25.a().c() : e;
        }

        public final void d() {
            Integer num = ClipsEditorFragment.W;
            ((nk9) ClipsEditorFragment.this.R.getValue()).a();
        }
    }

    /* compiled from: ClipsEditorFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<List<? extends ClipsEditorInputVideoItem>, s3q0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends ClipsEditorInputVideoItem> list) {
            List<? extends ClipsEditorInputVideoItem> list2 = list;
            wvd wvdVar = ((ClipsEditorFragment) this.receiver).V;
            wvd wvdVar2 = wvdVar;
            if (wvdVar == null) {
                wvdVar2 = 0;
            }
            wvdVar2.f(list2);
            return s3q0.a;
        }
    }

    /* compiled from: ClipsEditorFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<List<? extends yxd>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends yxd> list) {
            List<? extends yxd> list2 = list;
            ClipsEditorFragment clipsEditorFragment = (ClipsEditorFragment) this.receiver;
            Integer num = ClipsEditorFragment.W;
            ((nk9) clipsEditorFragment.R.getValue()).a();
            lbk lbkVar = (lbk) clipsEditorFragment.O.getValue();
            List<? extends yxd> list3 = list2;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((yxd) it.next()).a.toString());
            }
            lbkVar.c(arrayList);
            wvd wvdVar = clipsEditorFragment.V;
            if (wvdVar == null) {
                wvdVar = null;
            }
            wvdVar.e(list2);
            return s3q0.a;
        }
    }

    /* compiled from: ClipsEditorFragment.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Uri, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Uri uri) {
            Uri uri2 = uri;
            wvd wvdVar = ((ClipsEditorFragment) this.receiver).V;
            if (wvdVar == null) {
                wvdVar = null;
            }
            wvdVar.g(uri2);
            return s3q0.a;
        }
    }

    public ClipsEditorFragment() {
        new bpn0(new j1(this, 25));
        this.O = new bpn0(new hd(this, 20));
        f fVar = new f(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.P = msy.a(lazyThreadSafetyMode, fVar);
        this.Q = msy.a(lazyThreadSafetyMode, new l1(this, 26));
        this.R = new bpn0(new g(this, 28));
        this.S = -16777216;
        this.T = -16777216;
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // xsna.kes
    public final boolean Xf() {
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        wvd wvdVar = this.V;
        if (wvdVar == null) {
            wvdVar = null;
        }
        wvdVar.d();
        return true;
    }

    @Override // xsna.xoo0
    public final int l2() {
        return this.S;
    }

    @Override // xsna.woo0
    public final int o7() {
        return this.T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [kotlin.collections.EmptyList] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList parcelableArrayList;
        List<? extends ClipsEditorInputVideoItem> list;
        ArrayList parcelableArrayListExtra;
        Object obj;
        Bundle bundleExtra;
        wvd wvdVar = this.V;
        Uri uri = null;
        if (wvdVar == null) {
            wvdVar = null;
        }
        wvdVar.onActivityResult(i, i2, intent);
        o1f o1fVar = this.U;
        if (o1fVar == null) {
            o1fVar = null;
        }
        o1fVar.getClass();
        if (i2 != -1) {
            return;
        }
        if (i != 982) {
            if (i == 981) {
                c cVar = o1fVar.b;
                if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("clip_fragments")) == null || (list = j5g.O0(parcelableArrayListExtra)) == null) {
                    list = EmptyList.b;
                }
                cVar.invoke(list);
                return;
            }
            if (i == 409) {
                Bundle bundleExtra2 = intent != null ? intent.getBundleExtra("result_attachments") : null;
                if (bundleExtra2 != null && (parcelableArrayList = bundleExtra2.getParcelableArrayList("result_files")) != null) {
                    uri = (Uri) j5g.Y(parcelableArrayList);
                }
                if (uri != null) {
                    o1fVar.d.invoke(uri);
                    return;
                }
                return;
            }
            return;
        }
        d dVar = o1fVar.c;
        if (intent == null || (bundleExtra = intent.getBundleExtra("result_attachments")) == null) {
            obj = EmptyList.b;
        } else {
            ArrayList parcelableArrayList2 = bundleExtra.getParcelableArrayList("result_files");
            boolean[] booleanArray = bundleExtra.getBooleanArray("result_video_flags");
            if (parcelableArrayList2 == null || parcelableArrayList2.isEmpty() || booleanArray == null || booleanArray.length == 0) {
                obj = EmptyList.b;
            } else {
                ArrayList arrayList = new ArrayList(c5g.u(parcelableArrayList2, 10));
                Iterator it = parcelableArrayList2.iterator();
                while (it.hasNext()) {
                    String path = ((Uri) it.next()).getPath();
                    if (path == null) {
                        path = "";
                    }
                    arrayList.add(new File(path));
                }
                List<Boolean> v0 = rl3.v0(booleanArray);
                Iterator it2 = arrayList.iterator();
                Iterator<T> it3 = v0.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(c5g.u(arrayList, 10), c5g.u(v0, 10)));
                while (it2.hasNext() && it3.hasNext()) {
                    File file = (File) it2.next();
                    arrayList2.add(((Boolean) it3.next()).booleanValue() ? new yxd.b(file) : new yxd.a(file));
                }
                obj = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    if (vhk0.g(((yxd) next).a)) {
                        obj.add(next);
                    }
                }
            }
        }
        dVar.invoke(obj);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ClipsEditorInitParams clipsEditorInitParams = (ClipsEditorInitParams) (bundle == null ? requireArguments() : bundle).getParcelable("input_params");
        ClipsEditorUploadParams clipsEditorUploadParams = clipsEditorInitParams.c;
        ClipsEditorInitParams a2 = ClipsEditorInitParams.a(clipsEditorInitParams, null, ClipsEditorUploadParams.a(clipsEditorUploadParams, 0, null, null, false, null, null, null, 0, false, false, false, null, wrp.b(wrp.a(clipsEditorUploadParams.u)), null, 66584575), 5);
        if (bundle != null) {
            ClipsDraftPersistentStore.b.getClass();
            ClipsDraftVk j = ClipsDraftPersistentStore.j();
            if (j != null) {
                a2 = ClipsEditorInitParams.a(a2, w0e.b(j, a2.b.e), null, 6);
            }
        }
        ClipsEditorInitParams clipsEditorInitParams2 = a2;
        o1f o1fVar = new o1f(requireContext(), new c(1, this, ClipsEditorFragment.class, "onClipsSelectedFromCamera", "onClipsSelectedFromCamera(Ljava/util/List;)V", 0), new d(1, this, ClipsEditorFragment.class, "onClipsSelectedFromGallery", "onClipsSelectedFromGallery(Ljava/util/List;)V", 0), new e(1, this, ClipsEditorFragment.class, "onSelectedForAudioExtraction", "onSelectedForAudioExtraction(Landroid/net/Uri;)V", 0));
        this.U = o1fVar;
        this.V = ((ClipsEditorComponent) m7m.d(this).mo408a(fpf0.a(ClipsEditorComponent.class))).Lc(clipsEditorInitParams2, layoutInflater.getContext(), new b(o1fVar, clipsEditorInitParams2));
        ClipsEditorUploadParams clipsEditorUploadParams2 = clipsEditorInitParams2.c;
        int i = clipsEditorUploadParams2.b;
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint a3 = wrp.a(clipsEditorUploadParams2.u);
        Integer num = W;
        if (num == null || num.intValue() != i) {
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.EventType eventType = MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.EventType.OPEN_EDITOR;
            if (a3 == null) {
                a3 = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
            }
            new kod(c2, new MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem(eventType, new MobileOfficialAppsClipsStat$ClipsCreateContext(i, a3))).q();
            W = Integer.valueOf(i);
        }
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this);
        }
        ow90 ow90Var = ow90.a;
        ((efs) ow90.n.getValue()).b(kn(), this.D, ScrollScreenType.CLIPS_EDITOR, TimeUnit.SECONDS.toMillis(10L));
        wvd wvdVar = this.V;
        return (wvdVar != null ? wvdVar : null).getView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this);
        }
        wvd wvdVar = this.V;
        (wvdVar != null ? wvdVar : null).onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        wvd wvdVar = this.V;
        if (wvdVar == null) {
            wvdVar = null;
        }
        wvdVar.onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        wvd wvdVar = this.V;
        if (wvdVar == null) {
            wvdVar = null;
        }
        wvdVar.onResume();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("input_params", requireArguments().getParcelable("input_params"));
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        wvd wvdVar = this.V;
        if (wvdVar == null) {
            wvdVar = null;
        }
        wvdVar.onStart();
        super.onStart();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        wvd wvdVar = this.V;
        if (wvdVar == null) {
            wvdVar = null;
        }
        wvdVar.onStop();
        super.onStop();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        wvd wvdVar = this.V;
        if (wvdVar == null) {
            wvdVar = null;
        }
        wvdVar.prepare();
    }
}
