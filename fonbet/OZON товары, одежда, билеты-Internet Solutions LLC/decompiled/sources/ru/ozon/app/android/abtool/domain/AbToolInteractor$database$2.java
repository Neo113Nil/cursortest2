package ru.ozon.app.android.abtool.domain;

import Ld0.d;
import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.data.local.LocalDatabase;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/abtool/data/local/LocalDatabase;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AbToolInteractor$database$2 extends AbstractC7737t implements Function0<LocalDatabase> {
    final /* synthetic */ AbToolInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToolInteractor$database$2(AbToolInteractor abToolInteractor) {
        super(0);
        this.this$0 = abToolInteractor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LocalDatabase invoke() {
        d dVar;
        AbToolNamespace abToolNamespace;
        LocalDatabase.Companion companion = LocalDatabase.INSTANCE;
        dVar = this.this$0.globalConfig;
        Application a11 = dVar.a();
        abToolNamespace = this.this$0.namespace;
        return companion.buildDatabase(a11, abToolNamespace);
    }
}
