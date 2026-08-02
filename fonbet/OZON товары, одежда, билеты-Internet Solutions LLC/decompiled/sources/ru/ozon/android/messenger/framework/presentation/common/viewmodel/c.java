package ru.ozon.android.messenger.framework.presentation.common.viewmodel;

import Ae.M0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface c<State> {
    void a(@NotNull Function1<? super State, ? extends State> function1);

    @NotNull
    M0<State> getState();
}
