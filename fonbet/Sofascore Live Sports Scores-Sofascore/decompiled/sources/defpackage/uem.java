package defpackage;

import android.view.View;
import com.inmobi.media.C3455go;
import com.inmobi.media.Fi;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class uem implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ uem(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        View view = this.b;
        Fi fi = (Fi) obj;
        switch (i) {
            case 0:
                return C3455go.a(view, fi);
            default:
                return C3455go.b(view, fi);
        }
    }
}
