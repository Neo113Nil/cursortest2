package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ann extends PushbackInputStream {
    public final /* synthetic */ cnn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ann(cnn cnnVar, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.a = cnnVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.c.a();
        super.close();
    }
}
