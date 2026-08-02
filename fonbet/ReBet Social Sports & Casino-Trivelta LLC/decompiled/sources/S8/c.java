package S8;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public enum c {
    Automatic("automatic"),
    Light("light"),
    Dark("dark"),
    Custom("custom");

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.Automatic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.Light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.Dark.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.Custom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    c(String str) {
    }

    public final e b(Context context) {
        Integer valueOf = context != null ? Integer.valueOf(context.getResources().getConfiguration().uiMode & 48) : null;
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return (valueOf != null && valueOf.intValue() == 16) ? d.f10680a : (valueOf != null && valueOf.intValue() == 32) ? S8.a.f10628a : (valueOf != null && valueOf.intValue() == 0) ? d.f10680a : d.f10680a;
        }
        if (i10 == 2) {
            return d.f10680a;
        }
        if (i10 == 3) {
            return S8.a.f10628a;
        }
        if (i10 == 4) {
            return b.f10652a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
