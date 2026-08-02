package ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.databinding.ViewReturnPolicyBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.presentation.ReturnPolicyVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/view/ReturnPolicyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/ViewReturnPolicyBinding;", "textMargin", "bind", "", "returnPolicyItem", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO$TabVO$ReturnPolicyItemVO;", "newTextAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "index", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReturnPolicyView extends ConstraintLayout {

    @NotNull
    private final ViewReturnPolicyBinding binding;
    private final int textMargin;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReturnPolicyView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextAtomView newTextAtomView(int index, TextAtom text) {
        int i11 = index == 0 ? 0 : this.textMargin;
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomView.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomView textAtomView = (TextAtomView) qVar.g(b11, context);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i11;
        textAtomView.setLayoutParams(bVar);
        TextAtomHolderKt.bind$default(textAtomView, text, null, 2, null);
        return textAtomView;
    }

    public final void bind(@NotNull ReturnPolicyVO.TabVO.ReturnPolicyItemVO returnPolicyItem) {
        Intrinsics.checkNotNullParameter(returnPolicyItem, "returnPolicyItem");
        LinearLayout linearLayout = this.binding.returnPolicyAccentPlaqLL;
        linearLayout.removeAllViews();
        LinearLayout returnPolicyAccentPlaqLL = this.binding.returnPolicyAccentPlaqLL;
        Intrinsics.checkNotNullExpressionValue(returnPolicyAccentPlaqLL, "returnPolicyAccentPlaqLL");
        int i11 = 0;
        returnPolicyAccentPlaqLL.setVisibility(returnPolicyItem.getAccentPlaq() != null ? 0 : 8);
        List<TextAtom> accentPlaq = returnPolicyItem.getAccentPlaq();
        if (accentPlaq != null) {
            int i12 = 0;
            for (Object obj : accentPlaq) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C7714v.O0();
                    throw null;
                }
                linearLayout.addView(newTextAtomView(i12, (TextAtom) obj));
                i12 = i13;
            }
        }
        AppCompatImageView returnPolicyIconTV = this.binding.returnPolicyIconTV;
        Intrinsics.checkNotNullExpressionValue(returnPolicyIconTV, "returnPolicyIconTV");
        ImageViewExtKt.loadImageOrGone(returnPolicyIconTV, returnPolicyItem.getIcon());
        TextAtomView returnPolicyRouteTV = this.binding.returnPolicyRouteTV;
        Intrinsics.checkNotNullExpressionValue(returnPolicyRouteTV, "returnPolicyRouteTV");
        TextAtomHolderKt.bindOrGone$default(returnPolicyRouteTV, returnPolicyItem.getRoute(), null, 2, null);
        LinearLayout linearLayout2 = this.binding.returnPolicyPolicyTextLL;
        linearLayout2.removeAllViews();
        for (Object obj2 : returnPolicyItem.getPolicyText()) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            linearLayout2.addView(newTextAtomView(i11, (TextAtom) obj2));
            i11 = i14;
        }
    }

    public /* synthetic */ ReturnPolicyView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnPolicyView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewReturnPolicyBinding inflate = ViewReturnPolicyBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.textMargin = ResourceExtKt.toPx(8, context);
    }
}
