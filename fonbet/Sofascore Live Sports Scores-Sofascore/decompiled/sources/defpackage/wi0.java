package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wi0 implements cz7 {
    public final /* synthetic */ int a;

    public /* synthetic */ wi0(int i) {
        this.a = i;
    }

    @Override // defpackage.cz7
    public final ez7 a(Object obj, xvd xvdVar) {
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                if (l.d(uri)) {
                    return new yi0(uri, xvdVar, i);
                }
                return null;
            case 1:
                return new zw1((Bitmap) obj, xvdVar, i);
            case 2:
                return new zw1((ByteBuffer) obj, xvdVar, i2);
            case 3:
                Uri uri2 = (Uri) obj;
                if (Intrinsics.c(uri2.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                    return new xp3(uri2, xvdVar);
                }
                return null;
            case 4:
                return new zw1((Drawable) obj, xvdVar, 2);
            case 5:
                return new y08((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (Intrinsics.c(uri3.getScheme(), "android.resource")) {
                    return new yi0(uri3, xvdVar, i2);
                }
                return null;
        }
    }
}
