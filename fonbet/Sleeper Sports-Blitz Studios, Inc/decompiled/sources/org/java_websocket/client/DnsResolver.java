package org.java_websocket.client;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;

/* loaded from: classes10.dex */
public interface DnsResolver {
    InetAddress resolve(URI uri) throws UnknownHostException;
}
