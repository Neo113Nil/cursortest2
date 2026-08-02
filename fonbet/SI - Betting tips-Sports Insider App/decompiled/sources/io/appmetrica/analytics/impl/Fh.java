package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class Fh extends H3 {

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    protected D8 f12226c;

    /* renamed from: d, reason: collision with root package name */
    protected C0532uf f12227d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12228e;

    /* renamed from: f, reason: collision with root package name */
    public String f12229f;

    public Fh(@NonNull Bf bf2, @NonNull CounterConfiguration counterConfiguration, @NonNull D8 d82) {
        this(bf2, counterConfiguration, d82, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f12301b.toBundle(bundle);
        Bf bf2 = this.f12300a;
        synchronized (bf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", bf2);
        }
        return bundle;
    }

    public final synchronized String d() {
        D8 d82;
        d82 = this.f12226c;
        return d82.f12136a.isEmpty() ? null : new JSONObject(d82.f12136a).toString();
    }

    public final synchronized String e() {
        return this.f12229f;
    }

    public boolean f() {
        return this.f12228e;
    }

    public Fh(@NonNull Bf bf2, @NonNull CounterConfiguration counterConfiguration, @NonNull D8 d82, String str) {
        super(bf2, counterConfiguration);
        this.f12228e = true;
        this.f12229f = str;
        this.f12226c = d82;
    }
}
