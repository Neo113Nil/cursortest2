package jj;

import android.app.Activity;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: jj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7432a extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f70126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7432a(Activity activity) {
        super(0);
        this.f70126b = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Intent c11;
        c11 = c.c();
        c.e(this.f70126b, c11, null);
        return Unit.f71690a;
    }
}
