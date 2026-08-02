package xj;

import Ej.u;
import Sc.o;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.android.AndroidLogEntry;

/* loaded from: classes6.dex */
public final class d implements u<AndroidLogEntry> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sj.c f105604a;

    /* loaded from: classes10.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105605a;

        static {
            int[] iArr = new int[ru.ozon.android.ozonLogger.core.c.values().length];
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.CRITICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.NOTICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.INFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ru.ozon.android.ozonLogger.core.c.DEBUG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f105605a = iArr;
        }
    }

    public d(@NotNull sj.c config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f105604a = config;
    }

    @Override // Ej.e
    public final void a(AndroidLogEntry entry) {
        int i11;
        Intrinsics.checkNotNullParameter(entry, "entry");
        sj.c cVar = this.f105604a;
        if (cVar.m()) {
            switch (a.f105605a[entry.getLevel().ordinal()]) {
                case 1:
                case 2:
                    i11 = 7;
                    break;
                case 3:
                    i11 = 6;
                    break;
                case 4:
                    i11 = 5;
                    break;
                case 5:
                case 6:
                    i11 = 4;
                    break;
                case 7:
                    i11 = 3;
                    break;
                default:
                    throw new o();
            }
            String tag = entry.getTag();
            if (tag == null) {
                tag = "OzonLogger";
            }
            Log.println(i11, tag, entry.formatted(cVar.k()));
        }
    }
}
