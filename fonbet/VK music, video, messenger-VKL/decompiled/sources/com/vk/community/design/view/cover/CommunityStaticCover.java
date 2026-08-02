package com.vk.community.design.view.cover;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.d;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.tools.controls.seekbar.m;
import xsna.b3;
import xsna.epx;
import xsna.gzs;
import xsna.ho8;
import xsna.izs;
import xsna.jai;
import xsna.jkg;
import xsna.kg50;
import xsna.s3q0;
import xsna.tbg;
import xsna.uf3;
import xsna.vak0;
import xsna.vq;
import xsna.wh50;
import xsna.zak0;

/* compiled from: CommunityStaticCover.kt */
/* loaded from: classes17.dex */
public final class CommunityStaticCover extends FrameLayout {
    public static final /* synthetic */ int g = 0;
    public final ComposeView b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final kg50 f;

    /* compiled from: CommunityStaticCover.kt */
    public interface a {

        /* compiled from: CommunityStaticCover.kt */
        /* renamed from: com.vk.community.design.view.cover.CommunityStaticCover$a$a, reason: collision with other inner class name */
        public static final class C0723a implements a {
            public final jkg a;
            public final String b;
            public final gzs<s3q0> c;

            public C0723a(jkg jkgVar, String str, tbg tbgVar) {
                this.a = jkgVar;
                this.b = str;
                this.c = tbgVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0723a)) {
                    return false;
                }
                C0723a c0723a = (C0723a) obj;
                return this.a.equals(c0723a.a) && epx.f(this.b, c0723a.b) && epx.f(this.c, c0723a.c);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                gzs<s3q0> gzsVar = this.c;
                return hashCode2 + (gzsVar != null ? gzsVar.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Image(url=");
                sb.append(this.a);
                sb.append(", fallbackColor=");
                sb.append(this.b);
                sb.append(", onClick=");
                return uf3.d(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityStaticCover.kt */
        public static final class b implements a {
            public final String a;

            public b() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Placeholder(averageColor="), this.a, ')');
            }

            public b(String str) {
                this.a = str;
            }
        }

        /* compiled from: CommunityStaticCover.kt */
        public static final class c implements a {
            public final b3 a;

            public c(b3 b3Var) {
                this.a = b3Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a.equals(((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "UploadPlaceholder(onUpload=" + this.a + ')';
            }
        }
    }

    public CommunityStaticCover(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ComposeView composeView = new ComposeView(context, null, 6);
        vq.b(-1, -1, composeView);
        this.b = composeView;
        this.c = k.b(null);
        this.d = k.b(new a.b(null));
        this.e = k.b(Boolean.TRUE);
        this.f = d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        addView(composeView);
        composeView.setContent(new jai(-1809935319, new m(this, 5), true));
    }

    public final izs<Integer, s3q0> getOnHeightChanges() {
        return (izs) ((zak0) this.c).getValue();
    }

    public final a getState() {
        return (a) ((zak0) this.d).getValue();
    }

    public final float getTransformFraction() {
        return this.f.getFloatValue();
    }

    public final boolean getWithOverlay() {
        return ((Boolean) ((zak0) this.e).getValue()).booleanValue();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0);
        ComposeView composeView = this.b;
        composeView.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, composeView.getMeasuredHeight());
        izs<Integer, s3q0> onHeightChanges = getOnHeightChanges();
        if (onHeightChanges != null) {
            onHeightChanges.invoke(Integer.valueOf(getMeasuredHeight()));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        a state = getState();
        if (!(state instanceof a.C0723a)) {
            if (!(state instanceof a.c)) {
                return false;
            }
            ((a.c) state).a.invoke();
            return true;
        }
        gzs<s3q0> gzsVar = ((a.C0723a) state).c;
        if (gzsVar == null) {
            return false;
        }
        gzsVar.invoke();
        return true;
    }

    public final void setOnHeightChanges(izs<? super Integer, s3q0> izsVar) {
        ((zak0) this.c).setValue(izsVar);
    }

    public final void setState(a aVar) {
        ((zak0) this.d).setValue(aVar);
    }

    public final void setTransformFraction(float f) {
        ((vak0) this.f).g(f);
    }

    public final void setWithOverlay(boolean z) {
        ((zak0) this.e).setValue(Boolean.valueOf(z));
    }
}
