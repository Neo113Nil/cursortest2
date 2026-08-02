package androidx.viewpager2.widget;

import androidx.recyclerview.widget.z0;
import com.google.firebase.messaging.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2903b;

    public /* synthetic */ e(int i5, Object obj) {
        this.f2902a = i5;
        this.f2903b = obj;
    }

    @Override // androidx.recyclerview.widget.z0
    public final void onChanged() {
        switch (this.f2902a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f2903b;
                viewPager2.f2870e = true;
                viewPager2.f2876l.f2901l = true;
                break;
            default:
                ((x) this.f2903b).P();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.z0
    public final void onItemRangeChanged(int i5, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.z0
    public final void onItemRangeInserted(int i5, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.z0
    public final void onItemRangeMoved(int i5, int i10, int i11) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.z0
    public final void onItemRangeRemoved(int i5, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.z0
    public final void onItemRangeChanged(int i5, int i10, Object obj) {
        onChanged();
    }
}
