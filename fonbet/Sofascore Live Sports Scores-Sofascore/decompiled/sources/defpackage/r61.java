package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.material.slider.RangeSlider;
import com.google.android.material.slider.b;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r61 extends aj6 {
    public final RangeSlider q;
    public final Rect r;

    public r61(RangeSlider rangeSlider) {
        super(rangeSlider);
        this.r = new Rect();
        this.q = rangeSlider;
    }

    @Override // defpackage.aj6
    public final int n(float f, float f2) {
        int i = 0;
        while (true) {
            RangeSlider rangeSlider = this.q;
            if (i >= rangeSlider.getValues().size()) {
                return -1;
            }
            Rect rect = this.r;
            rangeSlider.F(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.aj6
    public final void o(ArrayList arrayList) {
        int i = 0;
        while (i < this.q.getValues().size()) {
            i = lnb.f(i, arrayList, i, 1);
        }
    }

    @Override // defpackage.aj6
    public final boolean r(int i, int i2, Bundle bundle) {
        RangeSlider rangeSlider = this.q;
        if (!rangeSlider.isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !rangeSlider.D(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"), i)) {
                return false;
            }
            rangeSlider.G();
            rangeSlider.postInvalidate();
            return true;
        }
        float f = rangeSlider.u0;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 1.0f;
        }
        if ((rangeSlider.q0 - rangeSlider.p0) / f > 20.0f) {
            f *= Math.round(r0 / 20.0f);
        }
        if (i2 == 8192) {
            f = -f;
        }
        if (rangeSlider.s()) {
            f = -f;
        }
        if (!rangeSlider.D(s6a.s(rangeSlider.getValues().get(i).floatValue() + f, rangeSlider.getValueFrom(), rangeSlider.getValueTo()), i)) {
            return false;
        }
        rangeSlider.setActiveThumbIndex(i);
        y2 y2Var = rangeSlider.d1;
        rangeSlider.removeCallbacks(y2Var);
        rangeSlider.postDelayed(y2Var, rangeSlider.a1);
        rangeSlider.G();
        rangeSlider.postInvalidate();
        return true;
    }

    @Override // defpackage.aj6
    public final void t(int i, da daVar) {
        Object tag;
        AccessibilityNodeInfo accessibilityNodeInfo = daVar.a;
        daVar.b(x9.q);
        RangeSlider rangeSlider = this.q;
        List<Float> values = rangeSlider.getValues();
        float floatValue = values.get(i).floatValue();
        float valueFrom = rangeSlider.getValueFrom();
        float valueTo = rangeSlider.getValueTo();
        if (rangeSlider.isEnabled()) {
            if (floatValue > valueFrom) {
                daVar.a(8192);
            }
            if (floatValue < valueTo) {
                daVar.a(4096);
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        try {
            valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
            valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
            floatValue = numberInstance.parse(numberInstance.format(floatValue)).floatValue();
        } catch (ParseException unused) {
            int i2 = b.f1;
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue));
        daVar.k(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (rangeSlider.getContentDescription() != null) {
            sb.append(rangeSlider.getContentDescription());
            sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        }
        String format = String.format(((float) ((int) floatValue)) == floatValue ? "%.0f" : "%.2f", Float.valueOf(floatValue));
        String string = rangeSlider.getContext().getString(R.string.material_slider_value);
        if (values.size() > 1) {
            string = i == rangeSlider.getValues().size() - 1 ? rangeSlider.getContext().getString(R.string.material_slider_range_end) : i == 0 ? rangeSlider.getContext().getString(R.string.material_slider_range_start) : "";
        }
        WeakHashMap weakHashMap = bsk.a;
        if (Build.VERSION.SDK_INT >= 30) {
            tag = yrk.b(rangeSlider);
        } else {
            tag = rangeSlider.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (TextUtils.isEmpty(charSequence)) {
            Locale.getDefault();
            sb.append(string + ", " + format);
        } else {
            daVar.r(charSequence);
        }
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.r;
        rangeSlider.F(i, rect);
        daVar.i(rect);
    }
}
