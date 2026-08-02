package ru.ozon.app.android.account.locale.app.data;

import Ib.a;
import Sc.s;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.flags.LocalizationV2FeatureFlag;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.locale.app.data.LocaleFetchAction$fetch$1$1", f = "LocaleFetchAction.kt", l = {23, TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class LocaleFetchAction$fetch$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    boolean Z$0;
    int label;
    final /* synthetic */ LocaleFetchAction this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocaleFetchAction$fetch$1$1(LocaleFetchAction localeFetchAction, d<? super LocaleFetchAction$fetch$1$1> dVar) {
        super(2, dVar);
        this.this$0 = localeFetchAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LocaleFetchAction$fetch$1$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (r6.updateLocaleIfNeed(r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r4.setLocalizationVersion(r6, r5) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        boolean booleanKey;
        a aVar2;
        a aVar3;
        Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            aVar = this.this$0.featureServiceProvider;
            booleanKey = ((FeatureService) aVar.get()).getBooleanKey(LocalizationV2FeatureFlag.INSTANCE);
            LocalizationVersion localizationVersion = booleanKey ? LocalizationVersion.f92086V2 : LocalizationVersion.f92085V1;
            aVar2 = this.this$0.appLocaleRepository;
            AppLocaleRepository appLocaleRepository = (AppLocaleRepository) aVar2.get();
            this.Z$0 = booleanKey;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            booleanKey = this.Z$0;
            s.b(obj);
        }
        if (!booleanKey) {
            aVar3 = this.this$0.appLocaleRepository;
            AppLocaleRepository appLocaleRepository2 = (AppLocaleRepository) aVar3.get();
            this.label = 2;
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((LocaleFetchAction$fetch$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
