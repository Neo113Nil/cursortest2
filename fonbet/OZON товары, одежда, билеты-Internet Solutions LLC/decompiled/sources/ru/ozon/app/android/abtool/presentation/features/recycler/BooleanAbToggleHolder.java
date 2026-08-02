package ru.ozon.app.android.abtool.presentation.features.recycler;

import FG.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.R$layout;
import ru.ozon.app.android.abtool.databinding.AbToggleBooleanHolderBinding;
import ru.ozon.app.android.abtool.domain.FeatureDebugModel;
import ru.ozon.app.android.abtool.domain.ValueType;
import ru.ozon.app.android.abtool.presentation.views.TextViewLinkHandler;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/abtool/presentation/features/recycler/BooleanAbToggleHolder;", "Lru/ozon/app/android/abtool/presentation/features/recycler/BaseAbToggleHolder;", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function2;", "Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;", "", "", "onToggleChangeListener", "Lkotlin/Function1;", "", "onResetClickListener", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;)V", "resetLocal", "()V", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/abtool/databinding/AbToggleBooleanHolderBinding;", "binding$delegate", "LSc/j;", "getBinding", "()Lru/ozon/app/android/abtool/databinding/AbToggleBooleanHolderBinding;", "binding", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BooleanAbToggleHolder extends BaseAbToggleHolder {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j binding;
    private final Function1<String, Unit> onResetClickListener;
    private final Function2<FeatureItem, Boolean, Unit> onToggleChangeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BooleanAbToggleHolder(@NotNull ViewGroup parent, Function2<? super FeatureItem, ? super Boolean, Unit> function2, Function1<? super String, Unit> function1) {
        super(R$layout.ab_toggle_boolean_holder, parent);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.onToggleChangeListener = function2;
        this.onResetClickListener = function1;
        this.binding = k.b(new BooleanAbToggleHolder$binding$2(this));
        getBinding().descriptionTv.setMovementMethod(new TextViewLinkHandler() { // from class: ru.ozon.app.android.abtool.presentation.features.recycler.BooleanAbToggleHolder.1
            @Override // ru.ozon.app.android.abtool.presentation.views.TextViewLinkHandler
            public void onLinkClick(String url) {
                if (url != null) {
                    BooleanAbToggleHolder booleanAbToggleHolder = BooleanAbToggleHolder.this;
                    Context context = booleanAbToggleHolder.getBinding().getConstraintLayout().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    BaseAbToggleHolder.toClipboard$default(booleanAbToggleHolder, context, null, url, 1, null);
                }
            }
        });
        getBinding().toggleSw.setOnClickListener(new a(this, 11));
        getBinding().resetIv.setOnClickListener(new BC.a(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(BooleanAbToggleHolder booleanAbToggleHolder, View view) {
        Function2<FeatureItem, Boolean, Unit> function2;
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
        SwitchCompat switchCompat = (SwitchCompat) view;
        FeatureItem featureItem = booleanAbToggleHolder.getFeatureItem();
        if (featureItem == null || (function2 = booleanAbToggleHolder.onToggleChangeListener) == null) {
            return;
        }
        function2.invoke(featureItem, Boolean.valueOf(switchCompat.isChecked()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbToggleBooleanHolderBinding getBinding() {
        return (AbToggleBooleanHolderBinding) this.binding.getValue();
    }

    public void resetLocal() {
        FeatureItem featureItem = getFeatureItem();
        if (featureItem != null) {
            getBinding().toggleSw.setChecked(Boolean.parseBoolean(featureItem.getFeatureDebugModel().getValue()));
            Function1<String, Unit> function1 = this.onResetClickListener;
            if (function1 != null) {
                function1.invoke(featureItem.getTitle());
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.abtool.presentation.features.recycler.BaseHolder
    public void bind(@NotNull FeatureItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AbToggleBooleanHolderBinding binding = getBinding();
        super.bind(item);
        FeatureDebugModel featureDebugModel = item.getFeatureDebugModel();
        binding.titleTv.setText(featureDebugModel.getName());
        String displayedName = featureDebugModel.getDisplayedName();
        if (displayedName == null || displayedName.length() == 0) {
            displayedName = null;
        }
        if (displayedName != null) {
            TextView descriptionTv = binding.descriptionTv;
            Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
            descriptionTv.setVisibility(0);
            binding.descriptionTv.setText(AbToggleAdapterKt.parseHtml$default(displayedName, null, 1, null));
        } else {
            TextView descriptionTv2 = binding.descriptionTv;
            Intrinsics.checkNotNullExpressionValue(descriptionTv2, "descriptionTv");
            descriptionTv2.setVisibility(8);
        }
        if (featureDebugModel.getValueType() == ValueType.BOOLEAN) {
            binding.toggleSw.setChecked(Boolean.parseBoolean(item.getFeatureValue()));
        }
        TextView textView = binding.subtitleTv;
        String upperCase = featureDebugModel.getUpdateStrategy().name().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        textView.setText(upperCase);
    }
}
