package na;

import android.view.View;
import androidx.core.view.C2111s0;
import androidx.core.view.F0;
import ja.AbstractC5104a;
import java.util.Iterator;
import java.util.List;

/* renamed from: na.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5690c extends C2111s0.b {

    /* renamed from: a, reason: collision with root package name */
    public final View f57153a;

    /* renamed from: b, reason: collision with root package name */
    public int f57154b;

    /* renamed from: c, reason: collision with root package name */
    public int f57155c;
    private final int[] tmpLocation;

    public C5690c(View view) {
        super(0);
        this.tmpLocation = new int[2];
        this.f57153a = view;
    }

    @Override // androidx.core.view.C2111s0.b
    public void onEnd(C2111s0 c2111s0) {
        this.f57153a.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.C2111s0.b
    public void onPrepare(C2111s0 c2111s0) {
        this.f57153a.getLocationOnScreen(this.tmpLocation);
        this.f57154b = this.tmpLocation[1];
    }

    @Override // androidx.core.view.C2111s0.b
    public F0 onProgress(F0 f02, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C2111s0) it.next()).c() & F0.p.b()) != 0) {
                this.f57153a.setTranslationY(AbstractC5104a.c(this.f57155c, 0, r0.b()));
                break;
            }
        }
        return f02;
    }

    @Override // androidx.core.view.C2111s0.b
    public C2111s0.a onStart(C2111s0 c2111s0, C2111s0.a aVar) {
        this.f57153a.getLocationOnScreen(this.tmpLocation);
        int i10 = this.f57154b - this.tmpLocation[1];
        this.f57155c = i10;
        this.f57153a.setTranslationY(i10);
        return aVar;
    }
}
