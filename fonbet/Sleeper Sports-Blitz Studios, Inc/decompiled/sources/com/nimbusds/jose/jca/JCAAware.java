package com.nimbusds.jose.jca;

import com.nimbusds.jose.jca.JCAContext;

/* loaded from: classes8.dex */
public interface JCAAware<T extends JCAContext> {
    T getJCAContext();
}
