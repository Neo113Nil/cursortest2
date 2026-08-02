package com.vk.resetcounters.api.di;

import android.content.Context;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.navigation.NavigationDelegateActivity;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.disposables.f;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.daz;
import xsna.fp;
import xsna.fpf0;
import xsna.g9g0;
import xsna.gzs;
import xsna.j58;
import xsna.j9g0;
import xsna.jo60;
import xsna.nwy;
import xsna.qcy;
import xsna.s3q0;

/* compiled from: ResetCountersComponent.kt */
/* loaded from: classes5.dex */
public final class ResetCountersComponent$Companion$STUB$1 implements ResetCountersComponent {
    public static final /* synthetic */ qcy<Object>[] b = {new PropertyReference1Impl(ResetCountersComponent$Companion$STUB$1.class, "interactor", "getInteractor()Lcom/vk/resetcounters/api/di/ResetCountersInteractor;", 0), fp.c(0, ResetCountersComponent$Companion$STUB$1.class, "repository", "getRepository()Lcom/vk/resetcounters/api/di/ResetCountersRepository;", fpf0.a)};
    public final nwy a = new nwy(new daz(12));

    public ResetCountersComponent$Companion$STUB$1() {
        new nwy(new jo60(5));
    }

    @Override // com.vk.resetcounters.api.di.ResetCountersComponent
    public final g9g0 b() {
        qcy<Object> qcyVar = b[0];
        return (g9g0) this.a.c();
    }

    /* compiled from: ResetCountersComponent.kt */
    public static final class a implements g9g0 {
        @Override // xsna.g9g0
        public final boolean b() {
            return false;
        }

        @Override // xsna.g9g0
        public final void c() {
        }

        @Override // xsna.g9g0
        public final void d() {
        }

        @Override // xsna.g9g0
        public final void f(Context context) {
        }

        @Override // xsna.g9g0
        public final void e(NavigationDelegateActivity navigationDelegateActivity, j58 j58Var) {
        }

        @Override // xsna.g9g0
        public final void a(Context context, int i, String str, FolderType folderType) {
        }
    }

    /* compiled from: ResetCountersComponent.kt */
    public static final class b implements j9g0 {
        @Override // xsna.j9g0
        public final c a(int i, Integer num, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
            return new f(io.reactivex.rxjava3.internal.functions.a.b);
        }

        @Override // xsna.j9g0
        public final void b() {
        }
    }
}
