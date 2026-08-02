package com.vk.core.ui.image;

import android.content.Context;
import android.view.View;
import com.vk.core.ui.image.VKImageController;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;
import xsna.lgr0;
import xsna.msy;
import xsna.tcr0;

/* compiled from: VKBaseAvatarController.kt */
/* loaded from: classes17.dex */
public abstract class b<V extends View> implements com.vk.core.ui.image.a<V> {
    public final Context a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new a(0, this, b.class, "initImageView", "initImageView()Landroid/view/View;", 0));

    /* compiled from: VKBaseAvatarController.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<V> {
        @Override // xsna.gzs
        public final Object invoke() {
            return ((b) this.receiver).k();
        }
    }

    public b(Context context) {
        this.a = context;
    }

    @Override // com.vk.core.ui.image.VKImageController
    public final void clear() {
        ((lgr0) this).a(null, VKImageController.b.q);
    }

    @Override // com.vk.core.ui.image.VKImageController
    public void d(String str, VKImageController.b bVar, tcr0 tcr0Var) {
        ((lgr0) this).f(str, bVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.ui.image.VKImageController
    public final V getView() {
        return (V) this.b.getValue();
    }

    @Override // com.vk.core.ui.image.a
    public void h(long j, String str, VKImageController.b bVar) {
        ((lgr0) this).f(str, bVar);
    }

    public abstract V k();

    @Override // com.vk.core.ui.image.a
    public void b(int i) {
    }

    @Override // com.vk.core.ui.image.a
    public void c(boolean z) {
    }

    @Override // com.vk.core.ui.image.a
    public void e(int i) {
    }

    @Override // com.vk.core.ui.image.a
    public void g(int i) {
    }

    @Override // com.vk.core.ui.image.a
    public void i(int i) {
    }

    @Override // com.vk.core.ui.image.a
    public void setAvatarSize(int i) {
    }
}
