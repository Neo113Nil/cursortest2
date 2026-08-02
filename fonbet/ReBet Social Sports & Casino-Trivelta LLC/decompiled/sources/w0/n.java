package w0;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class n {
    public static final SpannedString a(Function1 function1) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        function1.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }
}
