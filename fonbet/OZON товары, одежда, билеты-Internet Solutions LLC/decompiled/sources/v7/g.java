package v7;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class g {
    public static Typeface a(@NonNull Configuration configuration, @NonNull Typeface typeface) {
        int i11;
        int i12;
        int weight;
        int i13;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i11 = configuration.fontWeightAdjustment;
        if (i11 == Integer.MAX_VALUE) {
            return null;
        }
        i12 = configuration.fontWeightAdjustment;
        if (i12 == 0) {
            return null;
        }
        weight = typeface.getWeight();
        i13 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, com.google.common.primitives.e.b(i13 + weight, 1, 1000), typeface.isItalic());
        return create;
    }
}
