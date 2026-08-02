package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Sf implements so {
    @Override // io.appmetrica.analytics.impl.so
    public final qo a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new qo(this, true, "");
        }
        return new qo(this, false, "Invalid quantity value " + num);
    }
}
