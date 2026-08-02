package P2;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import wi.AbstractC6757a;

/* loaded from: classes.dex */
public abstract class p implements WebMessageBoundaryInterface {
    private static final String[] sFeatures = {"WEB_MESSAGE_ARRAY_BUFFER"};

    public static O2.c[] a(InvocationHandler[] invocationHandlerArr) {
        O2.c[] cVarArr = new O2.c[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            cVarArr[i10] = new r(invocationHandlerArr[i10]);
        }
        return cVarArr;
    }

    public static O2.b b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        O2.c[] a10 = a(webMessageBoundaryInterface.getPorts());
        if (!u.f8725C.c()) {
            return new O2.b(webMessageBoundaryInterface.getData(), a10);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) AbstractC6757a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new O2.b(webMessagePayloadBoundaryInterface.getAsString(), a10);
        }
        if (type != 1) {
            return null;
        }
        return new O2.b(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), a10);
    }
}
