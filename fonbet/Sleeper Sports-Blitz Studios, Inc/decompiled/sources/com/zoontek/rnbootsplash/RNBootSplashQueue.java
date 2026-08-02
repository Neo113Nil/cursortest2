package com.zoontek.rnbootsplash;

import androidx.exifinterface.media.ExifInterface;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Vector;
import kotlin.Metadata;

/* compiled from: RNBootSplashQueue.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/zoontek/rnbootsplash/RNBootSplashQueue;", ExifInterface.LONGITUDE_EAST, "Ljava/util/Vector;", "<init>", "()V", "shift", "()Ljava/lang/Object;", MetricTracker.Place.PUSH, "", "item", "(Ljava/lang/Object;)V", "react-native-bootsplash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RNBootSplashQueue<E> extends Vector<E> {
    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return (E) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public final synchronized E shift() {
        if (size() == 0) {
            return null;
        }
        E elementAt = elementAt(0);
        removeElementAt(0);
        return elementAt;
    }

    public final void push(E item) {
        addElement(item);
    }
}
