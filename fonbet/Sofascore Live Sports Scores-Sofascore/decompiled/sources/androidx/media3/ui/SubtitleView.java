package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import defpackage.bk2;
import defpackage.bla;
import defpackage.cmi;
import defpackage.i1l;
import defpackage.ilg;
import defpackage.k74;
import defpackage.m74;
import defpackage.sha;
import defpackage.zj2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout {
    public List a;
    public bk2 b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public int g;
    public cmi h;
    public View i;

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.EMPTY_LIST;
        this.b = bk2.g;
        this.c = 0.0533f;
        this.d = 0.08f;
        this.e = true;
        this.f = true;
        zj2 zj2Var = new zj2(context, 0);
        this.h = zj2Var;
        this.i = zj2Var;
        addView(zj2Var);
        this.g = 1;
    }

    private List<m74> getCuesWithStylingPreferencesApplied() {
        if (this.e && this.f) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            k74 a = ((m74) this.a.get(i)).a();
            if (!this.e) {
                a.n = false;
                CharSequence charSequence = a.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        charSequence = SpannableString.valueOf(charSequence);
                        a.a = charSequence;
                        a.b = null;
                    }
                    charSequence.getClass();
                    Spannable spannable = (Spannable) charSequence;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof bla)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                sha.L(a);
            } else if (!this.f) {
                sha.L(a);
            }
            arrayList.add(a.a());
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

    private bk2 getUserCaptionStyle() {
        boolean isInEditMode = isInEditMode();
        bk2 bk2Var = bk2.g;
        if (isInEditMode) {
            return bk2Var;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return bk2Var;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        return new bk2(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
    }

    private <T extends View & cmi> void setView(T t) {
        removeView(this.i);
        View view = this.i;
        if (view instanceof i1l) {
            ((i1l) view).b.destroy();
        }
        this.i = t;
        this.h = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.h.a(getCuesWithStylingPreferencesApplied(), this.b, this.c, this.d);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.e = z;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.d = f;
        c();
    }

    public void setCues(@Nullable List<m74> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.a = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.c = f;
        c();
    }

    public void setStyle(bk2 bk2Var) {
        this.b = bk2Var;
        c();
    }

    public void setViewType(int i) {
        if (this.g == i) {
            return;
        }
        if (i == 1) {
            setView(new zj2(getContext(), 0));
        } else {
            if (i != 2) {
                ilg.c();
                return;
            }
            setView(new i1l(getContext()));
        }
        this.g = i;
    }
}
