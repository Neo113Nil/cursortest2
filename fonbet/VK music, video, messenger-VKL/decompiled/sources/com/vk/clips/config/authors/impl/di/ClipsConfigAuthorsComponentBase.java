package com.vk.clips.config.authors.impl.di;

import android.content.Context;
import com.ironsource.C4641xe;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.config.authors.impl.di.ClipsConfigAuthorsComponentBase;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gzs;
import xsna.hpf0;
import xsna.mb3;
import xsna.mhd;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.xu2;

/* compiled from: ClipsConfigAuthorsComponentBase.kt */
/* loaded from: classes.dex */
public class ClipsConfigAuthorsComponentBase implements ClipsConfigAuthorsComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final nwy a = new nwy(new xu2(4));
    public final nwy b = new nwy(new xu2(4));
    public final nwy c = new nwy(new xu2(4));
    public final nwy d = new nwy(new mb3(3));
    public final nwy e;

    /* compiled from: ClipsConfigAuthorsComponentBase.kt */
    public static final class a implements c8m<ClipsConfigAuthorsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsConfigAuthorsComponentBase((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)), (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsConfigAuthorsComponentBase.class, "forceDisableClipsCreate", "getForceDisableClipsCreate()Z", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, ClipsConfigAuthorsComponentBase.class, "anonymousTogglesAllowed", "getAnonymousTogglesAllowed()Z", hpf0Var), ep.a(0, ClipsConfigAuthorsComponentBase.class, "needAttachVideoItemExtraTopPadding", "getNeedAttachVideoItemExtraTopPadding()Z", hpf0Var), ep.a(0, ClipsConfigAuthorsComponentBase.class, "anonymousTogglesProvider", "getAnonymousTogglesProvider()Lkotlin/jvm/functions/Function1;", hpf0Var), ep.a(0, ClipsConfigAuthorsComponentBase.class, C4641xe.d, "getExperiments()Lcom/vk/clips/config/authors/api/experiments/ClipsAuthorsExperiments;", hpf0Var)};
    }

    public ClipsConfigAuthorsComponentBase(final AppContextDiComponent appContextDiComponent, final AuthBridgeComponent authBridgeComponent) {
        this.e = new nwy(new gzs() { // from class: xsna.znd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.gzs
            public final Object invoke() {
                qcy<Object>[] qcyVarArr = ClipsConfigAuthorsComponentBase.f;
                Context context = AppContextDiComponent.this.a;
                ClipsConfigAuthorsComponentBase clipsConfigAuthorsComponentBase = this;
                nwy nwyVar = clipsConfigAuthorsComponentBase.a;
                qcy<Object>[] qcyVarArr2 = ClipsConfigAuthorsComponentBase.f;
                qcy<Object> qcyVar = qcyVarArr2[0];
                boolean booleanValue = ((Boolean) nwyVar.c()).booleanValue();
                b25 s = authBridgeComponent.s();
                nwy nwyVar2 = clipsConfigAuthorsComponentBase.b;
                qcy<Object> qcyVar2 = qcyVarArr2[1];
                boolean booleanValue2 = ((Boolean) nwyVar2.c()).booleanValue();
                nwy nwyVar3 = clipsConfigAuthorsComponentBase.d;
                qcy<Object> qcyVar3 = qcyVarArr2[3];
                izs izsVar = (izs) nwyVar3.c();
                nwy nwyVar4 = clipsConfigAuthorsComponentBase.c;
                qcy<Object> qcyVar4 = qcyVarArr2[2];
                return new nhd(context, booleanValue, s, booleanValue2, izsVar, ((Boolean) nwyVar4.c()).booleanValue());
            }
        });
    }

    @Override // com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent
    public final mhd getExperiments() {
        qcy<Object> qcyVar = f[4];
        return (mhd) this.e.c();
    }
}
