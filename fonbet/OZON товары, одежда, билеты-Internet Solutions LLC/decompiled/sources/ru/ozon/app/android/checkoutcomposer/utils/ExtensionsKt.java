package ru.ozon.app.android.checkoutcomposer.utils;

import android.app.Dialog;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import jk0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljk0/l;", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "viewRect", "", "getViewVisiblePercentIgnoreBottomContainer", "(Ljk0/l;Landroid/view/View;Landroid/graphics/Rect;)F", "Ll10/i;", "Landroid/view/Window;", "getActualWindow", "(Ll10/i;)Landroid/view/Window;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtensionsKt {
    public static final Window getActualWindow(@NotNull i iVar) {
        Dialog dialog;
        Window window;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        ComponentCallbacksC5392m j11 = iVar.Q().j();
        ComposerFragment composerFragment = j11 instanceof ComposerFragment ? (ComposerFragment) j11 : null;
        ComponentCallbacksC5392m parentFragment = composerFragment != null ? composerFragment.getParentFragment() : null;
        BottomSheetComposerFragment bottomSheetComposerFragment = parentFragment instanceof BottomSheetComposerFragment ? (BottomSheetComposerFragment) parentFragment : null;
        if (bottomSheetComposerFragment != null && (dialog = bottomSheetComposerFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
            return window;
        }
        r a11 = iVar.Q().a();
        if (a11 != null) {
            return a11.getWindow();
        }
        return null;
    }

    public static final float getViewVisiblePercentIgnoreBottomContainer(@NotNull l lVar, @NotNull View view, @NotNull Rect viewRect) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        if (!view.getGlobalVisibleRect(viewRect)) {
            return 0.0f;
        }
        int measuredHeight = view.getMeasuredHeight() * view.getMeasuredWidth();
        if (viewRect.isEmpty()) {
            return 0.0f;
        }
        int i11 = lVar.g().height() > 0 ? lVar.g().bottom : lVar.i().height() > 0 ? lVar.i().bottom : lVar.b().height() > 0 ? lVar.b().bottom : 0;
        Integer c11 = lVar.c();
        return (viewRect.width() * Math.max(((lVar.f().height() == 0 ? null : c11 == null ? Integer.valueOf(lVar.f().bottom) : Integer.valueOf(Math.min(c11.intValue(), lVar.f().bottom))) != null ? Math.min(r4.intValue(), viewRect.bottom) : viewRect.bottom) - Math.max(viewRect.top, i11), 0)) / measuredHeight;
    }
}
