package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc3 implements vff {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dc3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vff
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new oaa("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new oaa(lnb.o("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new oaa(lnb.o("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new oaa(dmi.q("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new oaa(dmi.q("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new fr9((r38) obj);
        }
    }
}
