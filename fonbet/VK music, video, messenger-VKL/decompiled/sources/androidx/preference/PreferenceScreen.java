package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import xsna.ytp0;

/* loaded from: classes12.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean Y;

    public PreferenceScreen(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, ytp0.a(R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle, context));
        this.Y = true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.Fragment, androidx.preference.e$b] */
    @Override // androidx.preference.Preference
    public final void t() {
        ?? r0;
        if (this.o != null || this.p != null || this.S.size() == 0 || (r0 = this.c.j) == 0) {
            return;
        }
        r0.onNavigateToScreen(this);
    }
}
