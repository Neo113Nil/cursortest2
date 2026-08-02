package ru.ozon.app.android.abtool;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntity;
import ru.ozon.app.android.abtool.data.repository.FeatureRepository;
import ru.ozon.app.android.abtool.domain.AbToolInteractor;
import ru.ozon.app.android.abtool.domain.ConfigsEntity;
import ru.ozon.app.android.abtool.utils.MasterFlagUtilsKt;
import xe.C10727i;
import xe.M;
import xe.U;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.AbToolManager$fetchInternal$2", f = "AbToolManager.kt", l = {269, 271, 277, 285}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AbToolManager$fetchInternal$2 extends j implements Function2<M, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbToolManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToolManager$fetchInternal$2(AbToolManager abToolManager, d<? super AbToolManager$fetchInternal$2> dVar) {
        super(2, dVar);
        this.this$0 = abToolManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AbToolManager$fetchInternal$2 abToolManager$fetchInternal$2 = new AbToolManager$fetchInternal$2(this.this$0, dVar);
        abToolManager$fetchInternal$2.L$0 = obj;
        return abToolManager$fetchInternal$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cc, code lost:
    
        if (r1.updateCache(r11, r10) == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        U u11;
        ConfigsEntity configsEntity;
        ConfigsEntity configsEntity2;
        ConfigsEntity configsEntity3;
        AbToolManager abToolManager;
        ConfigsEntity removeOverrides;
        AbToolInteractor abToolInteractor;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            U a11 = C10727i.a(m11, null, null, new AbToolManager$fetchInternal$2$hostConfigsJob$1(this.this$0, null), 3);
            U a12 = C10727i.a(m11, null, null, new AbToolManager$fetchInternal$2$libsConfigsJob$1(this.this$0, null), 3);
            this.L$0 = a12;
            this.label = 1;
            Object s11 = a11.s(this);
            if (s11 != aVar) {
                u11 = a12;
                obj = s11;
            }
            return aVar;
        }
        if (i11 == 1) {
            u11 = (U) this.L$0;
            s.b(obj);
        } else {
            if (i11 == 2) {
                configsEntity = (ConfigsEntity) this.L$0;
                s.b(obj);
                configsEntity2 = (ConfigsEntity) obj;
                if (configsEntity2 != null) {
                    AbToolManager abToolManager2 = this.this$0;
                    List<FeatureEntity> overridePlatformFlagsIfPossible = MasterFlagUtilsKt.overridePlatformFlagsIfPossible(configsEntity != null ? configsEntity.getFeatures() : null, configsEntity2.getFeatures());
                    FeatureRepository featureRepository = abToolManager2.abToolLibsInteractor.getFeatureRepository();
                    ConfigsEntity copy$default = ConfigsEntity.copy$default(configsEntity2, overridePlatformFlagsIfPossible, null, 2, null);
                    this.L$0 = configsEntity;
                    this.L$1 = abToolManager2;
                    this.label = 3;
                    if (featureRepository.updateCache(copy$default, this) != aVar) {
                        configsEntity3 = configsEntity;
                        abToolManager = abToolManager2;
                        abToolManager.updateAbToolsGNCFeaturePrefsValue();
                        configsEntity = configsEntity3;
                    }
                    return aVar;
                }
                if (configsEntity != null) {
                    removeOverrides = this.this$0.removeOverrides(configsEntity);
                }
                return null;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            abToolManager = (AbToolManager) this.L$1;
            configsEntity3 = (ConfigsEntity) this.L$0;
            s.b(obj);
            abToolManager.updateAbToolsGNCFeaturePrefsValue();
            configsEntity = configsEntity3;
            if (configsEntity != null || removeOverrides == null) {
                return null;
            }
            abToolInteractor = this.this$0.abToolHostInteractor;
            FeatureRepository featureRepository2 = abToolInteractor.getFeatureRepository();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
        }
        ConfigsEntity configsEntity4 = (ConfigsEntity) obj;
        this.L$0 = configsEntity4;
        this.label = 2;
        Object s12 = u11.s(this);
        if (s12 != aVar) {
            configsEntity = configsEntity4;
            obj = s12;
            configsEntity2 = (ConfigsEntity) obj;
            if (configsEntity2 != null) {
            }
            if (configsEntity != null) {
            }
            return null;
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AbToolManager$fetchInternal$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
