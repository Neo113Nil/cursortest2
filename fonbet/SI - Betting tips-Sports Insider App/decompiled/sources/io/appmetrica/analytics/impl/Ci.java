package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class Ci {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    protected final Context f12111a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12112b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12113c;

    public Ci(Context context, String str, String str2) {
        this.f12111a = context;
        this.f12112b = str;
        this.f12113c = str2;
    }

    public final Object a() {
        int identifier = this.f12111a.getResources().getIdentifier(this.f12112b, this.f12113c, this.f12111a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract Object a(int i5);
}
