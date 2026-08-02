package ru.ozon.app.android.abtool.presentation;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import s20.c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls20/c;", "request", "Landroid/content/Intent;", "invoke", "(Ls20/c;)Landroid/content/Intent;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class AbToolDebugMenu$provide$1$intent$1 extends AbstractC7737t implements Function1<c, Intent> {
    final /* synthetic */ AbToolDebugMenu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToolDebugMenu$provide$1$intent$1(AbToolDebugMenu abToolDebugMenu) {
        super(1);
        this.this$0 = abToolDebugMenu;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Intent invoke(c request) {
        Ld0.c cVar;
        Intrinsics.checkNotNullParameter(request, "request");
        cVar = this.this$0.diStore;
        Intent intent = new Intent(cVar.c().a(), (Class<?>) AbToggleActivity.class);
        intent.setData(request.a());
        return intent;
    }
}
