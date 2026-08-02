package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.link.result.LinkResult;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3759u2 {
    @Nullable
    Object a(@NotNull D6 d62, @NotNull ContinuationImpl continuationImpl);

    @Nullable
    Object a(@NotNull LinkedHashMap linkedHashMap, @NotNull ContinuationImpl continuationImpl);

    @Nullable
    Object a(@NotNull ContinuationImpl continuationImpl);

    @Nullable
    Object a(@NotNull Pane$PaneOutput[] pane$PaneOutputArr, @NotNull ContinuationImpl continuationImpl);

    void a(@NotNull AbstractC3743s4 abstractC3743s4);

    void a(@NotNull LinkResult linkResult);

    void a(@NotNull String str);

    @Nullable
    Object b(@NotNull ContinuationImpl continuationImpl);
}
