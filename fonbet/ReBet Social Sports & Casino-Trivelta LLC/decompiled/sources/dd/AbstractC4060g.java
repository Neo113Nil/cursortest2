package dd;

import androidx.fragment.app.N;
import com.swmansion.rnscreens.AbstractC3826q;
import com.swmansion.rnscreens.C3834z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dd.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4060g {

    /* renamed from: dd.g$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C3834z.d.values().length];
            try {
                iArr[C3834z.d.f42111a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3834z.d.f42112b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3834z.d.f42113c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C3834z.d.f42115e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C3834z.d.f42116f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C3834z.d.f42114d.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C3834z.d.f42117g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C3834z.d.f42118h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C3834z.d.f42119i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(N n10, C3834z.d stackAnimation, boolean z10) {
        Intrinsics.checkNotNullParameter(n10, "<this>");
        Intrinsics.checkNotNullParameter(stackAnimation, "stackAnimation");
        if (z10) {
            switch (a.$EnumSwitchMapping$0[stackAnimation.ordinal()]) {
                case 1:
                    n10.s(AbstractC3826q.f42012a, AbstractC3826q.f42013b);
                    return;
                case 2:
                    int i10 = AbstractC3826q.f42028q;
                    n10.s(i10, i10);
                    return;
                case 3:
                    n10.s(AbstractC3826q.f42017f, AbstractC3826q.f42018g);
                    return;
                case 4:
                    n10.s(AbstractC3826q.f42034w, AbstractC3826q.f42036y);
                    return;
                case 5:
                    n10.s(AbstractC3826q.f42033v, AbstractC3826q.f42037z);
                    return;
                case 6:
                    n10.s(AbstractC3826q.f42032u, AbstractC3826q.f42031t);
                    return;
                case 7:
                    n10.s(AbstractC3826q.f42016e, AbstractC3826q.f42030s);
                    return;
                case 8:
                    n10.s(AbstractC3826q.f42027p, AbstractC3826q.f42025n);
                    return;
                case 9:
                    n10.s(AbstractC3826q.f42023l, AbstractC3826q.f42021j);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        switch (a.$EnumSwitchMapping$0[stackAnimation.ordinal()]) {
            case 1:
                n10.s(AbstractC3826q.f42014c, AbstractC3826q.f42015d);
                return;
            case 2:
                int i11 = AbstractC3826q.f42028q;
                n10.s(i11, i11);
                return;
            case 3:
                n10.s(AbstractC3826q.f42017f, AbstractC3826q.f42018g);
                return;
            case 4:
                n10.s(AbstractC3826q.f42033v, AbstractC3826q.f42037z);
                return;
            case 5:
                n10.s(AbstractC3826q.f42034w, AbstractC3826q.f42036y);
                return;
            case 6:
                n10.s(AbstractC3826q.f42031t, AbstractC3826q.f42035x);
                return;
            case 7:
                n10.s(AbstractC3826q.f42029r, AbstractC3826q.f42019h);
                return;
            case 8:
                n10.s(AbstractC3826q.f42024m, AbstractC3826q.f42026o);
                return;
            case 9:
                n10.s(AbstractC3826q.f42020i, AbstractC3826q.f42022k);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
