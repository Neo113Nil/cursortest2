package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class N5 extends BaseRequestConfig {

    /* renamed from: a, reason: collision with root package name */
    public String f12626a;

    /* renamed from: b, reason: collision with root package name */
    public String f12627b;

    /* renamed from: c, reason: collision with root package name */
    public C0161fm f12628c;

    public final String b() {
        return this.f12627b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f12626a + "', mAppSystem='" + this.f12627b + "', startupState=" + this.f12628c + '}';
    }

    @NonNull
    public final String a() {
        return this.f12626a;
    }
}
