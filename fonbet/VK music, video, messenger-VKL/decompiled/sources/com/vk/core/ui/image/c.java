package com.vk.core.ui.image;

import android.content.Context;
import android.view.View;
import com.vk.core.ui.image.VKImageController;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;
import xsna.msy;
import xsna.tcr0;

/* compiled from: VKBaseImageController.kt */
/* loaded from: classes17.dex */
public abstract class c<V extends View> implements VKImageController<V> {
    public final Context a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new a(0, this, c.class, "initImageView", "initImageView()Landroid/view/View;", 0));

    /* compiled from: VKBaseImageController.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<V> {
        @Override // xsna.gzs
        public final Object invoke() {
            return ((c) this.receiver).k();
        }
    }

    public c(Context context) {
        this.a = context;
    }

    @Override // com.vk.core.ui.image.VKImageController
    public final void clear() {
        a(null, VKImageController.b.q);
    }

    @Override // com.vk.core.ui.image.VKImageController
    public void d(String str, VKImageController.b bVar, tcr0 tcr0Var) {
        f(str, bVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.ui.image.VKImageController
    public final V getView() {
        return (V) this.b.getValue();
    }

    public abstract V k();
}
