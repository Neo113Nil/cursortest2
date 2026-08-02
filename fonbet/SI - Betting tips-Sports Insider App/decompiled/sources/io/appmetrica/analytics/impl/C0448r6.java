package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448r6 implements Cf {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0424q6 f14545b = new C0424q6();

    /* renamed from: a, reason: collision with root package name */
    public final Cf f14546a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0448r6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.impl.Cf
    @Nullable
    public final String a() {
        return this.f14546a.a();
    }

    public final boolean b() {
        try {
            String a7 = this.f14546a.a();
            if (a7 != null && a7.length() > 0) {
                return !StringsKt.A(a7, StringUtils.PROCESS_POSTFIX_DELIMITER, false);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public C0448r6(@NotNull Cf cf2) {
        this.f14546a = cf2;
    }

    public final boolean a(@NotNull String str) {
        try {
            String a7 = this.f14546a.a();
            if (a7 != null && a7.length() > 0) {
                if (kotlin.text.z.i(a7, StringUtils.PROCESS_POSTFIX_DELIMITER + str, false)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0448r6(Cf cf2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(cf2);
        if ((i5 & 1) != 0) {
            f14545b.getClass();
            cf2 = C0424q6.a();
        }
    }
}
