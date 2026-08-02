package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.va, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552va extends C2 {

    /* renamed from: b, reason: collision with root package name */
    public final C0477sa f14785b;

    /* renamed from: c, reason: collision with root package name */
    public final C0477sa f14786c;

    /* renamed from: d, reason: collision with root package name */
    public final C0527ua f14787d;

    public C0552va(int i5, int i10, int i11) {
        this(i5, new C0477sa(i10), new C0477sa(i11));
    }

    public C0552va(int i5, @NonNull C0477sa c0477sa, @NonNull C0477sa c0477sa2) {
        super(i5);
        this.f14787d = new C0527ua();
        this.f14785b = c0477sa;
        this.f14786c = c0477sa2;
    }

    @Override // io.appmetrica.analytics.impl.C2, io.appmetrica.analytics.impl.InterfaceC0502ta
    @NonNull
    public final Mn a(Map<String, String> map) {
        HashMap hashMap;
        int i5;
        int i10 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.f14787d);
            int length = entryArr.length;
            i5 = 0;
            int i11 = 0;
            boolean z5 = false;
            int i12 = 0;
            while (i10 < length) {
                Map.Entry entry = entryArr[i10];
                Mn a7 = this.f14785b.a((String) entry.getKey());
                Mn a10 = this.f14786c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) a10.f12615a) + StringUtils.getUtf8BytesLength((String) a7.f12615a);
                if (z5 || utf8BytesLength2 + i12 > this.f12097a) {
                    i11++;
                    i5 += utf8BytesLength;
                    z5 = true;
                } else {
                    i5 = a10.f12616b.getBytesTruncated() + a7.f12616b.getBytesTruncated() + i5;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) a10.f12615a) + StringUtils.getUtf8BytesLength((String) a7.f12615a) + i12;
                    hashMap.put((String) a7.f12615a, (String) a10.f12615a);
                    i12 = utf8BytesLength3;
                }
                i10++;
            }
            i10 = i11;
        } else {
            hashMap = null;
            i5 = 0;
        }
        return new Mn(hashMap, new C0347n4(i10, i5));
    }
}
