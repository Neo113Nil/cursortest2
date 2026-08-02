package ru.ozon.app.android.delivery.customActionsHandlers.reorder;

import Sc.r;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.RestrictionsUtilsKt;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.reorder.ReorderActionHandler$processAction$1", f = "ReorderActionHandler.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ReorderActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ String $reorderInfo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReorderActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReorderActionHandler$processAction$1(ReorderActionHandler reorderActionHandler, String str, CustomActionHandler.HandlerReferences handlerReferences, d<? super ReorderActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = reorderActionHandler;
        this.$reorderInfo = str;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReorderActionHandler$processAction$1 reorderActionHandler$processAction$1 = new ReorderActionHandler$processAction$1(this.this$0, this.$reorderInfo, this.$handlerRefs, dVar);
        reorderActionHandler$processAction$1.L$0 = obj;
        return reorderActionHandler$processAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                ReorderActionHandler reorderActionHandler = this.this$0;
                String str = this.$reorderInfo;
                CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
                r.Companion companion = r.INSTANCE;
                Long voId = handlerReferences.getVoId();
                this.label = 1;
                obj = reorderActionHandler.addToCart(str, voId, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = (CartAddItemDTO) obj;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        CustomActionHandler.HandlerReferences handlerReferences2 = this.$handlerRefs;
        if (!(a11 instanceof r.b) && ((CartAddItemDTO) a11).getSuccess()) {
            ComposerNavigator navigator = handlerReferences2.getRefs().getNavigator();
            String uri = LinkGenerator.INSTANCE.cart().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
        }
        CustomActionHandler.HandlerReferences handlerReferences3 = this.$handlerRefs;
        if (r.b(a11) != null) {
            RestrictionsUtilsKt.showRestriction$default(handlerReferences3.getRefs(), StringProvider.getString(R$string.error_common_error_technical_error_title), new Integer(R$drawable.ic_warning), null, 4, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReorderActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
