package eb;

import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes3.dex */
public class k extends Exception {
    public k() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        AbstractC3191o.h(str, "Detail message must not be empty");
    }
}
