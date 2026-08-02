package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cu0 {
    public final Integer a;
    public final Object b;
    public final i7f c;
    public final vu0 d;

    public cu0(Integer num, Object obj, i7f i7fVar, vu0 vu0Var) {
        this.a = num;
        if (obj == null) {
            yhk.s("Null payload");
            throw null;
        }
        this.b = obj;
        this.c = i7fVar;
        this.d = vu0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cu0)) {
            return false;
        }
        cu0 cu0Var = (cu0) obj;
        Integer num = cu0Var.a;
        Integer num2 = this.a;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.b.equals(cu0Var.b) || !this.c.equals(cu0Var.c)) {
            return false;
        }
        vu0 vu0Var = cu0Var.d;
        vu0 vu0Var2 = this.d;
        return vu0Var2 == null ? vu0Var == null : vu0Var2.equals(vu0Var);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        vu0 vu0Var = this.d;
        return (hashCode ^ (vu0Var != null ? vu0Var.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + ", eventContext=null}";
    }
}
