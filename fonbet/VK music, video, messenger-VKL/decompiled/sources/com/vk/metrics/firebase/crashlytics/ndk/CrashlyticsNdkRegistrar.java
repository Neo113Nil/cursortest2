package com.vk.metrics.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.io.File;
import java.util.List;
import xsna.bd3;
import xsna.e43;
import xsna.f5k;
import xsna.fw50;
import xsna.gzl;
import xsna.i8i;
import xsna.j5k;
import xsna.v2z;
import xsna.wn5;

/* compiled from: CrashlyticsNdkRegistrar.kt */
/* loaded from: classes.dex */
public final class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<i8i<?>> getComponents() {
        i8i.a a2 = i8i.a(f5k.class);
        a2.a = "fire-cls-ndk";
        a2.a(gzl.b(Context.class));
        a2.f = new bd3();
        a2.c(2);
        return e43.l(a2.b(), v2z.a("fire-cls-ndk", "19.4.4"));
    }

    /* compiled from: CrashlyticsNdkRegistrar.kt */
    public static final class a implements f5k {

        /* compiled from: CrashlyticsNdkRegistrar.kt */
        /* renamed from: com.vk.metrics.firebase.crashlytics.ndk.CrashlyticsNdkRegistrar$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C1277a implements fw50 {
            @Override // xsna.fw50
            public final j5k.a a() {
                return null;
            }

            @Override // xsna.fw50
            public final File b() {
                return null;
            }

            @Override // xsna.fw50
            public final File c() {
                return null;
            }

            @Override // xsna.fw50
            public final File d() {
                return null;
            }

            @Override // xsna.fw50
            public final File e() {
                return null;
            }

            @Override // xsna.fw50
            public final File f() {
                return null;
            }

            @Override // xsna.fw50
            public final File g() {
                return null;
            }
        }

        @Override // xsna.f5k
        public final fw50 b(String str) {
            return new C1277a();
        }

        @Override // xsna.f5k
        public final boolean c() {
            return false;
        }

        @Override // xsna.f5k
        public final boolean d(String str) {
            return false;
        }

        @Override // xsna.f5k
        public final void a(String str, long j, wn5 wn5Var) {
        }
    }
}
