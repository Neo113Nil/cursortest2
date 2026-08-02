package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import xsna.tyc0;
import xsna.ytp0;

/* loaded from: classes12.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public final boolean L() {
        return !super.n();
    }

    @Override // androidx.preference.Preference
    public final boolean n() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void s(@NonNull tyc0 tyc0Var) {
        super.s(tyc0Var);
        tyc0Var.itemView.setAccessibilityHeading(true);
    }

    public PreferenceCategory(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ytp0.a(R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle, context));
    }

    public PreferenceCategory(@NonNull Context context) {
        this(context, null);
    }
}
