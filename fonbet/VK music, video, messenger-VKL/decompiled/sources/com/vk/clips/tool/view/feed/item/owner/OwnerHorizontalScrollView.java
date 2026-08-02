package com.vk.clips.tool.view.feed.item.owner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.HorizontalScrollView;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import xsna.xq;

/* compiled from: OwnerHorizontalScrollView.kt */
/* loaded from: classes17.dex */
public final class OwnerHorizontalScrollView extends HorizontalScrollView {
    public final int b;
    public final LinkedList<a> c;

    /* compiled from: OwnerHorizontalScrollView.kt */
    public static final class a {
        public final int a;
        public final float b;

        public a(int i, float f) {
            this.a = i;
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OwnerScrollEvent(action=");
            sb.append(this.a);
            sb.append(", x=");
            return xq.c(')', this.b, sb);
        }
    }

    /* compiled from: OwnerHorizontalScrollView.kt */
    public interface b {
    }

    public OwnerHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = new LinkedList<>();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object obj = null;
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        LinkedList<a> linkedList = this.c;
        if (valueOf != null && valueOf.intValue() == 0) {
            linkedList.clear();
            linkedList.addLast(new a(motionEvent.getAction(), motionEvent.getX()));
        } else if (valueOf != null && valueOf.intValue() == 2) {
            linkedList.addLast(new a(motionEvent.getAction(), motionEvent.getX()));
        } else if (valueOf != null && valueOf.intValue() == 1 && (linkedList.size() != 1 || linkedList.get(0).a != 0)) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((a) next).a == 2) {
                    obj = next;
                    break;
                }
            }
            a aVar = (a) obj;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : linkedList) {
                if (((a) obj2).a == 2) {
                    arrayList.add(obj2);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next2 = it2.next();
            if (it2.hasNext()) {
                float f = ((a) next2).b;
                do {
                    Object next3 = it2.next();
                    float f2 = ((a) next3).b;
                    if (Float.compare(f, f2) < 0) {
                        next2 = next3;
                        f = f2;
                    }
                } while (it2.hasNext());
            }
            a aVar2 = (a) next2;
            Iterator it3 = arrayList.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next4 = it3.next();
            if (it3.hasNext()) {
                float f3 = ((a) next4).b;
                do {
                    Object next5 = it3.next();
                    float f4 = ((a) next5).b;
                    if (Float.compare(f3, f4) > 0) {
                        next4 = next5;
                        f3 = f4;
                    }
                } while (it3.hasNext());
            }
            a aVar3 = (a) next4;
            if (aVar == null) {
                L.e("OwnerHorizontalScrollView", "В метод handleActionUp передан некорректный список " + linkedList);
            } else {
                float f5 = aVar.b;
                if (Math.abs(aVar2.b - f5) <= this.b) {
                    Math.abs(aVar3.b - f5);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setOwnerScrollListener(b bVar) {
    }
}
