package com.vk.profile.community.impl.ui.cover.redesign.delegate;

import com.vk.profile.community.impl.ui.cover.redesign.delegate.BaseCommunityLiveCoverItemDelegate;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c8h;
import xsna.izs;
import xsna.lch;
import xsna.pqs0;
import xsna.r8h;
import xsna.s3q0;
import xsna.x4i;
import xsna.y4i;

/* compiled from: CommunityLiveCoverVideoDelegate.kt */
/* loaded from: classes5.dex */
public final class b extends BaseCommunityLiveCoverItemDelegate<pqs0> {
    public pqs0 e;
    public c8h f;
    public r8h g;
    public y4i h;

    /* compiled from: CommunityLiveCoverVideoDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<BaseCommunityLiveCoverItemDelegate.ViewState, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(BaseCommunityLiveCoverItemDelegate.ViewState viewState) {
            ((b) this.receiver).b(viewState);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityLiveCoverVideoDelegate.kt */
    /* renamed from: com.vk.profile.community.impl.ui.cover.redesign.delegate.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1563b extends FunctionReferenceImpl implements izs<Float, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Float f) {
            ((b) this.receiver).c(f.floatValue());
            return s3q0.a;
        }
    }

    /* compiled from: CommunityLiveCoverVideoDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<BaseCommunityLiveCoverItemDelegate.ViewState, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(BaseCommunityLiveCoverItemDelegate.ViewState viewState) {
            ((b) this.receiver).b(viewState);
            return s3q0.a;
        }
    }

    /* compiled from: CommunityLiveCoverVideoDelegate.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Float, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Float f) {
            ((b) this.receiver).c(f.floatValue());
            return s3q0.a;
        }
    }

    public b() {
        throw null;
    }

    @Override // xsna.q8h
    public final void C(boolean z) {
        this.h.C(z);
    }

    @Override // xsna.q8h
    public final void a(Float f) {
        this.h.a(f);
    }

    public final y4i d() {
        r8h r8hVar = this.g;
        if (r8hVar.g) {
            return new x4i(this.a, this.e, r8hVar, this.f, new a(1, this, b.class, "setState", "setState(Lcom/vk/profile/community/impl/ui/cover/redesign/delegate/BaseCommunityLiveCoverItemDelegate$ViewState;)V", 0), new C1563b(1, this, b.class, "updateProgress", "updateProgress(F)V", 0));
        }
        return new lch(this.a, this.e, r8hVar, this.f, new c(1, this, b.class, "setState", "setState(Lcom/vk/profile/community/impl/ui/cover/redesign/delegate/BaseCommunityLiveCoverItemDelegate$ViewState;)V", 0), new d(1, this, b.class, "updateProgress", "updateProgress(F)V", 0));
    }

    public final void e() {
        this.h.play();
    }

    public final void f(boolean z) {
        this.h.g(z);
    }

    public final void g() {
        boolean z = this.g.g;
        if ((z && !(this.h instanceof x4i)) || (!z && !(this.h instanceof lch))) {
            this.h.g(true);
            this.h = d();
        } else {
            y4i y4iVar = this.h;
            y4iVar.e(this.e);
            y4iVar.b(this.g);
            y4iVar.f(this.f);
        }
    }

    @Override // xsna.q8h
    public final Float getCurrentProgress() {
        return this.h.getCurrentProgress();
    }

    @Override // xsna.q8h
    public final r8h getModel() {
        return this.g;
    }
}
