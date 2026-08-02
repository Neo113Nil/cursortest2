package net.time4j.engine;

/* loaded from: classes10.dex */
public interface Converter<S, T> {
    S from(T t);

    Class<S> getSourceType();

    T translate(S s);
}
