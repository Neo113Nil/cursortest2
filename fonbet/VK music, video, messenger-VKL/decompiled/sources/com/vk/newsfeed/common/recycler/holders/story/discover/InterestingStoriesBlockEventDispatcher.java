package com.vk.newsfeed.common.recycler.holders.story.discover;

import com.vk.log.L;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.aex;
import xsna.ydx;

/* compiled from: InterestingStoriesBlockEventDispatcher.kt */
/* loaded from: classes4.dex */
public final class InterestingStoriesBlockEventDispatcher extends CopyOnWriteArraySet<ydx> {
    private Integer directionOfTransition;
    private aex.a focusedItem;
    private Integer focusedPosition;
    private aex.a previousFocusedItem;
    private Integer previousFocusedPosition;

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof ydx) {
            return super.contains((ydx) obj);
        }
        return false;
    }

    public final Integer d() {
        return this.directionOfTransition;
    }

    public final aex.a g() {
        return this.focusedItem;
    }

    public final aex.a h() {
        return this.previousFocusedItem;
    }

    public final void i(aex.a aVar, Integer num) {
        this.previousFocusedItem = this.focusedItem;
        this.previousFocusedPosition = this.focusedPosition;
        this.focusedItem = aVar;
        Iterator<ydx> it = iterator();
        while (it.hasNext()) {
            try {
                it.next().F4();
            } catch (Throwable th) {
                L.i(th);
            }
        }
        this.focusedPosition = num;
        Integer num2 = this.previousFocusedPosition;
        if (num2 == null || num == null) {
            return;
        }
        this.directionOfTransition = Integer.valueOf(num.intValue() - num2.intValue());
    }

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof ydx) {
            return super.remove((ydx) obj);
        }
        return false;
    }
}
