package ru.ozon.android.messenger.blocks.error;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.app.android.messenger.databinding.MBlockDisplayErrorBinding;

/* loaded from: classes10.dex */
public final class c extends q<b, MBlockDisplayErrorBinding> {
    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(b bVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        b block = bVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        if (!(itemInfo instanceof s)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        TextView sendTimeTv = getBinding().sendTimeTv;
        Intrinsics.checkNotNullExpressionValue(sendTimeTv, "sendTimeTv");
        ru.ozon.android.messenger.blocks.common.a.b(sendTimeTv, block.getSendTime(), (s) itemInfo);
        getBinding().message.setText(block.a());
    }
}
