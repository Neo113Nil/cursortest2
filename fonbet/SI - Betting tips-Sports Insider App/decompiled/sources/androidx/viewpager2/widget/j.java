package androidx.viewpager2.widget;

import android.view.View;
import com.google.firebase.messaging.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements q0.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f2908b;

    public /* synthetic */ j(x xVar, int i5) {
        this.f2907a = i5;
        this.f2908b = xVar;
    }

    @Override // q0.o
    public final boolean perform(View view, q0.g gVar) {
        switch (this.f2907a) {
            case 0:
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = (ViewPager2) this.f2908b.f6185d;
                if (viewPager2.f2881r) {
                    viewPager2.b(currentItem, true);
                    break;
                }
                break;
            default:
                int currentItem2 = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager22 = (ViewPager2) this.f2908b.f6185d;
                if (viewPager22.f2881r) {
                    viewPager22.b(currentItem2, true);
                    break;
                }
                break;
        }
        return true;
    }
}
