package ru.ozon.app.android.returns.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.returns.ui.data.components.RmsUploadPhotosDto;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnActionModalComposableKt$UploadPhoto$4$1$1$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ RmsUploadPhotosDto $component;
    final /* synthetic */ Function1<Integer, Unit> $onPhotoPickerClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReturnActionModalComposableKt$UploadPhoto$4$1$1$2$1(RmsUploadPhotosDto rmsUploadPhotosDto, Function1<? super Integer, Unit> function1) {
        super(0);
        this.$component = rmsUploadPhotosDto;
        this.$onPhotoPickerClicked = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Integer limit = this.$component.getLimit();
        if (limit != null) {
            this.$onPhotoPickerClicked.invoke(Integer.valueOf(limit.intValue()));
        }
    }
}
