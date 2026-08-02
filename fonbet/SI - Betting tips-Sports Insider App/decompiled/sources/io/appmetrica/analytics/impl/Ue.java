package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ue implements Rc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12973b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12974c;

    public Ue(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        this.f12972a = context;
        this.f12973b = str;
        this.f12974c = str2;
    }

    @NotNull
    public final Ue a(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        return new Ue(context, str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ue)) {
            return false;
        }
        Ue ue2 = (Ue) obj;
        return Intrinsics.areEqual(this.f12972a, ue2.f12972a) && Intrinsics.areEqual(this.f12973b, ue2.f12973b) && Intrinsics.areEqual(this.f12974c, ue2.f12974c);
    }

    public final int hashCode() {
        return this.f12974c.hashCode() + r4.k.j(this.f12972a.hashCode() * 31, 31, this.f12973b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreferencesBasedModuleEntryPoint(context=");
        sb2.append(this.f12972a);
        sb2.append(", prefName=");
        sb2.append(this.f12973b);
        sb2.append(", prefValueName=");
        return d9.e.k(sb2, this.f12974c, ')');
    }

    public static Ue a(Ue ue2, Context context, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            context = ue2.f12972a;
        }
        if ((i5 & 2) != 0) {
            str = ue2.f12973b;
        }
        if ((i5 & 4) != 0) {
            str2 = ue2.f12974c;
        }
        ue2.getClass();
        return new Ue(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Rc
    @NotNull
    public final String a() {
        String string = this.f12972a.getSharedPreferences(this.f12973b, 0).getString(this.f12974c, "");
        return string == null ? "" : string;
    }
}
