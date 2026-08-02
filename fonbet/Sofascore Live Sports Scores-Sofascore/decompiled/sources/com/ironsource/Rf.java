package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Rf {

    @Nullable
    private final String a;

    @Nullable
    private final String b;
    private final boolean c;

    @Nullable
    private final Boolean d;

    public /* synthetic */ Rf(String str, boolean z, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }

    public final boolean a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.a aVar) {
        networkSettings.getClass();
        aVar.getClass();
        String str = this.b;
        if (str == null || str.length() == 0) {
            return true;
        }
        Uf uf = Uf.a;
        return Intrinsics.c(uf.a(networkSettings), this.b) && uf.a(networkSettings, aVar) == this.c;
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return Intrinsics.c(this.d, Boolean.TRUE);
    }

    public Rf(@Nullable String str, boolean z, @Nullable Boolean bool, @Nullable String str2) {
        this.a = str2;
        this.b = str;
        this.c = z;
        this.d = bool;
    }

    @Nullable
    public final String a() {
        return this.b;
    }
}
