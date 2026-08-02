package androidx.credentials.webauthn;

import androidx.credentials.webauthn.Cbor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.emb;
import xsna.epx;
import xsna.j5g;
import xsna.jw5;
import xsna.pn00;
import xsna.rl3;
import xsna.swe0;
import xsna.vq;
import xsna.vu5;

/* compiled from: Cbor.kt */
/* loaded from: classes12.dex */
public final class Cbor {
    private final int TYPE_UNSIGNED_INT;
    private final int TYPE_NEGATIVE_INT = 1;
    private final int TYPE_BYTE_STRING = 2;
    private final int TYPE_TEXT_STRING = 3;
    private final int TYPE_ARRAY = 4;
    private final int TYPE_MAP = 5;
    private final int TYPE_TAG = 6;
    private final int TYPE_FLOAT = 7;

    /* compiled from: Cbor.kt */
    public static final class Arg {
        private final long arg;
        private final int len;

        public Arg(long j, int i) {
            this.arg = j;
            this.len = i;
        }

        public static /* synthetic */ Arg copy$default(Arg arg, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = arg.arg;
            }
            if ((i2 & 2) != 0) {
                i = arg.len;
            }
            return arg.copy(j, i);
        }

        public final long component1() {
            return this.arg;
        }

        public final int component2() {
            return this.len;
        }

