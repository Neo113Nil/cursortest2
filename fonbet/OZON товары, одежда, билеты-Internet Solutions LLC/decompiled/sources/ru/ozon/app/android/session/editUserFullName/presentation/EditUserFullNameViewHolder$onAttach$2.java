package ru.ozon.app.android.session.editUserFullName.presentation;

import Sc.InterfaceC4003e;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class EditUserFullNameViewHolder$onAttach$2 implements W, InterfaceC7732n {
    final /* synthetic */ EditUserFullNameViewHolder $tmp0;

    EditUserFullNameViewHolder$onAttach$2(EditUserFullNameViewHolder editUserFullNameViewHolder) {
        this.$tmp0 = editUserFullNameViewHolder;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7735q(1, this.$tmp0, EditUserFullNameViewHolder.class, "handleResult", "handleResult(Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(EditUserFullNameViewModel.Result p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        this.$tmp0.handleResult(p02);
    }
}
