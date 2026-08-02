package Fc;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3665a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f3666b = LazyKt.lazy(d.f3673d);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3667a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final List f3668b = CollectionsKt.listOf((Object[]) new String[]{"LxMZEQYdAxAQDRsLEwQeCQ==", "LwUIEBkWBAAe", "LxMZEQYdAxARChAJBAAe", "LxMZEQYdAxARChAPCwAJBAAe", "LxMZEQYdAxARDRoCCwEQDwgCBw8eCQ4eCQ==", "LxMZEQYdAxARCxAPDRAPDhARDRUeBA8eCQ=="});

        public final List a() {
            List list = f3668b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b.f3665a.b((String) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: Fc.b$b, reason: collision with other inner class name */
    public static final class C0079b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0079b f3669a = new C0079b();

        /* renamed from: b, reason: collision with root package name */
        public static final List f3670b = CollectionsKt.listOf((Object[]) new String[]{"EAARDQAe", "EAARDQATDhsRDgYR", "EQkODAgbGQ==", "EQwYCgsWCA==", "FwgJBg8VEwwODhk="});

        public final List a() {
            List list = f3670b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b.f3665a.b((String) it.next()));
            }
            return arrayList;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f3671a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final List f3672b = CollectionsKt.listOf((Object[]) new String[]{"EQwODAgbCg4OBg8RDRgMGxYOCgcBHxA=", "EQwODAgbCg4OBg8RGAYQDwgWDRUe", "EQwODAgZChAODxACEhQKDQcRGQ==", "EQwODAgODQsZGQcbChQQEA4HBw==", "EQwODAgJCQgJCAQOEg0TCg8L"});

        public final List a() {
            List list = f3672b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b.f3665a.b((String) it.next()));
            }
            return arrayList;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f3673d = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final byte[] invoke() {
            return b.a(b.f3665a);
        }
    }

    public static final byte[] a(b bVar) {
        bVar.getClass();
        byte[] bytes = "SurtGuardianSDK_v0.3.0_SecureKey_2025".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public final String b(String ciphertext) {
        Intrinsics.checkNotNullParameter(ciphertext, "ciphertext");
        byte[] decode = Base64.decode(ciphertext, 2);
        byte[] bArr = new byte[decode.length];
        int length = decode.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = decode[i10];
            Lazy lazy = f3666b;
            bArr[i10] = (byte) (b10 ^ ((byte[]) lazy.getValue())[i10 % ((byte[]) lazy.getValue()).length]);
        }
        return new String(bArr, Charsets.UTF_8);
    }
}
