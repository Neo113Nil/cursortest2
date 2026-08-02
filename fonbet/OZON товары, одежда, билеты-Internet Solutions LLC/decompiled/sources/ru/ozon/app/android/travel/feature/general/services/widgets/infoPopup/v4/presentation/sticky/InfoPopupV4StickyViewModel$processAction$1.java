package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky.InfoPopupV4StickyViewModel", f = "InfoPopupV4StickyViewModel.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 61}, m = "processAction")
/* loaded from: classes4.dex */
final class InfoPopupV4StickyViewModel$processAction$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InfoPopupV4StickyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfoPopupV4StickyViewModel$processAction$1(InfoPopupV4StickyViewModel infoPopupV4StickyViewModel, d<? super InfoPopupV4StickyViewModel$processAction$1> dVar) {
        super(dVar);
        this.this$0 = infoPopupV4StickyViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object processAction;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        processAction = this.this$0.processAction(null, this);
        return processAction;
    }
}
