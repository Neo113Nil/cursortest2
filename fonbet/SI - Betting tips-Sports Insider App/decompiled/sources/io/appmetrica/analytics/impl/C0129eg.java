package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.eg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129eg {

    /* renamed from: a, reason: collision with root package name */
    public final C0309lg f13690a;

    /* renamed from: b, reason: collision with root package name */
    public final C0652za f13691b;

    /* renamed from: c, reason: collision with root package name */
    public final C0583wg f13692c;

    /* renamed from: d, reason: collision with root package name */
    public final gf.i f13693d = gf.k.b(new C0052bg(this));

    /* renamed from: e, reason: collision with root package name */
    public final gf.i f13694e = gf.k.b(new Zf(this));

    /* renamed from: f, reason: collision with root package name */
    public final gf.i f13695f = gf.k.b(new C0104dg(this));

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f13696g = new ArrayList();

    public C0129eg(C0309lg c0309lg, C0558vg c0558vg, C0652za c0652za, C0583wg c0583wg) {
        this.f13690a = c0309lg;
        this.f13691b = c0652za;
        this.f13692c = c0583wg;
    }

    public static final Wf a(C0129eg c0129eg) {
        return (Wf) c0129eg.f13693d.getValue();
    }

    public static final void a(C0129eg c0129eg, C0359ng c0359ng, Wf wf2) {
        boolean areEqual;
        c0129eg.f13696g.add(c0359ng);
        C0583wg c0583wg = c0129eg.f13692c;
        if (c0359ng == null) {
            c0583wg.getClass();
        } else {
            SafePackageManager safePackageManager = c0583wg.f14838b;
            Context context = c0583wg.f14837a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = c0359ng.f14364d.ordinal();
            if (ordinal == 1) {
                areEqual = Intrinsics.areEqual(c0583wg.f14842f, installerPackageName);
            } else if (ordinal == 2) {
                areEqual = Intrinsics.areEqual(c0583wg.f14843g, installerPackageName);
            }
            if (areEqual) {
                c0129eg.a(c0359ng);
                return;
            }
        }
        wf2.a();
    }

    public final void a(C0359ng c0359ng) {
        C0309lg c0309lg = this.f13690a;
        synchronized (c0309lg) {
            c0309lg.f14204b = c0359ng;
            c0309lg.f14205c = true;
            c0309lg.f14206d.a(c0359ng);
            c0309lg.f14206d.d();
            c0309lg.a(c0309lg.f14204b);
        }
    }
}
