package defpackage;

import com.google.android.gms.internal.fido.zzbm;
import com.google.android.gms.internal.fido.zzbo;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgh;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4427z5;
import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class lco extends zzgf {
    public final mbo b;
    public final Character c;
    public volatile zzgf d;

    public lco(mbo mboVar, Character ch) {
        this.b = mboVar;
        if (ch != null) {
            byte[] bArr = mboVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                a70.p(zzbo.a("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.c = ch;
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zzbm.b(0, i, bArr.length);
        while (i2 < i) {
            mbo mboVar = this.b;
            e(i2, Math.min(mboVar.f, i - i2), sb, bArr);
            i2 += mboVar.f;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    public final int b(int i) {
        mbo mboVar = this.b;
        int i2 = mboVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        return mboVar.e * zzgh.a(i, i2);
    }

    public zzgf d(mbo mboVar, Character ch) {
        return new lco(mboVar, ch);
    }

    public final void e(int i, int i2, StringBuilder sb, byte[] bArr) {
        zzbm.b(i, i + i2, bArr.length);
        mbo mboVar = this.b;
        int i3 = mboVar.f;
        int i4 = mboVar.d;
        if (i2 > i3) {
            ilg.c();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8;
        }
        int i7 = (i2 + 1) * 8;
        while (i5 < i2 * 8) {
            sb.append(mboVar.b[((int) (j >>> ((i7 - i4) - i5))) & mboVar.c]);
            i5 += i4;
        }
        if (this.c != null) {
            while (i5 < mboVar.f * 8) {
                sb.append(C4427z5.U);
                i5 += i4;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lco) {
            lco lcoVar = (lco) obj;
            if (this.b.equals(lcoVar.b) && Objects.equals(this.c, lcoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.c) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        mbo mboVar = this.b;
        sb.append(mboVar);
        if (8 % mboVar.d != 0) {
            Character ch = this.c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public lco(String str, String str2) {
        this(new mbo(str, str2.toCharArray()), Character.valueOf(C4427z5.U));
    }
}
