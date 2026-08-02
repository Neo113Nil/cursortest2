package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.zzdfo;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfb;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhge;
import com.google.android.gms.internal.ads.zzhgj;
import com.google.android.gms.internal.ads.zzhgo;
import com.google.android.gms.internal.ads.zzhgw;
import com.google.android.gms.internal.ads.zzhhf;
import com.google.android.gms.internal.ads.zzhhn;
import com.google.android.gms.internal.ads.zzhjc;
import com.google.android.gms.internal.ads.zzhjg;
import com.google.android.gms.internal.ads.zzhjh;
import com.google.android.gms.internal.ads.zzhji;
import com.google.android.gms.internal.ads.zzhjt;
import com.google.android.gms.internal.ads.zzhkn;
import com.google.android.gms.internal.ads.zzhlf;
import com.google.android.gms.internal.ads.zzhlk;
import com.google.android.gms.internal.ads.zzhll;
import com.google.android.gms.internal.ads.zzhlt;
import com.google.android.gms.internal.ads.zzhmo;
import com.google.android.gms.internal.ads.zzhmw;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhnz;
import com.google.android.gms.internal.ads.zzhop;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhpp;
import com.google.android.gms.internal.ads.zzhpw;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhpz;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzhrw;
import com.google.android.gms.internal.ads.zzhtn;
import com.google.android.gms.internal.ads.zzhtw;
import com.google.android.gms.internal.ads.zzhvi;
import com.google.android.gms.internal.ads.zzhvj;
import com.google.android.gms.internal.ads.zzhvm;
import com.google.android.gms.internal.ads.zzhvn;
import com.google.android.gms.internal.ads.zzhwo;
import com.google.android.gms.internal.ads.zzhzi;
import com.google.android.gms.internal.ads.zziao;
import com.google.android.gms.internal.ads.zziap;
import com.google.android.gms.internal.ads.zziau;
import com.google.android.gms.internal.ads.zzibc;
import com.google.android.gms.internal.ads.zzicg;
import com.google.android.gms.internal.ads.zzich;
import com.google.android.gms.internal.ads.zzicj;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzaiu;
import com.google.android.gms.internal.measurement.zzaiv;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.material.tabs.TabLayout;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class anf implements ky3, fon, zzci, zzdjm, zzhop, zzhnz, zzhmz, zzhmw, eqo, zzeb {
    public static final /* synthetic */ anf b = new anf(8);
    public static final /* synthetic */ anf c = new anf(10);
    public static final /* synthetic */ anf d = new anf(11);
    public static final /* synthetic */ anf e = new anf(12);
    public static final /* synthetic */ anf f = new anf(13);
    public static final /* synthetic */ anf g = new anf(14);
    public static final /* synthetic */ anf h = new anf(15);
    public static final /* synthetic */ anf i = new anf(16);
    public static final /* synthetic */ anf j = new anf(17);
    public static final /* synthetic */ anf k = new anf(18);
    public static final /* synthetic */ anf l = new anf(19);
    public static final /* synthetic */ anf m = new anf(20);
    public static final /* synthetic */ anf n = new anf(21);
    public static final /* synthetic */ anf o = new anf(22);
    public final /* synthetic */ int a;

    public /* synthetic */ anf(int i2) {
        this.a = i2;
    }

    public static RectF d(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.E || !(view instanceof lsi)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        lsi lsiVar = (lsi) view;
        int contentWidth = lsiVar.getContentWidth();
        int contentHeight = lsiVar.getContentHeight();
        int p = (int) vha.p(24, lsiVar.getContext());
        if (contentWidth < p) {
            contentWidth = p;
        }
        int right = (lsiVar.getRight() + lsiVar.getLeft()) / 2;
        int bottom = (lsiVar.getBottom() + lsiVar.getTop()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(right - i2, bottom - (contentHeight / 2), i2 + right, (right / 2) + bottom);
    }

    @Override // defpackage.eqo
    public boolean a(Class cls) {
        return false;
    }

    @Override // defpackage.eqo
    public lqo b(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // com.google.android.gms.internal.ads.zzhop
    public Object c(zzhfb zzhfbVar) {
        zzhes a = zzhfbVar.a();
        if (a instanceof zzhge) {
            return zzibc.a((zzhge) a);
        }
        if (a instanceof zzhgw) {
            zzhgw zzhgwVar = (zzhgw) a;
            zzicj zzicjVar = zzhgwVar.b;
            zzhfr zzhfrVar = zzhfr.a;
            return new zziap(zzicjVar.a.b(), zzhgwVar.c);
        }
        if (a instanceof zzhhf) {
            return zzhlt.a((zzhhf) a);
        }
        if (a instanceof zzhgo) {
            return zziao.a((zzhgo) a);
        }
        if (a instanceof zzhhn) {
            zzhhn zzhhnVar = (zzhhn) a;
            zzich zzichVar = zzhhnVar.c;
            zzicj zzicjVar2 = zzhhnVar.b;
            try {
                zzhkn.a();
                Cipher a2 = zzhkn.a();
                zzhfr zzhfrVar2 = zzhfr.a;
                return new zzhkn(zzicjVar2.a.b(), zzichVar.b(), a2.getProvider());
            } catch (GeneralSecurityException unused) {
                zzhfr zzhfrVar3 = zzhfr.a;
                return new zziau(zzicjVar2.a.b(), zzichVar.b());
            }
        }
        if (!(a instanceof zzhji)) {
            if (!(a instanceof zzhjc)) {
                throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(a.getClass())));
            }
            zzhjc zzhjcVar = (zzhjc) a;
            zzicj zzicjVar3 = zzhjcVar.b;
            zzhfr zzhfrVar4 = zzhfr.a;
            return new zzhlf(zzicjVar3.a.b(), zzhjcVar.c, zzhjcVar.a.b);
        }
        zzhji zzhjiVar = (zzhji) a;
        zzich zzichVar2 = zzhjiVar.c;
        zzicj zzicjVar4 = zzhjiVar.b;
        try {
            zzhkn.a();
            Cipher a3 = zzhkn.a();
            zzhfr zzhfrVar5 = zzhfr.a;
            return new zzhll(zzicjVar4.a.b(), zzichVar2.b(), a3.getProvider());
        } catch (GeneralSecurityException unused2) {
            zzhfr zzhfrVar6 = zzhfr.a;
            return new zzicg(zzicjVar4.a.b(), zzichVar2.b());
        }
    }

    public Type e(TypeVariable typeVariable, p5k p5kVar) {
        Type type = (Type) awf.g.get(new q5k(typeVariable));
        if (type != null) {
            return new cqa(p5kVar).G(type);
        }
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length != 0) {
            Type[] H = new cqa(p5kVar).H(bounds);
            if (!v6k.a || !Arrays.equals(bounds, H)) {
                return z6k.c(typeVariable.getGenericDeclaration(), typeVariable.getName(), H);
            }
        }
        return typeVariable;
    }

    @Override // com.google.android.gms.internal.ads.zzhnz
    public zzhfj f(zzhot zzhotVar) {
        jno jnoVar = zzhjt.a;
        zzhtw zzhtwVar = zzhotVar.b;
        if (!zzhtwVar.D().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            a70.p("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar.D())));
            return null;
        }
        try {
            zziei E = zzhtwVar.E();
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhrw F = zzhrw.F(E, zziew.c);
            if (F.E().F() != 0) {
                zzl.x("Only version 0 keys are accepted");
                return null;
            }
            zzhgj zzhgjVar = new zzhgj(0);
            zzhgjVar.a(F.D().E());
            zzhgjVar.b(F.E().E());
            zzhgjVar.c(F.D().D().D());
            zzhgjVar.d(F.E().D().E());
            zzhgjVar.e = zzhjt.c(F.E().D().D());
            zzhgjVar.f = zzhjt.b(zzhotVar.c);
            return zzhgjVar.e();
        } catch (zzige e2) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
        }
    }

    public void g(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        RectF d2 = d(tabLayout, view);
        RectF d3 = d(tabLayout, view2);
        drawable.setBounds(e80.c(f2, (int) d2.left, (int) d3.left), drawable.getBounds().top, e80.c(f2, (int) d2.right, (int) d3.right), drawable.getBounds().bottom);
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        zzhfm zzhfmVar;
        switch (this.a) {
            case 20:
                zzhjc zzhjcVar = (zzhjc) zzhesVar;
                jno jnoVar = zzhlk.a;
                zzhvi H = zzhvj.H();
                byte[] b2 = zzhjcVar.b.a.b();
                mpo B = zziei.B(0, b2.length, b2);
                H.n();
                ((zzhvj) H.b).J(B);
                zzhvm E = zzhvn.E();
                zzhjh zzhjhVar = zzhjcVar.a;
                int i2 = zzhjhVar.b;
                E.n();
                ((zzhvn) E.b).G(i2);
                zzhvn zzhvnVar = (zzhvn) E.o();
                H.n();
                ((zzhvj) H.b).I(zzhvnVar);
                zziei e2 = ((zzhvj) H.o()).e();
                zzhjg zzhjgVar = zzhjhVar.a;
                if (zzhjgVar == zzhjg.b) {
                    zzhfmVar = zzhfm.c;
                } else {
                    if (zzhjgVar != zzhjg.c) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhjgVar.a));
                    }
                    zzhfmVar = zzhfm.e;
                }
                return zzhos.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", e2, zzhfl.c, zzhfmVar, zzhjcVar.d);
            default:
                zzhwo zzhwoVar = (zzhwo) zzhesVar;
                return zzhos.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", zzhzi.c(zzhwoVar).e(), zzhfl.e, zzhzi.a(zzhwoVar.a.a), zzhwoVar.d);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public zzhes n(zzhos zzhosVar, zzhfr zzhfrVar) {
        zzhmo zzhmoVar = zzhqy.a;
        if (!zzhosVar.a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            a70.p("Wrong type URL in call to HmacProtoSerialization.parseKey");
            return null;
        }
        try {
            zziei zzieiVar = zzhosVar.c;
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhtn G = zzhtn.G(zzieiVar, zziew.c);
            if (G.D() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            int i3 = 0;
            zzhpw zzhpwVar = new zzhpw(i3);
            zzhpwVar.a(G.F().o());
            zzhpwVar.b(G.E().E());
            zzhpwVar.c = (zzhpx) zzhqy.a.c(G.E().D());
            zzhpwVar.d = zzhqy.b(zzhosVar.e);
            zzhpz c2 = zzhpwVar.c();
            zzhpp zzhppVar = new zzhpp(i3);
            zzhppVar.a = c2;
            zzhppVar.b = new zzicj(zzich.a(G.F().d()));
            zzhppVar.c = zzhosVar.f;
            return zzhppVar.a();
        } catch (zzige | IllegalArgumentException unused) {
            zzl.x("Parsing HmacKey failed");
            return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
                num.getClass();
                return bf3.k("CreationExtras.Key@", num, "<", duf.a.getOrCreateKotlinClass(Bundle.class).getSimpleName(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 8:
                List list = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().H());
            case 9:
            case 11:
            case 13:
            default:
                return new Boolean(((zzaiv) zzaiu.b.a.a).zza());
            case 10:
                List list2 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzA());
            case 12:
                List list3 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzJ());
            case 14:
                List list4 = zzfy.a;
                return zzags.b.get().E();
            case 15:
                List list5 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().j());
            case 16:
                List list6 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().L());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 11:
                ((zzdfo) obj).zzl();
                break;
            case 13:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
                break;
            case 25:
                break;
            default:
                break;
        }
    }
}
