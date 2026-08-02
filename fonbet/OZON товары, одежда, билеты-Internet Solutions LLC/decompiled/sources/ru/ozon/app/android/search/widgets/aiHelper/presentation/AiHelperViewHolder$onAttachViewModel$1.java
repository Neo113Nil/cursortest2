package ru.ozon.app.android.search.widgets.aiHelper.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.aiHelper.data.ProcessingStatus;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "status", "Lru/ozon/app/android/search/widgets/aiHelper/data/ProcessingStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.aiHelper.presentation.AiHelperViewHolder$onAttachViewModel$1", f = "AiHelperViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AiHelperViewHolder$onAttachViewModel$1 extends j implements Function2<ProcessingStatus, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AiHelperViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProcessingStatus.values().length];
            try {
                iArr[ProcessingStatus.PROCESSING_STATUS_COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProcessingStatus.PROCESSING_STATUS_FAULTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProcessingStatus.PROCESSING_STATUS_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProcessingStatus.PROCESSING_STATUS_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiHelperViewHolder$onAttachViewModel$1(AiHelperViewHolder aiHelperViewHolder, d<? super AiHelperViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = aiHelperViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AiHelperViewHolder$onAttachViewModel$1 aiHelperViewHolder$onAttachViewModel$1 = new AiHelperViewHolder$onAttachViewModel$1(this.this$0, dVar);
        aiHelperViewHolder$onAttachViewModel$1.L$0 = obj;
        return aiHelperViewHolder$onAttachViewModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        ProcessingStatus processingStatus;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ProcessingStatus processingStatus2 = (ProcessingStatus) this.L$0;
        int i11 = WhenMappings.$EnumSwitchMapping$0[processingStatus2.ordinal()];
        if (i11 == 1 || i11 == 2) {
            composerReferences = this.this$0.refs;
            InterfaceC7851b controller = composerReferences.getController();
            AiHelperVO boundData = this.this$0.getBoundData();
            InterfaceC7851b.a.e(controller, boundData != null ? boundData.getRedirectUrl() : null, null, null, 6);
        } else if (i11 == 3) {
            processingStatus = this.this$0.prevPollingStatus;
            if (processingStatus != processingStatus2) {
                AiHelperViewHolder aiHelperViewHolder = this.this$0;
                AiHelperVO boundData2 = aiHelperViewHolder.getBoundData();
                aiHelperViewHolder.startTimer(boundData2 != null ? boundData2.getMaxRetries() : null);
            }
        } else if (i11 != 4) {
            throw new o();
        }
        this.this$0.prevPollingStatus = processingStatus2;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProcessingStatus processingStatus, d<? super Unit> dVar) {
        return ((AiHelperViewHolder$onAttachViewModel$1) create(processingStatus, dVar)).invokeSuspend(Unit.f71690a);
    }
}
