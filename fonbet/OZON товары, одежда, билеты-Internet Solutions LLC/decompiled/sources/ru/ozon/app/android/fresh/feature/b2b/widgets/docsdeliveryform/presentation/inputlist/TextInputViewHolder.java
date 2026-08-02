package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist;

import Bm0.b;
import Cm0.c;
import Em0.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.TextInputWithErrorBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DebouncedTextWatcher;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.view.B2BTextWithErrorInputLayout;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u0006*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u0006*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/TextInputViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/InputViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/TextInputWithErrorBinding;", "binding", "Lkotlin/Function2;", "", "", "onTextInputChanged", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/TextInputWithErrorBinding;Lkotlin/jvm/functions/Function2;)V", "Landroidx/appcompat/widget/AppCompatEditText;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "item", "setInputType", "(Landroidx/appcompat/widget/AppCompatEditText;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;)V", "setFormatWatcher", "bindItem", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;)V", "error", "setError", "(Ljava/lang/String;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setValue", "", "enabled", "setEnabled", "(Ljava/lang/Boolean;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/TextInputWithErrorBinding;", "Lkotlin/jvm/functions/Function2;", "LEm0/a;", "formatWatcher", "LEm0/a;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextInputViewHolder extends InputViewHolder {

    @NotNull
    private final TextInputWithErrorBinding binding;
    private a formatWatcher;

    @NotNull
    private final Function2<String, String, Unit> onTextInputChanged;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist.TextInputViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<CharSequence, Unit> {
        AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence charSequence) {
            TextInputViewHolder.this.onTextInputChanged.invoke(TextInputViewHolder.this.itemView.getContentDescription().toString(), charSequence != null ? charSequence.toString() : null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/TextInputViewHolder$Companion;", "", "<init>", "()V", "ITEM_NAME_PHONE", "", "ITEM_NAME_INDEX", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputViewHolder(@NotNull TextInputWithErrorBinding binding, @NotNull Function2<? super String, ? super String, Unit> onTextInputChanged) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onTextInputChanged, "onTextInputChanged");
        View constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.onTextInputChanged = onTextInputChanged;
        binding.inputET.addTextChangedListener(new DebouncedTextWatcher(0L, new AnonymousClass1(), 1, null));
    }

    private final void setFormatWatcher(AppCompatEditText appCompatEditText, DocsDeliveryFormVO.Input input) {
        if (input instanceof DocsDeliveryFormVO.Input.TextInput) {
            DocsDeliveryFormVO.Input.TextInput textInput = (DocsDeliveryFormVO.Input.TextInput) input;
            if (textInput.getMask() != null) {
                b h11 = b.h(textInput.getMask());
                h11.i();
                h11.j(textInput.getValue());
                a aVar = new a(Intrinsics.d(textInput.getName(), "phone") ? new Cm0.a() : new c(), h11);
                this.formatWatcher = aVar;
                aVar.c(appCompatEditText);
            }
        }
    }

    private final void setInputType(AppCompatEditText appCompatEditText, DocsDeliveryFormVO.Input input) {
        String name = input.getName();
        appCompatEditText.setInputType(Intrinsics.d(name, "phone") ? 3 : Intrinsics.d(name, "index") ? 2 : 1);
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist.InputViewHolder
    public void bindItem(@NotNull DocsDeliveryFormVO.Input item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DocsDeliveryFormVO.Input.TextInput textInput = item instanceof DocsDeliveryFormVO.Input.TextInput ? (DocsDeliveryFormVO.Input.TextInput) item : null;
        if (textInput != null) {
            DocsDeliveryFormVO.Input.TextInput textInput2 = (DocsDeliveryFormVO.Input.TextInput) item;
            this.itemView.setContentDescription(textInput2.getName());
            TextInputWithErrorBinding textInputWithErrorBinding = this.binding;
            View constraintLayout = textInputWithErrorBinding.getConstraintLayout();
            Intrinsics.g(constraintLayout, "null cannot be cast to non-null type ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.view.B2BTextWithErrorInputLayout");
            ((B2BTextWithErrorInputLayout) constraintLayout).bind(textInput2);
            textInputWithErrorBinding.getConstraintLayout().setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            AppCompatEditText inputET = textInputWithErrorBinding.inputET;
            Intrinsics.checkNotNullExpressionValue(inputET, "inputET");
            setInputType(inputET, item);
            AppCompatEditText inputET2 = textInputWithErrorBinding.inputET;
            Intrinsics.checkNotNullExpressionValue(inputET2, "inputET");
            setFormatWatcher(inputET2, item);
            if (Intrinsics.d(textInput2.getName(), "index")) {
                textInputWithErrorBinding.inputET.setImeOptions(6);
            }
            View constraintLayout2 = this.binding.getConstraintLayout();
            Intrinsics.g(constraintLayout2, "null cannot be cast to non-null type ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.view.B2BTextWithErrorInputLayout");
            ((B2BTextWithErrorInputLayout) constraintLayout2).bind(textInput);
        }
    }

    public final void setEnabled(Boolean enabled) {
        View constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.g(constraintLayout, "null cannot be cast to non-null type ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.view.B2BTextWithErrorInputLayout");
        ((B2BTextWithErrorInputLayout) constraintLayout).setInputEnabled(Intrinsics.d(enabled, Boolean.TRUE));
    }

    public final void setError(String error) {
        View constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.g(constraintLayout, "null cannot be cast to non-null type ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.view.B2BTextWithErrorInputLayout");
        ((B2BTextWithErrorInputLayout) constraintLayout).bindError(error);
    }

    public final void setValue(String value) {
        View constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.g(constraintLayout, "null cannot be cast to non-null type ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.view.B2BTextWithErrorInputLayout");
        ((B2BTextWithErrorInputLayout) constraintLayout).setText(value);
    }
}
