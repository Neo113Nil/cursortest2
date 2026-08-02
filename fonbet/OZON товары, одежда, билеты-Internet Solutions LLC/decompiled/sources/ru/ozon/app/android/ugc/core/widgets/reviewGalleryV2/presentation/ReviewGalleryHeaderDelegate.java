package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5316f0;
import gk0.q;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.sequences.C7747g;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.avatar.AvatarHolderKt;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001d\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u001b\u0010\"\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017R\u001b\u0010%\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\u001aR\u001b\u0010(\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0014R\u0014\u0010,\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryHeaderDelegate;", "", "Landroid/view/ViewGroup;", "root", "<init>", "(Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.SOCIAL_USER_FIELD_NAME, "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "setupHeaderBySocialHeader", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewUser;", "user", "setupHeaderByUser", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewUser;)V", "Lru/ozon/uni/android/cell/CellView;", "createSocialHeaderView", "()Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/uni/android/uikit/view/atoms/avatar/AvatarView;", "createUserAvatarView", "()Lru/ozon/uni/android/uikit/view/atoms/avatar/AvatarView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createUserNameTextAtom", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "setupSocialHeader$core_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewUser;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;Lkotlin/jvm/functions/Function1;)V", "setupSocialHeader", "Landroid/view/ViewGroup;", "avatarView$delegate", "LSc/j;", "getAvatarView", "avatarView", "userNameView$delegate", "getUserNameView", "userNameView", "socialHeaderView$delegate", "getSocialHeaderView", "socialHeaderView", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryHeaderDelegate {

    /* renamed from: avatarView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j avatarView;

    @NotNull
    private final ViewGroup root;

    /* renamed from: socialHeaderView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j socialHeaderView;

    /* renamed from: userNameView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j userNameView;
    public static final int $stable = 8;

    @NotNull
    private static final Integer[] headerViewIds = {Integer.valueOf(R$id.userAvatarView), Integer.valueOf(R$id.userNameTAV), Integer.valueOf(R$id.socialHeader)};

    public ReviewGalleryHeaderDelegate(@NotNull ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        this.avatarView = DelegatesKt.lazyUnsafe(new ReviewGalleryHeaderDelegate$special$$inlined$lazyView$1(root, this));
        this.userNameView = DelegatesKt.lazyUnsafe(new ReviewGalleryHeaderDelegate$special$$inlined$lazyView$2(root, this));
        this.socialHeaderView = DelegatesKt.lazyUnsafe(new ReviewGalleryHeaderDelegate$special$$inlined$lazyView$3(root, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CellView createSocialHeaderView() {
        CellView cellView = (CellView) q.f64554a.i(N.b(CellView.class), getContext());
        if (cellView == null) {
            cellView = new CellView(getContext(), null, 0, 0, null, 30, null);
        }
        cellView.setId(R$id.socialHeader);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.setMarginEnd(Dimens.INSTANCE.getDP_20());
        bVar.f41657u = R$id.closeBtn;
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41598E = 0.0f;
        bVar.f41616W = true;
        cellView.setLayoutParams(bVar);
        return cellView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AvatarView createUserAvatarView() {
        AvatarView avatarView = new AvatarView(getContext(), null, 0, 6, null);
        avatarView.setId(R$id.userAvatarView);
        Dimens dimens = Dimens.INSTANCE;
        ConstraintLayout.b bVar = new ConstraintLayout.b(dimens.getDP_32(), dimens.getDP_32());
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = dimens.getDP_12();
        bVar.setMarginStart(dimens.getDP_12());
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        avatarView.setLayoutParams(bVar);
        return avatarView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View createUserNameTextAtom() {
        TextAtomV2View textAtomV2View = new TextAtomV2View(getContext(), null, 0, 6, null);
        textAtomV2View.setId(R$id.userNameTAV);
        textAtomV2View.setLines(1);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        Dimens dimens = Dimens.INSTANCE;
        bVar.setMarginEnd(dimens.getDP_8());
        bVar.setMarginStart(dimens.getDP_8());
        bVar.f41657u = R$id.closeBtn;
        int i11 = R$id.userAvatarView;
        bVar.f41655s = i11;
        bVar.f41636i = i11;
        bVar.f41642l = i11;
        textAtomV2View.setLayoutParams(bVar);
        return textAtomV2View;
    }

    private final AvatarView getAvatarView() {
        return (AvatarView) this.avatarView.getValue();
    }

    private final Context getContext() {
        Context context = this.root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    private final TextAtomV2View getUserNameView() {
        return (TextAtomV2View) this.userNameView.getValue();
    }

    private final void setupHeaderBySocialHeader(ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser, Function1<? super AtomAction, Unit> actionHandler) {
        CellDTO subscribe;
        boolean isSubscribed = socialUser.isSubscribed();
        if (isSubscribed) {
            subscribe = socialUser.getSubscribed();
        } else {
            if (isSubscribed) {
                throw new o();
            }
            subscribe = socialUser.getSubscribe();
        }
        CellHolderKt.bindOrGone(getSocialHeaderView(), subscribe, actionHandler);
    }

    private final void setupHeaderByUser(ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser user) {
        AvatarHolderKt.bindOrGone$default(getAvatarView(), user.getAvatar(), null, 2, null);
        TextHolderKt.bindOrGone$default(getUserNameView(), TextMapperKt.getDsTextAtom(user.getUsername()), null, 2, null);
    }

    public static /* synthetic */ void setupSocialHeader$core_prodGoogleAllVendorsRelease$default(ReviewGalleryHeaderDelegate reviewGalleryHeaderDelegate, ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser reviewUser, ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            reviewUser = null;
        }
        reviewGalleryHeaderDelegate.setupSocialHeader$core_prodGoogleAllVendorsRelease(reviewUser, socialUser, function1);
    }

    @NotNull
    public final CellView getSocialHeaderView() {
        return (CellView) this.socialHeaderView.getValue();
    }

    public final void setupSocialHeader$core_prodGoogleAllVendorsRelease(ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser user, ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser, Function1<? super AtomAction, Unit> actionHandler) {
        Iterator it = l.h(C5316f0.b(this.root), ReviewGalleryHeaderDelegate$setupSocialHeader$1.INSTANCE).iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                break;
            } else {
                ViewExtKt.gone((View) aVar.next());
            }
        }
        if (socialUser != null) {
            setupHeaderBySocialHeader(socialUser, actionHandler);
        } else if (user != null) {
            setupHeaderByUser(user);
        }
    }
}
