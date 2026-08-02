package l0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class S extends AbstractC7737t implements Function1<O, Float> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.q f72041b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.s f72042c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72043a;

        static {
            int[] iArr = new int[O.values().length];
            try {
                iArr[O.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f72043a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(androidx.compose.animation.q qVar, androidx.compose.animation.s sVar) {
        super(1);
        this.f72041b = qVar;
        this.f72042c = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r3.f72041b.b().c() != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r3.f72042c.b().c() != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r1 = 0.0f;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Float invoke(O o11) {
        int i11 = a.f72043a[o11.ordinal()];
        float f7 = 1.0f;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new Sc.o();
                }
            }
        }
        return Float.valueOf(f7);
    }
}
