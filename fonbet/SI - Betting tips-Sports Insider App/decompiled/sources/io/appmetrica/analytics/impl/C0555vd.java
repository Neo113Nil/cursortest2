package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.vd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555vd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14788a;

    /* renamed from: b, reason: collision with root package name */
    public final Ka f14789b;

    /* renamed from: c, reason: collision with root package name */
    public final C0601x9 f14790c;

    /* renamed from: d, reason: collision with root package name */
    public final Ae f14791d;

    /* renamed from: e, reason: collision with root package name */
    public final po f14792e;

    /* renamed from: f, reason: collision with root package name */
    public volatile IdentifiersResult f14793f;

    public C0555vd(Context context, Ka ka2) {
        this(context, ka2, AbstractC0580wd.a(context), new Ae(context), new po());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult a() {
        IdentifiersResult identifiersResult = this.f14793f;
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            po poVar = this.f14792e;
            String str = identifiersResult.f15009id;
            poVar.getClass();
            if (po.a(str)) {
                return identifiersResult;
            }
        }
        try {
            C0601x9 c0601x9 = this.f14790c;
            c0601x9.f14914a.lock();
            c0601x9.f14915b.a();
            identifiersResult = this.f14793f;
        } catch (Throwable unused) {
        }
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            po poVar2 = this.f14792e;
            String str2 = identifiersResult.f15009id;
            poVar2.getClass();
            if (po.a(str2)) {
                C0601x9 c0601x92 = this.f14790c;
                c0601x92.f14915b.b();
                c0601x92.f14914a.unlock();
                return identifiersResult == null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
            }
        }
        String a7 = Ja.a(FileUtils.getFileFromSdkStorage(this.f14791d.f11996a, "uuid.dat"));
        this.f14792e.getClass();
        if (!po.a(a7)) {
            a7 = this.f14791d.a(this.f14789b.a(this.f14788a));
        }
        this.f14792e.getClass();
        if (po.a(a7)) {
            IdentifiersResult identifiersResult2 = new IdentifiersResult(a7, IdentifierStatus.OK, null);
            try {
                this.f14793f = identifiersResult2;
            } catch (Throwable unused2) {
            }
            identifiersResult = identifiersResult2;
        }
        C0601x9 c0601x922 = this.f14790c;
        c0601x922.f14915b.b();
        c0601x922.f14914a.unlock();
        if (identifiersResult == null) {
        }
    }

    public C0555vd(Context context, Ka ka2, C0601x9 c0601x9, Ae ae2, po poVar) {
        this.f14788a = context;
        this.f14789b = ka2;
        this.f14790c = c0601x9;
        this.f14791d = ae2;
        this.f14792e = poVar;
        try {
            c0601x9.a();
            ae2.a();
            c0601x9.b();
        } catch (Throwable unused) {
            this.f14790c.b();
        }
    }
}
