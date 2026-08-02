package io.sentry.android.replay.util;

import Sc.o;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class k {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/sentry/android/replay/util/k$a;", "", "<init>", "(Ljava/lang/String;I)V", "SOC_MODEL", "SOC_MANUFACTURER", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a SOC_MODEL = new a("SOC_MODEL", 0);
        public static final a SOC_MANUFACTURER = new a("SOC_MANUFACTURER", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{SOC_MODEL, SOC_MANUFACTURER};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private a(String str, int i11) {
        }

        @NotNull
        public static Xc.a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67686a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SOC_MODEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SOC_MANUFACTURER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f67686a = iArr;
        }
    }

    public static String a(a key) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter("", "defaultValue");
        if (Build.VERSION.SDK_INT < 31) {
            return "";
        }
        int i11 = b.f67686a[key.ordinal()];
        if (i11 == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            str = Build.SOC_MANUFACTURER;
        }
        Intrinsics.f(str);
        return str;
    }
}
