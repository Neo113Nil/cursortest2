package com.vk.photo.editor.markup.view.tools;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.markup.view.tools.BrushView;
import com.vkontakte.android.R;
import xsna.a11;
import xsna.asp;
import xsna.k1;
import xsna.vw0;
import xsna.y01;
import xsna.z01;
import xsna.zrp;

/* compiled from: BrushesPanel.kt */
/* loaded from: classes4.dex */
public final class BrushesPanel extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public a b;
    public final BrushView c;
    public final BrushView d;
    public final BrushView e;
    public final BrushView f;
    public final BrushView g;
    public BrushType h;
    public int i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BrushesPanel.kt */
    public static final class BrushType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BrushType[] $VALUES;
        public static final BrushType Arrow;
        public static final BrushType Eraser;
        public static final BrushType Glow;
        public static final BrushType Marker;
        public static final BrushType Pen;

        static {
            BrushType brushType = new BrushType("Pen", 0);
            Pen = brushType;
            BrushType brushType2 = new BrushType("Arrow", 1);
            Arrow = brushType2;
            BrushType brushType3 = new BrushType("Marker", 2);
            Marker = brushType3;
            BrushType brushType4 = new BrushType("Glow", 3);
            Glow = brushType4;
            BrushType brushType5 = new BrushType("Eraser", 4);
            Eraser = brushType5;
            BrushType[] brushTypeArr = {brushType, brushType2, brushType3, brushType4, brushType5};
            $VALUES = brushTypeArr;
            $ENTRIES = new asp(brushTypeArr);
        }

        public BrushType() {
            throw null;
        }

        public static BrushType valueOf(String str) {
            return (BrushType) Enum.valueOf(BrushType.class, str);
        }

        public static BrushType[] values() {
            return (BrushType[]) $VALUES.clone();
        }
    }

    /* compiled from: BrushesPanel.kt */
    public interface a {
        void c(BrushType brushType);
    }

    public BrushesPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = BrushType.Pen;
        this.i = -1;
        LayoutInflater.from(context).inflate(R.layout.internal_brushes_panel, (ViewGroup) this, true);
        BrushView brushView = (BrushView) findViewById(R.id.pen_brush);
        this.c = brushView;
        BrushView brushView2 = (BrushView) findViewById(R.id.arrow_brush);
        this.e = brushView2;
        BrushView brushView3 = (BrushView) findViewById(R.id.marker_brush);
        this.d = brushView3;
        BrushView brushView4 = (BrushView) findViewById(R.id.glow_brush);
        this.f = brushView4;
        BrushView brushView5 = (BrushView) findViewById(R.id.eraser_brush);
        this.g = brushView5;
        e(false);
        brushView.setOnClickListener(new k1(this, 5));
        brushView3.setOnClickListener(new vw0(this, 3));
        brushView4.setOnClickListener(new y01(this, 5));
        int i = 2;
        brushView5.setOnClickListener(new z01(this, i));
        brushView2.setOnClickListener(new a11(this, i));
        setContentDescription(getResources().getString(R.string.brush_panel_accessibility_description));
    }

    public static final void c(BrushView brushView, BrushesPanel brushesPanel, int i, BrushType brushType) {
        if (brushType == brushesPanel.h) {
            brushView.setCapColor(i);
            return;
        }
        brushView.getClass();
        brushView.f = BrushView.a.Reset;
        brushView.b(brushView.d, brushView.i);
        brushView.b(brushView.b, brushView.g);
    }

    public static final float d(BrushesPanel brushesPanel, BrushType brushType) {
        return brushType == brushesPanel.h ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (int) Math.floor(24 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final float f(BrushesPanel brushesPanel, BrushType brushType) {
        return brushType == brushesPanel.h ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (int) Math.floor(24 * Resources.getSystem().getDisplayMetrics().density);
    }

    private final void setCapColor(int i) {
        c(this.c, this, i, BrushType.Pen);
        c(this.e, this, i, BrushType.Arrow);
        c(this.d, this, i, BrushType.Marker);
        c(this.f, this, i, BrushType.Glow);
    }

    public final void a(boolean z) {
        BrushView brushView = this.e;
        BrushView brushView2 = this.g;
        BrushView brushView3 = this.f;
        BrushView brushView4 = this.d;
        BrushView brushView5 = this.c;
        if (z) {
            brushView5.animate().translationY(d(this, BrushType.Pen));
            brushView4.animate().translationY(d(this, BrushType.Marker));
            brushView3.animate().translationY(d(this, BrushType.Glow));
            brushView2.animate().translationY(d(this, BrushType.Eraser));
            brushView.animate().translationY(d(this, BrushType.Arrow));
            return;
        }
        float floor = (int) Math.floor(72 * Resources.getSystem().getDisplayMetrics().density);
        brushView5.animate().translationY(floor);
        brushView4.animate().translationY(floor);
        brushView3.animate().translationY(floor);
        brushView2.animate().translationY(floor);
        brushView.animate().translationY(floor);
    }

    public final void b(BrushType brushType) {
        setCurrentBrush(brushType);
        a aVar = this.b;
        if (aVar != null) {
            aVar.c(brushType);
        }
    }

    public final void e(boolean z) {
        setCapColor(this.i);
        BrushView brushView = this.e;
        BrushView brushView2 = this.g;
        BrushView brushView3 = this.f;
        BrushView brushView4 = this.d;
        BrushView brushView5 = this.c;
        if (z) {
            brushView5.animate().translationY(f(this, BrushType.Pen));
            brushView4.animate().translationY(f(this, BrushType.Marker));
            brushView3.animate().translationY(f(this, BrushType.Glow));
            brushView2.animate().translationY(f(this, BrushType.Eraser));
            brushView.animate().translationY(f(this, BrushType.Arrow));
            return;
        }
        brushView5.setTranslationY(f(this, BrushType.Pen));
        brushView4.setTranslationY(f(this, BrushType.Marker));
        brushView3.setTranslationY(f(this, BrushType.Glow));
        brushView2.setTranslationY(f(this, BrushType.Eraser));
        brushView.setTranslationY(f(this, BrushType.Arrow));
    }

    public final BrushType getCurrentBrush() {
        return this.h;
    }

    public final int getCurrentColor() {
        return this.i;
    }

    public final void setCurrentBrush(BrushType brushType) {
        this.h = brushType;
        e(true);
    }

    public final void setCurrentColor(int i) {
        this.i = i;
        setCapColor(i);
    }

    public final void setListener(a aVar) {
        this.b = aVar;
    }
}
