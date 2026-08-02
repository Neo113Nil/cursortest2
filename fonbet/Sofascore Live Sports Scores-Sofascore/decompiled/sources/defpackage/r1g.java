package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r1g implements ptc {
    public final /* synthetic */ int a;
    public final Resources b;

    public /* synthetic */ r1g(Resources resources, int i) {
        this.a = i;
        this.b = resources;
    }

    @Override // defpackage.ptc
    public final otc a(l2a l2aVar) {
        int i = this.a;
        Resources resources = this.b;
        switch (i) {
            case 0:
                return new aj0(resources, l2aVar.b(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new aj0(resources, l2aVar.b(Uri.class, InputStream.class));
            default:
                return new aj0(resources, yak.b);
        }
    }
}
