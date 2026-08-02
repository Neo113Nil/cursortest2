package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.LinkedList;
import java.util.List;
import k2.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f15659a = new int[2];

    public static io.sentry.internal.gestures.b a(SentryAndroidOptions sentryAndroidOptions, View view, float f6, float f10, io.sentry.internal.gestures.a aVar) {
        io.sentry.internal.gestures.b bVar;
        List<a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        io.sentry.internal.gestures.b bVar2 = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (view2 != null) {
                int[] iArr = f15659a;
                view2.getLocationOnScreen(iArr);
                int i5 = iArr[0];
                int i10 = iArr[1];
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (f6 >= i5 && f6 <= i5 + width && f10 >= i10 && f10 <= i10 + height) {
                    if (view2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view2;
                        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                            linkedList.add(viewGroup.getChildAt(i11));
                        }
                    }
                    for (int i12 = 0; i12 < gestureTargetLocators.size(); i12++) {
                        a aVar2 = gestureTargetLocators.get(i12);
                        aVar2.getClass();
                        if (aVar == io.sentry.internal.gestures.a.CLICKABLE && view2.isClickable() && view2.getVisibility() == 0) {
                            try {
                                bVar = new io.sentry.internal.gestures.b(view2, x.q(view2), b(view2));
                            } catch (Resources.NotFoundException unused) {
                            }
                        } else {
                            if (aVar == io.sentry.internal.gestures.a.SCROLLABLE) {
                                if (((!((Boolean) aVar2.f15639a.a()).booleanValue() ? false : ScrollingView.class.isAssignableFrom(view2.getClass())) || AbsListView.class.isAssignableFrom(view2.getClass()) || ScrollView.class.isAssignableFrom(view2.getClass())) && view2.getVisibility() == 0) {
                                    bVar = new io.sentry.internal.gestures.b(view2, x.q(view2), b(view2));
                                }
                            }
                            bVar = null;
                        }
                        if (bVar != null) {
                            if (aVar == io.sentry.internal.gestures.a.CLICKABLE) {
                                bVar2 = bVar;
                            } else if (aVar == io.sentry.internal.gestures.a.SCROLLABLE) {
                                return bVar;
                            }
                        }
                    }
                }
            }
        }
        return bVar2;
    }

    public static String b(View view) {
        int id2 = view.getId();
        if (id2 == -1 || (((-16777216) & id2) == 0 && (16777215 & id2) != 0)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id2) : "";
    }
}
