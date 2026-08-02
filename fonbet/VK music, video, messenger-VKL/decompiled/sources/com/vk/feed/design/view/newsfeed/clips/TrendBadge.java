package com.vk.feed.design.view.newsfeed.clips;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bwt0;
import xsna.c5g;
import xsna.cn70;
import xsna.cut0;
import xsna.epx;
import xsna.f4m;
import xsna.ful0;
import xsna.iah0;
import xsna.j5g;
import xsna.z7g;
import xsna.zrp;

/* compiled from: TrendBadge.kt */
/* loaded from: classes18.dex */
public final class TrendBadge extends FrameLayout {
    public static final float e = cn70.c(6);
    public VKImageView b;
    public final TextView c;
    public AlphaMode d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TrendBadge.kt */
    public static final class AlphaMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AlphaMode[] $VALUES;
        public static final AlphaMode FULL;
        public static final AlphaMode TRANSLUCENT;
        private final int value;

        static {
            AlphaMode alphaMode = new AlphaMode("TRANSLUCENT", 0, 178);
            TRANSLUCENT = alphaMode;
            AlphaMode alphaMode2 = new AlphaMode("FULL", 1, 255);
            FULL = alphaMode2;
            AlphaMode[] alphaModeArr = {alphaMode, alphaMode2};
            $VALUES = alphaModeArr;
            $ENTRIES = new asp(alphaModeArr);
        }

        public AlphaMode(String str, int i, int i2) {
            this.value = i2;
        }

        public static AlphaMode valueOf(String str) {
            return (AlphaMode) Enum.valueOf(AlphaMode.class, str);
        }

        public static AlphaMode[] values() {
            return (AlphaMode[]) $VALUES.clone();
        }

        public final int h() {
            return this.value;
        }
    }

    /* compiled from: TrendBadge.kt */
    public interface a {

        /* compiled from: TrendBadge.kt */
        /* renamed from: com.vk.feed.design.view.newsfeed.clips.TrendBadge$a$a, reason: collision with other inner class name */
        public static final class C1044a implements a {
            public final List<cut0> a;

            public C1044a(List list) {
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1044a) || !this.a.equals(((C1044a) obj).a)) {
                    return false;
                }
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                return true;
            }

            public final int hashCode() {
                return GradientDrawable.Orientation.TR_BL.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Gradient(backgroundColors=" + this.a + ", orientation=" + GradientDrawable.Orientation.TR_BL + ')';
            }
        }

        /* compiled from: TrendBadge.kt */
        public static final class b implements a {
            public static final b b = new b(new z7g(R.color.vk_gray_800));
            public final cut0 a;

            public b(cut0 cut0Var) {
                this.a = cut0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Solid(backgroundColor=" + this.a + ')';
            }
        }
    }

    public TrendBadge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = AlphaMode.TRANSLUCENT;
        LayoutInflater.from(context).inflate(R.layout.pds_trend_badge, this);
        setBackground(getBackgroundDrawable());
        TextView textView = (TextView) findViewById(R.id.trend_badge_title);
        textView.setSelected(true);
        this.c = textView;
    }

    private final GradientDrawable getBackgroundDrawable() {
        GradientDrawable a2 = ful0.a(0);
        a2.setCornerRadius(e);
        a2.setAlpha(AlphaMode.TRANSLUCENT.h());
        a2.setColor(getContext().getColor(R.color.vk_gray_800));
        return a2;
    }

    private final void setAlphaByMode(AlphaMode alphaMode) {
        getBackground().setAlpha(alphaMode.h());
    }

    public final AlphaMode getAlphaMode() {
        return this.d;
    }

    public final void setAlphaMode(AlphaMode alphaMode) {
        if (this.d == alphaMode) {
            return;
        }
        this.d = alphaMode;
        setAlphaByMode(alphaMode);
    }

    public final void setAppearance(a aVar) {
        GradientDrawable backgroundDrawable = getBackgroundDrawable();
        if (aVar instanceof a.b) {
            backgroundDrawable.setColor(((a.b) aVar).a.c(getContext()));
        } else {
            if (!(aVar instanceof a.C1044a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.C1044a c1044a = (a.C1044a) aVar;
            c1044a.getClass();
            backgroundDrawable.setOrientation(GradientDrawable.Orientation.TR_BL);
            List<cut0> list = c1044a.a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((cut0) it.next()).b(getContext())));
            }
            backgroundDrawable.setColors(j5g.N0(arrayList));
        }
        backgroundDrawable.setAlpha(this.d.h());
        setBackground(backgroundDrawable);
    }

    public final void setImage(String str) {
        TextView textView = this.c;
        if (str == null || str.length() == 0) {
            VKImageView vKImageView = this.b;
            if (vKImageView != null) {
                vKImageView.setVisibility(8);
            }
            f4m.s(iah0.a(8), textView);
            return;
        }
        VKImageView vKImageView2 = this.b;
        if (vKImageView2 == null) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.trend_badge_image);
            View inflate = viewStub != null ? viewStub.inflate() : null;
            vKImageView2 = inflate instanceof VKImageView ? (VKImageView) inflate : null;
            if (vKImageView2 != null) {
                bwt0.d(vKImageView2, e, (r4 & 2) != 0, (r4 & 4) != 0);
                this.b = vKImageView2;
            } else {
                vKImageView2 = null;
            }
        }
        if (vKImageView2 != null) {
            vKImageView2.load(str);
        }
        if (vKImageView2 != null) {
            vKImageView2.setVisibility(0);
        }
        f4m.s(iah0.a(4), textView);
    }

    public final void setTitle(String str) {
        this.c.setText(str);
    }
}
