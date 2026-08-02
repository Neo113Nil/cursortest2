package com.vk.clips.upload.vk.impl.di;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.clips.upload.vk.impl.rules.ClipsPublishRulesFragment;
import com.vk.clips.upload.vk.impl.uploader.c;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.movika.sdk.base.ui.i;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a3f;
import xsna.bpn0;
import xsna.c13;
import xsna.c8m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g25;
import xsna.g5;
import xsna.g8m;
import xsna.h25;
import xsna.hpf0;
import xsna.i25;
import xsna.i70;
import xsna.l370;
import xsna.nwy;
import xsna.pwj0;
import xsna.px0;
import xsna.qcy;
import xsna.r30;
import xsna.rkd;
import xsna.rq6;
import xsna.sq6;
import xsna.w9c0;
import xsna.wl0;
import xsna.wye;
import xsna.xgf;
import xsna.xpp0;
import xsna.xvo;
import xsna.ylf;
import xsna.yye;

/* compiled from: ClipsUploadVkComponentImpl.kt */
/* loaded from: classes.dex */
public final class ClipsUploadVkComponentImpl implements ClipsUploadVkComponent {
    public static final /* synthetic */ qcy<Object>[] h;
    public final bpn0 a;
    public final bpn0 b;
    public final bpn0 c;
    public final nwy d = new nwy(new rq6(1));
    public final nwy e = new nwy(new sq6(2));
    public final nwy f = new nwy(new c13(2));
    public final nwy g = new nwy(new r30(this, 3));

    /* compiled from: ClipsUploadVkComponentImpl.kt */
    public static final class a implements c8m<ClipsUploadVkComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsUploadVkComponentImpl(new bpn0(new g25(g8mVar, 2)), new bpn0(new h25(g8mVar, 2)), new bpn0(new i25(g8mVar, 2)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsUploadVkComponentImpl.class, "navigator", "getNavigator()Lcom/vk/clips/upload/vk/api/navigation/ClipsUploadPreviewNavigator;", 0);
        hpf0 hpf0Var = fpf0.a;
        h = new qcy[]{propertyReference1Impl, fp.c(0, ClipsUploadVkComponentImpl.class, "uploadsInteractor", "getUploadsInteractor()Lcom/vk/clips/upload/vk/api/uploader/ClipsUploadsInteractor;", hpf0Var), ep.a(0, ClipsUploadVkComponentImpl.class, "postWithVideoToClipHelper", "getPostWithVideoToClipHelper()Lcom/vk/clips/upload/vk/api/post/PostWithVideoToClipHelper;", hpf0Var), ep.a(0, ClipsUploadVkComponentImpl.class, "sdkUploaderDataBuilder", "getSdkUploaderDataBuilder()Lcom/vk/clips/upload/vk/api/uploader/ClipsSdkUploaderDataBuilder;", hpf0Var)};
    }

    public ClipsUploadVkComponentImpl(bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3) {
        this.a = bpn0Var;
        this.b = bpn0Var2;
        this.c = bpn0Var3;
    }

    @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
    public final void D4(Context context) {
        ClipsPublishRulesFragment.a aVar = new ClipsPublishRulesFragment.a();
        aVar.s(true);
        aVar.k(context);
    }

    @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
    public final w9c0 K6() {
        qcy<Object> qcyVar = h[2];
        return (w9c0) this.f.c();
    }

    @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
    public final void T3(FragmentActivity fragmentActivity, String str, String str2) {
        xvo.a.a(fragmentActivity, str, str2);
    }

    @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
    public final wye U5() {
        return new yye(l370.j());
    }

    @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
    public final ylf Uc() {
        qcy<Object> qcyVar = h[1];
        return (ylf) this.e.c();
    }

    @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
    public final xgf f() {
        qcy<Object> qcyVar = h[0];
        return (xgf) this.d.c();
    }

    @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
    public final void kb(FragmentActivity fragmentActivity, px0 px0Var) {
        String str = rkd.c;
        rkd.a.a(fragmentActivity, new g5(px0Var, 23));
    }

    @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
    public final Set<File> s0() {
        if (((ClipsConfigAuthorsComponent) this.b.getValue()).getExperiments().k()) {
            return ((ClipsUploadSdkUploaderComponent) this.c.getValue()).Zb().s0();
        }
        c.a.getClass();
        HashSet hashSet = new HashSet();
        c.e.b(new wl0(hashSet, 21));
        return hashSet;
    }

    @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
    public final void s5(FragmentActivity fragmentActivity, String str, String str2, i iVar) {
        new xpp0.a(fragmentActivity, str, str2, new i70(iVar, 25)).I0(null);
    }

    @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
    public final a3f v9() {
        qcy<Object> qcyVar = h[3];
        return (a3f) this.g.c();
    }
}
