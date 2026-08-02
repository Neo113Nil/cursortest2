package ru.ozon.uni.atoms.v3.holders.avatar;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.extensions.ViewExtKt;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\b\" \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\" \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/avatar/AvatarView;", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/uni/android/uikit/view/atoms/avatar/AvatarView;Lru/ozon/uni/atoms/data/avatar/Avatar;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "", "Lru/ozon/uni/atoms/data/avatar/Avatar$Theme;", "", "sizes", "Ljava/util/Map;", "textSizes", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AvatarHolderKt {

    @NotNull
    private static final Map<Avatar.Theme, Integer> sizes;

    @NotNull
    private static final Map<Avatar.Theme, Integer> textSizes;

    static {
        Avatar.Theme theme = Avatar.Theme.THEME_TYPE_X_SMALL;
        Pair pair = new Pair(theme, Integer.valueOf(ResourceExtKt.toPx(24)));
        Avatar.Theme theme2 = Avatar.Theme.THEME_TYPE_SMALL;
        Pair pair2 = new Pair(theme2, Integer.valueOf(ResourceExtKt.toPx(32)));
        Avatar.Theme theme3 = Avatar.Theme.THEME_TYPE_MEDIUM;
        Pair pair3 = new Pair(theme3, Integer.valueOf(ResourceExtKt.toPx(40)));
        Avatar.Theme theme4 = Avatar.Theme.THEME_TYPE_LARGE;
        sizes = U.j(pair, pair2, pair3, new Pair(theme4, Integer.valueOf(ResourceExtKt.toPx(64))));
        textSizes = U.j(new Pair(theme, 12), new Pair(theme2, 12), new Pair(theme3, 16), new Pair(theme4, 24));
    }

    public static final void bind(@NotNull AvatarView avatarView, @NotNull Avatar dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(avatarView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(avatarView, dto, new AvatarHolderKt$bind$provider$1(avatarView), function1);
    }

    public static /* synthetic */ void bind$default(AvatarView avatarView, Avatar avatar, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(avatarView, avatar, function1);
    }

    public static final void bindOrGone(@NotNull AvatarView avatarView, Avatar avatar, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(avatarView, "<this>");
        if (avatar == null) {
            ViewExtKt.gone(avatarView);
        } else {
            ViewExtKt.show(avatarView);
            bind(avatarView, avatar, function1);
        }
    }

    public static /* synthetic */ void bindOrGone$default(AvatarView avatarView, Avatar avatar, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrGone(avatarView, avatar, function1);
    }
}
