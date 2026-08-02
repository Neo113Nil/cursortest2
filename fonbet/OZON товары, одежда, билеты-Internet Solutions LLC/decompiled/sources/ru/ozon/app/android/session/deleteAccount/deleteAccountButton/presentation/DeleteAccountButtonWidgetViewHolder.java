package ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation;

import Nk.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.J;
import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.session.databinding.WidgetDeleteAccountButtonLayoutBinding;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u000e*\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\u00152\b\b\u0001\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00022\n\u0010%\u001a\u00060#j\u0002`$H\u0014¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel;)V", "", "link", "", "openBottomSheet", "(Lru/ozon/app/android/composer/ComposerReferences;Ljava/lang/String;)V", "message", "showError", "(Ljava/lang/String;)V", "Landroid/widget/TextView;", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "", "defaultColor", "bindStartIconOrGone", "(Landroid/widget/TextView;Lru/ozon/uni/atoms/data/button/Icon;I)V", "Landroid/graphics/drawable/Drawable;", "toDrawable", "(Lru/ozon/uni/atoms/data/button/Icon;I)Landroid/graphics/drawable/Drawable;", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonVO;Ll20/d;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel;", "Lru/ozon/app/android/session/databinding/WidgetDeleteAccountButtonLayoutBinding;", "binding", "Lru/ozon/app/android/session/databinding/WidgetDeleteAccountButtonLayoutBinding;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeleteAccountButtonWidgetViewHolder extends k<DeleteAccountButtonVO> {

    @NotNull
    private final WidgetDeleteAccountButtonLayoutBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final DeleteAccountButtonViewModel viewModel;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation.DeleteAccountButtonWidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            String actionName;
            Intrinsics.checkNotNullParameter(it, "it");
            DeleteAccountButtonVO boundedData = DeleteAccountButtonWidgetViewHolder.this.getBoundedData();
            if (boundedData == null || (actionName = boundedData.getActionName()) == null) {
                return;
            }
            DeleteAccountButtonWidgetViewHolder.this.viewModel.deleteAccountStartRequest(actionName);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountButtonWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref, @NotNull DeleteAccountButtonViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.ref = ref;
        this.viewModel = viewModel;
        WidgetDeleteAccountButtonLayoutBinding bind = WidgetDeleteAccountButtonLayoutBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        FrameLayout constraintLayout = bind.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.setOnClickListenerThrottle$default(constraintLayout, 0L, new AnonymousClass1(), 1, null);
    }

    private final void bindStartIconOrGone(TextView textView, Icon icon, int i11) {
        textView.setCompoundDrawablesRelative(icon != null ? toDrawable(icon, i11) : null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openBottomSheet(ComposerReferences ref, String link) {
        ComposerNavigator.DefaultImpls.openBottomSheet$default(ref.getNavigator(), a.b("DeleteAccountButtonWidgetView.", link), new ComposerScreenConfig(new h.c.a(link, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777150, null), Integer.valueOf(link.hashCode()), null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(String message) {
        View rootView = this.containerView.getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, viewGroup, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(R$drawable.ic_warning), null, null, null, null, null, null, null, 3000L, null, null, this.ref.getContainer().g(), 57306, null).show();
        }
    }

    private final Drawable toDrawable(Icon icon, int i11) {
        Drawable loadDrawableByName = ExtensionsKt.loadDrawableByName(getContext(), icon.getImage());
        if (loadDrawableByName == null) {
            return null;
        }
        loadDrawableByName.setBounds(0, 0, loadDrawableByName.getIntrinsicWidth(), loadDrawableByName.getIntrinsicHeight());
        loadDrawableByName.setTint(StyleParser.INSTANCE.parseColorInt(getContext(), icon.getTintColor(), i11));
        return loadDrawableByName;
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.viewModel.getAction().observe(this, new DeleteAccountButtonWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new DeleteAccountButtonWidgetViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeleteAccountButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextView textView = this.binding.deleteAccountTv;
        textView.setText(item.getTitle());
        Intrinsics.f(textView);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = item.getGravity();
        textView.setLayoutParams(layoutParams2);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, item.getTextColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY);
        textView.setTextColor(parseColor);
        bindStartIconOrGone(textView, item.getIcon(), parseColor);
    }
}
