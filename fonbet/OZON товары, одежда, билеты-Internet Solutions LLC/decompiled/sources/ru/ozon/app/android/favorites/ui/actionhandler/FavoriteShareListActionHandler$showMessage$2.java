package ru.ozon.app.android.favorites.ui.actionhandler;

import Bl.b;
import Sc.s;
import Wc.a;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.actionhandler.FavoriteShareListActionHandler$showMessage$2", f = "FavoriteShareListActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteShareListActionHandler$showMessage$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Action $action;
    final /* synthetic */ long $duration;
    final /* synthetic */ Integer $icon;
    final /* synthetic */ String $message;
    final /* synthetic */ ComposerReferences $references;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteShareListActionHandler$showMessage$2(ComposerReferences composerReferences, String str, Integer num, Action action, long j11, d<? super FavoriteShareListActionHandler$showMessage$2> dVar) {
        super(2, dVar);
        this.$references = composerReferences;
        this.$message = str;
        this.$icon = num;
        this.$action = action;
        this.$duration = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FavoriteShareListActionHandler$showMessage$2(this.$references, this.$message, this.$icon, this.$action, this.$duration, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ViewGroup b11 = b.b(this.$references);
        if (b11 == null) {
            return null;
        }
        String str = this.$message;
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, b11, null, OzonSpannableStringKt.toOzonSpannableString(str), null, null, this.$icon, null, null, null, this.$action, null, null, null, new Long(this.$duration), null, null, this.$references.getContainer().f(), 56794, null).show();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FavoriteShareListActionHandler$showMessage$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
