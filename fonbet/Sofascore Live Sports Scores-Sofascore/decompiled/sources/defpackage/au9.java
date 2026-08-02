package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class au9 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Context j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au9(Context context, int i) {
        super(0);
        this.i = i;
        this.j = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        Context context = this.j;
        switch (i) {
            case 0:
                Bitmap.Config[] configArr = l.a;
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    a70.r("cacheDir == null");
                    break;
                } else {
                    cacheDir.mkdirs();
                    break;
                }
            default:
                Bitmap.Config[] configArr2 = l.a;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 == null) {
                    a70.r("cacheDir == null");
                    break;
                } else {
                    cacheDir2.mkdirs();
                    break;
                }
        }
        return null;
    }
}
