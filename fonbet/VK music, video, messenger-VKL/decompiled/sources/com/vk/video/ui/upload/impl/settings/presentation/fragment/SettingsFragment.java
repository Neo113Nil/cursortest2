package com.vk.video.ui.upload.impl.settings.presentation.fragment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.OrdData;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.video.ui.smartcrop.api.router.SmartCropArguments;
import com.vk.video.ui.upload.api.router.AttachedClipsArguments;
import com.vk.video.ui.upload.api.router.AttachedClipsResult;
import com.vk.video.ui.upload.impl.attachedclips.presentation.fragment.AttachedClipsFragment;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerArguments;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerFragment;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bn50;
import xsna.bpn0;
import xsna.ctu;
import xsna.f1t0;
import xsna.f5k0;
import xsna.f870;
import xsna.fpf0;
import xsna.gpt0;
import xsna.h1j0;
import xsna.i440;
import xsna.ies;
import xsna.izs;
import xsna.maz;
import xsna.msy;
import xsna.nwy;
import xsna.oz50;
import xsna.pwh0;
import xsna.q0j0;
import xsna.q1j0;
import xsna.qcy;
import xsna.s3q0;
import xsna.u1h0;
import xsna.wcy;
import xsna.whg0;
import xsna.wq20;
import xsna.xpi;
import xsna.xwk;
import xsna.y3j0;

/* compiled from: SettingsFragment.kt */
/* loaded from: classes7.dex */
public final class SettingsFragment extends FragmentImpl implements ies {
    public static final /* synthetic */ qcy<Object>[] Q;
    public final bpn0 N = new bpn0(new i440(this, 29));
    public final Object O = msy.a(LazyThreadSafetyMode.NONE, new pwh0(this, 3));
    public final u1h0 P;

