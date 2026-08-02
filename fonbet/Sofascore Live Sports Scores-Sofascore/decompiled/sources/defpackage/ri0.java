package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ri0 extends bib {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri0(ContentResolver contentResolver, Uri uri, boolean z, int i) {
        super(contentResolver, uri, z);
        this.e = i;
    }

    @Override // defpackage.xd4
    public final Class c() {
        switch (this.e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // defpackage.bib
    public final void d(Object obj) {
        switch (this.e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // defpackage.bib
    public final Object f(ContentResolver contentResolver, Uri uri) {
        int i = this.e;
        boolean z = this.a;
        ContentResolver contentResolver2 = this.c;
        switch (i) {
            case 0:
                AssetFileDescriptor h = (z && aa.g(uri) && aa.f()) ? aa.h(contentResolver2, uri) : contentResolver2.openAssetFileDescriptor(uri, "r");
                if (h != null) {
                    return h;
                }
                throw new FileNotFoundException(dmi.m(uri, "FileDescriptor is null for: "));
            default:
                AssetFileDescriptor h2 = (z && aa.g(uri) && aa.f()) ? aa.h(contentResolver2, uri) : contentResolver2.openAssetFileDescriptor(uri, "r");
                if (h2 != null) {
                    return h2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException(dmi.m(uri, "FileDescriptor is null for: "));
        }
    }
}
