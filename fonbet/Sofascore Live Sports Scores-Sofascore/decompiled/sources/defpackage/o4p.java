package defpackage;

import com.google.android.gms.internal.measurement.zzsn;
import com.google.android.gms.internal.measurement.zzsz;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o4p extends zzsn {
    public static final /* synthetic */ int b = 0;
    public final ArrayList a;

    public o4p(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.a = arrayList;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((zzsz) it.next()).getClass();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((zzsz) it.next()).zza();
            }
        }
        return read;
    }

    @Override // com.google.android.gms.internal.measurement.zzsn, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = ((FilterInputStream) this).in.read(bArr);
        if (read != -1) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((zzsz) it.next()).zza();
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((zzsz) it.next()).zza();
            }
        }
        return read;
    }
}
