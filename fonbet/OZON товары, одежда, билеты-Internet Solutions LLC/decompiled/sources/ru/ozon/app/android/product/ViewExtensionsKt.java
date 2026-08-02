package ru.ozon.app.android.product;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.J;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004*\u00020\u0005H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0002¨\u0006\t"}, d2 = {"disableEmojiProcessingWithDescendants", "", "Landroid/view/View;", "descendantsViaRecursion", "", "Landroid/view/ViewGroup;", "internalDescendantsViaRecursion", "accumulator", "", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewExtensionsKt {
    @NotNull
    public static final List<View> descendantsViaRecursion(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        ArrayList arrayList = new ArrayList();
        internalDescendantsViaRecursion(viewGroup, arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void disableEmojiProcessingWithDescendants(@NotNull View view) {
        List<View> descendantsViaRecursion;
        Intrinsics.checkNotNullParameter(view, "<this>");
        J j11 = view instanceof J ? (J) view : null;
        if (j11 != null) {
            j11.setEmojiCompatEnabled(false);
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (descendantsViaRecursion = descendantsViaRecursion(viewGroup)) == null) {
            return;
        }
        for (KeyEvent.Callback callback : descendantsViaRecursion) {
            J j12 = callback instanceof J ? (J) callback : null;
            if (j12 != null) {
                j12.setEmojiCompatEnabled(false);
            }
        }
    }

    private static final void internalDescendantsViaRecursion(ViewGroup viewGroup, List<View> list) {
        list.add(viewGroup);
        Iterator<View> it = C5316f0.b(viewGroup).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            if (view instanceof ViewGroup) {
                internalDescendantsViaRecursion((ViewGroup) view, list);
            } else {
                list.add(view);
            }
        }
    }
}
