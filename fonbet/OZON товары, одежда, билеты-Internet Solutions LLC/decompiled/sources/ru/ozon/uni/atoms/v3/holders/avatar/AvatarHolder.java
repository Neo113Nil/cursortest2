package ru.ozon.uni.atoms.v3.holders.avatar;

import Sc.InterfaceC3999a;
import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0006H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/avatar/AvatarHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "Lru/ozon/uni/android/uikit/view/atoms/avatar/AvatarView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/avatar/AvatarView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "localIconPadding", "", "onBind", "", "item", "isLocalIcon", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AvatarHolder extends AtomV3<Avatar, AvatarView> {
    private final int localIconPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarHolder(@NotNull AvatarView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.localIconPadding = ResourceExtKt.toPx(10);
    }

    private final boolean isLocalIcon(String str) {
        return h.e0(str, "ic_", false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Avatar item) {
        Map map;
        Map map2;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((AvatarHolder) item);
        if (item.getIcon() != null) {
            if (isLocalIcon(item.getIcon().getImage())) {
                AvatarView containerView = getContainerView();
                int i11 = this.localIconPadding;
                containerView.setIconPadding(i11, i11, i11, i11);
            } else {
                getContainerView().setIconPadding(0, 0, 0, 0);
            }
            AvatarView containerView2 = getContainerView();
            String image = item.getIcon().getImage();
            String tintColor = item.getIcon().getTintColor();
            containerView2.showIcon(image, tintColor != null ? StyleParser.INSTANCE.parseColor(getContext(), tintColor) : null, StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), R$color.oz_semantic_accent_primary_pale));
            AtomConfig.INSTANCE.getImageLoader().loadCircle(getContainerView().getIcon(), item.getIcon().getImage());
        } else if (item.getInitials() != null) {
            AvatarView containerView3 = getContainerView();
            String initials = item.getInitials();
            map = AvatarHolderKt.textSizes;
            containerView3.showInitials(initials, ((Number) U.e(map, item.getTheme())).intValue(), StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), R$color.oz_semantic_accent_primary_pale));
        }
        AvatarView containerView4 = getContainerView();
        map2 = AvatarHolderKt.sizes;
        containerView4.setSize(((Number) U.e(map2, item.getTheme())).intValue());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarHolder(@NotNull Context context, String str) {
        this(new AvatarView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
