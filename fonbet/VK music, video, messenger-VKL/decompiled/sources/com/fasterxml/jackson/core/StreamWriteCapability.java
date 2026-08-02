package com.fasterxml.jackson.core;

import xsna.cxx;

/* loaded from: classes12.dex */
public enum StreamWriteCapability implements cxx {
    CAN_WRITE_BINARY_NATIVELY,
    CAN_WRITE_FORMATTED_NUMBERS;

    private final boolean _defaultState = false;
    private final int _mask = 1 << ordinal();

    StreamWriteCapability() {
    }

    @Override // xsna.cxx
    public final int h() {
        return this._mask;
    }

    @Override // xsna.cxx
    public final boolean i() {
        return this._defaultState;
    }
}
