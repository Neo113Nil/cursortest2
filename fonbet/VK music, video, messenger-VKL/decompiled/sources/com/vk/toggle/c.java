package com.vk.toggle;

import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.toggle.b;
import java.util.Collection;
import xsna.izs;
import xsna.v0p0;

/* compiled from: FeatureStorage.kt */
/* loaded from: classes11.dex */
public interface c {
    public static final a a = a.a;

    /* compiled from: FeatureStorage.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C1926a b = new C1926a();

        /* compiled from: FeatureStorage.kt */
        /* renamed from: com.vk.toggle.c$a$a, reason: collision with other inner class name */
        public static final class C1926a implements c {
            public final v0p0 b = new v0p0(this);

            public static void l() {
                if (!BuildInfo.m()) {
                    throw new IllegalStateException("Access to an empty FeatureStorage is prohibited. It looks like you accessed the ToggleManager before calling the init() method.");
                }
                L.l("Access to an empty FeatureStorage is prohibited. It looks like you accessed the ToggleManager before calling the init() method.");
            }

            @Override // com.vk.toggle.c
            public final long a() {
                l();
                return 0L;
            }

            @Override // com.vk.toggle.c
            public final b.d b(String str, boolean z) {
                l();
                return new b.d(str);
            }

            @Override // com.vk.toggle.c
            public final void c(b.d dVar, boolean z) {
                l();
            }

            @Override // com.vk.toggle.c
            public final void d(String str) {
                l();
            }

            @Override // com.vk.toggle.c
            public final v0p0 e() {
                return this.b;
            }

            @Override // com.vk.toggle.c
            public final void f(long j) {
                l();
            }

            @Override // com.vk.toggle.c
            public final void g(Collection collection) {
                l();
            }

            @Override // com.vk.toggle.c
            public final int getVersion() {
                l();
                return 0;
            }

            @Override // com.vk.toggle.c
            public final void h(izs izsVar, boolean z) {
                l();
            }

            @Override // com.vk.toggle.c
            public final String i() {
                l();
                return "EMPTY";
            }

            @Override // com.vk.toggle.c
            public final boolean isEmpty() {
                l();
                return true;
            }

            @Override // com.vk.toggle.c
            public final boolean j(String str, boolean z) {
                l();
                return false;
            }

            @Override // com.vk.toggle.c
            public final void k(String str, boolean z) {
                l();
            }

            @Override // com.vk.toggle.c
            public final void removeAll() {
                l();
            }

            @Override // com.vk.toggle.c
            public final void setVersion(int i) {
                l();
            }
        }
    }

    long a();

    b.d b(String str, boolean z);

    void c(b.d dVar, boolean z);

    void d(String str);

    v0p0 e();

    void f(long j);

    void g(Collection collection);

    int getVersion();

    void h(izs izsVar, boolean z);

    String i();

    boolean isEmpty();

    boolean j(String str, boolean z);

    void k(String str, boolean z);

    void removeAll();

    void setVersion(int i);
}
