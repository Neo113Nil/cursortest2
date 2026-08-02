package I4;

import android.content.res.Resources;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.resource.bitmap.D;
import com.bumptech.glide.util.k;

/* loaded from: classes2.dex */
public class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f5341a;

    public b(Resources resources) {
        this.f5341a = (Resources) k.d(resources);
    }

    @Override // I4.e
    public v a(v vVar, j jVar) {
        return D.c(this.f5341a, vVar);
    }
}