        public final Arg copy(long j, int i) {
            return new Arg(j, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Arg)) {
                return false;
            }
            Arg arg = (Arg) obj;
            return this.arg == arg.arg && this.len == arg.len;
        }

        public final long getArg() {
            return this.arg;
        }

        public final int getLen() {
            return this.len;
        }

        public int hashCode() {
            return Integer.hashCode(this.len) + (Long.hashCode(this.arg) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Arg(arg=");
            sb.append(this.arg);
            sb.append(", len=");
            return vu5.b(sb, this.len, ')');
        }
    }

    /* compiled from: Cbor.kt */
    public static final class Item {
        private final Object item;
        private final int len;

        public Item(Object obj, int i) {
            this.item = obj;
            this.len = i;
        }

        public static /* synthetic */ Item copy$default(Item item, Object obj, int i, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = item.item;
            }
            if ((i2 & 2) != 0) {
                i = item.len;
            }
            return item.copy(obj, i);
        }

        public final Object component1() {
            return this.item;
        }

        public final int component2() {
            return this.len;
        }

        public final Item copy(Object obj, int i) {
            return new Item(obj, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return epx.f(this.item, item.item) && this.len == item.len;
        }

        public final Object getItem() {
            return this.item;
        }

        public final int getLen() {
            return this.len;
        }

        public int hashCode() {
            return Integer.hashCode(this.len) + (this.item.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Item(item=");
            sb.append(this.item);
            sb.append(", len=");
            return vu5.b(sb, this.len, ')');
        }
    }

    private final byte[] createArg(int i, long j) {
        int i2 = i << 5;
        int i3 = (int) j;
        if (j < 24) {
            return new byte[]{(byte) ((i2 | i3) & 255)};
        }
        if (j <= 255) {
            return new byte[]{(byte) ((i2 | 24) & 255), (byte) (i3 & 255)};
        }
        if (j <= 65535) {
            return new byte[]{(byte) ((i2 | 25) & 255), (byte) ((i3 >> 8) & 255), (byte) (i3 & 255)};
        }
        if (j <= 4294967295L) {
            return new byte[]{(byte) ((i2 | 26) & 255), (byte) ((i3 >> 24) & 255), (byte) ((i3 >> 16) & 255), (byte) ((i3 >> 8) & 255), (byte) (i3 & 255)};
        }
        throw new IllegalArgumentException("bad Arg");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int encode$lambda$0(Ref$ObjectRef ref$ObjectRef, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = (byte[]) ((Map) ref$ObjectRef.element).get(bArr);
        byte[] bArr4 = (byte[]) ((Map) ref$ObjectRef.element).get(bArr2);
        if (bArr.length > bArr2.length) {
            return 1;
        }
        if (bArr.length < bArr2.length) {
            return -1;
        }
        if (bArr3.length > bArr4.length) {
            return 1;
        }
        return bArr3.length < bArr4.length ? -1 : 0;
    }

    private final Arg getArg(byte[] bArr, int i) {
        long j = bArr[i] & 31;
        if (j < 24) {
            return new Arg(j, 1);
        }
        if (j == 24) {
            return new Arg(bArr[i + 1] & 255, 2);
        }
        if (j == 25) {
            return new Arg((bArr[i + 2] & 255) | ((bArr[i + 1] & 255) << 8), 3);
        }
        if (j != 26) {
            throw new IllegalArgumentException("Bad arg");
        }
        return new Arg((bArr[i + 4] & 255) | ((bArr[i + 1] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 8), 5);
    }

    private final int getType(byte[] bArr, int i) {
        return (bArr[i] & 255) >> 5;
    }

    private final Item parseItem(byte[] bArr, int i) {
        int type = getType(bArr, i);
        Arg arg = getArg(bArr, i);
        StringBuilder a = vq.a("Type ", type, ' ');
        a.append(arg.getArg());
        a.append(' ');
        a.append(arg.getLen());
        System.out.println((Object) a.toString());
        if (type == this.TYPE_UNSIGNED_INT) {
            return new Item(Long.valueOf(arg.getArg()), arg.getLen());
        }
        if (type == this.TYPE_NEGATIVE_INT) {
            return new Item(Long.valueOf((-1) - arg.getArg()), arg.getLen());
        }
        if (type == this.TYPE_BYTE_STRING) {
            return new Item(rl3.l0(bArr, swe0.q(arg.getLen() + i, arg.getLen() + i + ((int) arg.getArg()))), arg.getLen() + ((int) arg.getArg()));
        }
        if (type == this.TYPE_TEXT_STRING) {
            return new Item(new String(rl3.l0(bArr, swe0.q(arg.getLen() + i, arg.getLen() + i + ((int) arg.getArg()))), emb.b), arg.getLen() + ((int) arg.getArg()));
        }
        int i2 = 0;
        if (type == this.TYPE_ARRAY) {
            ArrayList arrayList = new ArrayList();
            int len = arg.getLen();
            int arg2 = (int) arg.getArg();
            while (i2 < arg2) {
                Item parseItem = parseItem(bArr, i + len);
                arrayList.add(parseItem.getItem());
                len += parseItem.getLen();
                i2++;
            }
            return new Item(j5g.O0(arrayList), len);
        }
        if (type != this.TYPE_MAP) {
            throw new IllegalArgumentException("Bad type");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int len2 = arg.getLen();
        int arg3 = (int) arg.getArg();
        while (i2 < arg3) {
            Item parseItem2 = parseItem(bArr, i + len2);
            int len3 = parseItem2.getLen() + len2;
            Item parseItem3 = parseItem(bArr, i + len3);
            int len4 = len3 + parseItem3.getLen();
            linkedHashMap.put(parseItem2.getItem(), parseItem3.getItem());
            i2++;
            len2 = len4;
        }
        return new Item(pn00.t(linkedHashMap), len2);
    }

    public final Object decode(byte[] bArr) {
        return parseItem(bArr, 0).getItem();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.LinkedHashMap] */
    public final byte[] encode(Object obj) {
        if (obj instanceof Number) {
            if (obj instanceof Double) {
                throw new IllegalArgumentException("Don't support doubles yet");
            }
            long longValue = ((Number) obj).longValue();
            return longValue >= 0 ? createArg(this.TYPE_UNSIGNED_INT, longValue) : createArg(this.TYPE_NEGATIVE_INT, (-1) - longValue);
        }
        if (obj instanceof byte[]) {
            return jw5.x(createArg(this.TYPE_BYTE_STRING, r6.length), (byte[]) obj);
        }
        if (obj instanceof String) {
            return jw5.x(createArg(this.TYPE_TEXT_STRING, r6.length()), ((String) obj).getBytes(emb.b));
        }
        if (obj instanceof List) {
            byte[] createArg = createArg(this.TYPE_ARRAY, r6.size());
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                createArg = jw5.x(createArg, encode(it.next()));
            }
            return createArg;
        }
        if (!(obj instanceof Map)) {
            throw new IllegalArgumentException("Bad type");
        }
        byte[] createArg2 = createArg(this.TYPE_MAP, r6.size());
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            ((Map) ref$ObjectRef.element).put(encode(entry.getKey()), encode(entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(((Map) ref$ObjectRef.element).keySet());
        j5g.D0(new Comparator() { // from class: xsna.qla
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                int encode$lambda$0;
                encode$lambda$0 = Cbor.encode$lambda$0(Ref$ObjectRef.this, (byte[]) obj2, (byte[]) obj3);
                return encode$lambda$0;
            }
        }, arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            createArg2 = jw5.x(jw5.x(createArg2, bArr), (byte[]) ((Map) ref$ObjectRef.element).get(bArr));
        }
        return createArg2;
    }

    public final int getTYPE_ARRAY() {
        return this.TYPE_ARRAY;
    }

    public final int getTYPE_BYTE_STRING() {
        return this.TYPE_BYTE_STRING;
    }

    public final int getTYPE_FLOAT() {
        return this.TYPE_FLOAT;
    }

    public final int getTYPE_MAP() {
        return this.TYPE_MAP;
    }

    public final int getTYPE_NEGATIVE_INT() {
        return this.TYPE_NEGATIVE_INT;
    }

    public final int getTYPE_TAG() {
        return this.TYPE_TAG;
    }

    public final int getTYPE_TEXT_STRING() {
        return this.TYPE_TEXT_STRING;
    }

    public final int getTYPE_UNSIGNED_INT() {
        return this.TYPE_UNSIGNED_INT;
    }
}
