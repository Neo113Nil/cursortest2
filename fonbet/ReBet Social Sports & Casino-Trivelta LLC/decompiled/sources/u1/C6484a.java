package u1;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.exoplayer.q;
import b1.AbstractC2335D;
import b1.C2338G;
import e1.AbstractC4134a;
import e1.Z;
import h1.AbstractC4407c;
import java.io.IOException;
import java.nio.ByteBuffer;
import k1.f;
import k1.h;
import u1.InterfaceC6485b;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6484a extends h implements InterfaceC6485b {

    /* renamed from: m, reason: collision with root package name */
    public final Context f65926m;

    /* renamed from: n, reason: collision with root package name */
    public final int f65927n;

    /* renamed from: u1.a$a, reason: collision with other inner class name */
    public class C0917a extends d {
        public C0917a() {
        }

        @Override // k1.g
        public void o() {
            C6484a.this.t(this);
        }
    }

    /* renamed from: u1.a$b */
    public interface b {
    }

    /* renamed from: u1.a$c */
    public static final class c implements InterfaceC6485b.a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f65929a;

        /* renamed from: b, reason: collision with root package name */
        public int f65930b;

        public c(Context context) {
            this(context, null);
        }

        @Override // u1.InterfaceC6485b.a
        public int a(androidx.media3.common.a aVar) {
            String str = aVar.f20543o;
            return (str == null || !AbstractC2335D.q(str)) ? q.r(0) : Z.M0(aVar.f20543o) ? q.r(4) : q.r(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // u1.InterfaceC6485b.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C6484a b() {
            return new C6484a(this.f65929a, null, this.f65930b, 0 == true ? 1 : 0);
        }

        public c(Context context, b bVar) {
            this.f65929a = context;
            this.f65930b = -1;
        }
    }

    public /* synthetic */ C6484a(Context context, b bVar, int i10, C0917a c0917a) {
        this(context, bVar, i10);
    }

    @Override // k1.h
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C6486c l(f fVar, d dVar, boolean z10) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC4134a.e(fVar.f54108d);
        AbstractC4134a.g(byteBuffer.hasArray());
        AbstractC4134a.a(byteBuffer.arrayOffset() == 0);
        try {
            int i10 = this.f65927n;
            if (i10 == -1) {
                Context context = this.f65926m;
                if (context != null) {
                    Point Y10 = Z.Y(context);
                    int i11 = Y10.x;
                    int i12 = Y10.y;
                    androidx.media3.common.a aVar = fVar.f54106b;
                    if (aVar != null) {
                        int i13 = aVar.f20525M;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                        int i14 = aVar.f20526N;
                        if (i14 != -1) {
                            i12 *= i14;
                        }
                    }
                    i10 = (Math.max(i11, i12) * 2) - 1;
                } else {
                    i10 = 4096;
                }
            }
            dVar.f65931e = AbstractC4407c.a(byteBuffer.array(), byteBuffer.remaining(), null, i10);
            dVar.f54116b = fVar.f54110f;
            return null;
        } catch (C2338G e10) {
            return new C6486c("Could not decode image data with BitmapFactory.", e10);
        } catch (IOException e11) {
            return new C6486c(e11);
        }
    }

    @Override // k1.h, k1.d
    public /* bridge */ /* synthetic */ d a() {
        return (d) super.a();
    }

    @Override // k1.h
    public f i() {
        return new f(1);
    }

    @Override // k1.h
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public d j() {
        return new C0917a();
    }

    @Override // k1.h
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C6486c k(Throwable th2) {
        return new C6486c("Unexpected decode error", th2);
    }

    public C6484a(Context context, b bVar, int i10) {
        super(new f[1], new d[1]);
        this.f65926m = context;
        this.f65927n = i10;
    }
}
