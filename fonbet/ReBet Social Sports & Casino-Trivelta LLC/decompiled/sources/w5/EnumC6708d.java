package w5;

import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6708d {
    private static final /* synthetic */ EnumC6708d[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final a f67442a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6708d f67443b = new EnumC6708d("Matrix", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6708d f67444c = new EnumC6708d("FitXY", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6708d f67445d = new EnumC6708d("FitStart", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC6708d f67446e = new EnumC6708d("FitCenter", 3);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC6708d f67447f = new EnumC6708d("FitEnd", 4);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC6708d f67448g = new EnumC6708d("Center", 5);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC6708d f67449h = new EnumC6708d("CenterCrop", 6);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC6708d f67450i = new EnumC6708d("CenterInside", 7);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f67451j;

    /* renamed from: w5.d$a */
    public static final class a {

        /* renamed from: w5.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0953a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ImageView.ScaleType.values().length];
                try {
                    iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ImageView.ScaleType.FIT_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ImageView.ScaleType.FIT_END.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ImageView.ScaleType.CENTER.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC6708d a(ImageView.ScaleType scaleType) {
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            switch (C0953a.$EnumSwitchMapping$0[scaleType.ordinal()]) {
                case 1:
                    return EnumC6708d.f67443b;
                case 2:
                    return EnumC6708d.f67444c;
                case 3:
                    return EnumC6708d.f67445d;
                case 4:
                    return EnumC6708d.f67446e;
                case 5:
                    return EnumC6708d.f67447f;
                case 6:
                    return EnumC6708d.f67448g;
                case 7:
                    return EnumC6708d.f67449h;
                case 8:
                    return EnumC6708d.f67450i;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public a() {
        }
    }

    static {
        EnumC6708d[] a10 = a();
        $VALUES = a10;
        f67451j = EnumEntriesKt.enumEntries(a10);
        f67442a = new a(null);
    }

    public EnumC6708d(String str, int i10) {
    }

    public static final /* synthetic */ EnumC6708d[] a() {
        return new EnumC6708d[]{f67443b, f67444c, f67445d, f67446e, f67447f, f67448g, f67449h, f67450i};
    }

    public static EnumC6708d valueOf(String str) {
        return (EnumC6708d) Enum.valueOf(EnumC6708d.class, str);
    }

    public static EnumC6708d[] values() {
        return (EnumC6708d[]) $VALUES.clone();
    }
}
