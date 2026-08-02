package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xak implements ptc {
    public static final xak b = new xak(0);
    public final /* synthetic */ int a;

    public /* synthetic */ xak(int i) {
        this.a = i;
    }

    @Override // defpackage.ptc
    public final otc a(l2a l2aVar) {
        switch (this.a) {
            case 0:
                return yak.b;
            case 1:
                return new r92(new f8h(17), 0);
            case 2:
                return new r92(new rik(17), 0);
            case 3:
                return new yak(1);
            case 4:
                return new shi(l2aVar.b(Uri.class, AssetFileDescriptor.class), 0);
            case 5:
                return new shi(l2aVar.b(Uri.class, ParcelFileDescriptor.class), 0);
            case 6:
                return new shi(l2aVar.b(Uri.class, InputStream.class), 0);
            case 7:
                return new shi(l2aVar.b(qz8.class, InputStream.class), 1);
            default:
                return new qek(l2aVar.b(qz8.class, InputStream.class));
        }
    }
}
