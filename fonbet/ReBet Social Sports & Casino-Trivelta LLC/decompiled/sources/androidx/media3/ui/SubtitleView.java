package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import d1.C3985a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public List f22238a;

    /* renamed from: b, reason: collision with root package name */
    public C2233b f22239b;

    /* renamed from: c, reason: collision with root package name */
    public int f22240c;

    /* renamed from: d, reason: collision with root package name */
    public float f22241d;

    /* renamed from: e, reason: collision with root package name */
    public float f22242e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22243f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22244g;

    /* renamed from: h, reason: collision with root package name */
    public int f22245h;

    /* renamed from: i, reason: collision with root package name */
    public a f22246i;

    /* renamed from: j, reason: collision with root package name */
    public View f22247j;

    public interface a {
        void a(List list, C2233b c2233b, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22238a = Collections.EMPTY_LIST;
        this.f22239b = C2233b.f22353g;
        this.f22240c = 0;
        this.f22241d = 0.0533f;
        this.f22242e = 0.08f;
        this.f22243f = true;
        this.f22244g = true;
        C2232a c2232a = new C2232a(context);
        this.f22246i = c2232a;
        this.f22247j = c2232a;
        addView(c2232a);
        this.f22245h = 1;
    }

    private List<C3985a> getCuesWithStylingPreferencesApplied() {
        if (this.f22243f && this.f22244g) {
            return this.f22238a;
        }
        ArrayList arrayList = new ArrayList(this.f22238a.size());
        for (int i10 = 0; i10 < this.f22238a.size(); i10++) {
            arrayList.add(a((C3985a) this.f22238a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C2233b getUserCaptionStyle() {
        if (isInEditMode()) {
            return C2233b.f22353g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? C2233b.f22353g : C2233b.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f22247j);
        View view = this.f22247j;
        if (view instanceof n0) {
            ((n0) view).g();
        }
        this.f22247j = t10;
        this.f22246i = t10;
        addView(t10);
    }

    public final C3985a a(C3985a c3985a) {
        C3985a.b a10 = c3985a.a();
        if (!this.f22243f) {
            k0.c(a10);
        } else if (!this.f22244g) {
            k0.d(a10);
        }
        return a10.a();
    }

    public void b(int i10, float f10) {
        Context context = getContext();
        d(2, TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void c(float f10, boolean z10) {
        d(z10 ? 1 : 0, f10);
    }

    public final void d(int i10, float f10) {
        this.f22240c = i10;
        this.f22241d = f10;
        g();
    }

    public void e() {
        setStyle(getUserCaptionStyle());
    }

    public void f() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void g() {
        this.f22246i.a(getCuesWithStylingPreferencesApplied(), this.f22239b, this.f22241d, this.f22240c, this.f22242e);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f22244g = z10;
        g();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f22243f = z10;
        g();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f22242e = f10;
        g();
    }

    public void setCues(List<C3985a> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f22238a = list;
        g();
    }

    public void setFractionalTextSize(float f10) {
        c(f10, false);
    }

    public void setStyle(C2233b c2233b) {
        this.f22239b = c2233b;
        g();
    }

    public void setViewType(int i10) {
        if (this.f22245h == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new C2232a(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new n0(getContext()));
        }
        this.f22245h = i10;
    }
}
