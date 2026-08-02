package kotlin.reflect.jvm.internal.impl.util;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class AttributeArrayOwner<K, T> extends AbstractArrayMapOwner<K, T> {

    @NotNull
    private ArrayMap<T> arrayMap;

    public AttributeArrayOwner(@NotNull ArrayMap<T> arrayMap) {
        arrayMap.getClass();
        this.arrayMap = arrayMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    @NotNull
    public final ArrayMap<T> getArrayMap() {
        return this.arrayMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public final void registerComponent(@NotNull String str, @NotNull T t) {
        str.getClass();
        t.getClass();
        int id = getTypeRegistry().getId(str);
        int size = this.arrayMap.getSize();
        if (size == 0) {
            this.arrayMap = new OneElementArrayMap(t, id);
            return;
        }
        if (size == 1) {
            ArrayMap<T> arrayMap = this.arrayMap;
            arrayMap.getClass();
            OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap;
            if (oneElementArrayMap.getIndex() == id) {
                this.arrayMap = new OneElementArrayMap(t, id);
                return;
            } else {
                ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                this.arrayMap = arrayMapImpl;
                arrayMapImpl.set(oneElementArrayMap.getIndex(), oneElementArrayMap.getValue());
            }
        }
        this.arrayMap.set(id, t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttributeArrayOwner() {
        this(r0);
        EmptyArrayMap emptyArrayMap = EmptyArrayMap.INSTANCE;
        emptyArrayMap.getClass();
    }
}
