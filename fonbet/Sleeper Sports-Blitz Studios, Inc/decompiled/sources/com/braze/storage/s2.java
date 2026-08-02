package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f752a;
    public final String b;
    public final String c;
    public final t2 d;

    public s2(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f752a = context;
        this.b = str;
        this.c = str2;
        this.d = new t2(context, str, str2);
    }

    public final String a() {
        return String.valueOf(this.d.readData(DataStoreKey.SDK_AUTH, ""));
    }

    public final void b(final String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.s2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s2.a(str);
            }
        }, 6, (Object) null);
        t2 t2Var = this.d;
        DataStoreKey dataStoreKey = DataStoreKey.SDK_AUTH;
        if (str == null) {
            str = "";
        }
        t2Var.writeData(dataStoreKey, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return Intrinsics.areEqual(this.f752a, s2Var.f752a) && Intrinsics.areEqual(this.b, s2Var.b) && Intrinsics.areEqual(this.c, s2Var.c);
    }

    public final int hashCode() {
        int hashCode = this.f752a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SdkAuthenticationCache(context=" + this.f752a + ", userId=" + this.b + ", apiKey=" + this.c + ")";
    }

    public static final String a(String str) {
        return "Setting signature to: " + str;
    }
}
