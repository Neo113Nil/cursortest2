package io.ably.lib.types;

import com.google.gson.JsonElement;

/* loaded from: classes9.dex */
public abstract class HttpPaginatedResponse {
    public int errorCode;
    public String errorMessage;
    public Param[] headers;
    public int statusCode;
    public boolean success;

    public abstract HttpPaginatedResponse current() throws AblyException;

    public abstract HttpPaginatedResponse first() throws AblyException;

    public abstract boolean hasCurrent();

    public abstract boolean hasFirst();

    public abstract boolean hasNext();

    public abstract boolean isLast();

    public abstract JsonElement[] items();

    public abstract HttpPaginatedResponse next() throws AblyException;
}
