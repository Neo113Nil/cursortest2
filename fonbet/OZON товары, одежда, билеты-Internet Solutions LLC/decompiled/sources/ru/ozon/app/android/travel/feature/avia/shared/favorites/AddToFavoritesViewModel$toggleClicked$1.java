package ru.ozon.app.android.travel.feature.avia.shared.favorites;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation.AddToFavoritesCellVI;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.shared.favorites.AddToFavoritesViewModel$toggleClicked$1", f = "AddToFavoritesViewModel.kt", l = {70, 139, 143, 90, 94, 105}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AddToFavoritesViewModel$toggleClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AnalyticData $analyticData;
    final /* synthetic */ AddToFavoritesCellVI.AddToFavoritesCellModelVI $molecule;
    final /* synthetic */ long $sku;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    final /* synthetic */ AddToFavoritesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToFavoritesViewModel$toggleClicked$1(AddToFavoritesCellVI.AddToFavoritesCellModelVI addToFavoritesCellModelVI, AddToFavoritesViewModel addToFavoritesViewModel, long j11, AnalyticData analyticData, d<? super AddToFavoritesViewModel$toggleClicked$1> dVar) {
        super(2, dVar);
        this.$molecule = addToFavoritesCellModelVI;
        this.this$0 = addToFavoritesViewModel;
        this.$sku = j11;
        this.$analyticData = analyticData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddToFavoritesViewModel$toggleClicked$1 addToFavoritesViewModel$toggleClicked$1 = new AddToFavoritesViewModel$toggleClicked$1(this.$molecule, this.this$0, this.$sku, this.$analyticData, dVar);
        addToFavoritesViewModel$toggleClicked$1.L$0 = obj;
        return addToFavoritesViewModel$toggleClicked$1;
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0066: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:130:0x0065 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.travel.feature.avia.shared.favorites.AddToFavoritesViewModel$toggleClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddToFavoritesViewModel$toggleClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
