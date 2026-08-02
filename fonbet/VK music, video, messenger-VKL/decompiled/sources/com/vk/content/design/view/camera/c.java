package com.vk.content.design.view.camera;

import android.content.Context;
import com.vk.content.design.view.camera.a;
import com.vk.dto.masks.Mask;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.media.ok.InitStage;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gleffects.EffectRegistry;
import xsna.bm9;
import xsna.i6m;
import xsna.ikv0;
import xsna.mk9;
import xsna.mo9;
import xsna.pw70;
import xsna.q7q0;
import xsna.wug0;
import xsna.y8g0;
import xsna.zd9;

/* compiled from: CameraUIView.kt */
/* loaded from: classes17.dex */
public final class c implements a.InterfaceC0730a {
    public final /* synthetic */ CameraUIView a;
    public final /* synthetic */ Context b;

    public c(CameraUIView cameraUIView, Context context) {
        this.a = cameraUIView;
        this.b = context;
    }

    @Override // com.vk.content.design.view.camera.a.InterfaceC0730a
    public final void a(Mask mask) {
        bm9 presenter = this.a.getPresenter();
        if (presenter != null) {
            presenter.a(mask);
        }
    }

    @Override // com.vk.content.design.view.camera.a.InterfaceC0730a
    public final void d(Mask mask) {
        CameraUIView cameraUIView = this.a;
        bm9 presenter = cameraUIView.getPresenter();
        if (presenter != null) {
            presenter.d(mask);
        }
        cameraUIView.setShutterEnabled(true);
    }

    @Override // com.vk.content.design.view.camera.a.InterfaceC0730a
    public final void e(boolean z) {
        zd9 camera1View = this.a.getCamera1View();
        if (camera1View != null) {
            camera1View.E(z);
        }
    }

    @Override // com.vk.content.design.view.camera.a.InterfaceC0730a
    public final void f() {
        int a = y8g0.a(R.dimen.camera_masks_mask_list_margin_bottom);
        Context context = this.b;
        q7q0 q7q0Var = new q7q0(context);
        q7q0Var.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.clips_update_app_motivation), 5), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        q7q0Var.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.clips_update_app_act), new wug0(context, 21));
        q7q0Var.o = Integer.valueOf(a + this.a.t0);
        q7q0Var.n();
    }

    @Override // com.vk.content.design.view.camera.a.InterfaceC0730a
    public final boolean g() {
        bm9 presenter = this.a.getPresenter();
        return (presenter != null ? presenter.c4() : null) == StoryCameraMode.CLIPS;
    }

    @Override // com.vk.content.design.view.camera.a.InterfaceC0730a
    public final void h(Mask mask, String str, boolean z) {
        zd9 camera1View = this.a.getCamera1View();
        if (camera1View != null) {
            camera1View.H(mask, str, z);
        }
    }

    @Override // com.vk.content.design.view.camera.a.InterfaceC0730a
    public final boolean i(int i) {
        com.vk.media.ok.b bVar;
        Tensorflow tensorflow;
        Tensorflow tensorflow2;
        Tensorflow tensorflow3;
        Tensorflow tensorflow4;
        zd9 camera1View = this.a.getCamera1View();
        if (camera1View != null && (bVar = ((mo9) camera1View.getCameraPreview()).g.B) != null) {
            EffectRegistry effectRegistry = bVar.H.getEffectRegistry();
            EffectRegistry.EffectId b = pw70.b(i);
            if (b != null) {
                Long effectHandle = effectRegistry.getEffectHandle(b);
                com.vk.media.ok.a aVar = bVar.h;
                boolean z = (aVar != null && aVar.h() && bVar.l0 == null && bVar.L == null && effectRegistry.inputAudioBitsRequired(effectHandle)) ? false : true;
                Tensorflow tensorflow5 = bVar.M;
                boolean z2 = (tensorflow5 != null && tensorflow5.isAllowedToRecognize()) || !(effectRegistry.inputRecognitionsRequired(effectHandle) || effectRegistry.fatEffect(effectHandle));
                boolean z3 = (!effectRegistry.inputFullSegmentationRequired(effectHandle) || ((tensorflow4 = bVar.M) != null && tensorflow4.isPersonSegmentationGpued())) && (!effectRegistry.inputCatFaceRequired(effectHandle) || ((tensorflow = bVar.M) != null && tensorflow.isCatsGpued()));
                boolean z4 = !bVar.t(effectHandle) || i6m.b(bVar.A0);
                if (effectRegistry.inputFullSegmentationRequired(effectHandle) && (tensorflow3 = bVar.M) != null && !tensorflow3.isPersonSegmentationGpued()) {
                    Tensorflow tensorflow6 = bVar.M;
                    if (tensorflow6 != null) {
                        tensorflow6.tryStartInitPersonSegmentation();
                    }
                    bVar.E0 = true;
                }
                if (effectRegistry.inputCatFaceRequired(effectHandle) && (tensorflow2 = bVar.M) != null && !tensorflow2.isCatsGpued()) {
                    Tensorflow tensorflow7 = bVar.M;
                    if (tensorflow7 != null) {
                        tensorflow7.tryStartInitCats();
                    }
                    bVar.F0 = true;
                }
                if (bVar.Z.compareTo(InitStage.EFFECT) > 0 && z && z2 && z3 && z4) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.vk.content.design.view.camera.a.InterfaceC0730a
    public final void j(String str) {
        zd9 camera1View = this.a.getCamera1View();
        if (camera1View != null) {
            mk9 mk9Var = ((mo9) camera1View.getCameraPreview()).g;
            com.vk.media.ok.b bVar = mk9Var.B;
            if (bVar != null) {
                bVar.K0 = str;
            }
            mk9Var.a0 = str;
        }
    }

    @Override // com.vk.content.design.view.camera.a.InterfaceC0730a
    public final boolean k(int i) {
        zd9 camera1View = this.a.getCamera1View();
        if (camera1View != null) {
            com.vk.media.ok.b bVar = ((mo9) camera1View.getCameraPreview()).g.B;
            if (bVar != null ? bVar.j(i) : false) {
                return true;
            }
        }
        return false;
    }
}
