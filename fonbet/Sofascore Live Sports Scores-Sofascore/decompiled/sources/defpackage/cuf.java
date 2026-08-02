package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class cuf extends jle {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cuf(int i) {
        super(1);
        this.n = i;
    }

    @Override // defpackage.jle
    public String c(Method method, int i) {
        switch (this.n) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                    break;
                } else {
                    break;
                }
        }
        return super.c(method, i);
    }

    @Override // defpackage.jle
    public final Object m(Class cls, Object obj, Method method, Object[] objArr) {
        switch (this.n) {
        }
        return wnn.H(cls, obj, method, objArr);
    }

    @Override // defpackage.jle
    public final boolean p(Method method) {
        switch (this.n) {
        }
        return method.isDefault();
    }
}
