package io.sentry.android.sqlite;

import android.database.CursorWindow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f16179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CursorWindow f16181g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i5, CursorWindow cursorWindow) {
        super(0);
        this.f16179e = cVar;
        this.f16180f = i5;
        this.f16181g = cursorWindow;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f16179e.f16185a.fillWindow(this.f16180f, this.f16181g);
        return Unit.f19194a;
    }
}
