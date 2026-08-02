package com.vk.clips.coauthors.di.stub;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectorInputParams;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.single.a0;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hmd;
import xsna.hpf0;
import xsna.jmd;
import xsna.jnd;
import xsna.nwy;
import xsna.qcy;
import xsna.rdi;
import xsna.re0;
import xsna.se0;
import xsna.syf;
import xsna.uh3;
import xsna.x5;

/* compiled from: ClipsCoauthorsComponentStub.kt */
/* loaded from: classes16.dex */
public final class ClipsCoauthorsComponentStub implements ClipsCoauthorsComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new x5(8));
    public final nwy b = new nwy(new re0(6));
    public final nwy c = new nwy(new se0(12));

    /* compiled from: ClipsCoauthorsComponentStub.kt */
    public static final class a implements hmd {
        @Override // xsna.hmd
        public final x<ClipVideoFile> a(UserId userId, ClipVideoFile clipVideoFile) {
            a0 a0Var = a0.b;
            rdi.F(a0Var);
            return a0Var;
        }
    }

    /* compiled from: ClipsCoauthorsComponentStub.kt */
    public static final class b implements jmd {
        @Override // xsna.jmd
        public final void a(Context context, ClipVideoFile clipVideoFile) {
            rdi.E();
        }

        @Override // xsna.jmd
        public final void b(Context context, ClipsCoauthorsSelectorInputParams clipsCoauthorsSelectorInputParams, FragmentManager fragmentManager) {
            rdi.E();
        }

        @Override // xsna.jmd
        public final void c(Activity activity, ClipVideoFile clipVideoFile, UserId userId) {
            rdi.E();
        }

        @Override // xsna.jmd
        public final void d(Context context, ClipVideoFile clipVideoFile, boolean z, syf syfVar) {
            rdi.E();
        }
    }

    /* compiled from: ClipsCoauthorsComponentStub.kt */
    public static final class c implements jnd {
        @Override // xsna.jnd
        public final q a(Integer num, List list) {
            g0 g0Var = g0.b;
            rdi.F(g0Var);
            return g0Var;
        }

        @Override // xsna.jnd
        public final void b(jnd.a aVar, uh3 uh3Var) {
            rdi.E();
        }

        @Override // xsna.jnd
        public final void c() {
            rdi.E();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsCoauthorsComponentStub.class, "launcher", "getLauncher()Lcom/vk/clips/coauthors/di/ClipsCoauthorsLauncher;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, ClipsCoauthorsComponentStub.class, "interactor", "getInteractor()Lcom/vk/clips/coauthors/di/ClipsCoauthorsInteractor;", hpf0Var), ep.a(0, ClipsCoauthorsComponentStub.class, "uiProvider", "getUiProvider()Lcom/vk/clips/coauthors/di/ClipsCoauthorsUiProvider;", hpf0Var)};
    }

    @Override // com.vk.clips.coauthors.di.ClipsCoauthorsComponent
    public final jnd Fc() {
        qcy<Object> qcyVar = d[2];
        return (jnd) this.c.c();
    }

    @Override // com.vk.clips.coauthors.di.ClipsCoauthorsComponent
    public final hmd b() {
        qcy<Object> qcyVar = d[1];
        return (hmd) this.b.c();
    }

    @Override // com.vk.clips.coauthors.di.ClipsCoauthorsComponent
    public final jmd e() {
        qcy<Object> qcyVar = d[0];
        return (jmd) this.a.c();
    }
}
