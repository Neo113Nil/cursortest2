package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import kotlin.jvm.internal.Lambda;
import xsna.bvz;
import xsna.f5z;
import xsna.fwi;
import xsna.gzs;
import xsna.iyk0;
import xsna.izs;
import xsna.jmw;
import xsna.mvi;
import xsna.pqo;
import xsna.vag0;

/* compiled from: AndroidCompositionLocals.android.kt */
/* loaded from: classes11.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final pqo a = new pqo(a.i);
    public static final iyk0 b = new iyk0(b.i);
    public static final fwi c = new fwi(e.i);
    public static final iyk0 d = new iyk0(c.i);
    public static final iyk0 e = new iyk0(d.i);
    public static final iyk0 f = new iyk0(f.i);

    /* compiled from: AndroidCompositionLocals.android.kt */
    public static final class a extends Lambda implements gzs<Configuration> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.a("LocalConfiguration");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    public static final class b extends Lambda implements gzs<Context> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.a("LocalContext");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    public static final class c extends Lambda implements gzs<jmw> {
        public static final c i = new c(0);

        @Override // xsna.gzs
        public final jmw invoke() {
            AndroidCompositionLocals_androidKt.a("LocalImageVectorCache");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    public static final class d extends Lambda implements gzs<vag0> {
        public static final d i = new d(0);

        @Override // xsna.gzs
        public final vag0 invoke() {
            AndroidCompositionLocals_androidKt.a("LocalResourceIdCache");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    public static final class e extends Lambda implements izs<mvi, Resources> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final Resources invoke(mvi mviVar) {
            mvi mviVar2 = mviVar;
            mviVar2.y0(AndroidCompositionLocals_androidKt.a);
            return ((Context) mviVar2.y0(AndroidCompositionLocals_androidKt.b)).getResources();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    public static final class f extends Lambda implements gzs<View> {
        public static final f i = new f(0);

        @Override // xsna.gzs
        public final View invoke() {
            AndroidCompositionLocals_androidKt.a("LocalView");
            throw null;
        }
    }

    public static final void a(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final iyk0 b() {
        return b;
    }

    public static final iyk0 c() {
        return f;
    }

    public static final androidx.compose.runtime.e<f5z> getLocalLifecycleOwner() {
        return bvz.a;
    }
}
