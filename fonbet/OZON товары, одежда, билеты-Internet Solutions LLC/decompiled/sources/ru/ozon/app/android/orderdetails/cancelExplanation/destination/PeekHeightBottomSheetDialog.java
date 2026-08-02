package ru.ozon.app.android.orderdetails.cancelExplanation.destination;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.component.sheet.SheetDialog;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/orderdetails/cancelExplanation/destination/PeekHeightBottomSheetDialog;", "Lru/ozon/uni/android/component/sheet/SheetDialog;", "context", "Landroid/content/Context;", "theme", "", "startState", "showHandle", "", "wrapContent", "minHeightDp", "cancelable", "peekHeight", "<init>", "(Landroid/content/Context;IIZZLjava/lang/Integer;ZLjava/lang/Integer;)V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PeekHeightBottomSheetDialog extends SheetDialog {
    public /* synthetic */ PeekHeightBottomSheetDialog(Context context, int i11, int i12, boolean z11, boolean z12, Integer num, boolean z13, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 3 : i12, (i13 & 8) != 0 ? false : z11, (i13 & 16) != 0 ? false : z12, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? true : z13, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeekHeightBottomSheetDialog(@NotNull Context context, int i11, int i12, boolean z11, boolean z12, Integer num, boolean z13, Integer num2) {
        super(context, i11, false, i12, z12, false, null, null, z11, false, null, true, num != null ? num.intValue() : 0, z13, null, 18148, null);
        Intrinsics.checkNotNullParameter(context, "context");
        setAllowResizeByGesture(true);
        if (num2 != null) {
            getBehavior().setPeekHeight(num2.intValue());
        }
    }
}
