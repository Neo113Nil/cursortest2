package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604xc extends C0209hi implements Ia {
    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void b(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final List<String> f() {
        return new ArrayList();
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, String str) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Da
    public final void b(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, String str2, PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(@NonNull AnrListener anrListener) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Da
    public final void b(@NonNull String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(@NonNull ExternalAttribution externalAttribution) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Da
    public final boolean b() {
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(@NonNull Ho ho) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(@NonNull EnumC0342n enumC0342n) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(@NonNull String str, boolean z5) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z5) {
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z5, boolean z7) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void c() {
    }

    @Override // io.appmetrica.analytics.impl.C0209hi, io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.C0209hi, io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z5) {
    }
}
