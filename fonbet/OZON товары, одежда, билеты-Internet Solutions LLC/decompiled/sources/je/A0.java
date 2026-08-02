package je;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class A0 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    private final L0 f69823a;

    /* renamed from: b, reason: collision with root package name */
    private final N f69824b;

    public A0(@NotNull N n11, @NotNull L0 l02) {
        if (l02 == null) {
            d(0);
            throw null;
        }
        if (n11 == null) {
            d(1);
            throw null;
        }
        this.f69823a = l02;
        this.f69824b = n11;
    }

    private static /* synthetic */ void d(int i11) {
        String str = (i11 == 4 || i11 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5) ? 2 : 3];
        switch (i11) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i11 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i11 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i11 == 3) {
            objArr[2] = "replaceType";
        } else if (i11 != 4 && i11 != 5) {
            if (i11 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i11 != 4 && i11 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // je.y0
    public final boolean a() {
        return false;
    }

    @Override // je.y0
    @NotNull
    public final L0 b() {
        L0 l02 = this.f69823a;
        if (l02 != null) {
            return l02;
        }
        d(4);
        throw null;
    }

    @Override // je.y0
    @NotNull
    public final y0 c(@NotNull ke.h hVar) {
        if (hVar != null) {
            return new A0(hVar.a(this.f69824b), this.f69823a);
        }
        d(6);
        throw null;
    }

    @Override // je.y0
    @NotNull
    public final N getType() {
        N n11 = this.f69824b;
        if (n11 != null) {
            return n11;
        }
        d(5);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A0(@NotNull N n11) {
        this(n11, L0.INVARIANT);
        if (n11 != null) {
        } else {
            d(2);
            throw null;
        }
    }
}