    /* compiled from: SettingsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: SettingsFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<q1j0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(q1j0 q1j0Var) {
            q1j0 q1j0Var2 = q1j0Var;
            SettingsFragment settingsFragment = (SettingsFragment) this.receiver;
            qcy<Object>[] qcyVarArr = SettingsFragment.Q;
            settingsFragment.getClass();
            bpn0 bpn0Var = settingsFragment.N;
            if (q1j0Var2 instanceof q1j0.e) {
                VideoFile videoFile = ((SettingsArguments) bpn0Var.getValue()).i;
                if (videoFile != null) {
                    nwy nwyVar = settingsFragment.eo().g;
                    qcy<Object> qcyVar = SettingsFragmentInternalComponent.k[4];
                    f5k0 f5k0Var = (f5k0) nwyVar.c();
                    FragmentActivity kn = settingsFragment.kn();
                    gpt0 gpt0Var = gpt0.a;
                    f5k0Var.a(kn, new SmartCropArguments(gpt0.G(videoFile), SmartCropArguments.EntryPoint.VIDEO_EDIT));
                }
            } else {
                if (q1j0Var2 instanceof q1j0.c) {
                    UserId userId = ((SettingsArguments) bpn0Var.getValue()).h;
                    VideoFile videoFile2 = ((SettingsArguments) bpn0Var.getValue()).i;
                    Integer valueOf = videoFile2 != null ? Integer.valueOf(videoFile2.o0()) : null;
                    List<VideoFile> list = ((q1j0.c) q1j0Var2).a;
                    VideoFile videoFile3 = ((SettingsArguments) bpn0Var.getValue()).i;
                    AttachedClipsArguments attachedClipsArguments = new AttachedClipsArguments(userId, valueOf, list, false, (videoFile3 != null ? Integer.valueOf(videoFile3.o0()) : null) == null ? AttachedClipsArguments.EntryPoint.FROM_UPLOAD : AttachedClipsArguments.EntryPoint.FROM_EDIT);
                    AttachedClipsFragment.a aVar = new AttachedClipsFragment.a(AttachedClipsFragment.class, null, null);
                    aVar.j.putParcelable("arguments", attachedClipsArguments);
                    aVar.g(1, settingsFragment);
                } else if (q1j0Var2 instanceof q1j0.b) {
                    new VideoViewerFragment.a(new VideoViewerArguments.RemoteAttachedClip(((q1j0.b) q1j0Var2).a.a1())).l(settingsFragment);
                } else if (q1j0Var2 instanceof q1j0.d) {
                    f1t0 Df = settingsFragment.eo().Df();
                    FragmentActivity kn2 = settingsFragment.kn();
                    OrdData ordData = ((q1j0.d) q1j0Var2).a;
                    Df.getClass();
                    boolean z = ordData != null;
                    LaunchContext launchContext = new LaunchContext(false, false, false, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_EDIT_VIDEO), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108855);
                    String v = f870.v(InternalVkMiniApps.ORD.h());
                    if (z) {
                        String str = ordData.c;
                        boolean z2 = ordData.b;
                        String str2 = ordData.d;
                        StringBuilder sb = new StringBuilder();
                        sb.append(v + "#is_ad=" + z2);
                        if (str != null && str.length() != 0) {
                            sb.append("&ord_pred_id=".concat(str));
                        }
                        if (str2 != null && str2.length() != 0) {
                            sb.append("&erid=".concat(str2));
                        }
                        v = sb.toString();
                    }
                    maz.c(xwk.d().e(), kn2, v, launchContext, null, null, 24);
                } else {
                    if (!(q1j0Var2 instanceof q1j0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intent intent = new Intent();
                    intent.putExtra("arguments", ((q1j0.a) q1j0Var2).a);
                    s3q0 s3q0Var = s3q0.a;
                    settingsFragment.Mf(-1, intent);
                }
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SettingsFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        Q = new qcy[]{propertyReference1Impl};
    }

    public SettingsFragment() {
        wq20 wq20Var = new wq20(this, 28);
        int i = wcy.c;
        this.P = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(SettingsState.class)), wcy.a.a(fpf0.d(SettingsState.class)), wcy.a.a(fpf0.d(q0j0.class)), wcy.a.a(fpf0.d(q1j0.class))).toString(), this, this, wq20Var);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        fo().b(q0j0.c.b);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final SettingsFragmentInternalComponent eo() {
        return (SettingsFragmentInternalComponent) this.O.getValue();
    }

    public final bn50<SettingsState, SettingsState, q0j0, q1j0> fo() {
        qcy<Object> qcyVar = Q[0];
        return (bn50) this.P.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcelable parcelable;
        Object parcelableExtra;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1 && intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("arguments", AttachedClipsResult.class);
                parcelable = (Parcelable) parcelableExtra;
            } else {
                Parcelable parcelableExtra2 = intent.getParcelableExtra("arguments");
                if (!(parcelableExtra2 instanceof AttachedClipsResult)) {
                    parcelableExtra2 = null;
                }
                parcelable = (AttachedClipsResult) parcelableExtra2;
            }
            AttachedClipsResult attachedClipsResult = (AttachedClipsResult) parcelable;
            if (attachedClipsResult != null) {
                fo().b(new q0j0.a.C3542a(attachedClipsResult));
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eo().Df().b.a();
        eo().Df().a = new whg0(this, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nwy nwyVar = eo().i;
        qcy<Object> qcyVar = SettingsFragmentInternalComponent.k[6];
        h1j0 h1j0Var = new h1j0((y3j0) nwyVar.c(), new b(1, this, SettingsFragment.class, "handleEvent", "handleEvent(Lcom/vk/video/ui/upload/impl/settings/presentation/feature/entity/SettingsEvent;)V", 0));
        ComposeView a2 = xpi.a(layoutInflater.getContext());
        h1j0Var.c(fo(), a2);
        return a2;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        f1t0 Df = eo().Df();
        ctu ctuVar = Df.b;
        ctu.b();
        Df.a = null;
    }
}
