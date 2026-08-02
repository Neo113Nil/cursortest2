package com.sofascore.model.newNetwork;

import com.sofascore.model.network.response.serializers.EnumIntSerializer;
import defpackage.jie;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/model/newNetwork/PointTypeSerializer;", "Lcom/sofascore/model/network/response/serializers/EnumIntSerializer;", "Lcom/sofascore/model/newNetwork/PointType;", "<init>", "()V", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PointTypeSerializer extends EnumIntSerializer<PointType> {
    public PointTypeSerializer() {
        super("PointTypeSerializer", new jie(19), new jie(20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _init_$lambda$0(PointType pointType) {
        pointType.getClass();
        return pointType.getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PointType _init_$lambda$1(int i) {
        return PointType.INSTANCE.getFromType(i);
    }
}
