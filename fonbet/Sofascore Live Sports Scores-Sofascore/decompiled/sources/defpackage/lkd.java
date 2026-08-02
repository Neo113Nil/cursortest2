package defpackage;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class lkd implements znf {
    private Object value;

    public lkd(Object obj) {
        this.value = obj;
    }

    public void afterChange(@NotNull KProperty<?> kProperty, Object obj, Object obj2) {
        kProperty.getClass();
    }

    public boolean beforeChange(@NotNull KProperty<?> kProperty, Object obj, Object obj2) {
        kProperty.getClass();
        return true;
    }

    @Override // defpackage.xnf
    public Object getValue(@Nullable Object obj, @NotNull KProperty<?> kProperty) {
        kProperty.getClass();
        return this.value;
    }

    @Override // defpackage.znf
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> kProperty, Object obj2) {
        kProperty.getClass();
        Object obj3 = this.value;
        if (beforeChange(kProperty, obj3, obj2)) {
            this.value = obj2;
            afterChange(kProperty, obj3, obj2);
        }
    }

    @NotNull
    public String toString() {
        return lnb.p(new StringBuilder("ObservableProperty(value="), this.value, ')');
    }
}
