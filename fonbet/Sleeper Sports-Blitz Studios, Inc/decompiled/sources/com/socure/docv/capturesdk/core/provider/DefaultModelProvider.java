package com.socure.docv.capturesdk.core.provider;

import android.content.Context;
import com.socure.docv.capturesdk.common.config.model.Model;
import com.socure.docv.capturesdk.core.provider.interfaces.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.tensorflow.lite.support.model.Model;

/* compiled from: DefaultModelProvider.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/socure/docv/capturesdk/core/provider/DefaultModelProvider;", "Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;", "Lcom/socure/docv/capturesdk/common/config/model/Model;", "context", "Landroid/content/Context;", "defaultModelFileName", "", "confidenceProvider", "", "numberOfBuffers", "", "(Landroid/content/Context;Ljava/lang/String;Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;I)V", "get", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultModelProvider implements Provider<Model> {
    public static final int $stable = 8;
    private final Provider<Float> confidenceProvider;
    private final Context context;
    private final String defaultModelFileName;
    private final int numberOfBuffers;

    public DefaultModelProvider(Context context, String defaultModelFileName, Provider<Float> confidenceProvider, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultModelFileName, "defaultModelFileName");
        Intrinsics.checkNotNullParameter(confidenceProvider, "confidenceProvider");
        this.context = context;
        this.defaultModelFileName = defaultModelFileName;
        this.confidenceProvider = confidenceProvider;
        this.numberOfBuffers = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.socure.docv.capturesdk.core.provider.interfaces.Provider
    public Model get() {
        org.tensorflow.lite.support.model.Model createModel = org.tensorflow.lite.support.model.Model.createModel(this.context, this.defaultModelFileName, new Model.Options.Builder().build());
        Intrinsics.checkNotNullExpressionValue(createModel, "createModel(\n           …r().build()\n            )");
        return new com.socure.docv.capturesdk.common.config.model.Model(createModel, this.confidenceProvider.get().floatValue(), this.numberOfBuffers);
    }
}
