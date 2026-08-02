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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.i1n0;
import xsna.qly;
import xsna.rkk;
import xsna.yr9;

/* loaded from: classes12.dex */
public final class SubtitleView extends FrameLayout {
    public List<rkk> b;
    public yr9 c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public int h;
    public a i;
    public View j;

    public interface a {
        void a(List list, yr9 yr9Var, float f, float f2);
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = Collections.EMPTY_LIST;
        this.c = yr9.g;
        this.d = 0.0533f;
        this.e = 0.08f;
        this.f = true;
        this.g = true;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context, 0);
        this.i = aVar;
        this.j = aVar;
        addView(aVar);
        this.h = 1;
    }

    private List<rkk> getCuesWithStylingPreferencesApplied() {
        if (this.f && this.g) {
            return this.b;
        }
        ArrayList arrayList = new ArrayList(this.b.size());
        for (int i = 0; i < this.b.size(); i++) {
            rkk.a a2 = this.b.get(i).a();
            if (!this.f) {
                a2.n = false;
                CharSequence charSequence = a2.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        a2.b(SpannableString.valueOf(charSequence));
                    }
                    CharSequence charSequence2 = a2.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof qly)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                i1n0.a(a2);
            } else if (!this.g) {
                i1n0.a(a2);
            }
            arrayList.add(a2.a());
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

    private yr9 getUserCaptionStyle() {
        boolean isInEditMode = isInEditMode();
        yr9 yr9Var = yr9.g;
        if (isInEditMode) {
            return yr9Var;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            yr9Var = new yr9(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return yr9Var;
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.j);
        View view = this.j;
        if (view instanceof c) {
            ((c) view).c.destroy();
        }
        this.j = t;
        this.i = t;
        addView(t);
    }

    public final void a() {
        this.i.a(getCuesWithStylingPreferencesApplied(), this.c, this.d, this.e);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.g = z;
        a();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f = z;
        a();
    }

    public void setBottomPaddingFraction(float f) {
        this.e = f;
        a();
    }

    public void setCues(@Nullable List<rkk> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.b = list;
        a();
    }

    public void setFractionalTextSize(float f) {
        this.d = f;
        a();
    }

    public void setStyle(yr9 yr9Var) {
        this.c = yr9Var;
        a();
    }

    public void setViewType(int i) {
        if (this.h == i) {
            return;
        }
        if (i == 1) {
            setView(new androidx.media3.ui.a(getContext(), 0));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new c(getContext()));
        }
        this.h = i;
    }
}
