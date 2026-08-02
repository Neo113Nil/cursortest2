package com.vk.movika.sdk.android.defaultplayer.control;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class s extends View implements q {
    public static final a Companion = new a();
    public final LinkedHashMap b;
    public final float c;

    public static final class a {
    }

    public static final class b {
        public final ValueAnimator a;
        public float b = 1.0f;
        public final Paint c;
        public final Paint d;

        public b(ValueAnimator valueAnimator, Paint paint, Paint paint2) {
            this.a = valueAnimator;
            this.c = paint;
            this.d = paint2;
        }
    }

    public static final class c {
        public final float a;
        public final float b;

        public c(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.a, cVar.a) == 0 && Float.compare(this.b, cVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Tap(x=" + this.a + ", y=" + this.b + ")";
        }
    }

    public s(Context context) {
        super(context);
        this.b = new LinkedHashMap();
        this.c = 20 * getResources().getDisplayMetrics().density;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        for (Map.Entry entry : this.b.entrySet()) {
            c cVar = (c) entry.getKey();
            b bVar = (b) entry.getValue();
            float f = cVar.a;
            float f2 = cVar.b;
            float f3 = bVar.b;
            float f4 = this.c;
            canvas.drawCircle(f, f2, f3 * f4, bVar.c);
            canvas.drawCircle(cVar.a, f2, f4 * bVar.b, bVar.d);
        }
    }
}
