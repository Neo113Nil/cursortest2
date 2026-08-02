package t2;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Looper;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.trackselection.F;
import b1.z;
import e1.AbstractC4134a;
import e1.InterfaceC4141h;
import e1.InterfaceC4143j;
import h1.C4414j;
import h1.C4419o;
import java.util.concurrent.Executors;
import t2.C6423u0;
import t2.G0;
import t2.InterfaceC6383a;
import t2.InterfaceC6399i;

/* loaded from: classes.dex */
public final class r implements InterfaceC6383a.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f65496a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6399i.a f65497b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4143j f65498c;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4141h f65500e;

    /* renamed from: g, reason: collision with root package name */
    public final LogSessionId f65502g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC6383a.b f65503h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC6383a.b f65504i;

    /* renamed from: d, reason: collision with root package name */
    public final D.a f65499d = null;

    /* renamed from: f, reason: collision with root package name */
    public final F.a f65501f = null;

    public r(Context context, InterfaceC6399i.a aVar, InterfaceC4143j interfaceC4143j, LogSessionId logSessionId) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        this.f65496a = context.getApplicationContext();
        this.f65497b = aVar;
        this.f65498c = interfaceC4143j;
        BitmapFactory.Options options = null;
        this.f65502g = logSessionId;
        if (Build.VERSION.SDK_INT >= 26) {
            options = new BitmapFactory.Options();
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            options.inPreferredColorSpace = colorSpace;
        }
        this.f65500e = new C4414j(Ta.r.b(Executors.newSingleThreadExecutor()), new C4419o.a(context), options, 4096);
    }

    @Override // t2.InterfaceC6383a.b
    public InterfaceC6383a a(E e10, Looper looper, InterfaceC6383a.c cVar, InterfaceC6383a.C0908a c0908a) {
        b1.z zVar = e10.f65013a;
        if (!k1.i(this.f65496a, zVar) || ((z.h) AbstractC4134a.e(zVar.f24655b)).f24758j == -9223372036854775807L) {
            if (this.f65504i == null) {
                this.f65504i = new C6423u0.b(this.f65496a, this.f65497b, this.f65498c, this.f65499d, this.f65501f, this.f65502g);
            }
            return this.f65504i.a(e10, looper, cVar, c0908a);
        }
        if (this.f65503h == null) {
            this.f65503h = new G0.b(this.f65496a, this.f65500e);
        }
        return this.f65503h.a(e10, looper, cVar, c0908a);
    }
}
