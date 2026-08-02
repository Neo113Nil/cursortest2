package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.sofascore.model.newNetwork.statistics.BaseballPitch;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k91 extends View {
    public final Drawable a;
    public List b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final Rect i;
    public final Paint j;
    public final Paint k;

    public k91(Context context) {
        super(context, null, 0);
        Typeface typeface;
        this.a = context.getDrawable(R.drawable.baseball_pitch_map);
        this.b = km5.a;
        this.c = ao2.s(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, context);
        this.d = ao2.s(194, context);
        this.e = ao2.s(60, context);
        this.f = ao2.s(12, context);
        this.g = ao2.s(4, context);
        this.h = ao2.u(7, context);
        float u = ao2.u(10, context);
        this.i = new Rect();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(context.getColor(R.color.red_fighter_default));
        this.j = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(context.getColor(R.color.surface_1));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(u);
        try {
            typeface = z1g.a(R.font.sofascore_sans_bold, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        paint2.setTypeface(typeface);
        this.k = paint2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Rect rect = this.i;
        float width = rect.width() / 2.0f;
        float height = rect.height() / 2.0f;
        int i = 0;
        for (Object obj : this.b) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            BaseballPitch baseballPitch = (BaseballPitch) obj;
            Integer pitchX = baseballPitch.getPitchX();
            Integer pitchY = baseballPitch.getPitchY();
            if (pitchX != null && pitchY != null) {
                int intValue = pitchY.intValue();
                float centerX = rect.centerX() - ((pitchX.intValue() / 100.0f) * width);
                int i3 = this.g;
                float f = this.h;
                float b = llf.b(centerX, i3 + f, (getWidth() - f) - i3);
                float b2 = llf.b(rect.centerY() - ((intValue / 100.0f) * height), i3 + f, (getHeight() - f) - i3);
                BaseballPitch baseballPitch2 = (BaseballPitch) CollectionsKt.a0(i - 1, this.b);
                int color = getContext().getColor(k53.k0(baseballPitch.getOutcome(), baseballPitch2 != null ? baseballPitch2.getStrikes() : null));
                Paint paint = this.j;
                paint.setColor(color);
                canvas.drawCircle(b, b2, f, paint);
                String valueOf = String.valueOf(baseballPitch.getPitchCount());
                Paint paint2 = this.k;
                canvas.drawText(valueOf, b, (paint2.getTextSize() / 3.0f) + b2, paint2);
            }
            i = i2;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.c;
        float f = i5;
        int i6 = this.d;
        float f2 = i6;
        float f3 = (i - f) / 2.0f;
        getContext().getClass();
        float s = (i2 - f2) - ao2.s(12, r2);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(new Rect(wzb.b(f3), wzb.b(s), wzb.b(f3 + f), wzb.b(s + f2)));
        }
        int i7 = this.f;
        float f4 = (i7 / i6) * f2;
        float f5 = (i7 / i5) * f;
        this.i.set(wzb.b(f3 + f5), wzb.b(f4 + s), wzb.b((f3 + f) - f5), wzb.b((s + f2) - ((this.e / i6) * f2)));
    }
}
