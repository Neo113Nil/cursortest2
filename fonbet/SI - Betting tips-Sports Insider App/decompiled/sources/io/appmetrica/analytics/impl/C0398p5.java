package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398p5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14458a;

    /* renamed from: b, reason: collision with root package name */
    public final C0241j f14459b = C0353na.k().b();

    /* renamed from: c, reason: collision with root package name */
    public final EnumSet f14460c = EnumSet.of(NetworkType.OFFLINE);

    /* renamed from: d, reason: collision with root package name */
    public final String f14461d = "connection based";

    public C0398p5(@NotNull Context context) {
        this.f14458a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C0241j c0241j = this.f14459b;
        Context context = this.f14458a;
        c0241j.getClass();
        Ce ce2 = Ge.f12262a;
        return !this.f14460c.contains((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Fe()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @NotNull
    public final String description() {
        return this.f14461d;
    }
}
