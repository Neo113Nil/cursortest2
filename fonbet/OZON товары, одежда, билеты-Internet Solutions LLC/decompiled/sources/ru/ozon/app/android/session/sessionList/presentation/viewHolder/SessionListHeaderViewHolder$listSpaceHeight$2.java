package ru.ozon.app.android.session.sessionList.presentation.viewHolder;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SessionListHeaderViewHolder$listSpaceHeight$2 extends AbstractC7737t implements Function0<Integer> {
    public static final SessionListHeaderViewHolder$listSpaceHeight$2 INSTANCE = new SessionListHeaderViewHolder$listSpaceHeight$2();

    SessionListHeaderViewHolder$listSpaceHeight$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(UiExtKt.toPx(8));
    }
}
