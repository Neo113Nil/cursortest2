package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Z9 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Z9 f13281c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13282a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f13283b = new HashMap();

    public Z9(Context context) {
        this.f13282a = context;
    }

    public static final Z9 a(Context context) {
        if (f13281c == null) {
            synchronized (Reflection.getOrCreateKotlinClass(Z9.class)) {
                try {
                    if (f13281c == null) {
                        f13281c = new Z9(context);
                    }
                    Unit unit = Unit.f19194a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Z9 z92 = f13281c;
        if (z92 != null) {
            return z92;
        }
        Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
        return null;
    }

    public final synchronized C0601x9 b(String str) {
        Object obj;
        try {
            HashMap hashMap = this.f13283b;
            obj = hashMap.get(str);
            if (obj == null) {
                obj = new C0601x9(this.f13282a, str);
                hashMap.put(str, obj);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C0601x9) obj;
    }

    public final synchronized void a(String str) {
        this.f13283b.remove(str);
    }
}
