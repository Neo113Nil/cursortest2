package sg;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Hashtable;
import rg.AbstractC6281b;
import sg.C6365a;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public int f64895a;

    /* renamed from: b, reason: collision with root package name */
    public int f64896b;

    /* renamed from: c, reason: collision with root package name */
    public C6365a f64897c;

    /* renamed from: d, reason: collision with root package name */
    public int f64898d;

    /* renamed from: e, reason: collision with root package name */
    public long f64899e;

    /* renamed from: f, reason: collision with root package name */
    public Hashtable f64900f;
    private byte[] payLoadData;
    private byte[] result;
    private byte[] secKey;

    public d(String str) {
        this(Base64.decode(str, 2));
    }

    public int a() {
        return this.f64896b;
    }

    public byte[] b() {
        return this.payLoadData;
    }

    public C6365a c() {
        return this.f64897c;
    }

    public byte[] d() {
        return this.secKey;
    }

    public String toString() {
        return Base64.encodeToString(this.result, 2);
    }

    public d(byte[] bArr) {
        byte[] bArr2;
        String str = null;
        this.result = null;
        this.f64895a = 0;
        this.f64896b = AbstractC6281b.a.DEFAULT_PAYLOAD_ENCRYPTION.c();
        this.f64897c = null;
        this.payLoadData = null;
        this.secKey = null;
        this.f64898d = 0;
        this.f64899e = 0L;
        this.f64900f = null;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i10 = wrap.getInt();
        byte b10 = wrap.get(4);
        byte b11 = wrap.get(5);
        int i11 = 6;
        if (C6365a.b(C6365a.EnumC0904a.containsSecKey, b11)) {
            int i12 = wrap.getInt(6);
            byte[] bArr3 = new byte[i12];
            wrap.position(10);
            wrap.get(bArr3, 0, i12);
            i11 = i12 + 10;
            bArr2 = bArr3;
        } else {
            bArr2 = null;
        }
        int i13 = wrap.getInt(i11);
        int i14 = i11 + 4;
        byte[] bArr4 = new byte[i13];
        wrap.position(i14);
        wrap.get(bArr4, 0, i13);
        int i15 = i14 + i13;
        int i16 = wrap.getInt(i15);
        int i17 = i15 + 4;
        if (C6365a.b(C6365a.EnumC0904a.containsCRC32, b11)) {
            this.f64899e = wrap.getInt(i17);
            i17 = i15 + 8;
        } else if (C6365a.b(C6365a.EnumC0904a.containsCRC64, b11)) {
            this.f64899e = wrap.getLong(i17);
            i17 = i15 + 12;
        }
        if (wrap.capacity() > i17) {
            int i18 = wrap.getInt(i17);
            int i19 = i17 + 4;
            if (i18 > 0) {
                wrap.position(i19);
                byte[] bArr5 = new byte[i18];
                wrap.get(bArr5, 0, i18);
                try {
                    str = new String(bArr5, StandardCharsets.UTF_8);
                } catch (Exception unused) {
                }
                this.f64900f = (Hashtable) AbstractC6366b.a(str);
            }
        }
        this.payLoadData = bArr4;
        this.secKey = bArr2;
        this.f64896b = b10;
        this.f64895a = i10;
        this.f64898d = i16;
        this.f64897c = new C6365a(b11);
        this.result = bArr;
    }
}
