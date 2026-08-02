package com.socure.docv.capturesdk.common.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Screen.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u00010\u0002j\b\u0012\u0004\u0012\u00020\u0001`\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u0005*\u0012\u0012\u0004\u0012\u00020\u00010\u0002j\b\u0012\u0004\u0012\u00020\u0001`\u0003¨\u0006\u0006"}, d2 = {"getCurrent", "Lcom/socure/docv/capturesdk/common/utils/Screen;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isComplete", "", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScreenKt {
    public static final Screen getCurrent(ArrayList<Screen> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        for (Screen screen : arrayList) {
            if (screen.getState() == State.INCOMPLETE) {
                return screen;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final boolean isComplete(ArrayList<Screen> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        ArrayList<Screen> arrayList2 = arrayList;
        if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
            return true;
        }
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            if (((Screen) it.next()).getState() == State.INCOMPLETE) {
                return false;
            }
        }
        return true;
    }
}
