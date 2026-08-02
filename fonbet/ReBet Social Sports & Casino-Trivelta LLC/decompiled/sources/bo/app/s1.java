package bo.app;

import Zh.B;
import Zh.InterfaceC1901b;
import com.braze.models.BrazeGeofence;
import com.facebook.react.devsupport.StackTraceHelper;
import di.C;
import di.C4093i;
import di.J0;
import di.N;
import di.Y;
import di.Z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f26036a;
    private static final bi.f descriptor;

    static {
        s1 s1Var = new s1();
        f26036a = s1Var;
        J0 j02 = new J0("com.braze.models.BrazeGeofence", s1Var, 12);
        j02.n(StackTraceHelper.ID_KEY, false);
        j02.n("latitude", false);
        j02.n("longitude", false);
        j02.n("radius", false);
        j02.n("cooldown_enter", false);
        j02.n("cooldown_exit", false);
        j02.n("analytics_enabled_enter", false);
        j02.n("analytics_enabled_exit", false);
        j02.n("enter_events", false);
        j02.n("exit_events", false);
        j02.n("notification_responsiveness", false);
        j02.n("distanceFromGeofenceRefresh", true);
        descriptor = j02;
    }

    @Override // di.N
    public final InterfaceC1901b[] childSerializers() {
        C c10 = C.f45283a;
        Y y10 = Y.f45337a;
        C4093i c4093i = C4093i.f45370a;
        return new InterfaceC1901b[]{Z0.f45341a, c10, c10, y10, y10, y10, c4093i, c4093i, c4093i, c4093i, y10, c10};
    }

    @Override // Zh.InterfaceC1900a
    public final Object deserialize(ci.e decoder) {
        String str;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        boolean z13;
        int i14;
        double d10;
        double d11;
        double d12;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        bi.f fVar = descriptor;
        ci.c c10 = decoder.c(fVar);
        if (c10.q()) {
            str = c10.s(fVar, 0);
            double B10 = c10.B(fVar, 1);
            double B11 = c10.B(fVar, 2);
            int F10 = c10.F(fVar, 3);
            int F11 = c10.F(fVar, 4);
            int F12 = c10.F(fVar, 5);
            boolean t10 = c10.t(fVar, 6);
            boolean t11 = c10.t(fVar, 7);
            boolean t12 = c10.t(fVar, 8);
            boolean t13 = c10.t(fVar, 9);
            i10 = 4095;
            i11 = c10.F(fVar, 10);
            z10 = t13;
            z11 = t11;
            z12 = t10;
            i12 = F12;
            i13 = F10;
            z13 = t12;
            i14 = F11;
            d10 = B10;
            d11 = B11;
            d12 = c10.B(fVar, 11);
        } else {
            str = null;
            boolean z14 = true;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            int i15 = 0;
            int i16 = 0;
            boolean z18 = false;
            int i17 = 0;
            double d13 = 0.0d;
            double d14 = 0.0d;
            double d15 = 0.0d;
            int i18 = 0;
            int i19 = 0;
            while (z14) {
                int e10 = c10.e(fVar);
                switch (e10) {
                    case -1:
                        z14 = false;
                        continue;
                    case 0:
                        str = c10.s(fVar, 0);
                        i18 |= 1;
                        continue;
                    case 1:
                        d13 = c10.B(fVar, 1);
                        i18 |= 2;
                        break;
                    case 2:
                        d14 = c10.B(fVar, 2);
                        i18 |= 4;
                        break;
                    case 3:
                        i16 = c10.F(fVar, 3);
                        i18 |= 8;
                        break;
                    case 4:
                        i17 = c10.F(fVar, 4);
                        i18 |= 16;
                        break;
                    case 5:
                        i15 = c10.F(fVar, 5);
                        i18 |= 32;
                        break;
                    case 6:
                        z17 = c10.t(fVar, 6);
                        i18 |= 64;
                        break;
                    case 7:
                        z16 = c10.t(fVar, 7);
                        i18 |= 128;
                        break;
                    case 8:
                        z18 = c10.t(fVar, 8);
                        i18 |= 256;
                        break;
                    case 9:
                        z15 = c10.t(fVar, 9);
                        i18 |= 512;
                        break;
                    case 10:
                        i19 = c10.F(fVar, 10);
                        i18 |= 1024;
                        break;
                    case 11:
                        d15 = c10.B(fVar, 11);
                        i18 |= 2048;
                        break;
                    default:
                        throw new B(e10);
                }
            }
            i10 = i18;
            i11 = i19;
            z10 = z15;
            z11 = z16;
            z12 = z17;
            i12 = i15;
            i13 = i16;
            z13 = z18;
            i14 = i17;
            d10 = d13;
            d11 = d14;
            d12 = d15;
        }
        String str2 = str;
        c10.b(fVar);
        return new BrazeGeofence(i10, str2, d10, d11, i13, i14, i12, z12, z11, z13, z10, i11, d12, null);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public final bi.f getDescriptor() {
        return descriptor;
    }

    @Override // Zh.p
    public final void serialize(ci.f encoder, Object obj) {
        BrazeGeofence value = (BrazeGeofence) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        bi.f fVar = descriptor;
        ci.d c10 = encoder.c(fVar);
        BrazeGeofence.write$Self$android_sdk_base_release(value, c10, fVar);
        c10.b(fVar);
    }
}
