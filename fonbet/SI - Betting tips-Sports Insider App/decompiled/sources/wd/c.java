package wd;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sports.insider.domain.entity.CustomTypefaceSpan;
import gf.k;
import gf.t;
import hd.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pd.v;
import za.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public String f25251a = "en";

    /* renamed from: b, reason: collision with root package name */
    public final t f25252b;

    /* renamed from: c, reason: collision with root package name */
    public final float f25253c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25254d;

    /* renamed from: e, reason: collision with root package name */
    public final b f25255e;

    public c() {
        t b10 = k.b(new v(27));
        this.f25252b = b10;
        ((zc.k) b10.getValue()).getClass();
        this.f25253c = yg.a.b(((i) zc.k.e()).f25901a, "getDisplayMetrics(...)").density;
        this.f25254d = Color.parseColor("#8a000000");
        this.f25255e = new b("•", 0, 0, 0, 5, 0, Boolean.FALSE, null, 4, null, null, 217340);
    }

    public static void e(c cVar, SpannableStringBuilder spannableStringBuilder, int i5, int i10, CustomTypefaceSpan customTypefaceSpan) {
        try {
            spannableStringBuilder.setSpan(customTypefaceSpan, i5, i10, 18);
        } catch (Exception unused) {
        }
    }

    public abstract void a(LinearLayout linearLayout);

    public final LinearLayout b(Context context, a data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        LinearLayout linearLayout = new LinearLayout(context);
        data.getClass();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f6 = this.f25253c;
        int i5 = (int) (16 * f6);
        layoutParams.setMargins(i5, (int) (data.f25234a * f6), i5, (int) (0 * f6));
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    public abstract int c();

    public final TextView d(Context context, b data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        TextView textView = new TextView(context);
        int i5 = data.f25236b;
        String str = data.f25250r;
        boolean z5 = data.f25249p;
        float f6 = this.f25253c;
        if (i5 >= 0) {
            i5 = (int) (i5 * f6);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, -2);
        layoutParams.setMargins((int) (data.f25238d * f6), (int) (data.f25239e * f6), (int) (data.f25240f * f6), (int) (data.f25241g * f6));
        textView.setLayoutParams(layoutParams);
        textView.setPaddingRelative((int) (data.f25242h * f6), (int) (data.f25243i * f6), (int) (data.j * f6), (int) (data.f25244k * f6));
        textView.setTextSize(data.f25237c);
        if (z5) {
            textView.setTypeface(textView.getTypeface(), 2);
        }
        CharSequence charSequence = data.f25235a;
        if (str != null) {
            int G = StringsKt.G(charSequence, str, 0, false, 6);
            int length = str.length();
            int i10 = G + length;
            if (G >= 0 && length >= 3) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.setSpan(new f(str), G, i10, 33);
                charSequence = SpannableString.valueOf(spannableStringBuilder);
            }
        }
        textView.setText(charSequence);
        textView.setTextColor(data.f25245l);
        t tVar = this.f25252b;
        if (!z5) {
            try {
                if (data.f25246m.booleanValue()) {
                    ((zc.k) tVar.getValue()).getClass();
                    CustomTypefaceSpan b10 = zc.k.b();
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(textView.getText());
                    Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
                    e(this, valueOf, 0, textView.getText().length(), b10);
                    textView.setText(valueOf);
                } else {
                    ((zc.k) tVar.getValue()).getClass();
                    CustomTypefaceSpan d10 = zc.k.d();
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(textView.getText());
                    Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(...)");
                    e(this, valueOf2, 0, textView.getText().length(), d10);
                    textView.setText(valueOf2);
                }
            } catch (Exception unused) {
            }
        }
        Integer num = data.f25247n;
        if (num != null) {
            textView.setGravity(num.intValue());
        }
        Integer num2 = data.f25248o;
        if (num2 != null) {
            textView.setTextAlignment(num2.intValue());
        }
        String str2 = data.q;
        if (str2 != null) {
            try {
                CharSequence text = textView.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                int G2 = StringsKt.G(text, str2, 0, false, 4);
                if (G2 > -1) {
                    ((zc.k) tVar.getValue()).getClass();
                    CustomTypefaceSpan b11 = zc.k.b();
                    SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(textView.getText());
                    Intrinsics.checkNotNullExpressionValue(valueOf3, "valueOf(...)");
                    e(this, valueOf3, G2, str2.length() + G2, b11);
                    textView.setText(valueOf3);
                }
            } catch (Exception unused2) {
            }
        }
        return textView;
    }
}
