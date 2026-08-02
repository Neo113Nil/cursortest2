package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Qf {
    private final String a;
    private final String b;
    private final boolean c;
    private final Boolean d;

    public Qf(String str, boolean z, Boolean bool, String str2) {
        this.a = str2;
        this.b = str;
        this.c = z;
        this.d = bool;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return Intrinsics.areEqual(this.d, Boolean.TRUE);
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        String str = this.b;
        if (str == null || str.length() == 0) {
            return true;
        }
        Tf tf = Tf.a;
        return Intrinsics.areEqual(tf.a(networkSettings), this.b) && tf.a(networkSettings, adUnit) == this.c;
    }

    public /* synthetic */ Qf(String str, boolean z, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }
}
