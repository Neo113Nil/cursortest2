package com.vk.feed.design.view.posting.preview.spinner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import com.vk.feed.design.compose.posting.preview.spinner.PostingSpinnerSize;
import com.vk.feed.design.compose.posting.preview.spinner.PostingSpinnerState;
import xsna.f870;
import xsna.gzs;
import xsna.lg90;
import xsna.ncb;
import xsna.pg90;
import xsna.q630;
import xsna.rpo0;
import xsna.s3q0;
import xsna.spc0;
import xsna.txj0;
import xsna.wh50;
import xsna.wlb0;
import xsna.zak0;

/* compiled from: PostingVkSpinnerWrapperView.kt */
/* loaded from: classes18.dex */
public final class PostingVkSpinnerWrapperView extends rpo0 {
    public static final /* synthetic */ int w = 0;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;
    public final wh50 t;
    public final wh50 u;
    public final wh50 v;

    public PostingVkSpinnerWrapperView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.rpo0
    public final void A(int i, a aVar) {
        a aVar2;
        lg90 lg90Var;
        a M = aVar.M(1407093956);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(1407093956, i2, -1, "com.vk.feed.design.view.posting.preview.spinner.PostingVkSpinnerWrapperView.ThemedContent (PostingVkSpinnerWrapperView.kt:42)");
            }
            Integer errorIconResId = getErrorIconResId();
            if (errorIconResId != null) {
                M.K(-144605182);
                lg90Var = pg90.a(errorIconResId.intValue(), 0, M);
                M.j();
            } else {
                M.K(-144540702);
                M.j();
                lg90Var = null;
            }
            lg90 lg90Var2 = lg90Var;
            Integer color = getColor();
            long j = wlb0.h(M).getIcon().f;
            if (color != null) {
                j = f870.c(color.intValue());
            }
            long j2 = j;
            if (getSpinnerScreen()) {
                M.K(-144395715);
                PostingSpinnerState spinnerState = getSpinnerState();
                Integer backgroundColor = getBackgroundColor();
                long j3 = wlb0.h(M).getBackground().n;
                if (backgroundColor != null) {
                    j3 = f870.c(backgroundColor.intValue());
                }
                gzs<s3q0> onCancelClick = getOnCancelClick();
                gzs<s3q0> onErrorClick = getOnErrorClick();
                Integer subtitleColor = getSubtitleColor();
                long j4 = wlb0.h(M).getText().p;
                if (subtitleColor != null) {
                    j4 = f870.c(subtitleColor.intValue());
                }
                aVar2 = M;
                spc0.e(spinnerState, null, getSubtitle(), onCancelClick, j3, j2, getSpinnerSize(), onErrorClick, lg90Var2, j4, aVar2, 134217728);
                aVar2.j();
            } else {
                M.K(-143855168);
                spc0.f(getSpinnerState(), txj0.q(q630.a.a, 56), getOnCancelClick(), j2, getSpinnerSize(), getOnErrorClick(), lg90Var2, M, 2097200);
                aVar2 = M;
                aVar2.j();
            }
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new ncb(this, i, 14);
        }
    }

    public final Integer getBackgroundColor() {
        return (Integer) ((zak0) this.q).getValue();
    }

    public final Integer getColor() {
        return (Integer) ((zak0) this.r).getValue();
    }

    public final Integer getErrorIconResId() {
        return (Integer) ((zak0) this.u).getValue();
    }

    public final gzs<s3q0> getOnCancelClick() {
        return (gzs) ((zak0) this.o).getValue();
    }

    public final gzs<s3q0> getOnErrorClick() {
        return (gzs) ((zak0) this.p).getValue();
    }

    public final boolean getSpinnerScreen() {
        return ((Boolean) ((zak0) this.v).getValue()).booleanValue();
    }

    public final PostingSpinnerSize getSpinnerSize() {
        return (PostingSpinnerSize) ((zak0) this.t).getValue();
    }

    public final PostingSpinnerState getSpinnerState() {
        return (PostingSpinnerState) ((zak0) this.m).getValue();
    }

    public final String getSubtitle() {
        return (String) ((zak0) this.n).getValue();
    }

    public final Integer getSubtitleColor() {
        return (Integer) ((zak0) this.s).getValue();
    }

    public final void setBackgroundColor(Integer num) {
        ((zak0) this.q).setValue(num);
    }

    public final void setColor(Integer num) {
        ((zak0) this.r).setValue(num);
    }

    public final void setErrorIconResId(Integer num) {
        ((zak0) this.u).setValue(num);
    }

    public final void setOnCancelClick(gzs<s3q0> gzsVar) {
        ((zak0) this.o).setValue(gzsVar);
    }

    public final void setOnErrorClick(gzs<s3q0> gzsVar) {
        ((zak0) this.p).setValue(gzsVar);
    }

    public final void setSpinnerScreen(boolean z) {
        ((zak0) this.v).setValue(Boolean.valueOf(z));
    }

    public final void setSpinnerSize(PostingSpinnerSize postingSpinnerSize) {
        ((zak0) this.t).setValue(postingSpinnerSize);
    }

    public final void setSpinnerState(PostingSpinnerState postingSpinnerState) {
        ((zak0) this.m).setValue(postingSpinnerState);
    }

    public final void setSubtitle(String str) {
        ((zak0) this.n).setValue(str);
    }

    public final void setSubtitleColor(Integer num) {
        ((zak0) this.s).setValue(num);
    }

    public PostingVkSpinnerWrapperView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.m = k.b(PostingSpinnerState.Loading);
        this.n = k.b(null);
        this.o = k.b(null);
        this.p = k.b(null);
        this.q = k.b(null);
        this.r = k.b(null);
        this.s = k.b(null);
        this.t = k.b(PostingSpinnerSize.Large);
        this.u = k.b(null);
        this.v = k.b(Boolean.TRUE);
    }
}
