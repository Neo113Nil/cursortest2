package com.oblador.keychain;

import cc.InterfaceC2910b;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39120a = a.f39121a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f39121a = new a();

        public final String a(String service) {
            Intrinsics.checkNotNullParameter(service, "service");
            return service + ":c";
        }

        public final String b(String service) {
            Intrinsics.checkNotNullParameter(service, "service");
            return service + ":p";
        }

        public final String c(String service) {
            Intrinsics.checkNotNullParameter(service, "service");
            return service + ":u";
        }

        public final boolean d(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return StringsKt.endsWith$default(key, ":c", false, 2, (Object) null);
        }
    }

    public static final class b extends InterfaceC2910b.a {

        /* renamed from: c, reason: collision with root package name */
        public final String f39122c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String cipherStorageName, byte[] bArr, byte[] bArr2) {
            super(bArr, bArr2);
            Intrinsics.checkNotNullParameter(cipherStorageName, "cipherStorageName");
            this.f39122c = cipherStorageName;
        }
    }

    b a(String str);

    Set b();

    void c(String str);

    void d(String str, InterfaceC2910b.c cVar);
}
