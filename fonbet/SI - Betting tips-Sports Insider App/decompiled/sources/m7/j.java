package m7;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f20460a;

    /* renamed from: b, reason: collision with root package name */
    public static final StringBuilder f20461b;

    static {
        Locale locale = Locale.ROOT;
        f20460a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f20461b = new StringBuilder(33);
    }

    public static void a(long j, StringBuilder sb2) {
        if (j == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z5 = false;
        if (j < 0) {
            sb2.append("-");
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = LongCompanionObject.MAX_VALUE;
                z5 = true;
            }
        }
        if (j >= 86400000) {
            sb2.append(j / 86400000);
            sb2.append("d");
            j %= 86400000;
        }
        if (true == z5) {
            j = 25975808;
        }
        if (j >= 3600000) {
            sb2.append(j / 3600000);
            sb2.append("h");
            j %= 3600000;
        }
        if (j >= 60000) {
            sb2.append(j / 60000);
            sb2.append("m");
            j %= 60000;
        }
        if (j >= 1000) {
            sb2.append(j / 1000);
            sb2.append("s");
            j %= 1000;
        }
        if (j > 0) {
            sb2.append(j);
            sb2.append("ms");
        }
    }
}
