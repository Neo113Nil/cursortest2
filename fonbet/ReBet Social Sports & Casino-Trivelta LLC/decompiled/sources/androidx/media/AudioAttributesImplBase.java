package androidx.media;

import com.plaid.internal.EnumC3631g;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f20458a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f20459b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f20460c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f20461d = -1;

    public int a() {
        return this.f20459b;
    }

    public int b() {
        int i10 = this.f20460c;
        int c10 = c();
        if (c10 == 6) {
            i10 |= 4;
        } else if (c10 == 7) {
            i10 |= 1;
        }
        return i10 & EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
    }

    public int c() {
        int i10 = this.f20461d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f20460c, this.f20458a);
    }

    public int d() {
        return this.f20458a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f20459b == audioAttributesImplBase.a() && this.f20460c == audioAttributesImplBase.b() && this.f20458a == audioAttributesImplBase.d() && this.f20461d == audioAttributesImplBase.f20461d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20459b), Integer.valueOf(this.f20460c), Integer.valueOf(this.f20458a), Integer.valueOf(this.f20461d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f20461d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f20461d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f20458a));
        sb2.append(" content=");
        sb2.append(this.f20459b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f20460c).toUpperCase());
        return sb2.toString();
    }
}
