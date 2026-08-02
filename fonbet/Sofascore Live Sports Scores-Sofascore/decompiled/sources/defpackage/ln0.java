package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzqr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ln0 extends ContentObserver {
    public final /* synthetic */ int a;
    public final ContentResolver b;
    public final Uri c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln0(Object obj, Handler handler, ContentResolver contentResolver, Uri uri, int i) {
        super(handler);
        this.a = i;
        this.d = obj;
        this.b = contentResolver;
        this.c = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((i1k) obj).i();
                break;
            default:
                ((zzqr) obj).c();
                break;
        }
    }
}
