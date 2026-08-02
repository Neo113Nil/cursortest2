package com.vk.im.reactions.impl.assets;

import android.content.Context;
import android.view.View;
import com.vk.im.reactions.impl.assets.ReactionAssetDrawable.b;
import com.vk.media.qrcode.core.ui.SvgDrawable;
import com.vk.rlottie.RLottieDrawable;
import io.reactivex.rxjava3.functions.n;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.lang.ref.WeakReference;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asu0;
import xsna.ba40;
import xsna.fsq;
import xsna.gzs;
import xsna.izs;
import xsna.m1r;
import xsna.o7y;
import xsna.s26;
import xsna.s3q0;
import xsna.skz;
import xsna.wze0;
import xsna.zaw;
import xsna.zze0;

/* compiled from: ReactionAssetDrawableLoader.kt */
/* loaded from: classes2.dex */
public final class a {
    public final zaw a;

    /* compiled from: ReactionAssetDrawableLoader.kt */
    /* renamed from: com.vk.im.reactions.impl.assets.a$a, reason: collision with other inner class name */
    public static final class C1134a {
        public final RLottieDrawable a;
        public final RLottieDrawable b;
        public final SvgDrawable c;

        public C1134a() {
            this(null, null, null);
        }

        public C1134a(RLottieDrawable rLottieDrawable, RLottieDrawable rLottieDrawable2, SvgDrawable svgDrawable) {
            this.a = rLottieDrawable;
            this.b = rLottieDrawable2;
            this.c = svgDrawable;
        }
    }

    /* compiled from: ReactionAssetDrawableLoader.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* compiled from: ReactionAssetDrawableLoader.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public a(zaw zawVar) {
        this.a = zawVar;
    }

    public static ReactionAssetDrawable b(a aVar, Context context, int i, int i2, s26 s26Var, io.reactivex.rxjava3.disposables.b bVar, boolean z, int i3) {
        Object obj = null;
        if ((i3 & 8) != 0) {
            s26Var = null;
        }
        if ((i3 & 32) != 0) {
            z = false;
        }
        if (!z) {
            return aVar.c(context, i, i2, s26Var, bVar);
        }
        aVar.getClass();
        ReactionAssetDrawable reactionAssetDrawable = new ReactionAssetDrawable(i2, i2);
        try {
            SvgDrawable b2 = aVar.a.b(context, true, i, i2);
            reactionAssetDrawable.b.d = null;
            reactionAssetDrawable.c = null;
            reactionAssetDrawable.d = b2;
            b2.setBounds(reactionAssetDrawable.getBounds());
            RLottieDrawable rLottieDrawable = reactionAssetDrawable.c;
            if (rLottieDrawable != null) {
                rLottieDrawable.setBounds(reactionAssetDrawable.getBounds());
                rLottieDrawable.setCallback(reactionAssetDrawable.new b());
                WeakReference<View> weakReference = reactionAssetDrawable.e;
                rLottieDrawable.b(weakReference != null ? weakReference.get() : null);
            }
            reactionAssetDrawable.invalidateSelf();
            reactionAssetDrawable.b();
            if (s26Var != null) {
                s26Var.invoke();
                obj = s3q0.a;
            }
        } catch (Throwable th) {
            obj = new Result.Failure(th);
        }
        return Result.a(obj) != null ? aVar.c(context, i, i2, s26Var, bVar) : reactionAssetDrawable;
    }

    public final ReactionAssetDrawable a(View view, final int i, final int i2, io.reactivex.rxjava3.disposables.b bVar) {
        ReactionAssetDrawable reactionAssetDrawable = new ReactionAssetDrawable(i2, i2);
        reactionAssetDrawable.e = new WeakReference<>(view);
        reactionAssetDrawable.b.e = new WeakReference<>(view);
        final Context context = view.getContext();
        final zaw zawVar = this.a;
        io.reactivex.rxjava3.internal.operators.single.c cVar = new io.reactivex.rxjava3.internal.operators.single.c(new n(context, i, i2, this) { // from class: xsna.xze0
            public final /* synthetic */ Context c;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;

            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                zaw zawVar2 = zaw.this;
                Context context2 = this.c;
                int i3 = this.d;
                int i4 = this.e;
                RLottieDrawable e = zawVar2.e(context2, false, i3, i4);
                return e != null ? new io.reactivex.rxjava3.internal.operators.single.v(new e1e(e, 2)) : new io.reactivex.rxjava3.internal.operators.single.v(new zze0(zawVar2, context2, i3, i4));
            }
        });
        asu0 asu0Var = asu0.a;
        bVar.b(cVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new fsq(new ba40(reactionAssetDrawable, 18), 24), new m1r(new b(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 20)));
        return reactionAssetDrawable;
    }

    public final ReactionAssetDrawable c(Context context, int i, int i2, gzs<s3q0> gzsVar, io.reactivex.rxjava3.disposables.b bVar) {
        ReactionAssetDrawable reactionAssetDrawable = new ReactionAssetDrawable(i2, i2);
        v vVar = new v(new zze0(this.a, context, i, i2));
        asu0 asu0Var = asu0.a;
        bVar.b(vVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new skz(new wze0(0, reactionAssetDrawable, gzsVar), 21), new o7y(new c(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 13)));
        return reactionAssetDrawable;
    }
}
