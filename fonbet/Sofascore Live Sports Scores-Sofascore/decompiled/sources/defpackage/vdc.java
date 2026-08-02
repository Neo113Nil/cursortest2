package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vdc implements otc {
    public final /* synthetic */ int a;
    public final Context b;

    public vdc(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context.getApplicationContext();
                break;
            case 2:
                this.b = context.getApplicationContext();
                break;
            default:
                this.b = context;
                break;
        }
    }

    @Override // defpackage.otc
    public final ntc a(Object obj, int i, int i2, uvd uvdVar) {
        Long l;
        int i3 = this.a;
        Context context = this.b;
        switch (i3) {
            case 0:
                Uri uri = (Uri) obj;
                return new ntc(new wjd(uri), new udc(0, context, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new ntc(new wjd(uri2), f18.d(context, uri2, new t9d(context.getContentResolver())));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) uvdVar.c(gpk.d)) == null || l.longValue() != -1) {
                    return null;
                }
                return new ntc(new wjd(uri3), f18.d(context, uri3, new dad(context.getContentResolver(), 1)));
        }
    }

    @Override // defpackage.otc
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return aa.g((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return aa.g(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return aa.g(uri2) && uri2.getPathSegments().contains("video");
        }
    }
}
