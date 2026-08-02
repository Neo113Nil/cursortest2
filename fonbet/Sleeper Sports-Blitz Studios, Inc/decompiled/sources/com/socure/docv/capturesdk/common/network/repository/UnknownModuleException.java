package com.socure.docv.capturesdk.common.network.repository;

import com.socure.docv.capturesdk.feature.orchestrator.ModuleSubmission;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnknownModuleException.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/repository/UnknownModuleException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "module", "Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;", "(Lcom/socure/docv/capturesdk/feature/orchestrator/ModuleSubmission;)V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnknownModuleException extends IllegalArgumentException {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownModuleException(ModuleSubmission module) {
        super("Submitting an unhandled module. " + module);
        Intrinsics.checkNotNullParameter(module, "module");
    }
}
