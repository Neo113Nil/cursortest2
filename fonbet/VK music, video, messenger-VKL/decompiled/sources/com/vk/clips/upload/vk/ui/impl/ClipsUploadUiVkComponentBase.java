package com.vk.clips.upload.vk.ui.impl;

import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.bv0;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.s4;
import xsna.xu0;

/* compiled from: ClipsUploadUiVkComponentBase.kt */
/* loaded from: classes17.dex */
public class ClipsUploadUiVkComponentBase implements ClipsUploadUiVkComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new xu0(9));
    public final nwy b = new nwy(new s4(this, 27));
    public final nwy c = new nwy(new bv0(8));

    /* compiled from: ClipsUploadUiVkComponentBase.kt */
    public static final class a implements b7m<ClipsUploadUiVkComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipsUploadUiVkComponentBase();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsUploadUiVkComponentBase.class, "staticConfig", "getStaticConfig()Lcom/vk/clips/upload/vk/ui/api/ClipsUploadScreenStaticConfig;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, ClipsUploadUiVkComponentBase.class, "navigator", "getNavigator()Lcom/vk/clips/upload/vk/ui/api/ClipsUploadUiVkNavigator;", hpf0Var), ep.a(0, ClipsUploadUiVkComponentBase.class, "trendingHashtagRepository", "getTrendingHashtagRepository()Lcom/vk/clips/upload/vk/ui/api/ClipsTrendingHashtagRepository;", hpf0Var)};
    }

    @Override // com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent
    public final com.vk.clips.upload.vk.ui.api.a V0() {
        qcy<Object> qcyVar = d[2];
        return (com.vk.clips.upload.vk.ui.api.a) this.c.c();
    }

    @Override // com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent
    public final ClipsUploadUiVkNavigator f() {
        qcy<Object> qcyVar = d[1];
        return (ClipsUploadUiVkNavigator) this.b.c();
    }
}
