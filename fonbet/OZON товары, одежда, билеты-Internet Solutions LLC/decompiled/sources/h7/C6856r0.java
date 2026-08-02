package h7;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbafq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbals;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbe;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbh;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbew;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbfc;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbfi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbfo;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbfx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbgi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbhr;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbij;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbja;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbjx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zblu;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbma;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbxd;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbzy;

/* renamed from: h7.r0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6856r0 extends zbub {
    private static final C6856r0 zbd;
    private I zbA;
    private C6821A zbB;
    private C6829d0 zbC;
    private C6868x0 zbD;
    private boolean zbI;
    private int zbL;
    private int zbM;
    private zbxd zbN;
    private boolean zbO;
    private boolean zbR;
    private C6849n0 zbS;
    private boolean zbT;
    private zbzy zbU;
    private zbzy zbV;
    private zbaf zbW;
    private zbbe zbX;
    private zbbh zbY;
    private zbfx zbZ;
    private zbfc zbaa;
    private zbfo zbab;
    private zbew zbac;
    private zbcf zbad;
    private zbfi zbae;
    private int zbaf;
    private boolean zbag;
    private int zbah;
    private boolean zbai;
    private zbma zbal;
    private boolean zban;
    private int zbe;
    private int zbf;
    private C6824b zbi;
    private zbgi zbl;
    private C6859t zbo;
    private zbhr zbr;
    private I0 zbs;
    private F zbt;
    private e1 zbu;
    private C6872z0 zbv;
    private B0 zbw;
    private zbaz zbx;
    private boolean zby;
    private zbjx zbz;
    private byte zbao = 2;
    private zbun zbg = zbuf.zby();
    private zbun zbh = zbuf.zby();
    private zbun zbj = zbuf.zby();
    private zbun zbk = zbuf.zby();
    private zbun zbm = zbuf.zby();
    private zbun zbn = zbuf.zby();
    private zbun zbp = zbuf.zby();
    private zbun zbq = zbuf.zby();
    private zbun zbE = zbuf.zby();
    private zbun zbF = zbuf.zby();
    private zbun zbG = zbuf.zby();
    private zbun zbH = zbuf.zby();
    private String zbJ = "";
    private int zbK = 1;
    private String zbP = "";
    private String zbQ = "";
    private String zbaj = "";
    private int zbak = 1;
    private String zbam = "";

    static {
        C6856r0 c6856r0 = new C6856r0();
        zbd = c6856r0;
        zbuf.zbD(C6856r0.class, c6856r0);
    }

    private C6856r0() {
    }

    public static C6851o0 a() {
        return (C6851o0) zbd.zbq();
    }

    static /* synthetic */ void c(C6856r0 c6856r0, zbbe zbbeVar) {
        zbbeVar.getClass();
        c6856r0.zbX = zbbeVar;
        c6856r0.zbe |= LinearLayoutManager.INVALID_OFFSET;
    }

    static /* synthetic */ void d(C6856r0 c6856r0, zbix zbixVar) {
        zbixVar.getClass();
        zbun zbunVar = c6856r0.zbh;
        if (!zbunVar.zbc()) {
            int size = zbunVar.size();
            c6856r0.zbh = zbunVar.zbd(size == 0 ? 10 : size + size);
        }
        c6856r0.zbh.add(zbixVar);
    }

    static /* synthetic */ void e(C6856r0 c6856r0, C6829d0 c6829d0) {
        c6829d0.getClass();
        c6856r0.zbC = c6829d0;
        c6856r0.zbe |= 16384;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbao);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbd, "\u0001<\u0000\u0002\u0001I<\u0000\f\u000b\u0001\u001b\u0002Л\u0003ဉ\u0001\u0005\u001b\u0006Л\u0007ဇ\u0010\bဉ\u000f\nဉ\u000b\u000bဉ\f\fဉ\r\u000fဉ\u001f\u0010ᐉ\u0002\u0013\u001b\u0014ᐉ\u0003\u0015\u001a\u0016ဉ!\u0017ဉ\u001a\u0018ဉ\u000e\u001aᐉ\u0004\u001b\u001b\u001cဉ\u0005\u001dဉ\u0006\u001eဉ \u001f\u001b ဈ\u0011!\u001a\"ဉ\"$ဇ\u001b%ᐉ\u0007&ᐉ\b'ဉ\u0015)ဉ\u001e*\u001b+ဉ#,ဉ$-᠌\u0014.ဇ\n/ဉ&1ဉ%3᠌'4ဇ\u00165ᐉ\u001c6င\u00127င\u00138ဈ\u00179ဈ\u0018<ဇ(=ဇ\u0019>ဉ\u0000?\u001b@᠌)Aᐉ\tBင,Cဉ-Dဈ+Eဇ*FЛGဈ.Hᐉ\u001dIဇ/", new Object[]{"zbe", "zbf", "zbg", zbix.class, "zbk", zbafq.class, "zbl", "zbm", zbij.class, "zbn", C6840j.class, "zbI", "zbD", "zbz", "zbA", "zbB", "zbX", "zbo", "zbp", zbja.class, "zbr", "zbE", "zbZ", "zbS", "zbC", "zbs", "zbj", b1.class, "zbt", "zbu", "zbY", "zbF", O0.class, "zbJ", "zbH", "zbaa", "zbT", "zbv", "zbw", "zbN", "zbW", "zbh", zbix.class, "zbab", "zbac", "zbM", C6822a.f65043a, "zby", "zbae", "zbad", "zbaf", C6855q0.f65048a, "zbO", "zbU", "zbK", "zbL", "zbP", "zbQ", "zbag", "zbR", "zbi", "zbq", zbals.class, "zbah", C6853p0.f65047a, "zbx", "zbak", "zbal", "zbaj", "zbai", "zbG", zblu.class, "zbam", "zbV", "zban"});
        }
        if (i12 == 3) {
            return new C6856r0();
        }
        if (i12 == 4) {
            return new C6851o0(r2);
        }
        if (i12 == 5) {
            return zbd;
        }
        this.zbao = obj != null ? (byte) 1 : (byte) 0;
        return null;
    }
}
