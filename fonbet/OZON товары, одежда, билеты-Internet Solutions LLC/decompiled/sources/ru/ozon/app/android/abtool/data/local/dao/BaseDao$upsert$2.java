package ru.ozon.app.android.abtool.data.local.dao;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.abtool.data.local.dao.BaseDao", f = "BaseDao.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT, ModuleDescriptor.MODULE_VERSION}, m = "upsert$suspendImpl")
/* loaded from: classes6.dex */
final class BaseDao$upsert$2<T> extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseDao<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseDao$upsert$2(BaseDao<T> baseDao, d<? super BaseDao$upsert$2> dVar) {
        super(dVar);
        this.this$0 = baseDao;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return BaseDao.upsert$suspendImpl((BaseDao) this.this$0, (List) null, (d<? super Unit>) this);
    }
}
