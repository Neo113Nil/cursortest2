package ru.ozon.app.android.favorites.ui.configurators;

import A00.a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class FavoritesSellersScrollToUpConfigurator$onComposerInitialized$1 extends AbstractC7737t implements Function1<a, Unit> {
    final /* synthetic */ FavoritesSellersScrollToUpConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoritesSellersScrollToUpConfigurator$onComposerInitialized$1(FavoritesSellersScrollToUpConfigurator favoritesSellersScrollToUpConfigurator) {
        super(1);
        this.this$0 = favoritesSellersScrollToUpConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a aVar) {
        boolean z11;
        InterfaceC7851b controller;
        Uri parse;
        if (aVar instanceof a.o) {
            a g10 = ((a.o) aVar).g();
            String str = null;
            a.u.b bVar = g10 instanceof a.u.b ? (a.u.b) g10 : null;
            String j11 = bVar != null ? bVar.j() : null;
            FavoritesSellersScrollToUpConfigurator favoritesSellersScrollToUpConfigurator = this.this$0;
            if (j11 != null && (parse = Uri.parse(j11)) != null) {
                str = parse.getQueryParameter("sorting");
            }
            favoritesSellersScrollToUpConfigurator.scrollToUp = str != null;
        }
        if (aVar instanceof a.C2372m) {
            z11 = this.this$0.scrollToUp;
            if (z11) {
                ConfiguratorReferences references = this.this$0.getReferences();
                if (references != null && (controller = references.getController()) != null) {
                    controller.l(0);
                }
                this.this$0.scrollToUp = false;
            }
        }
    }
}
