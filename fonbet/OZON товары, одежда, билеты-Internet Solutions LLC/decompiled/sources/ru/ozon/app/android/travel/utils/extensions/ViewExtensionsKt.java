package ru.ozon.app.android.travel.utils.extensions;

import android.graphics.Outline;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\u001aA\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\f\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/view/View;", "", "top", "bottom", "start", "end", "", "safeUpdateMargins", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "color", "", "radius", "applyRoundedOutline", "(Landroid/view/View;IF)V", "targetView", "performClickOnTargetView", "(Landroid/view/View;Landroid/view/View;)V", "(Landroid/view/View;F)V", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewExtensionsKt {
    public static final void applyRoundedOutline(@NotNull View view, int i11, final float f7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setClipToOutline(true);
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt$applyRoundedOutline$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                if (view2 == null || outline == null) {
                    return;
                }
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f7);
            }
        });
        view.setBackgroundColor(i11);
    }

    public static final void performClickOnTargetView(@NotNull View view, @NotNull final View targetView) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        view.setOnTouchListener(new View.OnTouchListener() { // from class: CU.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean performClickOnTargetView$lambda$5;
                performClickOnTargetView$lambda$5 = ViewExtensionsKt.performClickOnTargetView$lambda$5(targetView, view2, motionEvent);
                return performClickOnTargetView$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean performClickOnTargetView$lambda$5(View view, View view2, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void safeUpdateMargins(@NotNull View view, Integer num, Integer num2, Integer num3, Integer num4) {
        boolean z11;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        boolean z14 = false;
        if (num != null) {
            if (num.intValue() != marginLayoutParams.topMargin) {
                z11 = true;
                if (num2 != null) {
                    if (num2.intValue() != marginLayoutParams.bottomMargin) {
                        z12 = true;
                        if (num3 != null) {
                            if (num3.intValue() != marginLayoutParams.getMarginStart()) {
                                z13 = true;
                                if (num4 != null) {
                                    if (num4.intValue() != marginLayoutParams.getMarginEnd()) {
                                        z14 = true;
                                    }
                                }
                                if (!z11 || z12 || z13 || z14) {
                                    if (num != null) {
                                        marginLayoutParams.topMargin = num.intValue();
                                    }
                                    if (num2 != null) {
                                        marginLayoutParams.bottomMargin = num2.intValue();
                                    }
                                    if (num3 != null) {
                                        marginLayoutParams.setMarginStart(num3.intValue());
                                    }
                                    if (num4 != null) {
                                        marginLayoutParams.setMarginEnd(num4.intValue());
                                    }
                                    view.setLayoutParams(marginLayoutParams);
                                }
                                return;
                            }
                        }
                        z13 = false;
                        if (num4 != null) {
                        }
                        if (z11) {
                        }
                        if (num != null) {
                        }
                        if (num2 != null) {
                        }
                        if (num3 != null) {
                        }
                        if (num4 != null) {
                        }
                        view.setLayoutParams(marginLayoutParams);
                    }
                }
                z12 = false;
                if (num3 != null) {
                }
                z13 = false;
                if (num4 != null) {
                }
                if (z11) {
                }
                if (num != null) {
                }
                if (num2 != null) {
                }
                if (num3 != null) {
                }
                if (num4 != null) {
                }
                view.setLayoutParams(marginLayoutParams);
            }
        }
        z11 = false;
        if (num2 != null) {
        }
        z12 = false;
        if (num3 != null) {
        }
        z13 = false;
        if (num4 != null) {
        }
        if (z11) {
        }
        if (num != null) {
        }
        if (num2 != null) {
        }
        if (num3 != null) {
        }
        if (num4 != null) {
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static /* synthetic */ void safeUpdateMargins$default(View view, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            num = marginLayoutParams != null ? Integer.valueOf(marginLayoutParams.topMargin) : null;
        }
        if ((i11 & 2) != 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            num2 = marginLayoutParams2 != null ? Integer.valueOf(marginLayoutParams2.bottomMargin) : null;
        }
        if ((i11 & 4) != 0) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            num3 = marginLayoutParams3 != null ? Integer.valueOf(marginLayoutParams3.getMarginStart()) : null;
        }
        if ((i11 & 8) != 0) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            num4 = marginLayoutParams4 != null ? Integer.valueOf(marginLayoutParams4.getMarginEnd()) : null;
        }
        safeUpdateMargins(view, num, num2, num3, num4);
    }

    public static final void applyRoundedOutline(@NotNull View view, final float f7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setClipToOutline(true);
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt$applyRoundedOutline$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                if (view2 == null || outline == null) {
                    return;
                }
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f7);
            }
        });
    }
}
