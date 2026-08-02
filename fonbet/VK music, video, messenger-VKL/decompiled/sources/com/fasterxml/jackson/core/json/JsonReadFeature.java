package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonParser;
import xsna.cxx;

/* loaded from: classes12.dex */
public enum JsonReadFeature implements cxx {
    ALLOW_JAVA_COMMENTS(JsonParser.Feature.ALLOW_COMMENTS),
    ALLOW_YAML_COMMENTS(JsonParser.Feature.ALLOW_YAML_COMMENTS),
    ALLOW_SINGLE_QUOTES(JsonParser.Feature.ALLOW_SINGLE_QUOTES),
    ALLOW_UNQUOTED_FIELD_NAMES(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES),
    ALLOW_UNESCAPED_CONTROL_CHARS(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER),
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS),
    ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(JsonParser.Feature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(JsonParser.Feature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(JsonParser.Feature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_NON_NUMERIC_NUMBERS(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS),
    ALLOW_MISSING_VALUES(JsonParser.Feature.ALLOW_MISSING_VALUES),
    ALLOW_TRAILING_COMMA(JsonParser.Feature.ALLOW_TRAILING_COMMA);

    private final JsonParser.Feature _mappedFeature;
    private final boolean _defaultState = false;
    private final int _mask = 1 << ordinal();

    JsonReadFeature(JsonParser.Feature feature) {
        this._mappedFeature = feature;
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
