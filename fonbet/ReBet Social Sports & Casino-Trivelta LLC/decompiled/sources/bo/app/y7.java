package bo.app;

import Zh.B;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import com.braze.models.FeatureFlag;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import di.C4093i;
import di.J0;
import di.N;
import di.Z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class y7 implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final y7 f26320a;
    private static final bi.f descriptor;

    static {
        y7 y7Var = new y7();
        f26320a = y7Var;
        J0 j02 = new J0("com.braze.models.FeatureFlag", y7Var, 4);
        j02.n(StackTraceHelper.ID_KEY, false);
        j02.n(ViewProps.ENABLED, false);
        j02.n("properties", false);
        j02.n("fts", true);
        descriptor = j02;
    }

    @Override // di.N
    public final InterfaceC1901b[] childSerializers() {
        Z0 z02 = Z0.f45341a;
        return new InterfaceC1901b[]{z02, C4093i.f45370a, z02, AbstractC2028a.t(z02)};
    }

    @Override // Zh.InterfaceC1900a
    public final Object deserialize(ci.e decoder) {
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        bi.f fVar = descriptor;
        ci.c c10 = decoder.c(fVar);
        if (c10.q()) {
            String s10 = c10.s(fVar, 0);
            boolean t10 = c10.t(fVar, 1);
            String s11 = c10.s(fVar, 2);
            str = s10;
            str3 = (String) c10.C(fVar, 3, Z0.f45341a, null);
            str2 = s11;
            z10 = t10;
            i10 = 15;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            int i11 = 0;
            while (z11) {
                int e10 = c10.e(fVar);
                if (e10 == -1) {
                    z11 = false;
                } else if (e10 == 0) {
                    str4 = c10.s(fVar, 0);
                    i11 |= 1;
                } else if (e10 == 1) {
                    z12 = c10.t(fVar, 1);
                    i11 |= 2;
                } else if (e10 == 2) {
                    str5 = c10.s(fVar, 2);
                    i11 |= 4;
                } else {
                    if (e10 != 3) {
                        throw new B(e10);
                    }
                    str6 = (String) c10.C(fVar, 3, Z0.f45341a, str6);
                    i11 |= 8;
                }
            }
            z10 = z12;
            i10 = i11;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        c10.b(fVar);
        return new FeatureFlag(i10, str, z10, str2, str3, null);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public final bi.f getDescriptor() {
        return descriptor;
    }

    @Override // Zh.p
    public final void serialize(ci.f encoder, Object obj) {
        FeatureFlag value = (FeatureFlag) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        bi.f fVar = descriptor;
        ci.d c10 = encoder.c(fVar);
        FeatureFlag.write$Self$android_sdk_base_release(value, c10, fVar);
        c10.b(fVar);
    }
}
