package g4;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import c4.p;
import com.google.firebase.messaging.u;
import d4.l;
import d4.r;
import d4.x;
import eg.c0;
import eg.m0;
import java.nio.ByteBuffer;
import jg.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Ref;
import okio.BufferedSource;
import q4.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final r f9751a;

    /* renamed from: b, reason: collision with root package name */
    public final n f9752b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9753c;

    public e(r rVar, n nVar, boolean z5) {
        this.f9751a = rVar;
        this.f9752b = nVar;
        this.f9753c = z5;
    }

    public static Drawable b(e eVar, Ref.BooleanRef booleanRef) {
        r z5 = com.google.android.play.core.appupdate.b.z(eVar.f9751a, eVar.f9753c);
        try {
            ImageDecoder.Source m6 = u.m(z5, eVar.f9752b, true);
            if (m6 == null) {
                BufferedSource m02 = z5.m0();
                try {
                    m02.request(LongCompanionObject.MAX_VALUE);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) m02.getBuffer().size());
                    while (!m02.getBuffer().exhausted()) {
                        m02.getBuffer().read(allocateDirect);
                    }
                    allocateDirect.flip();
                    m02.close();
                    m6 = ImageDecoder.createSource(allocateDirect);
                } finally {
                }
            }
            Drawable decodeDrawable = ImageDecoder.decodeDrawable(m6, new x(eVar, booleanRef, 1));
            u6.h.g(z5, null);
            return decodeDrawable;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // d4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        b bVar;
        Object obj;
        Object obj2;
        int i5;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f9743d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f9743d = i10 - Integer.MIN_VALUE;
                obj = bVar.f9741b;
                obj2 = lf.a.f20034a;
                i5 = bVar.f9743d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                    a2.l lVar = new a2.l(5, this, booleanRef3);
                    bVar.f9740a = booleanRef3;
                    bVar.f9743d = 1;
                    Object x10 = c0.x(lVar, bVar);
                    if (x10 != obj2) {
                        booleanRef = booleanRef3;
                        obj = x10;
                    }
                    return obj2;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef2 = bVar.f9740a;
                    h8.b.B(obj);
                    return new d4.i(p.c((Drawable) obj), booleanRef2.element);
                }
                booleanRef = bVar.f9740a;
                h8.b.B(obj);
                bVar.f9740a = booleanRef;
                bVar.f9743d = 2;
                obj = c((Drawable) obj, bVar);
                if (obj != obj2) {
                    booleanRef2 = booleanRef;
                    return new d4.i(p.c((Drawable) obj), booleanRef2.element);
                }
                return obj2;
            }
        }
        bVar = new b(this, (mf.c) continuation);
        obj = bVar.f9741b;
        obj2 = lf.a.f20034a;
        i5 = bVar.f9743d;
        if (i5 != 0) {
        }
        bVar.f9740a = booleanRef;
        bVar.f9743d = 2;
        obj = c((Drawable) obj, bVar);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Drawable drawable, mf.c cVar) {
        c cVar2;
        int i5;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f9747d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f9747d = i10 - Integer.MIN_VALUE;
                Object obj = cVar2.f9745b;
                lf.a aVar = lf.a.f20034a;
                i5 = cVar2.f9747d;
                n nVar = this.f9752b;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (!(drawable instanceof AnimatedImageDrawable)) {
                        return drawable;
                    }
                    c4.k kVar = i.f9766a;
                    if (((Number) p.f(nVar, kVar)).intValue() != -2) {
                        ((AnimatedImageDrawable) drawable).setRepeatCount(((Number) p.f(nVar, kVar)).intValue());
                    }
                    Function0 function0 = (Function0) p.f(nVar, i.f9768c);
                    Function0 function02 = (Function0) p.f(nVar, i.f9769d);
                    if (function0 != null || function02 != null) {
                        lg.e eVar = m0.f9201a;
                        fg.e eVar2 = q.f18523a.f9624e;
                        d dVar = new d(drawable, function0, function02, null);
                        cVar2.f9744a = drawable;
                        cVar2.f9747d = 1;
                        if (c0.A(eVar2, dVar, cVar2) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    drawable = (Drawable) cVar2.f9744a;
                    h8.b.B(obj);
                }
                return new r4.h(drawable, nVar.f22009c);
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f9745b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = cVar2.f9747d;
        n nVar2 = this.f9752b;
        if (i5 != 0) {
        }
        return new r4.h(drawable, nVar2.f22009c);
    }
}
