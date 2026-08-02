package uh;

import java.util.Arrays;

/* renamed from: uh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6577a implements InterfaceC6579c {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC6579c f66715a = new C6577a(new Object[0]);
    private final Object[] entries;

    public C6577a(Object[] objArr) {
        this.entries = objArr;
    }

    public static InterfaceC6579c d() {
        return f66715a;
    }

    @Override // uh.InterfaceC6579c
    public InterfaceC6579c f(InterfaceC6580d interfaceC6580d, Object obj) {
        int i10 = 0;
        while (true) {
            Object[] objArr = this.entries;
            if (i10 >= objArr.length) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 2);
                copyOf[copyOf.length - 2] = interfaceC6580d;
                copyOf[copyOf.length - 1] = obj;
                return new C6577a(copyOf);
            }
            if (objArr[i10] == interfaceC6580d) {
                int i11 = i10 + 1;
                if (objArr[i11] == obj) {
                    return this;
                }
                Object[] objArr2 = (Object[]) objArr.clone();
                objArr2[i11] = obj;
                return new C6577a(objArr2);
            }
            i10 += 2;
        }
    }

    @Override // uh.InterfaceC6579c
    public Object h(InterfaceC6580d interfaceC6580d) {
        int i10 = 0;
        while (true) {
            Object[] objArr = this.entries;
            if (i10 >= objArr.length) {
                return null;
            }
            if (objArr[i10] == interfaceC6580d) {
                return objArr[i10 + 1];
            }
            i10 += 2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        int i10 = 0;
        while (true) {
            Object[] objArr = this.entries;
            if (i10 >= objArr.length) {
                break;
            }
            sb2.append(objArr[i10]);
            sb2.append('=');
            sb2.append(this.entries[i10 + 1]);
            sb2.append(", ");
            i10 += 2;
        }
        if (sb2.length() > 1) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
