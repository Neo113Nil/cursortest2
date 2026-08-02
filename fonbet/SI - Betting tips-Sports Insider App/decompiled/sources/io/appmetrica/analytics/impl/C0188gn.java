package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188gn {

    /* renamed from: a, reason: collision with root package name */
    public final C0642z0 f13851a;

    /* renamed from: b, reason: collision with root package name */
    public final Ho f13852b;

    /* renamed from: c, reason: collision with root package name */
    public final C0367o f13853c;

    /* renamed from: d, reason: collision with root package name */
    public final Wk f13854d;

    /* renamed from: e, reason: collision with root package name */
    public final E5 f13855e;

    /* renamed from: f, reason: collision with root package name */
    public final C0072ca f13856f;

    public C0188gn(C0642z0 c0642z0, Ho ho, C0367o c0367o, Wk wk, E5 e52, C0072ca c0072ca) {
        this.f13851a = c0642z0;
        this.f13852b = ho;
        this.f13853c = c0367o;
        this.f13854d = wk;
        this.f13855e = e52;
        this.f13856f = c0072ca;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new ap(4));
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C0188gn(C0642z0 c0642z0, Ho ho) {
        this(c0642z0, ho, C0040b4.l().a(), C0040b4.l().o(), C0040b4.l().h(), C0040b4.l().k());
    }
}
