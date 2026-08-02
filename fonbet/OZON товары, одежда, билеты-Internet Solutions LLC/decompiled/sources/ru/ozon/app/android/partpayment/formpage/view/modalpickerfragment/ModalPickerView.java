package ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment;

import EJ.a;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.FragmentModalPickerBinding;
import ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.adapter.ModalPickerOptionsAdapter;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR@\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerView;", "", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "options", "", "setOptions", "(Ljava/util/List;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/partpayment/databinding/FragmentModalPickerBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/FragmentModalPickerBinding;", "Lkotlin/Function0;", "onComplete", "Lkotlin/jvm/functions/Function0;", "getOnComplete", "()Lkotlin/jvm/functions/Function0;", "setOnComplete", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/adapter/ModalPickerOptionsAdapter;", "adapter", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/adapter/ModalPickerOptionsAdapter;", "Lkotlin/Function1;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getOnSelect", "()Lkotlin/jvm/functions/Function1;", "setOnSelect", "(Lkotlin/jvm/functions/Function1;)V", "onSelect", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModalPickerView {

    @NotNull
    private final ModalPickerOptionsAdapter adapter;

    @NotNull
    private final FragmentModalPickerBinding binding;

    @NotNull
    private final View containerView;
    private Function0<Unit> onComplete;

    public ModalPickerView(@NotNull View containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        FragmentModalPickerBinding bind = FragmentModalPickerBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        ModalPickerOptionsAdapter modalPickerOptionsAdapter = new ModalPickerOptionsAdapter();
        this.adapter = modalPickerOptionsAdapter;
        bind.listRv.setAdapter(modalPickerOptionsAdapter);
        bind.completeTv.setOnClickListener(new a(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ModalPickerView modalPickerView, View view) {
        Function0<Unit> function0 = modalPickerView.onComplete;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setOnComplete(Function0<Unit> function0) {
        this.onComplete = function0;
    }

    public final void setOnSelect(Function1<? super FormPageVO.Field.Options.Picker, Unit> function1) {
        this.adapter.setOnSelect(function1);
    }

    public final void setOptions(@NotNull List<FormPageVO.Field.Options.Picker> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.adapter.submitItems(options);
    }
}
