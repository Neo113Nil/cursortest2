package ru.ozon.app.android.orders.cml.parcelTimeline.presentation.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.orders.cml.parcelTimeline.data.ParcelTimelineDTO;
import ru.ozon.app.android.orders.cml.parcelTimeline.presentation.ParcelTimelineVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ParcelTimelineComposableKt$ParcelTimelineHeader$1$4$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<ParcelTimelineUpdateEvent, Unit> $onHeaderClick;
    final /* synthetic */ ParcelTimelineVO.SectionVO $section;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParcelTimelineDTO.SectionDTO.SectionUIState.values().length];
            try {
                iArr[ParcelTimelineDTO.SectionDTO.SectionUIState.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParcelTimelineDTO.SectionDTO.SectionUIState.COLLAPSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ParcelTimelineComposableKt$ParcelTimelineHeader$1$4$1(ParcelTimelineVO.SectionVO sectionVO, Function1<? super ParcelTimelineUpdateEvent, Unit> function1) {
        super(0);
        this.$section = sectionVO;
        this.$onHeaderClick = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.$section.getUiState().ordinal()];
        if (i11 == 1) {
            this.$onHeaderClick.invoke(new ParcelTimelineUpdateEvent(this.$section.getId(), ParcelTimelineDTO.SectionDTO.SectionUIState.COLLAPSED));
        } else {
            if (i11 != 2) {
                return;
            }
            this.$onHeaderClick.invoke(new ParcelTimelineUpdateEvent(this.$section.getId(), ParcelTimelineDTO.SectionDTO.SectionUIState.EXPANDED));
        }
    }
}
