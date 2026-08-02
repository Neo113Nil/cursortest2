package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.b;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f67139a = new int[2];

    static io.sentry.internal.gestures.b a(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull View view, float f7, float f11, b.a aVar) {
        List<io.sentry.internal.gestures.a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        io.sentry.internal.gestures.b bVar = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (view2 != null) {
                int[] iArr = f67139a;
                view2.getLocationOnScreen(iArr);
                int i11 = iArr[0];
                int i12 = iArr[1];
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (f7 >= i11 && f7 <= i11 + width && f11 >= i12 && f11 <= i12 + height) {
                    if (view2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view2;
                        for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                            linkedList.add(viewGroup.getChildAt(i13));
                        }
                    }
                    for (int i14 = 0; i14 < gestureTargetLocators.size(); i14++) {
                        io.sentry.internal.gestures.b a11 = gestureTargetLocators.get(i14).a(view2, aVar);
                        if (a11 != null) {
                            if (aVar == b.a.CLICKABLE) {
                                bVar = a11;
                            } else if (aVar == b.a.SCROLLABLE) {
                                return a11;
                            }
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public static String b(@NotNull View view) throws Resources.NotFoundException {
        int id2 = view.getId();
        if (id2 == -1 || (((-16777216) & id2) == 0 && (16777215 & id2) != 0)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id2) : "";
    }
}
