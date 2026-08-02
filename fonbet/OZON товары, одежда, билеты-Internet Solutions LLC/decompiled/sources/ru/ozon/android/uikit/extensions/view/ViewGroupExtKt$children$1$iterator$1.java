package ru.ozon.android.uikit.extensions.view;

import android.view.View;
import android.view.ViewGroup;
import gd.InterfaceC6712a;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"ru/ozon/android/uikit/extensions/view/ViewGroupExtKt$children$1$iterator$1", "", "Landroid/view/View;", "", "hasNext", "()Z", "kotlin.jvm.PlatformType", "next", "()Landroid/view/View;", "", "index", "I", "getIndex", "()I", "setIndex", "(I)V", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ViewGroupExtKt$children$1$iterator$1 implements Iterator<View>, InterfaceC6712a {
    final /* synthetic */ ViewGroup $this_children;
    private int index;

    ViewGroupExtKt$children$1$iterator$1(ViewGroup viewGroup) {
        this.$this_children = viewGroup;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.$this_children.getChildCount();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public View next() {
        ViewGroup viewGroup = this.$this_children;
        int i11 = this.index;
        this.index = i11 + 1;
        return viewGroup.getChildAt(i11);
    }
}
