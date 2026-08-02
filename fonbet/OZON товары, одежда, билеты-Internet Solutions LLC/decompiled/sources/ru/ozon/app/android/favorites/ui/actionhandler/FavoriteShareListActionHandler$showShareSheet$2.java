package ru.ozon.app.android.favorites.ui.actionhandler;

import Sc.s;
import Wc.a;
import android.app.Activity;
import androidx.core.app.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.actionhandler.FavoriteShareListActionHandler$showShareSheet$2", f = "FavoriteShareListActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteShareListActionHandler$showShareSheet$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $message;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteShareListActionHandler$showShareSheet$2(Activity activity, String str, d<? super FavoriteShareListActionHandler$showShareSheet$2> dVar) {
        super(2, dVar);
        this.$activity = activity;
        this.$message = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FavoriteShareListActionHandler$showShareSheet$2(this.$activity, this.$message, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        t.a aVar2 = new t.a(this.$activity);
        aVar2.g("text/plain");
        aVar2.f(this.$message);
        aVar2.d(StringProvider.getString(R$string.common_action_share));
        aVar2.h();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FavoriteShareListActionHandler$showShareSheet$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
