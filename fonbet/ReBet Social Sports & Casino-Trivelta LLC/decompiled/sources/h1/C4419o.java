package h1;

import android.content.Context;
import android.net.Uri;
import com.twilio.voice.AudioFormat;
import com.twilio.voice.EventKeys;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import h1.C4420p;
import h1.InterfaceC4411g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: h1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4419o implements InterfaceC4411g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47573a;

    /* renamed from: b, reason: collision with root package name */
    public final List f47574b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4411g f47575c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4411g f47576d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4411g f47577e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC4411g f47578f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC4411g f47579g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC4411g f47580h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC4411g f47581i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC4411g f47582j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC4411g f47583k;

    /* renamed from: h1.o$a */
    public static final class a implements InterfaceC4411g.a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f47584a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC4411g.a f47585b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC4403F f47586c;

        public a(Context context) {
            this(context, new C4420p.b());
        }

        @Override // h1.InterfaceC4411g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4419o a() {
            C4419o c4419o = new C4419o(this.f47584a, this.f47585b.a());
            InterfaceC4403F interfaceC4403F = this.f47586c;
            if (interfaceC4403F != null) {
                c4419o.c(interfaceC4403F);
            }
            return c4419o;
        }

        public a(Context context, InterfaceC4411g.a aVar) {
            this.f47584a = context.getApplicationContext();
            this.f47585b = (InterfaceC4411g.a) AbstractC4134a.e(aVar);
        }
    }

    public C4419o(Context context, boolean z10) {
        this(context, null, AudioFormat.AUDIO_SAMPLE_RATE_8000, AudioFormat.AUDIO_SAMPLE_RATE_8000, z10);
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        AbstractC4134a.g(this.f47583k == null);
        String scheme = c4418n.f47554a.getScheme();
        if (Z.R0(c4418n.f47554a)) {
            String path = c4418n.f47554a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f47583k = s();
            } else {
                this.f47583k = p();
            }
        } else if ("asset".equals(scheme)) {
            this.f47583k = p();
        } else if ("content".equals(scheme)) {
            this.f47583k = q();
        } else if ("rtmp".equals(scheme)) {
            this.f47583k = u();
        } else if ("udp".equals(scheme)) {
            this.f47583k = v();
        } else if (EventKeys.DATA.equals(scheme)) {
            this.f47583k = r();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f47583k = t();
        } else {
            this.f47583k = this.f47575c;
        }
        return this.f47583k.b(c4418n);
    }

    @Override // h1.InterfaceC4411g
    public void c(InterfaceC4403F interfaceC4403F) {
        AbstractC4134a.e(interfaceC4403F);
        this.f47575c.c(interfaceC4403F);
        this.f47574b.add(interfaceC4403F);
        w(this.f47576d, interfaceC4403F);
        w(this.f47577e, interfaceC4403F);
        w(this.f47578f, interfaceC4403F);
        w(this.f47579g, interfaceC4403F);
        w(this.f47580h, interfaceC4403F);
        w(this.f47581i, interfaceC4403F);
        w(this.f47582j, interfaceC4403F);
    }

    @Override // h1.InterfaceC4411g
    public void close() {
        InterfaceC4411g interfaceC4411g = this.f47583k;
        if (interfaceC4411g != null) {
            try {
                interfaceC4411g.close();
            } finally {
                this.f47583k = null;
            }
        }
    }

    @Override // h1.InterfaceC4411g
    public Map f() {
        InterfaceC4411g interfaceC4411g = this.f47583k;
        return interfaceC4411g == null ? Collections.EMPTY_MAP : interfaceC4411g.f();
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        InterfaceC4411g interfaceC4411g = this.f47583k;
        if (interfaceC4411g == null) {
            return null;
        }
        return interfaceC4411g.getUri();
    }

    public final void o(InterfaceC4411g interfaceC4411g) {
        for (int i10 = 0; i10 < this.f47574b.size(); i10++) {
            interfaceC4411g.c((InterfaceC4403F) this.f47574b.get(i10));
        }
    }

    public final InterfaceC4411g p() {
        if (this.f47577e == null) {
            C4405a c4405a = new C4405a(this.f47573a);
            this.f47577e = c4405a;
            o(c4405a);
        }
        return this.f47577e;
    }

    public final InterfaceC4411g q() {
        if (this.f47578f == null) {
            C4408d c4408d = new C4408d(this.f47573a);
            this.f47578f = c4408d;
            o(c4408d);
        }
        return this.f47578f;
    }

    public final InterfaceC4411g r() {
        if (this.f47581i == null) {
            C4409e c4409e = new C4409e();
            this.f47581i = c4409e;
            o(c4409e);
        }
        return this.f47581i;
    }

    @Override // b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        return ((InterfaceC4411g) AbstractC4134a.e(this.f47583k)).read(bArr, i10, i11);
    }

    public final InterfaceC4411g s() {
        if (this.f47576d == null) {
            C4423s c4423s = new C4423s();
            this.f47576d = c4423s;
            o(c4423s);
        }
        return this.f47576d;
    }

    public final InterfaceC4411g t() {
        if (this.f47582j == null) {
            C4400C c4400c = new C4400C(this.f47573a);
            this.f47582j = c4400c;
            o(c4400c);
        }
        return this.f47582j;
    }

    public final InterfaceC4411g u() {
        if (this.f47579g == null) {
            try {
                InterfaceC4411g interfaceC4411g = (InterfaceC4411g) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f47579g = interfaceC4411g;
                o(interfaceC4411g);
            } catch (ClassNotFoundException unused) {
                AbstractC4156x.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f47579g == null) {
                this.f47579g = this.f47575c;
            }
        }
        return this.f47579g;
    }

    public final InterfaceC4411g v() {
        if (this.f47580h == null) {
            C4404G c4404g = new C4404G();
            this.f47580h = c4404g;
            o(c4404g);
        }
        return this.f47580h;
    }

    public final void w(InterfaceC4411g interfaceC4411g, InterfaceC4403F interfaceC4403F) {
        if (interfaceC4411g != null) {
            interfaceC4411g.c(interfaceC4403F);
        }
    }

    public C4419o(Context context, String str, int i10, int i11, boolean z10) {
        this(context, new C4420p.b().f(str).d(i10).e(i11).c(z10).a());
    }

    public C4419o(Context context, InterfaceC4411g interfaceC4411g) {
        this.f47573a = context.getApplicationContext();
        this.f47575c = (InterfaceC4411g) AbstractC4134a.e(interfaceC4411g);
        this.f47574b = new ArrayList();
    }
}
