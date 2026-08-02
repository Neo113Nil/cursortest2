package com.vk.feed.design.view.newsfeed.dzen.header;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.awt0;
import xsna.b0u0;
import xsna.btm;
import xsna.bwt0;
import xsna.dko;
import xsna.eko;
import xsna.epx;
import xsna.ey2;
import xsna.f4m;
import xsna.gko;
import xsna.ho8;
import xsna.hut0;
import xsna.iah0;
import xsna.iut0;
import xsna.jq;
import xsna.q3;
import xsna.qcy;
import xsna.qoy;
import xsna.tlo0;
import xsna.zrp;

/* compiled from: DzenNewsHeader.kt */
/* loaded from: classes18.dex */
public final class DzenNewsHeader extends ConstraintLayout {
    public static final /* synthetic */ int C = 0;
    public final VkImageSimple A;
    public final VkText B;
    public a t;
    public c u;
    public Size v;
    public b w;
    public final VkText x;
    public final FrameLayout y;
    public final VKImageView z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DzenNewsHeader.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Large;
        public static final Size Medium;

        static {
            Size size = new Size("Medium", 0);
            Medium = size;
            Size size2 = new Size("Large", 1);
            Large = size2;
            Size[] sizeArr = {size, size2};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: DzenNewsHeader.kt */
    public interface a {

        /* compiled from: DzenNewsHeader.kt */
        /* renamed from: com.vk.feed.design.view.newsfeed.dzen.header.DzenNewsHeader$a$a, reason: collision with other inner class name */
        public static final class C1051a implements a {
            public final gko a;

            public C1051a(gko gkoVar) {
                this.a = gkoVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1051a) && this.a.equals(((C1051a) obj).a);
            }

            public final int hashCode() {
                return Integer.hashCode(this.a.a);
            }

            public final String toString() {
                return "Icon(drawableSource=" + this.a + ')';
            }
        }

        /* compiled from: DzenNewsHeader.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
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
                return ho8.a(new StringBuilder("Image(url="), this.a, ')');
            }
        }
    }

    /* compiled from: DzenNewsHeader.kt */
    public interface b {

        /* compiled from: DzenNewsHeader.kt */
        public static final class a implements b {
            public final tlo0.h a;
            public final dko b;
            public final boolean c;
            public final btm d;

            public a(tlo0.h hVar, eko ekoVar, boolean z, btm btmVar) {
                this.a = hVar;
                this.b = ekoVar;
                this.c = z;
                this.d = btmVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d.equals(aVar.d);
            }

            public final int hashCode() {
                int hashCode = this.a.a.hashCode() * 31;
                dko dkoVar = this.b;
                return this.d.hashCode() + qoy.b((hashCode + (dkoVar == null ? 0 : dkoVar.hashCode())) * 31, 31, this.c);
            }

            public final String toString() {
                return "Detail(text=" + this.a + ", icon=" + this.b + ", isClickEnabled=" + this.c + ", onClick=" + this.d + ')';
            }
        }
    }

    /* compiled from: DzenNewsHeader.kt */
    public static final class c {
        public final tlo0.h a;

        public c(tlo0.h hVar) {
            this.a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return jq.c(new StringBuilder("Title(title="), this.a, ')');
        }
    }

    /* compiled from: DzenNewsHeader.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Size.values().length];
            try {
                iArr[Size.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Size.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DzenNewsHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.v = Size.Medium;
        LayoutInflater.from(context).inflate(R.layout.news_dzen_header, this);
        this.x = (VkText) findViewById(R.id.header_dzen_title);
        this.y = (FrameLayout) findViewById(R.id.header_dzen_left);
        this.z = (VKImageView) findViewById(R.id.header_dzen_left_image);
        this.A = (VkImageSimple) findViewById(R.id.header_dzen_left_icon);
        this.B = (VkText) findViewById(R.id.header_dzen_description);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        new hut0().d(this, Boolean.TRUE);
    }

    @Override // android.view.View
    public final a getLeft() {
        return this.t;
    }

    @Override // android.view.View
    public final b getRight() {
        return this.w;
    }

    public final Size getSize() {
        return this.v;
    }

    public final c getTitle() {
        return this.u;
    }

    public final void setLeft(a aVar) {
        this.t = aVar;
        awt0.v(this.y, aVar != null);
        VKImageView vKImageView = this.z;
        f4m.j(vKImageView);
        VkImageSimple vkImageSimple = this.A;
        f4m.j(vkImageSimple);
        if (aVar instanceof a.b) {
            vKImageView.setVisibility(0);
            vKImageView.load(((a.b) aVar).a);
        } else if (!(aVar instanceof a.C1051a)) {
            if (aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            vkImageSimple.setVisibility(0);
            vkImageSimple.setImageDrawable(gko.b(((a.C1051a) aVar).a.a, getContext()));
        }
    }

    public final void setRight(b bVar) {
        this.w = bVar;
        VkText vkText = this.B;
        f4m.j(vkText);
        vkText.setCompoundDrawablePadding(0);
        if (!(bVar instanceof b.a)) {
            if (bVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        b.a aVar = (b.a) bVar;
        vkText.setVisibility(0);
        ey2.h(vkText, aVar.a);
        vkText.setCompoundDrawablePadding(iah0.a(5));
        dko dkoVar = aVar.b;
        vkText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, dkoVar != null ? dkoVar.a(getContext()) : null, (Drawable) null);
        if (aVar.c) {
            vkText.setOnClickListener(new q3(aVar, 4));
            vkText.setBackgroundResource(R.drawable.vk_highlight);
        } else {
            vkText.setOnClickListener(null);
            vkText.setBackgroundResource(0);
            vkText.setClickable(false);
        }
    }

    public final void setSize(Size size) {
        this.v = size;
        int i = d.$EnumSwitchMapping$0[size.ordinal()];
        VkText vkText = this.x;
        if (i == 1) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            vkText.setTextAppearance(R.style.VkUiTypography_Headline1Medium);
            f4m.v(iah0.a(9), vkText);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            qcy<Object>[] qcyVarArr2 = bwt0.a;
            vkText.setTextAppearance(R.style.VkUiTypography_Title3Bold);
            f4m.v(iah0.a(7), vkText);
        }
    }

    public final void setTitle(c cVar) {
        this.u = cVar;
        VkText vkText = this.x;
        if (cVar == null) {
            f4m.j(vkText);
        } else {
            vkText.setText(tlo0.b.a(cVar.a, getContext()));
            vkText.setVisibility(0);
        }
    }
}
