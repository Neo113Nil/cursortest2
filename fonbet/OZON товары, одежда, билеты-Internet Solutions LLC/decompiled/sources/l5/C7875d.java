package l5;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l5.g;
import t5.InterfaceC9758c;

/* renamed from: l5.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7875d extends AbstractC7737t implements Function0<InterfaceC9758c> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g.a f72810b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7875d(g.a aVar) {
        super(0);
        this.f72810b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC9758c invoke() {
        Context context;
        context = this.f72810b.f72813a;
        return new InterfaceC9758c.a(context).a();
    }
}
