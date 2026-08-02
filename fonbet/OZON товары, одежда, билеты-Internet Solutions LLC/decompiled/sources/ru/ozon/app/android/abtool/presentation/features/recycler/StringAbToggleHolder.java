package ru.ozon.app.android.abtool.presentation.features.recycler;

import Am.b;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.text.Editable;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.R$layout;
import ru.ozon.app.android.abtool.databinding.AbToggleStringHolderBinding;
import ru.ozon.app.android.abtool.domain.FeatureDebugModel;
import ru.ozon.app.android.abtool.presentation.views.TextViewLinkHandler;
import ru.ozon.app.android.abtool.presentation.views.TextWatcherWrapper;

@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004*\u0001\"\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R(\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/abtool/presentation/features/recycler/StringAbToggleHolder;", "Lru/ozon/app/android/abtool/presentation/features/recycler/BaseAbToggleHolder;", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function1;", "", "", "onResetClickListener", "Lkotlin/Function2;", "Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;", "onLocalValueChangeListener", "Lru/ozon/app/android/abtool/presentation/features/recycler/EditStateCache;", "editStateCache", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lru/ozon/app/android/abtool/presentation/features/recycler/EditStateCache;)V", "text", "", "selection", "applyText", "(Ljava/lang/String;I)V", "item", "bind", "(Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;)V", "resetLocal", "()V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/abtool/presentation/features/recycler/EditStateCache;", "Lru/ozon/app/android/abtool/databinding/AbToggleStringHolderBinding;", "binding$delegate", "LSc/j;", "getBinding", "()Lru/ozon/app/android/abtool/databinding/AbToggleStringHolderBinding;", "binding", "ru/ozon/app/android/abtool/presentation/features/recycler/StringAbToggleHolder$textWatcher$1", "textWatcher", "Lru/ozon/app/android/abtool/presentation/features/recycler/StringAbToggleHolder$textWatcher$1;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StringAbToggleHolder extends BaseAbToggleHolder {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j binding;

    @NotNull
    private final EditStateCache editStateCache;
    private final Function2<FeatureItem, String, Unit> onLocalValueChangeListener;
    private final Function1<String, Unit> onResetClickListener;

    @NotNull
    private final StringAbToggleHolder$textWatcher$1 textWatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.abtool.presentation.features.recycler.StringAbToggleHolder$textWatcher$1] */
    public StringAbToggleHolder(@NotNull ViewGroup parent, Function1<? super String, Unit> function1, Function2<? super FeatureItem, ? super String, Unit> function2, @NotNull EditStateCache editStateCache) {
        super(R$layout.ab_toggle_string_holder, parent);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(editStateCache, "editStateCache");
        this.onResetClickListener = function1;
        this.onLocalValueChangeListener = function2;
        this.editStateCache = editStateCache;
        this.binding = k.b(new StringAbToggleHolder$binding$2(this));
        this.textWatcher = new TextWatcherWrapper() { // from class: ru.ozon.app.android.abtool.presentation.features.recycler.StringAbToggleHolder$textWatcher$1
            @Override // ru.ozon.app.android.abtool.presentation.views.TextWatcherWrapper
            public void performTextChange(Editable editable) {
                EditStateCache editStateCache2;
                Function2 function22;
                FeatureItem featureItem = StringAbToggleHolder.this.getFeatureItem();
                if (featureItem == null) {
                    return;
                }
                String obj = editable != null ? editable.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                int selectionEnd = StringAbToggleHolder.this.getBinding().toggleEt.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                editStateCache2 = StringAbToggleHolder.this.editStateCache;
                editStateCache2.save(featureItem.getTitle(), obj, selectionEnd);
                function22 = StringAbToggleHolder.this.onLocalValueChangeListener;
                if (function22 != null) {
                    function22.invoke(featureItem, obj);
                }
            }
        };
        getBinding().descriptionTv.setMovementMethod(new TextViewLinkHandler() { // from class: ru.ozon.app.android.abtool.presentation.features.recycler.StringAbToggleHolder.1
            @Override // ru.ozon.app.android.abtool.presentation.views.TextViewLinkHandler
            public void onLinkClick(String url) {
                if (url != null) {
                    StringAbToggleHolder stringAbToggleHolder = StringAbToggleHolder.this;
                    Context context = stringAbToggleHolder.getBinding().getConstraintLayout().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    BaseAbToggleHolder.toClipboard$default(stringAbToggleHolder, context, null, url, 1, null);
                }
            }
        });
        getBinding().resetIv.setOnClickListener(new b(this, 9));
    }

    private final void applyText(String text, int selection) {
        EditText editText = getBinding().toggleEt;
        Editable text2 = editText.getText();
        if (!Intrinsics.d(text2 != null ? text2.toString() : null, text) || text.length() == 0) {
            editText.removeTextChangedListener(this.textWatcher);
            editText.setText(text);
            editText.addTextChangedListener(this.textWatcher);
        }
        int e11 = h.e(selection, 0, text.length());
        if (editText.getSelectionEnd() != e11) {
            editText.setSelection(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbToggleStringHolderBinding getBinding() {
        return (AbToggleStringHolderBinding) this.binding.getValue();
    }

    public void resetLocal() {
        FeatureItem featureItem = getFeatureItem();
        if (featureItem != null) {
            this.editStateCache.clear(featureItem.getTitle());
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
        AbToggleStringHolderBinding binding = getBinding();
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
        EditState editState = this.editStateCache.get(item.getTitle());
        if (editState != null) {
            applyText(editState.getText(), editState.getSelection());
        } else {
            applyText(item.getFeatureValue(), item.getFeatureValue().length());
        }
        binding.subtitleTv.setText(featureDebugModel.getUpdateStrategy().name());
    }
}
