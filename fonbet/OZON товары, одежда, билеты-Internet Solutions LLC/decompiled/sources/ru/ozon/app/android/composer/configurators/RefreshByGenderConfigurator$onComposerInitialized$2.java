package ru.ozon.app.android.composer.configurators;

import A00.a;
import Sc.s;
import Wc.a;
import i10.h;
import j10.h;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.common.tabs.presentation.TabsV2VO;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.composer.configurators.RefreshByGenderConfigurator$onComposerInitialized$2", f = "RefreshByGenderConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class RefreshByGenderConfigurator$onComposerInitialized$2 extends j implements Function2<String, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ RefreshByGenderConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshByGenderConfigurator$onComposerInitialized$2(RefreshByGenderConfigurator refreshByGenderConfigurator, d<? super RefreshByGenderConfigurator$onComposerInitialized$2> dVar) {
        super(2, dVar);
        this.this$0 = refreshByGenderConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RefreshByGenderConfigurator$onComposerInitialized$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h.b<l> voHelper;
        List<l> b11;
        Object obj2;
        InterfaceC7851b controller;
        String clearQueryExceptMiniapp;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references != null && (voHelper = references.getVoHelper()) != null && (b11 = voHelper.b()) != null) {
            Iterator<T> it = b11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((l) obj2).d() instanceof TabsV2VO) {
                    break;
                }
            }
            l lVar = (l) obj2;
            if (lVar != null) {
                ConfiguratorReferences references2 = this.this$0.getReferences();
                if (references2 != null && (controller = references2.getController()) != null) {
                    RefreshByGenderConfigurator refreshByGenderConfigurator = this.this$0;
                    T00.a b12 = lVar.c().b();
                    clearQueryExceptMiniapp = refreshByGenderConfigurator.clearQueryExceptMiniapp(b12 != null ? b12.c() : null);
                    InterfaceC7851b.a.a(controller, clearQueryExceptMiniapp, null, null, new h.b(new a.C.C0000a(), null, 2), 6);
                }
                return Unit.f71690a;
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, d<? super Unit> dVar) {
        return ((RefreshByGenderConfigurator$onComposerInitialized$2) create(str, dVar)).invokeSuspend(Unit.f71690a);
    }
}
