package com.google.protobuf;

import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j implements Comparator {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.ByteString$ByteIterator, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.protobuf.ByteString$ByteIterator, java.util.Iterator] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        ByteString byteString = (ByteString) obj;
        ByteString byteString2 = (ByteString) obj2;
        ?? iterator2 = byteString.iterator2();
        ?? iterator22 = byteString2.iterator2();
        while (iterator2.hasNext() && iterator22.hasNext()) {
            i = ByteString.toInt(iterator2.nextByte());
            Integer valueOf = Integer.valueOf(i);
            i2 = ByteString.toInt(iterator22.nextByte());
            int compareTo = valueOf.compareTo(Integer.valueOf(i2));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(byteString.size()).compareTo(Integer.valueOf(byteString2.size()));
    }
}
