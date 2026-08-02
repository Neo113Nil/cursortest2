package ru.ozon.app.android.messenger.widgets.chatListHeader.presentation;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import v10.C10183a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/messenger/widgets/chatListHeader/presentation/ChatListHeaderViewHolder;", "Ld20/d;", "Lru/ozon/app/android/messenger/widgets/chatListHeader/presentation/ChatListHeaderVO;", "Lru/ozon/app/android/messenger/widgets/chatListHeader/presentation/ChatListHeaderView;", "chatListHeaderView", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/messenger/widgets/chatListHeader/presentation/ChatListHeaderView;Ll10/i;Ld20/e;)V", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "", "setupRootViewCorners", "(Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "item", "bind", "(Lru/ozon/app/android/messenger/widgets/chatListHeader/presentation/ChatListHeaderVO;)V", "Lru/ozon/app/android/messenger/widgets/chatListHeader/presentation/ChatListHeaderView;", "Ll10/i;", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChatListHeaderViewHolder extends AbstractC6067d<ChatListHeaderVO> {

    @NotNull
    private final ChatListHeaderView chatListHeaderView;

    @NotNull
    private final i container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListHeaderViewHolder(@NotNull ChatListHeaderView chatListHeaderView, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(chatListHeaderView, "chatListHeaderView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.chatListHeaderView = chatListHeaderView;
        this.container = container;
    }

    private final void setupRootViewCorners(final CornerRadius cornerRadius) {
        ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: ru.ozon.app.android.messenger.widgets.chatListHeader.presentation.ChatListHeaderViewHolder$setupRootViewCorners$outlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                Intrinsics.checkNotNullParameter(view, "view");
                if (outline != null) {
                    outline.setRoundRect(0, -UiExtKt.toPx(CornerRadius.this.getPx()), view.getWidth(), view.getHeight(), UiExtKt.toPxF(CornerRadius.this.getPx()));
                }
            }
        };
        LinearLayout o11 = C10183a.o(this.container.Y());
        o11.setOutlineProvider(viewOutlineProvider);
        o11.setClipToOutline(true);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ChatListHeaderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ChatListHeaderView chatListHeaderView = this.chatListHeaderView;
        TextHolderKt.bind$default(chatListHeaderView.getTitle(), item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(chatListHeaderView.getSubTitle(), item.getSubtitle(), null, 2, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = chatListHeaderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        if (parseColor != null) {
            chatListHeaderView.setBackgroundColor(parseColor.intValue());
        }
        if (ComposerViewExtensionKt.composerListBehavior(this.container.Y()) != null) {
            setupRootViewCorners(item.getCornerRadius());
        }
    }
}
