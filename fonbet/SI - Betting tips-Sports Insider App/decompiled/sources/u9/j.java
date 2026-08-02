package u9;

import android.graphics.SweepGradient;
import android.os.Build;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f24116a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f24117b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f24118c;

    /* renamed from: d, reason: collision with root package name */
    public static final Field f24119d;

    /* renamed from: e, reason: collision with root package name */
    public static final Field f24120e;

    /* renamed from: f, reason: collision with root package name */
    public static final Field f24121f;

    /* renamed from: g, reason: collision with root package name */
    public static final Field f24122g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f24123h;

    static {
        Field field;
        Field field2;
        Field field3;
        Field field4;
        Field field5;
        Field field6;
        Field field7 = null;
        boolean z5 = false;
        try {
            field = aa.k.c(SweepGradient.class, "mCx");
            try {
                field2 = aa.k.c(SweepGradient.class, "mCy");
            } catch (ClassNotFoundException | NoSuchFieldException unused) {
                field2 = null;
                field3 = field2;
                field4 = field3;
                field5 = field4;
                field6 = field5;
                f24116a = field;
                f24117b = field2;
                f24118c = field3;
                f24119d = field4;
                f24120e = field5;
                f24121f = field6;
                f24122g = field7;
                f24123h = z5;
            }
            try {
                field3 = aa.k.c(SweepGradient.class, "mPositions");
            } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                field3 = null;
                field4 = field3;
                field5 = field4;
                field6 = field5;
                f24116a = field;
                f24117b = field2;
                f24118c = field3;
                f24119d = field4;
                f24120e = field5;
                f24121f = field6;
                f24122g = field7;
                f24123h = z5;
            }
            try {
                field4 = aa.k.c(SweepGradient.class, "mColors");
            } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                field4 = null;
                field5 = field4;
                field6 = field5;
                f24116a = field;
                f24117b = field2;
                f24118c = field3;
                f24119d = field4;
                f24120e = field5;
                f24121f = field6;
                f24122g = field7;
                f24123h = z5;
            }
            try {
                field5 = aa.k.c(SweepGradient.class, "mColor0");
                try {
                    field6 = aa.k.c(SweepGradient.class, "mColor1");
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            try {
                                field7 = aa.k.a(SweepGradient.class, "mColorLongs");
                            } catch (Throwable unused4) {
                            }
                        }
                        z5 = true;
                    } catch (ClassNotFoundException | NoSuchFieldException unused5) {
                    }
                } catch (ClassNotFoundException | NoSuchFieldException unused6) {
                    field6 = null;
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused7) {
                field5 = null;
                field6 = field5;
                f24116a = field;
                f24117b = field2;
                f24118c = field3;
                f24119d = field4;
                f24120e = field5;
                f24121f = field6;
                f24122g = field7;
                f24123h = z5;
            }
        } catch (ClassNotFoundException | NoSuchFieldException unused8) {
            field = null;
            field2 = null;
        }
        f24116a = field;
        f24117b = field2;
        f24118c = field3;
        f24119d = field4;
        f24120e = field5;
        f24121f = field6;
        f24122g = field7;
        f24123h = z5;
    }
}
