package com.logrocket.core.graphics;

import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f6559a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f6560b;

    static {
        Method method;
        Method method2 = null;
        try {
            method = aa.k.b(TextView.class, "hasPasswordTransformationMethod", new Class[0]);
        } catch (Throwable unused) {
            method = null;
        }
        f6559a = method;
        try {
            method2 = aa.k.b(TextView.class, "isAnyPasswordInputType", new Class[0]);
        } catch (Throwable unused2) {
        }
        f6560b = method2;
    }

    public static boolean a(View view) {
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        Method method = f6559a;
        if (method != null) {
            try {
                if (((Boolean) method.invoke(textView, null)).booleanValue()) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        Method method2 = f6560b;
        if (method2 != null) {
            try {
                return ((Boolean) method2.invoke(textView, null)).booleanValue();
            } catch (Throwable unused2) {
            }
        }
        int inputType = textView.getInputType() & 4095;
        return inputType == 129 || inputType == 225 || inputType == 18 || inputType == 145;
    }
}
