package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m4 implements w1 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f821a;

    /* renamed from: b, reason: collision with root package name */
    public int f822b;

    /* renamed from: c, reason: collision with root package name */
    public View f823c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f824d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f825e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f826f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f827g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f828h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f829i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f830k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f831l;

    /* renamed from: m, reason: collision with root package name */
    public n f832m;

    /* renamed from: n, reason: collision with root package name */
    public int f833n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f834o;

    public final void a(int i5) {
        View view;
        Toolbar toolbar = this.f821a;
        int i10 = this.f822b ^ i5;
        this.f822b = i5;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i5 & 4) != 0) {
                    b();
                }
                if ((this.f822b & 4) != 0) {
                    Drawable drawable = this.f826f;
                    if (drawable == null) {
                        drawable = this.f834o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            if ((i10 & 8) != 0) {
                if ((i5 & 8) != 0) {
                    toolbar.setTitle(this.f828h);
                    toolbar.setSubtitle(this.f829i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) == 0 || (view = this.f823c) == null) {
                return;
            }
            if ((i5 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f821a;
        if ((this.f822b & 4) != 0) {
            if (TextUtils.isEmpty(this.j)) {
                toolbar.setNavigationContentDescription(this.f833n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i5 = this.f822b;
        if ((i5 & 2) == 0) {
            drawable = null;
        } else if ((i5 & 1) != 0) {
            drawable = this.f825e;
            if (drawable == null) {
                drawable = this.f824d;
            }
        } else {
            drawable = this.f824d;
        }
        this.f821a.setLogo(drawable);
    }
}
