package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.models.UnstructuredModuleModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ModuleUnstructuredDocumentMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/ModuleUnstructuredDocumentMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "()V", "map", MetricTracker.Object.INPUT, "(Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ModuleUnstructuredDocumentMapper implements Mapper<ModuleMapperInput, UnstructuredModuleModel> {
    public static final int $stable = 0;

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends ModuleMapperInput> list, Continuation<? super List<? extends UnstructuredModuleModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 com.socure.docv.capturesdk.models.UnstructuredModuleModel, still in use, count: 2, list:
          (r1v1 com.socure.docv.capturesdk.models.UnstructuredModuleModel) from 0x00ff: MOVE (r27v0 com.socure.docv.capturesdk.models.UnstructuredModuleModel) = (r1v1 com.socure.docv.capturesdk.models.UnstructuredModuleModel)
          (r1v1 com.socure.docv.capturesdk.models.UnstructuredModuleModel) from 0x00fa: MOVE (r27v5 com.socure.docv.capturesdk.models.UnstructuredModuleModel) = (r1v1 com.socure.docv.capturesdk.models.UnstructuredModuleModel)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public java.lang.Object map(com.socure.docv.capturesdk.common.mapper.ModuleMapperInput r67, kotlin.coroutines.Continuation<? super com.socure.docv.capturesdk.models.UnstructuredModuleModel> r68) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.socure.docv.capturesdk.common.mapper.ModuleUnstructuredDocumentMapper.map(com.socure.docv.capturesdk.common.mapper.ModuleMapperInput, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
