package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048bc extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0074cc f13442a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0048bc(C0074cc c0074cc) {
        super(0);
        this.f13442a = c0074cc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC0529uc ke2;
        C0074cc c0074cc = this.f13442a;
        C0554vc c0554vc = c0074cc.f13516f;
        InterfaceC0451r9 interfaceC0451r9 = c0074cc.f13512b;
        Qg qg2 = c0074cc.f13511a;
        C0372o4 c0372o4 = c0074cc.f13513c;
        We we2 = c0074cc.f13514d;
        c0554vc.getClass();
        if (FrameworkDetector.isNative()) {
            M9 i5 = C0353na.I.i();
            Bundle applicationMetaData = i5.f12579d.getApplicationMetaData(i5.f12576a);
            if (TextUtils.isEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                ke2 = new Qd();
                return ke2.a();
            }
        }
        ke2 = new Ke(interfaceC0451r9, qg2, c0372o4, we2);
        return ke2.a();
    }
}
