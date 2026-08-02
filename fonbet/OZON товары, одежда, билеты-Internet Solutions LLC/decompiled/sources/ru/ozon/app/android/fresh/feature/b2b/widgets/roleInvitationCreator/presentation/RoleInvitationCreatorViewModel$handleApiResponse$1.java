package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.RoleInvitationCreatorViewModel", f = "RoleInvitationCreatorViewModel.kt", l = {147, 152, 160, 161, 170, 174, 176}, m = "handleApiResponse")
/* loaded from: classes12.dex */
final class RoleInvitationCreatorViewModel$handleApiResponse$1 extends c {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RoleInvitationCreatorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoleInvitationCreatorViewModel$handleApiResponse$1(RoleInvitationCreatorViewModel roleInvitationCreatorViewModel, d<? super RoleInvitationCreatorViewModel$handleApiResponse$1> dVar) {
        super(dVar);
        this.this$0 = roleInvitationCreatorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object handleApiResponse;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        handleApiResponse = this.this$0.handleApiResponse(null, this);
        return handleApiResponse;
    }
}
