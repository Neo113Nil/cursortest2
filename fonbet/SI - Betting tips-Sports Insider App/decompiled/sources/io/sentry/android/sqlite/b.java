package io.sentry.android.sqlite;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f16182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16183f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16184g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, int i5, int i10) {
        super(0);
        this.f16182e = cVar;
        this.f16183f = i5;
        this.f16184g = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.f16182e.f16185a.onMove(this.f16183f, this.f16184g));
    }
}
