package defpackage;

import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzck;
import com.google.android.gms.internal.ads.zzri;
import com.google.android.gms.internal.ads.zzv;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j0a {
    public final int a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public j0a(zzv zzvVar, zzv zzvVar2, int i, int i2, zzri zzriVar, zzck zzckVar, zzbf zzbfVar, Object obj) {
        this.c = zzvVar;
        this.d = zzvVar2;
        this.a = i;
        this.b = i2;
        this.e = zzriVar;
        this.f = zzckVar;
        this.g = zzbfVar;
        this.h = obj;
    }

    public i0a a() {
        String str = (String) this.e;
        i0a bfiVar = ((wei) this.h) != null ? new bfi((wei) this.h) : (str == null || !(str.startsWith("$JS.ACK.") || str.startsWith("$JS.FC."))) ? new i0a((byte[]) this.f) : new c5d((byte[]) this.f);
        bfiVar.e = (String) this.c;
        bfiVar.a = (String) this.d;
        bfiVar.b = str;
        bfiVar.d = (p89) this.g;
        int i = this.b;
        bfiVar.i = i;
        bfiVar.h = this.a + i + bfiVar.j + 4;
        return bfiVar;
    }

    public /* synthetic */ j0a b(zzri zzriVar) {
        return new j0a((zzv) this.c, (zzv) this.d, this.a, this.b, zzriVar, (zzck) this.f, (zzbf) this.g, this.h);
    }

    public /* synthetic */ boolean c() {
        return Objects.equals(((zzv) this.c).o, MimeTypes.AUDIO_RAW);
    }

    public j0a(String str, String str2, String str3, int i) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.a = i;
    }
}
