package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import cb.k;
import com.google.crypto.tink.proto.C;
import com.google.crypto.tink.proto.t;
import com.google.crypto.tink.q;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class d implements q {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f37037a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37038b;

    public d(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f37038b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f37037a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f37037a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // com.google.crypto.tink.q
    public void a(C c10) {
        if (!this.f37037a.putString(this.f37038b, k.b(c10.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.crypto.tink.q
    public void b(t tVar) {
        if (!this.f37037a.putString(this.f37038b, k.b(tVar.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
