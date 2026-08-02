package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import xsna.ytp0;

/* loaded from: classes12.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence Q;
    public final String R;
    public final Drawable S;
    public final String T;
    public final String U;
    public final int V;

    public interface a {
        @Nullable
        <T extends Preference> T findPreference(@NonNull CharSequence charSequence);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c, i, i2);
        String string = obtainStyledAttributes.getString(9);
        string = string == null ? obtainStyledAttributes.getString(0) : string;
        this.Q = string;
        if (string == null) {
            this.Q = this.j;
        }
        String string2 = obtainStyledAttributes.getString(8);
        this.R = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.S = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = obtainStyledAttributes.getString(11);
        this.T = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        String string4 = obtainStyledAttributes.getString(10);
        this.U = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        this.V = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, androidx.preference.e$a] */
    @Override // androidx.preference.Preference
    public void t() {
        ?? r0 = this.c.i;
        if (r0 != 0) {
            r0.onDisplayPreferenceDialog(this);
        }
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ytp0.a(R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle, context));
    }

    public DialogPreference(@NonNull Context context) {
        this(context, null);
    }
}
