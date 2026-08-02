package ru.ozon.app.android.abtool.data.local.dao;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.local.entity.ExperimentEntity;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/abtool/data/local/dao/ExperimentDao;", "Lru/ozon/app/android/abtool/data/local/dao/BaseDao;", "Lru/ozon/app/android/abtool/data/local/entity/ExperimentEntity;", "<init>", "()V", "getExperiments", "", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ExperimentDao extends BaseDao<ExperimentEntity> {
    @NotNull
    public abstract List<ExperimentEntity> getExperiments();
}
