package defpackage;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ork extends ktb {
    public final /* synthetic */ int e;

    public ork(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.ktb
    public final Object d(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(wrk.c(view));
            case 1:
                return wrk.a(view);
            case 2:
                return yrk.b(view);
            default:
                return Boolean.valueOf(wrk.b(view));
        }
    }

    @Override // defpackage.ktb
    public final void e(View view, Object obj) {
        switch (this.e) {
            case 0:
                wrk.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                wrk.e(view, (CharSequence) obj);
                break;
            case 2:
                yrk.d(view, (CharSequence) obj);
                break;
            default:
                wrk.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.ktb
    public final boolean h(Object obj, Object obj2) {
        boolean equals;
        switch (this.e) {
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
