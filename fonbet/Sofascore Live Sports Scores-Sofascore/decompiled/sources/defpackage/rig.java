package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rig extends LinearLayout {
    public final String a;
    public Function1 b;
    public final RadioGroup c;
    public final int d;

    public rig(Context context, String str, List list) {
        super(context);
        this.a = str;
        RadioGroup radioGroup = new RadioGroup(context);
        this.c = radioGroup;
        ScrollView scrollView = new ScrollView(context);
        int applyDimension = (int) TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics());
        this.d = applyDimension;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText("Do you consider this ad as inappropriate? If yes, please provide the reason.");
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(applyDimension, applyDimension, applyDimension, applyDimension);
        Unit unit = Unit.a;
        addView(textView, marginLayoutParams);
        addView(scrollView, new ViewGroup.MarginLayoutParams(-1, -2));
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams2.setMargins(applyDimension, 0, 0, 0);
        scrollView.addView(radioGroup, marginLayoutParams2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yig yigVar = (yig) it.next();
            RadioGroup radioGroup2 = this.c;
            RadioButton radioButton = new RadioButton(context);
            radioButton.setText(yigVar.b);
            radioButton.setTag(Integer.valueOf(yigVar.a));
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
            int i = this.d;
            marginLayoutParams3.setMargins(i, 0, 0, i);
            radioButton.setLayoutParams(marginLayoutParams3);
            radioButton.setOnCheckedChangeListener(new fjf(1, this, yigVar));
            radioGroup2.addView(radioButton);
        }
        TextView textView2 = new TextView(context);
        textView2.setText(String.format("(SDK version %s)", Arrays.copyOf(new Object[]{this.a}, 1)));
        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
        int i2 = this.d;
        marginLayoutParams4.setMargins(i2, i2, i2, i2);
        Unit unit2 = Unit.a;
        addView(textView2, marginLayoutParams4);
    }

    @Nullable
    public final Function1<yig, Unit> getReasonChangeListener() {
        return this.b;
    }

    public final void setReasonChangeListener(@Nullable Function1<? super yig, Unit> function1) {
        this.b = function1;
    }
}
