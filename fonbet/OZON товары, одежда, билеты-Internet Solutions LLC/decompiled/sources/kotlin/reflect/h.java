package kotlin.reflect;

import Sc.InterfaceC4003e;

/* loaded from: classes.dex */
public interface h<R> extends c<R>, InterfaceC4003e<R> {
    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // kotlin.reflect.c
    boolean isSuspend();
}
