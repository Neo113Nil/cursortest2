package com.google.protobuf;

import com.google.protobuf.C5961l;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes9.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private Object[] entries;
    private int entriesSize;
    private boolean isImmutable;
    private volatile SmallSortedMap<K, V>.d lazyEntrySet;
    private Map<K, V> overflowEntries;
    private Map<K, V> overflowEntriesDescending;

    private class DescendingEntrySet extends SmallSortedMap<K, V>.d {
        private DescendingEntrySet() {
            super();
        }

        @Override // com.google.protobuf.SmallSortedMap.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }
    }

    private class a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f60161a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f60162b;

        a() {
            this.f60161a = SmallSortedMap.this.entriesSize;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f60162b == null) {
                this.f60162b = SmallSortedMap.this.overflowEntriesDescending.entrySet().iterator();
            }
            return this.f60162b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i11 = this.f60161a;
            return (i11 > 0 && i11 <= SmallSortedMap.this.entriesSize) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            Object[] objArr = SmallSortedMap.this.entries;
            int i11 = this.f60161a - 1;
            this.f60161a = i11;
            return (b) objArr[i11];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class b implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.b> {

        /* renamed from: a, reason: collision with root package name */
        private final K f60164a;

        /* renamed from: b, reason: collision with root package name */
        private V f60165b;

        b() {
            throw null;
        }

        b(K k11, V v11) {
            this.f60164a = k11;
            this.f60165b = v11;
        }

        public final K a() {
            return this.f60164a;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f60164a.compareTo(((b) obj).f60164a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k11 = this.f60164a;
                    if (k11 == null ? key == null : k11.equals(key)) {
                        V v11 = this.f60165b;
                        Object value = entry.getValue();
                        if (v11 == null ? value == null : v11.equals(value)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f60164a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f60165b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k11 = this.f60164a;
            int hashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f60165b;
            return (v11 != null ? v11.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v11) {
            SmallSortedMap.this.checkMutable();
            V v12 = this.f60165b;
            this.f60165b = v11;
            return v12;
        }

        public final String toString() {
            return this.f60164a + "=" + this.f60165b;
        }
    }

    private class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f60167a = -1;

        /* renamed from: b, reason: collision with root package name */
        private boolean f60168b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f60169c;

        c() {
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f60169c == null) {
                this.f60169c = SmallSortedMap.this.overflowEntries.entrySet().iterator();
            }
            return this.f60169c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i11 = this.f60167a + 1;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i11 < smallSortedMap.entriesSize || (!smallSortedMap.overflowEntries.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f60168b = true;
            int i11 = this.f60167a + 1;
            this.f60167a = i11;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i11 < smallSortedMap.entriesSize ? (b) smallSortedMap.entries[this.f60167a] : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f60168b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f60168b = false;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            smallSortedMap.checkMutable();
            if (this.f60167a >= smallSortedMap.entriesSize) {
                a().remove();
                return;
            }
            int i11 = this.f60167a;
            this.f60167a = i11 - 1;
            smallSortedMap.removeArrayEntryAt(i11);
        }
    }

    private class d extends AbstractSet<Map.Entry<K, V>> {
        private d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            SmallSortedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return SmallSortedMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((SmallSortedMap) entry.getKey(), (K) entry.getValue());
            return true;
        }
    }

    private int binarySearchInArray(K k11) {
        int i11;
        int i12 = this.entriesSize;
        int i13 = i12 - 1;
        if (i13 >= 0) {
            int compareTo = k11.compareTo(((b) this.entries[i13]).a());
            if (compareTo > 0) {
                i11 = i12 + 1;
                return -i11;
            }
            if (compareTo == 0) {
                return i13;
            }
        }
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) / 2;
            int compareTo2 = k11.compareTo(((b) this.entries[i15]).a());
            if (compareTo2 < 0) {
                i13 = i15 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i15;
                }
                i14 = i15 + 1;
            }
        }
        i11 = i14 + 1;
        return -i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (this.isImmutable) {
            throw new UnsupportedOperationException();
        }
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (this.entries == null) {
            this.entries = new Object[16];
        }
    }

    private SortedMap<K, V> getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.overflowEntries = treeMap;
            this.overflowEntriesDescending = treeMap.descendingMap();
        }
        return (SortedMap) this.overflowEntries;
    }

    static <FieldDescriptorT extends C5961l.b<FieldDescriptorT>> SmallSortedMap<FieldDescriptorT, Object> newFieldMap() {
        return (SmallSortedMap<FieldDescriptorT, Object>) new SmallSortedMap<FieldDescriptorT, Object>() { // from class: com.google.protobuf.SmallSortedMap.1
            @Override // com.google.protobuf.SmallSortedMap
            public void makeImmutable() {
                if (!isImmutable()) {
                    for (int i11 = 0; i11 < getNumArrayEntries(); i11++) {
                        Map.Entry<FieldDescriptorT, Object> arrayEntryAt = getArrayEntryAt(i11);
                        if (((C5961l.b) arrayEntryAt.getKey()).isRepeated()) {
                            arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                        }
                    }
                    for (Map.Entry<FieldDescriptorT, Object> entry : getOverflowEntries()) {
                        if (((C5961l.b) entry.getKey()).isRepeated()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.makeImmutable();
            }

            @Override // com.google.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((AnonymousClass1<FieldDescriptorT>) obj, (Comparable) obj2);
            }
        };
    }

    static <K extends Comparable<K>, V> SmallSortedMap<K, V> newInstanceForTest() {
        return new SmallSortedMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeArrayEntryAt(int i11) {
        checkMutable();
        V v11 = (V) ((b) this.entries[i11]).getValue();
        Object[] objArr = this.entries;
        System.arraycopy(objArr, i11 + 1, objArr, i11, (this.entriesSize - i11) - 1);
        this.entriesSize--;
        if (!this.overflowEntries.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = getOverflowEntriesMutable().entrySet().iterator();
            Object[] objArr2 = this.entries;
            int i12 = this.entriesSize;
            Map.Entry<K, V> next = it.next();
            objArr2[i12] = new b(next.getKey(), next.getValue());
            this.entriesSize++;
            it.remove();
        }
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (this.entriesSize != 0) {
            this.entries = null;
            this.entriesSize = 0;
        }
        if (this.overflowEntries.isEmpty()) {
            return;
        }
        this.overflowEntries.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return binarySearchInArray(comparable) >= 0 || this.overflowEntries.containsKey(comparable);
    }

    Set<Map.Entry<K, V>> descendingEntrySet() {
        return new DescendingEntrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new d();
        }
        return this.lazyEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size != smallSortedMap.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != smallSortedMap.getNumArrayEntries()) {
            return entrySet().equals(smallSortedMap.entrySet());
        }
        for (int i11 = 0; i11 < numArrayEntries; i11++) {
            if (!getArrayEntryAt(i11).equals(smallSortedMap.getArrayEntryAt(i11))) {
                return false;
            }
        }
        if (numArrayEntries != size) {
            return this.overflowEntries.equals(smallSortedMap.overflowEntries);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        return binarySearchInArray >= 0 ? (V) ((b) this.entries[binarySearchInArray]).getValue() : this.overflowEntries.get(comparable);
    }

    public Map.Entry<K, V> getArrayEntryAt(int i11) {
        if (i11 < this.entriesSize) {
            return (b) this.entries[i11];
        }
        throw new ArrayIndexOutOfBoundsException(i11);
    }

    public int getNumArrayEntries() {
        return this.entriesSize;
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public Iterable<Map.Entry<K, V>> getOverflowEntries() {
        return this.overflowEntries.isEmpty() ? Collections.EMPTY_SET : this.overflowEntries.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int i11 = 0;
        for (int i12 = 0; i12 < numArrayEntries; i12++) {
            i11 += this.entries[i12].hashCode();
        }
        return getNumOverflowEntries() > 0 ? this.overflowEntries.hashCode() + i11 : i11;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        this.overflowEntries = this.overflowEntries.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.overflowEntries);
        this.overflowEntriesDescending = this.overflowEntriesDescending.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.overflowEntriesDescending);
        this.isImmutable = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((SmallSortedMap<K, V>) obj, (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        checkMutable();
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return (V) removeArrayEntryAt(binarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.overflowEntries.size() + this.entriesSize;
    }

    private SmallSortedMap() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.overflowEntries = map;
        this.overflowEntriesDescending = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V put(K k11, V v11) {
        checkMutable();
        int binarySearchInArray = binarySearchInArray(k11);
        if (binarySearchInArray >= 0) {
            return (V) ((b) this.entries[binarySearchInArray]).setValue(v11);
        }
        ensureEntryArrayMutable();
        int i11 = -(binarySearchInArray + 1);
        if (i11 >= 16) {
            return getOverflowEntriesMutable().put(k11, v11);
        }
        int i12 = this.entriesSize;
        if (i12 == 16) {
            b bVar = (b) this.entries[15];
            this.entriesSize = i12 - 1;
            getOverflowEntriesMutable().put(bVar.a(), bVar.getValue());
        }
        Object[] objArr = this.entries;
        System.arraycopy(objArr, i11, objArr, i11 + 1, (objArr.length - i11) - 1);
        this.entries[i11] = new b(k11, v11);
        this.entriesSize++;
        return null;
    }
}
