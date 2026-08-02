package defpackage;

import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vl6 implements Runnable {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public vl6(View view, TextView textView, String str, String str2, int i, int i2) {
        this.a = textView;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.a;
        TextPaint paint = textView.getPaint();
        paint.getClass();
        String unicodeWrap = BidiFormatter.getInstance().unicodeWrap(this.b);
        StringBuilder p = bf3.p(unicodeWrap, "  ");
        String str = this.c;
        p.append(str);
        float measureText = paint.measureText(p.toString());
        float width = (textView.getWidth() - textView.getPaddingStart()) - textView.getPaddingEnd();
        if (measureText > width) {
            float measureText2 = (width - paint.measureText("  " + str)) - paint.measureText("...");
            unicodeWrap.getClass();
            char[] charArray = unicodeWrap.toCharArray();
            charArray.getClass();
            String str2 = "";
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (char c : charArray) {
                f += paint.measureText(String.valueOf(c));
                if (f > measureText2) {
                    break;
                }
                str2 = str2 + c;
            }
            unicodeWrap = str2.concat("...");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wv8.i(unicodeWrap, "  ", str));
        int color = textView.getContext().getColor(this.d);
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(this.e);
        int length = unicodeWrap.length() + 2;
        int length2 = str.length() + length;
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(dimensionPixelSize), length, length2, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), length, length2, 33);
        textView.setText(spannableStringBuilder);
    }
}
