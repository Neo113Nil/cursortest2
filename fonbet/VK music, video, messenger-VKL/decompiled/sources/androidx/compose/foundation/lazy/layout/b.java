package androidx.compose.foundation.lazy.layout;

/* compiled from: LazyLayoutItemProvider.kt */
/* loaded from: classes11.dex */
public interface b {
    default int b(Object obj) {
        return -1;
    }

    void f(int i, Object obj, androidx.compose.runtime.a aVar, int i2);

    default Object g(int i) {
        return null;
    }

    int getItemCount();

    default Object h(int i) {
        return new DefaultLazyKey(i);
    }
}
