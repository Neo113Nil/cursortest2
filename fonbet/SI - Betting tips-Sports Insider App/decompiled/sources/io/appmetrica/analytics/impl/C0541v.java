package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541v implements InterfaceC0566w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14761a;

    public C0541v(@NotNull Context context) {
        this.f14761a = context;
    }

    @Nullable
    public final String a() {
        C0040b4 l6 = C0040b4.l();
        Context context = this.f14761a;
        M9 m92 = l6.f13389t;
        if (m92 == null) {
            synchronized (l6) {
                try {
                    m92 = l6.f13389t;
                    if (m92 == null) {
                        m92 = new M9(context);
                        l6.f13389t = m92;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = m92.f12579d.getApplicationMetaData(m92.f12576a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
