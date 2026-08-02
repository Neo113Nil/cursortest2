package com.vk.newsfeed.posting.crop_editor.presentation.base.fragment;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.channels.impl.channel_screen.send_msg.e;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.crop_editor.domain.model.LocalImageLink;
import com.vk.newsfeed.posting.impl.domain.model.CropFitContainerMode;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.bhk;
import xsna.bih;
import xsna.f4z;
import xsna.fpf0;
import xsna.h1j;
import xsna.ha;
import xsna.ibc0;
import xsna.ies;
import xsna.km50;
import xsna.l7a0;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.nf3;
import xsna.ofk;
import xsna.oz50;
import xsna.pfk;
import xsna.qcy;
import xsna.qfk;
import xsna.rfk;
import xsna.uds;
import xsna.ufk;
import xsna.vk50;
import xsna.xds;
import xsna.xfk;
import xsna.xn50;

/* compiled from: CropEditorFragment.kt */
/* loaded from: classes4.dex */
public final class CropEditorFragment extends MviImplFragment<rfk, l7a0, ofk> implements ies, xds, uds {
    public static final /* synthetic */ qcy<Object>[] W;
    public final f4z Q = new f4z();
    public final nf3 R = new nf3();
    public final Object S;
    public final Object T;
    public final Object U;
    public pfk V;

    /* compiled from: CropEditorFragment.kt */
    public static final class a extends oz50 {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(CropEditorFragment.class, "contentView", "getContentView()Lcom/vk/newsfeed/posting/crop_editor/presentation/base/view/CropEditorContentView;", 0);
        fpf0.a.getClass();
        W = new qcy[]{mutablePropertyReference1Impl};
    }

    public CropEditorFragment() {
        ufk ufkVar = new ufk(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, ufkVar);
        this.T = msy.a(lazyThreadSafetyMode, new bih(this, 8));
        this.U = msy.a(lazyThreadSafetyMode, new h1j(this, 2));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        pfk pfkVar = this.V;
        if ((pfkVar != null ? pfkVar.a : null) == null) {
            finish();
            return mk50.a.a;
        }
        qfk qfkVar = new qfk(requireContext(), this);
        qcy<Object> qcyVar = W[0];
        nf3 nf3Var = this.R;
        nf3Var.c = qfkVar;
        return new mk50.c(((qfk) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((qfk) this.R.getValue(this, W[0])).f((l7a0) ao50Var, new e(1, this, CropEditorFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 8));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((rfk) vk50Var).f.a(new ha(this, 29), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, ofk.a.b);
        return true;
    }

    @Override // xsna.xoo0
    public final int l2() {
        return -16777216;
    }

    @Override // xsna.woo0
    public final int o7() {
        return -16777216;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        Parcelable parcelable4;
        Object obj;
        Object parcelable5;
        Object parcelable6;
        Object parcelable7;
        Object parcelable8;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelable8 = bundle.getParcelable("ImageLink", ImageLink.class);
            parcelable = (Parcelable) parcelable8;
        } else {
            Parcelable parcelable9 = bundle.getParcelable("ImageLink");
            if (!(parcelable9 instanceof ImageLink)) {
                parcelable9 = null;
            }
            parcelable = (ImageLink) parcelable9;
        }
        ImageLink imageLink = (ImageLink) parcelable;
        if (imageLink == null) {
            imageLink = new LocalImageLink(Uri.EMPTY, 1, 1);
        }
        ImageLink imageLink2 = imageLink;
        if (i >= 33) {
            parcelable7 = bundle.getParcelable("CropData", ImageCropArea.class);
            parcelable2 = (Parcelable) parcelable7;
        } else {
            Parcelable parcelable10 = bundle.getParcelable("CropData");
            if (!(parcelable10 instanceof ImageCropArea)) {
                parcelable10 = null;
            }
            parcelable2 = (ImageCropArea) parcelable10;
        }
        ImageCropArea imageCropArea = (ImageCropArea) parcelable2;
        if (i >= 33) {
            parcelable6 = bundle.getParcelable("currentRatio", PostingPreviewRatio.class);
            parcelable3 = (Parcelable) parcelable6;
        } else {
            Parcelable parcelable11 = bundle.getParcelable("currentRatio");
            if (!(parcelable11 instanceof PostingPreviewRatio)) {
                parcelable11 = null;
            }
            parcelable3 = (PostingPreviewRatio) parcelable11;
        }
        PostingPreviewRatio postingPreviewRatio = (PostingPreviewRatio) parcelable3;
        if (postingPreviewRatio == null) {
            postingPreviewRatio = PostingPreviewRatio.f;
        }
        PostingPreviewRatio postingPreviewRatio2 = postingPreviewRatio;
        if (i >= 33) {
            parcelable5 = bundle.getParcelable("OriginalMediaEntry", MediaStoreEntry.class);
            parcelable4 = (Parcelable) parcelable5;
        } else {
            Parcelable parcelable12 = bundle.getParcelable("OriginalMediaEntry");
            if (!(parcelable12 instanceof MediaStoreEntry)) {
                parcelable12 = null;
            }
            parcelable4 = (MediaStoreEntry) parcelable12;
        }
        MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) parcelable4;
        boolean z = bundle.getBoolean("recalculateRatio", false);
        boolean z2 = bundle.getBoolean("hasGoods", false);
        boolean z3 = bundle.getBoolean("editEnabled", false);
        CropFitContainerMode cropFitContainerMode = (CropFitContainerMode) CropFitContainerMode.h().get(bundle.getInt("fitContainerMode", CropFitContainerMode.CROP_ONLY.ordinal()));
        if (i >= 33) {
            obj = bundle.getSerializable("targetScreenUniqueId", UUID.class);
        } else {
            Object serializable = bundle.getSerializable("targetScreenUniqueId");
            obj = (UUID) (serializable instanceof UUID ? serializable : null);
        }
        UUID uuid = (UUID) obj;
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        UUID uuid2 = uuid;
        this.V = new pfk(imageLink2, imageCropArea, postingPreviewRatio2, mediaStoreEntry, z, z2, z3, cropFitContainerMode, uuid2);
        ibc0 C9 = ((Posting2Component) m7m.d(this).mo408a(fpf0.a(Posting2Component.class))).C9(uuid2.toString());
        bhk.b bVar = new bhk.b(imageLink2, postingPreviewRatio2, imageCropArea, imageCropArea, z, z3, cropFitContainerMode, z2, mediaStoreEntry, false);
        f4z f4zVar = this.Q;
        return new rfk(new xfk(bVar, f4zVar), f4zVar, C9);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_CROP_EDITOR;
    }
}
