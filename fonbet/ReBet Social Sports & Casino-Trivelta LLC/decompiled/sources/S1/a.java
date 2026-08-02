package S1;

import androidx.media3.common.a;
import b1.C2334C;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements C2334C.a {

    /* renamed from: f, reason: collision with root package name */
    public static final androidx.media3.common.a f10534f = new a.b().y0("application/id3").P();

    /* renamed from: g, reason: collision with root package name */
    public static final androidx.media3.common.a f10535g = new a.b().y0("application/x-scte35").P();

    /* renamed from: a, reason: collision with root package name */
    public final String f10536a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10537b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10538c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10539d;

    /* renamed from: e, reason: collision with root package name */
    public int f10540e;
    public final byte[] messageData;

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f10536a = str;
        this.f10537b = str2;
        this.f10538c = j10;
        this.f10539d = j11;
        this.messageData = bArr;
    }

    @Override // b1.C2334C.a
    public androidx.media3.common.a a() {
        String str = this.f10536a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f10535g;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f10534f;
            default:
                return null;
        }
    }

    @Override // b1.C2334C.a
    public byte[] c() {
        if (a() != null) {
            return this.messageData;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f10538c == aVar.f10538c && this.f10539d == aVar.f10539d && Objects.equals(this.f10536a, aVar.f10536a) && Objects.equals(this.f10537b, aVar.f10537b) && Arrays.equals(this.messageData, aVar.messageData)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f10540e == 0) {
            String str = this.f10536a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f10537b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f10538c;
            int i10 = (((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f10539d;
            this.f10540e = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.messageData);
        }
        return this.f10540e;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f10536a + ", id=" + this.f10539d + ", durationMs=" + this.f10538c + ", value=" + this.f10537b;
    }
}
