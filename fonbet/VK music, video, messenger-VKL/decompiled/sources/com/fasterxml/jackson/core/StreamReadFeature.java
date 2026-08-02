package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;
import xsna.cxx;

/* loaded from: classes12.dex */
public enum StreamReadFeature implements cxx {
    AUTO_CLOSE_SOURCE(JsonParser.Feature.AUTO_CLOSE_SOURCE),
    STRICT_DUPLICATE_DETECTION(JsonParser.Feature.STRICT_DUPLICATE_DETECTION),
    IGNORE_UNDEFINED(JsonParser.Feature.IGNORE_UNDEFINED),
    INCLUDE_SOURCE_IN_LOCATION(JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION),
    USE_FAST_DOUBLE_PARSER(JsonParser.Feature.USE_FAST_DOUBLE_PARSER),
    USE_FAST_BIG_NUMBER_PARSER(JsonParser.Feature.USE_FAST_BIG_NUMBER_PARSER);

    private final boolean _defaultState;
    private final JsonParser.Feature _mappedFeature;
    private final int _mask;

    StreamReadFeature(JsonParser.Feature feature) {
        this._mappedFeature = feature;
        this._mask = feature.k();
        this._defaultState = feature.i();
    }

    @Override // xsna.cxx
    public final int h() {
        return this._mask;
    }

    @Override // xsna.cxx
    public final boolean i() {
        return this._defaultState;
    }

    public final JsonParser.Feature j() {
        return this._mappedFeature;
    }
}
