package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.LazyStringArrayList;
import java.util.AbstractList;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wsa extends AbstractList implements RandomAccess {
    public final /* synthetic */ int a;
    public final LazyStringArrayList b;

    public /* synthetic */ wsa(LazyStringArrayList lazyStringArrayList, int i) {
        this.a = i;
        this.b = lazyStringArrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.a;
        LazyStringArrayList lazyStringArrayList = this.b;
        switch (i2) {
            case 0:
                lazyStringArrayList.add(i, (byte[]) obj);
                ((AbstractList) this).modCount++;
                break;
            default:
                lazyStringArrayList.add(i, (ByteString) obj);
                ((AbstractList) this).modCount++;
                break;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        LazyStringArrayList lazyStringArrayList = this.b;
        switch (i2) {
            case 0:
                return lazyStringArrayList.getByteArray(i);
            default:
                return lazyStringArrayList.getByteString(i);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        byte[] asByteArray;
        ByteString asByteString;
        int i2 = this.a;
        LazyStringArrayList lazyStringArrayList = this.b;
        switch (i2) {
            case 0:
                String remove = lazyStringArrayList.remove(i);
                ((AbstractList) this).modCount++;
                asByteArray = LazyStringArrayList.asByteArray(remove);
                return asByteArray;
            default:
                String remove2 = lazyStringArrayList.remove(i);
                ((AbstractList) this).modCount++;
                asByteString = LazyStringArrayList.asByteString(remove2);
                return asByteString;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object andReturn;
        byte[] asByteArray;
        Object andReturn2;
        ByteString asByteString;
        int i2 = this.a;
        LazyStringArrayList lazyStringArrayList = this.b;
        switch (i2) {
            case 0:
                andReturn = lazyStringArrayList.setAndReturn(i, (byte[]) obj);
                ((AbstractList) this).modCount++;
                asByteArray = LazyStringArrayList.asByteArray(andReturn);
                return asByteArray;
            default:
                andReturn2 = lazyStringArrayList.setAndReturn(i, (ByteString) obj);
                ((AbstractList) this).modCount++;
                asByteString = LazyStringArrayList.asByteString(andReturn2);
                return asByteString;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i = this.a;
        LazyStringArrayList lazyStringArrayList = this.b;
        switch (i) {
        }
        return lazyStringArrayList.size();
    }
}
