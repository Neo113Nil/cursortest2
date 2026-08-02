package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q40 {
    public final /* synthetic */ int a;

    public /* synthetic */ q40(int i) {
        this.a = i;
    }

    public final eek a(Object obj, tvd tvdVar) {
        switch (this.a) {
            case 0:
                return nq8.L(((Uri) obj).toString());
            case 1:
                return nq8.o(((File) obj).getPath());
            case 2:
                return nq8.o(((uae) obj).a.w());
            case 3:
                int intValue = ((Number) obj).intValue();
                Context context = tvdVar.a;
                try {
                    if (context.getResources().getResourceEntryName(intValue) != null) {
                        return nq8.L("android.resource://" + context.getPackageName() + "/" + intValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return nq8.L((String) obj);
        }
    }
}
