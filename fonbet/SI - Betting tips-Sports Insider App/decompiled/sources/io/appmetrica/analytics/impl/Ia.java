package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface Ia extends Da, Hc {
    void a(Activity activity);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(Location location);

    void a(@NonNull AnrListener anrListener);

    void a(@NonNull ExternalAttribution externalAttribution);

    void a(@NonNull Ho ho);

    void a(@NonNull EnumC0342n enumC0342n);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(String str, String str2);

    void a(@NonNull String str, boolean z5);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(boolean z5);

    @Override // io.appmetrica.analytics.impl.Hc
    /* synthetic */ void a(boolean z5, boolean z7);

    void b(Activity activity);

    @Override // io.appmetrica.analytics.impl.Da
    /* synthetic */ void b(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.Da
    /* synthetic */ void b(@NonNull String str, String str2);

    @Override // io.appmetrica.analytics.impl.Da
    /* synthetic */ boolean b();

    void c();

    List<String> f();
}
