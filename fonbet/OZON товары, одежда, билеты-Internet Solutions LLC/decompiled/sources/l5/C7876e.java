package l5;

import A5.s;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l5.g;
import o5.InterfaceC8643a;

/* renamed from: l5.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7876e extends AbstractC7737t implements Function0<InterfaceC8643a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g.a f72811b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7876e(g.a aVar) {
        super(0);
        this.f72811b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC8643a invoke() {
        Context context;
        s sVar = s.f442a;
        context = this.f72811b.f72813a;
        return sVar.a(context);
    }
}
