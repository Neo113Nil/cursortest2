package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.AdFormatOuterClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h0 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public final Object convert(Object obj) {
        AdFormatOuterClass.AdFormat forNumber = AdFormatOuterClass.AdFormat.forNumber(((Integer) obj).intValue());
        return forNumber == null ? AdFormatOuterClass.AdFormat.UNRECOGNIZED : forNumber;
    }
}
