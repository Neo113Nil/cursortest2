package ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.adapter;

import Sc.o;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.g;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.R$drawable;
import ru.ozon.app.android.pdpoldwidgets.databinding.WidgetTrustFactorItemBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.TrustFactorVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/adapter/TrustFactorHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetTrustFactorItemBinding;", "binding", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetTrustFactorItemBinding;)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO$TrustFactorItem;", "item", "", "bindBackground", "(Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO$TrustFactorItem;)V", "bindIcon", "bindTitle", "bindClickable", "bindDescription", "bind", "Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetTrustFactorItemBinding;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TrustFactorHolder extends RecyclerView.C {

    @NotNull
    private final WidgetTrustFactorItemBinding binding;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrustFactorVO.Type.values().length];
            try {
                iArr[TrustFactorVO.Type.ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrustFactorVO.Type.FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrustFactorVO.Type.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrustFactorVO.Type.LAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustFactorHolder(@NotNull WidgetTrustFactorItemBinding binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    private final void bindBackground(TrustFactorVO.TrustFactorItem item) {
        int i11;
        int i12 = WhenMappings.$EnumSwitchMapping$0[item.getType().ordinal()];
        if (i12 == 1) {
            i11 = R$drawable.bg_trust_factor_item_only;
        } else if (i12 == 2) {
            i11 = R$drawable.bg_trust_factor_item_first;
        } else if (i12 == 3) {
            i11 = R$drawable.bg_trust_factor_item_middle;
        } else {
            if (i12 != 4) {
                throw new o();
            }
            i11 = R$drawable.bg_trust_factor_item_last;
        }
        int intValue = ((Number) WhenExtKt.getExhaustive(Integer.valueOf(i11))).intValue();
        Context context = this.itemView.getContext();
        this.binding.trustFactorsItemCl.setBackground(g.d(context.getResources(), intValue, context.getTheme()));
    }

    private final void bindClickable(TrustFactorVO.TrustFactorItem item) {
        String deeplink = item.getDeeplink();
        boolean z11 = !(deeplink == null || h.K(deeplink));
        View view = this.itemView;
        view.setClickable(z11);
        view.setFocusable(z11);
    }

    private final void bindDescription(TrustFactorVO.TrustFactorItem item) {
        TextView descriptionTv = this.binding.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        TextViewExtKt.setTextOrGone(descriptionTv, item.getDescription());
    }

    private final void bindIcon(TrustFactorVO.TrustFactorItem item) {
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ImageViewExtKt.loadWithCrossFade$default(iconIv, item.getIcon(), null, null, 6, null);
    }

    private final void bindTitle(TrustFactorVO.TrustFactorItem item) {
        this.binding.titleTv.setText(item.getTitle());
    }

    public final void bind(@NotNull TrustFactorVO.TrustFactorItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindBackground(item);
        bindIcon(item);
        bindTitle(item);
        bindDescription(item);
        bindClickable(item);
    }
}
