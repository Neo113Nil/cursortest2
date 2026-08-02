package t9;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ba.d f23755a = new ba.d("ComposeTouchEncoder");

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(Object obj, Float f6, Float f10) {
        Object[] objArr;
        int length;
        Object invoke = b.f23774u.invoke(obj, null);
        if (invoke != null) {
            Object obj2 = b.f23771r.get(invoke);
            if (obj2 instanceof Object[]) {
                objArr = (Object[]) obj2;
                Object obj3 = null;
                for (length = objArr.length - 1; length >= 0; length--) {
                    Object obj4 = objArr[length];
                    if (obj4 != null) {
                        Field field = b.f23766l;
                        Method method = b.f23779z;
                        if ((method == null ? Boolean.valueOf(field.getBoolean(obj4)) : Boolean.valueOf(field.getBoolean(method.invoke(obj4, null)))).booleanValue() && b.b(obj4).contains(f6.intValue(), f10.intValue())) {
                            if (!obj4.toString().contains("EmptyBoxMeasurePolicy")) {
                                return obj4;
                            }
                            obj3 = obj4;
                        }
                    }
                }
                return obj3;
            }
        }
        objArr = new Object[0];
        Object obj32 = null;
        while (length >= 0) {
        }
        return obj32;
    }
}
