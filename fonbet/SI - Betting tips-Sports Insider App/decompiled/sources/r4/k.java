package r4;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.attribution.RequestError;
import f3.x;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static c a(int i5, int i10, int i11) {
        if (i5 == -2) {
            return b.f22292a;
        }
        int i12 = i5 - i11;
        if (i12 > 0) {
            if (i12 > 0) {
                return new a(i12);
            }
            throw new IllegalArgumentException("px must be > 0.");
        }
        int i13 = i10 - i11;
        if (i13 <= 0) {
            return null;
        }
        if (i13 > 0) {
            return new a(i13);
        }
        throw new IllegalArgumentException("px must be > 0.");
    }

    public static i b(f fVar) {
        View view = fVar.f22297b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        c a7 = a(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (a7 == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        c a10 = a(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (a10 == null) {
            return null;
        }
        return new i(a7, a10);
    }

    public static final int c(int i5) {
        if (i5 == 32) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        switch (i5) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return 21;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return 22;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return 23;
            case C0122e9.F /* 25 */:
                return 24;
            case C0122e9.G /* 26 */:
                return 25;
            case C0122e9.H /* 27 */:
                return 26;
            case 28:
                return 27;
            case C0122e9.I /* 29 */:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return -1;
            default:
                throw null;
        }
    }

    public static void d(tb.f fVar, String str, String str2, String str3, String str4, String str5, String str6) {
        ((Number) x.n0(fVar.f23832a, false, true, new tb.d(str, str5, str6, str4, str3, str2, 1))).intValue();
    }

    public static /* synthetic */ int e(int i5) {
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 1;
        }
        if (i5 == 3) {
            return 2;
        }
        if (i5 == 4) {
            return 3;
        }
        if (i5 == 5) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ int f(int i5) {
        switch (i5) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return -1;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int g(int i5) {
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 1;
        }
        if (i5 == 3) {
            return 2;
        }
        if (i5 == 4) {
            return 3;
        }
        if (i5 == 5) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ int h(int i5) {
        switch (i5) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return 21;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return 22;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return 23;
            case C0122e9.F /* 25 */:
                return 24;
            case C0122e9.G /* 26 */:
                return 25;
            case C0122e9.H /* 27 */:
                return 26;
            case 28:
                return 27;
            case C0122e9.I /* 29 */:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case C0122e9.J /* 35 */:
                return 34;
            case 36:
                return 35;
            case 37:
                return 36;
            case C0122e9.K /* 38 */:
                return 37;
            case 39:
                return 38;
            case 40:
                return 39;
            case RequestError.NO_DEV_KEY /* 41 */:
                return 40;
            case C0122e9.M /* 42 */:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case 48:
                return -1;
            default:
                throw null;
        }
    }

    public static void i(tb.f fVar, String str, String str2, String str3, String str4, String str5, String str6, int i5) {
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        if ((i5 & 8) != 0) {
            str3 = null;
        }
        if ((i5 & 16) != 0) {
            str4 = null;
        }
        if ((i5 & 32) != 0) {
            str5 = null;
        }
        if ((i5 & 64) != 0) {
            str6 = null;
        }
        ((Number) x.n0(fVar.f23832a, false, true, new tb.d(str, str3, str2, str5, str6, str4, 0))).longValue();
    }

    public static int j(int i5, int i10, String str) {
        return (str.hashCode() + i5) * i10;
    }

    public static View k(ViewGroup viewGroup, int i5, ViewGroup viewGroup2, boolean z5) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i5, viewGroup2, z5);
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(StringBuilder sb2, int i5, String str) {
        sb2.append(i5);
        sb2.append(str);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, int i5) {
        sb2.append(str);
        sb2.append(i5);
        return sb2.toString();
    }

    public static StringBuilder p(long j, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder q(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static /* synthetic */ void r(AutoCloseable autoCloseable) {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            com.appsflyer.internal.h.h((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }

    public static void s(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static /* synthetic */ String t(int i5) {
        switch (i5) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String u(int i5) {
        switch (i5) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
