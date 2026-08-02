package ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation;

import CX.a;
import DQ.b;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.databinding.AvatarPickerBottomSheetDialogBinding;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R8\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/AvatarPickerView;", "", "Landroid/view/View;", "containerView", "", "isShowRemoveBtnRequired", "<init>", "(Landroid/view/View;Ljava/lang/Boolean;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/fresh/unsorted/databinding/AvatarPickerBottomSheetDialogBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/AvatarPickerBottomSheetDialogBinding;", "Lkotlin/Function0;", "", "openChoosePhotoPicker", "Lkotlin/jvm/functions/Function0;", "getOpenChoosePhotoPicker", "()Lkotlin/jvm/functions/Function0;", "setOpenChoosePhotoPicker", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function2;", "", "Landroid/net/Uri;", "sendResult", "Lkotlin/jvm/functions/Function2;", "getSendResult", "()Lkotlin/jvm/functions/Function2;", "setSendResult", "(Lkotlin/jvm/functions/Function2;)V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AvatarPickerView {

    @NotNull
    private final AvatarPickerBottomSheetDialogBinding binding;

    @NotNull
    private final View containerView;
    private Function0<Unit> openChoosePhotoPicker;
    private Function2<? super Integer, ? super Uri, Unit> sendResult;

    public AvatarPickerView(@NotNull View containerView, Boolean bool) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        AvatarPickerBottomSheetDialogBinding bind = AvatarPickerBottomSheetDialogBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.choosePhotoTv.setOnClickListener(new b(this, 1));
        bind.removePhotoTv.setOnClickListener(new a(this, 3));
        bind.cancelTv.setOnClickListener(new BQ.b(this, 1));
        TextView removePhotoTv = bind.removePhotoTv;
        Intrinsics.checkNotNullExpressionValue(removePhotoTv, "removePhotoTv");
        ViewExtKt.showOrGone(removePhotoTv, bool);
        View removePhotoDivider = bind.removePhotoDivider;
        Intrinsics.checkNotNullExpressionValue(removePhotoDivider, "removePhotoDivider");
        ViewExtKt.showOrGone(removePhotoDivider, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$0(AvatarPickerView avatarPickerView, View view) {
        Function0<Unit> function0 = avatarPickerView.openChoosePhotoPicker;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$1(AvatarPickerView avatarPickerView, View view) {
        Function2<? super Integer, ? super Uri, Unit> function2 = avatarPickerView.sendResult;
        if (function2 != null) {
            function2.invoke(-1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(AvatarPickerView avatarPickerView, View view) {
        Function2<? super Integer, ? super Uri, Unit> function2 = avatarPickerView.sendResult;
        if (function2 != null) {
            function2.invoke(0, null);
        }
    }

    public final Function2<Integer, Uri, Unit> getSendResult() {
        return this.sendResult;
    }

    public final void setOpenChoosePhotoPicker(Function0<Unit> function0) {
        this.openChoosePhotoPicker = function0;
    }

    public final void setSendResult(Function2<? super Integer, ? super Uri, Unit> function2) {
        this.sendResult = function2;
    }
}
