package ru.ozon.android.messenger.blocks.chatGroups.grouplist;

import a1.C4912a;
import android.content.Context;
import android.view.ViewGroup;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.messenger.databinding.MBlockChatGroupComposableBinding;

/* loaded from: classes10.dex */
public final class g extends d<MBlockChatGroupComposableBinding> {
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, m mVar) {
        MBlockChatGroupComposableBinding binding = (MBlockChatGroupComposableBinding) aVar;
        m viewObject = mVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.framework.presentation.models.g gVar) {
        MBlockChatGroupComposableBinding binding = (MBlockChatGroupComposableBinding) aVar;
        m viewObject = (m) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        binding.chatGroupsCv.a(new C4912a(true, 1770401830, new f(viewObject, references)));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final boolean canMap(Object obj) {
        if (obj instanceof h) {
            m mVar = (m) C7714v.M(((b) getMapper()).invoke(obj, new ru.ozon.android.messenger.framework.presentation.models.c("", 0)));
            return mVar != null && mVar.d();
        }
        if (obj instanceof ru.ozon.android.messenger.framework.presentation.models.e) {
            ru.ozon.android.messenger.framework.presentation.models.g b11 = ((ru.ozon.android.messenger.framework.presentation.models.e) obj).b();
            m mVar2 = b11 instanceof m ? (m) b11 : null;
            if (mVar2 != null && mVar2.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final X4.a j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MBlockChatGroupComposableBinding inflate = MBlockChatGroupComposableBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references) {
        MBlockChatGroupComposableBinding binding = (MBlockChatGroupComposableBinding) aVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView).removeView(binding.chatGroupsCv);
    }
}
