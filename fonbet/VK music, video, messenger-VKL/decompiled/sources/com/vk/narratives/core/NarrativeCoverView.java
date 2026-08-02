package com.vk.narratives.core;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.core.serialize.Serializer;
import com.vk.dto.narratives.Narrative;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.dhr0;
import xsna.f4m;
import xsna.iah0;
import xsna.l8g;
import xsna.njt;
import xsna.zrp;

/* compiled from: NarrativeCoverView.kt */
/* loaded from: classes3.dex */
public final class NarrativeCoverView extends FrameLayout {
    public static final int j = iah0.a(1);
    public BorderType b;
    public boolean c;
    public final VKImageView d;
    public final ImageView e;
    public final TextView f;
    public Narrative g;
    public final Paint h;
    public boolean i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NarrativeCoverView.kt */
    public static final class BorderType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BorderType[] $VALUES;
        public static final BorderType BLUE;
        public static final BorderType WHITE;

        static {
            BorderType borderType = new BorderType("WHITE", 0);
            WHITE = borderType;
            BorderType borderType2 = new BorderType("BLUE", 1);
            BLUE = borderType2;
            BorderType[] borderTypeArr = {borderType, borderType2};
            $VALUES = borderTypeArr;
            $ENTRIES = new asp(borderTypeArr);
        }

        public BorderType() {
            throw null;
        }

        public static BorderType valueOf(String str) {
            return (BorderType) Enum.valueOf(BorderType.class, str);
        }

        public static BorderType[] values() {
            return (BorderType[]) $VALUES.clone();
        }
    }

    /* compiled from: NarrativeCoverView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BorderType.values().length];
            try {
                iArr[BorderType.WHITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BorderType.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NarrativeCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = BorderType.WHITE;
        this.c = true;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(iah0.b(1.0f));
        this.h = paint;
        LayoutInflater.from(context).inflate(R.layout.view_narrative_cover, this);
        VKImageView vKImageView = (VKImageView) findViewById(R.id.image);
        this.d = vKImageView;
        njt hierarchy = vKImageView.getHierarchy();
        RoundingParams a2 = RoundingParams.a();
        a2.c(iah0.b(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        hierarchy.u(a2);
        this.e = (ImageView) findViewById(R.id.access_image);
        this.f = (TextView) findViewById(R.id.count);
        b();
        setWillNotDraw(false);
    }

    private final void setShouldDrawBorder(boolean z) {
        if (z != this.i) {
            this.i = z;
            invalidate();
        }
    }

    public final void a(Narrative narrative) {
        this.g = narrative;
        Serializer.c<Narrative> cVar = Narrative.CREATOR;
        String b = Narrative.a.b(narrative, iah0.a(64));
        ImageView imageView = this.e;
        VKImageView vKImageView = this.d;
        if (b == null) {
            vKImageView.clear();
            vKImageView.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
            vKImageView.load(null);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            float f = 28;
            layoutParams.width = iah0.a(f);
            layoutParams.height = iah0.a(f);
            imageView.setLayoutParams(layoutParams);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.vk_icon_narrative_active_outline_24);
            setShouldDrawBorder(false);
        } else if (narrative.Ab()) {
            vKImageView.setBackground(null);
            vKImageView.setPlaceholderImage(R.drawable.bg_narrative_cover_placeholder);
            vKImageView.load(b);
            f4m.j(imageView);
            setShouldDrawBorder(true);
        } else {
            vKImageView.clear();
            vKImageView.getHierarchy().p(null, 1);
            vKImageView.setBackgroundResource(R.drawable.narrative_cover_unavailable);
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            float f2 = 24;
            layoutParams2.width = iah0.a(f2);
            layoutParams2.height = iah0.a(f2);
            imageView.setLayoutParams(layoutParams2);
            imageView.setVisibility(0);
            if (narrative.h) {
                imageView.setImageResource(R.drawable.vk_icon_delete_24);
            } else {
                imageView.setImageResource(R.drawable.vk_icon_report_24);
            }
            setShouldDrawBorder(false);
        }
        f4m.j(this.f);
    }

    public final void b() {
        int f;
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            f = l8g.f(0.4f, -1);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = dhr0.t.c(R.attr.vk_ui_icon_tertiary);
        }
        this.h.setColor(f);
        if (this.i) {
            invalidate();
        }
    }

    public final boolean getAllowReduceBorderSize() {
        return this.c;
    }

    public final BorderType getBorderType() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.i) {
            float measuredWidth = getMeasuredWidth() / 2.0f;
            Paint paint = this.h;
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (measuredWidth - (paint.getStrokeWidth() / 2.0f)) - ((this.g == null || !this.c) ? 0 : j), paint);
        }
    }

    public final void setAllowReduceBorderSize(boolean z) {
        this.c = z;
    }

    public final void setBorderType(BorderType borderType) {
        if (this.b != borderType) {
            this.b = borderType;
            b();
        }
    }
}
