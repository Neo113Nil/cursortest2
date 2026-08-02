package com.henninghall.date_picker;

import android.widget.LinearLayout;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class a {
    public static i a(ThemedReactContext themedReactContext) {
        return new i(new LinearLayout.LayoutParams(-1, -1));
    }

    public static Map b() {
        return MapBuilder.of(ViewProps.SCROLL, 1);
    }

    public static ReactPropGroup c(String str, Class cls) {
        Method method = null;
        for (Method method2 : cls.getMethods()) {
            if (method2.getName().equals(str)) {
                method = method2;
            }
        }
        return (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
    }

    public static void d(i iVar) {
        try {
            iVar.c();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void e(String str, i iVar, int i10, Dynamic dynamic, Class cls) {
        iVar.d(c(str, cls).names()[i10], dynamic);
    }
}
