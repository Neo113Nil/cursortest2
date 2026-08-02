package androidx.compose.ui.platform;

import B.AbstractC1030e;
import B.AbstractC1034i;
import B.InterfaceC1028c;
import B.v;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.lifecycle.InterfaceC2193s;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final v f17688a = AbstractC1034i.c(null, a.f17694d, 1, null);

    /* renamed from: b, reason: collision with root package name */
    public static final v f17689b = AbstractC1034i.d(b.f17695d);

    /* renamed from: c, reason: collision with root package name */
    public static final v f17690c = AbstractC1034i.d(c.f17696d);

    /* renamed from: d, reason: collision with root package name */
    public static final v f17691d = AbstractC1034i.d(d.f17697d);

    /* renamed from: e, reason: collision with root package name */
    public static final v f17692e = AbstractC1034i.d(e.f17698d);

    /* renamed from: f, reason: collision with root package name */
    public static final v f17693f = AbstractC1034i.d(C0351f.f17699d);

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f17694d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            f.c("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f17695d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            f.c("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f17696d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Y.a invoke() {
            f.c("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f17697d = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2193s invoke() {
            f.c("LocalLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f17698d = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final B2.g invoke() {
            f.c("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: androidx.compose.ui.platform.f$f, reason: collision with other inner class name */
    public static final class C0351f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0351f f17699d = new C0351f();

        public C0351f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            f.c("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    public static final void a(AndroidComposeView owner, Function2 content, InterfaceC1028c interfaceC1028c, int i10) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(content, "content");
        interfaceC1028c.a(1396852028);
        if (AbstractC1030e.c()) {
            AbstractC1030e.e(1396852028, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:80)");
        }
        owner.getContext();
        throw null;
    }

    public static final Void c(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
