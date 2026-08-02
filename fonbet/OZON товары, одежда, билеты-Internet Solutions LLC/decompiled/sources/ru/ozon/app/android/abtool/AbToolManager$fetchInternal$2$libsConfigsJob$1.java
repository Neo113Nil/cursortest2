package ru.ozon.app.android.abtool;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntity;
import ru.ozon.app.android.abtool.data.repository.FeatureRepository;
import ru.ozon.app.android.abtool.domain.ConfigsEntity;
import ru.ozon.app.android.abtool.utils.MasterFlagUtilsKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/abtool/domain/ConfigsEntity;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/abtool/domain/ConfigsEntity;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.AbToolManager$fetchInternal$2$libsConfigsJob$1", f = "AbToolManager.kt", l = {240, 243, 253}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AbToolManager$fetchInternal$2$libsConfigsJob$1 extends j implements Function2<M, d<? super ConfigsEntity>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbToolManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToolManager$fetchInternal$2$libsConfigsJob$1(AbToolManager abToolManager, d<? super AbToolManager$fetchInternal$2$libsConfigsJob$1> dVar) {
        super(2, dVar);
        this.this$0 = abToolManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AbToolManager$fetchInternal$2$libsConfigsJob$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004c, code lost:
    
        if (r7 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        if (r7 == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ConfigsEntity configsEntity;
        List<FeatureEntity> list;
        List list2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.this$0.config.getIsPlatformNamespaceEnabled()) {
                FeatureRepository featureRepository = this.this$0.abToolLibsInteractor.getFeatureRepository();
                this.label = 1;
                obj = featureRepository.fetch(this);
            } else {
                if (this.this$0.config.getIsPlatformNamespaceEnabled() || !this.this$0.config.getIsPlatformOverridesEnabled()) {
                    return null;
                }
                FeatureRepository featureRepository2 = this.this$0.abToolLibsInteractor.getFeatureRepository();
                this.label = 3;
                obj = featureRepository2.getCachedFeatures(this);
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                List list3 = (List) obj;
                if (list3 == null) {
                    list3 = K.f71697a;
                }
                return new ConfigsEntity(list3, K.f71697a);
            }
            list = (List) this.L$1;
            configsEntity = (ConfigsEntity) this.L$0;
            s.b(obj);
            list2 = (List) obj;
            if (list2 == null) {
                list2 = K.f71697a;
            }
            List<FeatureEntity> mergeCachedFeaturesWithNew = MasterFlagUtilsKt.mergeCachedFeaturesWithNew(list, list2);
            if (configsEntity == null) {
                return ConfigsEntity.copy$default(configsEntity, mergeCachedFeaturesWithNew, null, 2, null);
            }
            return null;
        }
        s.b(obj);
        configsEntity = (ConfigsEntity) obj;
        List<FeatureEntity> features = configsEntity != null ? configsEntity.getFeatures() : null;
        if (features == null) {
            features = K.f71697a;
        }
        FeatureRepository featureRepository3 = this.this$0.abToolLibsInteractor.getFeatureRepository();
        this.L$0 = configsEntity;
        this.L$1 = features;
        this.label = 2;
        Object cachedFeatures = featureRepository3.getCachedFeatures(this);
        if (cachedFeatures != aVar) {
            list = features;
            obj = cachedFeatures;
            list2 = (List) obj;
            if (list2 == null) {
            }
            List<FeatureEntity> mergeCachedFeaturesWithNew2 = MasterFlagUtilsKt.mergeCachedFeaturesWithNew(list, list2);
            if (configsEntity == null) {
            }
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ConfigsEntity> dVar) {
        return ((AbToolManager$fetchInternal$2$libsConfigsJob$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
