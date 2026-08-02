package com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SizeF;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollContentColor;
import com.vk.dto.polls.PollOption;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.polls.ui.PollStyle;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.InteractivePollStickerView;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.e43;
import xsna.epx;
import xsna.iah0;
import xsna.ifg;
import xsna.iz8;
import xsna.j5g;
import xsna.pdq;
import xsna.uov;
import xsna.urd0;
import xsna.w2l0;
import xsna.wrb0;
import xsna.xx1;

/* compiled from: InteractivePollStickerDelegate.kt */
/* loaded from: classes6.dex */
public final class a {
    public final uov a;
    public final FrameLayout b;
    public final ifg c;
    public final w2l0 d;
    public iz8 e;
    public C1837a f;
    public final wrb0 g = new wrb0();

    /* compiled from: InteractivePollStickerDelegate.kt */
    /* renamed from: com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.a$a, reason: collision with other inner class name */
    public static final class C1837a {
        public final ClickableStickers a;
        public final String b;
        public final String c;
        public final boolean d;

        public C1837a(ClickableStickers clickableStickers, String str, String str2, boolean z) {
            this.a = clickableStickers;
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1837a)) {
                return false;
            }
            C1837a c1837a = (C1837a) obj;
            return epx.f(this.a, c1837a.a) && epx.f(this.b, c1837a.b) && epx.f(this.c, c1837a.c) && this.d == c1837a.d;
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return Boolean.hashCode(this.d) + ((a + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PollOpeningParams(clickableStickers=");
            sb.append(this.a);
            sb.append(", ref=");
            sb.append(this.b);
            sb.append(", trackCode=");
            sb.append(this.c);
            sb.append(", fitCenter=");
            return q0.a(sb, this.d, ')');
        }
    }

    public a(uov uovVar, FrameLayout frameLayout, ifg ifgVar, w2l0 w2l0Var) {
        this.a = uovVar;
        this.b = frameLayout;
        this.c = ifgVar;
        this.d = w2l0Var;
    }

    public final void a(ClickableStickers clickableStickers, String str, String str2, boolean z) {
        int i;
        String string;
        float f;
        int i2;
        int i3;
        float f2;
        int i4;
        int a;
        int a2;
        int a3;
        if (this.e == null) {
            this.f = new C1837a(clickableStickers, str, str2, z);
            return;
        }
        ClickablePoll clickablePoll = (ClickablePoll) j5g.Y((List) clickableStickers.i.getValue());
        Point point = new Point(clickableStickers.b, clickableStickers.c);
        InteractivePollStickerView.b bVar = new InteractivePollStickerView.b(str, str2);
        Poll poll = clickablePoll.e.b;
        if (poll != null) {
            Poll a4 = pdq.a(poll);
            PollBackground pollBackground = a4.s;
            if (this.e == null) {
                return;
            }
            uov uovVar = this.a;
            InteractivePollStickerView interactivePollStickerView = new InteractivePollStickerView(uovVar.getCtx(), uovVar.getView(), bVar, new b(clickablePoll, this), this.d);
            interactivePollStickerView.a(a4, true);
            List<WebClickablePoint> list = clickablePoll.c;
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r3.a, r3.b);
            Matrix matrix = new Matrix();
            xx1.g(matrix, new SizeF(rectF.width(), rectF.height()), rectF.top, new SizeF(point.x, point.y), !z);
            int size = list.size();
            float[] fArr = new float[size * 2];
            for (int i5 = 0; i5 < size; i5++) {
                int i6 = i5 * 2;
                fArr[i6] = list.get(i5).b;
                fArr[i6 + 1] = list.get(i5).c;
            }
            matrix.mapPoints(fArr);
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < size; i7++) {
                int i8 = i7 * 2;
                arrayList.add(new WebClickablePoint((int) Math.ceil(fArr[i8]), (int) Math.ceil(fArr[i8 + 1])));
            }
            int i9 = 2;
            PointF pointF = new PointF((float) Math.sqrt(Math.pow(((WebClickablePoint) arrayList.get(1)).c - ((WebClickablePoint) arrayList.get(0)).c, 2.0d) + Math.pow(((WebClickablePoint) arrayList.get(1)).b - ((WebClickablePoint) arrayList.get(0)).b, 2.0d)), (float) Math.sqrt(Math.pow(((WebClickablePoint) arrayList.get(2)).c - ((WebClickablePoint) arrayList.get(1)).c, 2.0d) + Math.pow(((WebClickablePoint) arrayList.get(2)).b - ((WebClickablePoint) arrayList.get(1)).b, 2.0d)));
            Iterator it = arrayList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 += ((WebClickablePoint) it.next()).b;
            }
            float f3 = i10 / 4.0f;
            Iterator it2 = arrayList.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                i11 += ((WebClickablePoint) it2.next()).c;
            }
            PointF pointF2 = new PointF(f3, i11 / 4.0f);
            int a5 = iah0.a(264);
            boolean z2 = pollBackground instanceof PollContentColor;
            PollStyle pollStyle = z2 ? PollStyle.CONTENT_COLOR : PollStyle.DYNAMIC;
            float f4 = 12;
            int a6 = a5 - (iah0.a(f4) * 2);
            PollStyle pollStyle2 = PollStyle.CONTENT_COLOR;
            int a7 = (pollStyle == pollStyle2 || z2) ? 0 : iah0.a(50);
            int a8 = pollStyle == pollStyle2 ? iah0.a(16) : iah0.a(f4);
            String str3 = a4.d;
            this.g.getClass();
            int height = wrb0.d(a6, wrb0.c(pollStyle), str3).getHeight();
            FrameLayout frameLayout = this.b;
            Context context = frameLayout.getContext();
            if (a4.isExpired() && z2) {
                i = height;
                string = context.getString(R.string.poll_expired_status);
            } else {
                i = height;
                string = a4.i ? context.getString(R.string.poll_anonymous) : null;
            }
            if (string == null) {
                f = f4;
                i2 = a7;
                i3 = a8;
                i4 = 4;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                a = 0;
            } else {
                TextPaint textPaint = new TextPaint(1);
                f = f4;
                i2 = a7;
                i3 = a8;
                com.vk.typography.b.c(textPaint, uovVar.getCtx(), FontFamily.REGULAR, Float.valueOf(iah0.b(13.0f)), TextSizeUnit.PX);
                StaticLayout.Builder includePad = StaticLayout.Builder.obtain(string, 0, string.length(), textPaint, a6).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false);
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                i4 = 4;
                a = iah0.a(4) + includePad.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).build().getHeight();
            }
            TextPaint a9 = wrb0.a(pollStyle);
            if (pollStyle != pollStyle2) {
                i4 = 8;
            }
            int a10 = iah0.a(i4);
            float b = iah0.b(pollStyle == pollStyle2 ? 10.0f : 9.0f);
            int a11 = ((a5 - (iah0.a(f) * 2)) - iah0.a(f)) - iah0.a(60);
            float f5 = f2;
            int i12 = 0;
            for (Object obj : a4.f) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    e43.t();
                    throw null;
                }
                Poll poll2 = a4;
                PollOption pollOption = (PollOption) obj;
                int i14 = a10;
                int i15 = i12;
                StaticLayout b2 = wrb0.b(pollOption.c, (int) StrictMath.min(a11, a9.measureText(pollOption.c)), a9, pollStyle);
                f5 += (i9 * b) + b2.getHeight() + (i15 == 0 ? 0 : i14);
                a4 = poll2;
                a10 = i14;
                i12 = i13;
                a9 = a9;
                i9 = 2;
            }
            Poll poll3 = a4;
            interactivePollStickerView.measure(View.MeasureSpec.makeMeasureSpec(a5, 1073741824), View.MeasureSpec.makeMeasureSpec(i2 + i3 + i + a + (pollStyle == PollStyle.CONTENT_COLOR ? iah0.a(17) : iah0.a(f)) + ((int) f5) + iah0.a(f), 1073741824));
            float measuredWidth = interactivePollStickerView.getMeasuredWidth() / pointF.x;
            PointF pointF3 = new PointF((float) Math.ceil(pointF.x * measuredWidth), (float) Math.ceil((interactivePollStickerView.getMeasuredHeight() / measuredWidth) * measuredWidth));
            boolean z3 = (poll3.Ib() && !poll3.Kb()) || (poll3.Ib() && poll3.Kb() && poll3.Ab());
            if (z2) {
                a2 = iah0.a(36);
                a3 = iah0.a(16);
            } else {
                a2 = iah0.a(30);
                a3 = iah0.a(f);
            }
            int i16 = a3 + a2;
            if (!z3) {
                i16 = 0;
            }
            interactivePollStickerView.setLayoutParams(new FrameLayout.LayoutParams((int) pointF3.x, ((int) pointF3.y) + i16));
            frameLayout.addView(interactivePollStickerView);
            float f6 = 2;
            float ceil = (float) Math.ceil(pointF2.x - (pointF3.x / f6));
            float ceil2 = (float) Math.ceil(pointF2.y - ((pointF3.y + i16) / f6));
            interactivePollStickerView.setTranslationX(ceil);
            interactivePollStickerView.setTranslationY(ceil2);
            float ceil3 = (float) Math.ceil(pointF2.y - (pointF3.y / f6));
            interactivePollStickerView.o = ceil;
            interactivePollStickerView.p = ceil3;
            float f7 = 1 / measuredWidth;
            interactivePollStickerView.setScaleX(f7);
            interactivePollStickerView.setScaleY(f7);
            Point point2 = new Point(((WebClickablePoint) arrayList.get(1)).b - ((WebClickablePoint) arrayList.get(0)).b, ((WebClickablePoint) arrayList.get(1)).c - ((WebClickablePoint) arrayList.get(0)).c);
            Point point3 = new Point(1, 0);
            int i17 = point2.x;
            int i18 = point3.y;
            int i19 = point2.y;
            int i20 = point3.x;
            int i21 = (i17 * i18) - (i19 * i20);
            double d = (i18 * i19) + (i20 * i17);
            double sqrt = Math.sqrt((i19 * i19) + (i17 * i17));
            int i22 = point3.x;
            int i23 = point3.y;
            float degrees = (float) Math.toDegrees(Math.acos(d / (Math.sqrt((i23 * i23) + (i22 * i22)) * sqrt)));
            if (i21 > 0) {
                degrees = -degrees;
            }
            interactivePollStickerView.setRotation(degrees);
        }
    }
}
