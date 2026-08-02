package io.appmetrica.analytics.screenshot.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0686v f15392a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0683s(C0686v c0686v) {
        super(0);
        this.f15392a = c0686v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((C0688x) this.f15392a.f15396b).a("ContentObserverScreenshotCaptor");
        return Unit.f19194a;
    }
}
