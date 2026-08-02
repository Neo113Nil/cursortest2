package com.vk.core.view.components.tile;

import android.content.Context;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.view.components.tile.VkTile;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.eko;
import xsna.epx;
import xsna.xq;
import xsna.zrp;

/* compiled from: VkTileImageView.kt */
/* loaded from: classes17.dex */
public final class VkTileImageView extends FrameLayout {
    public final FrameLayout b;
    public final AppCompatImageView c;
    public b d;

    /* compiled from: VkTileImageView.kt */
    public static final class Badge {
        public final eko a;
        public final Alignment b;
        public final float c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkTileImageView.kt */
        public static final class Alignment {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Alignment[] $VALUES;
            public static final Alignment BottomLeft;
            public static final Alignment BottomRight;
            public static final Alignment TopLeft;
            public static final Alignment TopRight;

            static {
                Alignment alignment = new Alignment("TopLeft", 0);
                TopLeft = alignment;
                Alignment alignment2 = new Alignment("TopRight", 1);
                TopRight = alignment2;
                Alignment alignment3 = new Alignment("BottomRight", 2);
                BottomRight = alignment3;
                Alignment alignment4 = new Alignment("BottomLeft", 3);
                BottomLeft = alignment4;
                Alignment[] alignmentArr = {alignment, alignment2, alignment3, alignment4};
                $VALUES = alignmentArr;
                $ENTRIES = new asp(alignmentArr);
            }

            public Alignment() {
                throw null;
            }

            public static Alignment valueOf(String str) {
                return (Alignment) Enum.valueOf(Alignment.class, str);
            }

            public static Alignment[] values() {
                return (Alignment[]) $VALUES.clone();
            }
        }

        public Badge(eko ekoVar, float f) {
            Alignment alignment = Alignment.BottomRight;
            this.a = ekoVar;
            this.b = alignment;
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj;
            return epx.f(this.a, badge.a) && this.b == badge.b && Float.compare(this.c, badge.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Badge(icon=");
            sb.append(this.a);
            sb.append(", alignment=");
            sb.append(this.b);
            sb.append(", offset=");
            return xq.c(')', this.c, sb);
        }
    }

    /* compiled from: VkTileImageView.kt */
    public static final class a implements VkTile.h {
        public final Size a;
        public final c b;
        public final Badge c;

        public a(Size size, c cVar, Badge badge, int i) {
            cVar = (i & 2) != 0 ? null : cVar;
            badge = (i & 4) != 0 ? null : badge;
            this.a = size;
            this.b = cVar;
            this.c = badge;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            Size size = this.a;
            int hashCode = (size == null ? 0 : size.hashCode()) * 31;
            c cVar = this.b;
            int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            Badge badge = this.c;
            return hashCode2 + (badge != null ? badge.hashCode() : 0);
        }

        public final String toString() {
            return "Params(customSize=" + this.a + ", image=" + this.b + ", badge=" + this.c + ')';
        }
    }

    /* compiled from: VkTileImageView.kt */
    public interface b {
        void a(c cVar);

        View getView();
    }

    /* compiled from: VkTileImageView.kt */
    public interface c {
    }

    /* compiled from: VkTileImageView.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Badge.Alignment.values().length];
            try {
                iArr[Badge.Alignment.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Badge.Alignment.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Badge.Alignment.BottomRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Badge.Alignment.BottomLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkTileImageView(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.ds_internal_horizontal_list_item_image, (ViewGroup) this, true);
        setClipChildren(false);
        this.b = (FrameLayout) findViewById(R.id.imageSlot);
        this.c = (AppCompatImageView) findViewById(R.id.badge);
    }

    public final void setImageController(b bVar) {
        FrameLayout frameLayout = this.b;
        frameLayout.removeAllViews();
        frameLayout.addView(bVar.getView(), new FrameLayout.LayoutParams(-1, -1));
        bVar.a(null);
        this.d = bVar;
    }
}
