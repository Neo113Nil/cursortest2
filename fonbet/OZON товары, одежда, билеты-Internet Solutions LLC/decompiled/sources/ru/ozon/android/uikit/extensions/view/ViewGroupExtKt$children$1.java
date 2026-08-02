package ru.ozon.android.uikit.extensions.view;

import android.view.View;
import android.view.ViewGroup;
import gd.InterfaceC6712a;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0002\u0000\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"ru/ozon/android/uikit/extensions/view/ViewGroupExtKt$children$1", "", "Landroid/view/View;", "iterator", "ru/ozon/android/uikit/extensions/view/ViewGroupExtKt$children$1$iterator$1", "()Lru/ozon/android/uikit/extensions/view/ViewGroupExtKt$children$1$iterator$1;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ViewGroupExtKt$children$1 implements Iterable<View>, InterfaceC6712a {
    final /* synthetic */ ViewGroup $this_children;

    ViewGroupExtKt$children$1(ViewGroup viewGroup) {
        this.$this_children = viewGroup;
    }

    @Override // java.lang.Iterable
    public Iterator<View> iterator() {
        return new ViewGroupExtKt$children$1$iterator$1(this.$this_children);
    }
}
