package defpackage;

import com.google.android.gms.internal.measurement.zzso;
import com.google.android.gms.internal.measurement.zzta;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class q4p extends zzso {
    public static final /* synthetic */ int b = 0;
    public final ArrayList a;

    public q4p(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.a = arrayList;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((zzta) it.next()).getClass();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // com.google.android.gms.internal.measurement.zzso, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            zzta zztaVar = (zzta) it.next();
            int length = bArr.length;
            zztaVar.zza();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zzta) it.next()).zza();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzso, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zzta) it.next()).zza();
        }
    }
}
