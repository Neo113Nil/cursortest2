package ng;

import g.C6594f;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes10.dex */
public final class c extends i {

    /* renamed from: c, reason: collision with root package name */
    private List<String> f77115c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentSkipListMap f77116d = new ConcurrentSkipListMap();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f77117a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f77118b;

        /* renamed from: c, reason: collision with root package name */
        private final short[] f77119c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicReferenceArray<Object> f77120d;

        a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f77120d = atomicReferenceArray;
            this.f77117a = str;
            this.f77118b = strArr;
            this.f77119c = sArr;
        }

        final f b(String str) {
            int binarySearch = Arrays.binarySearch(this.f77118b, str);
            if (binarySearch < 0) {
                return null;
            }
            try {
                short s11 = this.f77119c[binarySearch];
                AtomicReferenceArray<Object> atomicReferenceArray = this.f77120d;
                Object obj = atomicReferenceArray.get(s11);
                if (obj instanceof byte[]) {
                    obj = C8592a.a(new DataInputStream(new ByteArrayInputStream((byte[]) obj)));
                    atomicReferenceArray.set(s11, obj);
                }
                return (f) obj;
            } catch (Exception e11) {
                StringBuilder b11 = C6594f.b("Invalid binary time-zone data: TZDB:", str, ", version: ");
                b11.append(this.f77117a);
                throw new g(b11.toString(), e11);
            }
        }

        public final String toString() {
            return this.f77117a;
        }
    }

    public c(InputStream inputStream) {
        new CopyOnWriteArraySet();
        try {
            e(inputStream);
        } catch (Exception e11) {
            throw new g("Unable to load TZDB time-zone rules", e11);
        }
    }

    private void e(InputStream inputStream) throws IOException, StreamCorruptedException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new StreamCorruptedException("File format not recognised");
        }
        if (!"TZDB".equals(dataInputStream.readUTF())) {
            throw new StreamCorruptedException("File format not recognised");
        }
        int readShort = dataInputStream.readShort();
        String[] strArr = new String[readShort];
        for (int i11 = 0; i11 < readShort; i11++) {
            strArr[i11] = dataInputStream.readUTF();
        }
        int readShort2 = dataInputStream.readShort();
        String[] strArr2 = new String[readShort2];
        for (int i12 = 0; i12 < readShort2; i12++) {
            strArr2[i12] = dataInputStream.readUTF();
        }
        this.f77115c = Arrays.asList(strArr2);
        int readShort3 = dataInputStream.readShort();
        Object[] objArr = new Object[readShort3];
        for (int i13 = 0; i13 < readShort3; i13++) {
            byte[] bArr = new byte[dataInputStream.readShort()];
            dataInputStream.readFully(bArr);
            objArr[i13] = bArr;
        }
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
        HashSet hashSet = new HashSet(readShort);
        for (int i14 = 0; i14 < readShort; i14++) {
            int readShort4 = dataInputStream.readShort();
            String[] strArr3 = new String[readShort4];
            short[] sArr = new short[readShort4];
            for (int i15 = 0; i15 < readShort4; i15++) {
                strArr3[i15] = strArr2[dataInputStream.readShort()];
                sArr[i15] = dataInputStream.readShort();
            }
            hashSet.add(new a(strArr[i14], strArr3, sArr, atomicReferenceArray));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            a aVar2 = (a) this.f77116d.putIfAbsent(aVar.f77117a, aVar);
            if (aVar2 != null && !aVar2.f77117a.equals(aVar.f77117a)) {
                throw new g("Data already loaded for TZDB time-zone rules version: " + aVar.f77117a);
            }
        }
    }

    @Override // ng.i
    protected final f b(String str) {
        lg.c.e(str, "zoneId");
        f b11 = ((a) this.f77116d.lastEntry().getValue()).b(str);
        if (b11 != null) {
            return b11;
        }
        throw new g("Unknown time-zone ID: ".concat(str));
    }

    @Override // ng.i
    protected final HashSet c() {
        return new HashSet(this.f77115c);
    }

    public final String toString() {
        return "TZDB";
    }
}
