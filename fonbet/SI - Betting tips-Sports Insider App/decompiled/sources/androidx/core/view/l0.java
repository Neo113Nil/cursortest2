package androidx.core.view;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l0 extends n0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1351e;

    public l0(int i5, Class cls, int i10, int i11, int i12) {
        this.f1351e = i12;
        this.f1359a = i5;
        this.f1362d = cls;
        this.f1361c = i10;
        this.f1360b = i11;
    }

    @Override // androidx.core.view.n0
    public final Object d(View view) {
        switch (this.f1351e) {
            case 0:
                return Boolean.valueOf(u0.c(view));
            case 1:
                return u0.a(view);
            case 2:
                return w0.b(view);
            default:
                return Boolean.valueOf(u0.b(view));
        }
    }

    @Override // androidx.core.view.n0
    public final void e(View view, Object obj) {
        switch (this.f1351e) {
            case 0:
                u0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                u0.e(view, (CharSequence) obj);
                break;
            case 2:
                w0.d(view, (CharSequence) obj);
                break;
            default:
                u0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // androidx.core.view.n0
    public final boolean h(Object obj, Object obj2) {
        boolean equals;
        switch (this.f1351e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !equals;
    }
}
