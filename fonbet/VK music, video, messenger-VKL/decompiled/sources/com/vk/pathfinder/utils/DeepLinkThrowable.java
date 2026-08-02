package com.vk.pathfinder.utils;

import xsna.alb0;
import xsna.fgx;

/* compiled from: DeepLinkThrowable.kt */
/* loaded from: classes4.dex */
public final class DeepLinkThrowable extends Throwable {
    public DeepLinkThrowable(fgx fgxVar, Throwable th) {
        super(alb0.b(new StringBuilder("Failed to process \""), fgxVar.d, '\"'), th);
    }
}
