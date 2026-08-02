package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ao {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12012a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12013b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final wo f12014c;

    /* renamed from: d, reason: collision with root package name */
    public final wo f12015d;

    public Ao(Context context) {
        this.f12012a = context;
        C0046ba c0046ba = new C0046ba(context, "appmetrica_vital.dat");
        this.f12014c = new wo(C0353na.k().y(), c0046ba);
        this.f12015d = new wo(new Ze(C0353na.k().B().e(context)), c0046ba);
    }

    public final wo a() {
        return this.f12014c;
    }

    public final wo b() {
        return this.f12015d;
    }
}
