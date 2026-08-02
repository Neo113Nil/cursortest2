package com.vk.core.fragments.exceptions;

import com.vk.metrics.trackers.CriticalException;

/* compiled from: StackSerializationException.kt */
/* loaded from: classes17.dex */
public final class StackSerializationException extends CriticalException {
    public StackSerializationException(String str, StackOverflowError stackOverflowError) {
        super(str, stackOverflowError);
    }
}
