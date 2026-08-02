package l0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.N0;

/* loaded from: classes8.dex */
final class X extends AbstractC7737t implements Function1<O, N0> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N0 f72053b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.q f72054c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.s f72055d;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72056a;

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
            f72056a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X(N0 n02, androidx.compose.animation.q qVar, androidx.compose.animation.s sVar) {
        super(1);
        this.f72053b = n02;
        this.f72054c = qVar;
        this.f72055d = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final N0 invoke(O o11) {
        N0 n02;
        int i11 = a.f72056a[o11.ordinal()];
        if (i11 != 1) {
            androidx.compose.animation.q qVar = this.f72054c;
            n02 = null;
            androidx.compose.animation.s sVar = this.f72055d;
            if (i11 == 2) {
                g0 e11 = qVar.b().e();
                if (e11 != null || (e11 = sVar.b().e()) != null) {
                    n02 = N0.b(e11.c());
                }
            } else {
                if (i11 != 3) {
                    throw new Sc.o();
                }
                g0 e12 = sVar.b().e();
                if (e12 != null || (e12 = qVar.b().e()) != null) {
                    n02 = N0.b(e12.c());
                }
            }
        } else {
            n02 = this.f72053b;
        }
        return N0.b(n02 != null ? n02.g() : N0.f72232b);
    }
}
