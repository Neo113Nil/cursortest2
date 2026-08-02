package com.fasterxml.jackson.core;

import xsna.cxx;

/* loaded from: classes12.dex */
public enum StreamReadCapability implements cxx {
    DUPLICATE_PROPERTIES,
    SCALARS_AS_OBJECTS,
    UNTYPED_SCALARS,
    EXACT_FLOATS;

    private final boolean _defaultState = false;
    private final int _mask = 1 << ordinal();

    StreamReadCapability() {
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
