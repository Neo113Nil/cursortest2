package com.vk.queue.sync.models;

import java.util.Map;
import xsna.wqe0;
import xsna.xqe0;

/* compiled from: QueueAccessException.kt */
/* loaded from: classes5.dex */
public final class QueueAccessException extends Exception {
    public static final long serialVersionUID = 2945190572068661938L;
    private final Map<xqe0, wqe0> errors;

    public QueueAccessException(Map<xqe0, wqe0> map) {
        super("Failed to request queue event: " + map);
        this.errors = map;
    }

    public final Map<xqe0, wqe0> d() {
        return this.errors;
    }
}
