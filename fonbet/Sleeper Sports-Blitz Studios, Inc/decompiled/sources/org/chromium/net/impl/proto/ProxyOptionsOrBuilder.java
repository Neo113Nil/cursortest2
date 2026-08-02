package org.chromium.net.impl.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* loaded from: classes10.dex */
public interface ProxyOptionsOrBuilder extends MessageLiteOrBuilder {
    Proxy getProxies(int index);

    int getProxiesCount();

    List<Proxy> getProxiesList();
}
