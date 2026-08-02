package n5;

import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<String> f76528a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f76529b = 0;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76530a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.RESPECT_PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.IGNORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.RESPECT_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f76530a = iArr;
        }
    }

    static {
        String[] elements = {"image/jpeg", "image/webp", "image/heic", "image/heif"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f76528a = C7705l.j0(elements);
    }

    public static final boolean a(@NotNull h hVar) {
        return hVar.a() == 90 || hVar.a() == 270;
    }

    public static final boolean b(@NotNull j jVar, String str) {
        int i11 = a.f76530a[jVar.ordinal()];
        if (i11 == 1) {
            return str != null && f76528a.contains(str);
        }
        if (i11 == 2) {
            return false;
        }
        if (i11 == 3) {
            return true;
        }
        throw new Sc.o();
    }
}
