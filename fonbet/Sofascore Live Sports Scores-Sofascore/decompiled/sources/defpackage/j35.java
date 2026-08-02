package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j35 implements ptc {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ j35(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.ptc
    public final otc a(l2a l2aVar) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return new aj0(context, this);
            case 1:
                return new aj0(context, this);
            case 2:
                return new aj0(context, this);
            case 3:
                return new vdc(context, 0);
            case 4:
                return new vdc(context, 1);
            case 5:
                return new vdc(context, 2);
            case 6:
                return new aj0(context, l2aVar.b(Integer.class, AssetFileDescriptor.class));
            default:
                return new aj0(context, l2aVar.b(Integer.class, InputStream.class));
        }
    }
}
