package ru.ozon.app.android.ugc.widgets.ugccounters.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.ugc.widgets.ugccounters.core.UgcCountersMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/ugccounters/core/UgcCountersMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UgcCountersComponent$Companion$getInstance$1$1$mapper$2 extends AbstractC7737t implements Function0<UgcCountersMapper> {
    final /* synthetic */ UgcCountersComponent$Companion$getInstance$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcCountersComponent$Companion$getInstance$1$1$mapper$2(UgcCountersComponent$Companion$getInstance$1$1 ugcCountersComponent$Companion$getInstance$1$1) {
        super(0);
        this.this$0 = ugcCountersComponent$Companion$getInstance$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final UgcCountersMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        ImagePrefetchInfoProviderStorage providerStorage;
        contextComponentDependencies = this.this$0.getContextComponentDependencies();
        Context context = contextComponentDependencies.getContext();
        providerStorage = this.this$0.getProviderStorage();
        return new UgcCountersMapper(context, new ImagePrefetcher(3, providerStorage));
    }
}
