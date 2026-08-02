package l0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class V extends AbstractC7737t implements Function1<O, Float> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.q f72049b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.s f72050c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72051a;

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
            f72051a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V(androidx.compose.animation.q qVar, androidx.compose.animation.s sVar) {
        super(1);
        this.f72049b = qVar;
        this.f72050c = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(O o11) {
        int i11 = a.f72051a[o11.ordinal()];
        float f7 = 1.0f;
        if (i11 != 1) {
            if (i11 == 2) {
                g0 e11 = this.f72049b.b().e();
                if (e11 != null) {
                    f7 = e11.b();
                }
            } else {
                if (i11 != 3) {
                    throw new Sc.o();
                }
                g0 e12 = this.f72050c.b().e();
                if (e12 != null) {
                    f7 = e12.b();
                }
            }
        }
        return Float.valueOf(f7);
    }
}
