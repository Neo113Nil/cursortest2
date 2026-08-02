package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmdh;", "Lq8;", "Landroid/app/Application;", "application", "Lfqg;", "savedStateHandle", "<init>", "(Landroid/app/Application;Lfqg;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class mdh extends q8 {
    public final hch e;
    public final ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdh(@NotNull Application application, @NotNull fqg fqgVar) {
        super(application);
        application.getClass();
        fqgVar.getClass();
        this.e = (hch) fqgVar.a("ARG_DATA_HOLDER");
        List list = (List) fqgVar.a("ARG_STANDINGS_RESPONSE");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = null;
            for (Object obj : list) {
                if (obj instanceof ebi) {
                    arrayList2 = new ArrayList();
                    arrayList.add(arrayList2);
                }
                if (obj instanceof bbi) {
                    ((bbi) obj).d = abi.d;
                }
                if (arrayList2 != null) {
                    arrayList2.add(obj);
                }
            }
        }
        this.f = arrayList;
    }
}
