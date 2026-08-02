package ge;

import androidx.lifecycle.c1;
import androidx.lifecycle.k1;
import kotlin.jvm.internal.Intrinsics;
import le.d1;
import le.f2;
import le.z;
import pd.x;
import te.l0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i5) {
        super(1);
        this.f9983c = i5;
    }

    @Override // androidx.lifecycle.c1, androidx.lifecycle.m1
    public final k1 a(Class modelClass) {
        int i5 = this.f9983c;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        switch (i5) {
            case 0:
                try {
                    Object newInstance = modelClass.getConstructor(s.class).newInstance(null);
                    Intrinsics.checkNotNull(newInstance);
                    return (k1) newInstance;
                } catch (NoSuchMethodException unused) {
                    return new s();
                }
            case 1:
                try {
                    Object newInstance2 = modelClass.getConstructor(le.h.class).newInstance(null);
                    Intrinsics.checkNotNull(newInstance2);
                    return (k1) newInstance2;
                } catch (NoSuchMethodException unused2) {
                    return new le.h();
                }
            case 2:
                try {
                    Object newInstance3 = modelClass.getConstructor(z.class).newInstance(null);
                    Intrinsics.checkNotNull(newInstance3);
                    return (k1) newInstance3;
                } catch (NoSuchMethodException unused3) {
                    return new z();
                }
            case 3:
                try {
                    Object newInstance4 = modelClass.getConstructor(d1.class).newInstance(null);
                    Intrinsics.checkNotNull(newInstance4);
                    return (k1) newInstance4;
                } catch (NoSuchMethodException unused4) {
                    return new d1();
                }
            case 4:
                try {
                    Object newInstance5 = modelClass.getConstructor(f2.class).newInstance(null);
                    Intrinsics.checkNotNull(newInstance5);
                    return (k1) newInstance5;
                } catch (NoSuchMethodException unused5) {
                    return new f2();
                }
            case 5:
                try {
                    Object newInstance6 = modelClass.getConstructor(oe.g.class).newInstance(null);
                    Intrinsics.checkNotNull(newInstance6);
                    return (k1) newInstance6;
                } catch (NoSuchMethodException unused6) {
                    return new oe.g();
                }
            case 6:
                try {
                    Object newInstance7 = modelClass.getConstructor(pd.c.class).newInstance(null);
                    Intrinsics.checkNotNull(newInstance7);
                    return (k1) newInstance7;
                } catch (NoSuchMethodException unused7) {
                    return new pd.c();
                }
            case 7:
                try {
                    Object newInstance8 = modelClass.getConstructor(x.class).newInstance(null);
                    Intrinsics.checkNotNull(newInstance8);
                    return (k1) newInstance8;
                } catch (NoSuchMethodException unused8) {
                    return new x();
                }
            case 8:
                try {
                    Object newInstance9 = modelClass.getConstructor(x.class).newInstance(null);
                    Intrinsics.checkNotNull(newInstance9);
                    return (k1) newInstance9;
                } catch (NoSuchMethodException unused9) {
                    return new x();
                }
            case 9:
                try {
                    Object newInstance10 = modelClass.getConstructor(pe.f.class).newInstance(null);
                    Intrinsics.checkNotNull(newInstance10);
                    return (k1) newInstance10;
                } catch (NoSuchMethodException unused10) {
                    return new pe.f();
                }
            case 10:
                try {
                    Object newInstance11 = modelClass.getConstructor(pe.s.class).newInstance(null);
                    Intrinsics.checkNotNull(newInstance11);
                    return (k1) newInstance11;
                } catch (NoSuchMethodException unused11) {
                    return new pe.s();
                }
            case 11:
                try {
                    Object newInstance12 = modelClass.getConstructor(se.p.class).newInstance(null);
                    Intrinsics.checkNotNull(newInstance12);
                    return (k1) newInstance12;
                } catch (NoSuchMethodException unused12) {
                    return new se.p();
                }
            default:
                try {
                    Object newInstance13 = modelClass.getConstructor(l0.class).newInstance(null);
                    Intrinsics.checkNotNull(newInstance13);
                    return (k1) newInstance13;
                } catch (NoSuchMethodException unused13) {
                    return new l0();
                }
        }
    }
}
