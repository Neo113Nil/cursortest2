package io.ably.lib.types;

/* loaded from: classes9.dex */
public interface PaginatedResult<T> {
    PaginatedResult<T> current() throws AblyException;

    PaginatedResult<T> first() throws AblyException;

    boolean hasCurrent();

    boolean hasFirst();

    boolean hasNext();

    boolean isLast();

    T[] items();

    PaginatedResult<T> next() throws AblyException;
}
