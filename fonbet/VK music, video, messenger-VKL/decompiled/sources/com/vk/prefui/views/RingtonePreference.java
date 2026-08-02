package com.vk.prefui.views;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.vk.prefui.R$styleable;

/* loaded from: classes5.dex */
public class RingtonePreference extends Preference implements PreferenceManager.OnActivityResultListener {
    public RingtonePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, i, i2);
        obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.preference.PreferenceManager.OnActivityResultListener
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 0) {
            return false;
        }
        if (intent == null) {
            return true;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        if (!a(uri != null ? uri.toString() : "")) {
            return true;
        }
        E(uri != null ? uri.toString() : "");
        return true;
    }

    @Override // androidx.preference.Preference
    public final Object v(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void z(Object obj, boolean z) {
        String str = (String) obj;
        if (z || TextUtils.isEmpty(str)) {
            return;
        }
        Uri parse = Uri.parse(str);
        E(parse != null ? parse.toString() : "");
    }

    public RingtonePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public RingtonePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b);
        obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    public RingtonePreference(Context context) {
        this(context, null);
    }
}
