package ru.ozon.app.android.cart.postRender.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.postRender.presentation.PostRenderVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/postRender/data/PostRenderDTO;", "Ll20/d;", "info", "Lru/ozon/app/android/cart/postRender/presentation/PostRenderVO;", "toVO", "(Lru/ozon/app/android/cart/postRender/data/PostRenderDTO;Ll20/d;)Lru/ozon/app/android/cart/postRender/presentation/PostRenderVO;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PostRenderMapperKt {
    @NotNull
    public static final PostRenderVO toVO(@NotNull PostRenderDTO postRenderDTO, @NotNull d info) {
        Intrinsics.checkNotNullParameter(postRenderDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        AtomActionDTO action = postRenderDTO.getAction();
        return new PostRenderVO(hashCode, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null);
    }
}
