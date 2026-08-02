package com.google.android.gms.internal.play_billing;

import com.appsflyer.attribution.RequestError;
import com.google.android.material.navigation.NavigationBarView;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.impl.C0122e9;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5427a;

    public /* synthetic */ d3(int i5) {
        this.f5427a = i5;
    }

    public static int C(byte[] bArr, int i5, k3 k3Var, com.google.android.gms.internal.measurement.t4 t4Var) {
        h3 h3Var = (h3) k3Var;
        int H = H(bArr, i5, t4Var);
        int i10 = t4Var.f5245a + H;
        while (H < i10) {
            H = H(bArr, H, t4Var);
            h3Var.c(t4Var.f5245a);
        }
        if (H == i10) {
            return H;
        }
        throw new n3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static String D(int i5, int i10, String str) {
        if (i5 < 0) {
            return g("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return g("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(i10, "negative size: "));
    }

    public static int F(int i5, byte[] bArr, int i10, int i11, h4 h4Var, com.google.android.gms.internal.measurement.t4 t4Var) {
        if ((i5 >>> 3) == 0) {
            throw new n3("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i5 & 7;
        if (i12 == 0) {
            int K = K(bArr, i10, t4Var);
            h4Var.c(i5, Long.valueOf(t4Var.f5246b));
            return K;
        }
        if (i12 == 1) {
            h4Var.c(i5, Long.valueOf(N(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int H = H(bArr, i10, t4Var);
            int i13 = t4Var.f5245a;
            if (i13 < 0) {
                throw new n3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - H) {
                throw new n3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                h4Var.c(i5, y2.f5654c);
            } else {
                h4Var.c(i5, y2.e(bArr, H, i13));
            }
            return H + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new n3("Protocol message contained an invalid tag (zero).");
            }
            h4Var.c(i5, Integer.valueOf(o(i10, bArr)));
            return i10 + 4;
        }
        int i14 = (i5 & (-8)) | 4;
        h4 b10 = h4.b();
        int i15 = t4Var.f5248d + 1;
        t4Var.f5248d = i15;
        if (i15 >= 100) {
            throw new n3("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int H2 = H(bArr, i10, t4Var);
            int i17 = t4Var.f5245a;
            if (i17 == i14) {
                i16 = i17;
                i10 = H2;
                break;
            }
            i10 = F(i17, bArr, H2, i11, b10, t4Var);
            i16 = i17;
        }
        t4Var.f5248d--;
        if (i10 > i11 || i16 != i14) {
            throw new n3("Failed to parse the message.");
        }
        h4Var.c(i5, b10);
        return i10;
    }

    public static int H(byte[] bArr, int i5, com.google.android.gms.internal.measurement.t4 t4Var) {
        int i10 = i5 + 1;
        byte b10 = bArr[i5];
        if (b10 < 0) {
            return I(b10, bArr, i10, t4Var);
        }
        t4Var.f5245a = b10;
        return i10;
    }

    public static int I(int i5, byte[] bArr, int i10, com.google.android.gms.internal.measurement.t4 t4Var) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i5 & 127;
        if (b10 >= 0) {
            t4Var.f5245a = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & ByteCompanionObject.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            t4Var.f5245a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & ByteCompanionObject.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            t4Var.f5245a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & ByteCompanionObject.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            t4Var.f5245a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                t4Var.f5245a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int J(int i5, byte[] bArr, int i10, int i11, k3 k3Var, com.google.android.gms.internal.measurement.t4 t4Var) {
        h3 h3Var = (h3) k3Var;
        int H = H(bArr, i10, t4Var);
        h3Var.c(t4Var.f5245a);
        while (H < i11) {
            int H2 = H(bArr, H, t4Var);
            if (i5 != t4Var.f5245a) {
                break;
            }
            H = H(bArr, H2, t4Var);
            h3Var.c(t4Var.f5245a);
        }
        return H;
    }

    public static int K(byte[] bArr, int i5, com.google.android.gms.internal.measurement.t4 t4Var) {
        long j = bArr[i5];
        int i10 = i5 + 1;
        if (j >= 0) {
            t4Var.f5246b = j;
            return i10;
        }
        int i11 = i5 + 2;
        byte b10 = bArr[i10];
        long j6 = (j & 127) | ((b10 & ByteCompanionObject.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j6 |= (r10 & ByteCompanionObject.MAX_VALUE) << i12;
            b10 = bArr[i11];
            i11 = i13;
        }
        t4Var.f5246b = j6;
        return i11;
    }

    public static int L(Object obj, d4 d4Var, byte[] bArr, int i5, int i10, int i11, com.google.android.gms.internal.measurement.t4 t4Var) {
        w3 w3Var = (w3) d4Var;
        int i12 = t4Var.f5248d + 1;
        t4Var.f5248d = i12;
        if (i12 >= 100) {
            throw new n3("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int t3 = w3Var.t(obj, bArr, i5, i10, i11, t4Var);
        t4Var.f5248d--;
        t4Var.f5247c = obj;
        return t3;
    }

    public static int M(Object obj, d4 d4Var, byte[] bArr, int i5, int i10, com.google.android.gms.internal.measurement.t4 t4Var) {
        int i11 = i5 + 1;
        int i12 = bArr[i5];
        if (i12 < 0) {
            i11 = I(i12, bArr, i11, t4Var);
            i12 = t4Var.f5245a;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw new n3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = t4Var.f5248d + 1;
        t4Var.f5248d = i14;
        if (i14 >= 100) {
            throw new n3("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        d4Var.h(obj, bArr, i13, i15, t4Var);
        t4Var.f5248d--;
        t4Var.f5247c = obj;
        return i15;
    }

    public static long N(int i5, byte[] bArr) {
        return (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48) | ((bArr[i5 + 7] & 255) << 56);
    }

    public static int c(int i5) {
        return (int) (Integer.rotateLeft((int) (i5 * (-862048943)), 15) * 461845907);
    }

    public static int d(byte[] bArr, int i5, com.google.android.gms.internal.measurement.t4 t4Var) {
        int H = H(bArr, i5, t4Var);
        int i10 = t4Var.f5245a;
        if (i10 < 0) {
            throw new n3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - H) {
            throw new n3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            t4Var.f5247c = y2.f5654c;
            return H;
        }
        t4Var.f5247c = y2.e(bArr, H, i10);
        return H + i10;
    }

    public static String f(y2 y2Var) {
        StringBuilder sb2 = new StringBuilder(y2Var.c());
        for (int i5 = 0; i5 < y2Var.c(); i5++) {
            byte a7 = y2Var.a(i5);
            if (a7 == 34) {
                sb2.append("\\\"");
            } else if (a7 == 39) {
                sb2.append("\\'");
            } else if (a7 != 92) {
                switch (a7) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (a7 < 32 || a7 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a7 >>> 6) & 3) + 48));
                            sb2.append((char) (((a7 >>> 3) & 7) + 48));
                            sb2.append((char) ((a7 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) a7);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String g(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i5 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e7) {
                    String m6 = r4.k.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m6), (Throwable) e7);
                    str2 = "<" + m6 + " threw " + e7.getClass().getName() + ">";
                }
            }
            objArr[i10] = str2;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i5 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, indexOf);
            sb2.append(objArr[i5]);
            i5++;
            i11 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i5 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i5]);
            for (int i12 = i5 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void h(int i5, int i10) {
        String g10;
        if (i5 < 0 || i5 >= i10) {
            if (i5 < 0) {
                g10 = g("%s (%s) must not be negative", "index", Integer.valueOf(i5));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(i10, "negative size: "));
                }
                g10 = g("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(g10);
        }
    }

    public static void i(int i5, String str) {
        if (i5 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i5);
    }

    public static boolean k(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = o0.f5525b;
            }
        } else {
            if (!(collection instanceof b1)) {
                return false;
            }
            obj = ((k0) ((b1) collection)).f5491c;
        }
        return comparator.equals(obj);
    }

    public static /* synthetic */ boolean l(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, o1 o1Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(o1Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(o1Var) != obj && atomicReferenceFieldUpdater.get(o1Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, r5 r5Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(r5Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(r5Var) != obj && atomicReferenceFieldUpdater.get(r5Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static int n(int i5) {
        if (i5 == 90) {
            return 91;
        }
        if (i5 == 91) {
            return 92;
        }
        if (i5 == 93) {
            return 94;
        }
        if (i5 == 94) {
            return 95;
        }
        switch (i5) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return 23;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return 24;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return 25;
            case C0122e9.F /* 25 */:
                return 26;
            case C0122e9.G /* 26 */:
                return 27;
            case C0122e9.H /* 27 */:
                return 28;
            case 28:
                return 29;
            case C0122e9.I /* 29 */:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case C0122e9.J /* 35 */:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case C0122e9.K /* 38 */:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case RequestError.NO_DEV_KEY /* 41 */:
                return 42;
            case C0122e9.M /* 42 */:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                return 50;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i5) {
                    case 96:
                        return 97;
                    case 97:
                        return 98;
                    case 98:
                        return 99;
                    case 99:
                        return 100;
                    case AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_LOWER_BOUND /* 100 */:
                        return 101;
                    case 101:
                        return 102;
                    case 102:
                        return 103;
                    case 103:
                        return 104;
                    case 104:
                        return 105;
                    case 105:
                        return 106;
                    case 106:
                        return 107;
                    case 107:
                        return 108;
                    case 108:
                        return 109;
                    case 109:
                        return 110;
                    case 110:
                        return 111;
                    case 111:
                        return 112;
                    case 112:
                        return 113;
                    case 113:
                        return 114;
                    case 114:
                        return 115;
                    case 115:
                        return BuildConfig.API_LEVEL;
                    case BuildConfig.API_LEVEL /* 116 */:
                        return 117;
                    case 117:
                        return 118;
                    case 118:
                        return 119;
                    case 119:
                        return 120;
                    case 120:
                        return 121;
                    case 121:
                        return 122;
                    default:
                        return 0;
                }
        }
    }

    public static int o(int i5, byte[] bArr) {
        int i10 = bArr[i5] & 255;
        int i11 = bArr[i5 + 1] & 255;
        int i12 = bArr[i5 + 2] & 255;
        return ((bArr[i5 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static a3 q() {
        String str;
        ClassLoader classLoader = d3.class.getClassLoader();
        if (a3.class.equals(a3.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!a3.class.getPackage().equals(d3.class.getPackage())) {
                throw new IllegalArgumentException(a3.class.getName());
            }
            str = a3.class.getPackage().getName() + ".BlazeGenerated" + a3.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    androidx.appcompat.widget.c1.t(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(e7);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(e9);
                }
            } catch (InstantiationException e10) {
                throw new IllegalStateException(e10);
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new d3[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e12) {
                        Logger.getLogger(z2.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(a3.class.getSimpleName()), (Throwable) e12);
                    }
                }
                if (arrayList.size() == 1) {
                    return (a3) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (a3) a3.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(e13);
                } catch (NoSuchMethodException e14) {
                    throw new IllegalStateException(e14);
                } catch (InvocationTargetException e15) {
                    throw new IllegalStateException(e15);
                }
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    public static void r(int i5, int i10) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(D(i5, i10, "index"));
        }
    }

    public static int x(d4 d4Var, int i5, byte[] bArr, int i10, int i11, k3 k3Var, com.google.android.gms.internal.measurement.t4 t4Var) {
        g3 c2 = d4Var.c();
        d4 d4Var2 = d4Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        com.google.android.gms.internal.measurement.t4 t4Var2 = t4Var;
        int M = M(c2, d4Var2, bArr2, i10, i12, t4Var2);
        d4Var2.a(c2);
        t4Var2.f5247c = c2;
        k3Var.add(c2);
        while (M < i12) {
            com.google.android.gms.internal.measurement.t4 t4Var3 = t4Var2;
            int i13 = i12;
            int H = H(bArr2, M, t4Var3);
            if (i5 != t4Var3.f5245a) {
                break;
            }
            byte[] bArr3 = bArr2;
            d4 d4Var3 = d4Var2;
            g3 c8 = d4Var3.c();
            M = M(c8, d4Var3, bArr3, H, i13, t4Var3);
            d4Var2 = d4Var3;
            bArr2 = bArr3;
            i12 = i13;
            t4Var2 = t4Var3;
            d4Var2.a(c8);
            t4Var2.f5247c = c8;
            k3Var.add(c8);
        }
        return M;
    }

    public static void y(int i5, int i10, int i11) {
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? D(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? D(i10, i11, "end index") : g("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    public static boolean z(byte b10) {
        return b10 > -65;
    }

    public abstract boolean A(o1 o1Var, g1 g1Var, g1 g1Var2);

    public abstract boolean B(r5 r5Var, q5 q5Var, q5 q5Var2);

    public abstract boolean E(o1 o1Var, Object obj, Object obj2);

    public abstract boolean G(o1 o1Var, n1 n1Var, n1 n1Var2);

    public abstract g1 e(o1 o1Var);

    public abstract void j(q5 q5Var, q5 q5Var2);

    public abstract n1 p(o1 o1Var);

    public abstract void s(q5 q5Var, Thread thread);

    public abstract void t(n1 n1Var, n1 n1Var2);

    public String toString() {
        switch (this.f5427a) {
            case 4:
                return ((d2) this).f5425b.toString();
            default:
                return super.toString();
        }
    }

    public abstract boolean u(r5 r5Var, f4 f4Var, f4 f4Var2);

    public abstract void v(n1 n1Var, Thread thread);

    public abstract boolean w(r5 r5Var, Object obj, Object obj2);
}
