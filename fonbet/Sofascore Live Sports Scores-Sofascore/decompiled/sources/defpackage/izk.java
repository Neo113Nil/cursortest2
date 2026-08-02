package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.TextView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemTextStyle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class izk {
    public static final void a(TextView textView, BlazeWidgetItemTextStyle blazeWidgetItemTextStyle, BlazeInsets blazeInsets, Integer num) {
        BlazeDp lineHeight;
        textView.getClass();
        blazeWidgetItemTextStyle.getClass();
        blazeInsets.getClass();
        try {
            textView.setTextSize(blazeWidgetItemTextStyle.getTextSize());
            textView.setTextColor(blazeWidgetItemTextStyle.getTextColor());
            textView.setMaxLines(blazeWidgetItemTextStyle.getMaxLines());
            textView.setGravity(blazeWidgetItemTextStyle.getGravity());
            lz.z(blazeInsets.getStart().getToPx$blazesdk_release(), textView);
            lz.v(textView, blazeInsets.getEnd().getToPx$blazesdk_release());
            evl.v(blazeInsets.getTop().getToPx$blazesdk_release(), textView);
            evl.t(blazeInsets.getBottom().getToPx$blazesdk_release(), textView);
            Float letterSpacing = blazeWidgetItemTextStyle.getLetterSpacing();
            if (letterSpacing != null) {
                textView.setLetterSpacing(letterSpacing.floatValue());
            }
            setTypefaceFromResource$default(textView, blazeWidgetItemTextStyle.getFontResId(), null, null, 6, null);
            if (Build.VERSION.SDK_INT >= 29 && (lineHeight = blazeWidgetItemTextStyle.getLineHeight()) != null) {
                textView.setLineHeight(lineHeight.getToPx$blazesdk_release());
            }
            if (num != null) {
                int min = Math.min((num.intValue() - blazeInsets.getStart().getToPx$blazesdk_release()) - blazeInsets.getEnd().getToPx$blazesdk_release(), (int) textView.getPaint().measureText(textView.getText().toString()));
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = min;
                layoutParams.height = -2;
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static /* synthetic */ void applyBlazeTextStyle$default(TextView textView, BlazeWidgetItemTextStyle blazeWidgetItemTextStyle, BlazeInsets blazeInsets, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        a(textView, blazeWidgetItemTextStyle, blazeInsets, num);
    }

    public static final void b(TextView textView, Integer num, Integer num2, Typeface typeface) {
        Typeface a;
        Typeface create;
        textView.getClass();
        typeface.getClass();
        if (num != null) {
            try {
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT >= 28) {
                    a = z1g.a(intValue, textView.getContext());
                    if (num2 != null && (create = Typeface.create(a, num2.intValue())) != null) {
                        a = create;
                    }
                } else {
                    a = z1g.a(intValue, textView.getContext());
                }
                textView.setTypeface(a);
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                textView.setTypeface(typeface);
                return;
            }
        }
        a = typeface;
        textView.setTypeface(a);
    }

    public static /* synthetic */ void setTypefaceFromResource$default(TextView textView, Integer num, Integer num2, Typeface typeface, int i, Object obj) {
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            typeface = Typeface.DEFAULT_BOLD;
        }
        b(textView, num, num2, typeface);
    }
}
