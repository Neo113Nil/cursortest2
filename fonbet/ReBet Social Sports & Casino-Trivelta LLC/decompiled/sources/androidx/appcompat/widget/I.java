package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.react.uimanager.ViewProps;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n0.AbstractC5597a;

/* loaded from: classes.dex */
public abstract class I {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] EMPTY_STATE_SET = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public static final Rect f16965a = new Rect();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f16966a;

        /* renamed from: b, reason: collision with root package name */
        public static final Method f16967b;

        /* renamed from: c, reason: collision with root package name */
        public static final Field f16968c;

        /* renamed from: d, reason: collision with root package name */
        public static final Field f16969d;

        /* renamed from: e, reason: collision with root package name */
        public static final Field f16970e;

        /* renamed from: f, reason: collision with root package name */
        public static final Field f16971f;

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z10;
            Class<?> cls;
            try {
                cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
            } catch (ClassNotFoundException unused) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused2) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused3) {
                method = null;
                field = null;
            }
            try {
                field = cls.getField(ViewProps.LEFT);
                try {
                    field2 = cls.getField(ViewProps.TOP);
                    try {
                        field3 = cls.getField(ViewProps.RIGHT);
                        try {
                            field4 = cls.getField(ViewProps.BOTTOM);
                            z10 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                            field4 = null;
                            z10 = false;
                            if (z10) {
                            }
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused6) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                    }
                } catch (NoSuchFieldException unused7) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                    }
                } catch (NoSuchMethodException unused8) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                    }
                }
            } catch (ClassNotFoundException unused9) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                }
            } catch (NoSuchFieldException unused10) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                }
            } catch (NoSuchMethodException unused11) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                }
            }
            if (z10) {
                f16967b = null;
                f16968c = null;
                f16969d = null;
                f16970e = null;
                f16971f = null;
                f16966a = false;
                return;
            }
            f16967b = method;
            f16968c = field;
            f16969d = field2;
            f16970e = field3;
            f16971f = field4;
            f16966a = true;
        }

        public static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f16966a) {
                try {
                    Object invoke = f16967b.invoke(drawable, null);
                    if (invoke != null) {
                        return new Rect(f16968c.getInt(invoke), f16969d.getInt(invoke), f16970e.getInt(invoke), f16971f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return I.f16965a;
        }
    }

    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    public static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(CHECKED_STATE_SET);
        } else {
            drawable.setState(EMPTY_STATE_SET);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(AbstractC5597a.q(drawable));
        }
        Insets a10 = b.a(drawable);
        i10 = a10.left;
        i11 = a10.top;
        i12 = a10.right;
        i13 = a10.bottom;
        return new Rect(i10, i11, i12, i13);
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
