package com.yandex.mapkit.transport.masstransit;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class TransferStop implements Serializable {
    private NativeObject nativeObject;
    private RouteStop routeStop;
    private boolean routeStop__is_initialized;
    private List<Transport> transports;
    private boolean transports__is_initialized;

    public TransferStop() {
        this.routeStop__is_initialized = false;
        this.transports__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::TransferStop";
    }

    private native RouteStop getRouteStop__Native();

    private native List<Transport> getTransports__Native();

    private native NativeObject init(RouteStop routeStop, List<Transport> list);

    @NonNull
    public synchronized RouteStop getRouteStop() {
        try {
            if (!this.routeStop__is_initialized) {
                this.routeStop = getRouteStop__Native();
                this.routeStop__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.routeStop;
    }

    @NonNull
    public synchronized List<Transport> getTransports() {
        try {
            if (!this.transports__is_initialized) {
                this.transports = getTransports__Native();
                this.transports__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.transports;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getRouteStop(), false, (Class<Archive>) RouteStop.class);
            C2616s.f(Transport.class, archive, getTransports(), false);
            return;
        }
        this.routeStop = (RouteStop) archive.add((Archive) this.routeStop, false, (Class<Archive>) RouteStop.class);
        this.routeStop__is_initialized = true;
        List<Transport> d11 = G.d(Transport.class, archive, this.transports, false);
        this.transports = d11;
        this.transports__is_initialized = true;
        this.nativeObject = init(this.routeStop, d11);
    }

    public TransferStop(@NonNull RouteStop routeStop, @NonNull List<Transport> list) {
        this.routeStop__is_initialized = false;
        this.transports__is_initialized = false;
        if (routeStop == null) {
            throw new IllegalArgumentException("Required field \"routeStop\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(routeStop, list);
            this.routeStop = routeStop;
            this.routeStop__is_initialized = true;
            this.transports = list;
            this.transports__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"transports\" cannot be null");
    }

    private TransferStop(NativeObject nativeObject) {
        this.routeStop__is_initialized = false;
        this.transports__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
