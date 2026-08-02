package com.nimbusds.jose.util.events;

import com.nimbusds.jose.proc.SecurityContext;

/* loaded from: classes8.dex */
public interface Event<S, C extends SecurityContext> {
    C getContext();

    S getSource();
}
