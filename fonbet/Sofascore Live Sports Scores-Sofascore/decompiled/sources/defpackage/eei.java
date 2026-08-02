package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eei {
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public boolean k;
    public fei m;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;
    public float g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float h = 1.0f;
    public int i = 1;
    public boolean j = true;
    public TextUtils.TruncateAt l = null;

    public eei(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        int i = this.f;
        TextPaint textPaint = this.b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.l);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.k && this.f == 1) {
            this.e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.e);
        obtain.setIncludePad(this.j);
        obtain.setTextDirection(this.k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f);
        float f = this.g;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.h != 1.0f) {
            obtain.setLineSpacing(f, this.h);
        }
        if (this.f > 1) {
            obtain.setHyphenationFrequency(this.i);
        }
        fei feiVar = this.m;
        if (feiVar != null) {
            TextInputLayout textInputLayout = (TextInputLayout) ((imf) feiVar).b;
            int[][] iArr = TextInputLayout.D0;
            obtain.setBreakStrategy(textInputLayout.u.getBreakStrategy());
        }
        return obtain.build();
    }
}
