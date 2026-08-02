package ru.ozon.app.android.fresh.feature.b2b.utils;

import android.graphics.drawable.PaintDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.R$string;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.DateChooseDialog;
import ru.ozon.app.android.permission.extension.FragmentsKt;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0012\u001a\u00020\u0011*\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u001b\u001a\u00020\u0011*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010\u001e\u001a\u00020\u0011*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ljava/util/Calendar;", "setMinTimeForDate", "(Ljava/util/Calendar;)Ljava/util/Calendar;", "setMaxTimeForDate", "", "dayOfMonth", "month", "year", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/DateChooseDialog$Type;", "type", "Ljava/util/Date;", "getDate", "(IIILru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/DateChooseDialog$Type;)Ljava/util/Date;", "Landroid/view/View;", "colorId", "", "cornerRadius", "", "setColoredDrawableBackground", "(Landroid/view/View;IF)V", "Landroidx/fragment/app/m;", "Landroidx/lifecycle/J;", "viewOwner", "", "needRationale", "Lkotlin/Function0;", "onGranted", "checkPermissions", "(Landroidx/fragment/app/m;Landroidx/lifecycle/J;ZLkotlin/jvm/functions/Function0;)V", "onAction", "showPermissionErrorRestriction", "(Landroidx/fragment/app/m;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function0;)V", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UtilsKt {
    public static final void checkPermissions(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull J viewOwner, boolean z11, @NotNull Function0<Unit> onGranted) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        Intrinsics.checkNotNullParameter(onGranted, "onGranted");
        FragmentsKt.requestPermission(componentCallbacksC5392m, new UtilsKt$checkPermissions$1(onGranted, z11, componentCallbacksC5392m, viewOwner));
    }

    public static /* synthetic */ void checkPermissions$default(ComponentCallbacksC5392m componentCallbacksC5392m, J j11, boolean z11, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        checkPermissions(componentCallbacksC5392m, j11, z11, function0);
    }

    @NotNull
    public static final Date getDate(int i11, int i12, int i13, DateChooseDialog.Type type) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i13, i12, i11);
        if (type == DateChooseDialog.Type.START) {
            setMaxTimeForDate(calendar);
        } else {
            setMinTimeForDate(calendar);
        }
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }

    public static final void setColoredDrawableBackground(@NotNull View view, int i11, float f7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.getPaint().setColor(view.getContext().getColor(i11));
        paintDrawable.setCornerRadius(f7);
        view.setBackground(paintDrawable);
    }

    public static /* synthetic */ void setColoredDrawableBackground$default(View view, int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 0.0f;
        }
        setColoredDrawableBackground(view, i11, f7);
    }

    @NotNull
    public static final Calendar setMaxTimeForDate(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar;
    }

    @NotNull
    public static final Calendar setMinTimeForDate(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPermissionErrorRestriction(ComponentCallbacksC5392m componentCallbacksC5392m, J j11, Function0<Unit> function0) {
        ViewGroup rootView = ContextExtKt.getRootView(componentCallbacksC5392m);
        if (rootView == null) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.common_no_write_external_permission_android)), null, null, null, null, null, null, new Action(StringProvider.getString(ru.ozon.app.android.uikit.R$string.common_action_ok), true, new UtilsKt$showPermissionErrorRestriction$1(function0)), null, null, null, null, null, null, j11, 65018, null).show();
    }
}
