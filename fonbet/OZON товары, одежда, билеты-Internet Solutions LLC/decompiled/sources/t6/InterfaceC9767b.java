package t6;

import C.o0;
import android.content.Intent;
import java.util.List;
import u6.C9975a;

/* renamed from: t6.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC9767b {

    /* renamed from: t6.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f99204a;

        /* renamed from: b, reason: collision with root package name */
        private final String f99205b;

        a(String str, String str2) {
            this.f99204a = str;
            this.f99205b = str2;
        }

        public final String a() {
            return this.f99204a;
        }

        public final String b() {
            return this.f99205b;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HostInfo{mDeviceId='");
            sb2.append(this.f99204a);
            sb2.append("', mWalletId='");
            return o0.c(sb2, this.f99205b, "'}");
        }
    }

    List<C9975a> a() throws C9772g;

    a b();

    Intent c(String str) throws C9772g;

    void disconnect() throws C9772g;
}
