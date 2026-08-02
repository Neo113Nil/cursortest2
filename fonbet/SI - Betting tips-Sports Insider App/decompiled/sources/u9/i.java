package u9;

import android.graphics.RadialGradient;
import android.os.Build;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f24107a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f24108b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f24109c;

    /* renamed from: d, reason: collision with root package name */
    public static final Field f24110d;

    /* renamed from: e, reason: collision with root package name */
    public static final Field f24111e;

    /* renamed from: f, reason: collision with root package name */
    public static final Field f24112f;

    /* renamed from: g, reason: collision with root package name */
    public static final Field f24113g;

    /* renamed from: h, reason: collision with root package name */
    public static final Field f24114h;

    /* renamed from: i, reason: collision with root package name */
    public static final Field f24115i;
    public static final boolean j;

    static {
        Field field;
        Field field2;
        Field field3;
        Field field4;
        Field field5;
        Field field6;
        Field field7;
        Field field8;
        Field field9 = null;
        boolean z5 = false;
        try {
            field = aa.k.c(RadialGradient.class, "mX");
        } catch (ClassNotFoundException | NoSuchFieldException unused) {
            field = null;
            field2 = null;
        }
        try {
            field2 = aa.k.c(RadialGradient.class, "mY");
            try {
                field3 = aa.k.c(RadialGradient.class, "mRadius");
            } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                field3 = null;
                field4 = field3;
                field5 = field4;
                field6 = field5;
                field7 = field6;
                field8 = field7;
                f24107a = field;
                f24108b = field2;
                f24109c = field3;
                f24110d = field4;
                f24111e = field5;
                f24112f = field6;
                f24113g = field7;
                f24114h = field8;
                f24115i = field9;
                j = z5;
            }
            try {
                field4 = aa.k.c(RadialGradient.class, "mPositions");
            } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                field4 = null;
                field5 = field4;
                field6 = field5;
                field7 = field6;
                field8 = field7;
                f24107a = field;
                f24108b = field2;
                f24109c = field3;
                f24110d = field4;
                f24111e = field5;
                f24112f = field6;
                f24113g = field7;
                f24114h = field8;
                f24115i = field9;
                j = z5;
            }
            try {
                field5 = aa.k.c(RadialGradient.class, "mTileMode");
            } catch (ClassNotFoundException | NoSuchFieldException unused4) {
                field5 = null;
                field6 = field5;
                field7 = field6;
                field8 = field7;
                f24107a = field;
                f24108b = field2;
                f24109c = field3;
                f24110d = field4;
                f24111e = field5;
                f24112f = field6;
                f24113g = field7;
                f24114h = field8;
                f24115i = field9;
                j = z5;
            }
            try {
                field6 = aa.k.c(RadialGradient.class, "mColors");
            } catch (ClassNotFoundException | NoSuchFieldException unused5) {
                field6 = null;
                field7 = field6;
                field8 = field7;
                f24107a = field;
                f24108b = field2;
                f24109c = field3;
                f24110d = field4;
                f24111e = field5;
                f24112f = field6;
                f24113g = field7;
                f24114h = field8;
                f24115i = field9;
                j = z5;
            }
        } catch (ClassNotFoundException | NoSuchFieldException unused6) {
            field2 = null;
            field3 = field2;
            field4 = field3;
            field5 = field4;
            field6 = field5;
            field7 = field6;
            field8 = field7;
            f24107a = field;
            f24108b = field2;
            f24109c = field3;
            f24110d = field4;
            f24111e = field5;
            f24112f = field6;
            f24113g = field7;
            f24114h = field8;
            f24115i = field9;
            j = z5;
        }
        try {
            field7 = aa.k.c(RadialGradient.class, "mCenterColor");
            try {
                field8 = aa.k.c(RadialGradient.class, "mEdgeColor");
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        try {
                            field9 = aa.k.a(RadialGradient.class, "mColorLongs");
                        } catch (Throwable unused7) {
                        }
                    }
                    z5 = true;
                } catch (ClassNotFoundException | NoSuchFieldException unused8) {
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused9) {
                field8 = null;
            }
        } catch (ClassNotFoundException | NoSuchFieldException unused10) {
            field7 = null;
            field8 = field7;
            f24107a = field;
            f24108b = field2;
            f24109c = field3;
            f24110d = field4;
            f24111e = field5;
            f24112f = field6;
            f24113g = field7;
            f24114h = field8;
            f24115i = field9;
            j = z5;
        }
        f24107a = field;
        f24108b = field2;
        f24109c = field3;
        f24110d = field4;
        f24111e = field5;
        f24112f = field6;
        f24113g = field7;
        f24114h = field8;
        f24115i = field9;
        j = z5;
    }
}
