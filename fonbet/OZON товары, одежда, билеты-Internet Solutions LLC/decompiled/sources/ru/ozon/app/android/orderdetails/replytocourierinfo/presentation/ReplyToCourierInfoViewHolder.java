package ru.ozon.app.android.orderdetails.replytocourierinfo.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.holders.HeaderAtom;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.Header;
import ru.ozon.app.android.orderdetails.databinding.WidgetReplyToCourierInfoBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$style;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/orderdetails/replytocourierinfo/presentation/ReplyToCourierInfoViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/replytocourierinfo/presentation/ReplyToCourierInfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/replytocourierinfo/presentation/ReplyToCourierInfoVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/orderdetails/databinding/WidgetReplyToCourierInfoBinding;", "binding", "Lru/ozon/app/android/orderdetails/databinding/WidgetReplyToCourierInfoBinding;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "headerAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "descriptionAdapter", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReplyToCourierInfoViewHolder extends k<ReplyToCourierInfoVO> {

    @NotNull
    private final WidgetReplyToCourierInfoBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final AtomsAdapter descriptionAdapter;

    @NotNull
    private final AtomsAdapter headerAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplyToCourierInfoViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetReplyToCourierInfoBinding bind = WidgetReplyToCourierInfoBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.j(new Pair(new Atom.ConfCondition(Header.class, null, 2, null), new HeaderAtom.Configuration(0, 0, 0, 0, null, null, Integer.valueOf(R$style.TextStyle_Head_M), 0, false, null, 959, null)), new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null), new TextAtom.Configuration(0, 0, 0, 0, R$style.TextStyle_Body_L, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 524271, null))), null, null, null, 14, null);
        this.headerAdapter = atomsAdapter;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null), new TextAtom.Configuration(0, 0, 0, 0, R$style.TextStyle_Body_L, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 524271, null))), null, null, null, 14, null);
        this.descriptionAdapter = atomsAdapter2;
        bind.headerAtoms.setAdapter(atomsAdapter);
        bind.descriptionAtoms.setAdapter(atomsAdapter2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReplyToCourierInfoVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.headerAdapter.bind(getContext(), item.getHeader());
        this.descriptionAdapter.bind(getContext(), C7714v.a0(item.getDescription()));
    }
}
