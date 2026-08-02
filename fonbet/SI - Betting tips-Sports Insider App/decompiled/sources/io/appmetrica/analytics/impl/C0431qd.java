package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431qd extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0150fb f14510a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0431qd(C0150fb c0150fb) {
        super(1);
        this.f14510a = c0150fb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Yc yc2 = (Yc) ((Map.Entry) obj).getValue();
        return yc2.f13223b.parse(this.f14510a);
    }
}
