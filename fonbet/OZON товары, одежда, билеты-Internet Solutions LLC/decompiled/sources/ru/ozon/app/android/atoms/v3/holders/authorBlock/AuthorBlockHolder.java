package ru.ozon.app.android.atoms.v3.holders.authorBlock;

import CG.a;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.authorBlock.AuthorBlock;
import ru.ozon.app.android.atoms.v3.molecules.authorBlock.AuthorBlockView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/authorBlock/AuthorBlockHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/authorBlock/AuthorBlock;", "Lru/ozon/app/android/atoms/v3/molecules/authorBlock/AuthorBlockView;", "view", "", "atomContext", "<init>", "(Lru/ozon/app/android/atoms/v3/molecules/authorBlock/AuthorBlockView;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;)V", "item", "", "onBind", "(Lru/ozon/app/android/atoms/data/authorBlock/AuthorBlock;)V", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuthorBlockHolder extends AtomV3<AuthorBlock, AuthorBlockView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorBlockHolder(@NotNull AuthorBlockView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnClickListener(new a(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(AuthorBlockHolder authorBlockHolder, View view) {
        AtomAction atomAction;
        AuthorBlock authorBlock = (AuthorBlock) authorBlockHolder.getData();
        AtomActionDTO action = authorBlock.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, authorBlock.getTrackingInfo())) == null) {
            return;
        }
        authorBlockHolder.handleAction(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull AuthorBlock item) {
        Icon icon;
        Icon icon2;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((AuthorBlockHolder) item);
        AuthorBlockView containerView = getContainerView();
        containerView.bindAvatar(item.getAvatar());
        String text = item.getTitle().getText();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getTitle().getColor());
        Icon icon3 = item.getTitle().getIcon();
        String str = null;
        String image = icon3 != null ? icon3.getImage() : null;
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Icon icon4 = item.getTitle().getIcon();
        containerView.bindTitle(text, parseColor, image, styleParser.parseColor(context2, icon4 != null ? icon4.getTintColor() : null));
        AuthorBlock.Title subtitle = item.getSubtitle();
        String text2 = subtitle != null ? subtitle.getText() : null;
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        AuthorBlock.Title subtitle2 = item.getSubtitle();
        Integer parseColor2 = styleParser.parseColor(context3, subtitle2 != null ? subtitle2.getColor() : null);
        AuthorBlock.Title subtitle3 = item.getSubtitle();
        String image2 = (subtitle3 == null || (icon2 = subtitle3.getIcon()) == null) ? null : icon2.getImage();
        Context context4 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        AuthorBlock.Title subtitle4 = item.getSubtitle();
        if (subtitle4 != null && (icon = subtitle4.getIcon()) != null) {
            str = icon.getTintColor();
        }
        containerView.bindSubtitle(text2, parseColor2, image2, styleParser.parseColor(context4, str));
        containerView.bindIconButton(item.getIconButton(), getOnAction());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthorBlockHolder(@NotNull Context context, String str) {
        this(new AuthorBlockView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
