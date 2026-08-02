package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.view.contentcapture.ContentCaptureSession;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class vp2 implements h72, b75, x06 {
    public final /* synthetic */ int a;

    public /* synthetic */ vp2(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession a(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void b(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void c(Object obj, String str) {
        throw new zfa(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void d(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void e(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void f(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.h72
    public i72 g(Bundle bundle) {
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        boolean z = true;
        switch (this.a) {
            case 1:
                return new v13(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
            default:
                CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
                CharSequence charSequence2 = charSequence != null ? charSequence : null;
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
                Bitmap bitmap2 = bitmap != null ? bitmap : null;
                if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
                    f = bundle.getFloat(Integer.toString(4, 36));
                    i = bundle.getInt(Integer.toString(5, 36));
                } else {
                    f = -3.4028235E38f;
                    i = Integer.MIN_VALUE;
                }
                int i4 = bundle.containsKey(Integer.toString(6, 36)) ? bundle.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
                float f3 = bundle.containsKey(Integer.toString(7, 36)) ? bundle.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
                int i5 = bundle.containsKey(Integer.toString(8, 36)) ? bundle.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
                if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
                    f2 = bundle.getFloat(Integer.toString(10, 36));
                    i2 = bundle.getInt(Integer.toString(9, 36));
                } else {
                    f2 = -3.4028235E38f;
                    i2 = Integer.MIN_VALUE;
                }
                float f4 = bundle.containsKey(Integer.toString(11, 36)) ? bundle.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
                float f5 = bundle.containsKey(Integer.toString(12, 36)) ? bundle.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    i3 = bundle.getInt(Integer.toString(13, 36));
                } else {
                    i3 = -16777216;
                    z = false;
                }
                return new l74(charSequence2, alignment2, alignment4, bitmap2, f, i, i4, f3, i5, i2, f2, f4, f5, !bundle.getBoolean(Integer.toString(14, 36), false) ? false : z, i3, bundle.containsKey(Integer.toString(15, 36)) ? bundle.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle.containsKey(Integer.toString(16, 36)) ? bundle.getFloat(Integer.toString(16, 36)) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // defpackage.b75
    public double h(double d) {
        switch (this.a) {
            case 4:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 5:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 6:
                float[] fArr = l23.a;
                return l23.b(l23.c, d);
            case 7:
                float[] fArr2 = l23.a;
                return l23.a(l23.c, d);
            case 8:
                float[] fArr3 = l23.a;
                return l23.d(l23.d, d);
            default:
                float[] fArr4 = l23.a;
                return l23.c(l23.d, d);
        }
    }
}
