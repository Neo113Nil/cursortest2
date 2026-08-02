package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import java.util.Iterator;

/* compiled from: AndroidRequestUrlFactory.kt */
/* loaded from: classes14.dex */
public final class AndroidRequestUrlFactory implements RequestUrlFactory {
    private final SessionRepository sessionRepository;

    public AndroidRequestUrlFactory(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.gatewayclient.RequestUrlFactory
    public String getRequestUrl(OperationType operationType, String str) {
        InitializationResponseOuterClass.RequestType requestUrlOverrideType;
        Object obj;
        requestUrlOverrideType = AndroidRequestUrlFactoryKt.getRequestUrlOverrideType(operationType);
        if (requestUrlOverrideType != null) {
            Iterator<T> it = this.sessionRepository.getRequestUrlOverrides().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((InitializationResponseOuterClass.RequestUrlOverride) obj).getRequestType() == requestUrlOverrideType) {
                    break;
                }
            }
            InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride = (InitializationResponseOuterClass.RequestUrlOverride) obj;
            String url = requestUrlOverride != null ? requestUrlOverride.getUrl() : null;
            if (url != null) {
                return url;
            }
        }
        return str == null ? "" : str;
    }
}
