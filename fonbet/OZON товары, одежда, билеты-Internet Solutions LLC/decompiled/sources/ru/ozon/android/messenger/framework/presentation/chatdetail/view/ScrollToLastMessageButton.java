package ru.ozon.android.messenger.framework.presentation.chatdetail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.app.android.messenger.databinding.MButtonScrollToLastMessageBinding;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/chatdetail/view/ScrollToLastMessageButton;", "Landroid/widget/FrameLayout;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScrollToLastMessageButton extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MButtonScrollToLastMessageBinding f89948a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollToLastMessageButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        MButtonScrollToLastMessageBinding inflate = MButtonScrollToLastMessageBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.f89948a = inflate;
    }

    public final void a(int i11) {
        TextView textView = this.f89948a.unreadCountTv;
        textView.setText(i11 > 99 ? textView.getResources().getString(R$string.messenger_unread_max_visible_count, 99) : String.valueOf(i11));
        s.e(textView, Boolean.valueOf(i11 != 0));
    }
}
