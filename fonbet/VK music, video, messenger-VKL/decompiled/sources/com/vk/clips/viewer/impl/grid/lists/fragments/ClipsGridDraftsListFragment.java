package com.vk.clips.viewer.impl.grid.lists.fragments;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.dto.clips.model.ClipsEditorSessionParams;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.movika.sdk.base.observable.e0;
import com.vk.movika.sdk.base.observable.q;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asu0;
import xsna.av20;
import xsna.bx9;
import xsna.dhr0;
import xsna.dw20;
import xsna.e3m;
import xsna.e520;
import xsna.gd;
import xsna.grd;
import xsna.ie;
import xsna.izs;
import xsna.jv;
import xsna.l7s;
import xsna.lf3;
import xsna.m5;
import xsna.msy;
import xsna.mzc;
import xsna.oz50;
import xsna.qc;
import xsna.s3q0;
import xsna.s5;
import xsna.sv;
import xsna.t5;
import xsna.tce;
import xsna.tzp0;
import xsna.uce;
import xsna.ux20;
import xsna.v8;
import xsna.v8f;
import xsna.vx20;
import xsna.vyd;
import xsna.xce;

/* compiled from: ClipsGridDraftsListFragment.kt */
/* loaded from: classes17.dex */
public final class ClipsGridDraftsListFragment extends AbstractClipsGridListFragment {
    public static final /* synthetic */ int l0 = 0;
    public final Object f0;
    public final Object g0;
    public final Object h0;
    public dw20 i0;
    public final Object j0;
    public final uce k0;

    /* compiled from: ClipsGridDraftsListFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ClipsGridDraftsListFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<tce, s3q0> {
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(tce tceVar) {
            tce tceVar2 = tceVar;
            ClipsGridDraftsListFragment clipsGridDraftsListFragment = (ClipsGridDraftsListFragment) this.receiver;
            int i = ClipsGridDraftsListFragment.l0;
            v8f l5 = ((ClipsTemplatesEditorComponent) clipsGridDraftsListFragment.h0.getValue()).l5();
            ClipAudioTemplate clipAudioTemplate = tceVar2.f;
            if (clipAudioTemplate != null) {
                clipsGridDraftsListFragment.P.b(l5.a(clipsGridDraftsListFragment.requireContext(), clipAudioTemplate.b).m(asu0.a.d()).subscribe(new jv(new bx9(clipsGridDraftsListFragment, l5, clipAudioTemplate, tceVar2, 2), 15), new v8(new lf3(clipsGridDraftsListFragment, tceVar2, l5, 1), 16)));
            } else {
                vyd.a aVar = new vyd.a(12, (Integer) null, tceVar2.a);
                dhr0.a.getClass();
                ((CameraClipsComponent) clipsGridDraftsListFragment.f0.getValue()).sf().b(clipsGridDraftsListFragment.kn(), aVar, new vyd.c(dhr0.u().c, 12, null), new ClipsEditorSessionParams(null, false, false, false, null, false, 63, null));
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipsGridDraftsListFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<tce, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(tce tceVar) {
            Activity h;
            int i;
            tce tceVar2 = tceVar;
            ClipsGridDraftsListFragment clipsGridDraftsListFragment = (ClipsGridDraftsListFragment) this.receiver;
            int i2 = ClipsGridDraftsListFragment.l0;
            Context mo2getContext = clipsGridDraftsListFragment.mo2getContext();
            if (mo2getContext != null && (h = e3m.h(mo2getContext)) != null) {
                int i3 = 0;
                if (clipsGridDraftsListFragment.requireArguments().getBoolean("ClipsGridListFragment.force_dark_theme", false)) {
                    dhr0.a.getClass();
                    i = dhr0.u().c;
                } else if (dhr0.M()) {
                    dhr0.a.getClass();
                    i = dhr0.u().c;
                } else {
                    dhr0.a.getClass();
                    i = dhr0.z().c;
                }
                l7s l7sVar = new l7s(h, i);
                int f = e3m.f(R.attr.vk_ui_text_negative, l7sVar);
                int f2 = e3m.f(R.attr.vk_ui_icon_negative, l7sVar);
                xce xceVar = new xce(clipsGridDraftsListFragment, h, tceVar2, i3);
                int f3 = e3m.f(R.attr.vk_ui_background_negative, l7sVar);
                av20.a aVar = new av20.a();
                aVar.d(R.layout.ds_internal_actions_popup_item, LayoutInflater.from(l7sVar));
                aVar.d = new ux20(f, l7sVar, f3, f2, null);
                aVar.e = new vx20(xceVar);
                av20 b = aVar.b();
                b.setItems(Collections.singletonList(new e520(R.id.remove_clip, R.drawable.vk_icon_delete_outline_28, R.string.clips_delete_draft, 0, false, 0, 0, false, null, 0, null, false, 8176)));
                grd.a aVar2 = new grd.a(l7sVar, tzp0.a(null, 3));
                aVar2.e = true;
                dw20 I0 = ((dw20.b) dw20.a.k(aVar2, b, 6)).I0("DRAFTS_GRID_BOTTOM_SHEET_MENU_TAG");
                dw20 dw20Var = clipsGridDraftsListFragment.i0;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                clipsGridDraftsListFragment.i0 = I0;
            }
            return s3q0.a;
        }
    }

    public ClipsGridDraftsListFragment() {
        super(ClipsGridTabData.Drafts);
        com.vk.movika.sdk.base.presenter.b bVar = new com.vk.movika.sdk.base.presenter.b(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f0 = msy.a(lazyThreadSafetyMode, bVar);
        this.g0 = msy.a(lazyThreadSafetyMode, new qc(this, 18));
        this.h0 = msy.a(lazyThreadSafetyMode, new s5(this, 28));
        this.j0 = msy.a(lazyThreadSafetyMode, new t5(this, 26));
        this.k0 = new uce(new b(1, this, ClipsGridDraftsListFragment.class, "openClipsEditor", "openClipsEditor(Lcom/vk/dto/shortvideo/entries/ClipsGridDraftEntry;)V", 0), new c(1, this, ClipsGridDraftsListFragment.class, "showClipsGridShortMenuActions", "showClipsGridShortMenuActions(Lcom/vk/dto/shortvideo/entries/ClipsGridDraftEntry;)V", 0));
    }

    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment
    public final gd jo() {
        return this.k0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment
    public final ie lo() {
        return (mzc) this.j0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.P.b(((CameraClipsComponent) this.f0.getValue()).e1().a().subscribe(new sv(new q(this, 28), 17), new m5(new e0(13), 17)));
    }
}
