package ru.ozon.app.android.abtool.domain;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.abtool.data.local.LocalDataSource;
import ru.ozon.app.android.abtool.data.local.LocalDatabase;
import ru.ozon.app.android.abtool.data.local.dao.FeatureDao;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/abtool/data/local/LocalDataSource;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AbToolInteractor$localDataSource$2 extends AbstractC7737t implements Function0<LocalDataSource> {
    final /* synthetic */ AbToolInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToolInteractor$localDataSource$2(AbToolInteractor abToolInteractor) {
        super(0);
        this.this$0 = abToolInteractor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LocalDataSource invoke() {
        LocalDatabase database;
        LocalDatabase database2;
        database = this.this$0.getDatabase();
        FeatureDao featureDao = database.featureDao();
        database2 = this.this$0.getDatabase();
        return new LocalDataSource(featureDao, database2.experimentDao());
    }
}
