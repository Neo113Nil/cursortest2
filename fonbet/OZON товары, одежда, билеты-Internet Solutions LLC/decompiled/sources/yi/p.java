package yi;

import C.I;
import C.K;
import Sc.r;
import Sc.s;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;
import xe.C10737n;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.data.CameraStateProviderImpl$takePhoto$2", f = "CameraStateProvider.kt", l = {543}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class p extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Uri>, Object> {

    /* renamed from: d, reason: collision with root package name */
    File f106743d;

    /* renamed from: e, reason: collision with root package name */
    Object f106744e;

    /* renamed from: f, reason: collision with root package name */
    int f106745f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ k f106746g;

    public static final class a implements I.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f106747a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C10737n f106748b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f106749c;

        /* renamed from: yi.p$a$a, reason: collision with other inner class name */
        static final class C2308a extends AbstractC7737t implements Function1<Throwable, Unit> {

            /* renamed from: b, reason: collision with root package name */
            public static final C2308a f106750b = new C2308a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Throwable th2) {
                Throwable it = th2;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.data.CameraStateProviderImpl$takePhoto$2$1$1$1$onImageSaved$1", f = "CameraStateProvider.kt", l = {282}, m = "invokeSuspend")
        static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f106751d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C10737n f106752e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ k f106753f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ File f106754g;

            /* renamed from: yi.p$a$b$a, reason: collision with other inner class name */
            static final class C2309a extends AbstractC7737t implements Function1<Throwable, Unit> {

                /* renamed from: b, reason: collision with root package name */
                public static final C2309a f106755b = new C2309a(1);

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Throwable th2) {
                    Throwable it = th2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C10737n c10737n, k kVar, File file, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f106752e = c10737n;
                this.f106753f = kVar;
                this.f106754g = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f106752e, this.f106753f, this.f106754g, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object a11;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f106751d;
                k kVar = this.f106753f;
                try {
                    if (i11 == 0) {
                        s.b(obj);
                        File file = this.f106754g;
                        r.Companion companion = r.INSTANCE;
                        Context context = kVar.f106697a;
                        this.f106751d = 1;
                        obj = Fi.c.d(context, file, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    a11 = (Uri) obj;
                    r.Companion companion2 = r.INSTANCE;
                } catch (CancellationException e11) {
                    throw e11;
                } catch (Throwable th2) {
                    r.Companion companion3 = r.INSTANCE;
                    a11 = s.a(th2);
                }
                Throwable b11 = r.b(a11);
                if (b11 != null) {
                    k.A(kVar, b11, "takePhoto scanFileToMediaStore exception");
                    a11 = null;
                }
                Uri uri = (Uri) a11;
                C10737n c10737n = this.f106752e;
                if (c10737n.isActive()) {
                    c10737n.u(uri, C2309a.f106755b);
                }
                return Unit.f71690a;
            }
        }

        a(k kVar, C10737n c10737n, File file) {
            this.f106747a = kVar;
            this.f106748b = c10737n;
            this.f106749c = file;
        }

        @Override // C.I.f
        public final void onError(K e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            k.A(this.f106747a, e11, "takePhoto exception");
            this.f106749c.delete();
            C10737n c10737n = this.f106748b;
            if (c10737n.isActive()) {
                c10737n.u(null, C2308a.f106750b);
            }
        }

        @Override // C.I.f
        public final void onImageSaved(I.h results) {
            M m11;
            xe.I i11;
            Intrinsics.checkNotNullParameter(results, "results");
            k kVar = this.f106747a;
            m11 = kVar.f106702f;
            if (m11 != null) {
                i11 = kVar.f106699c;
                C10727i.c(m11, i11, null, new b(this.f106748b, kVar, this.f106749c, null), 2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(k kVar, kotlin.coroutines.d<? super p> dVar) {
        super(2, dVar);
        this.f106746g = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new p(this.f106746g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Uri> dVar) {
        return ((p) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        I i11;
        String str;
        File file;
        Object a11;
        Throwable b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f106745f;
        k kVar = this.f106746g;
        try {
            if (i12 == 0) {
                s.b(obj);
                i11 = kVar.f106704h;
                if (i11 == null) {
                    return null;
                }
                str = kVar.f106698b;
                File a12 = Fi.c.a(str);
                try {
                    r.Companion companion = r.INSTANCE;
                    this.f106743d = a12;
                    this.f106744e = this;
                    this.f106745f = 1;
                    C10737n c10737n = new C10737n(1, Wc.b.b(this));
                    c10737n.o();
                    i11.e0(new I.g.a(a12).a(), androidx.core.content.a.getMainExecutor(kVar.f106697a), new a(kVar, c10737n, a12));
                    obj = c10737n.n();
                    if (obj == aVar) {
                        Intrinsics.checkNotNullParameter(this, "frame");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                    file = a12;
                } catch (Throwable th2) {
                    th = th2;
                    file = a12;
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th);
                    b11 = r.b(a11);
                    if (b11 == null) {
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = this.f106743d;
                try {
                    s.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    r.Companion companion22 = r.INSTANCE;
                    a11 = s.a(th);
                    b11 = r.b(a11);
                    if (b11 == null) {
                    }
                }
            }
            a11 = (Uri) obj;
            r.Companion companion3 = r.INSTANCE;
            b11 = r.b(a11);
            if (b11 == null) {
                return a11;
            }
            k.A(kVar, b11, "takePhoto exception");
            file.delete();
            return null;
        } catch (CancellationException e11) {
            throw e11;
        }
    }
}
