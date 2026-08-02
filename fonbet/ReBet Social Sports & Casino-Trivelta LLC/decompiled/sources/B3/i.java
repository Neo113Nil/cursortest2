package B3;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.utils.z;

/* loaded from: classes.dex */
public class i extends G3.a {

    /* renamed from: q, reason: collision with root package name */
    public Path f644q;

    /* renamed from: r, reason: collision with root package name */
    public final G3.a f645r;

    public i(C2940j c2940j, G3.a aVar) {
        super(c2940j, (PointF) aVar.f3855b, (PointF) aVar.f3856c, aVar.f3857d, aVar.f3858e, aVar.f3859f, aVar.f3860g, aVar.f3861h);
        this.f645r = aVar;
        j();
    }

    public void j() {
        Object obj;
        Object obj2;
        Object obj3 = this.f3856c;
        boolean z10 = (obj3 == null || (obj2 = this.f3855b) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) ? false : true;
        Object obj4 = this.f3855b;
        if (obj4 == null || (obj = this.f3856c) == null || z10) {
            return;
        }
        G3.a aVar = this.f645r;
        this.f644q = z.d((PointF) obj4, (PointF) obj, aVar.f3868o, aVar.f3869p);
    }

    public Path k() {
        return this.f644q;
    }
}
