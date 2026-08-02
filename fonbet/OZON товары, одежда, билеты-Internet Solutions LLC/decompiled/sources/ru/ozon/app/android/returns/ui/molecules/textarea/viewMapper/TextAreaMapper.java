package ru.ozon.app.android.returns.ui.molecules.textarea.viewMapper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.data.components.RmsTextAreaDto;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.TextAreaVO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/textarea/viewMapper/TextAreaMapper;", "Lkotlin/Function1;", "Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/TextAreaVO;", "<init>", "()V", "invoke", "state", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextAreaMapper implements Function1<RmsTextAreaDto, TextAreaVO> {
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public TextAreaVO invoke(@NotNull RmsTextAreaDto state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TextAreaVO(state.getValue(), state.getMaxLength(), state.getPlaceholder());
    }
}
